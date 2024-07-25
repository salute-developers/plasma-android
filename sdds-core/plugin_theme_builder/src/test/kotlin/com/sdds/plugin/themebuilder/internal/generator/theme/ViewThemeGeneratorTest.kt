package com.sdds.plugin.themebuilder.internal.generator.theme

import com.sdds.plugin.themebuilder.ViewThemeParent
import com.sdds.plugin.themebuilder.ViewThemeType
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.ShapeTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.TypographyTokenResult
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
import io.mockk.verify
import org.junit.After
import org.junit.Assert.assertEquals
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
    fun `ViewThemeGenerator генерирует дефолтную и night тему без наследников`() {
        underTest = ViewThemeGenerator(
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme"),
            outputResDir = mockOutputResDir,
            viewThemeParents = emptyList(),
            themeName = "test_Theme",
            resPrefix = "thmbldr",
        )

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
        underTest.setTypographyTokenData(typographyAttrs)
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

    @Test
    fun `ViewThemeGenerator генерирует дефолтную и night тему наследуясь от Material темы`() {
        underTest = ViewThemeGenerator(
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme"),
            outputResDir = mockOutputResDir,
            viewThemeParents = listOf(
                ViewThemeParent(
                    "Theme.MaterialComponents.DayNight",
                    "MaterialComponents.DayNight",
                    ViewThemeType.DARK_LIGHT,
                ),
            ),
            themeName = "test_Theme",
            resPrefix = "thmbldr",
        )

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
        underTest.setTypographyTokenData(typographyAttrs)
        underTest.generate()

        assertEquals(
            getResourceAsText("theme-outputs/test-material-daynight-theme-output.xml"),
            lightOutputXml.toString(),
        )
        assertEquals(
            getResourceAsText("theme-outputs/test-material-daynight-dark-theme-output.xml"),
            darkOutputXml.toString(),
        )
    }

    @Test
    fun `ViewThemeGenerator генерирует только дефолтную тему с темными токенами наследуясь от Material темы`() {
        underTest = ViewThemeGenerator(
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme"),
            outputResDir = mockOutputResDir,
            viewThemeParents = listOf(
                ViewThemeParent(
                    "Theme.MaterialComponents",
                    "MaterialComponents",
                    ViewThemeType.DARK,
                ),
            ),
            themeName = "test_Theme",
            resPrefix = "thmbldr",
        )

        val lightOutputXml = ByteArrayOutputStream()
        val themeLightXmlFile = mockk<File>(relaxed = true)
        every { themeLightXmlFile.fileWriter() } returns lightOutputXml.writer()
        every { mockOutputResDir.themeXmlFile() } returns themeLightXmlFile

        underTest.setShapeTokenData(shapeAttrs)
        underTest.setColorTokenData(colorAttrs)
        underTest.setTypographyTokenData(typographyAttrs)
        underTest.generate()

        verify(exactly = 0) { mockOutputResDir.themeXmlFile("night") }

        assertEquals(
            getResourceAsText("theme-outputs/test-material-dark-theme-output.xml"),
            lightOutputXml.toString(),
        )
    }

    @Test
    fun `ViewThemeGenerator генерирует только дефолтную тему со светлыми токенами наследуясь от Material темы`() {
        underTest = ViewThemeGenerator(
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme"),
            outputResDir = mockOutputResDir,
            viewThemeParents = listOf(
                ViewThemeParent(
                    "Theme.MaterialComponents.Light.NoDialog",
                    "MaterialComponents.Light.NoDialog",
                    ViewThemeType.LIGHT,
                ),
            ),
            themeName = "test_Theme",
            resPrefix = "thmbldr",
        )

        val lightOutputXml = ByteArrayOutputStream()
        val themeLightXmlFile = mockk<File>(relaxed = true)
        every { themeLightXmlFile.fileWriter() } returns lightOutputXml.writer()
        every { mockOutputResDir.themeXmlFile() } returns themeLightXmlFile

        underTest.setShapeTokenData(shapeAttrs)
        underTest.setColorTokenData(colorAttrs)
        underTest.setTypographyTokenData(typographyAttrs)
        underTest.generate()

        verify(exactly = 0) { mockOutputResDir.themeXmlFile("night") }

        assertEquals(
            getResourceAsText("theme-outputs/test-material-light-theme-output.xml"),
            lightOutputXml.toString(),
        )
    }

    @Test
    fun `ViewThemeGenerator генерирует несколько тем без конфликтов промежуточных стилей`() {
        underTest = ViewThemeGenerator(
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme"),
            outputResDir = mockOutputResDir,
            viewThemeParents = listOf(
                ViewThemeParent(
                    "Theme.MaterialComponents.Light.NoDialog",
                    "MaterialComponents.Light.NoDialog",
                    ViewThemeType.LIGHT,
                ),
                ViewThemeParent(
                    "Theme.MaterialComponents.DayNight",
                    "MaterialComponents.DayNight",
                    ViewThemeType.DARK_LIGHT,
                ),
                ViewThemeParent(
                    "Theme.AppCompat.DayNight",
                    "AppCompat.DayNight",
                    ViewThemeType.DARK_LIGHT,
                ),
            ),
            themeName = "test_Theme",
            resPrefix = "thmbldr",
        )

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
        underTest.setTypographyTokenData(typographyAttrs)
        underTest.generate()

        assertEquals(
            getResourceAsText("theme-outputs/test-many-daynight-theme-output.xml"),
            lightOutputXml.toString(),
        )

        assertEquals(
            getResourceAsText("theme-outputs/test-many-daynight-dark-theme-output.xml"),
            darkOutputXml.toString(),
        )
    }

    private companion object {
        val colorAttrs = ColorTokenResult.TokenData(
            light = mapOf("textPrimary" to "@color/thmbldr_light_text_primary"),
            dark = mapOf("textPrimary" to "@color/thmbldr_dark_text_primary"),
        )

        val shapeAttrs = listOf(
            ShapeTokenResult.TokenData(
                attrName = "shapeRoundXs",
                tokenRefName = "@style/Thmbldr.TestTheme.Shape.Round.Xs",
            ),
            ShapeTokenResult.TokenData(
                attrName = "shapeRoundXxs",
                tokenRefName = "@style/Thmbldr.TestTheme.Shape.Round.Xxs",
            ),
        )

        val typographyAttrs = TypographyTokenResult.ViewTokenData(
            mapOf(
                "typographyDisplayLNormal" to "@style/Thmbldr.TestTheme.Typography.DisplayLNormal",
                "typographyHeaderH3Bold" to "@style/Thmbldr.TestTheme.Typography.HeaderH3Bold",
            ),
        )
    }
}
