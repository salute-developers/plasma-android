package com.sdds.plugin.themebuilder.internal.attributes.generator

import com.sdds.plugin.themebuilder.internal.attributes.data.AttributeData
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewColorAttributeGenerator
import com.sdds.plugin.themebuilder.internal.utils.FileProvider
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.attrsFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fileWriter
import com.sdds.plugin.themebuilder.internal.utils.getResourceAsText
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
 * Unit-тесты [ViewColorAttributeGenerator]
 */
class ViewColorAttributeGeneratorTest {

    private lateinit var mockOutputResDir: File
    private lateinit var xmlDocumentBuilder: XmlResourcesDocumentBuilder
    private lateinit var underTest: ViewColorAttributeGenerator

    @Before
    fun before() {
        mockkObject(FileProvider)
        mockOutputResDir = mockk(relaxed = true)
        xmlDocumentBuilder = XmlResourcesDocumentBuilder(
            "thmbldr",
            XmlResourcesDocumentBuilder.DEFAULT_ROOT_ATTRIBUTES,
        )
        underTest = ViewColorAttributeGenerator(xmlDocumentBuilder, mockOutputResDir)
    }

    @After
    fun after() {
        clearAllMocks()
        unmockkObject(FileProvider)
    }

    @Test
    fun `XmlAttributeGenerator должен генерировать xml-файл с атрибутами`() {
        val outputAttrsXml = ByteArrayOutputStream()
        val attrsXmlFile = mockk<File>(relaxed = true)
        every { attrsXmlFile.fileWriter() } returns outputAttrsXml.writer()
        every { mockOutputResDir.attrsFile() } returns attrsXmlFile

        underTest.generate(AttributeData(colors = inputAttrs), "thmbldr")

        Assert.assertEquals(
            getResourceAsText("attrs-outputs/attributes-output.xml"),
            outputAttrsXml.toString(),
        )
    }

    private companion object {
        val inputAttrs = listOf("textPrimary", "textTertiary")
    }
}