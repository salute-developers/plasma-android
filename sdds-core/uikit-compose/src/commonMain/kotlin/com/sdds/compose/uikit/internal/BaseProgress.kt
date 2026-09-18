package com.sdds.compose.uikit.internal

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.progressSemantics
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.CacheDrawScope
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.coerceAtLeast
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.graphics.brush.BrushProducer

/**
 * Базовый компонент Progress.
 * @param progress значение прогресса от 0.0 до 1.0
 * @param modifier модификатор
 * @param indicatorBrush производитель кисти для прогресса
 * @param backgroundBrush производитель кисти для фона
 * @param indicatorStateHeight стейт высоты индикатора
 * @param backgroundStateHeight стейт высоты фона
 * @param indicatorStateShape стейт формы индикатора
 * @param backgroundStateShape стейт формы бэкграунда
 */
@Composable
internal fun BaseProgress(
    progress: Float,
    modifier: Modifier,
    indicatorBrush: BrushProducer,
    backgroundBrush: BrushProducer,
    indicatorStateHeight: State<Dp>,
    backgroundStateHeight: State<Dp>,
    indicatorStateShape: State<CornerBasedShape>,
    backgroundStateShape: State<CornerBasedShape>,
) {
    val indicatorHeight = indicatorStateHeight.value
    val backgroundHeight = backgroundStateHeight.value
    val indicatorShape = indicatorStateShape.value
    val backgroundShape = backgroundStateShape.value
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
                        drawFilledOutline(backgroundOutline, backgroundBrush)
                    }
                    if (progress > 0f) {
                        translate(top = indicatorTranslate) {
                            drawFilledOutline(indicatorOutline, indicatorBrush)
                        }
                    }
                }
            },
    )
}

private fun DrawScope.drawFilledOutline(outline: Outline, brush: BrushProducer) {
    drawOutline(outline, brush = brush(), style = Fill)
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
