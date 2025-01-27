package com.sdds.uikit.shape

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.drawable.shapes.Shape
import androidx.annotation.StyleRes
import androidx.core.content.res.use
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

    private var layers: Array<ShadowLayer>? = null

    fun setShadowAppearance(context: Context, @StyleRes shadowAppearance: Int) {
        layers = context.obtainStyledAttributes(shadowAppearance, R.styleable.SdShadowAppearance).use { typedArray ->
            if (typedArray.hasValue(R.styleable.SdShadowAppearance_sd_shadowLayers)) {
                typedArray.obtainShadowLayers(context)
            } else {
                arrayOf(typedArray.obtainShadowAppearance())
            }
        }
    }

    fun render(canvas: Canvas, shape: Shape) {
        layers?.forEach { it.render(canvas, shape) }
    }

    private companion object {

        fun TypedArray.obtainShadowAppearance(): ShadowLayer {
            return ShadowLayer(
                getDimension(R.styleable.SdShadowAppearance_sd_shadowBlurRadius, 0f),
                getDimension(R.styleable.SdShadowAppearance_sd_shadowSpreadRadius, 0f),
                getDimension(R.styleable.SdShadowAppearance_sd_shadowOffsetX, 0f),
                getDimension(R.styleable.SdShadowAppearance_sd_shadowOffsetY, 0f),
                getColor(R.styleable.SdShadowAppearance_sd_shadowColor, Color.BLACK),
            )
        }

        fun TypedArray.obtainShadowLayers(context: Context): Array<ShadowLayer> {
            val layersReference = getResourceId(R.styleable.SdShadowAppearance_sd_shadowLayers, 0)
            return if (layersReference != 0) {
                resources.obtainTypedArray(layersReference).use { layersTypedArray ->
                    Array(layersTypedArray.length()) { index ->
                        ShadowLayer.obtain(context, layersTypedArray.getResourceId(index, 0))
                    }
                }
            } else {
                emptyArray()
            }
        }
    }
}

private class ShadowLayer(
    private val blurRadius: Float = 0f,
    private val spreadRadius: Float = 0f,
    private val offsetX: Float = 0f,
    private val offsetY: Float = 0f,
    private val color: Int = Color.BLACK,
) {

    private val paint by unsafeLazy {
        Paint()
            .configure(color = 0)
            .apply { setShadowLayer(blurRadius, offsetX, offsetY, this@ShadowLayer.color) }
    }

    fun render(canvas: Canvas, shape: Shape) {
        if (spreadRadius != 0f) {
            val shapeWidth = shape.width
            val shapeHeight = shape.height
            canvas.withScale(
                spreadScale(spreadRadius, shapeWidth),
                spreadScale(spreadRadius, shapeHeight),
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

        fun obtain(context: Context, @StyleRes layerAppearance: Int): ShadowLayer {
            return context.obtainStyledAttributes(layerAppearance, R.styleable.SdShadowLayer).use { typedArray ->
                ShadowLayer(
                    typedArray.getDimension(R.styleable.SdShadowLayer_sd_shadowBlurRadius, 0f),
                    typedArray.getDimension(R.styleable.SdShadowLayer_sd_shadowSpreadRadius, 0f),
                    typedArray.getDimension(R.styleable.SdShadowLayer_sd_shadowOffsetX, 0f),
                    typedArray.getDimension(R.styleable.SdShadowLayer_sd_shadowOffsetY, 0f),
                    typedArray.getColor(R.styleable.SdShadowLayer_sd_shadowColor, Color.BLACK),
                )
            }
        }
    }
}
