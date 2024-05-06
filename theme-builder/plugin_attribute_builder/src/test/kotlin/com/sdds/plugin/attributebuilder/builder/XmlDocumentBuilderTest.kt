package com.sdds.plugin.attributebuilder.builder

import com.sdds.plugin.attributebuilder.internal.builder.XmlDocumentBuilder
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkStatic
import io.mockk.unmockkStatic
import io.mockk.verify
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.w3c.dom.Document
import org.w3c.dom.Element
import javax.xml.parsers.DocumentBuilderFactory

/**
 * Unit тесты [XmlDocumentBuilder]
 */
class XmlDocumentBuilderTest {
    private lateinit var mockDocument: Document
    private lateinit var mockRoot: Element
    private lateinit var xmlDocumentBuilder: XmlDocumentBuilder

    @Before
    fun setUp() {
        mockDocument = mockk(relaxed = true)
        mockRoot = mockk(relaxed = true)
        mockkStatic(DocumentBuilderFactory::class)
        every { DocumentBuilderFactory.newInstance() } returns mockk(relaxed = true) {
            every { newDocumentBuilder() } returns mockk(relaxed = true) {
                every { newDocument() } returns mockDocument
            }
        }
        every { mockDocument.createElement("resources") } returns mockRoot
        xmlDocumentBuilder = XmlDocumentBuilder()
    }

    @After
    fun tearDown() {
        clearAllMocks()
        unmockkStatic(DocumentBuilderFactory::class)
    }

    @Test
    fun `xmlDocumentBuilder создает корректный рут и добавляет атрибуты`() {
        val attrElement = mockk<Element>(relaxed = true)
        every { mockDocument.createElement("attr") } returns attrElement

        xmlDocumentBuilder.appendBaseElement(
            elementName = "attr",
            attrs = mapOf(
                "name" to "xmlAttribute.name",
                "format" to "xmlAttribute.format",
            ),
        )
        verify {
            mockDocument.appendChild(mockRoot)
            mockRoot.setAttribute("xmlns:tools", "http://schemas.android.com/tools")

            mockDocument.createElement("attr")
            attrElement.setAttribute("name", "xmlAttribute.name")
            attrElement.setAttribute("format", "xmlAttribute.format")
            mockRoot.appendChild(attrElement)
        }
    }
}
