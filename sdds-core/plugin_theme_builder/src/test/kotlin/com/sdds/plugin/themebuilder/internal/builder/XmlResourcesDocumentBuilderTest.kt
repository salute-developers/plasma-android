package com.sdds.plugin.themebuilder.internal.builder

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementFormat
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementType
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
 * Unit тесты [XmlResourcesDocumentBuilder]
 * @author Малышев Александр on 13.03.2024
 */
class XmlResourcesDocumentBuilderTest {

    private lateinit var mockDocument: Document
    private lateinit var mockRoot: Element
    private lateinit var underTest: XmlResourcesDocumentBuilder

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
        underTest = XmlResourcesDocumentBuilder("sdds")
    }

    @After
    fun tearDown() {
        clearAllMocks()
        unmockkStatic(DocumentBuilderFactory::class)
    }

    @Test
    fun `appendElement добавляет элемент item в документ`() {
        val mockElement = mockk<Element>(relaxed = true)

        every { mockDocument.createElement(ElementName.ITEM.value) } returns mockElement

        underTest.appendElement(
            ElementName.ITEM,
            "test_token",
            "10.0",
            ElementFormat.FLOAT,
            ElementType.DIMEN,
        )

        verify {
            mockDocument.appendChild(mockRoot)
            mockDocument.createElement(ElementName.ITEM.value)
            mockElement.setAttribute("name", "sdds_test_token")
            mockElement.setAttribute("format", ElementFormat.FLOAT.value)
            mockElement.setAttribute("type", ElementType.DIMEN.value)
            mockElement.textContent = "10.0"
            mockRoot.appendChild(mockElement)
        }
    }

    @Test
    fun `appendElement добавляет элемент dimen в документ`() {
        val mockElement = mockk<Element>(relaxed = true)

        every { mockDocument.createElement(ElementName.DIMEN.value) } returns mockElement

        underTest.appendElement(
            ElementName.DIMEN,
            "test_dimen",
            "10.0dp",
        )

        verify {
            mockDocument.appendChild(mockRoot)
            mockRoot.setAttribute("xmlns:tools", "http://schemas.android.com/tools")
            mockDocument.createElement(ElementName.DIMEN.value)
            mockElement.setAttribute("name", "sdds_test_dimen")
            mockElement.textContent = "10.0dp"
            mockRoot.appendChild(mockElement)
        }
        verify(exactly = 0) {
            mockElement.setAttribute("format", ElementFormat.FLOAT.value)
            mockElement.setAttribute("type", ElementType.DIMEN.value)
        }
    }

    @Test
    fun `appendElement добавляет элемент color в документ`() {
        val mockElement = mockk<Element>(relaxed = true)

        every { mockDocument.createElement(ElementName.COLOR.value) } returns mockElement

        underTest.appendElement(
            ElementName.COLOR,
            "test_color",
            "#fff",
        )

        verify {
            mockDocument.appendChild(mockRoot)
            mockRoot.setAttribute("xmlns:tools", "http://schemas.android.com/tools")
            mockDocument.createElement(ElementName.COLOR.value)
            mockElement.setAttribute("name", "sdds_test_color")
            mockElement.textContent = "#fff"
            mockRoot.appendChild(mockElement)
        }
        verify(exactly = 0) {
            mockElement.setAttribute("format", ElementFormat.FLOAT.value)
            mockElement.setAttribute("type", ElementType.DIMEN.value)
        }
    }

    @Test
    fun `appendStyle добавляет стиль в документ`() {
        val styleElement = mockk<Element>(relaxed = true)
        val styleContent = mockk<Element.() -> Unit>(relaxed = true)
        every { mockDocument.createElement("style") } returns styleElement

        underTest.appendStyle("TestStyle", styleContent)

        verify {
            mockDocument.appendChild(mockRoot)
            mockRoot.setAttribute("xmlns:tools", "http://schemas.android.com/tools")
            mockDocument.createElement("style")
            styleElement.setAttribute("name", "Sdds.TestStyle")
            styleContent.invoke(styleElement)
            mockRoot.appendChild(styleElement)
        }
    }
}