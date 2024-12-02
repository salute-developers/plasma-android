package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeColorAttributeGenerator

/**
 * Фабрика для [ComposeColorAttributeGenerator]
 */
internal class ComposeColorAttributeGeneratorFactory(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val themeName: String,
    private val packageResolver: PackageResolver,
) {

    /**
     * Создает [ComposeColorAttributeGenerator]
     */
    fun create() = ComposeColorAttributeGenerator(
        ktFileBuilderFactory = ktFileBuilderFactory,
        outputLocation = outputLocation,
        themeName = themeName,
        packageResolver = packageResolver,
    )
}
