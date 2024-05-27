package com.sdds.plugin.themebuilder.internal.factory

import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewShapeAttributeGenerator
import java.io.File

/**
 * Фабрика для [ViewShapeAttributeGenerator]
 */
internal class ViewShapeAttributeGeneratorFactory(
    private val xmlDocumentBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val outputResDir: File,
    private val attrPrefix: String,
) {

    /**
     * Создает [ViewShapeAttributeGenerator]
     */
    fun create(): ViewShapeAttributeGenerator =
        ViewShapeAttributeGenerator(
            xmlDocumentBuilder = xmlDocumentBuilderFactory.create(),
            outputResDir = outputResDir,
            attrPrefix = attrPrefix,
        )
}
