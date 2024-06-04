package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.Companion.DEFAULT_ROOT_ATTRIBUTES
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.colorAttrName
import com.sdds.plugin.themebuilder.internal.token.isDark
import com.sdds.plugin.themebuilder.internal.token.isLight
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.colorsXmlFile
import com.sdds.plugin.themebuilder.internal.utils.HexFormat
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.resolveColor
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
    private val lightBuilder by unsafeLazy { ktFileBuilder.rootObject("LightColorTokens") }
    private val darkBuilder by unsafeLazy { ktFileBuilder.rootObject("DarkColorTokens") }

    private val composeTokenDataCollector =
        mutableListOf<ColorTokenResult.TokenData>()
    private val viewTokenDataCollector =
        mutableListOf<ColorTokenResult.TokenData>()

    override fun collectResult() = ColorTokenResult(
        composeTokens = composeTokenDataCollector,
        viewTokens = viewTokenDataCollector,
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
        val tokenValue = colorTokenValues[token.name] ?: return false
        if (!token.isLight && !token.isDark) return false
        val resolvedColor = resolveColor(tokenValue, palette, HexFormat.XML_HEX) ?: return false
        xmlDocumentBuilder.appendComment(token.description)
        xmlDocumentBuilder.appendElement(
            elementName = ElementName.COLOR,
            tokenName = token.xmlName,
            value = resolvedColor,
        )
        viewTokenDataCollector.add(
            ColorTokenResult.TokenData(
                attrName = token.colorAttrName(),
                tokenRefName = token.toViewTokenRef(),
                isLight = token.isLight,
            ),
        )
        return true
    }

    /**
     * @see TokenGenerator.addComposeToken
     */
    @Suppress("ReturnCount")
    override fun addComposeToken(token: ColorToken): Boolean = with(ktFileBuilder) {
        val tokenValue = colorTokenValues[token.name] ?: return false
        val root = if (token.isDark) {
            darkBuilder
        } else if (token.isLight) {
            lightBuilder
        } else {
            return false
        }
        val resolvedColor = resolveColor(tokenValue, palette, HexFormat.INT_HEX) ?: return false
        val value = "Color($resolvedColor)"
        root.appendProperty(token.ktName, KtFileBuilder.TypeColor, value, token.description)
        composeTokenDataCollector.add(
            ColorTokenResult.TokenData(
                attrName = token.ktName.decapitalize(Locale.getDefault()),
                tokenRefName = token.ktName,
                isLight = token.isLight,
            ),
        )
        return true
    }

    private fun ColorToken.toViewTokenRef(): String = resourceReferenceProvider.color(xmlName)
}
