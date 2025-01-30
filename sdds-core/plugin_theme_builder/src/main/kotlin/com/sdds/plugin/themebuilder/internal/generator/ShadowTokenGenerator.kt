package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Companion.appendObject
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.Companion.DEFAULT_ROOT_ATTRIBUTES
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.ShadowTokenResult
import com.sdds.plugin.themebuilder.internal.token.ShadowToken
import com.sdds.plugin.themebuilder.internal.token.ShadowTokenValue
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.shadowsXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.sdds.plugin.themebuilder.internal.validator.ShadowTokenValidator
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
) : TokenGenerator<ShadowToken, ShadowTokenResult>(target) {

    private val xmlDocumentBuilder by unsafeLazy { xmlBuilderFactory.create(DEFAULT_ROOT_ATTRIBUTES) }
    private val ktFileBuilder by unsafeLazy { ktFileBuilderFactory.create("ShadowTokens") }
    private val rootShadows by unsafeLazy { ktFileBuilder.rootObject("ShadowTokens") }

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
        appendElement(
            ElementName.DIMEN,
            tokenName,
            "${value}dp",
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
        tokenValues.forEachIndexed { index, tokenValue ->
            ShadowTokenValidator.validate(tokenValue, token.name)
            val tokenName = "${token.ktName}Layer${index + 1}"
            rootShadows.appendObject(tokenName, token.description) {
                appendProperty(
                    "elevation",
                    KtFileBuilder.TypeDp,
                    "${tokenValue.blurRadius}.dp",
                    token.description,
                )
                appendProperty(
                    "color",
                    KtFileBuilder.TypeColor,
                    "Color(${tokenValue.color.replace("#", "0x")})",
                    token.description,
                )
            }
        }
        return@with true
    }
}
