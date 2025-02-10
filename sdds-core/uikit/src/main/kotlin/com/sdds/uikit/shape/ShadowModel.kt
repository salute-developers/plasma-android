package com.sdds.uikit.shape

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Color
import androidx.annotation.StyleRes
import androidx.core.content.res.use
import com.sdds.uikit.R

/**
 * Модель, описывающая тень.
 * @property layers слои тени
 * @author Малышев Александр on 29.01.2025
 */
@JvmInline
value class ShadowModel(
    val layers: Array<ShadowLayer>,
) {

    /**
     * Возвращает значение elevation, которое используется на API < 28
     */
    val fallbackElevation: Float?
        get() = layers.mapNotNull { it.fallbackElevation }
            .maxOfOrNull { it }

    companion object {

        /**
         * Возвращает [ShapeModel] из стиля по идентификатору [shadowAppearanceResId]
         * @param context контекст
         * @param shadowAppearanceResId идентификатор стиля тени
         * @return [ShapeModel]
         */
        fun obtain(context: Context, @StyleRes shadowAppearanceResId: Int): ShadowModel =
            context.obtainStyledAttributes(shadowAppearanceResId, R.styleable.SdShadowAppearance)
                .use { typedArray ->
                    if (typedArray.hasValue(R.styleable.SdShadowAppearance_sd_shadowLayers)) {
                        typedArray.obtainShadowLayers(context)
                    } else {
                        arrayOf(typedArray.obtainShadowAppearance())
                    }
                }
                .let { ShadowModel(it) }

        private fun TypedArray.obtainShadowAppearance(): ShadowLayer {
            return ShadowLayer(
                getDimension(R.styleable.SdShadowAppearance_sd_shadowBlurRadius, 0f),
                getDimension(R.styleable.SdShadowAppearance_sd_shadowSpreadRadius, 0f),
                getDimension(R.styleable.SdShadowAppearance_sd_shadowOffsetX, 0f),
                getDimension(R.styleable.SdShadowAppearance_sd_shadowOffsetY, 0f),
                getColor(R.styleable.SdShadowAppearance_sd_shadowColor, Color.BLACK),
                getDimension(R.styleable.SdShadowAppearance_sd_shadowFallbackElevation, 0f),
            )
        }

        private fun TypedArray.obtainShadowLayers(context: Context): Array<ShadowLayer> {
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

/**
 * Модель описывающая стиль слоя тени
 * @property blurRadius радиус размытия краев тени
 * @property spreadRadius радиус распространения тени
 * @property offsetX смещение по оси X
 * @property offsetY смещение по оси Y
 * @property color цвет тени
 * @property fallbackElevation значение elevation, которое используется на API < 28
 */
data class ShadowLayer(
    val blurRadius: Float = 0f,
    val spreadRadius: Float = 0f,
    val offsetX: Float = 0f,
    val offsetY: Float = 0f,
    val color: Int = Color.BLACK,
    val fallbackElevation: Float? = null,
) {

    companion object {

        /**
         * Возвращает [ShadowLayer] из стиля по идентификатору [layerAppearance]
         * @param context контекст
         * @param layerAppearance идентификатор стиля слоя тени
         * @return [ShadowLayer]
         */
        fun obtain(context: Context, @StyleRes layerAppearance: Int): ShadowLayer {
            return context.obtainStyledAttributes(layerAppearance, R.styleable.SdShadowLayer).use { typedArray ->
                ShadowLayer(
                    typedArray.getDimension(R.styleable.SdShadowLayer_sd_shadowBlurRadius, 0f),
                    typedArray.getDimension(R.styleable.SdShadowLayer_sd_shadowSpreadRadius, 0f),
                    typedArray.getDimension(R.styleable.SdShadowLayer_sd_shadowOffsetX, 0f),
                    typedArray.getDimension(R.styleable.SdShadowLayer_sd_shadowOffsetY, 0f),
                    typedArray.getColor(R.styleable.SdShadowLayer_sd_shadowColor, Color.BLACK),
                    typedArray.getDimension(R.styleable.SdShadowLayer_sd_shadowFallbackElevation, 0f)
                        .takeIf { it > 0 },
                )
            }
        }
    }
}
