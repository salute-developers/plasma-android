package com.sdds.compose.uikit

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.internal.scrollbar.BaseScrollBar
import com.sdds.compose.uikit.internal.scrollbar.BaseScrollBarThumb
import kotlin.math.max

/**
 * Интерактивный индикатор для горизонтального или вертикального перемещения по контенту
 *
 * @param scrollState состояние скролла [ScrollState]
 * @param modifier модификатор
 * @param style стиль компонента
 * @param orientation ориентация скролла
 * @param hasTrack показан ли трек скролла
 * @param hoverExpand будет ли увеличиваться компонент при взаимодействии с ним
 * @param alwaysShowScrollbar показывать scrollbar всегда или только во время скролла
 * @param interactionSource источник взаимодействий
 */
@Composable
fun ScrollBar(
    scrollState: ScrollState,
    modifier: Modifier = Modifier,
    style: ScrollBarStyle = LocalScrollBarStyle.current,
    orientation: Orientation = Orientation.Vertical,
    hasTrack: Boolean = false,
    hoverExpand: Boolean = true,
    alwaysShowScrollbar: Boolean = false,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val isDragging = remember { mutableStateOf(false) }
    BaseScrollBar(
        modifier = modifier,
        scrollableState = scrollState,
        orientation = orientation,
        alwaysShowScrollbar = alwaysShowScrollbar,
        hasTrack = hasTrack,
        hoverExpand = hoverExpand,
        hoverExpandFactor = style.hoverExpandFactor,
        trackWidth = style.dimensions.width,
        trackColor = style.colors.trackColor.colorForInteraction(interactionSource),
        trackShape = style.shape,
        isDragging = isDragging,
        interactionSource = interactionSource,
    ) {
        BaseScrollBarThumb(
            scrollState = scrollState,
            orientation = orientation,
            thumbWidth = style.dimensions.width,
            thumbColor = style.colors.thumbColor.colorForInteraction(interactionSource),
            thumbShape = style.shape,
            isDragging = isDragging,
        )
    }
}

/**
 * Интерактивный индикатор для горизонтального или вертикального перемещения по контенту
 *
 * @param scrollState состояние скролла [LazyListState]
 * @param modifier модификатор
 * @param style стиль компонента
 * @param orientation ориентация скролла
 * @param hasTrack показан ли трек скролла
 * @param hoverExpand будет ли увеличиваться компонент при взаимодействии с ним
 * @param alwaysShowScrollbar показывать scrollbar всегда или только во время скролла
 * @param interactionSource источник взаимодействий
 */
@Composable
fun ScrollBar(
    scrollState: LazyListState,
    modifier: Modifier = Modifier,
    style: ScrollBarStyle = LocalScrollBarStyle.current,
    orientation: Orientation = Orientation.Vertical,
    hasTrack: Boolean = false,
    hoverExpand: Boolean = true,
    alwaysShowScrollbar: Boolean = false,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val isDragging = remember { mutableStateOf(false) }
    BaseScrollBar(
        modifier = modifier,
        scrollableState = scrollState,
        orientation = orientation,
        alwaysShowScrollbar = alwaysShowScrollbar,
        hasTrack = hasTrack,
        hoverExpand = hoverExpand,
        hoverExpandFactor = style.hoverExpandFactor,
        trackWidth = style.dimensions.width,
        trackColor = style.colors.trackColor.colorForInteraction(interactionSource),
        trackShape = style.shape,
        isDragging = isDragging,
        interactionSource = interactionSource,
    ) {
        BaseScrollBarThumb(
            scrollState = scrollState,
            orientation = orientation,
            thumbWidth = style.dimensions.width,
            thumbColor = style.colors.thumbColor.colorForInteraction(interactionSource),
            thumbShape = style.shape,
            isDragging = isDragging,
        )
    }
}

@Composable
@Preview
private fun LazyScrollBarPreview() {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        val scrollState = rememberLazyListState()
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 24.dp),
            state = scrollState,
        ) {
            items(200) {
                Text(text = "lazy text $it")
            }
        }
        ScrollBar(
            modifier = Modifier.align(Alignment.CenterEnd),
            scrollState = scrollState,
            alwaysShowScrollbar = false,
        )
    }
}

@Composable
@Preview
private fun SimpleScrollBarPreview() {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        val state = rememberScrollState()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(state),
        ) {
            repeat(100) {
                Text(text = "text $it")
            }
        }
        ScrollBar(
            modifier = Modifier.align(Alignment.CenterEnd),
            scrollState = state,
            alwaysShowScrollbar = false,
        )
    }
}

/**
 * Добавляет scroll bar
 *
 * @param state состояние скролла
 * @param direction ориентация
 * @param indicatorThickness толщина ползунка
 * @param indicatorColor цвет ползунка
 * @param backgroundColor цвет бэкграунда
 * @param alpha альфа
 * @param alphaAnimationSpec анимация альфы
 * @param padding отступы скроллбара
 */
@Suppress("LongMethod")
@Deprecated("Use ScrollBar composable instead")
fun Modifier.scrollbar(
    state: ScrollState,
    direction: Orientation,
    indicatorThickness: Dp = 4.dp,
    indicatorColor: Color = Color.DarkGray,
    backgroundColor: Color = Color.LightGray,
    alpha: Float = if (state.isScrollInProgress) 0.8f else 0f,
    alphaAnimationSpec: AnimationSpec<Float> = tween(
        delayMillis = if (state.isScrollInProgress) 0 else 1500,
        durationMillis = if (state.isScrollInProgress) 150 else 500,
    ),
    padding: PaddingValues = PaddingValues(all = 0.dp),
): Modifier = composed {
    val scrollbarAlpha by animateFloatAsState(
        targetValue = alpha,
        animationSpec = alphaAnimationSpec,
        label = "",
    )

    drawWithContent {
        drawContent()

        val showScrollBar = state.isScrollInProgress || scrollbarAlpha > 0.0f

        // Draw scrollbar only if currently scrolling or if scroll animation is ongoing.
        if (showScrollBar) {
            val topPadding = padding.calculateTopPadding().toPx()
            val bottomPadding = padding.calculateBottomPadding().toPx()
            val startPadding = padding.calculateStartPadding(layoutDirection).toPx()
            val endPadding = padding.calculateEndPadding(layoutDirection).toPx()

            val contentOffset = state.value
            val viewPortLength = viewPortLength(direction)
            val viewPortCrossAxisLength = viewPortCrossAxisLength(direction)
            val contentLength = max(
                viewPortLength + state.maxValue,
                0.001f, // To prevent divide by zero error
            )
            val indicatorLength = indicatorLength(
                viewPortLength = viewPortLength,
                contentLength = contentLength,
                orientation = direction,
                topPadding = topPadding,
                bottomPadding = bottomPadding,
                startPadding = startPadding,
                endPadding = endPadding,
            )
            val indicatorThicknessPx = indicatorThickness.toPx()
            val scrollOffsetViewPort = viewPortLength * contentOffset / contentLength

            val scrollbarSizeWithoutInsets = if (direction == Orientation.Vertical) {
                Size(indicatorThicknessPx, indicatorLength)
            } else {
                Size(indicatorLength, indicatorThicknessPx)
            }
            val scrollBarBackgroundSize = if (direction == Orientation.Vertical) {
                Size(indicatorThicknessPx, viewPortLength - topPadding - bottomPadding)
            } else {
                Size(viewPortLength - startPadding - endPadding, indicatorThicknessPx)
            }

            val scrollbarPositionWithoutInsets = if (direction == Orientation.Vertical) {
                Offset(
                    x = if (layoutDirection == LayoutDirection.Ltr) {
                        viewPortCrossAxisLength - indicatorThicknessPx - endPadding
                    } else {
                        startPadding
                    },
                    y = scrollOffsetViewPort + topPadding,
                )
            } else {
                Offset(
                    x = if (layoutDirection == LayoutDirection.Ltr) {
                        scrollOffsetViewPort + startPadding
                    } else {
                        viewPortLength - scrollOffsetViewPort - indicatorLength - endPadding
                    },
                    y = viewPortCrossAxisLength - indicatorThicknessPx - bottomPadding,
                )
            }

            val scrollbarBgPositionWithoutInsets = if (direction == Orientation.Vertical) {
                Offset(
                    x = if (layoutDirection == LayoutDirection.Ltr) {
                        viewPortCrossAxisLength - indicatorThicknessPx - endPadding
                    } else {
                        startPadding
                    },
                    y = topPadding,
                )
            } else {
                Offset(
                    x = if (layoutDirection == LayoutDirection.Ltr) {
                        startPadding
                    } else {
                        viewPortLength - endPadding
                    },
                    y = viewPortCrossAxisLength - indicatorThicknessPx - bottomPadding,
                )
            }

            // рисуем бэкграунд
            drawRoundRect(
                color = backgroundColor,
                cornerRadius = CornerRadius(
                    x = indicatorThicknessPx / 2,
                    y = indicatorThicknessPx / 2,
                ),
                topLeft = scrollbarBgPositionWithoutInsets,
                size = scrollBarBackgroundSize,
                alpha = scrollbarAlpha,
            )

            // рисуем ползунок
            drawRoundRect(
                color = indicatorColor,
                cornerRadius = CornerRadius(
                    x = indicatorThicknessPx / 2,
                    y = indicatorThicknessPx / 2,
                ),
                topLeft = scrollbarPositionWithoutInsets,
                size = scrollbarSizeWithoutInsets,
                alpha = scrollbarAlpha,
            )
        }
    }
}

private fun ContentDrawScope.viewPortLength(orientation: Orientation): Float {
    return if (orientation == Orientation.Vertical) {
        size.height
    } else {
        size.width
    }
}

private fun ContentDrawScope.viewPortCrossAxisLength(orientation: Orientation): Float {
    return if (orientation == Orientation.Vertical) {
        size.width
    } else {
        size.height
    }
}

private fun indicatorLength(
    viewPortLength: Float,
    contentLength: Float,
    orientation: Orientation,
    topPadding: Float,
    bottomPadding: Float,
    startPadding: Float,
    endPadding: Float,
): Float {
    val paddings = if (orientation == Orientation.Vertical) {
        topPadding + bottomPadding
    } else {
        startPadding + endPadding
    }
    return ((viewPortLength / contentLength) * viewPortLength) - paddings
}

/**
 * Настройки скроллбара
 *
 * @property indicatorThickness толщина ползунка
 * @property indicatorColor цвет ползунка
 * @property backgroundColor цвет бэкграунда
 * @property alpha альфа
 * @property alphaAnimationSpec анимация альфы
 * @property padding отступы скроллбара
 */
@Immutable
@Deprecated("Use ScrollBar composable instead")
data class ScrollBar(
    val indicatorThickness: Dp = 2.dp,
    val indicatorColor: InteractiveColor = Color.DarkGray.asInteractive(),
    val backgroundColor: InteractiveColor = Color.LightGray.asInteractive(),
    val alpha: Float? = null,
    val alphaAnimationSpec: AnimationSpec<Float>? = null,
    val padding: PaddingValues = PaddingValues(all = 0.dp),
)
