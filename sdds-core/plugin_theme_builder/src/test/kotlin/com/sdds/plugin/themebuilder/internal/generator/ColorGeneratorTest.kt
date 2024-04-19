package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.utils.FileProvider
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.colorsXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fileWriter
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
 * Unit тесты [ColorGenerator]
 * @author Малышев Александр on 13.03.2024
 */
class ColorGeneratorTest {

    private lateinit var outputKt: ByteArrayOutputStream
    private lateinit var mockOutputResDir: File
    private lateinit var underTest: ColorGenerator

    @Before
    fun setUp() {
        mockkObject(
            PropertySpec,
            TypeSpec,
            FileProvider,
        )
        outputKt = ByteArrayOutputStream()
        mockOutputResDir = mockk(relaxed = true)
        underTest = ColorGenerator(
            outputLocation = KtFileBuilder.OutputLocation.Stream(outputKt),
            outputResDir = mockOutputResDir,
            target = ThemeBuilderTarget.ALL,
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr"),
            ktFileBuilderFactory = KtFileBuilderFactory("com.test"),
            colorTokenValues = mapOf("dark.on-light.surface.transparent-accent" to "#FFFFFF1F"),
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
        val colorToken = Serializer.instance.decodeFromString<ColorToken>(input)
        val outputXml = ByteArrayOutputStream()
        val colorsXmlFile = mockk<File>(relaxed = true)
        every { colorsXmlFile.fileWriter() } returns outputXml.writer()
        every { mockOutputResDir.colorsXmlFile() } returns colorsXmlFile

        underTest.addToken(colorToken)
        underTest.generate()

        assertEquals(getResourceAsText("color-outputs/test-color-output.xml"), outputXml.toString())
        assertEquals(getResourceAsText("color-outputs/TestColorOutputKt.txt"), outputKt.toString())
    }
}
