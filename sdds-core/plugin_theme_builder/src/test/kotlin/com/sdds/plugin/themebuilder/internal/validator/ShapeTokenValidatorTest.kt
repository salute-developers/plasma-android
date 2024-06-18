package com.sdds.plugin.themebuilder.internal.validator

import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.token.RoundedShapeTokenValue
import org.junit.Assert
import org.junit.Test

/**
 * Unit-тесты [ShapeTokenValidator]
 */
class ShapeTokenValidatorTest {

    @Test
    fun `ShapeTokenValidator должен успешно проводить проверки`() {
        validData.forEach {
            ShapeTokenValidator.validate(it, TOKEN_NAME)
        }
    }

    @Test
    fun `ShapeTokenValidator должен выбрасывать исключение`() {
        invalidData.forEach {
            Assert.assertThrows(ThemeBuilderException::class.java) {
                ShapeTokenValidator.validate(it, TOKEN_NAME)
            }
        }
    }

    private companion object {
        const val TOKEN_NAME = "token_name"

        val validData = listOf(
            RoundedShapeTokenValue(cornerRadius = 0f),
            RoundedShapeTokenValue(cornerRadius = 4f),
            RoundedShapeTokenValue(cornerRadius = 8f),
            RoundedShapeTokenValue(cornerRadius = 16f),
            RoundedShapeTokenValue(cornerRadius = 32f),
        )

        val invalidData = listOf(
            RoundedShapeTokenValue(cornerRadius = -4f),
            RoundedShapeTokenValue(cornerRadius = -16f),
        )
    }
}
