package com.sdds.plugin.themebuilder.internal.validator

import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.token.FontToken
import com.sdds.plugin.themebuilder.internal.token.FontTokenValue
import org.junit.Assert
import org.junit.Test

/**
 * Unit-тесты [FontTokenValidator]
 */
class FontTokenValidatorTest {

    @Test
    fun `FontTokenValidator должен успешно проводить проверки`() {
        validData.forEach {
            FontTokenValidator.validate(it, TOKEN_NAME)
        }
    }

    @Test
    fun `FontTokenValidator должен выбрасывать исключение`() {
        invalidData.forEach {
            Assert.assertThrows(ThemeBuilderException::class.java) { FontTokenValidator.validate(it, TOKEN_NAME) }
        }
    }

    private companion object {
        const val TOKEN_NAME = "token_name"

        val validData = listOf(
            FontTokenValue(
                name = "display",
                fonts = listOf(
                    FontToken.FontVariant(
                        link = "https://com.example.app/fonts/display_regular.otf",
                        fontWeight = 100,
                        fontStyle = "normal",
                    ),
                    FontToken.FontVariant(
                        link = "https://com.example.app/fonts/display_regular.ttf",
                        fontWeight = 500,
                        fontStyle = "italic",
                    ),
                ),
            ),
            FontTokenValue(
                name = "text",
                fonts = listOf(
                    FontToken.FontVariant(
                        link = "https://com.example.app/fonts/text_regular.otf",
                        fontWeight = 100,
                        fontStyle = "normal",
                    ),
                ),
            ),
            FontTokenValue(
                name = "text",
                fonts = listOf(
                    FontToken.FontVariant(
                        link = "https://com.example.app/fonts/text_regular.otf",
                        fontWeight = 1000,
                        fontStyle = "normal",
                    ),
                ),
            ),
            FontTokenValue(
                name = "text",
                fonts = listOf(
                    FontToken.FontVariant(
                        link = "https://com.example.app/fonts/text_regular.otf",
                        fontWeight = 500,
                        fontStyle = "italic",
                    ),
                ),
            ),
        )

        val invalidData = listOf(
            FontTokenValue(
                name = "display",
                fonts = listOf(
                    FontToken.FontVariant(
                        link = "https://com.example.app/fonts/display_regular.png",
                        fontWeight = 100,
                        fontStyle = "normal",
                    ),
                    FontToken.FontVariant(
                        link = "https://com.example.app/fonts/display_regular.ttf",
                        fontWeight = 500,
                        fontStyle = "italic",
                    ),
                ),
            ),
            FontTokenValue(
                name = "display",
                fonts = listOf(
                    FontToken.FontVariant(
                        link = "https://com.example.app/fonts/display_regular.ttf",
                        fontWeight = 100,
                        fontStyle = "normal",
                    ),
                    FontToken.FontVariant(
                        link = "https://com.example.app/fonts/display_regular.ttf",
                        fontWeight = 100,
                        fontStyle = "normal",
                    ),
                ),
            ),
            FontTokenValue(
                name = "",
                fonts = listOf(
                    FontToken.FontVariant(
                        link = "https://com.example.app/fonts/text_regular.otf",
                        fontWeight = 100,
                        fontStyle = "normal",
                    ),
                ),
            ),
            FontTokenValue(
                name = "text",
                fonts = listOf(),
            ),
            FontTokenValue(
                name = "text",
                fonts = listOf(
                    FontToken.FontVariant(
                        link = "https://com.example.app/fonts/text_regular.otf",
                        fontWeight = 150,
                        fontStyle = "normal",
                    ),
                ),
            ),
            FontTokenValue(
                name = "text",
                fonts = listOf(
                    FontToken.FontVariant(
                        link = "https://com.example.app/fonts/text_regular.otf",
                        fontWeight = 0,
                        fontStyle = "normal",
                    ),
                ),
            ),
            FontTokenValue(
                name = "text",
                fonts = listOf(
                    FontToken.FontVariant(
                        link = "https://com.example.app/fonts/text_regular.otf",
                        fontWeight = 200,
                        fontStyle = "bold",
                    ),
                ),
            ),
            FontTokenValue(
                name = "text",
                fonts = listOf(
                    FontToken.FontVariant(
                        link = "https://com.example.app/fonts/text_regular.otf",
                        fontWeight = 200,
                        fontStyle = "",
                    ),
                ),
            ),
        )
    }
}
