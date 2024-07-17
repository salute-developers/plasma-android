package com.sdds.compose.uikit.internal

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.progressSemantics
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection

/**
 * Базовый компонент Progress.
 * @param progress значение прогресса от 0.0 до 1.0
 * @param modifier модификатор
 * @param main кисть для прогресса
 * @param background кисть для фона
 * @param backgroundHeight высота бэкграунда
 * @param linearIndicatorHeight высота индикатора
 */
@Composable
internal fun BaseProgress(
    progress: Float,
    modifier: Modifier,
    main: Brush,
    background: Brush,
    backgroundHeight: Dp,
    linearIndicatorHeight: Dp,
) {
    Canvas(
        modifier
            .progressSemantics(progress)
            .requiredHeight(linearIndicatorHeight),
    ) {
        val strokeWidth = size.height
        // Рисуем фон
        drawLineIndicator(0f, 1f, background, backgroundHeight.toPx())

        // Рисуем индикатор
        drawLineIndicator(0f, progress, main, strokeWidth)
    }
}

private fun DrawScope.drawLineIndicator(
    startFraction: Float,
    endFraction: Float,
    brush: Brush,
    strokeWidth: Float,
) {
    val width = size.width
    val height = size.height
    val yOffset = height / 2

    val isLtr = layoutDirection == LayoutDirection.Ltr
    val barStart = (if (isLtr) startFraction else 1f - endFraction) * width
    val barEnd = (if (isLtr) endFraction else 1f - startFraction) * width

    drawLine(
        brush,
        Offset(barStart, yOffset),
        Offset(barEnd, yOffset),
        strokeWidth,
        cap = StrokeCap.Round,
    )
}
