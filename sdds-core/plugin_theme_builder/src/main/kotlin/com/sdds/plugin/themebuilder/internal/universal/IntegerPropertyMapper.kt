package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.components.base.Value

internal class IntegerPropertyMapper(
    stateEnum: StateEnum?,
) : PropertyMapper<String, IntegerPropertyMeta, StringState, Value>(stateEnum) {

    override fun getTokenRef(
        value: String,
        token: Value,
        meta: IntegerPropertyMeta,
        resSuffix: String,
    ) = value
}
