package com.sdds.plugin.themebuilder.internal.universal.compose

import com.sdds.plugin.themebuilder.internal.components.base.FloatState
import com.sdds.plugin.themebuilder.internal.components.base.FloatValue

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
