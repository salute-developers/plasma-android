package com.sdds.plugin.themebuilder.internal.validator

import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import org.junit.Assert
import org.junit.Test

/**
 * Unit-тесты [ColorTokenValidator]
 */
class ColorTokenValidatorTest {

    @Test
    fun `ColorTokenValidator должен успешно проверять цвета`() {
        validColors.forEach {
            ColorTokenValidator.validate(it, TOKEN_NAME)
        }
    }

    @Test
    fun `ColorTokenValidator должен выбрасывать исключение`() {
        invalidColors.forEach {
            val exception = Assert.assertThrows(ThemeBuilderException::class.java) {
                ColorTokenValidator.validate(it, TOKEN_NAME)
            }
            Assert.assertEquals(
                "Color token $TOKEN_NAME has invalid value: $it. " +
                    "Color value should be rgb/argb hex " +
                    "or color palette reference, for example [general.red.100][0.5]",
                exception.message,
            )
        }
    }

    private companion object {
        const val TOKEN_NAME = "token_name"

        val validColors = listOf(
            "#33aaeeFF",
            "#ffffff",
            "#FFffff",
            "#fff",
            "#EEE",
            "#5e5e5e33",
            "[general.red.100]",
            "[general.blue.100][0]",
            "[general.green.100][0.0]",
            "[custom.red.200][0.00]",
            "[general.red.150][0.00]",
            "[general.red.300][0.01]",
            "[general.red.300][0.99]",
            "[general.red.100][0.341]",
            "[custom.red.550][1]",
            "[general.red.100][1.0]",
            "[general.red.1000][1.00]",
        )

        val invalidColors = listOf(
            "444",
            "aaa",
            "word",
            "#ffeeffeeee",
            "#ffff",
            "#ffffa",
            "ffffa",
            "#ssssss",
            "[generalred200]",
            "[200]",
            "[200][0.01]",
            "[red.200]",
            "[general.red.-200]",
            "[general.blue.300][-0.01]",
            "[general.green.1000][1.01]",
            "[general.green.big][1.01]",
            "[general.green.1000][2.01]",
            "[general.green.1000][1.00",
            "general.green.1000][1.00]",
            "[general.200.1000][1.00]",
        )
    }
}
