package com.sdds.plugin.attributebuilder.internal.factory

import com.sdds.plugin.attributebuilder.AttributeBuilderTarget
import com.sdds.plugin.attributebuilder.internal.generator.AttributeGenerator

/**
 * Фабрика для [AttributeGenerator]
 */
internal class GeneratorFactory(
    private val target: AttributeBuilderTarget,
    private val xmlAttributeGeneratorFactory: XmlAttributeGeneratorFactory,
    private val ktAttributeGeneratorFactory: KtAttributeGeneratorFactory,
) {

    /**
     * Создает [AttributeGenerator]
     */
    fun createAttributeGenerator(): AttributeGenerator =
        AttributeGenerator(
            target = target,
            xmlAttributeGeneratorFactory = xmlAttributeGeneratorFactory,
            ktAttributeGeneratorFactory = ktAttributeGeneratorFactory,
        )
}
