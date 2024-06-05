package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewTypographyAttributeGenerator
import java.io.File

/**
 * Фабрика для [ViewTypographyAttributeGenerator]
 */
internal class ViewTypographyAttributeGeneratorFactory(
    private val xmlDocumentBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val outputResDir: File,
    private val attrPrefix: String,
) {

    /**
     * Создает [ViewTypographyAttributeGenerator]
     */
    fun create(): ViewTypographyAttributeGenerator =
        ViewTypographyAttributeGenerator(
            xmlDocumentBuilder = xmlDocumentBuilderFactory.create(),
            outputResDir = outputResDir,
            attrPrefix = attrPrefix,
        )
}
