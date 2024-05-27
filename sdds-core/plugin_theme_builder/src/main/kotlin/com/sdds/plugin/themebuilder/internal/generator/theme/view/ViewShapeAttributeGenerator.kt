package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.generator.data.ShapeTokenResult
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.attrsFile
import com.sdds.plugin.themebuilder.internal.utils.withPrefixIfNeed
import java.io.File

/**
 * Генератор xml-атрибутов форм
 *
 * @property xmlDocumentBuilder билдер xml документа
 * @property outputResDir целевая директория с ресурсами
 * @property attrPrefix перфикс атрибута
 */
internal class ViewShapeAttributeGenerator(
    private val xmlDocumentBuilder: XmlResourcesDocumentBuilder,
    private val outputResDir: File,
    private val attrPrefix: String,
) {

    /**
     * Генерирует xml-атрибуты форм
     *
     * @param shapes список названий атрибутов
     */
    fun generate(shapes: List<ShapeTokenResult.TokenData>) {
        appendColors(shapes)
        xmlDocumentBuilder.build(outputResDir.attrsFile("shape"))
    }

    private fun appendColors(colors: List<ShapeTokenResult.TokenData>) {
        xmlDocumentBuilder.appendComment("Shapes")
        colors.forEach { color ->
            appendAttr(color.attrName.toXmlAttribute())
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

    private fun String.toXmlAttribute(): XmlAttribute =
        XmlAttribute(
            name = this.withPrefixIfNeed(attrPrefix),
            formats = listOf(XmlAttribute.Format.REFERENCE),
        )
}
