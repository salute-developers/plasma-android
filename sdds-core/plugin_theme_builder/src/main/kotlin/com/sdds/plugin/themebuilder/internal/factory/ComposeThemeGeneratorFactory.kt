package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeThemeGenerator

/**
 * Фабрика [ComposeThemeGenerator]
 */
internal class ComposeThemeGeneratorFactory {

    /**
     * Создает [ComposeThemeGenerator]
     */
    fun create(): ComposeThemeGenerator = ComposeThemeGenerator()
}
