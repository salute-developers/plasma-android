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
 * Делегат для построения XML-документа с ресурсами
 * @author malilex on 06.03.2024
 */
internal open class XmlDocumentBuilder {

    private val document: Document = DocumentBuilderFactory.newInstance()
        .newDocumentBuilder()
        .newDocument()

    private val rootContent: Element by lazy(LazyThreadSafetyMode.NONE) {
        document.createElement("resources")
            .also { document.appendChild(it) }
    }

    /**
     * Добавляет элемент в документ
     * @param elementName название элемента xml документа
     * @param tokenName название токена
     * @param value значение токена
     * @param format формат xml элемента
     * @param type тип xml элемента
     */
    fun appendElement(
        elementName: ElementName,
        tokenName: String,
        value: String,
        format: String? = null,
        type: String? = null,
    ) {
        rootContent.appendElement(elementName, tokenName, value, format, type)
    }

    /**
     * Добавляет элемент в родительский элемент
     * @param elementName название элемента xml документа
     * @param tokenName название токена
     * @param value значение токена
     * @param format формат xml элемента
     * @param type тип xml элемента
     */
    fun Element.appendElement(
        elementName: ElementName,
        tokenName: String,
        value: String,
        format: String? = null,
        type: String? = null,
    ) {
        val element = document.createElement(elementName.value).apply {
            setAttribute("name", tokenName)
            format?.let { setAttribute("format", it) }
            type?.let { setAttribute("type", it) }
            textContent = value
        }
        appendChild(element)
    }

    /**
     * Добавляет комментарий [comment] в документ
     */
    fun appendComment(comment: String?) {
        comment?.let {
            rootContent.appendChild(document.createComment(it))
        }
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
     * Добавляет стиль с названием [styleName] в документ
     * @param styleName название стиля
     * @param content содержание стиля
     */
    fun appendStyle(styleName: String, content: Element.() -> Unit) {
        document.createElement("style").apply {
            setAttribute("name", styleName)
            content(this)
            rootContent.appendChild(this)
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
        transformer.transform(DOMSource(document), StreamResult(FileWriter(output)))
    }

    /**
     * Название элемента документа
     * @param value строковое название
     */
    enum class ElementName(val value: String) {
        COLOR("color"),
        DIMEN("dimen"),
        ITEM("item"),
    }
}
