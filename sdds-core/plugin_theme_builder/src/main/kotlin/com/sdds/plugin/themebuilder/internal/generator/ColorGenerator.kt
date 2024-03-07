package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.FileProvider.colorsXmlFile
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import java.io.File

/**
 *
 * @author Малышев Александр on 07.03.2024
 */
class ColorGenerator(
    private val outputDir: File,
    private val xmlBuilderFactory: XmlDocumentBuilderFactory
) : TokenGenerator<ColorToken> {

    private val xmlDocumentBuilder = xmlBuilderFactory.create("resources")

    override fun addToken(token: ColorToken) {
        val tokenValue = token.value ?: return
        xmlDocumentBuilder.appendComment(token.description)
        xmlDocumentBuilder.appendToken("color", token.xmlName, tokenValue.origin)
    }

    override fun generate() {
        xmlDocumentBuilder.build(outputDir.colorsXmlFile())
    }
}