package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeTypographyAttributeGenerator

/**
 * Фабрика для [ComposeTypographyAttributeGenerator]
 */
internal class ComposeTypographyAttributeGeneratorFactory(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val ktFileFromResourcesBuilderFactory: KtFileFromResourcesBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val themeName: String,
    private val dimensionsConfig: DimensionsConfig,
) {

    /**
     * Создает [ComposeTypographyAttributeGenerator]
     */
    fun create() = ComposeTypographyAttributeGenerator(
        ktFileBuilderFactory = ktFileBuilderFactory,
        ktFileFromResourcesBuilderFactory = ktFileFromResourcesBuilderFactory,
        outputLocation = outputLocation,
        themeName = themeName,
        dimensionsConfig = dimensionsConfig,
    )
}
