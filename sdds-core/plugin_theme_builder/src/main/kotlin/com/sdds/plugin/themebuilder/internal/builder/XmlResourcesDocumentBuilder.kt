package com.sdds.plugin.themebuilder.internal.builder

import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.sdds.plugin.themebuilder.internal.utils.withPrefixIfNeed
import org.gradle.configurationcache.extensions.capitalized
import org.w3c.dom.Element

/**
 * Делегат для построения XML-документа
 * @param tokenPrefix префикс названия токена
 * @author malilex on 06.03.2024
 */
internal open class XmlResourcesDocumentBuilder(
    private val tokenPrefix: String,
) : XmlBaseDocumentBuilder() {

    override val rootContent: Element by unsafeLazy {
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
        val attrs = mutableMapOf("name" to nameAttr).apply {
            format?.let { put("format", it.value) }
            type?.let { put("type", it.value) }
            targetApi?.let { put("tools:targetApi", targetApi.value) }
        }
        appendBaseElement(
            elementName = elementName.value,
            attrs = attrs,
            value = value,
        )
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
