package com.sdds.plugin.themebuilder.internal.validator

import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.token.LinearGradientTokenValue

/**
 * Валидатор значений токенов линейного градиента [LinearGradientTokenValue]
 */
internal object LinearGradientTokenValidator : TokenValidator<LinearGradientTokenValue> {

    override fun validate(tokenValue: LinearGradientTokenValue, tokenName: String) {
        if (tokenValue.colors.size < 2) {
            throw ThemeBuilderException(
                "Gradient $tokenName has wrong colors number. Expected " +
                    "colors number should be 2 or more. Actual number is ${tokenValue.colors.size}",
            )
        }
        if (tokenValue.locations.size < 2) {
            throw ThemeBuilderException(
                "Gradient $tokenName has wrong locations number. Expected" +
                    " colors number should be 2 or more. Actual number is ${tokenValue.colors.size}",
            )
        }
        if (tokenValue.colors.size != tokenValue.locations.size) {
            throw ThemeBuilderException(
                "Gradient $tokenName has different number of colors and " +
                    "positions. Actual colors number: ${tokenValue.colors.size}, " +
                    "locations number: ${tokenValue.locations.size}",
            )
        }
        if (tokenValue.angle !in -360f..360f) {
            throw ThemeBuilderException(
                "Gradient $tokenName has angle: ${tokenValue.angle} that " +
                    "is outside the range -360..360",
            )
        }
    }
}
