package com.sdds.plugin.attributebuilder.internal.generator

import com.sdds.plugin.attributebuilder.internal.builder.XmlDocumentBuilder
import com.sdds.plugin.attributebuilder.internal.data.AttributeData
import com.sdds.plugin.attributebuilder.internal.utils.attrsDir
import com.sdds.plugin.core.utils.withPrefixIfNeed
import java.io.File

/**
 * Генератор xml-атрибутов
 */
internal class XmlAttributeGenerator(
    private val xmlDocumentBuilder: XmlDocumentBuilder,
    private val outputResDir: File,
) {

    /**
     * Генерирует xml-атрибуты
     *
     * @param attributeData данные об атрибутах
     * @param attrPrefix префикс для имен атрибутов
     */
    fun generate(attributeData: AttributeData, attrPrefix: String) {
        with(attributeData) {
            appendColors(attrPrefix)
        }
        xmlDocumentBuilder.build(outputResDir.attrsDir())
    }

    private fun AttributeData.appendColors(prefix: String) {
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
