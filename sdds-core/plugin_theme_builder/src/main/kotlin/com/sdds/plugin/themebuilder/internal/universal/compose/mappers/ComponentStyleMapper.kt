package com.sdds.plugin.themebuilder.internal.universal.compose.mappers

import com.sdds.plugin.themebuilder.internal.universal.ComponentStyle
import com.sdds.plugin.themebuilder.internal.universal.StringState
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeComponentPropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeStateEnum
import com.sdds.plugin.themebuilder.internal.universal.compose.ImportCollector

internal class ComponentStyleMapper(
    stateEnum: ComposeStateEnum?,
    private val importCollector: ImportCollector,
    private val themeStylesPackage: String,
    private val packageLookup: Map<String, String> = emptyMap(),
) : PropertyMapper<String, ComposeComponentPropertyMeta, StringState, ComponentStyle<*>>(stateEnum) {

    override fun getTokenRef(
        value: String,
        token: ComponentStyle<*>,
        meta: ComposeComponentPropertyMeta,
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
        val normalizedObjectName = objectName.lowercase()
        val defaultPackageName = objectName
            .split(Regex("(?=[A-Z])"))
            .filter { it.isNotEmpty() }
            .last()
            .lowercase()
        val resolvedPackageName = packageLookup[normalizedObjectName]
            ?: packageLookup.entries
                .filter { (key, _) -> normalizedObjectName.contains(key) }
                .maxWithOrNull(
                    compareBy({ (key, _) -> key.length }, { (key, _) -> normalizedObjectName.indexOf(key) }),
                )
                ?.value
            ?: defaultPackageName
        val componentStylesPackage = "$themeStylesPackage.$resolvedPackageName"

        importCollector.addImport(componentStylesPackage, objectName)
        extensions.forEach {
            importCollector.addImport(componentStylesPackage, it)
        }

        return "$objectName.${extensions.joinToString(separator = ".")}.style()"
    }
}
