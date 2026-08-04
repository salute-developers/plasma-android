package com.sdds.plugin.themebuilder.internal.universal.compose.mappers

import com.sdds.plugin.themebuilder.internal.universal.FloatState
import com.sdds.plugin.themebuilder.internal.universal.FloatValue
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeFloatPropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeStateEnum

internal class FloatPropertyMapper(
    stateEnum: ComposeStateEnum?,
) : PropertyMapper<Float, ComposeFloatPropertyMeta, FloatState, FloatValue>(stateEnum) {

    override fun getTokenRef(
        value: Float,
        token: FloatValue,
        meta: ComposeFloatPropertyMeta,
        resSuffix: String,
    ): String {
        return "${value}f"
    }
}
