package com.sdds.plugin.themebuilder.internal.validator

import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.token.TypographyTokenValue

/**
 * Валидатор значений токенов типографики [TypographyTokenValue]
 */
internal object TypographyTokenValidator : TokenValidator<TypographyTokenValue> {

    override fun validate(tokenValue: TypographyTokenValue, tokenName: String) {
        if (!tokenValue.fontFamilyRef.startsWith("fontFamily")) {
            throw ThemeBuilderException(
                "Typography token $tokenName has invalid fontFamilyRef " +
                    "value: ${tokenValue.fontFamilyRef}. " +
                    "Valid value must start with 'fontFamily' prefix.",
            )
        }
        if (!(tokenValue.fontWeight in 100..1000 && tokenValue.fontWeight % 100 == 0)) {
            throw ThemeBuilderException(
                "Typography token $tokenName has invalid fontWeight " +
                    "value: ${tokenValue.fontWeight}. " +
                    "Valid value must be in range 100..1000 with step 100.",
            )
        }
        if (tokenValue.fontStyle != "normal" && tokenValue.fontStyle != "italic") {
            throw ThemeBuilderException(
                "Typography token $tokenName has invalid fontStyle " +
                    "value: ${tokenValue.fontStyle}. Valid values are 'normal' or 'italic'.",
            )
        }
        if (tokenValue.textSize < 0) {
            throw ThemeBuilderException(
                "Typography token $tokenName has invalid textSize " +
                    "value: ${tokenValue.textSize}. Valid value should be > 0.",
            )
        }
        if (tokenValue.lineHeight < 0) {
            throw ThemeBuilderException(
                "Typography token $tokenName has invalid lineHeight " +
                    "value: ${tokenValue.lineHeight}. Valid value should be > 0.",
            )
        }
    }
}
