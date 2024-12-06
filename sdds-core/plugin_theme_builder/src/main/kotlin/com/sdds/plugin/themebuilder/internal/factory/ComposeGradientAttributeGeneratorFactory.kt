package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeGradientAttributeGenerator

/**
 * Фабрика для [ComposeGradientAttributeGenerator]
 */
internal class ComposeGradientAttributeGeneratorFactory(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val ktFileFromResourcesBuilderFactory: KtFileFromResourcesBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val themeName: String,
    private val packageResolver: PackageResolver,
) {

    /**
     * Создает [ComposeGradientAttributeGenerator]
     */
    fun create() = ComposeGradientAttributeGenerator(
        ktFileBuilderFactory = ktFileBuilderFactory,
        ktFileFromResourcesBuilderFactory = ktFileFromResourcesBuilderFactory,
        outputLocation = outputLocation,
        themeName = themeName,
        packageResolver = packageResolver,
    )
}
