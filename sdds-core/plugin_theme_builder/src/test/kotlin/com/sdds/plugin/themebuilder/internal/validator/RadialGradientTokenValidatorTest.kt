package com.sdds.plugin.themebuilder.internal.validator

import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.token.RadialGradientTokenValue
import org.junit.Assert.assertThrows
import org.junit.Test

/**
 * Unit-тесты [RadialGradientTokenValidator]
 */
class RadialGradientTokenValidatorTest {

    @Test
    fun `RadialGradientTokenValidator должен успешно проводить проверки`() {
        validData.forEach {
            RadialGradientTokenValidator.validate(it, TOKEN_NAME)
        }
    }

    @Test
    fun `RadialGradientTokenValidator должен выбрасывать исключение`() {
        invalidData.forEach {
            assertThrows(ThemeBuilderException::class.java) {
                RadialGradientTokenValidator.validate(it, TOKEN_NAME)
            }
        }
    }

    private companion object {
        const val TOKEN_NAME = "token_name"

        val validData = listOf(
            RadialGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f, 1f),
                radius = 1f,
                centerY = 0.5f,
                centerX = 0.5f,
            ),
            RadialGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f, 1f),
                radius = 1f,
                centerY = 0f,
                centerX = 1f,
            ),
            RadialGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f, 1f),
                radius = 1f,
                centerY = 1f,
                centerX = 1f,
            ),
            RadialGradientTokenValue(
                colors = listOf("#fff", "#aaa", "#fff"),
                locations = listOf(0f, 1f, 0.7f),
                radius = 0f,
                centerY = 0f,
                centerX = 1f,
            ),
        )

        val invalidData = listOf(
            RadialGradientTokenValue(
                colors = emptyList(),
                locations = emptyList(),
                radius = 1f,
                centerY = 0.5f,
                centerX = 0.5f,
            ),
            RadialGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f),
                radius = 1f,
                centerY = 0.5f,
                centerX = 0.5f,
            ),
            RadialGradientTokenValue(
                colors = listOf("#fff"),
                locations = listOf(0f, 1f),
                radius = 1f,
                centerY = 0.5f,
                centerX = 0.5f,
            ),
            RadialGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f, 2f),
                radius = 1f,
                centerY = 0.5f,
                centerX = 0.5f,
            ),
            RadialGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(-1f, 1f),
                radius = 1f,
                centerY = 0.5f,
                centerX = 0.5f,
            ),
            RadialGradientTokenValue(
                colors = listOf("#fff", "#aaa", "#ffffffff"),
                locations = listOf(0f, 1f, 0.5f, 0.3f),
                radius = 1f,
                centerY = 0.5f,
                centerX = 0.5f,
            ),
            RadialGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f, 1f),
                radius = 10f,
                centerY = 0.5f,
                centerX = 0.5f,
            ),
            RadialGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f, 1f),
                radius = -1f,
                centerY = 0.5f,
                centerX = 0.5f,
            ),
            RadialGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f, 1f),
                radius = 1f,
                centerY = -0.5f,
                centerX = 0.5f,
            ),
            RadialGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f, 1f),
                radius = 1f,
                centerY = 0.5f,
                centerX = -0.5f,
            ),
            RadialGradientTokenValue(
                colors = listOf("#fff", "#aaa"),
                locations = listOf(0f, 1f),
                radius = 1f,
                centerY = 1.1f,
                centerX = 0.5f,
            ),
        )
    }
}
