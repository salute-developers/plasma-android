package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
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
) : SimpleBaseGenerator {

    private val colors = mutableListOf<ColorTokenResult.TokenData>()

    fun setColorTokenData(data: List<ColorTokenResult.TokenData>) {
        colors.clear()
        colors.addAll(data)
    }

    override fun generate() {
        appendColors(colors)
        xmlDocumentBuilder.build(outputResDir.attrsFile("color"))
    }

    private fun appendColors(colors: List<ColorTokenResult.TokenData>) {
        xmlDocumentBuilder.appendComment("Colors")
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
            formats = listOf(
                XmlAttribute.Format.REFERENCE,
                XmlAttribute.Format.COLOR,
            ),
        )
}
