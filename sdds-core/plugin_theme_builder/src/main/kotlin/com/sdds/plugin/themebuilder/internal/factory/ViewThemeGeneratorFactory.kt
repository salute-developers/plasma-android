package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewThemeGenerator
import java.io.File

/**
 * Фабрика [ViewThemeGenerator]
 */
internal class ViewThemeGeneratorFactory(
    private val xmlResourcesDocumentBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val outputResDir: File,
    private val parentThemeName: String,
) {

    /**
     * Создает [ViewThemeGenerator]
     */
    fun create(): ViewThemeGenerator =
        ViewThemeGenerator(
            xmlBuilderFactory = xmlResourcesDocumentBuilderFactory,
            outputResDir = outputResDir,
            parentThemeName = parentThemeName,
        )
}
