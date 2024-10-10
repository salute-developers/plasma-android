package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewXmlGradientAttributeGenerator
import java.io.File

/**
 * Фабрика для [ViewXmlGradientAttributeGenerator]
 */
internal class ViewXmlGradientAttributeGeneratorFactory(
    private val xmlDocumentBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val outputResDir: File,
    private val attrPrefix: String,
) {

    /**
     * Создает [ViewXmlGradientAttributeGenerator]
     */
    fun create() = ViewXmlGradientAttributeGenerator(
        xmlDocumentBuilder = xmlDocumentBuilderFactory.create(),
        outputResDir = outputResDir,
        attrPrefix = attrPrefix,
    )
}
