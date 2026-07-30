package com.sdds.plugin.themebuilder.internal.universal.compose.mappers

import com.sdds.plugin.themebuilder.internal.universal.StringState
import com.sdds.plugin.themebuilder.internal.universal.Value
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeIntegerPropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeStateEnum

internal class IntegerPropertyMapper(
    stateEnum: ComposeStateEnum?,
) : PropertyMapper<String, ComposeIntegerPropertyMeta, StringState, Value>(stateEnum) {

    override fun getTokenRef(
        value: String,
        token: Value,
        meta: ComposeIntegerPropertyMeta,
        resSuffix: String,
    ) = value
}
