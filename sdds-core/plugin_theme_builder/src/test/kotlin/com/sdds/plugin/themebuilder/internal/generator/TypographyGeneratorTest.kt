package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.token.TypographyToken
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
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.File

/**
 * Unit тесты [TypographyGenerator]
 * @author Малышев Александр on 13.03.2024
 */
class TypographyGeneratorTest {

    private lateinit var outputKt: ByteArrayOutputStream
    private lateinit var mockOutputResDir: File
    private lateinit var mockDimensAggregator: DimensAggregator
    private lateinit var underTest: TypographyGenerator

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
        underTest = TypographyGenerator(
            outputLocation = KtFileBuilder.OutputLocation.Stream(outputKt),
            outputResDir = mockOutputResDir,
            target = ThemeBuilderTarget.ALL,
            dimensAggregator = mockDimensAggregator,
            xmlBuilderFactory = XmlDocumentBuilderFactory("thmbldr"),
            ktFileBuilderFactory = KtFileBuilderFactory("com.test"),
            resourceReferenceProvider = ResourceReferenceProvider("thmbldr"),
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
        val typographyTokens = Serializer.instance.decodeFromString<List<TypographyToken>>(input)
        val outputAppearancesMediumXml = ByteArrayOutputStream()
        val outputAppearancesSmallXml = ByteArrayOutputStream()
        val outputAppearancesLargeXml = ByteArrayOutputStream()
        val outputTypographyXml = ByteArrayOutputStream()
        val appearancesMediumXmlFile = mockk<File>(relaxed = true)
        val appearancesSmallXmlFile = mockk<File>(relaxed = true)
        val appearancesLargeXmlFile = mockk<File>(relaxed = true)
        val typographyXmlFile = mockk<File>(relaxed = true)
        every { appearancesMediumXmlFile.fileWriter() } returns outputAppearancesMediumXml.writer()
        every { appearancesSmallXmlFile.fileWriter() } returns outputAppearancesSmallXml.writer()
        every { appearancesLargeXmlFile.fileWriter() } returns outputAppearancesLargeXml.writer()
        every { typographyXmlFile.fileWriter() } returns outputTypographyXml.writer()
        every { mockOutputResDir.textAppearancesXmlFile("") } returns appearancesMediumXmlFile
        every { mockOutputResDir.textAppearancesXmlFile("small") } returns appearancesSmallXmlFile
        every { mockOutputResDir.textAppearancesXmlFile("large") } returns appearancesLargeXmlFile
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
            getResourceAsText("typography-outputs/test-appearances-output.xml"),
            outputAppearancesMediumXml.toString(),
        )
        assertEquals(
            getResourceAsText("typography-outputs/test-appearances-small-output.xml"),
            outputAppearancesSmallXml.toString(),
        )
        assertEquals(
            getResourceAsText("typography-outputs/test-appearances-large-output.xml"),
            outputAppearancesLargeXml.toString(),
        )
        assertEquals(getResourceAsText("typography-outputs/TestTypographyOutputKt.txt"), outputKt.toString())
    }
}
