package com.sdds.compose.uikit

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import kotlin.math.max

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
data class ScrollBar(
    val indicatorThickness: Dp = 2.dp,
    val indicatorColor: Color = Color.DarkGray,
    val backgroundColor: Color = Color.LightGray,
    val alpha: Float? = null,
    val alphaAnimationSpec: AnimationSpec<Float>? = null,
    val padding: PaddingValues = PaddingValues(all = 0.dp),
)

/**
 * Добавляет вертикадльный скролл со скроллбаром
 *
 * @param state состояние скролла
 * @param enabled включен ли скролл
 * @param flingBehavior см. [FlingBehavior]
 * @param reverseScrolling обратный скролл
 * @param scrollbarConfig настройки скроллбара
 */
fun Modifier.verticalScrollWithScrollbar(
    state: ScrollState,
    enabled: Boolean = true,
    flingBehavior: FlingBehavior? = null,
    reverseScrolling: Boolean = false,
    scrollbarConfig: ScrollBar = ScrollBar(),
) = this
    .scrollbar(
        state = state,
        direction = Orientation.Vertical,
        indicatorThickness = scrollbarConfig.indicatorThickness,
        indicatorColor = scrollbarConfig.indicatorColor,
        backgroundColor = scrollbarConfig.backgroundColor,
        alpha = scrollbarConfig.alpha ?: if (state.isScrollInProgress) 0.8f else 0f,
        alphaAnimationSpec = scrollbarConfig.alphaAnimationSpec ?: tween(
            delayMillis = if (state.isScrollInProgress) 0 else 1500,
            durationMillis = if (state.isScrollInProgress) 150 else 500,
        ),
        padding = scrollbarConfig.padding,
    )
    .verticalScroll(state, enabled, flingBehavior, reverseScrolling)

/**
 * Добавляет горизонтальный скролл со скроллбаром
 *
 * @param state состояние скролла
 * @param enabled включен ли скролл
 * @param flingBehavior см. [FlingBehavior]
 * @param reverseScrolling обратный скролл
 * @param scrollbarConfig настройки скроллбара
 */
fun Modifier.horizontalScrollWithScrollbar(
    state: ScrollState,
    enabled: Boolean = true,
    flingBehavior: FlingBehavior? = null,
    reverseScrolling: Boolean = false,
    scrollbarConfig: ScrollBar = ScrollBar(),
) = this
    .scrollbar(
        state = state,
        direction = Orientation.Horizontal,
        indicatorThickness = scrollbarConfig.indicatorThickness,
        indicatorColor = scrollbarConfig.indicatorColor,
        backgroundColor = scrollbarConfig.backgroundColor,
        alpha = scrollbarConfig.alpha ?: if (state.isScrollInProgress) 0.8f else 0f,
        alphaAnimationSpec = scrollbarConfig.alphaAnimationSpec ?: tween(
            delayMillis = if (state.isScrollInProgress) 0 else 1500,
            durationMillis = if (state.isScrollInProgress) 150 else 500,
        ),
        padding = scrollbarConfig.padding,
    )
    .horizontalScroll(state, enabled, flingBehavior, reverseScrolling)
