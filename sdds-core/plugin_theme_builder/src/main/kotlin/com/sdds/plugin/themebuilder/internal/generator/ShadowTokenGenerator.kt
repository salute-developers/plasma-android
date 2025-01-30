package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Companion.appendObject
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.Companion.DEFAULT_ROOT_ATTRIBUTES
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.ShadowTokenResult
import com.sdds.plugin.themebuilder.internal.token.ShadowToken
import com.sdds.plugin.themebuilder.internal.token.ShadowTokenValue
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.shadowsXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.camelToSnakeCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.sdds.plugin.themebuilder.internal.validator.ShadowTokenValidator
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeSpec
import java.io.File

/**
 * Генератор токенов теней
 * @param outputLocation локация для сохранения kt-файла с токенами
 * @param outputResDir директория для сохранения xml-файла с токенами
 * @param target целевой фреймворк
 * @param xmlBuilderFactory фабрика делегата построения xml файлов
 * @param ktFileBuilderFactory фабрика делегата построения kt файлов
 * @param shadowTokenValues значения токенов теней
 * @param resourceReferenceProvider провайдер ссылок на ресурсы
 * @author Малышев Александр on 07.03.2024
 */
internal class ShadowTokenGenerator(
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val outputResDir: File,
    target: ThemeBuilderTarget,
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val shadowTokenValues: Map<String, List<ShadowTokenValue>>,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val dimensionsConfig: DimensionsConfig,
    private val dimensAggregator: DimensAggregator,
    namespace: String,
) : TokenGenerator<ShadowToken, ShadowTokenResult>(target) {

    private val xmlDocumentBuilder by unsafeLazy { xmlBuilderFactory.create(DEFAULT_ROOT_ATTRIBUTES) }
    private val ktFileBuilder by unsafeLazy { ktFileBuilderFactory.create(SHADOW_TOKENS_NAME) }
    private val rootShadows by unsafeLazy { ktFileBuilder.rootObject(SHADOW_TOKENS_NAME) }
    private val rFileImport = ClassName(namespace, "R")

    private val composeTokenDataCollector = mutableListOf<ShadowTokenResult.TokenData>()
    private val viewTokenDataCollector = mutableListOf<ShadowTokenResult.TokenData>()

    /**
     * @see TokenGenerator.collectResult
     */
    override fun collectResult() = ShadowTokenResult(
        composeTokenDataCollector,
        viewTokenDataCollector,
    )

    /**
     * @see TokenGenerator.generateViewSystem
     */
    override fun generateViewSystem() {
        super.generateViewSystem()
        xmlDocumentBuilder.build(outputResDir.shadowsXmlFile())
    }

    /**
     * @see TokenGenerator.generateCompose
     */
    override fun generateCompose() {
        super.generateCompose()
        ktFileBuilder.addImport(KtFileBuilder.TypeDpExtension)
        ktFileBuilder.addImport(KtFileBuilder.TypeCornerSize)
        if (dimensionsConfig.fromResources) {
            ktFileBuilder.addImport(KtFileBuilder.TypeDimensionResource)
            ktFileBuilder.addImport(rFileImport)
        }
        ktFileBuilder.build(outputLocation)
    }

    /**
     * @see TokenGenerator.addViewSystemToken
     */
    override fun addViewSystemToken(token: ShadowToken): Boolean = with(xmlDocumentBuilder) {
        val tokenValues = shadowTokenValues[token.name]
            ?: throw ThemeBuilderException(
                "Can't find value for shadow token ${token.name}. " +
                    "It should be in android_shadow.json.",
            )
        val layers = mutableListOf<ShadowTokenResult.ShadowLayer>()
        wrapWithRegion(token.description) {
            val useLayerSuffix = tokenValues.size > 1
            tokenValues.forEachIndexed { index, tokenValue ->
                ShadowTokenValidator.validate(tokenValue, token.name)
                val layerSuffix = "_layer_${index + 1}".takeIf { useLayerSuffix }.orEmpty()
                val tokenName = "${token.xmlName}$layerSuffix"
                appendElement(ElementName.COLOR, "shadow_${tokenName}_color", tokenValue.color)
                val offsetXRef = appendShadowDimenElement(
                    "shadow_${tokenName}_offset_x",
                    tokenValue.offsetX,
                )
                val offsetYRef = appendShadowDimenElement(
                    "shadow_${tokenName}_offset_y",
                    tokenValue.offsetY,
                )
                val spreadRadiusRef = appendShadowDimenElement(
                    "shadow_${tokenName}_spread",
                    tokenValue.spreadRadius,
                )
                val blurRadiusRef = appendShadowDimenElement(
                    "shadow_${tokenName}_blur",
                    tokenValue.blurRadius,
                )

                val elevationRef = tokenValue.fallbackElevation?.let {
                    appendShadowDimenElement("shadow_${tokenName}_elevation", it)
                }

                layers.add(
                    ShadowTokenResult.ShadowLayer(
                        colorRef = resourceReferenceProvider.color("shadow_${tokenName}_color"),
                        offsetXRef = offsetXRef,
                        offsetYRef = offsetYRef,
                        spreadRef = spreadRadiusRef,
                        blurRef = blurRadiusRef,
                        fallbackElevationRef = elevationRef,
                    ),
                )
            }
        }
        viewTokenDataCollector.add(
            ShadowTokenResult.TokenData(
                tokenTechName = token.name,
                layers = layers,
                tokenDescription = token.description,
            ),
        )
        return@with true
    }

    private fun XmlResourcesDocumentBuilder.appendShadowDimenElement(
        tokenName: String,
        value: Float,
    ): String {
        val dimenValue = value * dimensionsConfig.multiplier
        appendElement(
            ElementName.DIMEN,
            tokenName,
            "${dimenValue}dp",
        )
        return resourceReferenceProvider.dimen(tokenName)
    }

    /**
     * @see TokenGenerator.addComposeToken
     */
    override fun addComposeToken(token: ShadowToken): Boolean = with(ktFileBuilder) {
        val tokenValues = shadowTokenValues[token.name]
            ?: throw ThemeBuilderException(
                "Can't find value for shadow token ${token.name}. " +
                    "It should be in android_shadow.json.",
            )
        val useLayerSuffix = tokenValues.size > 1
        val layers = mutableListOf<ShadowTokenResult.ShadowLayer>()
        tokenValues.forEachIndexed { index, tokenValue ->
            ShadowTokenValidator.validate(tokenValue, token.name)
            val tokenName = "${token.ktName}Layer${index + 1}".takeIf { useLayerSuffix } ?: token.ktName
            rootShadows.appendObject(tokenName, token.description) {
                val layerRef = appendShadowProperties(tokenName, tokenValue, token.description)
                layers.add(layerRef)
            }
        }
        composeTokenDataCollector.add(
            ShadowTokenResult.TokenData(
                tokenTechName = token.name,
                layers = layers,
                tokenDescription = token.description,
            ),
        )
        return@with true
    }

    private fun TypeSpec.Builder.appendShadowProperties(
        tokenName: String,
        tokenValue: ShadowTokenValue,
        description: String,
    ): ShadowTokenResult.ShadowLayer =
        with(ktFileBuilder) {
            val offsetXRef = appendShadowProperty(
                tokenName,
                "offsetX",
                tokenValue.offsetX,
                description,
            )
            val offsetYRef = appendShadowProperty(
                tokenName,
                "offsetY",
                tokenValue.offsetY,
                description,
            )
            val spreadRadiusRef = appendShadowProperty(
                tokenName,
                "spreadRadius",
                tokenValue.spreadRadius,
                description,
            )
            val blurRadiusRef = appendShadowProperty(
                tokenName,
                "blurRadius",
                tokenValue.blurRadius,
                description,
            )
            val elevationRef = tokenValue.fallbackElevation?.let {
                appendShadowProperty(tokenName, "fallbackElevation", it, description)
            }
            appendProperty(
                "color",
                KtFileBuilder.TypeColor,
                "Color(${tokenValue.color.replace("#", "0x")})",
                description,
            )

            ShadowTokenResult.ShadowLayer(
                colorRef = "$SHADOW_TOKENS_NAME.$tokenName.color",
                offsetXRef = offsetXRef,
                offsetYRef = offsetYRef,
                spreadRef = spreadRadiusRef,
                blurRef = blurRadiusRef,
                fallbackElevationRef = elevationRef,
            )
        }

    private fun TypeSpec.Builder.appendShadowProperty(
        tokenName: String,
        propertyName: String,
        value: Float,
        description: String,
    ): String = with(ktFileBuilder) {
        if (dimensionsConfig.fromResources) {
            shadowPropertyWithResources(tokenName, propertyName, value, description)
        } else {
            shadowProperty(propertyName, value, description)
        }
        return "$SHADOW_TOKENS_NAME.$tokenName.$propertyName"
    }

    private fun TypeSpec.Builder.shadowProperty(
        propertyName: String,
        value: Float,
        description: String,
    ) = with(ktFileBuilder) {
        val dimenValue = value * dimensionsConfig.multiplier
        appendProperty(
            propertyName,
            KtFileBuilder.TypeDp,
            "$dimenValue.dp",
            description,
        )
    }

    private fun TypeSpec.Builder.shadowPropertyWithResources(
        tokenName: String,
        propertyName: String,
        value: Float,
        description: String,
    ) = with(ktFileBuilder) {
        val dimenValue = DimenData(
            name = "shadow_${tokenName.camelToSnakeCase()}_${propertyName.camelToSnakeCase()}",
            value = value,
            type = DimenData.Type.DP,
        )
        dimensAggregator.addDimen(dimenValue)
        val initializer = "dimensionResource(${resourceReferenceProvider.dimenR(dimenValue)})"

        appendProperty(
            name = propertyName,
            typeName = KtFileBuilder.TypeDp,
            propGetter = KtFileBuilder.Getter.Annotated(
                annotations = listOf(
                    KtFileBuilder.Annotation(KtFileBuilder.TypeAnnotationComposable),
                    KtFileBuilder.Annotation(KtFileBuilder.TypeAnnotationReadOnlyComposable),
                ),
                body = "return $initializer",
            ),
            description = description,
        )
    }

    companion object {
        internal const val SHADOW_TOKENS_NAME = "ShadowTokens"
    }
}
