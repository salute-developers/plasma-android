package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.Companion.DEFAULT_ROOT_ATTRIBUTES
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.TargetApi
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.TypographyTokenResult
import com.sdds.plugin.themebuilder.internal.token.TypographyToken
import com.sdds.plugin.themebuilder.internal.token.TypographyTokenValue
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
    target: ThemeBuilderTarget,
    private val dimensAggregator: DimensAggregator,
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val typographyTokenValues: Map<String, TypographyTokenValue>,
) : TokenGenerator<TypographyToken, TypographyTokenResult>(target) {

    private val textAppearanceXmlBuilders =
        mutableMapOf<TypographyToken.ScreenClass, XmlResourcesDocumentBuilder>()
    private val typographyXmlBuilder by unsafeLazy {
        xmlBuilderFactory.create(DEFAULT_ROOT_ATTRIBUTES)
    }
    private val ktFileBuilder by unsafeLazy { ktFileBuilderFactory.create("TypographyTokens") }
    private val largeBuilder by unsafeLazy { ktFileBuilder.rootObject("TypographyLargeTokens") }
    private val mediumBuilder by unsafeLazy { ktFileBuilder.rootObject("TypographyMediumTokens") }
    private val smallBuilder by unsafeLazy { ktFileBuilder.rootObject("TypographySmallTokens") }
    private var needDeclareStyle: Boolean = true

    private val composeTokenDataCollector = mutableListOf<TypographyTokenResult.TokenData>()
    private val viewTokenDataCollector = mutableListOf<TypographyTokenResult.TokenData>()

    override fun collectResult() = TypographyTokenResult(
        composeTokens = composeTokenDataCollector,
        viewTokens = viewTokenDataCollector,
    )

    /**
     * @see TokenGenerator.generateViewSystem
     */
    override fun generateViewSystem() {
        super.generateViewSystem()
        textAppearanceXmlBuilders.forEach {
            it.value.build(outputResDir.textAppearancesXmlFile(it.key.qualifier()))
        }
        typographyXmlBuilder.build(outputResDir.typographyXmlFile())
    }

    /**
     * @see TokenGenerator.generateCompose
     */
    override fun generateCompose() {
        super.generateCompose()
        ktFileBuilder.addImport(KtFileBuilder.TypeSp)
        ktFileBuilder.addImport(KtFileBuilder.TypeFontWeight)
        ktFileBuilder.build(outputLocation)
    }

    /**
     * @see TokenGenerator.addViewSystemToken
     */
    override fun addViewSystemToken(token: TypographyToken): Boolean {
        val tokenValue = typographyTokenValues[token.name] ?: return false
        val builder =
            textAppearanceXmlBuilders[token.screenClass] ?: xmlBuilderFactory.create(
                DEFAULT_ROOT_ATTRIBUTES,
            ).also {
                textAppearanceXmlBuilders[token.screenClass] = it
            }
        val textAppearanceName = "TextAppearance.${token.xmlName}"
        val typographyName = "Typography.${token.xmlName}"

        if (token.screenClass.isDefault) {
            if (needDeclareStyle) {
                needDeclareStyle = false
                builder.appendStyle("TextAppearance")
                typographyXmlBuilder.appendStyle("Typography")
            }
            with(typographyXmlBuilder) {
                appendComment(token.description)
                appendStyle(typographyName) {
                    appendElement(
                        elementName = ElementName.ITEM,
                        tokenName = "android:textAppearance",
                        value = resourceReferenceProvider.style(textAppearanceName),
                        usePrefix = false,
                    )
                }
            }
            viewTokenDataCollector.add(
                TypographyTokenResult.TokenData(
                    attrName = "typography${token.xmlName}",
                    tokenRefName = resourceReferenceProvider.style(typographyName),
                ),
            )
        }
        builder.appendComment(token.description)
        builder.appendTypographyToken(token, tokenValue, textAppearanceName)
        return true
    }

    /**
     * @see TokenGenerator.addComposeToken
     */
    override fun addComposeToken(token: TypographyToken): Boolean {
        val tokenValue = typographyTokenValues[token.name] ?: return false
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
        return true
    }

    private fun XmlResourcesDocumentBuilder.appendTypographyToken(
        token: TypographyToken,
        tokenValue: TypographyTokenValue,
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
            appendElement(
                elementName = ElementName.ITEM,
                tokenName = "fontFamily",
                value = resourceReferenceProvider.font(
                    name = tokenValue.fontFamilyRef
                        .split('.')
                        .last(),
                ),
                usePrefix = false,
            )
            appendElement(
                ElementName.ITEM,
                "fontWeight",
                tokenValue.fontWeight.toString(),
                usePrefix = false,
            )
            appendElement(
                ElementName.ITEM,
                "android:textStyle",
                tokenValue.fontStyle,
                usePrefix = false,
            )
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
                targetApi = TargetApi.P,
                usePrefix = false,
            )
        }
    }

    private fun TypeSpec.Builder.addTypographyToken(
        name: String,
        description: String,
        tokenValue: TypographyTokenValue,
    ) = with(ktFileBuilder) {
        val letterSpacing = if (tokenValue.letterSpacing < 0) {
            "(${tokenValue.letterSpacing}).sp"
        } else {
            "${tokenValue.letterSpacing}.sp"
        }
        val initializer = KtFileBuilder.createConstructorCall(
            "TextStyle",
            "fontWeight = FontWeight(${tokenValue.fontWeight})",
            "fontSize = ${tokenValue.textSize}.sp",
            "lineHeight = ${tokenValue.lineHeight}.sp",
            "letterSpacing = $letterSpacing",
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
