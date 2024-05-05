package com.sdds.plugin.attributebuilder.internal.factory

import com.sdds.plugin.attributebuilder.AttributeBuilderTarget
import com.sdds.plugin.attributebuilder.internal.generator.AttributeGenerator
import com.sdds.plugin.core.utils.unsafeLazy
import java.io.File

/**
 * Фабрика для [AttributeGenerator]
 */
internal class GeneratorFactory(
    private val target: AttributeBuilderTarget,
    private val outputResDir: File,
    private val outputDir: File,
) {

    private val xmlDocumentBuilderFactory by unsafeLazy { XmlDocumentBuilderFactory() }

    private val xmlAttributeGeneratorFactory by unsafeLazy {
        XmlAttributeGeneratorFactory(xmlDocumentBuilderFactory, outputResDir)
    }

    /**
     * Создает [AttributeGenerator]
     */
    fun createAttributeGenerator(): AttributeGenerator =
        AttributeGenerator(target, xmlAttributeGeneratorFactory)
}
