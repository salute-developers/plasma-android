package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.components.base.Value

internal class ValuePropertyMapper(stateEnum: StateEnum?) :
    PropertyMapper<String, ValuePropertyMeta, StringState, Value>(stateEnum) {

    override fun getTokenRef(
        value: String,
        token: Value,
        meta: ValuePropertyMeta,
        resSuffix: String,
    ): String {
        val enumValue = meta.values.find { it.equals(value, ignoreCase = true) }
        val enumPrefix = if (meta.values.isNotEmpty()) "${meta.paramSimpleType}." else ""
        return "$enumPrefix$enumValue"
    }
}
