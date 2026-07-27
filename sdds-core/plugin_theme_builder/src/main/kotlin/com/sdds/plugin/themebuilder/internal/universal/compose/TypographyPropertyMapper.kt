package com.sdds.plugin.themebuilder.internal.universal.compose

import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.utils.decapitalized

internal class TypographyPropertyMapper(
    stateEnum: ComposeStateEnum?,
    private val themeClassName: String,
) : PropertyMapper<String, ComposeTypographyPropertyMeta, StringState, Typography>(stateEnum) {

    override fun getTokenRef(
        value: String,
        token: Typography,
        meta: ComposeTypographyPropertyMeta,
        resSuffix: String,
    ): String {
        return "$themeClassName.typography.${value.toCamelCase().decapitalized()}"
    }
}
