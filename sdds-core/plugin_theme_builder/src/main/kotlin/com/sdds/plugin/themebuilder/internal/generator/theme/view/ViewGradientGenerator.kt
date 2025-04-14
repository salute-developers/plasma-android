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
        val styleRef = gradientStyleGenerator.addStyle(
            nameSnakeCase = gradientData.nameSnakeCase,
            gradientLayers = gradientData.layers,
            gradientData.description,
        )

        if (gradientData.isTextGradient) {
            return styleRef
        }

        return gradientDrawableGenerator.addDrawable(
            drawableName = gradientData.nameSnakeCase,
            styleRef = styleRef,
        )
    }

    override fun generate() {
        gradientStyleGenerator.generate()
        gradientDrawableGenerator.generate()
    }
}
