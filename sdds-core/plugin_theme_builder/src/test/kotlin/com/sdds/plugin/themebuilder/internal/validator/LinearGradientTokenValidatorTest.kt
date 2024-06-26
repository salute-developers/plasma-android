package com.sdds.plugin.themebuilder.internal.validator

import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.token.LinearGradientTokenValue
import org.junit.Assert.assertThrows
import org.junit.Test

/**
 * Unit-тесты [LinearGradientTokenValidator]
 */
class LinearGradientTokenValidatorTest {

    @Test
    fun `LinearGradientTokenValidator должен успешно проводить проверки`() {
        validData.forEach {
            LinearGradientTokenValidator.validate(it, TOKEN_NAME)
        }
    }

    @Test
    fun `LinearGradientTokenValidator должен выбрасывать исключение`() {
        invalidData.forEach {
            assertThrows(ThemeBuilderException::class.java) {
                LinearGradientTokenValidator.validate(it, TOKEN_NAME)
            }
        }
    }

    private companion object {
        const val TOKEN_NAME = "token_name"

        val validData = listOf(
            LinearGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f, 1f),
                angle = 90f,
            ),
            LinearGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f, 1f),
                angle = -90f,
            ),
            LinearGradientTokenValue(
                colors = listOf("#fff", "#aaa", "#ffffffff"),
                locations = listOf(0f, 1f, 0.5f),
                angle = -360f,
            ),
            LinearGradientTokenValue(
                colors = listOf("#fff", "#aaa", "#ffffffff"),
                locations = listOf(0f, 1f, 0.5f),
                angle = 0.5f,
            ),
        )

        val invalidData = listOf(
            LinearGradientTokenValue(
                colors = emptyList(),
                locations = emptyList(),
                angle = 90f,
            ),
            LinearGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f),
                angle = 90f,
            ),
            LinearGradientTokenValue(
                colors = listOf("#fff"),
                locations = listOf(0f, 1f),
                angle = 90f,
            ),
            LinearGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(-0.1f, 1f),
                angle = 90f,
            ),
            LinearGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f, 10f),
                angle = 90f,
            ),
            LinearGradientTokenValue(
                colors = listOf("#fff", "#aaa", "#ffffffff"),
                locations = listOf(0f, 1f, 0.5f, 0.3f),
                angle = -360f,
            ),
            LinearGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f, 1f),
                angle = -1000f,
            ),
        )
    }
}
