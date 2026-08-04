package com.sdds.plugin.themebuilder.internal.universal.view.mappers

import com.sdds.plugin.themebuilder.internal.universal.Value
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalPropertyOwner
import com.sdds.plugin.themebuilder.internal.universal.view.PropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.view.ViewStyleResourceWriter
import org.w3c.dom.Element

internal class BooleanViewPropertyMapper(
    meta: PropertyMeta,
    private val resources: ViewStyleResourceWriter,
) : DirectViewPropertyMapper(meta) {
    override fun mapDirect(element: Element, variation: String, props: UniversalPropertyOwner) {
        props.value<Value>(meta)?.let { resources.appendBoolean(element, meta.attrName, it.value.toBoolean()) }
    }
}
