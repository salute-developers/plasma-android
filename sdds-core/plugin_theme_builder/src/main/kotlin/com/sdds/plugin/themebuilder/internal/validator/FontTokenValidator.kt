package com.sdds.plugin.themebuilder.internal.validator

import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.token.FontTokenValue

/**
 * Валидатор значений токенов шрифтов [FontTokenValue]
 */
internal object FontTokenValidator : TokenValidator<FontTokenValue> {
    override fun validate(tokenValue: FontTokenValue, tokenName: String) {
        if (tokenValue.fonts.isEmpty()) {
            throw ThemeBuilderException("Font $tokenName must have non-empty font list.")
        }
        if (tokenValue.name.isEmpty()) {
            throw ThemeBuilderException("Font $tokenName must have non-empty name.")
        }
        tokenValue.fonts.forEach {
            if (it.fontStyle != "normal" && it.fontStyle != "italic") {
                throw ThemeBuilderException(
                    "Font $tokenName has invalid fontStyle value: " +
                        "${it.fontStyle}. Valid values are 'normal' or 'italic'.",
                )
            }
            if (!(it.fontWeight in 100..1000 && it.fontWeight % 100 == 0)) {
                throw ThemeBuilderException(
                    "Font $tokenName has invalid fontWeight value: " +
                        "${it.fontWeight}. Valid value must be in range 100..1000 with step 100.",
                )
            }
            if (!it.link.endsWith(".otf") && !it.link.endsWith(".ttf")) {
                throw ThemeBuilderException(
                    "Font $tokenName has invalid url: ${it.link}. " +
                        "Valid url must end with '.otf' or '.ttf'.",
                )
            }
        }
        checkWeightAndStyleDuplicates(tokenValue, tokenName)
    }

    private fun checkWeightAndStyleDuplicates(tokenValue: FontTokenValue, tokenName: String) {
        val duplicates = tokenValue.fonts
            .groupBy { it.fontWeight to it.fontStyle }
            .filterValues { it.size > 1 }
        if (duplicates.isEmpty()) return

        val details = duplicates.entries.joinToString("; ") { (weightStyle, fonts) ->
            val (weight, style) = weightStyle
            val fileNames = fonts.joinToString(", ") { it.link.substringAfterLast('/') }
            "$weight/$style: $fileNames"
        }
        throw ThemeBuilderException(
            "Font $tokenName (family '${tokenValue.name}') has fontWeight/fontStyle duplicates: $details",
        )
    }
}
