package com.sdds.plugin.themebuilder.internal.builder

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
 * Unit тесты [XmlFontFamilyDocumentBuilder]
 */
class XmlFontFamilyDocumentBuilderTest {

    private lateinit var mockDocument: Document
    private lateinit var mockRoot: Element

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
        every { mockDocument.createElement("font-family") } returns mockRoot
    }

    @After
    fun tearDown() {
        clearAllMocks()
        unmockkStatic(DocumentBuilderFactory::class)
    }

    @Test
    fun `appendFontElement добавляет элементы font в документ`() {
        val underTest = XmlFontFamilyDocumentBuilder()
        val mockChildElement = mockk<Element>(relaxed = true)

        every { mockDocument.createElement("font") } returns mockChildElement

        underTest.appendFontElement(
            "test_font_style",
            "test_font_weight",
            "test_font",
        )
        underTest.appendFontElement(
            "test_font_style2",
            "test_font_weight2",
            "test_font2",
        )

        verify(exactly = 1) {
            mockDocument.createElement("font-family")
            mockRoot.setAttribute("xmlns:app", "http://schemas.android.com/apk/res-auto")
            mockDocument.appendChild(mockRoot)

            mockChildElement.setAttribute("app:fontStyle", "test_font_style")
            mockChildElement.setAttribute("app:fontWeight", "test_font_weight")
            mockChildElement.setAttribute("app:font", "@font/test_font")

            mockChildElement.setAttribute("app:fontStyle", "test_font_style2")
            mockChildElement.setAttribute("app:fontWeight", "test_font_weight2")
            mockChildElement.setAttribute("app:font", "@font/test_font2")
        }

        verify(exactly = 2) {
            mockDocument.createElement("font")
            mockChildElement.textContent = ""
            mockRoot.appendChild(mockChildElement)
        }
    }
}
