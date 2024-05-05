package com.sdds.plugin.attributebuilder.internal.generator

import com.sdds.plugin.attributebuilder.AttributeBuilderTarget
import com.sdds.plugin.attributebuilder.internal.data.AttributeData
import com.sdds.plugin.attributebuilder.internal.factory.XmlAttributeGeneratorFactory
import com.sdds.plugin.core.token.ColorToken
import com.sdds.plugin.core.token.Token
import com.sdds.plugin.core.token.isLight
import com.sdds.plugin.core.utils.unsafeLazy

/**
 * Генератор атрибутов.
 *
 * @property target целевой фреймворк, для которого будут сгенерированы атрибуты
 * @property xmlAttributeGeneratorFactory фабрика генератор xml атрибутов
 */
internal class AttributeGenerator(
    private val target: AttributeBuilderTarget,
    private val xmlAttributeGeneratorFactory: XmlAttributeGeneratorFactory,
) {

    private val xmlAttributeGenerator by unsafeLazy { xmlAttributeGeneratorFactory.create() }

    /**
     * Генерирует атрибуты на основе [tokens]
     *
     * @param tokens список токенов
     */
    fun generateFrom(tokens: List<Token>) {
        tokens.extractAttributeData()
            .also { attrData ->
                when (target) {
                    is AttributeBuilderTarget.View -> xmlAttributeGenerator.generate(
                        attributeData = attrData,
                        attrPrefix = target.attrPrefix,
                    )

                    is AttributeBuilderTarget.Compose -> {}
                }
            }
    }

    private fun List<Token>.extractAttributeData(): AttributeData {
        val colors = mutableListOf<String>()

        this.forEach {
            when (it) {
                is ColorToken -> if (it.isLight) colors.add(it.displayName)
            }
        }

        return AttributeData(colors)
    }
}
