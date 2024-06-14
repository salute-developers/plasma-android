package com.sdds.plugin.themebuilder.internal.attributes.generator

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.generator.data.TypographyTokenResult
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewTypographyAttributeGenerator
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
 * Unit-тесты [ViewTypographyAttributeGenerator]
 */
class ViewTypographyAttributeGeneratorTest {

    private lateinit var mockOutputResDir: File
    private lateinit var xmlDocumentBuilder: XmlResourcesDocumentBuilder
    private lateinit var underTest: ViewTypographyAttributeGenerator

    @Before
    fun before() {
        mockkObject(FileProvider)
        mockOutputResDir = mockk(relaxed = true)
        xmlDocumentBuilder = XmlResourcesDocumentBuilder(
            "thmbldr",
            XmlResourcesDocumentBuilder.DEFAULT_ROOT_ATTRIBUTES,
        )
        underTest =
            ViewTypographyAttributeGenerator(xmlDocumentBuilder, mockOutputResDir, "thmbldr")
    }

    @After
    fun after() {
        clearAllMocks()
        unmockkObject(FileProvider)
    }

    @Test
    fun `ViewTypographyAttributeGenerator должен генерировать xml-файл с атрибутами`() {
        val outputAttrsXml = ByteArrayOutputStream()
        val attrsXmlFile = mockk<File>(relaxed = true)
        every { attrsXmlFile.fileWriter() } returns outputAttrsXml.writer()
        every { mockOutputResDir.attrsFile("typography") } returns attrsXmlFile

        underTest.setTypographyTokenData(typographyAttrs)
        underTest.generate()

        verify { mockOutputResDir.attrsFile("typography") }

        Assert.assertEquals(
            getResourceAsText("attrs-outputs/typography-attributes-output.xml"),
            outputAttrsXml.toString(),
        )
    }

    private companion object {
        val typographyAttrs = TypographyTokenResult.ViewTokenData(
            mapOf(
                "typographyDisplayLNormal" to "@style/Thmbldr.Typography.DisplayLNormal",
                "typographyHeaderH3Bold" to "@style/Thmbldr.Typography.HeaderH3Bold",
            ),
        )
    }
}
