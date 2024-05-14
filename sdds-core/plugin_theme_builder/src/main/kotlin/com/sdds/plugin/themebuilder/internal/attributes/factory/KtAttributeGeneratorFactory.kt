package com.sdds.plugin.themebuilder.internal.attributes.factory

import com.sdds.plugin.themebuilder.internal.attributes.generator.KtAttributeGenerator
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory

/**
 * Фабрика для [KtAttributeGenerator]
 */
internal class KtAttributeGeneratorFactory(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
) {

    /**
     * Создает [KtAttributeGenerator]
     */
    fun create() = KtAttributeGenerator(
        ktFileBuilderFactory = ktFileBuilderFactory,
        outputLocation = outputLocation,
    )
}
