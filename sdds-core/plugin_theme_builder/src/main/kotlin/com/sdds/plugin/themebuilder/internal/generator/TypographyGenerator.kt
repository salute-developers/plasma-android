package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.ThemeBuilderTarget.Companion.isComposeOrAll
import com.sdds.plugin.themebuilder.ThemeBuilderTarget.Companion.isViewSystemOrAll
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.token.TypographyToken
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.textAppearancesXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.typographyXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.squareup.kotlinpoet.TypeSpec
import java.io.File

/**
 * @param outputLocation локация для сохранения kt-файла с токенами
 * @param outputResDir директория для сохранения xml-файла с токенами
 * @param target целевой фреймворк
 * @param xmlBuilderFactory фабрика делегата построения xml файлов
 * @param ktFileBuilderFactory фабрика делегата построения kt файлов
 * @author Малышев Александр on 07.03.2024
 */
internal class TypographyGenerator(
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val outputResDir: File,
    private val target: ThemeBuilderTarget,
    private val dimensAggregator: DimensAggregator,
    private val xmlBuilderFactory: XmlDocumentBuilderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val resourceReferenceProvider: ResourceReferenceProvider,
) : TokenGenerator<TypographyToken> {

    private val textAppearanceXmlBuilders = mutableMapOf<TypographyToken.ScreenClass, XmlDocumentBuilder>()
    private val typographyXmlBuilder by unsafeLazy { xmlBuilderFactory.create() }
    private val ktFileBuilder by unsafeLazy { ktFileBuilderFactory.create("TypographyTokens") }
    private val largeBuilder by unsafeLazy { ktFileBuilder.rootObject("TypographyLargeTokens") }
    private val mediumBuilder by unsafeLazy { ktFileBuilder.rootObject("TypographyMediumTokens") }
    private val smallBuilder by unsafeLazy { ktFileBuilder.rootObject("TypographySmallTokens") }
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
            ktFileBuilder.addImport(KtFileBuilder.TypeSp)
            ktFileBuilder.addImport(KtFileBuilder.TypeFontWeight)
            ktFileBuilder.build(outputLocation)
        }
    }

    private fun addViewSystemToken(token: TypographyToken) {
        val tokenValue = token.value ?: return
        val builder = textAppearanceXmlBuilders[token.screenClass] ?: xmlBuilderFactory.create().also {
            textAppearanceXmlBuilders[token.screenClass] = it
        }
        val textAppearanceName = "TextAppearance.${token.xmlName}"

        if (token.screenClass.isDefault) {
            if (needDeclareStyle) {
                needDeclareStyle = false
                builder.appendStyle("TextAppearance")
                typographyXmlBuilder.appendStyle("Typography")
            }
            with(typographyXmlBuilder) {
                appendComment(token.description)
                appendStyle("Typography.${token.xmlName}") {
                    appendElement(
                        elementName = ElementName.ITEM,
                        tokenName = "android:textAppearance",
                        value = resourceReferenceProvider.style(textAppearanceName),
                        usePrefix = false,
                    )
                }
            }
        }
        builder.appendComment(token.description)
        builder.appendTypographyToken(token, tokenValue, textAppearanceName)

        if (!needGenerateViewSystem && target.isViewSystemOrAll) needGenerateViewSystem = true
    }

    private fun addComposeToken(token: TypographyToken) = with(ktFileBuilder) {
        val tokenValue = token.value ?: return
        when (token.screenClass) {
            TypographyToken.ScreenClass.SMALL -> smallBuilder.addTypographyToken(
                token.ktName,
                token.description,
                tokenValue,
            )

            TypographyToken.ScreenClass.LARGE -> largeBuilder.addTypographyToken(
                token.ktName,
                token.description,
                tokenValue,
            )

            else -> mediumBuilder.addTypographyToken(token.ktName, token.description, tokenValue)
        }
        if (!needGenerateCompose && target.isComposeOrAll) needGenerateCompose = true
    }

    private fun XmlDocumentBuilder.appendTypographyToken(
        token: TypographyToken,
        tokenValue: TypographyToken.Value,
        textAppearanceName: String,
    ) {
        val textSizeDimen = DimenData(
            "${token.name.techToSnakeCase()}_text_size",
            tokenValue.textSize,
            DimenData.Type.SP,
        )
        val lineHeightDimen = DimenData(
            "${token.name.techToSnakeCase()}_line_height",
            tokenValue.lineHeight,
            DimenData.Type.SP,
        )

        dimensAggregator.addDimen(textSizeDimen)
        dimensAggregator.addDimen(lineHeightDimen)

        appendStyle(textAppearanceName) {
            appendElement(ElementName.ITEM, "fontFamily", tokenValue.fontFamily, usePrefix = false)
            appendElement(ElementName.ITEM, "fontWeight", tokenValue.fontWeight.toString(), usePrefix = false)
            appendElement(ElementName.ITEM, "android:fontStyle", tokenValue.fontStyle, usePrefix = false)
            appendElement(
                ElementName.ITEM,
                "android:letterSpacing",
                tokenValue.letterSpacing.toString(),
                usePrefix = false,
            )
            appendElement(
                ElementName.ITEM,
                "android:textSize",
                resourceReferenceProvider.dimen(textSizeDimen),
                usePrefix = false,
            )
            appendElement(
                ElementName.ITEM,
                "android:lineHeight",
                resourceReferenceProvider.dimen(lineHeightDimen),
                usePrefix = false,
            )
        }
    }

    context (KtFileBuilder)
    private fun TypeSpec.Builder.addTypographyToken(
        name: String,
        description: String,
        tokenValue: TypographyToken.Value,
    ) {
        val initializer = KtFileBuilder.createConstructorCall(
            "TextStyle",
            "fontWeight = FontWeight(${tokenValue.fontWeight})",
            "fontSize = ${tokenValue.textSize}.sp",
            "lineHeight = ${tokenValue.lineHeight}.sp",
            "letterSpacing = ${tokenValue.letterSpacing}.sp",
        )
        appendProperty(name, KtFileBuilder.TypeTextStyle, initializer, description)
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
