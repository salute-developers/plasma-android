package com.sdds.plugin.themebuilder.internal.universal.view.mappers

import com.sdds.plugin.themebuilder.internal.universal.ComponentStyle
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalPropertyOwner
import com.sdds.plugin.themebuilder.internal.universal.view.PropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.view.ViewStyleResourceWriter
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import org.w3c.dom.Element

internal class ComponentStyleViewPropertyMapper(
    meta: PropertyMeta,
    private val resources: ViewStyleResourceWriter,
    private val styleNames: Map<String, String>,
) : DirectViewPropertyMapper(meta) {
    override fun mapDirect(element: Element, variation: String, props: UniversalPropertyOwner) {
        props.value<ComponentStyle<*>>(meta)?.let { style ->
            val overlay = meta.attrName.endsWith(OVERLAY_SUFFIX)
            val target = resolveStyleReference(style.value, separator = if (overlay) "" else ".")
            if (overlay) {
                resources.appendComponentOverlay(element, meta.attrName, target)
            } else {
                resources.appendComponentStyle(element, meta.attrName, target)
            }
        }
    }

    private fun resolveStyleReference(value: String, separator: String): String {
        val parts = value.split(".")
        val head = styleNames[parts.first()] ?: parts.first().techToCamelCase()
        return (listOf(head) + parts.drop(1).map { it.techToCamelCase() }).joinToString(separator)
    }

    private companion object {
        const val OVERLAY_SUFFIX = "Overlay"
    }
}
