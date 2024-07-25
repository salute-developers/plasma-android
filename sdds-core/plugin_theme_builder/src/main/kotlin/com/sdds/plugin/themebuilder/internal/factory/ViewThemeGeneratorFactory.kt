package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.ViewThemeParent
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewThemeGenerator
import java.io.File

/**
 * Фабрика [ViewThemeGenerator]
 */
internal class ViewThemeGeneratorFactory(
    private val xmlResourcesDocumentBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val outputResDir: File,
    private val viewThemeParents: List<ViewThemeParent>,
    private val themeName: String,
    private val resPrefix: String,
) {

    /**
     * Создает [ViewThemeGenerator]
     */
    fun create(): ViewThemeGenerator =
        ViewThemeGenerator(
            xmlBuilderFactory = xmlResourcesDocumentBuilderFactory,
            outputResDir = outputResDir,
            viewThemeParents = viewThemeParents,
            themeName = themeName,
            resPrefix = resPrefix,
        )
}
