package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.components.base.Value

internal class BooleanPropertyMapper(
    stateEnum: StateEnum?,
) : PropertyMapper<String, BooleanPropertyMeta, StringState, Value>(stateEnum) {

    override fun getTokenRef(
        value: String,
        token: Value,
        meta: BooleanPropertyMeta,
        resSuffix: String,
    ): String {
        return value
    }
}
