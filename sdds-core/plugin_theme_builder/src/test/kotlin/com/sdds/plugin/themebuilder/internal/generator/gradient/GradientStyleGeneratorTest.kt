package com.sdds.plugin.themebuilder.internal.generator.gradient

import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.theme.view.GradientStyleGenerator
import com.sdds.plugin.themebuilder.internal.utils.FileProvider
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fileWriter
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.gradientStylesXmlFile
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
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.File

/**
 * Unit-тесты [GradientStyleGenerator]
 */
class GradientStyleGeneratorTest {

    private lateinit var mockOutputResDir: File
    private lateinit var underTest: GradientStyleGenerator

    @Before
    fun setup() {
        mockkObject(
            PropertySpec,
            TypeSpec,
            FileProvider,
        )
        mockOutputResDir = mockk(relaxed = true)

        underTest = GradientStyleGenerator(
            outputResDir = mockOutputResDir,
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory(
                tokenPrefix = "thmbldr",
                themeName = "TestTheme",
            ),
            resourceReferenceProvider = ResourceReferenceProvider(
                resourcePrefix = "thmbldr",
                themeName = "TestTheme",
            ),
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
    fun `GradientStyleGenerator должен генерировать стиль`() {
        val outputXml = ByteArrayOutputStream()
        val xmlFile = mockk<File>(relaxed = true)
        every { xmlFile.fileWriter() } returns outputXml.writer()
        every { mockOutputResDir.gradientStylesXmlFile() } returns xmlFile

        val firstStyleRef = underTest.addStyle(
            nameSnakeCase = "light_gradient_accent_layer_0",
            gradientParameters = mapOf(
                "sd_gradientType" to "linear",
                "sd_angle" to "@string/light_gradient_accent_angle_layer_0",
                "sd_colors" to "@array/light_gradient_accent_colors_layer_0",
                "sd_stops" to "@array/light_gradient_accent_stops_layer_0",
            ),
            description = "Accent Gradient Слой 0",
        )

        val secondStyleRef = underTest.addStyle(
            nameSnakeCase = "light_gradient_accent_layer_1",
            gradientParameters = mapOf(
                "sd_gradientType" to "radial",
                "sd_radius" to "@string/light_gradient_accent_radius_layer_1",
                "sd_centerX" to "@string/light_gradient_accent_center_x_layer_1",
                "sd_centerY" to "@string/light_gradient_accent_center_y_layer_1",
                "sd_colors" to "@array/light_gradient_accent_colors_layer_1",
                "sd_stops" to "@array/light_gradient_accent_stops_layer_1",
            ),
            description = "Accent Gradient Слой 1",
        )

        underTest.generate()

        Assert.assertEquals(
            "@style/Thmbldr.TestTheme.Gradient.LightGradientAccentLayer0",
            firstStyleRef,
        )

        Assert.assertEquals(
            "@style/Thmbldr.TestTheme.Gradient.LightGradientAccentLayer1",
            secondStyleRef,
        )

        Assert.assertEquals(
            getResourceAsText("gradient-outputs/test-gradient-styles-output.xml"),
            outputXml.toString(),
        )
    }
}