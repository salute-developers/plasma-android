package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
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
) : SimpleBaseGenerator {

    private val shapes = mutableListOf<ShapeTokenResult.TokenData>()

    fun setShapeTokenData(data: List<ShapeTokenResult.TokenData>) {
        shapes.clear()
        shapes.addAll(data)
    }

    override fun generate() {
        appendShapes(shapes)
        xmlDocumentBuilder.build(outputResDir.attrsFile("shape"))
    }

    private fun appendShapes(shapes: List<ShapeTokenResult.TokenData>) {
        xmlDocumentBuilder.appendComment("Shapes")
        shapes.forEach { shape ->
            appendAttr(shape.attrName.toXmlAttribute())
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
