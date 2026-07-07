package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.Companion.DEFAULT_ROOT_ATTRIBUTES
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.tenant.Tenant
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.ColorTokenValue
import com.sdds.plugin.themebuilder.internal.token.GeneratedTokenInfo
import com.sdds.plugin.themebuilder.internal.token.colorAttrName
import com.sdds.plugin.themebuilder.internal.token.isDark
import com.sdds.plugin.themebuilder.internal.token.isLight
import com.sdds.plugin.themebuilder.internal.token.toJson
import com.sdds.plugin.themebuilder.internal.utils.ColorResolver.HexFormat
import com.sdds.plugin.themebuilder.internal.utils.ColorResolver.resolveColor
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.colorsXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.decapitalized
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import java.io.File

/**
 * Генератор токенов цветов
 * @property outputLocation локация для сохранения kt-файла с токенами
 * @property outputResDir директория для сохранения xml-файла с токенами
 * @param target целевой фреймворк
 * @property xmlBuilderFactory фабрика делегата построения xml файлов
 * @property ktFileBuilderFactory фабрика делегата построения kt файлов
 * @property colorTokenValues словарь значений токенов цвета
 * @property resourceReferenceProvider провайдер ссылки на ресурс
 * @author Малышев Александр on 07.03.2024
 */
internal class ColorTokenGenerator(
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val outputResDir: File,
    target: ThemeBuilderTarget,
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val colorTokenValues: Map<Tenant, Map<String, String>>,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val palette: Map<String, Map<String, String>>,
    private val themeName: String,
) : TokenGenerator<ColorToken, ColorTokenResult>(target) {

    private val xmlDocumentBuilder by unsafeLazy { xmlBuilderFactory.create(DEFAULT_ROOT_ATTRIBUTES) }
    private val ktFileBuilder by unsafeLazy { ktFileBuilderFactory.create("ColorTokens") }
    private val lightBuilders by unsafeLazy {
        mutableMapOf(
            Tenant.Default to ktFileBuilder.rootObject(
                LIGHT_COLOR_TOKENS_NAME,
                LIGHT_COLOR_TOKENS_DESC,
            ),
        )
    }
    private val darkBuilders by unsafeLazy {
        mutableMapOf(
            Tenant.Default to ktFileBuilder.rootObject(
                DARK_COLOR_TOKENS_NAME,
                DARK_COLOR_TOKENS_DESC,
            ),
        )
    }

    private val composeLightTokenDataCollectors =
        mutableMapOf<Tenant, MutableMap<String, ColorTokenResult.TokenData.ColorInfo>>()
    private val composeDarkTokenDataCollectors =
        mutableMapOf<Tenant, MutableMap<String, ColorTokenResult.TokenData.ColorInfo>>()
    private val viewLightTokenDataCollector =
        mutableMapOf<String, ColorTokenResult.TokenData.ColorInfo>()
    private val viewDarkTokenDataCollector =
        mutableMapOf<String, ColorTokenResult.TokenData.ColorInfo>()

    private val generatedTokens = mutableListOf<GeneratedTokenInfo>()

    override fun collectResult() = ColorTokenResult(
        tokens = tokens,
        composeTokens = colorTokenValues.mapValues {
            ColorTokenResult.TokenData(
                light = composeLightTokenDataCollectors[it.key] ?: emptyMap(),
                dark = composeDarkTokenDataCollectors[it.key] ?: emptyMap(),
            )
        },
        viewTokens = ColorTokenResult.TokenData(
            light = viewLightTokenDataCollector,
            dark = viewDarkTokenDataCollector,
        ),
        tokenInfo = generatedTokens,
    )

    /**
     * @see TokenGenerator.generateViewSystem
     */
    override fun generateViewSystem() {
        xmlDocumentBuilder.build(outputResDir.colorsXmlFile())
    }

    /**
     * @see TokenGenerator.generateCompose
     */
    override fun generateCompose() {
        ktFileBuilder.build(outputLocation)
    }

    /**
     * @see TokenGenerator.addViewSystemToken
     */
    @Suppress("ReturnCount")
    override fun addViewSystemToken(token: ColorToken): Boolean {
        val tokenValue = colorTokenValues[Tenant.Default]?.get(token.name)
            ?: throw ThemeBuilderException(
                "Can't find value for color token ${token.name}. " +
                    "It should be in android_color.json.",
            )
        val resolvedColor = resolveColor(
            tokenValue = tokenValue,
            tokenName = token.name,
            palette = palette,
            hexFormat = HexFormat.XML_HEX,
        )
        xmlDocumentBuilder.appendComment(token.description)
        xmlDocumentBuilder.appendElement(
            elementName = ElementName.COLOR,
            tokenName = token.xmlName,
            value = resolvedColor,
        )
        val tokenRef = token.toViewTokenRef()
        token.addViewTokenData(token.colorAttrName(), tokenRef, token.description)
        return true
    }

    /**
     * @see TokenGenerator.addComposeToken
     */
    @Suppress("ReturnCount")
    override fun addComposeToken(token: ColorToken): Boolean {
        colorTokenValues[Tenant.Default]?.get(token.name)
            ?: throw ThemeBuilderException(
                "Can't find value for color token ${token.name}. " +
                    "It should be in android_color.json.",
            )
        colorTokenValues.forEach { (tenant, values) ->
            val tokenValue = values[token.name]
            if (tokenValue != null) {
                val root = if (token.isDark) {
                    darkBuilders.getOrPut(tenant) {
                        ktFileBuilder.rootObject(
                            "${DARK_COLOR_TOKENS_NAME}${tenant.name}",
                            DARK_COLOR_TOKENS_DESC,
                        )
                    }
                } else {
                    lightBuilders.getOrPut(tenant) {
                        ktFileBuilder.rootObject(
                            "${LIGHT_COLOR_TOKENS_NAME}${tenant.name}",
                            LIGHT_COLOR_TOKENS_DESC,
                        )
                    }
                }
                val resolvedColor = resolveColor(
                    tokenValue = tokenValue,
                    tokenName = token.name,
                    palette = palette,
                    hexFormat = HexFormat.INT_HEX,
                )
                val value = "Color($resolvedColor)"
                with(ktFileBuilder) {
                    root.appendProperty(
                        token.ktName,
                        KtFileBuilder.TypeColor,
                        value,
                        token.description,
                    )
                }
                val attrName = token.ktName.decapitalized()
                generatedTokens += GeneratedTokenInfo(
                    type = "color",
                    name = token.name,
                    reference = token.ktName,
                    themeReference = "${themeName.snakeToCamelCase()}Theme.colors.$attrName",
                    displayName = token.displayName,
                    description = token.description,
                    value = ColorTokenValue(resolvedColor).toJson(),
                )
                token.addComposeTokenData(
                    attrName,
                    token.ktName,
                    token.description,
                    tenant,
                )
            }
        }
        return true
    }

    private fun ColorToken.addViewTokenData(
        attrName: String,
        tokenRef: String,
        description: String,
    ) {
        val info = ColorTokenResult.TokenData.ColorInfo(tokenRef, description)
        if (this.isLight) {
            viewLightTokenDataCollector[attrName] = info
        } else if (this.isDark) {
            viewDarkTokenDataCollector[attrName] = info
        } else {
            viewLightTokenDataCollector[attrName] = info
            viewDarkTokenDataCollector[attrName] = info
        }
    }

    private fun ColorToken.addComposeTokenData(
        attrName: String,
        tokenRef: String,
        description: String,
        tenant: Tenant,
    ) {
        val info = ColorTokenResult.TokenData.ColorInfo(tokenRef, description)
        val lightCollector = composeLightTokenDataCollectors.getOrPut(tenant) {
            mutableMapOf()
        }
        val darkCollector = composeDarkTokenDataCollectors.getOrPut(tenant) {
            mutableMapOf()
        }
        if (this.isLight) {
            lightCollector[attrName] = info
        } else if (this.isDark) {
            darkCollector[attrName] = info
        } else {
            lightCollector[attrName] = info
            darkCollector[attrName] = info
        }
    }

    private fun ColorToken.toViewTokenRef(): String = resourceReferenceProvider.color(xmlName)

    internal companion object {
        const val LIGHT_COLOR_TOKENS_NAME = "LightColorTokens"
        const val LIGHT_COLOR_TOKENS_DESC = "Токены цвета для светлой темы"
        const val DARK_COLOR_TOKENS_NAME = "DarkColorTokens"
        const val DARK_COLOR_TOKENS_DESC = "Токены цвета для темной темы"
    }
}
