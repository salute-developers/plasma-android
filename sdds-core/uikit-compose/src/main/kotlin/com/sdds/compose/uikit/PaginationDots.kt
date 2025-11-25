package com.sdds.compose.uikit

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.StatefulValue
import kotlin.math.roundToInt

/**
 * Элементы переключения.
 * Oтображают возможность перемещения между небольшим количеством однородных элементов контента.
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param selectedIndex индекс выбранного элемента
 * @param totalCount общее количество элементов
 * @param visibleCount видимое количество элемекнтов
 */
@Composable
@Suppress("LongMethod")
fun PaginationDots(
    modifier: Modifier = Modifier,
    style: PaginationDotsStyle = LocalPaginationDotsStyle.current,
    selectedIndex: Int,
    totalCount: Int,
    visibleCount: Int = 5,
) {
    check(visibleCount <= totalCount) { "totalCount should be greater than or equal to the visibleCount" }
    val safeSelectedIndex = selectedIndex.coerceIn(0, totalCount - 1)

    val dotMainAxisSize = getDotMainAxisSize(
        orientation = style.orientation,
        dotHeight = style.dimensions.dotHeight,
        dotWidth = style.dimensions.dotWidth,
    )
    val selectedDotMainAxisSize = getSelectedDotMainAxisSize(
        orientation = style.orientation,
        dotHeight = style.dimensions.dotHeight,
        dotWidth = style.dimensions.dotWidth,
    )
    val viewportSize =
        dotMainAxisSize * (visibleCount - 1) + selectedDotMainAxisSize + style.dimensions.gap * (visibleCount)
    val visibleCenter = visibleCount / 2
    val startOffset = (safeSelectedIndex - visibleCenter).coerceIn(0, totalCount - visibleCount)
    val endOffset = (totalCount - visibleCount - startOffset).coerceIn(0, totalCount - visibleCount)
    val scrollStepPx = (dotMainAxisSize + style.dimensions.gap).toPxF().roundToInt()
    val scrollState = rememberScrollState()

    LaunchedEffect(safeSelectedIndex, totalCount, visibleCount, viewportSize) {
        scrollState.animateScrollTo(startOffset * scrollStepPx, tween())
    }

    when (style.orientation) {
        PaginationDotsOrientation.Vertical -> {
            Column(
                modifier = modifier
                    .requiredHeight(viewportSize)
                    .verticalScroll(state = scrollState, enabled = false),
                verticalArrangement = Arrangement.spacedBy(style.dimensions.gap),
            ) {
                repeat(totalCount) { i ->
                    val scale = getDotScale(
                        startOffset = startOffset,
                        endOffset = endOffset,
                        index = i,
                        selectedIndex = safeSelectedIndex,
                        totalCount = totalCount,
                        edgeCount = style.edgeCount,
                        edgeShrinkFactor = style.edgeShrinkFactor,
                        visibleCount = visibleCount,
                    )
                    PaginationDot(
                        isSelected = i == safeSelectedIndex,
                        backgroundColor = style.colors.dotBackgroundColor,
                        dotHeight = style.dimensions.dotHeight,
                        dotWidth = style.dimensions.dotWidth,
                        scale = scale,
                    )
                }
            }
        }

        PaginationDotsOrientation.Horizontal -> {
            Row(
                modifier = modifier
                    .requiredWidth(viewportSize)
                    .horizontalScroll(state = scrollState, enabled = false),
                horizontalArrangement = Arrangement.spacedBy(style.dimensions.gap),
            ) {
                repeat(totalCount) { i ->
                    val scale = getDotScale(
                        startOffset = startOffset,
                        endOffset = endOffset,
                        index = i,
                        selectedIndex = safeSelectedIndex,
                        totalCount = totalCount,
                        edgeCount = style.edgeCount,
                        edgeShrinkFactor = style.edgeShrinkFactor,
                        visibleCount = visibleCount,
                    )
                    PaginationDot(
                        isSelected = i == safeSelectedIndex,
                        backgroundColor = style.colors.dotBackgroundColor,
                        dotHeight = style.dimensions.dotHeight,
                        dotWidth = style.dimensions.dotWidth,
                        scale = scale,
                    )
                }
            }
        }
    }
}

/**
 * Ориентация компонента [PaginationDots]
 */
enum class PaginationDotsOrientation {
    /**
     * Точки расположены вертикально
     */
    Vertical,

    /**
     * Точки расположены горизонтально
     */
    Horizontal,
}

private fun getDotScale(
    startOffset: Int,
    endOffset: Int,
    index: Int,
    selectedIndex: Int,
    totalCount: Int,
    edgeCount: Int,
    edgeShrinkFactor: Float,
    visibleCount: Int,
): Float {
    if (totalCount == visibleCount) return 1f

    val firstVisibleIndex = startOffset
    val lastVisibleIndex = totalCount - endOffset - 1
    val centerVisibleIndex = firstVisibleIndex + (lastVisibleIndex - firstVisibleIndex) / 2
    val shouldDecreaseDotSizeFromStart =
        index < centerVisibleIndex && selectedIndex >= firstVisibleIndex + edgeCount
    val shouldDecreaseDotSizeFromEnd =
        index > centerVisibleIndex && selectedIndex <= lastVisibleIndex - edgeCount
    return when {
        shouldDecreaseDotSizeFromStart -> {
            (1f - (firstVisibleIndex + edgeCount - index) * edgeShrinkFactor).coerceIn(0f, 1f)
        }

        shouldDecreaseDotSizeFromEnd -> {
            (1f - (index - (lastVisibleIndex - edgeCount)) * edgeShrinkFactor).coerceIn(0f, 1f)
        }

        else -> 1f
    }
}

private fun getDotMainAxisSize(
    orientation: PaginationDotsOrientation,
    dotHeight: StatefulValue<Dp>,
    dotWidth: StatefulValue<Dp>,
): Dp {
    return when (orientation) {
        PaginationDotsOrientation.Vertical -> dotHeight.getDefaultValue()
        PaginationDotsOrientation.Horizontal -> dotWidth.getDefaultValue()
    }
}

private fun getSelectedDotMainAxisSize(
    orientation: PaginationDotsOrientation,
    dotHeight: StatefulValue<Dp>,
    dotWidth: StatefulValue<Dp>,
): Dp {
    val activatedStateSet = setOf(InteractiveState.Activated)
    return when (orientation) {
        PaginationDotsOrientation.Vertical -> dotHeight.getValue(activatedStateSet)
        PaginationDotsOrientation.Horizontal -> dotWidth.getValue(activatedStateSet)
    }
}

@Composable
private fun Dp.toPxF(): Float {
    return with(LocalDensity.current) {
        this@toPxF.toPx()
    }
}

@Composable
private fun PaginationDot(
    isSelected: Boolean,
    backgroundColor: StatefulValue<Color>,
    dotHeight: StatefulValue<Dp>,
    dotWidth: StatefulValue<Dp>,
    scale: Float,
) {
    val stateSet = remember(isSelected) {
        if (isSelected) setOf(InteractiveState.Activated) else emptySet()
    }
    val selectedAlpha by animateFloatAsState(
        targetValue = if (isSelected) 1f else 0f,
        animationSpec = tween(ANIMATION_DURATION),
        label = "alphaAnimation",
    )
    val animatedScale by animateFloatAsState(
        targetValue = scale,
        animationSpec = tween(ANIMATION_DURATION),
        label = "scaleAnimation",
    )
    val animatedWidth = dotWidth.getValue(stateSet = stateSet)
    val animatedHeight = dotHeight.getValue(stateSet = stateSet)
    val selectedColor = backgroundColor.getValue(setOf(InteractiveState.Activated))
    val unselectedColor = backgroundColor.getDefaultValue()
    Box(
        Modifier
            .height(animatedHeight)
            .width(animatedWidth)
            .drawWithContent {
                val dotHeightPx = animatedHeight.toPx()
                val dotWidthPx = animatedWidth.toPx()
                drawContent()
                drawRoundRect(
                    color = unselectedColor,
                    topLeft = Offset(
                        x = (dotWidthPx - dotWidthPx * animatedScale) / 2f,
                        y = (dotHeightPx - dotHeightPx * animatedScale) / 2f,
                    ),
                    size = Size(dotWidthPx, dotHeightPx) * animatedScale,
                    cornerRadius = CornerRadius((minOf(dotWidthPx, dotHeightPx)) / 2),
                    alpha = 1f,
                )
                drawRoundRect(
                    color = selectedColor,
                    topLeft = Offset(
                        x = (dotWidthPx - dotWidthPx * animatedScale) / 2f,
                        y = (dotHeightPx - dotHeightPx * animatedScale) / 2f,
                    ),
                    size = Size(dotWidthPx, dotHeightPx) * animatedScale,
                    cornerRadius = CornerRadius((minOf(dotWidthPx, dotHeightPx)) / 2),
                    alpha = selectedAlpha,
                )
            },
    )
}

private const val ANIMATION_DURATION = 300
