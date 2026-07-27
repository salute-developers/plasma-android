package com.sdds.plugin.themebuilder.internal.universal.compose

import com.sdds.plugin.themebuilder.internal.components.base.Shadow
import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.utils.decapitalized

internal class ShadowPropertyMapper(
    stateEnum: ComposeStateEnum?,
    private val themeClassName: String,
) : PropertyMapper<String, ComposeShadowPropertyMeta, StringState, Shadow>(stateEnum) {

    override fun getTokenRef(
        value: String,
        token: Shadow,
        meta: ComposeShadowPropertyMeta,
        resSuffix: String,
    ): String {
        return "$themeClassName.shadows.${value.toCamelCase().decapitalized()}"
    }
}
