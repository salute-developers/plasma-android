package com.sdds.plugin.themebuilder.internal.universal.view.mappers

import com.sdds.plugin.themebuilder.internal.universal.Value
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalPropertyOwner
import com.sdds.plugin.themebuilder.internal.universal.view.PropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.view.ViewStyleResourceWriter
import org.w3c.dom.Element

internal class ValueViewPropertyMapper(
    meta: PropertyMeta,
    private val resources: ViewStyleResourceWriter,
    private val componentName: String,
) : DirectViewPropertyMapper(meta) {
    override fun mapDirect(element: Element, variation: String, props: UniversalPropertyOwner) {
        props.value<Value>(meta)?.let {
            resources.appendValue(element, meta.attrName, enumName(it.value))
        }
    }

    private fun enumName(configValue: String): String {
        meta.values.firstOrNull { it.configName == configValue }?.let { return it.name }
        if (meta.values.isEmpty()) return configValue
        if (meta.defaultValue.isNotEmpty()) return meta.defaultValue
        error(
            "Компонент \"$componentName\": значение \"$configValue\" свойства \"${meta.id}\" " +
                "не совпадает ни с одним значением enum-атрибута \"${meta.attrName}\" " +
                "(${meta.values.joinToString { it.configName }}) и у атрибута не задан sdds:api_default",
        )
    }
}
