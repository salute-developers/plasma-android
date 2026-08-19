package com.sdds.plugin.themebuilder.internal.generator.theme

import com.sdds.plugin.themebuilder.ResourcePrefixConfig
import com.sdds.plugin.themebuilder.ViewThemeParent
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.SpacingTokenResult
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ShadowStyleGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewGradientGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewThemeGenerator
import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File

class ViewThemeGeneratorBehaviorTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `generate использует light color как fallback для dark theme`() {
        val outputResDir = temporaryFolder.newFolder("res")
        val underTest = themeGenerator(outputResDir)
        underTest.setColorTokenData(
            ColorTokenResult.TokenData(
                light = mapOf(
                    "textPrimary" to ColorTokenResult.TokenData.ColorInfo("@color/light_text_primary"),
                ),
                dark = emptyMap(),
            ),
        )

        underTest.generate()

        val theme = outputResDir.resolve("values/theme.xml").readText()
        assertTrue(theme.contains("<!--Dark colors-->"))
        assertTrue(theme.contains("<!--Light colors-->"))
        assertTrue(theme.contains("<item name=\"thmbldr_textPrimary\">@color/light_text_primary</item>"))
    }

    @Test
    fun `generate использует light gradient как fallback для dark theme`() {
        val outputResDir = temporaryFolder.newFolder("res")
        val gradient = gradientTokenData(nameSnakeCase = "light_gradient_accent")
        val viewGradientGenerator = mockk<ViewGradientGenerator>(relaxed = true) {
            every { addGradient(gradient) } returns "@drawable/light_gradient_accent"
        }
        val underTest = themeGenerator(
            outputResDir = outputResDir,
            viewGradientGenerator = viewGradientGenerator,
        )
        underTest.setGradientTokenData(
            GradientTokenResult.ViewTokenData(
                light = mapOf("gradientAccent" to gradient),
                dark = emptyMap(),
            ),
        )

        underTest.generate()

        val theme = outputResDir.resolve("values/theme.xml").readText()
        assertTrue(theme.contains("<!--Dark gradients-->"))
        assertTrue(theme.contains("<!--Light gradients-->"))
        assertTrue(theme.contains("<item name=\"thmbldr_gradientAccent\">@drawable/light_gradient_accent</item>"))
    }

    @Test
    fun `generate добавляет spacing attributes`() {
        val outputResDir = temporaryFolder.newFolder("res")
        val underTest = themeGenerator(outputResDir)
        underTest.setSpacingTokenData(
            listOf(
                SpacingTokenResult.TokenData(
                    attrName = "spacing12",
                    tokenRefName = "@dimen/spacing_12",
                ),
            ),
        )

        underTest.generate()

        val lightTheme = outputResDir.resolve("values/theme.xml").readText()
        assertTrue(lightTheme.contains("<!--Spacing-->"))
        assertTrue(lightTheme.contains("<item name=\"thmbldr_spacing12\">@dimen/spacing_12</item>"))
    }

    @Test
    fun `generate использует dark color как fallback для light theme`() {
        val outputResDir = temporaryFolder.newFolder("res")
        val underTest = themeGenerator(outputResDir)
        underTest.setColorTokenData(
            ColorTokenResult.TokenData(
                light = emptyMap(),
                dark = mapOf(
                    "textPrimary" to ColorTokenResult.TokenData.ColorInfo("@color/dark_text_primary"),
                ),
            ),
        )

        underTest.generate()

        val theme = outputResDir.resolve("values/theme.xml").readText()
        assertTrue(theme.contains("<!--Dark colors-->"))
        assertTrue(theme.contains("<!--Light colors-->"))
        assertTrue(theme.contains("<item name=\"thmbldr_textPrimary\">@color/dark_text_primary</item>"))
    }

    @Test
    fun `generate использует dark gradient как fallback для light theme`() {
        val outputResDir = temporaryFolder.newFolder("res")
        val gradient = gradientTokenData(nameSnakeCase = "dark_gradient_accent")
        val viewGradientGenerator = mockk<ViewGradientGenerator>(relaxed = true) {
            every { addGradient(gradient) } returns "@drawable/dark_gradient_accent"
        }
        val underTest = themeGenerator(
            outputResDir = outputResDir,
            viewGradientGenerator = viewGradientGenerator,
        )
        underTest.setGradientTokenData(
            GradientTokenResult.ViewTokenData(
                light = emptyMap(),
                dark = mapOf("gradientAccent" to gradient),
            ),
        )

        underTest.generate()

        val theme = outputResDir.resolve("values/theme.xml").readText()
        assertTrue(theme.contains("<!--Dark gradients-->"))
        assertTrue(theme.contains("<!--Light gradients-->"))
        assertTrue(theme.contains("<item name=\"thmbldr_gradientAccent\">@drawable/dark_gradient_accent</item>"))
    }

    @Test
    fun `generate при пустом themeName создает промежуточный parent style от resource prefix`() {
        val outputResDir = temporaryFolder.newFolder("res")
        val underTest = themeGenerator(
            outputResDir = outputResDir,
            themeName = "",
            viewThemeParents = listOf(
                ViewThemeParent(
                    themePrefix = "Theme.MaterialComponents",
                    childSuffix = "Material.Dialog",
                ),
            ),
        )

        underTest.generate()

        val theme = outputResDir.resolve("values/theme.xml").readText()
        assertTrue(theme.contains("<style name=\"Thmbldr.Material\"/>"))
        assertTrue(theme.contains("<style name=\"Thmbldr.Material.Dialog\""))
    }

    @Test
    fun `generate не создает пустой resource prefix style если генерация prefix style выключена`() {
        val outputResDir = temporaryFolder.newFolder("res")
        val underTest = themeGenerator(
            outputResDir = outputResDir,
            shouldGenerateResPrefixStyle = false,
        )

        underTest.generate()

        val theme = outputResDir.resolve("values/theme.xml").readText()
        assertFalse(theme.contains("<style name=\"Thmbldr\"/>"))
        assertTrue(theme.contains("<style name=\"Thmbldr.TestTheme\""))
    }

    private fun themeGenerator(
        outputResDir: File,
        viewGradientGenerator: ViewGradientGenerator = mockk(relaxed = true),
        themeName: String = "test_theme",
        viewThemeParents: List<ViewThemeParent> = emptyList(),
        shouldGenerateResPrefixStyle: Boolean = true,
    ): ViewThemeGenerator {
        return ViewThemeGenerator(
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme"),
            outputResDir = outputResDir,
            viewThemeParents = viewThemeParents,
            themeName = themeName,
            resPrefixConfig = ResourcePrefixConfig(
                resourcePrefix = "thmbldr",
                shouldGenerateResPrefixStyle = shouldGenerateResPrefixStyle,
            ),
            viewGradientGenerator = viewGradientGenerator,
            shadowStyleGenerator = mockk<ShadowStyleGenerator>(relaxed = true),
        )
    }

    private fun gradientTokenData(nameSnakeCase: String): GradientTokenResult.ViewTokenData.Gradient {
        return GradientTokenResult.ViewTokenData.Gradient(
            nameSnakeCase = nameSnakeCase,
            layers = listOf(
                GradientTokenResult.ViewTokenData.Gradient.Layer.Linear(
                    angle = "@string/light_gradient_accent_angle",
                    colors = "@array/light_gradient_accent_colors",
                    stops = "@array/light_gradient_accent_stops",
                ),
            ),
            description = "Accent Gradient",
            isTextGradient = false,
        )
    }
}
