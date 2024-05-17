package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.attrsFile
import com.sdds.plugin.themebuilder.internal.utils.withPrefixIfNeed
import java.io.File

/**
 * Генератор xml-атрибутов цвета
 *
 * @property xmlDocumentBuilder билдер xml документа
 * @property outputResDir целевая директория с ресурсами
 * @property attrPrefix перфикс атрибута
 */
internal class ViewColorAttributeGenerator(
    private val xmlDocumentBuilder: XmlResourcesDocumentBuilder,
    private val outputResDir: File,
    private val attrPrefix: String,
) {

    /**
     * Генерирует xml-атрибуты цвета
     *
     * @param colors список названий атрибутов
     */
    fun generate(colors: List<String>) {
        appendColors(colors, attrPrefix)
        xmlDocumentBuilder.build(outputResDir.attrsFile("color"))
    }

    private fun appendColors(colors: List<String>, prefix: String) {
        xmlDocumentBuilder.appendComment("Colors")
        colors.forEach { attr ->
            appendAttr(attr.toColorAttribute(prefix))
        }
    }

    private fun appendAttr(xmlAttribute: XmlAttribute) {
        xmlDocumentBuilder.appendBaseElement(
            elementName = "attr",
            attrs = mapOf(
                "name" to xmlAttribute.name,
                "format" to xmlAttribute.format,
            ),
        )
    }

    private fun String.toColorAttribute(prefix: String): XmlAttribute =
        XmlAttribute(
            name = this.withPrefixIfNeed(prefix),
            formats = listOf(
                XmlAttribute.Format.REFERENCE,
                XmlAttribute.Format.COLOR,
            ),
        )

    /**
     * Модель XML-атрибута
     *
     * @property name название атрибута
     * @property formats список форматов, которые поддерживает атрибут
     */
    private data class XmlAttribute(
        val name: String,
        private val formats: List<Format>,
    ) {

        /**
         * Конечный формат атрибута в виде строки
         */
        val format = formats.joinToString(separator = "|") { it.format }

        /**
         * Тип формата атрибута
         */
        enum class Format(val format: String) {
            REFERENCE("reference"),
            COLOR("color"),
            DIMENSION("dimension"),
        }
    }
}
