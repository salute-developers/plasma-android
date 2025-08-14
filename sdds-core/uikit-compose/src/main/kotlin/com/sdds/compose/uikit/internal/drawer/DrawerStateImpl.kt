package com.sdds.compose.uikit.internal.drawer

import androidx.compose.animation.core.SpringSpec
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.animateTo
import androidx.compose.foundation.gestures.snapTo
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.saveable.Saver
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Velocity
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.DrawerAlignment
import com.sdds.compose.uikit.DrawerAlignment.Bottom
import com.sdds.compose.uikit.DrawerAlignment.End
import com.sdds.compose.uikit.DrawerAlignment.Start
import com.sdds.compose.uikit.DrawerAlignment.Top
import com.sdds.compose.uikit.DrawerState
import com.sdds.compose.uikit.DrawerValue
import com.sdds.compose.uikit.isHorizontal
import kotlin.math.abs

@OptIn(ExperimentalFoundationApi::class)
@Immutable
internal class DrawerStateImpl(
    initialValue: DrawerValue,
    override val alignment: DrawerAlignment,
    private val density: Density,
    internal val confirmStateChange: (DrawerValue) -> Boolean = { true },
) : DrawerState {

    override val anchoredDraggableState = AnchoredDraggableState(
        initialValue = initialValue,
        animationSpec = DefaultAnimationSpec,
        confirmValueChange = confirmStateChange,
        positionalThreshold = { with(density) { DrawerPositionalThreshold.toPx() } },
        velocityThreshold = { with(density) { DrawerVelocityThreshold.toPx() } },
    )

    override val nestedScrollConnection: NestedScrollConnection =
        consumeSwipeWithinBottomSheetBoundsNestedScrollConnection(
            anchoredDraggableState,
            alignment,
        )

    override val isOpen: Boolean
        get() = currentValue == DrawerValue.Opened

    override val isClosed: Boolean
        get() = currentValue == DrawerValue.Closed

    override val currentValue: DrawerValue
        get() {
            return anchoredDraggableState.currentValue
        }

    override val isAnimationRunning: Boolean
        get() {
            return anchoredDraggableState.isAnimationRunning
        }

    override suspend fun open() {
        if (isOpen || targetValue == DrawerValue.Opened) return
        anchoredDraggableState.animateTo(DrawerValue.Opened)
    }

    override suspend fun close() {
        if (isClosed || targetValue == DrawerValue.Closed) return
        anchoredDraggableState.animateTo(DrawerValue.Closed)
    }

    override suspend fun snapTo(targetValue: DrawerValue) {
        anchoredDraggableState.snapTo(targetValue)
    }

    override val targetValue: DrawerValue
        get() = anchoredDraggableState.targetValue

    override val offset: Float
        get() = anchoredDraggableState.offset

    companion object {

        fun saver(density: Density, confirmStateChange: (DrawerValue) -> Boolean) =
            Saver<DrawerState, Pair<Int, Int>>(
                save = { it.currentValue.ordinal to it.alignment.ordinal },
                restore = {
                    DrawerStateImpl(
                        initialValue = DrawerValue.values()[it.first],
                        alignment = DrawerAlignment.values()[it.second],
                        density = density,
                        confirmStateChange = confirmStateChange,
                    )
                },
            )
    }
}

internal fun DrawerState.confirmStateChange(value: DrawerValue): Boolean {
    return (this as? DrawerStateImpl)?.confirmStateChange?.invoke(value) == true
}

@OptIn(ExperimentalFoundationApi::class)
internal fun DrawerState.requireOffset(): Float = with(anchoredDraggableState) {
    requireOffset().coerceIn(anchors.minAnchor(), anchors.maxAnchor())
}

@OptIn(ExperimentalFoundationApi::class)
internal fun DrawerState.anchorDistance(): Float {
    if (offset.isNaN()) return 0f
    val closedAnchor = anchoredDraggableState.anchors.positionOf(DrawerValue.Closed)
    val openedAnchor = anchoredDraggableState.anchors.positionOf(DrawerValue.Opened)
    return abs(closedAnchor - openedAnchor)
}

@OptIn(ExperimentalFoundationApi::class)
internal fun DrawerState.calculateFraction(): Float {
    if (offset.isNaN()) return 0f
    val closedAnchor = anchoredDraggableState.anchors.positionOf(DrawerValue.Closed)
    val openedAnchor = anchoredDraggableState.anchors.positionOf(DrawerValue.Opened)
    val size = abs(closedAnchor - openedAnchor)
    val progress = abs(offset - closedAnchor)
    return (progress / size).coerceIn(0f, 1f)
}

@OptIn(ExperimentalFoundationApi::class)
private fun consumeSwipeWithinBottomSheetBoundsNestedScrollConnection(
    state: AnchoredDraggableState<*>,
    drawerAlignment: DrawerAlignment,
): NestedScrollConnection = object : NestedScrollConnection {

    val orientation: Orientation = if (drawerAlignment.isHorizontal()) Orientation.Horizontal else Orientation.Vertical

    override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {
        val delta = available.toFloat()
        val shouldConsume = when (drawerAlignment) {
            Top -> delta > 0f
            Bottom -> delta < 0f
            Start -> delta > 0f
            End -> delta < 0f
        }
        return if (shouldConsume && source == NestedScrollSource.Drag) {
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
        val min = state.anchors.minAnchor()
        val max = state.anchors.maxAnchor()
        val shouldConsume = when (drawerAlignment) {
            Top -> toFling > 0f && currentOffset < max
            Bottom -> toFling < 0f && currentOffset > min
            Start -> toFling > 0f && currentOffset < max
            End -> toFling < 0f && currentOffset > min
        }
        return if (shouldConsume) {
            state.settle(velocity = toFling)
            available
        } else {
            Velocity.Zero
        }
    }

    override suspend fun onPostFling(consumed: Velocity, available: Velocity): Velocity {
        val offset = state.requireOffset()
        val min = state.anchors.minAnchor()
        val max = state.anchors.maxAnchor()
        val epsilon = 0.5f

        val nearMin = abs(offset - min) < epsilon
        val nearMax = abs(offset - max) < epsilon
        val isBetween = !(nearMin || nearMax)

        if (isBetween) {
            state.settle(velocity = consumed.toFloat() + available.toFloat())
        }
        return Velocity.Zero
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

private val DrawerPositionalThreshold = 128.dp
private val DrawerVelocityThreshold = 125.dp
private val DefaultAnimationSpec = SpringSpec<Float>()
