package com.sdds.plugin.themebuilder.internal.builder

import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder.ElementFormat
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder.ElementType
import com.sdds.plugin.themebuilder.internal.utils.FileProvider
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fileWriter
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkObject
import io.mockk.mockkStatic
import io.mockk.unmockkObject
import io.mockk.unmockkStatic
import io.mockk.verify
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.w3c.dom.Comment
import org.w3c.dom.Document
import org.w3c.dom.Element
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.OutputKeys
import javax.xml.transform.Transformer
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult

/**
 * Unit тесты [XmlDocumentBuilder]
 * @author Малышев Александр on 13.03.2024
 */
class XmlDocumentBuilderTest {

    private lateinit var mockDocument: Document
    private lateinit var mockRoot: Element
    private lateinit var underTest: XmlDocumentBuilder

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
        underTest = XmlDocumentBuilder("sdds")
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
    fun `appendComment добавляет комментарий в документ`() {
        val comment = "test comment"
        val commentElement = mockk<Comment>(relaxed = true)
        every { mockDocument.createComment(comment) } returns commentElement

        underTest.appendComment(comment)

        verify {
            mockDocument.appendChild(mockRoot)
            mockDocument.createComment(comment)
            mockRoot.appendChild(commentElement)
        }
    }

    @Test
    fun `wrapWithRegion создает регион вокруг элементов`() {
        val regionName = "test region"
        val commentStartRegion = mockk<Comment>(relaxed = true)
        val commentEndRegion = mockk<Comment>(relaxed = true)
        val content = mockk<() -> Unit>(relaxed = true)
        every { mockDocument.createComment(any()) } returns commentStartRegion andThen commentEndRegion

        underTest.wrapWithRegion(regionName, content)

        verify {
            mockDocument.appendChild(mockRoot)
            mockDocument.createComment("region test region")
            mockRoot.appendChild(commentStartRegion)
            content.invoke()
            mockDocument.createComment("endregion test region")
            mockRoot.appendChild(commentEndRegion)
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
            mockDocument.createElement("style")
            styleElement.setAttribute("name", "Sdds.TestStyle")
            styleContent.invoke(styleElement)
            mockRoot.appendChild(styleElement)
        }
    }

    @Test
    fun `build записывает документ в файл`() {
        val mockTransformerFactory = mockk<TransformerFactory>(relaxed = true)
        val mockTransformer = mockk<Transformer>(relaxed = true)
        val mockOutput = mockk<File>(relaxed = true)

        mockkStatic(TransformerFactory::class)
        mockkObject(FileProvider)
        every { mockOutput.fileWriter() } returns mockk(relaxed = true)
        every { TransformerFactory.newInstance() } returns mockTransformerFactory
        every { mockTransformerFactory.newTransformer() } returns mockTransformer

        underTest.build(mockOutput)

        verify {
            mockTransformerFactory.setAttribute("indent-number", 4)
            mockTransformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8")
            mockTransformer.setOutputProperty(OutputKeys.INDENT, "yes")
            mockTransformer.transform(any<DOMSource>(), any<StreamResult>())
        }

        unmockkStatic(TransformerFactory::class)
        unmockkObject(FileProvider)
    }
}
