package com.sdds.compose.uikit.graphics

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorProducer
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.DrawScope
import com.sdds.compose.uikit.graphics.brush.BrushProducer

/**
 * Рисует фон с использованием [BrushProducer].
 *
 * @param brushProducer поставщик кисти [Brush]
 * @param shape форма фона
 */
fun Modifier.backgroundBrush(
    brushProducer: BrushProducer,
    shape: Shape = RectangleShape,
): Modifier = this.drawWithCache {
    val outline = if (shape != RectangleShape) {
        shape.createOutline(size, layoutDirection, this)
    } else {
        null
    }
    onDrawBehind {
        val brush = brushProducer.invoke()
        drawFillBrush(brush, outline)
    }
}

/**
 * Рисует фон с использованием [ColorProducer].
 *
 * @param colorProducer поставщик цвета [Color]
 * @param shape форма фона
 */
fun Modifier.backgroundColor(
    colorProducer: ColorProducer,
    shape: Shape = RectangleShape,
): Modifier = this.drawWithCache {
    val outline = if (shape != RectangleShape) {
        shape.createOutline(size, layoutDirection, this)
    } else {
        null
    }
    onDrawBehind {
        val color = colorProducer.invoke()
        drawFillColor(color, outline)
    }
}

private fun DrawScope.drawFillColor(color: Color, outline: Outline?) {
    if (outline != null) {
        drawOutline(outline, color)
    } else {
        drawRect(color)
    }
}

private fun DrawScope.drawFillBrush(
    brush: Brush,
    outline: Outline?,
    alpha: Float = 1f,
    blendMode: BlendMode = DrawScope.DefaultBlendMode,
) {
    if (outline != null) {
        drawOutline(outline, brush, alpha.coerceIn(0f, 1f), blendMode = blendMode)
    } else {
        drawRect(brush, alpha = alpha.coerceIn(0f, 1f), blendMode = blendMode)
    }
}
