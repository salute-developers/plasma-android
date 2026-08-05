package com.sdds.plugin.themebuilder.internal.universal.view.mappers

import com.sdds.plugin.themebuilder.internal.universal.Shape
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalPropertyOwner
import com.sdds.plugin.themebuilder.internal.universal.view.PropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.view.ViewStyleResourceWriter
import org.w3c.dom.Element

internal class ShapeViewPropertyMapper(
    meta: PropertyMeta,
    private val resources: ViewStyleResourceWriter,
) : DirectViewPropertyMapper(meta) {
    override fun mapDirect(element: Element, variation: String, props: UniversalPropertyOwner) {
        props.value<Shape>(meta)?.let {
            // `sd_shapeAppearanceAdjustment` в стиле один на все формы компонента, поэтому
            // печатает его только помеченное разметкой свойство-владелец.
            val adjustment = it.adjustment.takeIf { meta.shapeAdjustment }
            resources.appendShape(element, variation, it.value, adjustment, shapeAttrName(meta))
        }
    }

    private fun shapeAttrName(meta: PropertyMeta): String? {
        val simple = meta.attrName.removePrefix(RESOURCE_PREFIX)
        if (simple.equals(SHAPE_APPEARANCE, ignoreCase = true)) return null
        return simple.removeSuffix(SHAPE_APPEARANCE).takeIf { it != simple && it.isNotEmpty() }
    }

    private companion object {
        const val SHAPE_APPEARANCE = "ShapeAppearance"
        const val RESOURCE_PREFIX = "sd_"
    }
}
