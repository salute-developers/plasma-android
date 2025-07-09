package com.sdds.compose.uikit.internal.scrollbar

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.BoxWithConstraintsScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.scrollbar.BaseScrollBar.animatedScrollBarAlpha
import com.sdds.compose.uikit.internal.scrollbar.BaseScrollBar.processLazyScrollBarDrag
import com.sdds.compose.uikit.internal.scrollbar.BaseScrollBar.processScrollBarDrag
import com.sdds.compose.uikit.internal.scrollbar.BaseScrollBar.scrollBarThumbOffset
import com.sdds.compose.uikit.internal.scrollbar.BaseScrollBar.scrollBarThumbSize
import com.sdds.compose.uikit.internal.scrollbar.BaseScrollBar.scrollBarTrackSize
import com.sdds.compose.uikit.internal.scrollbar.BaseScrollBar.thumbLengthPx
import com.sdds.compose.uikit.internal.scrollbar.BaseScrollBar.thumbMinLengthPx
import com.sdds.compose.uikit.internal.scrollbar.BaseScrollBar.thumbOffsetPx
import com.sdds.compose.uikit.internal.scrollbar.BaseScrollBar.trackLengthPx
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlin.math.max

@Composable
internal fun BaseScrollBar(
    modifier: Modifier,
    scrollableState: ScrollableState,
    orientation: Orientation,
    alwaysShowScrollbar: Boolean,
    hasTrack: Boolean,
    hoverExpand: Boolean,
    hoverExpandFactor: Float,
    trackWidth: Dp,
    trackColor: Color,
    trackShape: Shape,
    isDragging: State<Boolean>,
    interactionSource: MutableInteractionSource,
    scrollBarThumb: @Composable (BoxWithConstraintsScope.() -> Unit),
) {
    val animatedAlpha: State<Float> = animatedScrollBarAlpha(
        scrollableState = scrollableState,
        isDragging = isDragging,
        alwaysShowScrollbar = alwaysShowScrollbar,
    )
    val isTrackHovered = interactionSource.collectIsHoveredAsState()
    BoxWithConstraints(
        modifier = modifier
            .hoverable(interactionSource)
            .scrollBarTrackSize(orientation, trackWidth)
            .graphicsLayer {
                alpha = animatedAlpha.value
                val shouldExpand =
                    hoverExpand && (isTrackHovered.value || isDragging.value) && hoverExpandFactor != 1.0f
                if (shouldExpand) {
                    when (orientation) {
                        Orientation.Vertical -> scaleX = 2f
                        Orientation.Horizontal -> scaleY = 2f
                    }
                }
            }
            .run { if (hasTrack) background(trackColor, trackShape) else this },
    ) {
        scrollBarThumb.invoke(this)
    }
}

@Composable
internal fun BoxWithConstraintsScope.BaseScrollBarThumb(
    scrollState: LazyListState,
    modifier: Modifier = Modifier,
    orientation: Orientation,
    thumbWidth: Dp,
    thumbColor: Color,
    thumbShape: Shape,
    isDragging: MutableState<Boolean>,
) {
    val coroutineScope = rememberCoroutineScope()
    val trackLengthPx = trackLengthPx(orientation)
    val thumbMinLengthPx = thumbMinLengthPx()
    val thumbLengthPx by thumbLengthPx(scrollState, trackLengthPx, thumbMinLengthPx)
    val thumbOffsetPx by thumbOffsetPx(scrollState, trackLengthPx, thumbLengthPx)
    val dragModifier = Modifier.processLazyScrollBarDrag(
        scrollState = scrollState,
        orientation = orientation,
        coroutineScope = coroutineScope,
        trackLengthPx = trackLengthPx,
        thumbLengthPx = thumbLengthPx,
        isDragging = isDragging,
    )

    BasicScrollBarThumb(
        orientation = orientation,
        modifier = modifier,
        dragModifier = dragModifier,
        thumbWidth = thumbWidth,
        thumbColor = thumbColor,
        thumbShape = thumbShape,
        thumbLengthPx = thumbLengthPx,
        thumbOffsetPx = thumbOffsetPx,
    )
}

@Composable
internal fun BoxWithConstraintsScope.BaseScrollBarThumb(
    scrollState: ScrollState,
    modifier: Modifier = Modifier,
    orientation: Orientation,
    thumbWidth: Dp,
    thumbColor: Color,
    thumbShape: Shape,
    isDragging: MutableState<Boolean>,
) {
    val trackLengthPx = trackLengthPx(orientation)
    val thumbMinLengthPx = thumbMinLengthPx()
    val thumbLengthPx by thumbLengthPx(scrollState, trackLengthPx, thumbMinLengthPx)
    val thumbOffsetPx by thumbOffsetPx(scrollState, trackLengthPx, thumbLengthPx)
    val coroutineScope = rememberCoroutineScope()

    val dragModifier = Modifier.processScrollBarDrag(
        scrollState = scrollState,
        orientation = orientation,
        coroutineScope = coroutineScope,
        trackLengthPx = trackLengthPx,
        thumbLengthPx = thumbLengthPx,
        isDragging = isDragging,
    )

    BasicScrollBarThumb(
        orientation = orientation,
        modifier = modifier,
        dragModifier = dragModifier,
        thumbWidth = thumbWidth,
        thumbColor = thumbColor,
        thumbShape = thumbShape,
        thumbLengthPx = thumbLengthPx,
        thumbOffsetPx = thumbOffsetPx,
    )
}

@Composable
private fun BasicScrollBarThumb(
    orientation: Orientation,
    modifier: Modifier = Modifier,
    dragModifier: Modifier,
    thumbWidth: Dp,
    thumbColor: Color,
    thumbShape: Shape,
    thumbLengthPx: Float,
    thumbOffsetPx: Float,
) {
    Box(
        modifier = modifier
            .scrollBarThumbSize(
                orientation = orientation,
                thumbWidth = thumbWidth,
                thumbLength = with(LocalDensity.current) { thumbLengthPx.toDp() },
            )
            .scrollBarThumbOffset(
                orientation = orientation,
                offset = with(LocalDensity.current) { thumbOffsetPx.toDp() },
            )
            .then(dragModifier),
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(thumbColor, thumbShape),
        )
    }
}

internal object BaseScrollBar {

    @Composable
    fun thumbOffsetPx(
        scrollState: LazyListState,
        trackLengthPx: Float,
        thumbLengthPx: Float,
    ): State<Float> = remember(thumbLengthPx) {
        derivedStateOf {
            val layoutInfo = scrollState.layoutInfo
            val averageItemSize =
                layoutInfo.visibleItemsInfo.sumOf { it.size } / layoutInfo.visibleItemsInfo.size.toFloat()
            val firstVisibleItemIndex = layoutInfo.visibleItemsInfo.firstOrNull()?.index ?: 0
            val firstVisibleItemScrollOffset =
                layoutInfo.visibleItemsInfo.firstOrNull()?.offset ?: 0
            val totalContentSize =
                layoutInfo.totalItemsCount * averageItemSize +
                    layoutInfo.beforeContentPadding + layoutInfo.afterContentPadding
            val availableTrackSpace = trackLengthPx - thumbLengthPx
            val availableScrollContentSpace = totalContentSize - trackLengthPx
            val scrolledContentDelta =
                firstVisibleItemIndex * averageItemSize - firstVisibleItemScrollOffset
            val offset = (scrolledContentDelta / availableScrollContentSpace) * availableTrackSpace
            offset
        }
    }

    @Composable
    fun thumbOffsetPx(
        scrollState: ScrollState,
        trackLengthPx: Float,
        thumbLengthPx: Float,
    ): State<Float> = remember(thumbLengthPx) {
        derivedStateOf {
            val availableHeight = trackLengthPx - thumbLengthPx
            val offset =
                (scrollState.value.toFloat() / scrollState.maxValue.toFloat()) * availableHeight
            offset.orZero()
        }
    }

    private fun Float.orZero(): Float = if (this.isNaN()) 0f else this

    @Composable
    fun thumbLengthPx(
        scrollState: ScrollState,
        trackLengthPx: Float,
        thumbMinLengthPx: Float,
    ): State<Float> = remember {
        derivedStateOf {
            val visibleRatio = trackLengthPx / (trackLengthPx + scrollState.maxValue)
            max(thumbMinLengthPx, trackLengthPx * visibleRatio)
        }
    }

    @Composable
    fun thumbLengthPx(
        scrollState: LazyListState,
        trackLengthPx: Float,
        thumbMinLengthPx: Float,
    ): State<Float> =
        remember {
            derivedStateOf {
                val layoutInfo = scrollState.layoutInfo
                val averageItemSize =
                    layoutInfo.visibleItemsInfo.sumOf { it.size } / layoutInfo.visibleItemsInfo.size
                val fullContentSize = layoutInfo.totalItemsCount * averageItemSize
                val visibleRatio = trackLengthPx / fullContentSize.toFloat()
                max(thumbMinLengthPx, trackLengthPx * visibleRatio)
            }
        }

    fun Modifier.processLazyScrollBarDrag(
        scrollState: LazyListState,
        orientation: Orientation,
        coroutineScope: CoroutineScope,
        trackLengthPx: Float,
        thumbLengthPx: Float,
        isDragging: MutableState<Boolean>,
    ): Modifier = this.pointerInput(Unit) {
        detectDragGestures(
            onDragStart = { isDragging.value = true },
            onDragEnd = { isDragging.value = false },
            onDragCancel = { isDragging.value = false },
            onDrag = { change, dragAmount ->
                change.consume()
                coroutineScope.launch {
                    val dragOffset = dragAmount.dragOffset(orientation)
                    val layoutInfo = scrollState.layoutInfo
                    val availableTrackSpace = trackLengthPx - thumbLengthPx
                    val averageItemSize =
                        layoutInfo.visibleItemsInfo.sumOf { it.size } / layoutInfo.visibleItemsInfo.size.toFloat()
                    val totalContentSize = layoutInfo.totalItemsCount * averageItemSize +
                        layoutInfo.beforeContentPadding + layoutInfo.afterContentPadding
                    val scrollRatio = dragOffset / availableTrackSpace
                    val availableScrollContentSpace = totalContentSize - trackLengthPx
                    scrollState.scrollBy(availableScrollContentSpace * scrollRatio)
                }
            },
        )
    }

    fun Modifier.processScrollBarDrag(
        scrollState: ScrollState,
        orientation: Orientation,
        coroutineScope: CoroutineScope,
        trackLengthPx: Float,
        thumbLengthPx: Float,
        isDragging: MutableState<Boolean>,
    ): Modifier = this.pointerInput(Unit) {
        detectDragGestures(
            onDragStart = { isDragging.value = true },
            onDragEnd = { isDragging.value = false },
            onDragCancel = { isDragging.value = false },
            onDrag = { change, dragAmount ->
                change.consume()
                coroutineScope.launch {
                    val dragOffset = dragAmount.dragOffset(orientation)
                    val availableHeight = trackLengthPx - thumbLengthPx
                    if (availableHeight > 0) {
                        val scrollableRatio = dragOffset / availableHeight
                        val newValue =
                            scrollState.value + (scrollableRatio * scrollState.maxValue).toInt()
                        scrollState.scrollTo(
                            newValue.coerceIn(0, scrollState.maxValue),
                        )
                    }
                }
            },
        )
    }

    private fun Offset.dragOffset(orientation: Orientation): Float =
        when (orientation) {
            Orientation.Vertical -> y
            Orientation.Horizontal -> x
        }

    fun Modifier.scrollBarThumbOffset(orientation: Orientation, offset: Dp): Modifier =
        when (orientation) {
            Orientation.Vertical -> this.offset(y = offset)
            Orientation.Horizontal -> this.offset(x = offset)
        }

    fun Modifier.scrollBarThumbSize(
        orientation: Orientation,
        thumbWidth: Dp,
        thumbLength: Dp,
    ): Modifier =
        when (orientation) {
            Orientation.Vertical -> this.size(width = thumbWidth, height = thumbLength)
            Orientation.Horizontal -> this.size(width = thumbLength, height = thumbWidth)
        }

    fun Modifier.scrollBarTrackSize(orientation: Orientation, thumbWidth: Dp): Modifier =
        when (orientation) {
            Orientation.Vertical ->
                this
                    .fillMaxHeight()
                    .width(thumbWidth)

            Orientation.Horizontal ->
                this
                    .fillMaxWidth()
                    .height(thumbWidth)
        }

    @Composable
    fun animatedScrollBarAlpha(
        scrollableState: ScrollableState,
        isDragging: State<Boolean>,
        alwaysShowScrollbar: Boolean,
    ): State<Float> {
        return if (alwaysShowScrollbar) {
            remember { mutableFloatStateOf(1f) }
        } else {
            animateFloatAsState(
                targetValue = if (scrollableState.isScrollInProgress || isDragging.value) 1f else 0f,
                animationSpec = tween(
                    delayMillis = if (scrollableState.isScrollInProgress || isDragging.value) 0 else 1500,
                    durationMillis = if (scrollableState.isScrollInProgress || isDragging.value) 300 else 700,
                ),
            )
        }
    }

    @Composable
    fun BoxWithConstraintsScope.trackLengthPx(orientation: Orientation): Float =
        with(LocalDensity.current) {
            when (orientation) {
                Orientation.Vertical -> maxHeight.toPx()
                Orientation.Horizontal -> maxWidth.toPx()
            }
        }

    @Composable
    fun thumbMinLengthPx(): Float = with(LocalDensity.current) { THUMB_MIN_SIZE_DP.dp.toPx() }

    private const val THUMB_MIN_SIZE_DP = 20
}
