package com.sdds.plugin.themebuilder.internal.universal.view.mappers

import com.sdds.plugin.themebuilder.internal.universal.VariationNode
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalPropertyOwner
import com.sdds.plugin.themebuilder.internal.universal.view.PropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.view.ViewProperty
import org.w3c.dom.Element

/**
 * Проецирует одно View-свойство из универсального конфига в XML/resources.
 *
 * Экземпляр mapper'а привязан к конкретному [meta]: это сохраняет стабильную
 * идентичность [ViewProperty], по которой writer группирует state-list ресурсы.
 */
internal interface ViewPropertyMapper {
    val meta: PropertyMeta

    fun map(
        element: Element,
        variation: String,
        variationNode: VariationNode<UniversalPropertyOwner>,
    )

    /**
     * Эмитит значение непосредственно из [props], без наследования и `view`-веток.
     * Используется для стилей цветовых состояний.
     */
    fun mapDirect(
        element: Element,
        variation: String,
        props: UniversalPropertyOwner,
    )
}

internal abstract class DirectViewPropertyMapper(
    final override val meta: PropertyMeta,
) : ViewPropertyMapper {

    final override fun map(
        element: Element,
        variation: String,
        variationNode: VariationNode<UniversalPropertyOwner>,
    ) = mapDirect(element, variation, variationNode.value.props)
}

internal inline fun <reified T> UniversalPropertyOwner.value(meta: PropertyMeta): T? =
    getValue(meta.type, meta.id) as? T
