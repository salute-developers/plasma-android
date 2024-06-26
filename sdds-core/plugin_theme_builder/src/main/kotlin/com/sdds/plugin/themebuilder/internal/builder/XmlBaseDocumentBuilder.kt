package com.sdds.plugin.themebuilder.internal.builder

import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fileWriter
import org.w3c.dom.Document
import org.w3c.dom.Element
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.OutputKeys
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult

/**
 * Базовый билдер xml документов
 */
internal abstract class XmlBaseDocumentBuilder {

    /**
     * Инстанс [Document]
     */
    protected val document: Document =
        DocumentBuilderFactory.newInstance()
            .newDocumentBuilder()
            .newDocument()

    /**
     * Корневой элемент [Element] документа
     */
    protected abstract val rootContent: Element

    /**
     * Добавляет элемент в документ
     * @param elementName название элемента xml документа
     * @param attrs набор атрибутов элемента
     * @param value значение элемента
     */
    fun appendBaseElement(
        elementName: String,
        attrs: Map<String, String>,
        value: String = "",
    ) = rootContent.appendBaseElement(elementName, attrs, value)

    /**
     * Добавляет элемент в документ
     * @param elementName название элемента xml документа
     * @param attrs набор атрибутов элемента
     * @param value значение элемента
     */
    fun appendBaseElement(
        elementName: String,
        attrs: Map<String, String>,
        value: Element.() -> Unit,
    ) = rootContent.appendBaseElement(elementName, attrs, value)

    /**
     * Добавляет элемент в родительский элемент
     * @param elementName название элемента xml документа
     * @param attrs набор атрибутов элемента
     * @param value значение элемента
     */
    fun Element.appendBaseElement(
        elementName: String,
        attrs: Map<String, String>,
        value: String = "",
    ) {
        val element = document.createElement(elementName).apply {
            attrs.entries.forEach {
                setAttribute(it.key, it.value)
            }
            textContent = value
        }
        appendChild(element)
    }

    /**
     * Добавляет элемент в родительский элемент
     * @param elementName название элемента xml документа
     * @param attrs набор атрибутов элемента
     * @param value значение элемента
     */
    private fun Element.appendBaseElement(
        elementName: String,
        attrs: Map<String, String>,
        value: Element.() -> Unit,
    ) {
        val element = document.createElement(elementName).apply {
            attrs.entries.forEach {
                setAttribute(it.key, it.value)
            }
            value.invoke(this)
        }
        appendChild(element)
    }

    /**
     * Обосабливает контент [content] в регион с названием [regionName]
     */
    fun wrapWithRegion(regionName: String, content: () -> Unit) {
        appendComment("region $regionName")
        content.invoke()
        appendComment("endregion $regionName")
    }

    /**
     * Добавляет комментарий [comment] в элемент
     */
    fun Element.appendComment(comment: String) {
        this@appendComment.appendChild(document.createComment(comment))
    }

    /**
     * Добавляет комментарий [comment] в документ
     */
    fun appendComment(comment: String?) {
        comment?.let {
            rootContent.appendComment(it)
        }
    }

    /**
     * Сохраняет содержимое xml файла в [output]
     */
    fun build(output: File) {
        val transformer = TransformerFactory.newInstance().apply {
            setAttribute("indent-number", 4)
        }.newTransformer().apply {
            setOutputProperty(OutputKeys.ENCODING, "UTF-8")
            setOutputProperty(OutputKeys.INDENT, "yes")
        }
        transformer.transform(DOMSource(document), StreamResult(output.fileWriter()))
    }
}
