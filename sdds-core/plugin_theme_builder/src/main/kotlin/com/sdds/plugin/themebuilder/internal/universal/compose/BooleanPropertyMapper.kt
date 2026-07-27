package com.sdds.plugin.themebuilder.internal.universal.compose

import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.components.base.Value

internal class BooleanPropertyMapper(
    stateEnum: ComposeStateEnum?,
) : PropertyMapper<String, ComposeBooleanPropertyMeta, StringState, Value>(stateEnum) {

    override fun getTokenRef(
        value: String,
        token: Value,
        meta: ComposeBooleanPropertyMeta,
        resSuffix: String,
    ): String {
        return value
    }
}
