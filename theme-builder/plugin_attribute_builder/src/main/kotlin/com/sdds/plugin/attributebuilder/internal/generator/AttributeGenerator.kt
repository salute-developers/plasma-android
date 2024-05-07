package com.sdds.plugin.attributebuilder.internal.generator

import com.sdds.plugin.attributebuilder.AttributeBuilderTarget
import com.sdds.plugin.attributebuilder.internal.data.AttributeData
import com.sdds.plugin.attributebuilder.internal.factory.KtAttributeGeneratorFactory
import com.sdds.plugin.attributebuilder.internal.factory.XmlAttributeGeneratorFactory
import com.sdds.plugin.core.token.ColorToken
import com.sdds.plugin.core.token.Token
import com.sdds.plugin.core.token.isLight
import com.sdds.plugin.core.utils.unsafeLazy
import org.gradle.kotlin.dsl.provideDelegate

/**
 * Генератор атрибутов.
 *
 * @property target целевой фреймворк, для которого будут сгенерированы атрибуты
 * @property xmlAttributeGeneratorFactory фабрика генератора xml атрибутов
 * @property ktAttributeGeneratorFactory фабрика генератора kt атрибутов
 */
internal class AttributeGenerator(
    private val target: AttributeBuilderTarget,
    private val xmlAttributeGeneratorFactory: XmlAttributeGeneratorFactory,
    private val ktAttributeGeneratorFactory: KtAttributeGeneratorFactory,
) {

    private val xmlAttributeGenerator by unsafeLazy { xmlAttributeGeneratorFactory.create() }
    private val ktAttributeGenerator by unsafeLazy { ktAttributeGeneratorFactory.create() }

    /**
     * Генерирует атрибуты на основе [tokens]
     *
     * @param tokens список токенов [Token]
     */
    fun generateFrom(tokens: List<Token>) {
        tokens.extractAttributeData()
            .also { attrData ->
                when (target) {
                    is AttributeBuilderTarget.View -> xmlAttributeGenerator.generate(
                        attributeData = attrData,
                        attrPrefix = target.attrPrefix,
                    )

                    is AttributeBuilderTarget.Compose -> ktAttributeGenerator.generate(
                        attributeData = attrData,
                    )
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
