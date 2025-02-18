package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.theme.ThemeGenerator
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.utils.FileProvider
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.colorsXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fileWriter
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
 * Unit тесты [ColorTokenGenerator]
 * @author Малышев Александр on 13.03.2024
 */
class ColorTokenGeneratorTest {

    private lateinit var outputKt: ByteArrayOutputStream
    private lateinit var mockOutputResDir: File
    private lateinit var underTest: ColorTokenGenerator
    private lateinit var mockThemeGenerator: ThemeGenerator

    @Before
    fun setUp() {
        mockkObject(
            PropertySpec,
            TypeSpec,
            FileProvider,
        )
        outputKt = ByteArrayOutputStream()
        mockOutputResDir = mockk(relaxed = true)
        mockThemeGenerator = mockk(relaxed = true)
        underTest = ColorTokenGenerator(
            outputLocation = KtFileBuilder.OutputLocation.Stream(outputKt),
            outputResDir = mockOutputResDir,
            target = ThemeBuilderTarget.ALL,
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme"),
            ktFileBuilderFactory = KtFileBuilderFactory(PackageResolver("com.test")),
            colorTokenValues = colorTokenValues,
            resourceReferenceProvider = ResourceReferenceProvider("thmbldr", "TestTheme"),
            palette = palette,
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
    fun `ColorGenerator добавляет токен и генерирует файлы для compose и view system`() {
        val input = getResourceAsText("inputs/test-color-input.json")
        val colors = Serializer.meta.decodeFromString<List<ColorToken>>(input)
        val outputXml = ByteArrayOutputStream()
        val colorsXmlFile = mockk<File>(relaxed = true)
        every { colorsXmlFile.fileWriter() } returns outputXml.writer()
        every { mockOutputResDir.colorsXmlFile() } returns colorsXmlFile

        colors.forEach(underTest::addToken)
        underTest.generate()

        assertEquals(getResourceAsText("color-outputs/test-color-output.xml"), outputXml.toString())
        assertEquals(getResourceAsText("color-outputs/TestColorOutputKt.txt"), outputKt.toString())
    }

    private companion object {
        val colorTokenValues = mapOf(
            "dark.on-light.surface.transparent-accent" to "#FFFFFF1F",
            "dark.surface.transparent-accent" to "[general.green.1000]",
        )
        val palette = mapOf(
            "green" to mapOf("1000" to "#EEEEEE1F"),
        )
    }
}
