package com.sdds.compose.uikit.internal.modal

import androidx.annotation.FloatRange
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.SpringSpec
import androidx.compose.animation.splineBasedDecay
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.gestures.DraggableAnchors
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.anchoredDraggable
import androidx.compose.foundation.gestures.animateToWithDecay
import androidx.compose.foundation.gestures.snapTo
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.BoxWithConstraintsScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.material.ModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.collapse
import androidx.compose.ui.semantics.dismiss
import androidx.compose.ui.semantics.expand
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.Velocity
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.modal.BottomSheetState.Companion.saver
import com.sdds.compose.uikit.internal.modal.BottomSheetValue.Expanded
import com.sdds.compose.uikit.internal.modal.BottomSheetValue.HalfExpanded
import com.sdds.compose.uikit.internal.modal.BottomSheetValue.Hidden
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.roundToInt

@Suppress("LongMethod")
@OptIn(ExperimentalFoundationApi::class)
@Composable
internal fun BoxWithConstraintsScope.BottomSheet(
    modifier: Modifier = Modifier,
    sheetState: BottomSheetState,
    sheetGesturesEnabled: Boolean = true,
    content: (@Composable BoxScope.() -> Unit),
) {
    val scope = rememberCoroutineScope()
    val orientation = Orientation.Vertical
    Box(
        modifier = Modifier
            .align(Alignment.TopCenter)
            .fillMaxWidth()
            .then(
                if (sheetGesturesEnabled) {
                    Modifier.nestedScroll(
                        remember(sheetState.anchoredDraggableState, orientation) {
                            consumeSwipeWithinBottomSheetBoundsNestedScrollConnection(
                                state = sheetState.anchoredDraggableState,
                                orientation = orientation,
                            )
                        },
                    )
                } else {
                    Modifier
                },
            )
            .offset {
                IntOffset(
                    0,
                    sheetState.anchoredDraggableState
                        .requireOffset()
                        .roundToInt(),
                )
            }
            .anchoredDraggable(
                state = sheetState.anchoredDraggableState,
                orientation = orientation,
                enabled = sheetGesturesEnabled &&
                    sheetState.anchoredDraggableState.currentValue != Hidden,
            )
            .bottomSheetAnchors(sheetState, constraints.maxHeight.toFloat())
            .then(
                if (sheetGesturesEnabled) {
                    Modifier.semantics {
                        if (sheetState.isVisible) {
                            dismiss {
                                if (sheetState.confirmValueChange(Hidden)) {
                                    scope.launch { sheetState.hide() }
                                }
                                true
                            }
                            if (sheetState.anchoredDraggableState.currentValue == HalfExpanded) {
                                expand {
                                    if (sheetState.confirmValueChange(Expanded)) {
                                        scope.launch { sheetState.expand() }
                                    }
                                    true
                                }
                            } else if (sheetState.hasHalfExpandedState) {
                                collapse {
                                    if (sheetState.confirmValueChange(HalfExpanded)) {
                                        scope.launch { sheetState.halfExpand() }
                                    }
                                    true
                                }
                            }
                        }
                    }
                } else {
                    Modifier
                },
            )
            .then(modifier),
        content = content,
    )
}

/**
 * Create and remember a ModalBottomSheetState.
 * @param initialValue - The initial value of the state.
 * @param animationSpec - The default animation that will be used to animate to a new state.
 * @param confirmValueChange - Optional callback invoked to confirm or veto a pending value change.
 * @param skipHalfExpanded - Should ModalBottomSheet expand at HalfExpanded value
 */
@Composable
fun rememberModalBottomSheetState(
    initialValue: BottomSheetValue,
    animationSpec: AnimationSpec<Float> = DefaultAnimationSpec,
    confirmValueChange: (BottomSheetValue) -> Boolean = { true },
    skipHalfExpanded: Boolean = false,
): BottomSheetState {
    val density = LocalDensity.current
    return key(initialValue) {
        rememberSaveable(
            initialValue,
            animationSpec,
            skipHalfExpanded,
            confirmValueChange,
            density,
            saver = BottomSheetState.saver(
                density = density,
                animationSpec = animationSpec,
                skipHalfExpanded = skipHalfExpanded,
                confirmValueChange = confirmValueChange,
            ),
        ) {
            BottomSheetState(
                density = density,
                initialValue = initialValue,
                animationSpec = animationSpec,
                isSkipHalfExpanded = skipHalfExpanded,
                confirmValueChange = confirmValueChange,
            )
        }
    }
}

/**
 * State of the persistent bottom sheet in ModalBottomSheet.
 * @param initialValue - The initial value of the state.
 * @param density The density that this state can use to convert values to and from dp.
 * @param animationSpec - The default animation that will be used to animate to a new state.
 * @param confirmValueChange - Optional callback invoked to confirm or veto a pending state change.
 * @param isSkipHalfExpanded - Should ModalBottomSheet expand at HalfExpanded value
 */
@OptIn(ExperimentalFoundationApi::class)
class BottomSheetState(
    initialValue: BottomSheetValue,
    density: Density,
    internal val animationSpec: AnimationSpec<Float> = DefaultAnimationSpec,
    internal val isSkipHalfExpanded: Boolean = false,
    internal val confirmValueChange: (BottomSheetValue) -> Boolean,
) {

    internal val anchoredDraggableState = AnchoredDraggableState(
        initialValue = initialValue,
        snapAnimationSpec = animationSpec,
        decayAnimationSpec = splineBasedDecay(density),
        confirmValueChange = confirmValueChange,
        positionalThreshold = {
            with(density) {
                ModalBottomSheetPositionalThreshold.toPx()
            }
        },
        velocityThreshold = { with(density) { ModalBottomSheetVelocityThreshold.toPx() } },
    )
    private val _dialogState = MutableStateFlow(DialogState.Hide)
    internal val dialogState = _dialogState.asStateFlow()
    internal fun hideDialog() {
        _dialogState.value = DialogState.Hide
    }

    /**
     * The current value of the [ModalBottomSheetState].
     */
    val currentValue: BottomSheetValue
        get() = anchoredDraggableState.currentValue

    /**
     * The target value the state will settle at once the current interaction ends, or the
     * [currentValue] if there is no interaction in progress.
     */
    val targetValue: BottomSheetValue
        get() = anchoredDraggableState.targetValue

    /**
     * The fraction of the progress, within [0f..1f] bounds, or 1f if the [AnchoredDraggableState]
     * is in a settled state.
     */
    @get:FloatRange(from = 0.0, to = 1.0)
    val progress: Float
        get() = anchoredDraggableState.progress

    /**
     * The fraction of the progress, within [0.5f..1f] bounds, or 1f if the [AnchoredDraggableState]
     * is in a settled state.
     */
    @get:FloatRange(from = 0.0, to = 1.0)
    val progressFromHalfExpandedToExpanded: Float by derivedStateOf(structuralEqualityPolicy()) {
        val a = anchoredDraggableState.anchors.positionOf(Expanded)
        val b = anchoredDraggableState.anchors.positionOf(HalfExpanded)
        val distance = abs(b - a)
        if (!distance.isNaN() && distance > 1e-6f) {
            val progress = (this.requireOffset() - a) / (b - a)
            // If we are very close to 0f or 1f, we round to the closest
            if (progress < 1e-6f) 0f else if (progress > 1 - 1e-6f) 1f else progress
        } else {
            1f
        }
    }

    /**
     * Whether the bottom sheet is visible.
     */
    val isVisible: Boolean
        get() = anchoredDraggableState.currentValue != Hidden

    internal val hasHalfExpandedState: Boolean
        get() = anchoredDraggableState.anchors.hasAnchorFor(HalfExpanded)

    init {
        if (isSkipHalfExpanded) {
            require(initialValue != HalfExpanded) {
                "The initial value must not be set to HalfExpanded if skipHalfExpanded is set to" +
                    " true."
            }
        }
    }

    /**
     * Expand the bottom sheet on available anchor with animation and suspend until it expanded or
     * animation has been cancelled.
     * *
     * @throws [CancellationException] if the animation is interrupted
     */
    suspend fun show() {
        _dialogState.value = DialogState.Show
        delay(100)
        val targetValue = when {
            hasHalfExpandedState -> HalfExpanded
            else -> Expanded
        }
        animateTo(targetValue)
    }

    /**
     * Half expand the bottom sheet with animation and suspend until it if fully expanded or
     * animation has been cancelled.
     * *
     * @throws [CancellationException] if the animation is interrupted
     */
    internal suspend fun halfExpand() {
        if (!hasHalfExpandedState) {
            return
        }
        animateTo(HalfExpanded)
    }

    /**
     * Fully expand the bottom sheet with animation and suspend until it if fully expanded or
     * animation has been cancelled.
     * *
     * @throws [CancellationException] if the animation is interrupted
     */
    internal suspend fun expand() {
        if (!anchoredDraggableState.anchors.hasAnchorFor(Expanded)) {
            return
        }
        animateTo(Expanded)
    }

    /**
     * Hide the bottom sheet with animation and suspend until it if fully hidden or animation has
     * been cancelled.
     *
     * @throws [CancellationException] if the animation is interrupted
     */
    suspend fun hide() {
        animateTo(Hidden)
        _dialogState.value = DialogState.Hide
    }

    internal suspend fun animateTo(
        target: BottomSheetValue,
        velocity: Float = anchoredDraggableState.lastVelocity,
    ) = anchoredDraggableState.animateToWithDecay(target, velocity)

    internal suspend fun snapTo(target: BottomSheetValue) =
        anchoredDraggableState.snapTo(target)

    internal fun requireOffset() = anchoredDraggableState.requireOffset()

    companion object {
        /**
         * The default [saver] implementation for [ModalBottomSheetState].
         * Saves the [currentValue] and recreates a [ModalBottomSheetState] with the saved value as
         * initial value.
         */
        fun saver(
            animationSpec: AnimationSpec<Float>,
            confirmValueChange: (BottomSheetValue) -> Boolean,
            skipHalfExpanded: Boolean,
            density: Density,
        ): Saver<BottomSheetState, *> = Saver(
            save = { it.currentValue },
            restore = {
                BottomSheetState(
                    initialValue = it,
                    density = density,
                    animationSpec = animationSpec,
                    isSkipHalfExpanded = skipHalfExpanded,
                    confirmValueChange = confirmValueChange,
                )
            },
        )
    }
}

private val ModalBottomSheetPositionalThreshold = 56.dp
private val ModalBottomSheetVelocityThreshold = 125.dp
private val DefaultAnimationSpec = SpringSpec<Float>()

/**
 * Possible states of ModalBottomSheet.
 */
enum class BottomSheetValue {
    /**
     * The bottom sheet is not visible.
     */
    Hidden,

    /**
     * The bottom sheet is visible at full height.
     */
    Expanded,

    /**
     * The bottom sheet is partially visible at 50% of the screen height. This state is only
     * enabled if the height of the bottom sheet is more than 50% of the screen height.
     */
    HalfExpanded,
}

@OptIn(ExperimentalFoundationApi::class)
private fun consumeSwipeWithinBottomSheetBoundsNestedScrollConnection(
    state: AnchoredDraggableState<*>,
    orientation: Orientation,
): NestedScrollConnection = object : NestedScrollConnection {
    override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {
        val delta = available.toFloat()
        return if (delta < 0 && source == NestedScrollSource.Drag) {
            state.dispatchRawDelta(delta).toOffset()
        } else {
            Offset.Zero
        }
    }

    override fun onPostScroll(
        consumed: Offset,
        available: Offset,
        source: NestedScrollSource,
    ): Offset {
        return if (source == NestedScrollSource.Drag) {
            state.dispatchRawDelta(available.toFloat()).toOffset()
        } else {
            Offset.Zero
        }
    }

    override suspend fun onPreFling(available: Velocity): Velocity {
        val toFling = available.toFloat()
        val currentOffset = state.requireOffset()
        return if (toFling < 0 && currentOffset > state.anchors.minAnchor()) {
            state.settle(velocity = toFling)
            // since we go to the anchor with tween settling, consume all for the best UX
            available
        } else {
            Velocity.Zero
        }
    }

    override suspend fun onPostFling(consumed: Velocity, available: Velocity): Velocity {
        state.settle(velocity = available.toFloat())
        return available
    }

    private fun Float.toOffset(): Offset = Offset(
        x = if (orientation == Orientation.Horizontal) this else 0f,
        y = if (orientation == Orientation.Vertical) this else 0f,
    )

    @JvmName("velocityToFloat")
    private fun Velocity.toFloat() = if (orientation == Orientation.Horizontal) x else y

    @JvmName("offsetToFloat")
    private fun Offset.toFloat(): Float = if (orientation == Orientation.Horizontal) x else y
}

@OptIn(ExperimentalFoundationApi::class)
private fun Modifier.bottomSheetAnchors(
    sheetState: BottomSheetState,
    fullHeight: Float,
) = onSizeChanged { sheetSize ->
    val newAnchors = DraggableAnchors {
        Hidden at fullHeight
        val halfHeight = fullHeight / 2f
        if (!sheetState.isSkipHalfExpanded && sheetSize.height > halfHeight) {
            HalfExpanded at halfHeight
        }
        if (sheetSize.height != 0) {
            Expanded at max(0f, fullHeight - sheetSize.height)
        }
    }
    // If we are setting the anchors for the first time and have an anchor for
    // the current (initial) value, prefer that
    val isInitialized = sheetState.anchoredDraggableState.anchors.size > 0
    val previousValue = sheetState.currentValue
    val newTarget = if (!isInitialized && newAnchors.hasAnchorFor(previousValue)) {
        previousValue
    } else {
        when (sheetState.targetValue) {
            Hidden -> Hidden
            HalfExpanded, Expanded -> {
                val hasHalfExpandedState = newAnchors.hasAnchorFor(HalfExpanded)
                val newTarget = if (hasHalfExpandedState) {
                    HalfExpanded
                } else if (newAnchors.hasAnchorFor(Expanded)) {
                    Expanded
                } else {
                    Hidden
                }
                newTarget
            }
        }
    }
    sheetState.anchoredDraggableState.updateAnchors(newAnchors, newTarget)
}
