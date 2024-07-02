package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewGradientAttributeGenerator

/**
 * Фабрика для [ViewGradientAttributeGenerator]
 */
internal class ViewGradientAttributeGeneratorFactory(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val ktFileFromResourcesBuilderFactory: KtFileFromResourcesBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val themeName: String,
) {

    /**
     * Создает [ViewGradientAttributeGenerator]
     */
    fun create() = ViewGradientAttributeGenerator(
        ktFileBuilderFactory = ktFileBuilderFactory,
        ktFileFromResourcesBuilderFactory = ktFileFromResourcesBuilderFactory,
        outputLocation = outputLocation,
        themeName = themeName,
    )
}
