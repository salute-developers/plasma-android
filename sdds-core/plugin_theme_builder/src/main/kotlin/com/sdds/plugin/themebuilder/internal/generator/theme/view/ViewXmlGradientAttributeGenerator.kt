package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.mergedLightAndDark
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.attrsFile
import com.sdds.plugin.themebuilder.internal.utils.withPrefixIfNeed
import java.io.File

/**
 * Генератор xml-атрибутов градиента
 *
 * @property xmlDocumentBuilder билдер xml документа
 * @property outputResDir целевая директория с ресурсами
 * @property attrPrefix перфикс атрибута
 */
internal class ViewXmlGradientAttributeGenerator(
    private val xmlDocumentBuilder: XmlResourcesDocumentBuilder,
    private val outputResDir: File,
    private val attrPrefix: String,
) : SimpleBaseGenerator {

    private val gradientAttributes = mutableSetOf<String>()

    fun setGradientTokenData(data: GradientTokenResult.ViewTokenData) {
        gradientAttributes.clear()
        gradientAttributes.addAll(data.mergedLightAndDark())
    }

    override fun generate() {
        appendGradients()
        xmlDocumentBuilder.build(outputResDir.attrsFile("gradient"))
    }

    private fun appendGradients() {
        xmlDocumentBuilder.appendComment("Gradient attributes")
        gradientAttributes.forEach { gradient ->
            appendAttr(gradient.toXmlAttribute())
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
            ),
        )
}
