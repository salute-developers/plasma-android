package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult
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
internal class ViewGradientAttributeGenerator(
    private val xmlDocumentBuilder: XmlResourcesDocumentBuilder,
    private val outputResDir: File,
    private val attrPrefix: String,
) : SimpleBaseGenerator {

    private val gradients = mutableListOf<GradientTokenResult.ViewTokenData>()

    fun setGradientTokenData(gradients: List<GradientTokenResult.ViewTokenData>) {
        this.gradients.clear()
        this.gradients.addAll(gradients)
    }

    override fun generate() {
        appendGradients(gradients)
        xmlDocumentBuilder.build(outputResDir.attrsFile("gradient"))
    }

    private fun appendGradients(gradients: MutableList<GradientTokenResult.ViewTokenData>) {
        gradients.forEach { tokenData ->
            xmlDocumentBuilder.appendComment(tokenData.attrName)
            tokenData.gradientParameters.forEach { appendAttr(it.attrName.toXmlAttribute()) }
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
