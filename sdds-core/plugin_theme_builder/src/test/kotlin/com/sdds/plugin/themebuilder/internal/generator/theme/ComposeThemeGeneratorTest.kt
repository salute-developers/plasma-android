package com.sdds.plugin.themebuilder.internal.generator.theme

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.TypographyTokenResult
import com.sdds.plugin.themebuilder.internal.generator.theme.compose.ComposeThemeGenerator
import com.sdds.plugin.themebuilder.internal.utils.FileProvider
import com.sdds.plugin.themebuilder.internal.utils.getResourceAsText
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import io.mockk.clearAllMocks
import io.mockk.mockkObject
import io.mockk.unmockkObject
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream

/**
 * Unit-тесты [ComposeThemeGenerator]
 */
class ComposeThemeGeneratorTest {
    private lateinit var ktFileBuilderFactory: KtFileBuilderFactory

    @Before
    fun before() {
        mockkObject(
            PropertySpec,
            TypeSpec,
            FileProvider,
        )
        ktFileBuilderFactory = KtFileBuilderFactory("com.sdds.playground.themebuilder.tokens")
    }

    @After
    fun after() {
        clearAllMocks()
        unmockkObject(
            PropertySpec,
            TypeSpec,
            FileProvider,
        )
    }

    @Test
    fun `ComposeThemeGenerator должен генерировать тему c textSelectionColors и ProvideTextStyle`() {
        val outputKt = ByteArrayOutputStream()
        val underTest = ComposeThemeGenerator(
            ktFileBuilderFactory,
            KtFileBuilder.OutputLocation.Stream(outputKt),
            themeName = "Test",
        )
        underTest.setColorTokenData(colorAttrsWithDefaultColors)
        underTest.setTypographyTokenData(typographyAttrs)
        underTest.generate()

        Assert.assertEquals(
            getResourceAsText("theme-outputs/ThemeOutputKtWithTextSelectionAndTextStyle.txt"),
            outputKt.toString(),
        )
    }

    @Test
    fun `ComposeThemeGenerator должен генерировать тему без textSelectionColors и ProvideTextStyle`() {
        val outputKt = ByteArrayOutputStream()
        val underTest = ComposeThemeGenerator(
            ktFileBuilderFactory,
            KtFileBuilder.OutputLocation.Stream(outputKt),
            themeName = "Test",
        )
        underTest.setColorTokenData(emptyList())
        underTest.setTypographyTokenData(emptyList())
        underTest.generate()

        Assert.assertEquals(
            getResourceAsText("theme-outputs/ThemeOutputKt.txt"),
            outputKt.toString(),
        )
    }

    private companion object {
        val colorAttrsWithDefaultColors = listOf(
            ColorTokenResult.TokenData(
                attrName = "textPrimary",
                tokenRefName = "TextPrimary",
                true,
            ),
            ColorTokenResult.TokenData(
                attrName = "textDefaultAccent",
                tokenRefName = "TextDefaultAccent",
                true,
            ),
        )

        val typographyAttrs = listOf(
            TypographyTokenResult.ComposeTokenData(
                attrName = "bodyMNormal",
                tokenRefName = "BodyMNormal",
                screen = TypographyTokenResult.ComposeTokenData.Screen.MEDIUM,
            ),
            TypographyTokenResult.ComposeTokenData(
                attrName = "headerH3Bold",
                tokenRefName = "HeaderH3Bold",
                screen = TypographyTokenResult.ComposeTokenData.Screen.MEDIUM,
            ),
        )
    }
}
