package com.sdds.plugin.themebuilder.internal.generator.theme

import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.ShapeTokenResult
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewThemeGenerator
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
            themeName = "Theme",
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

        underTest.setShapeTokenData(shapeAttrs)
        underTest.setColorTokenData(colorAttrs)
        underTest.generate()

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
        val colorAttrs = listOf(
            ColorTokenResult.TokenData(
                attrName = "textPrimary",
                tokenRefName = "@color/thmbldr_dark_text_primary",
                false,
            ),
            ColorTokenResult.TokenData(
                attrName = "textPrimary",
                tokenRefName = "@color/thmbldr_light_text_primary",
                true,
            ),
        )

        val shapeAttrs = listOf(
            ShapeTokenResult.TokenData(
                attrName = "shapeRoundXs",
                tokenRefName = "@style/Thmbldr.Shape.Round.Xs",
            ),
            ShapeTokenResult.TokenData(
                attrName = "shapeRoundXxs",
                tokenRefName = "@style/Thmbldr.Shape.Round.Xxs",
            ),
        )
    }
}
