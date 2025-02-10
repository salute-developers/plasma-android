package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.SpacingTokenResult
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.attrsFile
import com.sdds.plugin.themebuilder.internal.utils.withPrefixIfNeed
import java.io.File

/**
 * Генератор xml-атрибутов отступов
 *
 * @property xmlDocumentBuilder билдер xml документа
 * @property outputResDir целевая директория с ресурсами
 * @property attrPrefix перфикс атрибута
 */
internal class ViewSpacingAttributeGenerator(
    private val xmlDocumentBuilder: XmlResourcesDocumentBuilder,
    private val outputResDir: File,
    private val attrPrefix: String,
) : SimpleBaseGenerator {

    private val spacings = mutableListOf<SpacingTokenResult.TokenData>()

    fun setSpacingTokenData(data: List<SpacingTokenResult.TokenData>) {
        spacings.clear()
        spacings.addAll(data)
    }

    override fun generate() {
        appendSpacing(spacings)
        xmlDocumentBuilder.build(outputResDir.attrsFile("spacing"))
    }

    private fun appendSpacing(spacing: List<SpacingTokenResult.TokenData>) {
        xmlDocumentBuilder.appendComment("Spacing")
        spacing.forEach { spacing ->
            appendAttr(spacing.attrName.toXmlAttribute())
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
