package com.sdds.plugin.core.builder

import com.sdds.plugin.core.utils.FileHelper
import com.sdds.plugin.core.utils.FileHelper.fileWriter
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
 * Unit тесты [XmlBaseDocumentBuilder]
 */
class XmlBaseDocumentBuilderTest {

    private lateinit var mockDocument: Document
    private lateinit var mockRoot: Element
    private lateinit var underTest: XmlBaseDocumentBuilder

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
        underTest = object : XmlBaseDocumentBuilder() {
            override val rootContent: Element
                get() = mockRoot
        }
    }

    @After
    fun tearDown() {
        clearAllMocks()
        unmockkStatic(DocumentBuilderFactory::class)
    }

    @Test
    fun `appendBaseElement добавляет элемент в документ`() {
        val mockChildElement = mockk<Element>(relaxed = true)

        every { mockDocument.createElement("element_name") } returns mockChildElement

        underTest.appendBaseElement(
            elementName = "element_name",
            attrs = mapOf(
                "attr_name_1" to "attr_value_1",
                "attr_name_2" to "attr_value_2",
            ),
            value = "test_value",
        )

        verify {
            mockDocument.createElement("element_name")
            mockChildElement.setAttribute("attr_name_1", "attr_value_1")
            mockChildElement.setAttribute("attr_name_2", "attr_value_2")
            mockChildElement.textContent = "test_value"
            mockRoot.appendChild(mockChildElement)
        }
    }

    @Test
    fun `appendComment добавляет комментарий в документ`() {
        val comment = "test comment"
        val commentElement = mockk<Comment>(relaxed = true)
        every { mockDocument.createComment(comment) } returns commentElement

        underTest.appendComment(comment)

        verify {
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
            mockDocument.createComment("region test region")
            mockRoot.appendChild(commentStartRegion)
            content.invoke()
            mockDocument.createComment("endregion test region")
            mockRoot.appendChild(commentEndRegion)
        }
    }

    @Test
    fun `build записывает документ в файл`() {
        val mockTransformerFactory = mockk<TransformerFactory>(relaxed = true)
        val mockTransformer = mockk<Transformer>(relaxed = true)
        val mockOutput = mockk<File>(relaxed = true)

        mockkStatic(TransformerFactory::class)
        mockkObject(FileHelper)
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
        unmockkObject(FileHelper)
    }
}
