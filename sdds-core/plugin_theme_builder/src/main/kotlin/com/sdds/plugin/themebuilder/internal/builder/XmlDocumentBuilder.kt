package com.sdds.plugin.themebuilder.internal.builder

import org.w3c.dom.Document
import org.w3c.dom.Element
import java.io.File
import java.io.FileWriter
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.OutputKeys
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult

/**
 *
 * @author Малышев Александр on 06.03.2024
 */
open class XmlDocumentBuilder(
    private val rootElement: String
) {

    private val document: Document = DocumentBuilderFactory.newInstance()
        .newDocumentBuilder()
        .newDocument()

    private val rootContent: Element by lazy(LazyThreadSafetyMode.NONE) {
        document.createElement(rootElement)
            .also { document.appendChild(it) }
    }

    fun appendToken(
        elementName: String,
        tokenName: String,
        value: String,
        format: String? = null,
        type: String? = null,
    ) {
        rootContent.appendToken(elementName, tokenName, value, format, type)
    }


    fun Element.appendToken(
        elementName: String,
        tokenName: String,
        value: String,
        format: String? = null,
        type: String? = null,
    ) {
        val colorItem = document.createElement(elementName).apply {
            setAttribute("name", tokenName)
            format?.let { setAttribute("format", it) }
            type?.let { setAttribute("type", it) }
            textContent = value
        }
        appendChild(colorItem)
    }

    fun appendComment(comment: String?) {
        comment?.let {
            rootContent.appendChild(document.createComment(it))
        }
    }

    fun wrapWithRegion(regionName: String, content: () -> Unit) {
        appendComment("region $regionName")
        content.invoke()
        appendComment("endregion $regionName")

    }

    fun appendStyle(styleName: String, content: Element.() -> Unit) {
        document.createElement("style").apply {
            setAttribute("name", styleName)
            content(this)
            rootContent.appendChild(this)
        }
    }

    fun build(output: File) {
        val transformer = TransformerFactory.newInstance().apply {
            setAttribute("indent-number", 4)
        }.newTransformer().apply {
            setOutputProperty(OutputKeys.ENCODING, "UTF-8")
            setOutputProperty(OutputKeys.INDENT, "yes")
        }
        transformer.transform(DOMSource(document), StreamResult(FileWriter(output)))
    }
}