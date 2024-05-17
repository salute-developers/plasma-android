package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
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
import io.mockk.verify
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
    private lateinit var mockDeprecatedThemeGenerator: DeprecatedThemeGenerator

    @Before
    fun setUp() {
        mockkObject(
            PropertySpec,
            TypeSpec,
            FileProvider,
        )
        outputKt = ByteArrayOutputStream()
        mockOutputResDir = mockk(relaxed = true)
        mockDeprecatedThemeGenerator = mockk(relaxed = true)
        underTest = ColorTokenGenerator(
            outputLocation = KtFileBuilder.OutputLocation.Stream(outputKt),
            outputResDir = mockOutputResDir,
            target = ThemeBuilderTarget.ALL,
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr"),
            ktFileBuilderFactory = KtFileBuilderFactory("com.test"),
            colorTokenValues = colorTokenValues,
            themeGenerator = mockDeprecatedThemeGenerator,
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
        val colorToken = Serializer.meta.decodeFromString<ColorToken>(input)
        val outputXml = ByteArrayOutputStream()
        val colorsXmlFile = mockk<File>(relaxed = true)
        every { colorsXmlFile.fileWriter() } returns outputXml.writer()
        every { mockOutputResDir.colorsXmlFile() } returns colorsXmlFile

        underTest.addToken(colorToken)
        underTest.generate()

        verify {
            mockDeprecatedThemeGenerator.addXmlColorAttribute(
                "onLightSurfaceTransparentAccent",
                "dark_on_light_surface_transparent_accent",
                DeprecatedThemeGenerator.ThemeMode.DARK,
            )
        }

        assertEquals(getResourceAsText("color-outputs/test-color-output.xml"), outputXml.toString())
        assertEquals(getResourceAsText("color-outputs/TestColorOutputKt.txt"), outputKt.toString())
    }

    private companion object {
        val colorTokenValues = mapOf("dark.on-light.surface.transparent-accent" to "#FFFFFF1F")
    }
}
