package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.Shadow
import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.utils.decapitalized

internal class ShadowPropertyMapper(
    stateEnum: StateEnum?,
    private val themeClassName: String,
) : PropertyMapper<String, ShadowPropertyMeta, StringState, Shadow>(stateEnum) {

    override fun getTokenRef(
        value: String,
        token: Shadow,
        meta: ShadowPropertyMeta,
        resSuffix: String,
    ): String {
        return "$themeClassName.shadows.${value.toCamelCase().decapitalized()}"
    }
}
