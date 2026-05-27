package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.FloatState
import com.sdds.plugin.themebuilder.internal.components.base.FloatValue

internal class FloatPropertyMapper(
    stateEnum: StateEnum?,
) : PropertyMapper<Float, FloatPropertyMeta, FloatState, FloatValue>(stateEnum) {

    override fun getTokenRef(
        value: Float,
        token: FloatValue,
        meta: FloatPropertyMeta,
        resSuffix: String,
    ): String {
        return "${value}f"
    }
}
