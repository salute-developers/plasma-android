package com.sdds.plugin.themebuilder.internal.universal.compose.mappers

import com.sdds.plugin.themebuilder.internal.universal.StringState
import com.sdds.plugin.themebuilder.internal.universal.Typography
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeStateEnum
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeTypographyPropertyMeta
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
