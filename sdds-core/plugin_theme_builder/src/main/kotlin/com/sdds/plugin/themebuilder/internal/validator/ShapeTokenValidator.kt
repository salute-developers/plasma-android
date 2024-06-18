package com.sdds.plugin.themebuilder.internal.validator

import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.token.RoundedShapeTokenValue

/**
 * Валидатор значений токенов форм [RoundedShapeTokenValue]
 */
internal object ShapeTokenValidator : TokenValidator<RoundedShapeTokenValue> {

    override fun validate(tokenValue: RoundedShapeTokenValue, tokenName: String) {
        if (tokenValue.cornerRadius < 0) {
            throw ThemeBuilderException(
                "Shape token $tokenName has invalid cornerRadius value: " +
                    "${tokenValue.cornerRadius}. Valid value should be >= 0.",
            )
        }
    }
}
