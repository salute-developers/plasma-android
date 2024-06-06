package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeTypographyAttributeGenerator

/**
 * Фабрика для [ComposeTypographyAttributeGenerator]
 */
internal class ComposeTypographyAttributeGeneratorFactory(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val themeName: String,
) {

    /**
     * Создает [ComposeTypographyAttributeGenerator]
     */
    fun create() = ComposeTypographyAttributeGenerator(
        ktFileBuilderFactory = ktFileBuilderFactory,
        outputLocation = outputLocation,
        themeName = themeName,
    )
}
