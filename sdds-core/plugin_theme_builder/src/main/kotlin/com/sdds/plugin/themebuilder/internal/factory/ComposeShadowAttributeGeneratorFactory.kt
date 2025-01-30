package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeShadowAttributeGenerator

/**
 * Фабрика для [ComposeShadowAttributeGenerator]
 */
internal class ComposeShadowAttributeGeneratorFactory(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val themeName: String,
    private val dimensionsConfig: DimensionsConfig,
    private val packageResolver: PackageResolver,
) {

    /**
     * Создает [ComposeShadowAttributeGenerator]
     */
    fun create() = ComposeShadowAttributeGenerator(
        ktFileBuilderFactory = ktFileBuilderFactory,
        outputLocation = outputLocation,
        themeName = themeName,
        dimensionsConfig = dimensionsConfig,
        packageResolver = packageResolver,
    )
}
