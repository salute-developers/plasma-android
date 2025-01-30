package com.sdds.uikit.shape

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.drawable.shapes.Shape
import androidx.core.graphics.withScale
import com.sdds.uikit.R
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.internal.base.unsafeLazy

/**
 * Делегат для отрисовки теней. Поддерживает многослойные тени.
 * Параметры тени берутся из стилей [R.styleable.SdShadowAppearance] и [R.styleable.SdShadowLayer].
 * @author Малышев Александр on 27.01.2025
 */
internal class ShadowRenderer {

    private var shadowLayerRenderers: Array<ShadowLayerRenderer>? = null

    fun setShadowModel(shadowModel: ShadowModel) {
        this.shadowLayerRenderers = Array(shadowModel.layers.size) {
            ShadowLayerRenderer(shadowModel.layers[it])
        }
    }

    fun render(canvas: Canvas, shape: Shape) {
        shadowLayerRenderers?.forEach { it.render(canvas, shape) }
    }
}

private class ShadowLayerRenderer(
    private val layer: ShadowLayer,
) {

    private val paint by unsafeLazy {
        Paint()
            .configure(color = 0)
            .apply {
                setShadowLayer(
                    layer.blurRadius,
                    layer.offsetX,
                    layer.offsetY,
                    layer.color,
                )
            }
    }

    fun render(canvas: Canvas, shape: Shape) {
        if (layer.spreadRadius != 0f) {
            val shapeWidth = shape.width
            val shapeHeight = shape.height
            canvas.withScale(
                spreadScale(layer.spreadRadius, shapeWidth),
                spreadScale(layer.spreadRadius, shapeHeight),
                shapeWidth / 2,
                shapeHeight / 2,
            ) {
                shape.draw(canvas, paint)
            }
        } else {
            shape.draw(canvas, paint)
        }
    }

    companion object {

        private fun spreadScale(
            spread: Float,
            size: Float,
        ): Float = 1.0F + ((spread / size) * 2.0F)
    }
}
