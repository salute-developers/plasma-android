package com.sdds.playground.sandbox.core.compose.bottomsheet

import android.content.res.Resources
import androidx.annotation.FloatRange
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.SpringSpec
import androidx.compose.animation.splineBasedDecay
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.gestures.DraggableAnchors
import androidx.compose.foundation.gestures.animateToWithDecay
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.playground.sandbox.core.compose.bottomsheet.BottomSheetState.Companion.saver
import kotlin.math.abs

@Composable
internal fun rememberBottomSheetState(
    initialValue: BottomSheetValue,
    animationSpec: AnimationSpec<Float> = BottomSheetDefaults.AnimationSpec,
    confirmValueChange: (BottomSheetValue) -> Boolean = { true },
    onDismiss: () -> Unit = {},
): BottomSheetState {
    return key(initialValue) {
        val density = LocalDensity.current
        rememberSaveable(
            initialValue,
            animationSpec,
            confirmValueChange,
            saver = BottomSheetState.saver(
                animationSpec = animationSpec,
                confirmValueChange = confirmValueChange,
                onDismiss = onDismiss,
                density = density,
            ),
        ) {
            BottomSheetState(
                initialValue = initialValue,
                density = density,
                animationSpec = animationSpec,
                confirmValueChange = confirmValueChange,
                onDismiss = onDismiss,
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Stable
internal class BottomSheetState(
    initialValue: BottomSheetValue,
    density: Density,
    val onDismiss: () -> Unit = {},
    private val animationSpec: AnimationSpec<Float> = BottomSheetDefaults.AnimationSpec,
    private val confirmValueChange: (BottomSheetValue) -> Boolean = { true },
) {

    val draggableState = AnchoredDraggableState(
        initialValue = initialValue,
        snapAnimationSpec = animationSpec,
        decayAnimationSpec = splineBasedDecay(density),
        positionalThreshold = BottomSheetDefaults.PositionalThreshold,
        velocityThreshold = BottomSheetDefaults.VelocityThreshold,
        confirmValueChange = confirmValueChange,
    )

    /**
     * The fraction of the progress, within [0f..1f] bounds, or 1f if the [AnchoredDraggableState]
     * is in a settled state.
     */
    @get:FloatRange(from = 0.0, to = 1.0)
    val progress: Float
        get() = draggableState.progress

    /**
     * The fraction of the progress, within [0.0f..1f] bounds, or 1f if the [AnchoredDraggableState]
     * is in a settled state.
     */
    @get:FloatRange(from = 0.0, to = 1.0)
    val progressFromCollapsedToExpanded: Float by derivedStateOf(structuralEqualityPolicy()) {
        val b = draggableState.anchors.positionOf(BottomSheetValue.Expanded)
        val a = draggableState.anchors.positionOf(BottomSheetValue.Collapsed)
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
     * The current value of the [BottomSheetState].
     */
    val currentValue: BottomSheetValue
        get() = draggableState.currentValue

    val targetValue: BottomSheetValue
        get() = draggableState.targetValue

    /**
     * Whether the bottom sheet is visible.
     */
    val isVisible: Boolean
        get() = currentValue != BottomSheetValue.Collapsed

    /**
     * Whether the bottom sheet is expanded.
     */
    val isExpanded: Boolean
        get() = currentValue == BottomSheetValue.Expanded

    /**
     * Whether the bottom sheet is half expanded.
     */
    val isHalfExpanded: Boolean
        get() = currentValue == BottomSheetValue.HalfExpanded

    /**
     * Whether the bottom sheet is hidden.
     */
    val isHidden: Boolean
        get() = currentValue == BottomSheetValue.Collapsed

    private val hasHalfExpandedState: Boolean
        get() = draggableState.anchors.hasAnchorFor(BottomSheetValue.HalfExpanded)

    /**
     * Show the bottom sheet with animation and suspend until it's shown.
     * If the sheet is taller than 50% of the parent's height, the bottom sheet will be half expanded.
     * Otherwise, it will be fully expanded.
     */
    suspend fun show() {
        val targetValue = when {
            hasHalfExpandedState -> BottomSheetValue.HalfExpanded
            else -> BottomSheetValue.Expanded
        }
        animateTo(targetValue)
    }

    /**
     * Expand the bottom sheet with an animation and suspend until the animation finishes or is cancelled.
     */
    suspend fun expand() {
        if (draggableState.anchors.hasAnchorFor(BottomSheetValue.Expanded)) {
            animateTo(BottomSheetValue.Expanded)
        }
    }

    /**
     * Half expand the bottom sheet with an animation and suspend until the animation finishes or is cancelled.
     */
    suspend fun halfExpand() {
        if (draggableState.anchors.hasAnchorFor(BottomSheetValue.HalfExpanded)) {
            animateTo(BottomSheetValue.HalfExpanded)
        }
    }

    /**
     * Hide the bottom sheet with an animation and suspend until the animation finishes or is cancelled.
     */
    suspend fun hide() {
        animateTo(BottomSheetValue.Collapsed)
    }

    fun requireOffset() = draggableState.requireOffset()

    fun updateAnchors(layoutHeight: Int, sheetHeight: Int, peekHeight: Int) {
        val layoutHeightF = layoutHeight.toFloat()
        val sheetHeightF = sheetHeight.toFloat()
        val peekHeightF = peekHeight.toFloat().coerceAtMost(layoutHeightF)
        val newAnchors = DraggableAnchors {
            BottomSheetValue
                .values()
                .forEach { anchor ->
                    when (anchor) {
                        BottomSheetValue.Collapsed -> anchor at (layoutHeightF - peekHeightF).coerceAtLeast(0f)
                        BottomSheetValue.HalfExpanded -> {
                            val halfExpanded = layoutHeightF * anchor.draggableSpaceFraction
                            if (peekHeightF < halfExpanded) {
                                anchor at halfExpanded
                            }
                        }
                        BottomSheetValue.Expanded -> {
                            val expanded = (layoutHeightF - sheetHeightF).coerceAtLeast(0f)
                            if (sheetHeightF > 0f &&
                                peekHeightF < layoutHeightF &&
                                expanded < (layoutHeightF - peekHeightF)
                            ) {
                                anchor at 0f
                            }
                        }
                    }
                }
        }
        draggableState.updateAnchors(newAnchors)
    }

    fun isHidingInProgress() = isVisible && targetValue == BottomSheetValue.Collapsed

    private suspend fun animateTo(
        targetValue: BottomSheetValue,
        velocity: Float = draggableState.lastVelocity,
    ) = draggableState.animateToWithDecay(targetValue, velocity)

    companion object {
        /**
         * The default [saver] implementation for [BottomSheetState].
         */
        fun saver(
            animationSpec: AnimationSpec<Float> = BottomSheetDefaults.AnimationSpec,
            confirmValueChange: (BottomSheetValue) -> Boolean = { true },
            onDismiss: () -> Unit = {},
            density: Density,
        ): Saver<BottomSheetState, BottomSheetValue> =
            Saver(
                save = { it.currentValue },
                restore = {
                    BottomSheetState(
                        initialValue = it,
                        density = density,
                        animationSpec = animationSpec,
                        confirmValueChange = confirmValueChange,
                        onDismiss = onDismiss,
                    )
                },
            )
    }
}

internal object BottomSheetDefaults {
    val AnimationSpec = SpringSpec<Float>()

    val PositionalThreshold = { distance: Float -> distance * 0.2f }

    val VelocityThreshold = { 125.dp.toPixel }

    val PeekHeight = 56.dp
}

internal enum class BottomSheetValue {
    Collapsed,
    HalfExpanded,
    Expanded,
    ;

    val draggableSpaceFraction: Float
        get() = when (this) {
            Collapsed -> 0f
            HalfExpanded -> 0.5f
            Expanded -> 1f
        }
}

private val Dp.toPixel: Float
    get() = value * Resources.getSystem().displayMetrics.density
