package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Annotation
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier
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
import com.sdds.plugin.themebuilder.internal.generator.data.TypographyTokenResult.TypographyInfo
import com.sdds.plugin.themebuilder.internal.tenant.Tenant
import com.sdds.plugin.themebuilder.internal.token.GeneratedTokenInfo
import com.sdds.plugin.themebuilder.internal.token.TypographyToken
import com.sdds.plugin.themebuilder.internal.token.TypographyToken.ScreenClass
import com.sdds.plugin.themebuilder.internal.token.TypographyTokenValue
import com.sdds.plugin.themebuilder.internal.token.toJson
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.textAppearancesXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.typographyXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.decapitalized
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.sdds.plugin.themebuilder.internal.validator.TypographyTokenValidator
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeSpec
import java.io.File
import kotlin.collections.component1
import kotlin.collections.component2

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
 * @param namespace пакет проекта
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
    private val typographyTokenValues: Map<Tenant, Map<String, TypographyTokenValue>>,
    private val fontsAggregator: FontsAggregator,
    private val dimensionsConfig: DimensionsConfig,
    private val themeName: String,
    namespace: String,
) : TokenGenerator<TypographyToken, TypographyTokenResult>(target) {

    private val textAppearanceXmlBuilders =
        mutableMapOf<ScreenClass, XmlResourcesDocumentBuilder>()
    private val typographyXmlBuilder by unsafeLazy {
        xmlBuilderFactory.create(DEFAULT_ROOT_ATTRIBUTES)
    }
    private val ktFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create("TypographyTokens")
            .apply { this.addSuppressAnnotation("DEPRECATION") }
    }
    private val largeBuilders by unsafeLazy {
        mutableMapOf(
            Tenant.Default to ktFileBuilder.rootObject(
                TYPOGRAPHY_LARGE_TOKENS_NAME,
                TYPOGRAPHY_LARGE_TOKENS_DESC,
            ),
        )
    }
    private val mediumBuilders by unsafeLazy {
        mutableMapOf(
            Tenant.Default to ktFileBuilder.rootObject(
                TYPOGRAPHY_MEDIUM_TOKENS_NAME,
                TYPOGRAPHY_MEDIUM_TOKENS_DESC,
            ),
        )
    }
    private val smallBuilders by unsafeLazy {
        mutableMapOf(
            Tenant.Default to ktFileBuilder.rootObject(
                TYPOGRAPHY_SMALL_TOKENS_NAME,
                TYPOGRAPHY_SMALL_TOKENS_DESC,
            ),
        )
    }
    private val defaultValuesBuilder by unsafeLazy {
        ktFileBuilder.rootObject(DEFAULTS_NAME, modifiers = PrivateModifier)
    }
    private var needDeclareStyle: Boolean = true

    private val composeSmallTokenDataCollectors = mutableMapOf<Tenant, MutableMap<String, TypographyInfo>>()
    private val composeMediumTokenDataCollectors = mutableMapOf<Tenant, MutableMap<String, TypographyInfo>>()
    private val composeLargeTokenDataCollectors = mutableMapOf<Tenant, MutableMap<String, TypographyInfo>>()

    private val viewTokenDataCollector = mutableMapOf<String, TypographyInfo>()

    private val generatedTokens = mutableListOf<GeneratedTokenInfo>()

    private val viewSmallTokens = mutableMapOf<String, TypographyToken>()
    private val viewMediumTokens = mutableMapOf<String, TypographyToken>()
    private val viewLargeTokens = mutableMapOf<String, TypographyToken>()
    private val rFileImport = ClassName(namespace, "R")

    override fun collectResult() = TypographyTokenResult(
        composeTokens = typographyTokenValues.mapValues {
            TypographyTokenResult.ComposeTokenData(
                composeSmallTokenDataCollectors[it.key] ?: emptyMap(),
                composeMediumTokenDataCollectors[it.key] ?: emptyMap(),
                composeLargeTokenDataCollectors[it.key] ?: emptyMap(),
            )
        },
        viewTokens = TypographyTokenResult.ViewTokenData(
            attrs = viewTokenDataCollector,
        ),
        tokenInfo = generatedTokens,
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
            it.value.build(outputResDir.textAppearancesXmlFile(it.key.qualifier(dimensionsConfig)))
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
        if (dimensionsConfig.fromResources) {
            ktFileBuilder.addImport(KtFileBuilder.TypeLocalDensity)
            ktFileBuilder.addImport(KtFileBuilder.TypeDimensionResource)
            ktFileBuilder.addImport(rFileImport)
        }
        addDefaults()
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
        typographyTokenValues[Tenant.Default]?.get(token.name)
            ?: throw ThemeBuilderException(
                "Can't find value for typography token ${token.name}. " +
                    "It should be in android_typography.json.",
            )
        typographyTokenValues.forEach { (tenant, values) ->
            val tokenValue = values[token.name]
            if (tokenValue != null) {
                TypographyTokenValidator.validate(tokenValue, token.name)
                val attrName = token.ktName.decapitalized()
                generatedTokens += GeneratedTokenInfo(
                    type = "typography",
                    name = token.name,
                    reference = token.ktName,
                    themeReference = "${themeName.snakeToCamelCase()}Theme.typography.$attrName",
                    displayName = token.displayName,
                    description = token.description,
                    value = tokenValue.toJson(),
                )
                val composeSmallTokenDataCollector = composeSmallTokenDataCollectors.getOrPut(tenant) { mutableMapOf() }
                val composeMediumTokenDataCollector = composeMediumTokenDataCollectors.getOrPut(
                    tenant,
                ) { mutableMapOf() }
                val composeLargeTokenDataCollector = composeLargeTokenDataCollectors.getOrPut(tenant) { mutableMapOf() }
                when (token.screenClass) {
                    ScreenClass.SMALL -> {
                        val smallBuilder = smallBuilders.getOrPut(tenant) {
                            ktFileBuilder.rootObject(
                                "${TYPOGRAPHY_SMALL_TOKENS_NAME}${tenant.name}",
                                TYPOGRAPHY_SMALL_TOKENS_DESC,
                            )
                        }
                        smallBuilder.addTypographyToken(
                            token,
                            token.description,
                            tokenValue,
                            tenant,
                        )
                        val tokenRef = "$TYPOGRAPHY_SMALL_TOKENS_NAME${tenant.name}.${token.ktName}"
                        composeSmallTokenDataCollector[attrName] = TypographyInfo(tokenRef, token.description)
                    }

                    ScreenClass.LARGE -> {
                        val largeBuilder = largeBuilders.getOrPut(tenant) {
                            ktFileBuilder.rootObject(
                                "${TYPOGRAPHY_LARGE_TOKENS_NAME}${tenant.name}",
                                TYPOGRAPHY_LARGE_TOKENS_DESC,
                            )
                        }
                        largeBuilder.addTypographyToken(
                            token,
                            token.description,
                            tokenValue,
                            tenant,
                        )
                        val tokenRef = "$TYPOGRAPHY_LARGE_TOKENS_NAME${tenant.name}.${token.ktName}"
                        composeLargeTokenDataCollector[attrName] = TypographyInfo(tokenRef, token.description)
                    }

                    else -> {
                        val mediumBuilder = mediumBuilders.getOrPut(tenant) {
                            ktFileBuilder.rootObject(
                                "${TYPOGRAPHY_MEDIUM_TOKENS_NAME}${tenant.name}",
                                TYPOGRAPHY_MEDIUM_TOKENS_DESC,
                            )
                        }
                        mediumBuilder.addTypographyToken(
                            token,
                            token.description,
                            tokenValue,
                            tenant,
                        )
                        val tokenRef = "$TYPOGRAPHY_MEDIUM_TOKENS_NAME${tenant.name}.${token.ktName}"
                        composeMediumTokenDataCollector[attrName] = TypographyInfo(tokenRef, token.description)
                    }
                }
            }
        }

        return true
    }

    private fun generateViewTypographyTokens(tokenName: String, screenClass: ScreenClass) {
        val token = findTypographyTokenByScreenClass(tokenName, screenClass)
            ?: throw ThemeBuilderException("Token $tokenName not found")
        val tokenValue = typographyTokenValues[Tenant.Default]?.get(token.name)
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
        if (screenClass == ScreenClass.SMALL) {
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
            val attrName = TypographyToken.getViewAttrName(token.name)
            val tokenRef = resourceReferenceProvider.style(typographyName)
            viewTokenDataCollector[attrName] = TypographyInfo(tokenRef, token.description)
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

    private fun addDefaults() = with(ktFileBuilder) {
        defaultValuesBuilder.appendProperty(
            name = DEFAULTS_LINE_STYLE_NAME,
            typeName = KtFileBuilder.TypeLineHeightStyle,
            initializer = """
                |LineHeightStyle(
                |   alignment = LineHeightStyle.Alignment.Center,
                |   trim = LineHeightStyle.Trim.None,
                |)
            """.trimMargin(),
        )

        defaultValuesBuilder.appendProperty(
            name = DEFAULTS_PLATFORM_STYLE_NAME,
            typeName = KtFileBuilder.TypePlatformTextStyle,
            initializer = "PlatformTextStyle(includeFontPadding = false)",
        )
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

    @Suppress("LongMethod")
    private fun TypeSpec.Builder.addTypographyToken(
        token: TypographyToken,
        description: String,
        tokenValue: TypographyTokenValue,
        tenant: Tenant,
    ) = with(ktFileBuilder) {
        val letterSpacing = if (tokenValue.letterSpacing < 0) {
            "(${tokenValue.letterSpacing}).sp"
        } else {
            "${tokenValue.letterSpacing}.sp"
        }
        val fromResources = dimensionsConfig.fromResources
        val fontSizeInitializer: String
        val lineHeightInitializer: String
        if (fromResources) {
            val tenantSuffix = if (tenant == Tenant.Default) {
                ""
            } else {
                "_${tenant.name.lowercase()}"
            }
            val textSizeDimen = DimenData(
                "${token.name.techToSnakeCase()}_text_size$tenantSuffix",
                tokenValue.textSize,
                DimenData.Type.SP,
            )
            val lineHeightDimen = DimenData(
                "${token.name.techToSnakeCase()}_line_height$tenantSuffix",
                tokenValue.lineHeight,
                DimenData.Type.SP,
            )
            dimensAggregator.addDimen(textSizeDimen)
            dimensAggregator.addDimen(lineHeightDimen)
            fontSizeInitializer = "dimensionResource(${resourceReferenceProvider.dimenR(textSizeDimen)}).toSp()"
            lineHeightInitializer = "dimensionResource(${resourceReferenceProvider.dimenR(lineHeightDimen)}).toSp()"
        } else {
            fontSizeInitializer = "${tokenValue.textSize * dimensionsConfig.multiplier}.sp"
            lineHeightInitializer = "${tokenValue.lineHeight * dimensionsConfig.multiplier}.sp"
        }
        val initializer = KtFileBuilder.createConstructorCall(
            "TextStyle",
            "fontWeight = FontWeight(${tokenValue.fontWeight})",
            "fontSize = $fontSizeInitializer",
            "lineHeight = $lineHeightInitializer",
            "letterSpacing = $letterSpacing",
            "fontFamily = FontTokens${tenant.name}.${tokenValue.fontFamilyRef.split('.').last()}",
            "lineHeightStyle = $DEFAULTS_NAME.$DEFAULTS_LINE_STYLE_NAME",
            "platformStyle = $DEFAULTS_NAME.$DEFAULTS_PLATFORM_STYLE_NAME",
        ).trimIndent()

        if (fromResources) {
            appendProperty(
                name = token.ktName,
                typeName = KtFileBuilder.TypeTextStyle,
                propGetter = KtFileBuilder.Getter.Annotated(
                    annotations = listOf(
                        Annotation(KtFileBuilder.TypeAnnotationComposable),
                        Annotation(KtFileBuilder.TypeAnnotationReadOnlyComposable),
                    ),
                    body = """return with(LocalDensity.current) {
                    |${initializer.trimMargin()}
                |}
                    """.trimMargin(),
                ),
                description = description,
            )
        } else {
            appendProperty(token.ktName, KtFileBuilder.TypeTextStyle, initializer, description)
        }
    }

    companion object {
        internal const val DEFAULTS_NAME = "TextStyleDefault"
        internal const val DEFAULTS_PLATFORM_STYLE_NAME = "platformStyle"
        internal const val DEFAULTS_LINE_STYLE_NAME = "lineHeightStyle"
        internal const val TYPOGRAPHY_SMALL_TOKENS_NAME = "TypographySmallTokens"
        internal const val TYPOGRAPHY_SMALL_TOKENS_DESC = "Токены типографии для ScreenClass.SMALL"
        internal const val TYPOGRAPHY_MEDIUM_TOKENS_NAME = "TypographyMediumTokens"
        internal const val TYPOGRAPHY_MEDIUM_TOKENS_DESC = "Токены типографии для ScreenClass.MEDIUM"
        internal const val TYPOGRAPHY_LARGE_TOKENS_NAME = "TypographyLargeTokens"
        internal const val TYPOGRAPHY_LARGE_TOKENS_DESC = "Токены типографии для ScreenClass.LARGE"
        internal val PrivateModifier = listOf(Modifier.PRIVATE)

        private fun ScreenClass.qualifier(dimensionsConfig: DimensionsConfig): String {
            val breakpoints = dimensionsConfig.breakPoints
            return when (this) {
                ScreenClass.MEDIUM -> "w${breakpoints.medium}dp"
                ScreenClass.LARGE -> "w${breakpoints.large}dp"
                else -> ""
            }
        }
    }
}
