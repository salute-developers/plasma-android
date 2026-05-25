package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.StringState

internal class ComponentStyleMapper(
    stateEnum: StateEnum?,
    private val importCollector: ImportCollector,
    private val themeStylesPackage: String,
) : PropertyMapper<String, ComponentPropertyMeta, StringState, ComponentStyle<*>>(stateEnum) {

    override fun getTokenRef(
        value: String,
        token: ComponentStyle<*>,
        meta: ComponentPropertyMeta,
        resSuffix: String,
    ): String {
        val styleRefParts = value.split(".")
        val objectName = styleRefParts.first().toCamelCase()
        val hasNoVariations = styleRefParts.size == 1
        val extensions = if (hasNoVariations) {
            listOf("Default")
        } else {
            styleRefParts.subList(1, styleRefParts.size).map { it.toCamelCase() }
        }
        val componentStylesPackage = "$themeStylesPackage.${meta.id.removeSuffix("Style").lowercase()}"

        importCollector.addImport(componentStylesPackage, objectName)
        extensions.forEach {
            importCollector.addImport(componentStylesPackage, it)
        }

        return "$objectName.${extensions.joinToString(separator = ".")}.style()"
    }
}
