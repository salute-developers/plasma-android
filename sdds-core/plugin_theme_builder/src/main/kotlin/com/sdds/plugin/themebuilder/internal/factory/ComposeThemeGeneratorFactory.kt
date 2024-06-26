package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeThemeGenerator

/**
 * Фабрика [ComposeThemeGenerator]
 */
internal class ComposeThemeGeneratorFactory(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val themeName: String,
) {

    /**
     * Создает [ComposeThemeGenerator]
     */
    fun create(): ComposeThemeGenerator = ComposeThemeGenerator(
        ktFileBuilderFactory = ktFileBuilderFactory,
        outputLocation = outputLocation,
        themeName = themeName,
    )
}
