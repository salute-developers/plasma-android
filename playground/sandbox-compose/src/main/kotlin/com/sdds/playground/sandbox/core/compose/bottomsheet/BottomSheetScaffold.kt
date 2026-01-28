package com.sdds.playground.sandbox.core.compose.bottomsheet

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.anchoredDraggable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.Velocity
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.px
import kotlin.math.roundToInt

@OptIn(ExperimentalFoundationApi::class)
@Suppress("LongMethod")
@Composable
internal fun BottomSheetScaffold(
    bottomSheetState: BottomSheetState,
    bottomSheetContent: @Composable BoxScope.() -> Unit,
    modifier: Modifier = Modifier,
    sheetShape: Shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
    sheetBackgroundColor: Color = Color.Transparent,
    sheetPeekHeight: Dp = BottomSheetDefaults.PeekHeight,
    content: @Composable BoxScope.(sheetHeight: Int) -> Unit,
) {
    val peekHeight = sheetPeekHeight.px
    var layoutHeight by remember { mutableIntStateOf(0) }
    var sheetHeight by remember { mutableIntStateOf(0) }
    val bottomSheetNestedScrollConnection = remember(bottomSheetState.draggableState) {
        consumeSwipeWithinBottomSheetBoundsNestedScrollConnection(
            state = bottomSheetState.draggableState,
            orientation = Orientation.Vertical,
        )
    }
    LaunchedEffect(bottomSheetState.targetValue) {
        if (bottomSheetState.isHidingInProgress()) {
            bottomSheetState.onDismiss()
        }
    }
    Box(
        modifier = modifier
            .fillMaxSize()
            .onSizeChanged {
                layoutHeight = it.height
                if (layoutHeight > 0) {
                    bottomSheetState.updateAnchors(layoutHeight, sheetHeight, peekHeight)
                }
            },
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = sheetPeekHeight),
            contentAlignment = Alignment.Center,
        ) {
            content(sheetHeight)
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.BottomCenter)
                .offset {
                    val yOffset = bottomSheetState
                        .requireOffset()
                        .roundToInt()
                    IntOffset(x = 0, y = yOffset)
                }
                .anchoredDraggable(
                    state = bottomSheetState.draggableState,
                    orientation = Orientation.Vertical,
                )
                .nestedScroll(bottomSheetNestedScrollConnection)
                .background(sheetBackgroundColor, sheetShape),
        ) {
            Box(
                modifier = Modifier
                    .wrapContentSize()
                    .onSizeChanged {
                        sheetHeight = it.height
                        if (layoutHeight > 0 && sheetHeight > 0) {
                            bottomSheetState.updateAnchors(layoutHeight, sheetHeight, peekHeight)
                        }
                    },
                content = bottomSheetContent,
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
private fun consumeSwipeWithinBottomSheetBoundsNestedScrollConnection(
    state: AnchoredDraggableState<BottomSheetValue>,
    orientation: Orientation,
): NestedScrollConnection = object : NestedScrollConnection {

    override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {
        val delta = available.offsetToFloat()
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
        val delta = available.offsetToFloat()
        return if (source == NestedScrollSource.Drag) {
            state.dispatchRawDelta(delta).toOffset()
        } else {
            Offset.Zero
        }
    }

    override suspend fun onPreFling(available: Velocity): Velocity {
        val toFling = available.velocityToFloat()
        val currentOffset = state.requireOffset()
        return if (toFling < 0 && currentOffset > state.anchors.minPosition()) {
            state.settle(toFling)
            available
        } else {
            Velocity.Zero
        }
    }

    override suspend fun onPostFling(consumed: Velocity, available: Velocity): Velocity {
        val toFling = available.velocityToFloat()
        state.settle(toFling)
        return available
    }

    private fun Offset.offsetToFloat(): Float = if (orientation == Orientation.Horizontal) x else y

    private fun Float.toOffset(): Offset = Offset(
        x = if (orientation == Orientation.Horizontal) this else 0f,
        y = if (orientation == Orientation.Vertical) this else 0f,
    )

    private fun Velocity.velocityToFloat() = if (orientation == Orientation.Horizontal) x else y
}
