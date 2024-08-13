package com.sdds.compose.uikit.internal.common

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth

/**
 * Контейнер, располагающий элементы в строку с возможностью переноса / скролла
 *
 * @param modifier модификатор
 * @param horizontalSpacing горизонтальный отступ между элементами
 * @param verticalSpacing вертикальный отступ между элементами
 * @param shouldWrap если true, элементы будут заполнять строку и переноситься на новую при недостатке места.
 * Если false, элементы будут расположены в одну строку с возможностью скролла.
 * @param content контент (элементы группы)
 */
@Composable
internal fun FlowRowLayout(
    modifier: Modifier = Modifier,
    horizontalSpacing: Dp,
    verticalSpacing: Dp,
    shouldWrap: Boolean = true,
    content: @Composable FlowRowScope.() -> Unit,
) {
    val measurePolicy = remember(horizontalSpacing, verticalSpacing, shouldWrap) {
        ChipGroupMeasurePolicy(horizontalSpacing, verticalSpacing, shouldWrap)
    }

    val scrollModifier = if (!shouldWrap) {
        val scrollableState = rememberScrollState(0)
        Modifier.horizontalScroll(scrollableState)
    } else {
        Modifier
    }

    Layout(
        content = { FlowRowScopeImpl.content() },
        measurePolicy = measurePolicy,
        modifier = modifier.then(scrollModifier),
    )
}

private class ChipGroupMeasurePolicy(
    private val horizontalSpacing: Dp,
    private val verticalSpacing: Dp,
    private val shouldWrap: Boolean,
) : MeasurePolicy {

    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val itemConstraints = constraints.copy(minWidth = 0, minHeight = 0)
        val maxWidth = constraints.maxWidth
        val maxHeight = constraints.maxHeight
        val horizontalSpacingPx = horizontalSpacing.roundToPx()
        val verticalSpacingPx = verticalSpacing.roundToPx()

        val placeables = measurables.map { it.measure(itemConstraints) }
        val rowHeight = placeables.first().measuredHeight

        val (maxRowWidth, maxRowsHeight) = placeables.getMaxDimensions(
            rowHeight = rowHeight,
            horizontalSpacingPx = horizontalSpacingPx,
            verticalSpacingPx = verticalSpacingPx,
            maxHeight = maxHeight,
            maxWidth = maxWidth,
        )

        return layout(
            width = constraints.constrainWidth(maxRowWidth),
            height = constraints.constrainHeight(maxRowsHeight),
        ) {
            var currentX = 0
            var currentY = 0
            placeables.forEachIndexed { i, placeable ->
                val startMargin = if (i == 0) 0 else horizontalSpacingPx
                if (currentX + startMargin + placeable.measuredWidth <= maxWidth) {
                    placeable.placeRelative(currentX + startMargin, currentY)
                    currentX += startMargin + placeable.measuredWidth
                } else if (shouldWrap) {
                    currentY += verticalSpacingPx + rowHeight
                    currentX = 0
                    if (placeable.measuredWidth <= maxWidth && currentY + rowHeight <= maxHeight) {
                        placeable.placeRelative(0, currentY)
                        currentX += placeable.measuredWidth
                    }
                } else {
                    placeable.placeRelative(currentX + startMargin, currentY)
                }
            }
        }
    }
}

private fun List<Placeable>.getMaxDimensions(
    rowHeight: Int,
    horizontalSpacingPx: Int,
    verticalSpacingPx: Int,
    maxHeight: Int,
    maxWidth: Int,
): Pair<Int, Int> {
    var currentX = 0
    var currentY = 0
    var maxRowWidth = 0
    var maxRowHeight = rowHeight

    forEachIndexed { i, it ->
        val startMargin = if (i == 0) 0 else horizontalSpacingPx
        if (currentX + startMargin + it.measuredWidth <= maxWidth) {
            currentX += startMargin + it.measuredWidth
            if (currentX > maxRowWidth) maxRowWidth = currentX
        } else {
            currentY += verticalSpacingPx + rowHeight
            currentX = 0
            if (it.measuredWidth <= maxWidth && currentY + rowHeight <= maxHeight) {
                currentX += it.measuredWidth
                if (currentY + rowHeight > maxRowHeight) maxRowHeight = currentY + rowHeight
            }
        }
    }

    return Pair(maxRowWidth, maxRowHeight)
}

/**
 * Скоуп горизонтального контейнера
 */
interface FlowRowScope

private object FlowRowScopeImpl : FlowRowScope
