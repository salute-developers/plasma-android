package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.utils.decapitalized

internal class TypographyPropertyMapper(
    stateEnum: StateEnum?,
    private val themeClassName: String,
) : PropertyMapper<String, TypographyPropertyMeta, StringState, Typography>(stateEnum) {

    override fun getTokenRef(
        value: String,
        token: Typography,
        meta: TypographyPropertyMeta,
        resSuffix: String,
    ): String {
        return "$themeClassName.typography.${value.toCamelCase().decapitalized()}"
    }
}
