package com.sdds.plugin.themebuilder.internal.validator

import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.token.ShadowTokenValue
import org.junit.Assert
import org.junit.Test

/**
 * Unit-тесты [ShadowTokenValidator]
 */
class ShadowTokenValidatorTest {

    @Test
    fun `ShapeTokenValidator должен успешно проводить проверки`() {
        validData.forEach {
            ShadowTokenValidator.validate(it, TOKEN_NAME)
        }
    }

    @Test
    fun `ShapeTokenValidator должен выбрасывать исключение`() {
        invalidData.forEach {
            Assert.assertThrows(ThemeBuilderException::class.java) {
                ShadowTokenValidator.validate(it, TOKEN_NAME)
            }
        }
    }

    private companion object {
        const val TOKEN_NAME = "token_name"

        val validData = listOf(
            ShadowTokenValue("#33aaeeFF", 2f, 0f, 2f, 2f),
            ShadowTokenValue("#ffffff", -2.2f, 0f, 2f, 2f),
            ShadowTokenValue("#FFffff", 20f, 0f, 2f, 2f),
            ShadowTokenValue("#fff", 1.5f, 0f, 2f, 2f),
            ShadowTokenValue("#EEE", 0f, 0f, 2f, 2f),
            ShadowTokenValue("#5e5e5e33", 2f, 0f, 2f, 2f),
            ShadowTokenValue("[general.red.100]", 2f, 0f, 2f, 2f),
            ShadowTokenValue("[general.blue.100][0]", 2f, 0f, 2f, 2f),
            ShadowTokenValue("[general.green.100][0.0]", 2f, 0f, 2f, 2f),
            ShadowTokenValue("[custom.red.200][0.00]", 2f, 0f, 2f, 2f),
            ShadowTokenValue("[general.red.150][0.00]", 2f, 0f, 2f, 2f),
            ShadowTokenValue("[general.red.300][0.01]", 2f, 0f, 2f, 2f),
            ShadowTokenValue("[general.red.300][0.99]", 2f, 0f, 2f, 2f),
            ShadowTokenValue("[general.red.100][0.341]", 2f, 0f, 2f, 2f),
            ShadowTokenValue("[custom.red.550][1]", 2f, 0f, 2f, 2f),
            ShadowTokenValue("[general.red.100][1.0]", 2f, 0f, 2f, 2f),
            ShadowTokenValue("[general.red.1000][1.00]", 2f, 0f, 2f, 2f),
        )

        val invalidData = listOf(
            ShadowTokenValue("444", -2f, 0f, 2f, 2f),
            ShadowTokenValue("aaa", -22f, 0f, 2f, 2f),
            ShadowTokenValue("word", 0f, 0f, 2f, 2f),
            ShadowTokenValue("#ffeeffeeee", 1.3f, 0f, 2f, 2f),
            ShadowTokenValue("#ffff", 2f, 0f, 2f, 2f),
            ShadowTokenValue("#ffffa", 2f, 0f, 2f, 2f),
            ShadowTokenValue("ffffa", 2f, 0f, 2f, 2f),
            ShadowTokenValue("#ssssss", 2f, 0f, 2f, 2f),
            ShadowTokenValue("[generalred200]", 2f, 0f, 2f, 2f),
            ShadowTokenValue("[200]", 2f, 0f, 2f, 2f),
            ShadowTokenValue("[200][0.01]", 2f, 0f, 2f, 2f),
            ShadowTokenValue("[red.200]", 2f, 0f, 2f, 2f),
            ShadowTokenValue("[general.red.-200]", 2f, 0f, 2f, 2f),
            ShadowTokenValue("[general.blue.300][-0.01]", 2f, 0f, 2f, 2f),
            ShadowTokenValue("[general.green.1000][1.01]", 2f, 0f, 2f, 2f),
            ShadowTokenValue("[general.green.big][1.01]", 2f, 0f, 2f, 2f),
            ShadowTokenValue("[general.green.1000][2.01]", 2f, 0f, 2f, 2f),
            ShadowTokenValue("[general.green.1000][1.00", 2f, 0f, 2f, 2f),
            ShadowTokenValue("general.green.1000][1.00]", 2f, 0f, 2f, 2f),
            ShadowTokenValue("[general.200.1000][1.00]", 2f, 0f, 2f, 2f),
        )
    }
}
