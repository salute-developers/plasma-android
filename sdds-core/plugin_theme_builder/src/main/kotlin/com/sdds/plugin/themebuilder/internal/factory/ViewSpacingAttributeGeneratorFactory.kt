package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewSpacingAttributeGenerator
import java.io.File

/**
 * Фабрика для [ViewSpacingAttributeGenerator]
 */
internal class ViewSpacingAttributeGeneratorFactory(
    private val xmlDocumentBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val outputResDir: File,
    private val attrPrefix: String,
) {

    /**
     * Создает [ViewSpacingAttributeGenerator]
     */
    fun create(): ViewSpacingAttributeGenerator =
        ViewSpacingAttributeGenerator(
            xmlDocumentBuilder = xmlDocumentBuilderFactory.create(),
            outputResDir = outputResDir,
            attrPrefix = attrPrefix,
        )
}
