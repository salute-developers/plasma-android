package com.sdds.plugin.themebuilder.internal.builder

import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fileWriter
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.sdds.plugin.themebuilder.internal.utils.withPrefixIfNeed
import org.gradle.configurationcache.extensions.capitalized
import org.w3c.dom.Document
import org.w3c.dom.Element
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.OutputKeys
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult

/**
 * Делегат для построения XML-документа с ресурсами
 * @param tokenPrefix префикс названия токена
 * @author malilex on 06.03.2024
 */
internal open class XmlDocumentBuilder(private val tokenPrefix: String) {

    private val document: Document = DocumentBuilderFactory.newInstance()
        .newDocumentBuilder()
        .newDocument()

    private val rootContent: Element by unsafeLazy {
        document.createElement("resources")
            .apply { setAttribute("xmlns:tools", "http://schemas.android.com/tools") }
            .also { document.appendChild(it) }
    }

    private val capitalizedPrefix by unsafeLazy { tokenPrefix.capitalized() }

    /**
     * Добавляет элемент в документ
     * @param elementName название элемента xml документа
     * @param tokenName название токена
     * @param value значение токена
     * @param format формат xml элемента
     * @param type тип xml элемента
     * @param targetApi целевая версия
     */
    fun appendElement(
        elementName: ElementName,
        tokenName: String,
        value: String,
        format: ElementFormat? = null,
        type: ElementType? = null,
        targetApi: TargetApi? = null,
        usePrefix: Boolean = true,
    ) {
        rootContent.appendElement(elementName, tokenName, value, format, type, targetApi, usePrefix)
    }

    /**
     * Добавляет элемент в родительский элемент
     * @param elementName название элемента xml документа
     * @param tokenName название токена
     * @param value значение токена
     * @param format формат xml элемента
     * @param type тип xml элемента
     * @param targetApi целевая версия
     * @param usePrefix если true - добавляет префикс к имени токена
     */
    fun Element.appendElement(
        elementName: ElementName,
        tokenName: String,
        value: String,
        format: ElementFormat? = null,
        type: ElementType? = null,
        targetApi: TargetApi? = null,
        usePrefix: Boolean = true,
    ) {
        val nameAttr = tokenName.withPrefixIfNeed(tokenPrefix.takeIf { usePrefix })
        val element = document.createElement(elementName.value).apply {
            setAttribute("name", nameAttr)
            format?.let { setAttribute("format", it.value) }
            type?.let { setAttribute("type", it.value) }
            targetApi?.let { setAttribute("tools:targetApi", targetApi.value) }
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
    fun appendStyle(styleName: String, content: Element.() -> Unit = {}) {
        val nameAttr = styleName.withPrefixIfNeed(capitalizedPrefix, ".")
        document.createElement("style").apply {
            setAttribute("name", nameAttr)
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
        transformer.transform(DOMSource(document), StreamResult(output.fileWriter()))
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

    /**
     * Название элемента документа
     * @param value строковое название
     */
    enum class ElementFormat(val value: String) {
        FLOAT("float"),
    }

    /**
     * Название элемента документа
     * @param value строковое название
     */
    enum class ElementType(val value: String) {
        DIMEN("dimen"),
    }

    /**
     * Версия api
     * @param value строковое название
     */
    enum class TargetApi(val value: String) {

        /**
         * Android SDK 28
         */
        P("p"),
    }
}
