package com.sdds.plugin.themebuilder.internal.validator

import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException

/**
 * Валидатор значений цвета
 */
internal object ColorTokenValidator : TokenValidator<String> {

    internal val colorPaletteRegex =
        Regex("\\[\\D+\\.(\\D+)\\.([1-9][05]+)](\\[(0(\\.\\d+)?|1(\\.0*)?)])?")
    private val hexRegex = Regex("#(?:[0-9a-fA-F]{3}){1,2}")
    private val argbHexRegex = Regex("#[0-9a-fA-F]{8}")

    override fun validate(tokenValue: String, tokenName: String) {
        if (!hexRegex.matches(tokenValue) &&
            !argbHexRegex.matches(tokenValue) &&
            !colorPaletteRegex.matches(tokenValue)
        ) {
            throw ThemeBuilderException(
                "Color token $tokenName has invalid value: $tokenValue. " +
                    "Color value should be rgb/argb hex " +
                    "or color palette reference, for example [general.red.100][0.5]",
            )
        }
    }
}
