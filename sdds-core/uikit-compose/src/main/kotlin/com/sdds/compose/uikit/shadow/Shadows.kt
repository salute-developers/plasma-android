package com.sdds.compose.uikit.shadow

import android.os.Build
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.scale
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.graphics.withSave
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp

/**
 * Модель описывающая слой тени
 * @property blurRadius радиус размытия краев тени
 * @property spreadRadius радиус распространения тени
 * @property offset смещение тени по оси X и Y
 * @property color цвет тени
 * @property fallbackElevation значение elevation, которое используется на API < 28
 */
@Immutable
data class ShadowLayer(
    val color: Color,
    val offset: DpOffset,
    val spreadRadius: Dp,
    val blurRadius: Dp,
    val fallbackElevation: Dp? = null,
)

/**
 * Модель, описывающая тень.
 * @property layers слои тени
 * @author Малышев Александр on 29.01.2025
 */
@Immutable
@JvmInline
value class ShadowAppearance(val layers: List<ShadowLayer> = emptyList()) {

    /**
     * Возвращает слой, который будет использоваться на API < 28
     */
    val fallbackLayer: ShadowLayer?
        get() = layers
            .maxByOrNull { it.fallbackElevation ?: 0.dp }
            ?.takeIf { it.fallbackElevation != null && it.fallbackElevation > 0.dp }
}

/**
 * Модификатор, добавляющий тень согласно [ShadowAppearance]
 * @param appearance модель, описывающая тень
 * @param shape форма тени
 */
@Stable
fun Modifier.shadow(
    appearance: ShadowAppearance,
    shape: Shape = RectangleShape,
): Modifier {
    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.P) {
        val layer = appearance.fallbackLayer ?: return this
        return elevationShadow(layer.fallbackElevation ?: 0.dp, shape, layer.color)
    }

    var result = this
    appearance.layers.forEach {
        result = result.shadowLayer(it, shape)
    }
    return result
}

private fun Modifier.elevationShadow(
    elevation: Dp,
    shape: Shape,
    color: Color,
): Modifier = this.shadow(elevation, shape, spotColor = color)

private fun Modifier.shadowLayer(
    layer: ShadowLayer,
    shape: Shape = RectangleShape,
) = this.drawWithCache {
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

private fun spreadScale(
    spread: Float,
    size: Float,
): Float = 1.0F + ((spread / size) * 2.0F)
