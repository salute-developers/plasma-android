package com.sdds.plugin.themebuilder.internal.universal.compose.mappers

import com.sdds.plugin.themebuilder.internal.universal.StringState
import com.sdds.plugin.themebuilder.internal.universal.Value
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeEnumValueInfo
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeStateEnum
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeValuePropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ImportCollector

internal class ValuePropertyMapper(
    stateEnum: ComposeStateEnum?,
    private val importCollector: ImportCollector,
) : PropertyMapper<String, ComposeValuePropertyMeta, StringState, Value>(stateEnum) {

    override fun map(meta: ComposeValuePropertyMeta, tokenValue: Value, variationId: String): String {
        if (meta.values.isNotEmpty() && resolveEnumValue(tokenValue.value, meta.values) == null) {
            return ""
        }
        return super.map(meta, tokenValue, variationId)
    }

    override fun getTokenRef(
        value: String,
        token: Value,
        meta: ComposeValuePropertyMeta,
        resSuffix: String,
    ): String {
        if (meta.values.isNotEmpty()) {
            val pkg = meta.paramQualifiedType.substringBeforeLast(".")
            importCollector.addImport(pkg, meta.paramSimpleType)
        }
        val enumValue = resolveEnumValue(value, meta.values)
        val enumPrefix = if (meta.values.isNotEmpty()) "${meta.paramSimpleType}." else ""
        return "$enumPrefix$enumValue"
    }

    private fun resolveEnumValue(configValue: String, values: List<ComposeEnumValueInfo>): String? {
        if (configValue.equals("default", ignoreCase = true) && values.isNotEmpty()) {
            return values.first().name
        }
        values.find { it.configName.equals(configValue, ignoreCase = true) }?.let { return it.name }
        val normalized = configValue.replace("-", "").lowercase()
        return values
            .filter { normalized.endsWith(it.name.lowercase()) }
            .maxByOrNull { it.name.length }
            ?.name
    }
}
