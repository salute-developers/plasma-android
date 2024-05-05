package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.core.utils.FileHelper
import com.sdds.plugin.core.utils.FileHelper.fileWriter
import com.sdds.plugin.themebuilder.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.theme.ThemeGenerator
import com.sdds.plugin.themebuilder.internal.utils.FileProvider
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.themeXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.getResourceAsText
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkObject
import io.mockk.unmockkObject
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.File

/**
 * Unit тесты [ThemeGenerator]
 */
class ThemeGeneratorTest {

    private lateinit var mockOutputResDir: File
    private lateinit var underTest: ThemeGenerator
    private lateinit var resourceReferenceProvider: ResourceReferenceProvider

    @Before
    fun before() {
        mockkObject(
            PropertySpec,
            TypeSpec,
            FileProvider,
            FileHelper,
        )
        mockOutputResDir = mockk(relaxed = true)
        resourceReferenceProvider = ResourceReferenceProvider("thmbldr")

        underTest = ThemeGenerator(
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr"),
            resourceReferenceProvider = resourceReferenceProvider,
            target = ThemeBuilderTarget.ALL,
            outputResDir = mockOutputResDir,
            parentThemePrefix = "sdds",
            parentThemeName = "Sdds.Theme",
        )
    }

    @After
    fun after() {
        clearAllMocks(true)
        unmockkObject(
            PropertySpec,
            TypeSpec,
            FileProvider,
            FileHelper,
        )
    }

    @Test
    fun `ThemeGenerator добавляет атрибуты и генерирует тему`() {
        val lightOutputXml = ByteArrayOutputStream()
        val darkOutputXml = ByteArrayOutputStream()

        val themeLightXmlFile = mockk<File>(relaxed = true)
        val themeDarkXmlFile = mockk<File>(relaxed = true)

        every { themeLightXmlFile.fileWriter() } returns lightOutputXml.writer()
        every { themeDarkXmlFile.fileWriter() } returns darkOutputXml.writer()

        every { mockOutputResDir.themeXmlFile() } returns themeLightXmlFile
        every { mockOutputResDir.themeXmlFile("night") } returns themeDarkXmlFile

        underTest.addXmlColorAttribute(
            "textPrimary",
            "light_text_primary",
            ThemeGenerator.ThemeMode.LIGHT,
        )
        underTest.addXmlColorAttribute(
            "textPrimary",
            "dark_text_primary",
            ThemeGenerator.ThemeMode.DARK,
        )
        underTest.generate()

        assertEquals(
            getResourceAsText("theme-outputs/test-theme-output.xml"),
            lightOutputXml.toString(),
        )
        assertEquals(
            getResourceAsText("theme-outputs/test-dark-theme-output.xml"),
            darkOutputXml.toString(),
        )
    }
}
