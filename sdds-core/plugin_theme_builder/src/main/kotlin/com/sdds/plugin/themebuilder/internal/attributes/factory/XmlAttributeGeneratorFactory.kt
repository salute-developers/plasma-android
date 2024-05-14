package com.sdds.plugin.themebuilder.internal.attributes.factory

import com.sdds.plugin.themebuilder.internal.attributes.generator.XmlAttributeGenerator
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import java.io.File

/**
 * Фабрика для [XmlAttributeGenerator]
 */
internal class XmlAttributeGeneratorFactory(
    private val xmlDocumentBuilderFactory: XmlResourcesDocumentBuilderFactory,
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
