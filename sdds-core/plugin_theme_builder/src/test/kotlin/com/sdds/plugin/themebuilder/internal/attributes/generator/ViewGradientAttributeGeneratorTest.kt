package com.sdds.plugin.themebuilder.internal.attributes.generator

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewGradientAttributeGenerator
import com.sdds.plugin.themebuilder.internal.utils.FileProvider
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.attrsFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fileWriter
import com.sdds.plugin.themebuilder.internal.utils.getResourceAsText
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkObject
import io.mockk.unmockkObject
import io.mockk.verify
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.File

/**
 * Unit-тесты [ViewGradientAttributeGenerator]
 */
class ViewGradientAttributeGeneratorTest {

    private lateinit var mockOutputResDir: File
    private lateinit var xmlDocumentBuilder: XmlResourcesDocumentBuilder
    private lateinit var underTest: ViewGradientAttributeGenerator

    @Before
    fun before() {
        mockkObject(FileProvider)
        mockOutputResDir = mockk(relaxed = true)
        xmlDocumentBuilder = XmlResourcesDocumentBuilder(
            "thmbldr",
            XmlResourcesDocumentBuilder.DEFAULT_ROOT_ATTRIBUTES,
        )
        underTest = ViewGradientAttributeGenerator(xmlDocumentBuilder, mockOutputResDir, "thmbldr")
    }

    @After
    fun after() {
        clearAllMocks()
        unmockkObject(FileProvider)
    }

    @Test
    fun `ViewColorAttributeGenerator должен генерировать xml-файл с атрибутами`() {
        val outputAttrsXml = ByteArrayOutputStream()
        val attrsXmlFile = mockk<File>(relaxed = true)
        every { attrsXmlFile.fileWriter() } returns outputAttrsXml.writer()
        every { mockOutputResDir.attrsFile("gradient") } returns attrsXmlFile

        underTest.setGradientTokenData(inputAttrs)
        underTest.generate()

        verify { mockOutputResDir.attrsFile("gradient") }

        Assert.assertEquals(
            getResourceAsText("attrs-outputs/gradient-attributes-output.xml"),
            outputAttrsXml.toString(),
        )
    }

    private companion object {
        val inputAttrs = listOf(
            GradientTokenResult.ViewTokenData(
                attrName = "textAccentGradientHover",
                gradientParameters = listOf(
                    GradientTokenResult.ViewTokenData.GradientParameter(
                        attrName = "textAccentGradientHover_position_0",
                        ref = "@dimen/thmbldr_light_text_accent_gradient_hover_position_0",
                    ),
                    GradientTokenResult.ViewTokenData.GradientParameter(
                        attrName = "textAccentGradientHover_position_1",
                        ref = "@dimen/thmbldr_light_text_accent_gradient_hover_position_1",
                    ),
                    GradientTokenResult.ViewTokenData.GradientParameter(
                        attrName = "textAccentGradientHover_color_0",
                        ref = "@dimen/thmbldr_light_text_accent_gradient_hover_color_0",
                    ),
                    GradientTokenResult.ViewTokenData.GradientParameter(
                        attrName = "textAccentGradientHover_color_1",
                        ref = "@dimen/thmbldr_light_text_accent_gradient_hover_color_1",
                    ),
                    GradientTokenResult.ViewTokenData.GradientParameter(
                        attrName = "textAccentGradientHover_angle",
                        ref = "@dimen/thmbldr_light_text_accent_gradient_hover_angle",
                    ),
                ),
                isLight = true,
            ),
            GradientTokenResult.ViewTokenData(
                attrName = "textAccentGradient",
                gradientParameters = listOf(
                    GradientTokenResult.ViewTokenData.GradientParameter(
                        attrName = "textAccentGradient_position_0",
                        ref = "@dimen/thmbldr_light_text_accent_gradient_position_0",
                    ),
                    GradientTokenResult.ViewTokenData.GradientParameter(
                        attrName = "textAccentGradient_position_1",
                        ref = "@dimen/thmbldr_light_text_accent_gradient_position_1",
                    ),
                    GradientTokenResult.ViewTokenData.GradientParameter(
                        attrName = "textAccentGradient_color_0",
                        ref = "@dimen/thmbldr_light_text_accent_gradient_color_0",
                    ),
                    GradientTokenResult.ViewTokenData.GradientParameter(
                        attrName = "textAccentGradient_color_1",
                        ref = "@dimen/thmbldr_light_text_accent_gradient_color_1",
                    ),
                    GradientTokenResult.ViewTokenData.GradientParameter(
                        attrName = "textAccentGradient_angle",
                        ref = "@dimen/thmbldr_light_text_accent_gradient_angle",
                    ),
                ),
                isLight = true,
            ),
        )
    }
}
