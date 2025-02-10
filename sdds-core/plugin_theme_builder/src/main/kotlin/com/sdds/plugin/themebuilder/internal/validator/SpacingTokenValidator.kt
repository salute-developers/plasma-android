package com.sdds.plugin.themebuilder.internal.validator

import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.token.SpacingTokenValue

/**
 * Валидатор значений токенов форм [SpacingTokenValue]
 */
internal object SpacingTokenValidator : TokenValidator<SpacingTokenValue> {

    override fun validate(tokenValue: SpacingTokenValue, tokenName: String) {
        if (tokenValue.value < 0) {
            throw ThemeBuilderException(
                "Spacing token $tokenName has invalid value: " +
                    "${tokenValue.value}. Valid value should be >= 0.",
            )
        }
    }
}
