package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.FileProvider.textAppearancesXmlFile
import com.sdds.plugin.themebuilder.internal.FileProvider.typographyXmlFile
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.token.TypographyToken
import com.sdds.plugin.themebuilder.internal.token.toSnakeCase
import java.io.File

/**
 *
 * @author Малышев Александр on 07.03.2024
 */
class TypographyGenerator(
    private val outputDir: File,
    private val dimensAggregator: DimensAggregator,
    private val xmlBuilderFactory: XmlDocumentBuilderFactory
) : TokenGenerator<TypographyToken> {

    private val textAppearanceXmlBuilders = mutableMapOf<TypographyToken.ScreenClass, XmlDocumentBuilder>()
    private val typographyXmlBuilder = XmlDocumentBuilderFactory.create("resources")

    override fun addToken(token: TypographyToken) {
        val builder = textAppearanceXmlBuilders[token.screenClass] ?: xmlBuilderFactory.create("resources").also {
            textAppearanceXmlBuilders[token.screenClass] = it
        }

        val textAppearanceName = "Sdds.TextAppearance.${token.xmlName}"

        builder.appendTypographyToken(token, textAppearanceName)

        with(typographyXmlBuilder) {
            if (token.screenClass.isDefault) {
                appendStyle("Sdds.Typography.${token.xmlName}") {
                    appendToken(
                        elementName = "item",
                        tokenName = "android:textAppearance",
                        value = "@style/$textAppearanceName"
                    )
                }
            }
        }
    }

    override fun generate() {
        textAppearanceXmlBuilders.forEach {
            // val outputDir = File("${outputDir.path}/${it.key.dirName()}")
            // outputDir.mkdirs()
            // it.value.build(File("${outputDir.path}/text-appearances.xml"))
            it.value.build(outputDir.textAppearancesXmlFile(it.key.qualifier()))
        }
        // typographyXmlBuilder.build(File("${outputDir.path}/typography.xml"))
        typographyXmlBuilder.build(outputDir.typographyXmlFile())
    }

    private fun XmlDocumentBuilder.appendTypographyToken(token: TypographyToken, textAppearanceName: String) {
        val tokenValue = token.value ?: return

        val textSizeDimen = "${token.name.toSnakeCase()}_text_size"
        val lineHeightDimen = "${token.name.toSnakeCase()}_line_height"

        dimensAggregator.addDimen(DimenData(textSizeDimen, tokenValue.textSize, DimenData.Type.SP))
        dimensAggregator.addDimen(DimenData(lineHeightDimen, tokenValue.lineHeight, DimenData.Type.DP))

        appendStyle(textAppearanceName) {
            appendToken("item", "fontFamily", tokenValue.fontFamily)
            appendToken("item", "fontWeight", tokenValue.fontWeight.toString())
            appendToken("item", "android:fontStyle", tokenValue.fontStyle)
            appendToken("item", "android:letterSpacing", tokenValue.letterSpacing.toString())
            appendToken("item", "android:textSize", "@dimen/$textSizeDimen")
            appendToken("item", "android:lineHeight", "@dimen/$lineHeightDimen")
        }
    }

    private companion object {
        fun TypographyToken.ScreenClass.qualifier(): String {
            return when (this) {
                TypographyToken.ScreenClass.SMALL -> "small"
                TypographyToken.ScreenClass.LARGE -> "large"
                else -> ""
            }
        }
    }
}