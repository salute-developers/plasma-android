package com.sdds.plugin.themebuilder.internal.components

import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.asVariationTree

/**
 * Предоставляет список вариаций компонента с помощью функции [getVariationsInfo]
 *
 * @property componentName название компонента
 */
internal class VariationsInfoProvider(private val componentName: String) {

    private val variations = mutableListOf<String>()

    fun <C : Config<*>> getVariationsInfo(config: C): List<String> {
        variations.clear()
        val rootVariation = config.asVariationTree(componentName)
        getVariation(rootVariation)
        return variations
    }

    private fun getVariation(variation: VariationNode<*>, views: List<String> = emptyList()) {
        val isRootVariation = variation.parent == null
        val hasVariations = variation.children.isNotEmpty()
        val hasViewVariations = variation.value.view.isNotEmpty()

        if (isRootVariation && !hasVariations && !hasViewVariations) {
            variations.add(DEFAULT_VARIATION)
            return
        }

        val areViewVariationsTheOnlyVariations = isRootVariation && !hasVariations
        val viewVariations = if (hasViewVariations) {
            variation.value.view.keys.toList()
        } else {
            views
        }
        if (!isRootVariation || areViewVariationsTheOnlyVariations) {
            viewVariations.forEach {
                variations.add("${variation.id}.$it")
            }
        }
        if (viewVariations.isEmpty() && !isRootVariation) variations.add(variation.id)

        variation.children.forEach {
            getVariation(it, viewVariations)
        }
    }

    private companion object {
        const val DEFAULT_VARIATION = "Default"
    }
}

internal class VariationsInfoProviderFactory {
    fun create(componentName: String): VariationsInfoProvider =
        VariationsInfoProvider(componentName)
}
