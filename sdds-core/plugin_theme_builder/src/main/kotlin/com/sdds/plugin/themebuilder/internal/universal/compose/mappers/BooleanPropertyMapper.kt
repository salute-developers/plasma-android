package com.sdds.plugin.themebuilder.internal.universal.compose.mappers

import com.sdds.plugin.themebuilder.internal.universal.StringState
import com.sdds.plugin.themebuilder.internal.universal.Value
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeBooleanPropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeStateEnum

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
