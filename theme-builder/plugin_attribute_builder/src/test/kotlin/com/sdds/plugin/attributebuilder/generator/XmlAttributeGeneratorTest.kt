package com.sdds.plugin.attributebuilder.generator

import com.sdds.plugin.attributebuilder.internal.builder.XmlDocumentBuilder
import com.sdds.plugin.attributebuilder.internal.data.AttributeData
import com.sdds.plugin.attributebuilder.internal.generator.XmlAttributeGenerator
import com.sdds.plugin.attributebuilder.internal.utils.FileProvider
import com.sdds.plugin.attributebuilder.internal.utils.FileProvider.attrsFile
import com.sdds.plugin.attributebuilder.utils.getResourceAsText
import com.sdds.plugin.core.utils.FileHelper
import com.sdds.plugin.core.utils.FileHelper.fileWriter
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
 * Unit-тесты [XmlAttributeGenerator]
 */
class XmlAttributeGeneratorTest {

    private lateinit var mockOutputResDir: File
    private lateinit var xmlDocumentBuilder: XmlDocumentBuilder
    private lateinit var underTest: XmlAttributeGenerator

    @Before
    fun before() {
        mockkObject(
            PropertySpec,
            TypeSpec,
            FileProvider,
            FileHelper,
        )
        mockOutputResDir = mockk(relaxed = true)
        xmlDocumentBuilder = XmlDocumentBuilder()
        underTest = XmlAttributeGenerator(xmlDocumentBuilder, mockOutputResDir)
    }

    @After
    fun after() {
        clearAllMocks()
        unmockkObject(
            PropertySpec,
            TypeSpec,
            FileProvider,
            FileHelper,
        )
    }

    @Test
    fun `XmlAttributeGenerator должен генерировать xml-файл с атрибутами`() {
        val outputAttrsXml = ByteArrayOutputStream()
        val attrsXmlFile = mockk<File>(relaxed = true)
        every { attrsXmlFile.fileWriter() } returns outputAttrsXml.writer()
        every { mockOutputResDir.attrsFile() } returns attrsXmlFile

        underTest.generate(AttributeData(colors = inputAttrs), "sdds")

        Assert.assertEquals(
            getResourceAsText("attrs-outputs/attributes-output.xml"),
            outputAttrsXml.toString(),
        )
    }

    private companion object {
        val inputAttrs = listOf("textPrimary", "textTertiary")
    }
}
