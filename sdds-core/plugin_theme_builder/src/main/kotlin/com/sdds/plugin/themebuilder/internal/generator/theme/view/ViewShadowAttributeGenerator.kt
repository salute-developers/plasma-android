package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ShadowTokenResult
import com.sdds.plugin.themebuilder.internal.token.ShadowToken
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.attrsFile
import com.sdds.plugin.themebuilder.internal.utils.withPrefixIfNeed
import java.io.File

/**
 * Генератор xml-атрибутов теней
 *
 * @property xmlDocumentBuilder билдер xml документа
 * @property outputResDir целевая директория с ресурсами
 * @property attrPrefix перфикс атрибута
 */
internal class ViewShadowAttributeGenerator(
    private val xmlDocumentBuilder: XmlResourcesDocumentBuilder,
    private val outputResDir: File,
    private val attrPrefix: String,
) : SimpleBaseGenerator {

    private val shadows = mutableListOf<ShadowTokenResult.TokenData>()

    fun setShadowTokenData(data: List<ShadowTokenResult.TokenData>) {
        shadows.clear()
        shadows.addAll(data)
    }

    override fun generate() {
        appendShadows(shadows)
        xmlDocumentBuilder.build(outputResDir.attrsFile("shadow"))
    }

    private fun appendShadows(shadows: List<ShadowTokenResult.TokenData>) {
        shadows.forEach { shadow ->
            appendAttr(shadow.tokenTechName.toXmlAttribute())
        }
    }

    private fun appendAttr(xmlAttribute: XmlAttribute) {
        xmlDocumentBuilder.appendBaseElement(
            elementName = XmlAttribute.ELEMENT,
            attrs = mapOf(
                XmlAttribute.FIELD_NAME to xmlAttribute.name,
                XmlAttribute.FIELD_FORMAT to xmlAttribute.format,
            ),
        )
    }

    private fun String.toXmlAttribute(): XmlAttribute =
        XmlAttribute(
            name = ShadowToken.getAttrName(this).withPrefixIfNeed(attrPrefix),
            formats = listOf(XmlAttribute.Format.REFERENCE),
        )
}
