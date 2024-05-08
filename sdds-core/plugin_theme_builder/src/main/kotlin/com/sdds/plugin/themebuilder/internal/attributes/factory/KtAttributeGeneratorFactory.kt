package com.sdds.plugin.themebuilder.internal.attributes.factory

import com.sdds.plugin.themebuilder.internal.attributes.generator.KtAttributeGenerator

/**
 * Фабрика для [KtAttributeGenerator]
 */
internal class KtAttributeGeneratorFactory {
    /**
     * Создает [KtAttributeGenerator]
     */
    fun create(): KtAttributeGenerator = KtAttributeGenerator()
}
