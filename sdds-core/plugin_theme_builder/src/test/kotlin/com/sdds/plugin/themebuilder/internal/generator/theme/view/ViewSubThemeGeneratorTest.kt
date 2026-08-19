package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.ResourcePrefixConfig
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.GradientToken
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class ViewSubThemeGeneratorTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `generate создает light и night subthemes для color overrides`() {
        val outputResDir = temporaryFolder.newFolder("res")
        val underTest = viewSubThemeGenerator(outputResDir)
        underTest.setColorTokens(
            tokens = listOf(
                colorToken("light.text.default.primary", "default"),
                colorToken("dark.text.default.primary", "default"),
                colorToken("light.text.on-light.primary", "on-light"),
                colorToken("dark.text.on-light.primary", "on-light"),
            ),
            data = ColorTokenResult.TokenData(
                light = mapOf(
                    "textOnLightPrimary" to ColorTokenResult.TokenData.ColorInfo(
                        colorRef = "@color/thmbldr_light_text_on_light_primary",
                    ),
                ),
                dark = mapOf(
                    "textOnLightPrimary" to ColorTokenResult.TokenData.ColorInfo(
                        colorRef = "@color/thmbldr_dark_text_on_light_primary",
                    ),
                ),
            ),
        )

        underTest.generate()

        val defaultContent = outputResDir.resolve("values/subtheme.xml").normalizedText()
        val nightContent = outputResDir.resolve("values-night/subtheme.xml").normalizedText()
        assertTrue(defaultContent.contains("<style name=\"Thmbldr.TestTheme.LightOnLight\">"))
        assertTrue(
            defaultContent.contains(
                "<item name=\"thmbldr_textDefaultPrimary\">" +
                    "@color/thmbldr_light_text_on_light_primary</item>",
            ),
        )
        assertTrue(defaultContent.contains("<style name=\"Thmbldr.TestTheme.DarkOnLight\">"))
        assertTrue(
            defaultContent.contains(
                "<item name=\"thmbldr_textDefaultPrimary\">" +
                    "@color/thmbldr_dark_text_on_light_primary</item>",
            ),
        )
        assertTrue(
            defaultContent.contains(
                "<style name=\"Thmbldr.TestTheme.OnLight\" " +
                    "parent=\"Thmbldr.TestTheme.LightOnLight\"/>",
            ),
        )
        assertTrue(
            nightContent.contains(
                "<style name=\"Thmbldr.TestTheme.OnLight\" " +
                    "parent=\"Thmbldr.TestTheme.DarkOnLight\"/>",
            ),
        )
    }

    @Test
    fun `generate создает drawable и style references для gradient overrides`() {
        val outputResDir = temporaryFolder.newFolder("res")
        val underTest = viewSubThemeGenerator(outputResDir)
        underTest.setGradientTokens(
            tokens = listOf(
                gradientToken("light.gradient.default.accent", "default"),
                gradientToken("light.gradient.on-light.accent", "on-light"),
                gradientToken("light.gradient.default.text-accent", "default"),
                gradientToken("light.gradient.on-light.text-accent", "on-light"),
            ),
            data = GradientTokenResult.ViewTokenData(
                light = mapOf(
                    "gradientOnLightAccent" to gradient(
                        nameSnakeCase = "light_gradient_on_light_accent",
                        isTextGradient = false,
                    ),
                    "gradientOnLightTextAccent" to gradient(
                        nameSnakeCase = "light_gradient_on_light_text_accent",
                        isTextGradient = true,
                    ),
                ),
                dark = emptyMap(),
            ),
        )

        underTest.generate()

        val defaultContent = outputResDir.resolve("values/subtheme.xml").normalizedText()
        assertTrue(
            defaultContent.contains(
                "<item name=\"thmbldr_gradientDefaultAccent\">" +
                    "@drawable/thmbldr_light_gradient_on_light_accent</item>",
            ),
        )
        assertTrue(
            defaultContent.contains(
                "<item name=\"thmbldr_gradientDefaultTextAccent\">" +
                    "@style/Thmbldr.TestTheme.Gradient.LightGradientOnLightTextAccent</item>",
            ),
        )
    }

    private fun viewSubThemeGenerator(outputResDir: java.io.File): ViewSubThemeGenerator =
        ViewSubThemeGenerator(
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "test_theme"),
            outputResDir = outputResDir,
            resourcePrefixConfig = ResourcePrefixConfig(
                resourcePrefix = "thmbldr",
                shouldGenerateResPrefixStyle = true,
            ),
            resourceReferenceProvider = ResourceReferenceProvider("thmbldr", "test_theme"),
            themeName = "test_theme",
        )

    private fun colorToken(name: String, tag: String): ColorToken =
        ColorToken(
            displayName = name,
            name = name,
            tags = setOf(tag),
            enabled = true,
            description = name,
        )

    private fun gradientToken(name: String, tag: String): GradientToken =
        GradientToken(
            displayName = name,
            name = name,
            tags = setOf(tag),
            enabled = true,
            description = name,
        )

    private fun gradient(
        nameSnakeCase: String,
        isTextGradient: Boolean,
    ): GradientTokenResult.ViewTokenData.Gradient =
        GradientTokenResult.ViewTokenData.Gradient(
            nameSnakeCase = nameSnakeCase,
            layers = emptyList(),
            description = nameSnakeCase,
            isTextGradient = isTextGradient,
        )

    private fun java.io.File.normalizedText(): String =
        readText().replace("\r\n", "\n").replace("\r", "\n")
}
