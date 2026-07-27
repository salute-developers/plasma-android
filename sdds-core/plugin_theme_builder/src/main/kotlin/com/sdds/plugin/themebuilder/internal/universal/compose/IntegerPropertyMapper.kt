package com.sdds.plugin.themebuilder.internal.universal.compose

import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.components.base.Value

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
