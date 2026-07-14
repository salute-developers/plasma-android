package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.fonts.FontData
import com.sdds.plugin.themebuilder.internal.fonts.FontsAggregator
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.tenant.Tenant
import com.sdds.plugin.themebuilder.internal.token.TypographyToken
import com.sdds.plugin.themebuilder.internal.token.TypographyTokenValue
import com.sdds.plugin.themebuilder.internal.utils.FileProvider
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fileWriter
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.textAppearancesXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.typographyXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.getResourceAsText
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkObject
import io.mockk.unmockkObject
import kotlinx.serialization.decodeFromString
import org.junit.After
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.File

/**
 * Unit тесты [TypographyTokenGenerator]
 * @author Малышев Александр on 13.03.2024
 */
class TypographyTokenGeneratorTest {

    private lateinit var outputKt: ByteArrayOutputStream
    private lateinit var mockOutputResDir: File
    private lateinit var mockDimensAggregator: DimensAggregator
    private lateinit var mockFontsAggregator: FontsAggregator
    private lateinit var dimensionsConfig: DimensionsConfig
    private lateinit var underTest: TypographyTokenGenerator

    @Before
    fun setUp() {
        mockkObject(
            PropertySpec,
            TypeSpec,
            FileProvider,
        )
        outputKt = ByteArrayOutputStream()
        mockOutputResDir = mockk(relaxed = true)
        mockDimensAggregator = mockk(relaxed = true)
        mockFontsAggregator = mockk(relaxed = true) {
            every { fonts } returns fontsAggregatorData
        }
        dimensionsConfig = mockk(relaxed = true)
        underTest = TypographyTokenGenerator(
            outputLocation = KtFileBuilder.OutputLocation.Stream(outputKt),
            outputResDir = mockOutputResDir,
            target = ThemeBuilderTarget.ALL,
            dimensAggregator = mockDimensAggregator,
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme"),
            ktFileBuilderFactory = KtFileBuilderFactory(PackageResolver("com.test")),
            resourceReferenceProvider = ResourceReferenceProvider("thmbldr", "TestTheme"),
            typographyTokenValues = typographyTokenValues,
            fontsAggregator = mockFontsAggregator,
            dimensionsConfig = dimensionsConfig,
            namespace = "com.test",
            themeName = "TestTheme",
        )
    }

    @After
    fun tearDown() {
        clearAllMocks(true)
        unmockkObject(
            PropertySpec,
            TypeSpec,
            FileProvider,
        )
    }

    @Test
    fun `TypographyGenerator добавляет токен и генерирует файлы для compose и view system`() {
        val input = getResourceAsText("inputs/test-typography-input.json")
        val typographyTokens = Serializer.meta.decodeFromString<List<TypographyToken>>(input)
        val outputAppearancesMediumXml = ByteArrayOutputStream()
        val outputAppearancesSmallXml = ByteArrayOutputStream()
        val outputAppearancesLargeXml = ByteArrayOutputStream()
        val outputTypographyXml = ByteArrayOutputStream()
        val appearancesMediumXmlFile = mockk<File>(relaxed = true)
        val appearancesSmallXmlFile = mockk<File>(relaxed = true)
        val appearancesLargeXmlFile = mockk<File>(relaxed = true)
        val typographyXmlFile = mockk<File>(relaxed = true)
        every { dimensionsConfig.multiplier } returns 2f
        every { dimensionsConfig.breakPoints } returns mockk(relaxed = true) {
            every { medium } returns 512
            every { large } returns 1000
        }
        every { appearancesMediumXmlFile.fileWriter() } returns outputAppearancesMediumXml.writer()
        every { appearancesSmallXmlFile.fileWriter() } returns outputAppearancesSmallXml.writer()
        every { appearancesLargeXmlFile.fileWriter() } returns outputAppearancesLargeXml.writer()
        every { typographyXmlFile.fileWriter() } returns outputTypographyXml.writer()
        every { mockOutputResDir.textAppearancesXmlFile("") } returns appearancesSmallXmlFile
        every { mockOutputResDir.textAppearancesXmlFile("w512dp") } returns appearancesMediumXmlFile
        every { mockOutputResDir.textAppearancesXmlFile("w1000dp") } returns appearancesLargeXmlFile
        every { mockOutputResDir.typographyXmlFile(any()) } returns typographyXmlFile

        typographyTokens.forEach { token ->
            underTest.addToken(token)
        }
        underTest.generate()

        assertEquals(
            getResourceAsText("typography-outputs/test-typography-output.xml"),
            outputTypographyXml.toString(),
        )
        assertEquals(
            getResourceAsText("typography-outputs/test-appearances-small-output.xml"),
            outputAppearancesSmallXml.toString(),
        )
        assertEquals(
            getResourceAsText("typography-outputs/test-appearances-medium-output.xml"),
            outputAppearancesMediumXml.toString(),
        )
        assertEquals(
            getResourceAsText("typography-outputs/test-appearances-large-output.xml"),
            outputAppearancesLargeXml.toString(),
        )
        assertEquals(
            getResourceAsText("typography-outputs/TestTypographyOutputKt.txt"),
            outputKt.toString(),
        )
    }

    @Test
    fun `TypographyGenerator добавляет токен и генерирует файлы xml и compose c размерами из ресурсов`() {
        val input = getResourceAsText("inputs/test-typography-input.json")
        val typographyTokens = Serializer.meta.decodeFromString<List<TypographyToken>>(input)
        val outputAppearancesMediumXml = ByteArrayOutputStream()
        val outputAppearancesSmallXml = ByteArrayOutputStream()
        val outputAppearancesLargeXml = ByteArrayOutputStream()
        val outputTypographyXml = ByteArrayOutputStream()
        val appearancesMediumXmlFile = mockk<File>(relaxed = true)
        val appearancesSmallXmlFile = mockk<File>(relaxed = true)
        val appearancesLargeXmlFile = mockk<File>(relaxed = true)
        val typographyXmlFile = mockk<File>(relaxed = true)
        every { dimensionsConfig.multiplier } returns 2f
        every { dimensionsConfig.breakPoints } returns mockk(relaxed = true) {
            every { medium } returns 512
            every { large } returns 1000
        }
        every { dimensionsConfig.fromResources } returns true
        every { appearancesMediumXmlFile.fileWriter() } returns outputAppearancesMediumXml.writer()
        every { appearancesSmallXmlFile.fileWriter() } returns outputAppearancesSmallXml.writer()
        every { appearancesLargeXmlFile.fileWriter() } returns outputAppearancesLargeXml.writer()
        every { typographyXmlFile.fileWriter() } returns outputTypographyXml.writer()
        every { mockOutputResDir.textAppearancesXmlFile("") } returns appearancesSmallXmlFile
        every { mockOutputResDir.textAppearancesXmlFile("w512dp") } returns appearancesMediumXmlFile
        every { mockOutputResDir.textAppearancesXmlFile("w1000dp") } returns appearancesLargeXmlFile
        every { mockOutputResDir.typographyXmlFile(any()) } returns typographyXmlFile

        typographyTokens.forEach { token ->
            underTest.addToken(token)
        }
        underTest.generate()
        assertEquals(
            getResourceAsText("typography-outputs/TestTypographyWithResourcesOutputKt.txt"),
            outputKt.toString(),
        )
    }

    @Test
    fun `TypographyGenerator в CMP-режиме эмитит @Composable-геттеры TextStyle`() {
        val input = getResourceAsText("inputs/test-typography-input.json")
        val typographyTokens = Serializer.meta.decodeFromString<List<TypographyToken>>(input)
        val outputKt = ByteArrayOutputStream()
        every { dimensionsConfig.multiplier } returns 1f
        every { dimensionsConfig.fromResources } returns false
        val generator = TypographyTokenGenerator(
            outputLocation = KtFileBuilder.OutputLocation.Stream(outputKt),
            outputResDir = mockOutputResDir,
            target = ThemeBuilderTarget.COMPOSE,
            dimensAggregator = mockDimensAggregator,
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme"),
            ktFileBuilderFactory = KtFileBuilderFactory(PackageResolver("com.test")),
            resourceReferenceProvider = ResourceReferenceProvider("thmbldr", "TestTheme"),
            typographyTokenValues = typographyTokenValues,
            fontsAggregator = mockFontsAggregator,
            dimensionsConfig = dimensionsConfig,
            namespace = "com.test",
            themeName = "TestTheme",
            multiplatform = true,
        )

        typographyTokens.forEach { generator.addToken(it) }
        generator.generate()

        val output = outputKt.toString()
        Assert.assertTrue(output.contains("import androidx.compose.runtime.Composable"))
        Assert.assertTrue(output.contains("@Composable"))
        Assert.assertTrue(output.contains("get()"))
        // значение через @Composable-геттер, а не плоское присваивание
        Assert.assertFalse(output.contains(": TextStyle = TextStyle("))
    }

    @Test
    fun `TypographyGenerator в CMP-режиме не эмитит Android-only platformStyle`() {
        val input = getResourceAsText("inputs/test-typography-input.json")
        val typographyTokens = Serializer.meta.decodeFromString<List<TypographyToken>>(input)
        val outputKt = ByteArrayOutputStream()
        every { dimensionsConfig.multiplier } returns 1f
        every { dimensionsConfig.fromResources } returns false
        val generator = TypographyTokenGenerator(
            outputLocation = KtFileBuilder.OutputLocation.Stream(outputKt),
            outputResDir = mockOutputResDir,
            target = ThemeBuilderTarget.COMPOSE,
            dimensAggregator = mockDimensAggregator,
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme"),
            ktFileBuilderFactory = KtFileBuilderFactory(PackageResolver("com.test")),
            resourceReferenceProvider = ResourceReferenceProvider("thmbldr", "TestTheme"),
            typographyTokenValues = typographyTokenValues,
            fontsAggregator = mockFontsAggregator,
            dimensionsConfig = dimensionsConfig,
            namespace = "com.test",
            themeName = "TestTheme",
            multiplatform = true,
        )

        typographyTokens.forEach { generator.addToken(it) }
        generator.generate()

        val output = outputKt.toString()
        // PlatformTextStyle(includeFontPadding = ...) — Android-only API, в CMP common отсутствует
        Assert.assertFalse(output.contains("PlatformTextStyle"))
        Assert.assertFalse(output.contains("platformStyle"))
        Assert.assertFalse(output.contains("includeFontPadding"))
        // прочие поля TextStyle остаются
        Assert.assertTrue(output.contains("lineHeightStyle = TextStyleDefault.lineHeightStyle"))
    }

    @Test
    fun `TypographyGenerator в Android-режиме эмитит platformStyle с includeFontPadding`() {
        val input = getResourceAsText("inputs/test-typography-input.json")
        val typographyTokens = Serializer.meta.decodeFromString<List<TypographyToken>>(input)
        val outputKt = ByteArrayOutputStream()
        every { dimensionsConfig.multiplier } returns 1f
        every { dimensionsConfig.fromResources } returns false
        val generator = TypographyTokenGenerator(
            outputLocation = KtFileBuilder.OutputLocation.Stream(outputKt),
            outputResDir = mockOutputResDir,
            target = ThemeBuilderTarget.COMPOSE,
            dimensAggregator = mockDimensAggregator,
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme"),
            ktFileBuilderFactory = KtFileBuilderFactory(PackageResolver("com.test")),
            resourceReferenceProvider = ResourceReferenceProvider("thmbldr", "TestTheme"),
            typographyTokenValues = typographyTokenValues,
            fontsAggregator = mockFontsAggregator,
            dimensionsConfig = dimensionsConfig,
            namespace = "com.test",
            themeName = "TestTheme",
            multiplatform = false,
        )

        typographyTokens.forEach { generator.addToken(it) }
        generator.generate()

        val output = outputKt.toString()
        Assert.assertTrue(output.contains("PlatformTextStyle(includeFontPadding = false)"))
        Assert.assertTrue(output.contains("platformStyle = TextStyleDefault.platformStyle"))
    }

    private companion object {
        val fontsAggregatorData = mapOf(
            "sans" to setOf(
                FontData("sans", 300, "normal"),
                FontData("sans", 400, "normal"),
            ),
        )

        val typographyTokenValues = mapOf(
            Tenant.Default to mapOf(
                "screen-l.display.l.normal" to TypographyTokenValue(
                    fontFamilyRef = "fontFamily.sans",
                    fontWeight = 300,
                    fontStyle = "normal",
                    textSize = 128f,
                    letterSpacing = 0.02f,
                    lineHeight = 128f,
                ),
                "screen-l.display.l.bold" to TypographyTokenValue(
                    fontFamilyRef = "fontFamily.sans",
                    fontWeight = 300,
                    fontStyle = "normal",
                    textSize = 128f,
                    letterSpacing = 0.02f,
                    lineHeight = 128f,
                ),
                "screen-s.text.l.normal" to TypographyTokenValue(
                    fontFamilyRef = "fontFamily.sans",
                    fontWeight = 400,
                    fontStyle = "normal",
                    textSize = 124f,
                    letterSpacing = 0.04f,
                    lineHeight = 124f,
                ),
                "screen-m.header.l.normal" to TypographyTokenValue(
                    fontFamilyRef = "fontFamily.sans",
                    fontWeight = 400,
                    fontStyle = "normal",
                    textSize = 124f,
                    letterSpacing = 0.04f,
                    lineHeight = 124f,
                ),
                "screen-m.display.l.normal" to TypographyTokenValue(
                    fontFamilyRef = "fontFamily.sans",
                    fontWeight = 300,
                    fontStyle = "normal",
                    textSize = 96f,
                    letterSpacing = 0.02f,
                    lineHeight = 96f,
                ),
                "screen-s.display.l.normal" to TypographyTokenValue(
                    fontFamilyRef = "fontFamily.sans",
                    fontWeight = 300,
                    fontStyle = "normal",
                    textSize = 72f,
                    letterSpacing = 0.02f,
                    lineHeight = 72f,
                ),
            ),
        )
    }
}
