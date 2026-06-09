package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.components.base.Value

internal class ValuePropertyMapper(
    stateEnum: StateEnum?,
    private val importCollector: ImportCollector,
) : PropertyMapper<String, ValuePropertyMeta, StringState, Value>(stateEnum) {

    override fun map(meta: ValuePropertyMeta, tokenValue: Value, variationId: String): String {
        if (meta.values.isNotEmpty() && resolveEnumValue(tokenValue.value, meta.values) == null) {
            return ""
        }
        return super.map(meta, tokenValue, variationId)
    }

    override fun getTokenRef(
        value: String,
        token: Value,
        meta: ValuePropertyMeta,
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

    private fun resolveEnumValue(configValue: String, values: List<EnumValueInfo>): String? {
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
