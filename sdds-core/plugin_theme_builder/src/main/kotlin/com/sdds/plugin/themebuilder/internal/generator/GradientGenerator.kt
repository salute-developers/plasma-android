package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.FileProvider.gradientsXmlFile
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.GradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.LinearGradientToken
import com.sdds.plugin.themebuilder.internal.token.RadialGradientToken
import com.sdds.plugin.themebuilder.internal.token.SweepGradientToken
import com.sdds.plugin.themebuilder.internal.token.Token
import java.io.File

/**
 *
 * @author Малышев Александр on 07.03.2024
 */
class GradientGenerator(
    private val outputDir: File,
    private val xmlBuilderFactory: XmlDocumentBuilderFactory
) : TokenGenerator<Token<GradientTokenValue>> {

    private val xmlDocumentBuilder: XmlDocumentBuilder = xmlBuilderFactory.create("resources")

    override fun addToken(token: Token<GradientTokenValue>) {
        when (token) {
            is LinearGradientToken -> xmlDocumentBuilder.appendLinearGradient(token)
            is RadialGradientToken -> xmlDocumentBuilder.appendRadialGradient(token)
            is SweepGradientToken -> xmlDocumentBuilder.appendSweepGradient(token)
        }
    }

    override fun generate() {
        xmlDocumentBuilder.build(outputDir.gradientsXmlFile())
    }

    private fun XmlDocumentBuilder.appendBaseGradient(baseName: String, colors: List<String>, positions: List<Float>) {
        colors.forEachIndexed { index, color ->
            appendToken("color", "${baseName}_color_$index", color)
        }
        positions.forEachIndexed { index, position ->
            appendToken(
                "item",
                "${baseName}_position_$index",
                position.toString(),
                "float",
                "dimen",
            )
        }
    }

    private fun XmlDocumentBuilder.appendLinearGradient(token: LinearGradientToken) {
        val tokenValue = token.value ?: return
        val baseTokenName = token.xmlName

        wrapWithRegion(token.description) {
            appendBaseGradient(baseTokenName, tokenValue.colors, tokenValue.locations)
        }
    }

    private fun XmlDocumentBuilder.appendSweepGradient(token: SweepGradientToken) {
        val tokenValue = token.value ?: return
        val baseTokenName = token.xmlName

        wrapWithRegion(token.description) {
            appendBaseGradient(baseTokenName, tokenValue.colors, tokenValue.locations)
        }
    }

    private fun XmlDocumentBuilder.appendRadialGradient(token: RadialGradientToken) {
        val tokenValue = token.value ?: return
        val baseTokenName = token.xmlName

        wrapWithRegion(token.description) {
            appendBaseGradient(baseTokenName, tokenValue.colors, tokenValue.locations)
        }
    }
}