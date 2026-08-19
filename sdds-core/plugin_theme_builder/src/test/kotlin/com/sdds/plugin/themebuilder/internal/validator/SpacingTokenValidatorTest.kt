package com.sdds.plugin.themebuilder.internal.validator

import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.token.SpacingTokenValue
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test

class SpacingTokenValidatorTest {

    @Test
    fun `SpacingTokenValidator пропускает неотрицательные значения`() {
        SpacingTokenValidator.validate(SpacingTokenValue(0f), TOKEN_NAME)
        SpacingTokenValidator.validate(SpacingTokenValue(12f), TOKEN_NAME)
    }

    @Test
    fun `SpacingTokenValidator падает если значение отрицательное`() {
        val exception = assertThrows(ThemeBuilderException::class.java) {
            SpacingTokenValidator.validate(SpacingTokenValue(-1f), TOKEN_NAME)
        }

        assertEquals(
            "Spacing token $TOKEN_NAME has invalid value: -1.0. Valid value should be >= 0.",
            exception.message,
        )
    }

    private companion object {
        const val TOKEN_NAME = "spacing.negative"
    }
}
