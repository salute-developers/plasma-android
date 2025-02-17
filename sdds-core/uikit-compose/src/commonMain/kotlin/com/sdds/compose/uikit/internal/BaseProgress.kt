package com.sdds.compose.uikit.internal

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.progressSemantics
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import kotlin.math.abs

/**
 * Базовый компонент Progress.
 * @param progress значение прогресса от 0.0 до 1.0
 * @param modifier модификатор
 * @param main кисть для прогресса
 * @param background кисть для фона
 * @param backgroundHeight высота бэкграунда
 * @param backgroundCornerRadius ардиус скругления бэкграунда
 * @param indicatorHeight высота индикатора
 * @param indicatorCornerRadius радиус скругления индикатора
 */
@Composable
internal fun BaseProgress(
    progress: Float,
    modifier: Modifier,
    main: List<Brush>,
    background: Brush,
    backgroundHeight: Dp,
    backgroundCornerRadius: Dp,
    indicatorHeight: Dp,
    indicatorCornerRadius: Dp,
) {
    Canvas(
        modifier
            .progressSemantics(progress)
            .requiredHeight(indicatorHeight),
    ) {
        // Рисуем фон
        drawLineIndicator(
            startFraction = 0f,
            endFraction = 1f,
            brush = background,
            indicatorHeight = backgroundHeight.toPx(),
            cornerRadius = backgroundCornerRadius.toPx(),
        )

        // Рисуем индикатор
        if (progress > 0f) {
            main.forEach {
                drawLineIndicator(
                    startFraction = 0f,
                    endFraction = progress,
                    brush = it,
                    indicatorHeight = size.height,
                    cornerRadius = indicatorCornerRadius.toPx(),
                )
            }
        }
    }
}

private fun DrawScope.drawLineIndicator(
    startFraction: Float,
    endFraction: Float,
    brush: Brush,
    indicatorHeight: Float,
    cornerRadius: Float,
) {
    val width = size.width
    val height = size.height
    val yOffset = (height - indicatorHeight) / 2

    val isLtr = layoutDirection == LayoutDirection.Ltr
    val barStart = (if (isLtr) startFraction else 1f - endFraction) * width
    val barEnd = (if (isLtr) endFraction else 1f - startFraction) * width

    val radius = CornerRadius(cornerRadius, cornerRadius)
    val rectSize = Size(abs(barEnd - barStart), indicatorHeight)
    val offset = Offset(barStart, yOffset)

    drawRoundRect(
        brush = brush,
        topLeft = offset,
        size = rectSize,
        cornerRadius = radius,
    )
}
