package com.sdds.plugin.themebuilder.internal.builder

import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase
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
    private val rootAttributes: Map<String, String>,
    themeName: String,
    private val rootElement: String = "resources",
) : XmlBaseDocumentBuilder() {

    override val rootContent: Element by unsafeLazy {
        document.createElement(rootElement)
            .apply {
                rootAttributes.forEach {
                    setAttribute(it.key, it.value)
                }
            }
            .also { document.appendChild(it) }
    }

    private val capitalizedResPrefix = tokenPrefix.capitalized()
    private val camelCaseThemeName = themeName.snakeToCamelCase()
    private val compositeResourcePrefix = if (camelCaseThemeName.isNotBlank()) {
        "$capitalizedResPrefix.$camelCaseThemeName"
    } else {
        capitalizedResPrefix
    }

    val resPrefix: String
        get() = compositeResourcePrefix

    /**
     * Добавляет элемент с контентом внутри
     * @param elementName название элемента xml документа
     * @param name имя элемента
     * @param value значение токена
     * @param usePrefix использовать префикс ресурсов в имени [name]
     */
    fun appendElementWithContent(
        elementName: ElementName,
        name: String,
        usePrefix: Boolean = true,
        value: Element.() -> Unit,
    ) {
        val nameWithPrefix = name.withPrefixIfNeed(tokenPrefix.takeIf { usePrefix })
        appendBaseElement(elementName.value, mapOf("name" to nameWithPrefix), value)
    }

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
        tokenName: String? = null,
        value: String,
        format: ElementFormat? = null,
        type: ElementType? = null,
        targetApi: TargetApi? = null,
        usePrefix: Boolean = true,
    ) {
        val nameAttr = tokenName?.withPrefixIfNeed(tokenPrefix.takeIf { usePrefix })
        val attrs = mutableMapOf<String, String>().apply {
            nameAttr?.let { put("name", nameAttr) }
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
     * Добавляет стиль с названием [styleName] в документ.
     *
     * @param styleName название стиля
     */
    fun appendStyle(styleName: String) {
        document.createElement("style").apply {
            setAttribute("name", styleName)
            rootContent.appendChild(this@apply)
        }
    }

    /**
     * Добавляет стиль с названием, состоящим из префикса [capitalizedResPrefix] и [styleName] в документ.
     *
     * @param styleName название стиля
     * @param styleParent наследуемый стиль
     * @param content содержание стиля
     */
    fun appendStyleWithResPrefix(
        styleName: String,
        styleParent: String? = null,
        content: Element.() -> Unit = {},
    ) {
        appendStyleWithPrefix(styleName, styleParent, content, capitalizedResPrefix)
    }

    /**
     * Добавляет стиль с названием, состоящим из префикса [compositeResourcePrefix] и [styleName] в документ.
     *
     * @param styleName название стиля
     * @param styleParent наследуемый стиль
     * @param content содержание стиля
     */
    fun appendStyleWithCompositePrefix(
        styleName: String,
        styleParent: String? = null,
        content: Element.() -> Unit = {},
    ) {
        appendStyleWithPrefix(styleName, styleParent, content, compositeResourcePrefix)
    }

    private fun appendStyleWithPrefix(
        styleName: String,
        styleParent: String? = null,
        content: Element.() -> Unit = {},
        prefix: String,
    ) {
        val nameAttr = styleName.withPrefixIfNeed(prefix, ".")
        document.createElement("style").apply {
            setAttribute("name", nameAttr)
            styleParent?.let { setAttribute("parent", it) }
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
        STRING("string"),
        STRING_ARRAY("string-array"),
        INTEGER_ARRAY("integer-array"),
        DECLARE_STYLEABLE("declare-styleable"),
        ATTR("attr"),
        ENUM("enum"),
    }

    /**
     * Название элемента документа
     * @param value строковое название
     */
    enum class ElementFormat(val value: String) {
        FLOAT("float"),
        BOOLEAN("boolean"),
        ENUM("enum"),
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

    internal companion object {
        val DEFAULT_ROOT_ATTRIBUTES = mapOf("xmlns:tools" to "http://schemas.android.com/tools")
    }
}
