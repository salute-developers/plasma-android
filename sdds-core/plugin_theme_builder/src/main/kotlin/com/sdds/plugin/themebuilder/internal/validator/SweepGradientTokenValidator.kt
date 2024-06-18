package com.sdds.plugin.themebuilder.internal.validator

import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.token.SweepGradientTokenValue

/**
 * Валидатор значений токенов sweep градиента [SweepGradientTokenValue]
 */
internal object SweepGradientTokenValidator : TokenValidator<SweepGradientTokenValue> {

    override fun validate(tokenValue: SweepGradientTokenValue, tokenName: String) {
        if (tokenValue.colors.size < 2) {
            throw ThemeBuilderException(
                "Gradient $tokenName has wrong colors number. " +
                    "Expected colors number should be 2 or more. " +
                    "Actual number is ${tokenValue.colors.size}",
            )
        }
        if (tokenValue.locations.size < 2) {
            throw ThemeBuilderException(
                "Gradient $tokenName has wrong locations number. " +
                    "Expected colors number should be 2 or more. " +
                    "Actual number is ${tokenValue.colors.size}",
            )
        }
        if (tokenValue.colors.size != tokenValue.locations.size) {
            throw ThemeBuilderException(
                "Gradient $tokenName has different number of colors and positions. " +
                    "Actual colors number: ${tokenValue.colors.size}, " +
                    "locations number: ${tokenValue.locations.size}",
            )
        }
        if (tokenValue.centerX !in 0f..1f) {
            throw ThemeBuilderException(
                "Gradient $tokenName has centerX: " +
                    "${tokenValue.centerX} that is outside the range 0..1",
            )
        }
        if (tokenValue.centerY !in 0f..1f) {
            throw ThemeBuilderException(
                "Gradient $tokenName has radius: " +
                    "${tokenValue.centerY} that is outside the range 0..1",
            )
        }
    }
}
