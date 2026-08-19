package com.sdds.plugin.themebuilder.internal.generator.theme.compose

import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult
import com.sdds.plugin.themebuilder.internal.tenant.Tenant
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.GradientToken
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.ByteArrayOutputStream

class ComposeSubThemeGeneratorTest {

    @Test
    fun `generate создает compose subtheme с color и gradient overrides`() {
        val outputKt = ByteArrayOutputStream()
        val underTest = composeSubThemeGenerator(outputKt)
        underTest.setColorTokens(
            tokens = listOf(
                colorToken("light.text.default.primary", "default"),
                colorToken("light.text.on-light.primary", "on-light"),
            ),
            data = mapOf(Tenant.Default to ColorTokenResult.TokenData(light = emptyMap(), dark = emptyMap())),
        )
        underTest.setGradientTokens(
            tokens = listOf(
                gradientToken("light.gradient.default.accent", "default"),
                gradientToken("light.gradient.on-light.accent", "on-light"),
            ),
            data = mapOf(Tenant.Default to GradientTokenResult.ComposeTokenData(light = emptyMap(), dark = emptyMap())),
        )

        underTest.generate()

        val content = outputKt.normalizedString()
        assertTrue(content.contains("package com.sdds.playground.themebuilder.theme.subthemes"))
        assertTrue(content.contains("import androidx.compose.foundation.isSystemInDarkTheme"))
        assertTrue(content.contains("import androidx.compose.runtime.Composable"))
        assertTrue(content.contains("import com.sdds.playground.themebuilder.theme.LocalThemeColors"))
        assertTrue(content.contains("import com.sdds.playground.themebuilder.theme.LocalThemeGradients"))
        assertTrue(content.contains("private val OnLightColorsOverride"))
        assertTrue(content.contains("textDefaultPrimary.overrideBy(textOnLightPrimary)"))
        assertTrue(content.contains("private val OnLightGradientsOverride"))
        assertTrue(content.contains("gradientDefaultAccent.overrideBy(gradientOnLightAccent)"))
        assertTrue(content.contains("fun ThemeTheme.OnLight("))
        assertTrue(content.contains("val overrideColors = currentColors.copyAttrs(OnLightColorsOverride)"))
        assertTrue(content.contains("val overrideGradients = currentGradients.copyAttrs(OnLightGradientsOverride)"))
        assertTrue(content.contains("colors = overrideColors,"))
        assertTrue(content.contains("gradients = overrideGradients,"))
    }

    @Test
    fun `generate создает тело default subtheme без override lambdas`() {
        val outputKt = ByteArrayOutputStream()
        val underTest = composeSubThemeGenerator(outputKt)
        underTest.setColorTokens(
            tokens = listOf(
                colorToken("light.text.inverse.primary", "inverse"),
                colorToken("light.text.default.primary", "default"),
            ),
            data = mapOf(Tenant.Default to ColorTokenResult.TokenData(light = emptyMap(), dark = emptyMap())),
        )

        underTest.generate()

        val content = outputKt.normalizedString()
        assertTrue(content.contains("fun ThemeTheme.Default("))
        assertTrue(content.contains("val currentColors = LocalThemeColors.current"))
        assertTrue(content.contains("val currentGradients = LocalThemeGradients.current"))
        assertTrue(
            content.contains("ThemeTheme(colors = currentColors, gradients = currentGradients, content = content)"),
        )
        assertTrue(!content.contains("DefaultColorsOverride"))
        assertTrue(!content.contains("DefaultGradientsOverride"))
    }

    @Test
    fun `generate ничего не записывает если нет subtheme overrides`() {
        val outputKt = ByteArrayOutputStream()
        val underTest = composeSubThemeGenerator(outputKt)

        underTest.generate()

        assertEquals("", outputKt.toString())
    }

    private fun composeSubThemeGenerator(outputKt: ByteArrayOutputStream): ComposeSubThemeGenerator =
        ComposeSubThemeGenerator(
            ktFileBuilderFactory = KtFileBuilderFactory(PackageResolver("com.sdds.playground.themebuilder")),
            packageResolver = PackageResolver("com.sdds.playground.themebuilder"),
            outputLocation = KtFileBuilder.OutputLocation.Stream(outputKt),
            themeName = "Theme",
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

    private fun ByteArrayOutputStream.normalizedString(): String =
        toString().replace("\r\n", "\n").replace("\r", "\n")
}
