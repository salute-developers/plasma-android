package com.sdds.plugin.themebuilder.internal.generator.gradient

import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.theme.view.GradientDrawableGenerator
import com.sdds.plugin.themebuilder.internal.utils.FileProvider
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.drawableXmlFile
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
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.File

/**
 * Unit-тесты [GradientDrawableGenerator]
 */
class GradientDrawableGeneratorTest {

    private lateinit var mockOutputResDir: File
    private lateinit var underTest: GradientDrawableGenerator

    @Before
    fun setup() {
        mockkObject(
            PropertySpec,
            TypeSpec,
            FileProvider,
        )
        mockOutputResDir = mockk(relaxed = true)

        underTest = GradientDrawableGenerator(
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
    fun `GradientDrawableGenerator должен генерировать drawable`() {
        val outputSingleXml = ByteArrayOutputStream()
        val outputMultiLayerXml = ByteArrayOutputStream()
        val xmlSingleLayerFile = mockk<File>(relaxed = true)
        val xmlMultiLayerFile = mockk<File>(relaxed = true)
        every { xmlSingleLayerFile.fileWriter() } returns outputSingleXml.writer()
        every { xmlMultiLayerFile.fileWriter() } returns outputMultiLayerXml.writer()
        every { mockOutputResDir.drawableXmlFile("light_gradient_accent_layer_0") } returns xmlSingleLayerFile
        every { mockOutputResDir.drawableXmlFile("light_gradient_accent") } returns xmlMultiLayerFile

        val singleDrawableRef = underTest.addDrawable(
            drawableName = "light_gradient_accent_layer_0",
            styleRef = "@style/Thmbldr.TestTheme.Gradient.LightGradientAccentLayer0",
        )

        val layerDrawableRef = underTest.addLayerListDrawable(
            drawableName = "light_gradient_accent",
            drawableRefs = listOf(
                "@drawable/light_gradient_accent_layer_0",
                "@drawable/light_gradient_accent_layer_1",
                "@drawable/light_gradient_accent_layer_2",
            ),
        )

        underTest.generate()

        Assert.assertEquals("@drawable/light_gradient_accent_layer_0", singleDrawableRef)
        Assert.assertEquals("@drawable/light_gradient_accent", layerDrawableRef)

        Assert.assertEquals(
            getResourceAsText("gradient-outputs/test-gradient-drawable-output.xml"),
            outputSingleXml.toString(),
        )

        Assert.assertEquals(
            getResourceAsText("gradient-outputs/test-gradient-drawable-output.xml"),
            outputSingleXml.toString(),
        )
    }
}
