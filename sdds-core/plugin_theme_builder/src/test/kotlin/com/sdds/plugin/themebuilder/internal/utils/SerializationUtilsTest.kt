package com.sdds.plugin.themebuilder.internal.utils

import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.token.BackgroundGradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.FontToken
import com.sdds.plugin.themebuilder.internal.token.GradientToken
import com.sdds.plugin.themebuilder.internal.token.GradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.LinearGradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.RadialGradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.RoundedShapeTokenValue
import com.sdds.plugin.themebuilder.internal.token.ShadowToken
import com.sdds.plugin.themebuilder.internal.token.ShapeToken
import com.sdds.plugin.themebuilder.internal.token.ShapeTokenValue
import com.sdds.plugin.themebuilder.internal.token.SweepGradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.Theme
import com.sdds.plugin.themebuilder.internal.token.TypographyToken
import org.junit.Assert
import org.junit.Test

/**
 * Unit-тесты экстеншна [decode]
 */
class SerializationUtilsTest {

    @Test
    fun `decode должен валидно парсить базовый json с помощью Serializer instance`() {
        val inputFile = getResourceAsFile("inputs/test-theme.json")
        val theme = inputFile.decode<Theme>(Serializer.meta)

        val expectedTheme = Theme(
            name = "plasma_b2c",
            version = "0.1.0",
            tokens = listOf(
                ColorToken(
                    displayName = "textPrimary",
                    name = "dark.text.primary",
                    tags = setOf("dark", "text", "primary"),
                    enabled = true,
                    description = "Text&Icons Default/General/textPrimary",
                ),
                GradientToken(
                    displayName = "surfaceGradientMain",
                    name = "dark.surface.gradient-main",
                    tags = setOf("dark", "surface", "gradient-main"),
                    enabled = true,
                    description = "Surface Default/General/gradientMain",
                ),
                ShadowToken(
                    displayName = "shadowUpHardXs",
                    name = "up.hard.xs",
                    tags = setOf("up", "hard", "xs"),
                    enabled = true,
                    description = "Shadow Up Hard Xs",
                ),
                ShapeToken(
                    displayName = "roundXss",
                    name = "round.xss",
                    tags = setOf("round", "xss"),
                    enabled = true,
                    description = "cRxxs",
                ),
                TypographyToken(
                    displayName = "textS",
                    name = "screen-s.text.s.normal",
                    tags = setOf("screen-s", "text", "s", "normal"),
                    enabled = true,
                    description = "Text/Small Screen/TextS B",
                ),
                FontToken(
                    displayName = "fontFamilyText",
                    name = "text",
                    tags = setOf("text"),
                    enabled = true,
                    description = "Font-family: SB Sans Text",
                ),
            ),
        )

        Assert.assertEquals(expectedTheme, theme)
    }

    @Test
    fun `decode должен валидно парсить значения токенов градиента`() {
        val inputFile = getResourceAsFile("inputs/test-color-value-input.json")
        val gradientValues = inputFile.decode<Map<String, List<GradientTokenValue>>>()

        val expectedValues = mapOf(
            "dark.surface.gradient-main" to listOf(
                SweepGradientTokenValue(
                    locations = listOf(0f, 1f),
                    colors = listOf("#24B23E", "#05C1F5"),
                    centerX = 0.66f,
                    centerY = 0.5f,
                ),
                LinearGradientTokenValue(
                    locations = listOf(0f, 1f),
                    colors = listOf("#24B23E", "#05C1F5"),
                    angle = 89.83f,
                ),
                RadialGradientTokenValue(
                    locations = listOf(0f, 1f),
                    colors = listOf("#24B23E", "#05C1F5"),
                    centerX = 0.66f,
                    centerY = 0.5f,
                    radius = 1f,
                ),
                BackgroundGradientTokenValue(
                    background = "#FFFFFFF",
                ),
            ),
        )

        Assert.assertEquals(expectedValues, gradientValues)
    }

    @Test
    fun `decode должна валидно парсить значения токенов форм`() {
        val inputFile = getResourceAsFile("inputs/test-shape-value-input.json")
        val shapeValues = inputFile.decode<Map<String, ShapeTokenValue>>()

        val expectedValues = mapOf(
            "round.xss" to RoundedShapeTokenValue(cornerRadius = 1.5f),
            "round.xs" to RoundedShapeTokenValue(cornerRadius = 2.5f),
        )

        Assert.assertEquals(expectedValues, shapeValues)
    }
}
