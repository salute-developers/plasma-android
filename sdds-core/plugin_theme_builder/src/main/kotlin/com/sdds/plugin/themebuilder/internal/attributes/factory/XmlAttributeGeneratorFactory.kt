package com.sdds.plugin.themebuilder.internal.attributes.factory

import com.sdds.plugin.themebuilder.internal.attributes.generator.XmlAttributeGenerator
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import java.io.File

/**
 * Фабрика для [XmlAttributeGenerator]
 */
internal class XmlAttributeGeneratorFactory(
    private val xmlDocumentBuilderFactory: XmlResourcesDocumentBuilderFactory,
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
