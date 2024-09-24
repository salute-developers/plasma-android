package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult

/**
 * Генератор градиентов для view
 *
 * @property gradientStyleGenerator генератор стилей градиентов
 * @property gradientDrawableGenerator генератор drawable градиентов
 */
internal class ViewGradientGenerator(
    private val gradientStyleGenerator: GradientStyleGenerator,
    private val gradientDrawableGenerator: GradientDrawableGenerator,
) : SimpleBaseGenerator {

    /**
     * Добавляет градиент, создавая стиль для каждого слоя градиента и drawable, если это не текстовый градиент.
     * Для многослойных градиентов генерируется layer-list drawable
     *
     * @param gradientData данные о градиенте
     * @return ссылка на ресурс - стиль либо drawable
     */
    fun addGradient(gradientData: GradientTokenResult.ViewTokenData.Gradient): String {
        val isSingleLayer = gradientData.layers.size == 1
        val styleRefs = gradientData
            .layers
            .mapIndexed { layer, gradientLayer ->
                val layerSuffix = if (!isSingleLayer) "_layer_$layer" else ""
                val descriptionSuffix = if (!isSingleLayer) " Слой $layer" else ""
                gradientStyleGenerator.addStyle(
                    nameSnakeCase = gradientData.nameSnakeCase + layerSuffix,
                    gradientParameters = gradientLayer.getGradientParameters(),
                    description = gradientData.description + descriptionSuffix,
                )
            }

        if (gradientData.isTextGradient) {
            return styleRefs.first()
        }

        return if (isSingleLayer) {
            gradientDrawableGenerator.addDrawable(
                drawableName = gradientData.nameSnakeCase,
                styleRef = styleRefs.first(),
            )
        } else {
            val drawableRefs = styleRefs.mapIndexed { index: Int, styleRef: String ->
                gradientDrawableGenerator.addDrawable(
                    drawableName = "${gradientData.nameSnakeCase}_layer_$index",
                    styleRef = styleRef,
                )
            }
            gradientDrawableGenerator.addLayerListDrawable(
                drawableName = gradientData.nameSnakeCase,
                drawableRefs = drawableRefs,
            )
        }
    }

    override fun generate() {
        gradientStyleGenerator.generate()
        gradientDrawableGenerator.generate()
    }

    private fun GradientTokenResult.ViewTokenData.Gradient.Layer.getGradientParameters(): Map<String, String> {
        return when (this) {
            is GradientTokenResult.ViewTokenData.Gradient.Layer.Linear -> mapOf(
                "sd_gradientType" to "linear",
                "sd_angle" to this.angle,
                "sd_colors" to this.colors,
                "sd_stops" to this.stops,
            )

            is GradientTokenResult.ViewTokenData.Gradient.Layer.Radial -> mapOf(
                "sd_gradientType" to "radial",
                "sd_radius" to this.radius,
                "sd_centerX" to this.centerX,
                "sd_centerY" to this.centerY,
                "sd_colors" to this.colors,
                "sd_stops" to this.stops,
            )

            is GradientTokenResult.ViewTokenData.Gradient.Layer.Sweep -> mapOf(
                "sd_gradientType" to "sweep",
                "sd_centerX" to this.centerX,
                "sd_centerY" to this.centerY,
                "sd_colors" to this.colors,
                "sd_stops" to this.stops,
            )

            is GradientTokenResult.ViewTokenData.Gradient.Layer.Solid -> mapOf(
                "sd_gradientType" to "solid",
                "sd_colors" to this.colors,
            )
        }
    }
}
