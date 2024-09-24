package com.sdds.plugin.themebuilder.internal.generator.theme

import com.sdds.plugin.themebuilder.ResourcePrefixConfig
import com.sdds.plugin.themebuilder.ViewThemeParent
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult
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
    fun `ViewThemeGenerator генерирует тему без парентов`() {
        underTest = ViewThemeGenerator(
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme"),
            outputResDir = mockOutputResDir,
            viewThemeParents = emptyList(),
            themeName = "test_Theme",
            resPrefixConfig = ResourcePrefixConfig(
                resourcePrefix = "thmbldr",
                shouldGenerateResPrefixStyle = true,
            ),
            viewGradientGenerator = mockk(relaxed = true) {
                every {
                    addGradient(gradientAttrs.dark["gradientAccent"]!!)
                } returns "@drawable/Thmbldr.TestTheme.Gradient.DarkGradientAccent"
                every {
                    addGradient(gradientAttrs.light["gradientAccent"]!!)
                } returns "@drawable/Thmbldr.TestTheme.Gradient.LightGradientAccent"
            },
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
        underTest.setGradientTokenData(gradientAttrs)
        underTest.setTypographyTokenData(typographyAttrs)
        underTest.generate()

        assertEquals(
            getResourceAsText("theme-outputs/test-theme-output.xml"),
            lightOutputXml.toString(),
        )
        assertEquals(
            getResourceAsText("theme-outputs/test-night-theme-output.xml"),
            darkOutputXml.toString(),
        )
    }

    @Test
    fun `ViewThemeGenerator генерирует темы наследуясь от Material темы`() {
        underTest = ViewThemeGenerator(
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme"),
            outputResDir = mockOutputResDir,
            viewThemeParents = listOf(
                ViewThemeParent(
                    themePrefix = "Theme.MaterialComponents",
                    childSuffix = "MaterialComponents",
                ),
            ),
            themeName = "test_Theme",
            resPrefixConfig = ResourcePrefixConfig(
                resourcePrefix = "thmbldr",
                shouldGenerateResPrefixStyle = true,
            ),
            viewGradientGenerator = mockk(relaxed = true) {
                every {
                    addGradient(gradientAttrs.dark["gradientAccent"]!!)
                } returns "@drawable/Thmbldr.TestTheme.Gradient.DarkGradientAccent"
                every {
                    addGradient(gradientAttrs.light["gradientAccent"]!!)
                } returns "@drawable/Thmbldr.TestTheme.Gradient.LightGradientAccent"
            },
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
        underTest.setGradientTokenData(gradientAttrs)
        underTest.setTypographyTokenData(typographyAttrs)
        underTest.generate()

        assertEquals(
            getResourceAsText("theme-outputs/test-material-theme-output.xml"),
            lightOutputXml.toString(),
        )
        assertEquals(
            getResourceAsText("theme-outputs/test-material-night-theme-output.xml"),
            darkOutputXml.toString(),
        )
    }

    @Test
    fun `ViewThemeGenerator генерирует несколько тем без конфликтов промежуточных стилей`() {
        underTest = ViewThemeGenerator(
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme"),
            outputResDir = mockOutputResDir,
            viewThemeParents = listOf(
                ViewThemeParent(
                    themePrefix = "Theme.MaterialComponents",
                    themeSuffix = "Dialog",
                    childSuffix = "MaterialComponents.Dialog",
                ),
                ViewThemeParent(
                    themePrefix = "Theme.MaterialComponents",
                    themeSuffix = "NoActionBar",
                    childSuffix = "MaterialComponents.NoActionBar",
                ),
                ViewThemeParent(
                    themePrefix = "Theme.AppCompat",
                    themeSuffix = "NoActionBar",
                    childSuffix = "AppCompat.NoActionBar",
                ),
            ),
            themeName = "test_Theme",
            resPrefixConfig = ResourcePrefixConfig(
                resourcePrefix = "thmbldr",
                shouldGenerateResPrefixStyle = true,
            ),
            viewGradientGenerator = mockk(relaxed = true) {
                every {
                    addGradient(gradientAttrs.dark["gradientAccent"]!!)
                } returns "@drawable/Thmbldr.TestTheme.Gradient.DarkGradientAccent"
                every {
                    addGradient(gradientAttrs.light["gradientAccent"]!!)
                } returns "@drawable/Thmbldr.TestTheme.Gradient.LightGradientAccent"
            },
        )

        val defaultOutputXml = ByteArrayOutputStream()
        val nightOutputXml = ByteArrayOutputStream()
        val themeDefaultXmlFile = mockk<File>(relaxed = true)
        val themeNightXmlFile = mockk<File>(relaxed = true)
        every { themeDefaultXmlFile.fileWriter() } returns defaultOutputXml.writer()
        every { themeNightXmlFile.fileWriter() } returns nightOutputXml.writer()
        every { mockOutputResDir.themeXmlFile() } returns themeDefaultXmlFile
        every { mockOutputResDir.themeXmlFile("night") } returns themeNightXmlFile

        underTest.setShapeTokenData(shapeAttrs)
        underTest.setColorTokenData(colorAttrs)
        underTest.setGradientTokenData(gradientAttrs)
        underTest.setTypographyTokenData(typographyAttrs)
        underTest.generate()

        assertEquals(
            getResourceAsText("theme-outputs/test-many-theme-output.xml"),
            defaultOutputXml.toString(),
        )

        assertEquals(
            getResourceAsText("theme-outputs/test-many-night-theme-output.xml"),
            nightOutputXml.toString(),
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

        val gradientAttrs: GradientTokenResult.ViewTokenData = GradientTokenResult.ViewTokenData(
            light = mapOf(
                "gradientAccent" to GradientTokenResult.ViewTokenData.Gradient(
                    nameSnakeCase = "light_gradient_accent",
                    layers = listOf(
                        GradientTokenResult.ViewTokenData.Gradient.Layer.Linear(
                            angle = "@string/light_gradient_accent_angle",
                            colors = "@array/light_gradient_accent_colors",
                            stops = "@array/light_gradient_accent_stops",
                        ),
                    ),
                    description = "Accent Gradient",
                    isTextGradient = false,
                ),
            ),
            dark = mapOf(
                "gradientAccent" to GradientTokenResult.ViewTokenData.Gradient(
                    nameSnakeCase = "dark_gradient_accent",
                    layers = listOf(
                        GradientTokenResult.ViewTokenData.Gradient.Layer.Linear(
                            angle = "@string/dark_gradient_accent_angle",
                            colors = "@array/dark_gradient_accent_colors",
                            stops = "@array/dark_gradient_accent_stops",
                        ),
                    ),
                    description = "Accent Gradient",
                    isTextGradient = false,
                ),
            ),
        )
    }
}
