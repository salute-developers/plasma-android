package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.Companion.DEFAULT_ROOT_ATTRIBUTES
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.colorAttrName
import com.sdds.plugin.themebuilder.internal.token.isDark
import com.sdds.plugin.themebuilder.internal.token.isLight
import com.sdds.plugin.themebuilder.internal.utils.ColorResolver.HexFormat
import com.sdds.plugin.themebuilder.internal.utils.ColorResolver.resolveColor
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.colorsXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import java.io.File
import java.util.Locale

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
    private val colorTokenValues: Map<String, String>,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val palette: Map<String, Map<String, String>>,
) : TokenGenerator<ColorToken, ColorTokenResult>(target) {

    private val xmlDocumentBuilder by unsafeLazy { xmlBuilderFactory.create(DEFAULT_ROOT_ATTRIBUTES) }
    private val ktFileBuilder by unsafeLazy { ktFileBuilderFactory.create("ColorTokens") }
    private val lightBuilder by unsafeLazy {
        ktFileBuilder.rootObject(LIGHT_COLOR_TOKENS_NAME, LIGHT_COLOR_TOKENS_DESC)
    }
    private val darkBuilder by unsafeLazy {
        ktFileBuilder.rootObject(DARK_COLOR_TOKENS_NAME, DARK_COLOR_TOKENS_DESC)
    }

    private val composeLightTokenDataCollector = mutableMapOf<String, ColorTokenResult.TokenData.ColorInfo>()
    private val composeDarkTokenDataCollector = mutableMapOf<String, ColorTokenResult.TokenData.ColorInfo>()
    private val viewLightTokenDataCollector = mutableMapOf<String, ColorTokenResult.TokenData.ColorInfo>()
    private val viewDarkTokenDataCollector = mutableMapOf<String, ColorTokenResult.TokenData.ColorInfo>()

    override fun collectResult() = ColorTokenResult(
        composeTokens = ColorTokenResult.TokenData(
            light = composeLightTokenDataCollector,
            dark = composeDarkTokenDataCollector,
        ),
        viewTokens = ColorTokenResult.TokenData(
            light = viewLightTokenDataCollector,
            dark = viewDarkTokenDataCollector,
        ),
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
        val tokenValue = colorTokenValues[token.name]
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
        token.addViewTokenData(token.colorAttrName(), token.toViewTokenRef(), token.description)
        return true
    }

    /**
     * @see TokenGenerator.addComposeToken
     */
    @Suppress("ReturnCount")
    override fun addComposeToken(token: ColorToken): Boolean = with(ktFileBuilder) {
        val tokenValue = colorTokenValues[token.name]
            ?: throw ThemeBuilderException(
                "Can't find value for color token ${token.name}. " +
                    "It should be in android_color.json.",
            )
        val root = if (token.isDark) {
            darkBuilder
        } else {
            lightBuilder
        }
        val resolvedColor = resolveColor(
            tokenValue = tokenValue,
            tokenName = token.name,
            palette = palette,
            hexFormat = HexFormat.INT_HEX,
        )
        val value = "Color($resolvedColor)"
        root.appendProperty(token.ktName, KtFileBuilder.TypeColor, value, token.description)
        token.addComposeTokenData(token.ktName.decapitalize(Locale.getDefault()), token.ktName, token.description)
        return true
    }

    private fun ColorToken.addViewTokenData(attrName: String, tokenRef: String, description: String) {
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

    private fun ColorToken.addComposeTokenData(attrName: String, tokenRef: String, description: String) {
        val info = ColorTokenResult.TokenData.ColorInfo(tokenRef, description)
        if (this.isLight) {
            composeLightTokenDataCollector[attrName] = info
        } else if (this.isDark) {
            composeDarkTokenDataCollector[attrName] = info
        } else {
            composeLightTokenDataCollector[attrName] = info
            composeDarkTokenDataCollector[attrName] = info
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
