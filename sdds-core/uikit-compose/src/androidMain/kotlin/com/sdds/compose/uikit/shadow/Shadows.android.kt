package com.sdds.compose.uikit.shadow

import android.os.Build
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.scale
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.graphics.withSave

internal actual fun shouldDrawFallbackShadow(): Boolean =
    Build.VERSION.SDK_INT < Build.VERSION_CODES.P

internal actual fun Modifier.shadowLayer(
    layer: ShadowLayer,
    shape: Shape,
): Modifier = this.drawWithCache {
    val radiusPx = layer.blurRadius.toPx()
    val isRadiusValid = radiusPx > 0.0F
    val paint = Paint().apply {
        this.color = if (isRadiusValid) {
            Color.Transparent
        } else {
            color
        }

        asFrameworkPaint().apply {
            isDither = true
            isAntiAlias = true

            if (isRadiusValid) {
                setShadowLayer(
                    radiusPx,
                    layer.offset.x.toPx(),
                    layer.offset.y.toPx(),
                    layer.color.toArgb(),
                )
            }
        }
    }
    val shapeOutline = shape.createOutline(
        size = size,
        layoutDirection = layoutDirection,
        density = this,
    )

    val drawShadowBlock: DrawScope.() -> Unit = {
        drawIntoCanvas { canvas ->
            canvas.withSave {
                if (isRadiusValid.not()) {
                    canvas.translate(
                        dx = layer.offset.x.toPx(),
                        dy = layer.offset.y.toPx(),
                    )
                }

                if (layer.spreadRadius.value != 0.0F) {
                    canvas.scale(
                        sx = spreadScale(layer.spreadRadius.toPx(), size.width),
                        sy = spreadScale(layer.spreadRadius.toPx(), size.height),
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

    onDrawBehind {
        drawShadowBlock()
    }
}
