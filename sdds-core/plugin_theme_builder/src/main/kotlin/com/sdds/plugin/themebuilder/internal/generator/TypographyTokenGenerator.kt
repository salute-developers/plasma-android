package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.Companion.DEFAULT_ROOT_ATTRIBUTES
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.TargetApi
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.fonts.FontsAggregator
import com.sdds.plugin.themebuilder.internal.generator.data.TypographyTokenResult
import com.sdds.plugin.themebuilder.internal.token.TypographyToken
import com.sdds.plugin.themebuilder.internal.token.TypographyToken.ScreenClass
import com.sdds.plugin.themebuilder.internal.token.TypographyTokenValue
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.textAppearancesXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.typographyXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.sdds.plugin.themebuilder.internal.validator.TypographyTokenValidator
import com.squareup.kotlinpoet.TypeSpec
import java.io.File
import java.util.Locale

/**
 * Генерирует токены типографики.
 *
 * В этом генераторе механизмы генерации и формирования результата для View и Compose имеют существенные различия.
 * Compose-токены сразу добавляются в соответствующие объекты для small/medium/large экранов,
 * а результат генерации размещается в 3 соответствующих словаря. View-токены сначала агрегируются в 3 словаря,
 * затем textAppearance раскладываются по трем файлам, а результат генерации содержит 1 словарь,
 * т.к. ссылка на токен типографики в xml идентичная для всех типов экранов.
 *
 * @param outputLocation локация для сохранения kt-файла с токенами
 * @param outputResDir директория для сохранения xml-файла с токенами
 * @param dimensAggregator агрегатор размеров
 * @param xmlBuilderFactory фабрика делегата построения xml файлов
 * @param ktFileBuilderFactory фабрика делегата построения kt файлов
 * @param resourceReferenceProvider провайдер ссылок на ресурсы
 * @param typographyTokenValues значения токенов типографики
 * @param fontsAggregator агрегатор шрифтов
 * @author Малышев Александр on 07.03.2024
 */
internal class TypographyTokenGenerator(
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val outputResDir: File,
    target: ThemeBuilderTarget,
    private val dimensAggregator: DimensAggregator,
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val typographyTokenValues: Map<String, TypographyTokenValue>,
    private val fontsAggregator: FontsAggregator,
) : TokenGenerator<TypographyToken, TypographyTokenResult>(target) {

    private val textAppearanceXmlBuilders =
        mutableMapOf<ScreenClass, XmlResourcesDocumentBuilder>()
    private val typographyXmlBuilder by unsafeLazy {
        xmlBuilderFactory.create(DEFAULT_ROOT_ATTRIBUTES)
    }
    private val ktFileBuilder by unsafeLazy { ktFileBuilderFactory.create("TypographyTokens") }
    private val largeBuilder by unsafeLazy { ktFileBuilder.rootObject(TYPOGRAPHY_LARGE_TOKENS_NAME) }
    private val mediumBuilder by unsafeLazy { ktFileBuilder.rootObject(TYPOGRAPHY_MEDIUM_TOKENS_NAME) }
    private val smallBuilder by unsafeLazy { ktFileBuilder.rootObject(TYPOGRAPHY_SMALL_TOKENS_NAME) }
    private var needDeclareStyle: Boolean = true

    private val composeSmallTokenDataCollector = mutableMapOf<String, String>()
    private val composeMediumTokenDataCollector = mutableMapOf<String, String>()
    private val composeLargeTokenDataCollector = mutableMapOf<String, String>()

    private val viewTokenDataCollector = mutableMapOf<String, String>()

    private val viewSmallTokens = mutableMapOf<String, TypographyToken>()
    private val viewMediumTokens = mutableMapOf<String, TypographyToken>()
    private val viewLargeTokens = mutableMapOf<String, TypographyToken>()

    override fun collectResult() = TypographyTokenResult(
        composeTokens = TypographyTokenResult.ComposeTokenData(
            small = composeSmallTokenDataCollector,
            medium = composeMediumTokenDataCollector,
            large = composeLargeTokenDataCollector,
        ),
        viewTokens = TypographyTokenResult.ViewTokenData(
            attrs = viewTokenDataCollector,
        ),
    )

    /**
     * @see TokenGenerator.generateViewSystem
     */
    override fun generateViewSystem() {
        super.generateViewSystem()

        val mergedTokenKeys = viewSmallTokens.keys + viewMediumTokens.keys + viewLargeTokens.keys

        mergedTokenKeys.forEach {
            generateViewTypographyTokens(tokenName = it, screenClass = ScreenClass.SMALL)
            generateViewTypographyTokens(tokenName = it, screenClass = ScreenClass.MEDIUM)
            generateViewTypographyTokens(tokenName = it, screenClass = ScreenClass.LARGE)
        }

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
        ktFileBuilder.addImport(KtFileBuilder.TypeLineHeightStyle)
        ktFileBuilder.addImport(KtFileBuilder.TypePlatformTextStyle)
        ktFileBuilder.build(outputLocation)
    }

    /**
     * @see TokenGenerator.addViewSystemToken
     */
    override fun addViewSystemToken(token: TypographyToken): Boolean {
        val tokenXmlName = token.xmlName
        when (token.screenClass) {
            ScreenClass.SMALL -> viewSmallTokens[tokenXmlName] = token
            ScreenClass.LARGE -> viewLargeTokens[tokenXmlName] = token
            else -> viewMediumTokens[tokenXmlName] = token
        }
        return true
    }

    /**
     * @see TokenGenerator.addComposeToken
     */
    override fun addComposeToken(token: TypographyToken): Boolean {
        val tokenValue = typographyTokenValues[token.name]
            ?: throw ThemeBuilderException(
                "Can't find value for typography token ${token.name}. " +
                    "It should be in android_typography.json.",
            )
        TypographyTokenValidator.validate(tokenValue, token.name)
        val attrName = token.ktName.decapitalize(Locale.getDefault())
        when (token.screenClass) {
            ScreenClass.SMALL -> {
                smallBuilder.addTypographyToken(
                    token.ktName,
                    token.description,
                    tokenValue,
                )
                val tokenRef = "$TYPOGRAPHY_SMALL_TOKENS_NAME.${token.ktName}"
                composeSmallTokenDataCollector[attrName] = tokenRef
            }

            ScreenClass.LARGE -> {
                largeBuilder.addTypographyToken(
                    token.ktName,
                    token.description,
                    tokenValue,
                )
                val tokenRef = "$TYPOGRAPHY_LARGE_TOKENS_NAME.${token.ktName}"
                composeLargeTokenDataCollector[attrName] = tokenRef
            }

            else -> {
                mediumBuilder.addTypographyToken(
                    token.ktName,
                    token.description,
                    tokenValue,
                )
                val tokenRef = "$TYPOGRAPHY_MEDIUM_TOKENS_NAME.${token.ktName}"
                composeMediumTokenDataCollector[attrName] = tokenRef
            }
        }
        return true
    }

    private fun generateViewTypographyTokens(tokenName: String, screenClass: ScreenClass) {
        val token = findTypographyTokenByScreenClass(tokenName, screenClass)
            ?: throw ThemeBuilderException("Token $tokenName not found")
        val tokenValue = typographyTokenValues[token.name]
            ?: throw ThemeBuilderException(
                "Can't find value for typography token ${token.name}. " +
                    "It should be in android_typography.json.",
            )
        TypographyTokenValidator.validate(tokenValue, token.name)
        val builder =
            textAppearanceXmlBuilders[screenClass] ?: xmlBuilderFactory.create(
                DEFAULT_ROOT_ATTRIBUTES,
            ).also {
                textAppearanceXmlBuilders[screenClass] = it
            }
        val textAppearanceName = "TextAppearance.${token.xmlName}"
        if (screenClass == ScreenClass.MEDIUM) {
            if (needDeclareStyle) {
                needDeclareStyle = false
                builder.appendStyleWithCompositePrefix("TextAppearance")
                typographyXmlBuilder.appendStyleWithCompositePrefix("Typography")
            }
            val typographyName = "Typography.${token.xmlName}"
            with(typographyXmlBuilder) {
                appendComment(token.description)
                appendStyleWithCompositePrefix(typographyName) {
                    appendElement(
                        elementName = ElementName.ITEM,
                        tokenName = "android:textAppearance",
                        value = resourceReferenceProvider.style(textAppearanceName),
                        usePrefix = false,
                    )
                }
            }
            val attrName = "typography${token.xmlName}"
            val tokenRef = resourceReferenceProvider.style(typographyName)
            viewTokenDataCollector[attrName] = tokenRef
        }
        builder.appendComment(token.description)
        builder.appendTypographyToken(token, tokenValue, textAppearanceName)
    }

    private fun findTypographyTokenByScreenClass(
        tokenName: String,
        screenClass: ScreenClass,
    ): TypographyToken? {
        return when (screenClass) {
            ScreenClass.SMALL -> viewSmallTokens[tokenName]
                ?: viewMediumTokens[tokenName]
                ?: viewLargeTokens[tokenName]

            ScreenClass.LARGE -> viewLargeTokens[tokenName]
                ?: viewMediumTokens[tokenName]
                ?: viewSmallTokens[tokenName]

            else -> viewMediumTokens[tokenName]
                ?: viewSmallTokens[tokenName]
                ?: viewLargeTokens[tokenName]
        }
    }

    @Suppress("LongMethod")
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

        appendStyleWithCompositePrefix(textAppearanceName) {
            val fontFamily = tokenValue.fontFamilyRef
                .split('.')
                .last()
            val fontData = fontsAggregator.fonts[fontFamily]
                ?.find {
                    it.fontWeight == tokenValue.fontWeight && it.fontStyle == tokenValue.fontStyle
                } ?: throw ThemeBuilderException("Can't find font for typography token $token")
            appendElement(
                elementName = ElementName.ITEM,
                tokenName = "fontFamily",
                value = resourceReferenceProvider.font(fontData),
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
                "android:textFontWeight",
                tokenValue.fontWeight.toString(),
                targetApi = TargetApi.P,
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
            "fontFamily = FontTokens.${
                tokenValue.fontFamilyRef.split('.').last()
            }",
            "lineHeightStyle = LineHeightStyle(" +
                "alignment = LineHeightStyle.Alignment.Center, " +
                "trim = LineHeightStyle.Trim.None" +
                ")",
            "platformStyle = PlatformTextStyle(includeFontPadding = false)",
        )
        appendProperty(name, KtFileBuilder.TypeTextStyle, initializer, description)
    }

    private companion object {
        const val TYPOGRAPHY_SMALL_TOKENS_NAME = "TypographySmallTokens"
        const val TYPOGRAPHY_MEDIUM_TOKENS_NAME = "TypographyMediumTokens"
        const val TYPOGRAPHY_LARGE_TOKENS_NAME = "TypographyLargeTokens"

        fun ScreenClass.qualifier(): String {
            return when (this) {
                ScreenClass.SMALL -> "small"
                ScreenClass.LARGE -> "large"
                else -> ""
            }
        }
    }
}
