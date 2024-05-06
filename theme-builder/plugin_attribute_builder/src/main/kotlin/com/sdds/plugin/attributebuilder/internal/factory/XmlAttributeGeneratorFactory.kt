package com.sdds.plugin.attributebuilder.internal.factory

import com.sdds.plugin.attributebuilder.internal.generator.XmlAttributeGenerator
import java.io.File

/**
 * Фабрика для [XmlAttributeGenerator]
 */
internal class XmlAttributeGeneratorFactory(
    private val xmlDocumentBuilderFactory: XmlDocumentBuilderFactory,
    private val outputResDir: File,
) {

    /**
     * Создает [XmlAttributeGenerator]
     */
    fun create(): XmlAttributeGenerator =
        XmlAttributeGenerator(
            xmlDocumentBuilder = xmlDocumentBuilderFactory.create(),
            outputResDir = outputResDir,
        )
}
