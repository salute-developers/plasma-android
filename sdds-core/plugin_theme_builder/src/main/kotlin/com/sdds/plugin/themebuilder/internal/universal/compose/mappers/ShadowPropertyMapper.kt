package com.sdds.plugin.themebuilder.internal.universal.compose.mappers

import com.sdds.plugin.themebuilder.internal.universal.Shadow
import com.sdds.plugin.themebuilder.internal.universal.StringState
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeShadowPropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeStateEnum
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
