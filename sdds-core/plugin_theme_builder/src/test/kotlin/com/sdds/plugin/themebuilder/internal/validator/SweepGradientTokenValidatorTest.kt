package com.sdds.plugin.themebuilder.internal.validator

import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.token.SweepGradientTokenValue
import org.junit.Assert.assertThrows
import org.junit.Test

/**
 * Unit-тесты [SweepGradientTokenValidator]
 */
class SweepGradientTokenValidatorTest {

    @Test
    fun `SweepGradientTokenValidator должен успешно проводить проверки`() {
        validData.forEach {
            SweepGradientTokenValidator.validate(it, TOKEN_NAME)
        }
    }

    @Test
    fun `SweepGradientTokenValidator должен выбрасывать исключение`() {
        invalidData.forEach {
            assertThrows(ThemeBuilderException::class.java) {
                SweepGradientTokenValidator.validate(it, TOKEN_NAME)
            }
        }
    }

    private companion object {
        const val TOKEN_NAME = "token_name"

        val validData = listOf(
            SweepGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f, 1f),
                centerY = 0.5f,
                centerX = 0.5f,
            ),
            SweepGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f, 1f),
                centerY = 0f,
                centerX = 1f,
            ),
            SweepGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f, 1f),
                centerY = 1f,
                centerX = 1f,
            ),
            SweepGradientTokenValue(
                colors = listOf("#fff", "#aaa", "#fff"),
                locations = listOf(0f, 1f, 0.7f),
                centerY = 1f,
                centerX = 0f,
            ),
        )

        val invalidData = listOf(
            SweepGradientTokenValue(
                colors = emptyList(),
                locations = emptyList(),
                centerY = 0.5f,
                centerX = 0.5f,
            ),
            SweepGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f),
                centerY = 0.5f,
                centerX = 0.5f,
            ),
            SweepGradientTokenValue(
                colors = listOf("#fff"),
                locations = listOf(0f, 1f),
                centerY = 0.5f,
                centerX = 0.5f,
            ),
            SweepGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f, 2f),
                centerY = 0.5f,
                centerX = 0.5f,
            ),
            SweepGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(-1f, 1f),
                centerY = 0.5f,
                centerX = 0.5f,
            ),
            SweepGradientTokenValue(
                colors = listOf("#fff", "#aaa", "#ffffffff"),
                locations = listOf(0f, 1f, 0.5f, 0.3f),
                centerY = 0.5f,
                centerX = 0.5f,
            ),
            SweepGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f, 1f),
                centerY = 1.5f,
                centerX = 0.5f,
            ),
            SweepGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f, 1f),
                centerY = -0.5f,
                centerX = 0.5f,
            ),
            SweepGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f, 1f),
                centerY = 0.5f,
                centerX = -0.5f,
            ),
            SweepGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f, 1f),
                centerY = 1.0f,
                centerX = 1.5f,
            ),
        )
    }
}
