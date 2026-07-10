package com.sdds.compose.uikit.internal.slider

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.SlideDirection
import com.sdds.compose.uikit.SliderOrientation

/**
 * Базовый компонент Progress.
 * @param progress значение прогресса от 0.0 до 1.0
 * @param modifier модификатор
 * @param indicatorBrush кисть для прогресса
 * @param trackBrush кисть для фона
 * @param trackThickness высота бэкграунда
 * @param trackShape форма бэкграунда
 * @param indicatorThickness высота индикатора
 * @param indicatorShape форма индикатора
 */
@Composable
internal fun BaseTrackAndIndicator(
    progress: () -> Float,
    modifier: Modifier,
    indicatorBrush: Brush?,
    indicatorColor: Color?,
    trackBrush: Brush?,
    trackColor: Color?,
    indicatorThickness: Dp,
    trackThickness: Dp,
    indicatorShape: CornerBasedShape,
    trackShape: CornerBasedShape,
    orientation: SliderOrientation = SliderOrientation.Horizontal,
    direction: SlideDirection = SlideDirection.Normal,
) {
    val mainThickness = maxOf(indicatorThickness, trackThickness)
    Box(
        modifier
            .then(
                if (orientation == SliderOrientation.Horizontal) {
                    Modifier.requiredHeight(mainThickness)
                } else {
                    Modifier.requiredWidth(mainThickness)
                },
            )
            .drawWithCache {
                val indicatorHeightPx = indicatorThickness.toPx()
                val trackHeightPx = trackThickness.toPx()
                val indicatorSize = indicatorSize(orientation, size, indicatorHeightPx, progress())
                val trackSize = trackSize(orientation, size, trackHeightPx)
                val indicatorOutline = indicatorShape.createOutline(indicatorSize, layoutDirection, this)
                val backgroundOutline = trackShape.createOutline(trackSize, layoutDirection, this)
                val delta = (trackHeightPx - indicatorHeightPx) / 2
                val trackShift = (-delta).coerceAtMost(0f)
                val indicatorShift = delta.coerceAtMost(0f)
                val indicatorStart = indicatorStartOffset(orientation, size, indicatorSize, direction)

                onDrawBehind {
                    translate(
                        top = if (orientation == SliderOrientation.Horizontal) trackShift else 0f,
                        left = if (orientation == SliderOrientation.Vertical) trackShift else 0f,
                    ) {
                        drawFilledOutline(backgroundOutline, trackColor, trackBrush)
                    }
                    if (progress() > 0f) {
                        translate(
                            left = indicatorStart.x +
                                if (orientation == SliderOrientation.Vertical) indicatorShift else 0f,
                            top = indicatorStart.y +
                                if (orientation == SliderOrientation.Horizontal) indicatorShift else 0f,
                        ) {
                            drawFilledOutline(indicatorOutline, indicatorColor, indicatorBrush)
                        }
                    }
                }
            },
    )
}

private fun DrawScope.drawFilledOutline(outline: Outline, color: Color?, brush: Brush?) {
    brush?.let { drawOutline(outline, brush = it, style = Fill) }
        ?: color?.let { drawOutline(outline, color = it, style = Fill) }
}

private fun indicatorSize(
    orientation: SliderOrientation,
    fullSize: Size,
    indicatorHeightPx: Float,
    progress: Float,
): Size = when (orientation) {
    SliderOrientation.Horizontal ->
        Size(fullSize.width * progress, indicatorHeightPx)

    else -> Size(indicatorHeightPx, fullSize.height * progress)
}

private fun trackSize(
    orientation: SliderOrientation,
    fullSize: Size,
    trackHeightPx: Float,
): Size = when (orientation) {
    SliderOrientation.Horizontal ->
        Size(fullSize.width, trackHeightPx)

    else -> Size(trackHeightPx, fullSize.height)
}

private fun indicatorStartOffset(
    orientation: SliderOrientation,
    fullSize: Size,
    indicatorSize: Size,
    direction: SlideDirection,
): Offset = when (orientation) {
    SliderOrientation.Horizontal -> {
        val x = if (direction == SlideDirection.Normal) 0f else fullSize.width - indicatorSize.width
        Offset(x, 0f)
    }

    else -> {
        val y = if (direction == SlideDirection.Normal) fullSize.height - indicatorSize.height else 0f
        Offset(0f, y)
    }
}
