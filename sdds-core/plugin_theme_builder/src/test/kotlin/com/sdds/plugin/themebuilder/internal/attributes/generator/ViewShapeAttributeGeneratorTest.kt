package com.sdds.plugin.themebuilder.internal.attributes.generator

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.generator.data.ShapeTokenResult
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewShapeAttributeGenerator
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
 * Unit-тесты [ViewShapeAttributeGenerator]
 */
class ViewShapeAttributeGeneratorTest {

    private lateinit var mockOutputResDir: File
    private lateinit var xmlDocumentBuilder: XmlResourcesDocumentBuilder
    private lateinit var underTest: ViewShapeAttributeGenerator

    @Before
    fun before() {
        mockkObject(FileProvider)
        mockOutputResDir = mockk(relaxed = true)
        xmlDocumentBuilder = XmlResourcesDocumentBuilder(
            "thmbldr",
            XmlResourcesDocumentBuilder.DEFAULT_ROOT_ATTRIBUTES,
        )
        underTest = ViewShapeAttributeGenerator(xmlDocumentBuilder, mockOutputResDir, "thmbldr")
    }

    @After
    fun after() {
        clearAllMocks()
        unmockkObject(FileProvider)
    }

    @Test
    fun `ViewShapeAttributeGenerator должен генерировать xml-файл с атрибутами`() {
        val outputAttrsXml = ByteArrayOutputStream()
        val attrsXmlFile = mockk<File>(relaxed = true)
        every { attrsXmlFile.fileWriter() } returns outputAttrsXml.writer()
        every { mockOutputResDir.attrsFile("shape") } returns attrsXmlFile

        underTest.setShapeTokenData(shapeAttrs)
        underTest.generate()

        verify { mockOutputResDir.attrsFile("shape") }

        Assert.assertEquals(
            getResourceAsText("attrs-outputs/shape-attributes-output.xml"),
            outputAttrsXml.toString(),
        )
    }

    private companion object {
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
