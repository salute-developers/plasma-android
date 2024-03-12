package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.ThemeBuilderTarget.Companion.isComposeOrAll
import com.sdds.plugin.themebuilder.ThemeBuilderTarget.Companion.isViewSystemOrAll
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.textAppearancesXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.typographyXmlFile
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.XmlDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.token.TypographyToken
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import java.io.File

/**
 * @param outputDir директория для сохранения kt-файла с токенами
 * @param outputResDir директория для сохранения xml-файла с токенами
 * @param target целевой фреймворк
 * @param xmlBuilderFactory фабрика делегата построения xml файлов
 * @param ktFileBuilder делегат построения kt файлов
 * @author Малышев Александр on 07.03.2024
 */
internal class TypographyGenerator(
    private val outputDir: File,
    private val outputResDir: File,
    private val target: ThemeBuilderTarget,
    private val dimensAggregator: DimensAggregator,
    private val xmlBuilderFactory: XmlDocumentBuilderFactory,
    private val ktFileBuilder: FileSpec.Builder,
) : TokenGenerator<TypographyToken> {

    private val textAppearanceXmlBuilders = mutableMapOf<TypographyToken.ScreenClass, XmlDocumentBuilder>()
    private val typographyXmlBuilder by unsafeLazy { xmlBuilderFactory.create() }
    private val largeBuilder by unsafeLazy { TypeSpec.objectBuilder("TypographyLargeTokens") }
    private val mediumBuilder by unsafeLazy { TypeSpec.objectBuilder("TypographyMediumTokens") }
    private val smallBuilder by unsafeLazy { TypeSpec.objectBuilder("TypographySmallTokens") }
    private var needGenerateCompose: Boolean = false
    private var needGenerateViewSystem: Boolean = false
    private var needDeclareStyle: Boolean = true

    /**
     * @see TokenGenerator.addToken
     */
    override fun addToken(token: TypographyToken) {
        when (target) {
            ThemeBuilderTarget.VIEW_SYSTEM -> addViewSystemToken(token)
            ThemeBuilderTarget.COMPOSE -> addComposeToken(token)
            ThemeBuilderTarget.ALL -> {
                addViewSystemToken(token)
                addComposeToken(token)
            }
        }
    }

    /**
     * @see TokenGenerator.generate
     */
    override fun generate() {
        if (needGenerateViewSystem) {
            textAppearanceXmlBuilders.forEach {
                it.value.build(outputResDir.textAppearancesXmlFile(it.key.qualifier()))
            }
            typographyXmlBuilder.build(outputResDir.typographyXmlFile())
        }

        if (needGenerateCompose) {
            ktFileBuilder
                .addType(smallBuilder.build())
                .addType(mediumBuilder.build())
                .addType(largeBuilder.build())
                .addImport(ClassName("androidx.compose.ui.unit", "sp"), "")
                .addImport(ClassName("androidx.compose.ui.text.font", "FontWeight"), "")
                .build()
                .writeTo(outputDir)
        }
    }

    private fun addViewSystemToken(token: TypographyToken) {
        val tokenValue = token.value ?: return
        val builder = textAppearanceXmlBuilders[token.screenClass] ?: xmlBuilderFactory.create().also {
            textAppearanceXmlBuilders[token.screenClass] = it
        }
        val textAppearanceName = "Sdds.TextAppearance.${token.xmlName}"

        if (token.screenClass.isDefault) {
            if (needDeclareStyle) {
                needDeclareStyle = false
                builder.appendStyle("Sdds.TextAppearance") {}
                typographyXmlBuilder.appendStyle("Sdds.Typography") {}
            }
            with(typographyXmlBuilder) {
                appendStyle("Sdds.Typography.${token.xmlName}") {
                    appendElement(
                        elementName = ElementName.ITEM,
                        tokenName = "android:textAppearance",
                        value = "@style/$textAppearanceName",
                    )
                }
            }
        }
        builder.appendTypographyToken(token, tokenValue, textAppearanceName)

        if (!needGenerateViewSystem && target.isViewSystemOrAll) needGenerateViewSystem = true
    }

    private fun addComposeToken(token: TypographyToken) {
        val tokenValue = token.value ?: return
        when (token.screenClass) {
            TypographyToken.ScreenClass.SMALL -> smallBuilder.addTypographyToken(token.displayName, tokenValue)
            TypographyToken.ScreenClass.LARGE -> largeBuilder.addTypographyToken(token.displayName, tokenValue)
            else -> mediumBuilder.addTypographyToken(token.displayName, tokenValue)
        }
        if (!needGenerateCompose && target.isComposeOrAll) needGenerateCompose = true
    }

    private fun XmlDocumentBuilder.appendTypographyToken(
        token: TypographyToken,
        tokenValue: TypographyToken.Value,
        textAppearanceName: String,
    ) {
        val textSizeDimen = "${token.name.techToSnakeCase()}_text_size"
        val lineHeightDimen = "${token.name.techToSnakeCase()}_line_height"

        dimensAggregator.addDimen(DimenData(textSizeDimen, tokenValue.textSize, DimenData.Type.SP))
        dimensAggregator.addDimen(DimenData(lineHeightDimen, tokenValue.lineHeight, DimenData.Type.DP))

        appendStyle(textAppearanceName) {
            appendElement(ElementName.ITEM, "fontFamily", tokenValue.fontFamily)
            appendElement(ElementName.ITEM, "fontWeight", tokenValue.fontWeight.toString())
            appendElement(ElementName.ITEM, "android:fontStyle", tokenValue.fontStyle)
            appendElement(ElementName.ITEM, "android:letterSpacing", tokenValue.letterSpacing.toString())
            appendElement(ElementName.ITEM, "android:textSize", "@dimen/$textSizeDimen")
            appendElement(ElementName.ITEM, "android:lineHeight", "@dimen/$lineHeightDimen")
        }
    }

    private fun TypeSpec.Builder.addTypographyToken(name: String, tokenValue: TypographyToken.Value) {
        addProperty(
            PropertySpec.builder(
                name,
                ClassName("androidx.compose.ui.text", listOf("TextStyle")),
            )
                .initializer(
                    """
                    TextStyle(
                        fontWeight = FontWeight(${tokenValue.fontWeight}),
                        fontSize = ${tokenValue.textSize}.sp,
                        lineHeight = ${tokenValue.lineHeight}.sp,
                        letterSpacing = ${tokenValue.letterSpacing}.sp,
                    )
                    """.trimIndent(),
                )
                .build(),
        )
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
