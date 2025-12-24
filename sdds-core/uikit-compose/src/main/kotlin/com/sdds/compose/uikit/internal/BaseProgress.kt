package com.sdds.compose.uikit.internal

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.progressSemantics
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.CacheDrawScope
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.coerceAtLeast
import androidx.compose.ui.unit.dp

/**
 * Базовый компонент Progress.
 * @param progress значение прогресса от 0.0 до 1.0
 * @param modifier модификатор
 * @param indicatorBrush кисть для прогресса
 * @param backgroundBrush кисть для фона
 * @param backgroundHeight высота бэкграунда
 * @param backgroundShape форма бэкграунда
 * @param indicatorHeight высота индикатора
 * @param indicatorShape форма индикатора
 */
@Composable
internal fun BaseProgress(
    progress: Float,
    modifier: Modifier,
    indicatorBrush: Brush?,
    indicatorColor: Color?,
    backgroundBrush: Brush?,
    backgroundColor: Color?,
    indicatorHeight: Dp,
    backgroundHeight: Dp,
    indicatorShape: CornerBasedShape,
    backgroundShape: CornerBasedShape,
) {
    Box(
        modifier = modifier
            .progressSemantics(progress)
            .requiredHeight(maxOf(indicatorHeight, backgroundHeight))
            .drawWithCache {
                val indicatorOutline =
                    createIndicatorOutline(indicatorShape, indicatorHeight, progress)
                val backgroundOutline = createBackgroundOutline(backgroundShape, backgroundHeight)
                val backgroundTranslate =
                    ((indicatorHeight - backgroundHeight) / 2).coerceAtLeast(0.dp).toPx()
                val indicatorTranslate =
                    ((backgroundHeight - indicatorHeight) / 2).coerceAtLeast(0.dp).toPx()

                onDrawBehind {
                    translate(top = backgroundTranslate) {
                        drawFilledOutline(backgroundOutline, backgroundColor, backgroundBrush)
                    }
                    if (progress > 0f) {
                        translate(top = indicatorTranslate) {
                            drawFilledOutline(indicatorOutline, indicatorColor, indicatorBrush)
                        }
                    }
                }
            },
    )
}

private fun DrawScope.drawFilledOutline(outline: Outline, color: Color?, brush: Brush?) {
    brush?.let { drawOutline(outline, brush = it, style = Fill) }
    color?.let { drawOutline(outline, color = it, style = Fill) }
}

private fun CacheDrawScope.createIndicatorOutline(
    indicatorShape: CornerBasedShape,
    indicatorHeight: Dp,
    progress: Float,
): Outline {
    return indicatorShape.createOutline(
        size = Size(size.width * progress, indicatorHeight.toPx()),
        layoutDirection = layoutDirection,
        density = this,
    )
}

private fun CacheDrawScope.createBackgroundOutline(
    backgroundShape: CornerBasedShape,
    backgroundHeight: Dp,
): Outline {
    return backgroundShape.createOutline(
        size = Size(size.width, backgroundHeight.toPx()),
        layoutDirection = layoutDirection,
        density = this,
    )
}

@Composable
@Preview
private fun BaseProgressPreview() {
    BaseProgress(
        progress = 1f,
        modifier = Modifier.fillMaxWidth(),
        indicatorBrush = SolidColor(Color.Cyan),
        indicatorColor = Color.Cyan,
        backgroundBrush = SolidColor(Color.Gray),
        backgroundColor = Color.Gray,
        indicatorHeight = 3.dp,
        backgroundHeight = 2.dp,
        indicatorShape = CircleShape,
        backgroundShape = CircleShape,
    )
}
