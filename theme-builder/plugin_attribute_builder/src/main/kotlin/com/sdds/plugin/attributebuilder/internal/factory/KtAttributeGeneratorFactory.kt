package com.sdds.plugin.attributebuilder.internal.factory

import com.sdds.plugin.attributebuilder.internal.generator.KtAttributeGenerator

/**
 * Фабрика для [KtAttributeGenerator]
 */
internal class KtAttributeGeneratorFactory {
    /**
     * Создает [KtAttributeGenerator]
     */
    fun create(): KtAttributeGenerator = KtAttributeGenerator()
}
