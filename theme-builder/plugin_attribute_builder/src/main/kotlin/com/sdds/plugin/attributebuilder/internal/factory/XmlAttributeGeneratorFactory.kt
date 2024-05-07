package com.sdds.plugin.attributebuilder.internal.factory

import com.sdds.plugin.attributebuilder.internal.generator.XmlAttributeGenerator
import java.io.File

/**
 * Фабрика для [XmlAttributeGenerator]
 */
internal class XmlAttributeGeneratorFactory(
    private val xmlDocumentBuilderFactory: XmlDocumentBuilderFactory,
) {

    /**
     * Создает [XmlAttributeGenerator]
     */
    fun create(outputResDir: File): XmlAttributeGenerator =
        XmlAttributeGenerator(
            xmlDocumentBuilder = xmlDocumentBuilderFactory.create(),
            outputResDir = outputResDir,
        )
}
