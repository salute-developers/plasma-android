package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeShapeAttributeGenerator

/**
 * Фабрика для [ComposeShapeAttributeGenerator]
 */
internal class ComposeShapeAttributeGeneratorFactory(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val themeName: String,
) {

    /**
     * Создает [ComposeShapeAttributeGenerator]
     */
    fun create() = ComposeShapeAttributeGenerator(
        ktFileBuilderFactory = ktFileBuilderFactory,
        outputLocation = outputLocation,
        themeName = themeName,
    )
}
