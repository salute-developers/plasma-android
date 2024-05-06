package com.sdds.plugin.attributebuilder.generator

import com.sdds.plugin.attributebuilder.internal.builder.XmlDocumentBuilder
import com.sdds.plugin.attributebuilder.internal.data.AttributeData
import com.sdds.plugin.attributebuilder.internal.generator.XmlAttributeGenerator
import io.mockk.clearAllMocks
import io.mockk.mockk
import org.junit.After
import org.junit.Before
import org.junit.Test
import java.io.File

class XmlAttributeGeneratorTest {

    private lateinit var mockOutputResDir: File
    private lateinit var mockXmlDocumentBuilder: XmlDocumentBuilder
    private lateinit var underTest: XmlAttributeGenerator

    @Before
    fun before() {
        mockOutputResDir = mockk(relaxed = true)
        mockXmlDocumentBuilder = mockk(relaxed = true)
        underTest = XmlAttributeGenerator(mockXmlDocumentBuilder, mockOutputResDir)
    }

    @After
    fun after() {
        clearAllMocks()
    }

    @Test
    fun `XmlAttributeGenerator должен генерировать xml атрибуты`() {
        underTest.generate(AttributeData(colors = inputAttrs), "sdds")
    }

    private companion object {
        val inputAttrs = listOf("textPrimary", "textTertiary")
    }
}