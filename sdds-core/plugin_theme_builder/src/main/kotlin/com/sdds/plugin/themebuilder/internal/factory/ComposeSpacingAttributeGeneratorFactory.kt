package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeSpacingAttributeGenerator

/**
 * Фабрика для [ComposeSpacingAttributeGenerator]
 */
internal class ComposeSpacingAttributeGeneratorFactory(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val themeName: String,
    private val dimensionsConfig: DimensionsConfig,
    private val packageResolver: PackageResolver,
) {

    /**
     * Создает [ComposeSpacingAttributeGenerator]
     */
    fun create() = ComposeSpacingAttributeGenerator(
        ktFileBuilderFactory = ktFileBuilderFactory,
        outputLocation = outputLocation,
        themeName = themeName,
        dimensionsConfig = dimensionsConfig,
        packageResolver = packageResolver,
    )
}
