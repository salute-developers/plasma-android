package com.sdds.plugin.themebuilder.internal.validator

import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.token.TypographyTokenValue
import org.junit.Assert.assertThrows
import org.junit.Test

/**
 * Unit-тесты [TypographyTokenValidator]
 */
class TypographyTokenValidatorTest {

    @Test
    fun `TypographyTokenValidator должен успешно проводить проверки`() {
        validData.forEach {
            TypographyTokenValidator.validate(it, TOKEN_NAME)
        }
    }

    @Test
    fun `TypographyTokenValidator должен выбрасывать исключение`() {
        invalidData.forEach {
            assertThrows(ThemeBuilderException::class.java) {
                TypographyTokenValidator.validate(it, TOKEN_NAME)
            }
        }
    }

    private companion object {
        const val TOKEN_NAME = "token_name"

        val validData = listOf(
            TypographyTokenValue(
                fontFamilyRef = "fontFamily.text",
                fontWeight = 200,
                fontStyle = "italic",
                textSize = 12f,
                lineHeight = 12f,
                letterSpacing = 0.02f,
            ),
            TypographyTokenValue(
                fontFamilyRef = "fontFamily.sans",
                fontWeight = 100,
                fontStyle = "normal",
                textSize = 0f,
                lineHeight = 0f,
                letterSpacing = -0.02f,
            ),
            TypographyTokenValue(
                fontFamilyRef = "fontFamily.sans",
                fontWeight = 1000,
                fontStyle = "normal",
                textSize = 1f,
                lineHeight = 2f,
                letterSpacing = -0.02f,
            ),
        )

        val invalidData = listOf(
            TypographyTokenValue(
                fontFamilyRef = "sans",
                fontWeight = 1000,
                fontStyle = "normal",
                textSize = 1f,
                lineHeight = 2f,
                letterSpacing = -0.02f,
            ),
            TypographyTokenValue(
                fontFamilyRef = "fontFamily.sans",
                fontWeight = 150,
                fontStyle = "normal",
                textSize = 1f,
                lineHeight = 2f,
                letterSpacing = -0.02f,
            ),
            TypographyTokenValue(
                fontFamilyRef = "fontFamily.sans",
                fontWeight = 200,
                fontStyle = "style",
                textSize = 1f,
                lineHeight = 2f,
                letterSpacing = -0.02f,
            ),
            TypographyTokenValue(
                fontFamilyRef = "fontFamily.sans",
                fontWeight = 200,
                fontStyle = "italic",
                textSize = -1f,
                lineHeight = 2f,
                letterSpacing = -0.02f,
            ),
            TypographyTokenValue(
                fontFamilyRef = "fontFamily.sans",
                fontWeight = 200,
                fontStyle = "italic",
                textSize = 1f,
                lineHeight = -2f,
                letterSpacing = -0.02f,
            ),
        )
    }
}
