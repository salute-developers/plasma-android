package com.sdds.plugin.themebuilder.internal.universal.view

import com.sdds.plugin.themebuilder.internal.universal.VariationNode
import com.sdds.plugin.themebuilder.internal.universal.asVariationTree
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalComponentConfig
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalPropertyOwner
import com.sdds.plugin.themebuilder.internal.utils.capitalized
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import org.w3c.dom.Element

/**
 * Обходит дерево вариаций View-компонента и делегирует содержимое стилей вызывающей
 * стороне. По роли соответствует
 * Compose-[ComposeVariationTreeProcessor][com.sdds.plugin.themebuilder.internal.universal.compose.ComposeVariationTreeProcessor]:
 * процессор отвечает за структуру дерева и `view`-развилки, а
 * [UniversalViewVariationGenerator] — за проекцию меты в XML.
 */
internal class ViewVariationTreeProcessor(
    private val resources: ViewStyleResourceWriter,
) {

    internal data class Emitters(
        val style: (
            variation: String,
            styleElement: Element,
            variationNode: VariationNode<UniversalPropertyOwner>,
        ) -> Unit,
        val colorStateStyle: (
            variation: String,
            styleElement: Element,
            props: UniversalPropertyOwner,
        ) -> Unit,
        val overlay: (
            variation: String,
            styleElement: Element,
            variationNode: VariationNode<UniversalPropertyOwner>,
        ) -> Unit,
    )

    internal fun process(
        config: UniversalComponentConfig,
        emitters: Emitters,
    ): Unit = with(resources) {
        val rootVariation = config.asVariationTree("")
        document.baseStyle(withOverlay = rootVariation.children.isEmpty()) {
            emitters.style("", this, rootVariation)
        }
        if (rootVariation.children.isEmpty()) createColorStateStyles(rootVariation, emitters)
        createVariations(rootVariation.children, emitters)
    }

    private fun createColorStateStyles(
        variationNode: VariationNode<UniversalPropertyOwner>,
        emitters: Emitters,
    ): Unit = with(resources) {
        variationNode.mergedViews(true).mapKeys {
            getColorState(it.key) ?: registerColorState(it.key)
        }.forEach { (colorStateAttr, viewVariation) ->
            val variationStyleName = if (variationNode.name.isNotEmpty()) {
                "${variationNode.camelCaseName()}.${colorStateAttr.name.capitalized()}"
            } else {
                colorStateAttr.name.capitalized()
            }
            document.variationStyle(
                variationStyleName,
                rawVariationName = "${variationNode.id}.${colorStateAttr.name}",
                withOverlay = true,
            ) {
                if (variationNode.parent != null) {
                    emitters.colorStateStyle(
                        variationNode.id.techToSnakeCase(),
                        this,
                        viewVariation.props,
                    )
                }
                colorStateAttribute(colorStateAttr.enum)
            }
        }
    }

    private fun createVariations(
        variations: Set<VariationNode<UniversalPropertyOwner>>,
        emitters: Emitters,
    ): Unit = with(resources) {
        if (variations.isEmpty()) return
        variations.forEach { variationNode ->
            document.variationStyle(
                variationNode.camelCaseName(),
                rawVariationName = variationNode.id,
                withOverlay = true,
                overlayContent = {
                    emitters.overlay(variationNode.id.techToSnakeCase(), this, variationNode)
                },
            ) {
                emitters.style(variationNode.id.techToSnakeCase(), this, variationNode)
            }
            createColorStateStyles(variationNode, emitters)
            createVariations(variationNode.children, emitters)
        }
    }
}

internal fun VariationNode<*>.camelCaseName(separator: String = "."): String =
    this.id.split(".").joinToString(separator = separator) { it.techToCamelCase() }
