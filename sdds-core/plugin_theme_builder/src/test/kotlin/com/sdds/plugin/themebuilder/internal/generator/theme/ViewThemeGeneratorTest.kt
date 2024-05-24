package com.sdds.plugin.themebuilder.internal.generator.theme

import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewThemeGenerator
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.utils.FileProvider
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fileWriter
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.themeXmlFile
import com.sdds.plugin.themebuilder.internal.utils.getResourceAsText
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkObject
import io.mockk.unmockkObject
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.File

/**
 * Unit-тесты [ViewThemeGenerator]
 */
class ViewThemeGeneratorTest {

    private lateinit var mockOutputResDir: File
    private lateinit var underTest: ViewThemeGenerator

    @Before
    fun before() {
        mockkObject(
            PropertySpec,
            TypeSpec,
            FileProvider,
        )
        mockOutputResDir = mockk(relaxed = true)

        underTest = ViewThemeGenerator(
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr"),
            outputResDir = mockOutputResDir,
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
        )
    }

    @Test
    fun `ViewThemeGenerator генерирует тему`() {
        val lightOutputXml = ByteArrayOutputStream()
        val darkOutputXml = ByteArrayOutputStream()

        val themeLightXmlFile = mockk<File>(relaxed = true)
        val themeDarkXmlFile = mockk<File>(relaxed = true)

        every { themeLightXmlFile.fileWriter() } returns lightOutputXml.writer()
        every { themeDarkXmlFile.fileWriter() } returns darkOutputXml.writer()

        every { mockOutputResDir.themeXmlFile() } returns themeLightXmlFile
        every { mockOutputResDir.themeXmlFile("night") } returns themeDarkXmlFile

        underTest.generate(attrs)

        Assert.assertEquals(
            getResourceAsText("theme-outputs/test-theme-output.xml"),
            lightOutputXml.toString(),
        )
        Assert.assertEquals(
            getResourceAsText("theme-outputs/test-dark-theme-output.xml"),
            darkOutputXml.toString(),
        )
    }

    private companion object {
        val attrs = mapOf(
            ColorToken(
                "textPrimary",
                "dark.text.primary",
                setOf(),
                true,
                "",
            ) to "@color/thmbldr_dark_text_primary",
            ColorToken(
                "textPrimary",
                "light.text.primary",
                setOf(),
                true,
                "",
            ) to "@color/thmbldr_light_text_primary",
        )
    }
}
