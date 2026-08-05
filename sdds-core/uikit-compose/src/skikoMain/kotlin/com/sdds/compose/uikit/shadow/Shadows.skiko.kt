package com.sdds.compose.uikit.shadow

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.scale
import androidx.compose.ui.graphics.withSave
import kotlin.math.ceil
import kotlin.math.max

internal actual fun shouldDrawFallbackShadow(): Boolean = false
internal actual fun Modifier.shadowLayer(
    layer: ShadowLayer,
    shape: Shape,
): Modifier = this.drawWithCache {
    val radiusPx = layer.blurRadius.toPx()
    val isRadiusValid = radiusPx > 0.0F
    val offsetX = layer.offset.x.toPx()
    val offsetY = layer.offset.y.toPx()
    val spreadPx = layer.spreadRadius.toPx()
    val blurSteps = if (isRadiusValid) {
        max(2, ceil(radiusPx / 4f).toInt()).coerceAtMost(12)
    } else {
        1
    }
    val shapeOutline =
        shape.createOutline(
            size = size,
            layoutDirection = layoutDirection,
            density = this,
        )

    val drawShadowBlock: DrawScope.() -> Unit = {
        for (step in blurSteps downTo 1) {
            val progress = step / blurSteps.toFloat()
            val currentSpread = spreadPx + radiusPx * progress
            val alpha =
                if (isRadiusValid) {
                    layer.color.alpha * (1f - progress * 0.85f) / blurSteps
                } else {
                    layer.color.alpha
                }
            val paint =
                Paint().apply {
                    color = layer.color.copy(alpha = alpha.coerceIn(0f, 1f))
                    isAntiAlias = true
                }
            drawIntoCanvas { canvas ->
                canvas.withSave {
                    canvas.translate(dx = offsetX, dy = offsetY)
                    if (currentSpread != 0.0F) {
                        canvas.scale(
                            sx = spreadScale(currentSpread, size.width),
                            sy = spreadScale(currentSpread, size.height),
                            pivotX = center.x,
                            pivotY = center.y,
                        )
                    }
                    canvas.drawOutline(
                        outline = shapeOutline,
                        paint = paint,
                    )
                }
            }
        }
    }

    onDrawBehind {
        drawShadowBlock()
    }
}
