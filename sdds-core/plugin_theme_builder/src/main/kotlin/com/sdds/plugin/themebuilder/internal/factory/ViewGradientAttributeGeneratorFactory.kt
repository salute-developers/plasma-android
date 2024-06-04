package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewGradientAttributeGenerator
import java.io.File

/**
 * Фабрика для [ViewGradientAttributeGenerator]
 */
internal class ViewGradientAttributeGeneratorFactory(
    private val xmlDocumentBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val outputResDir: File,
    private val attrPrefix: String,
) {

    /**
     * Создает [ViewGradientAttributeGenerator]
     */
    fun create(): ViewGradientAttributeGenerator =
        ViewGradientAttributeGenerator(
            xmlDocumentBuilder = xmlDocumentBuilderFactory.create(),
            outputResDir = outputResDir,
            attrPrefix = attrPrefix,
        )
}
