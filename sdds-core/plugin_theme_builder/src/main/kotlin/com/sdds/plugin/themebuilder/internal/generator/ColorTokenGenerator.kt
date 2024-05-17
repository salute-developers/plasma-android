package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.Companion.DEFAULT_ROOT_ATTRIBUTES
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenData
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.isDark
import com.sdds.plugin.themebuilder.internal.token.isLight
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.colorsXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.colorToArgbHex
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
    private val colorTokenValues: Map<String, String>,
    private val resourceReferenceProvider: ResourceReferenceProvider,
) : TokenGenerator<ColorToken, ColorTokenData>(target) {

    private val xmlDocumentBuilder by unsafeLazy { xmlBuilderFactory.create(DEFAULT_ROOT_ATTRIBUTES) }
    private val ktFileBuilder by unsafeLazy { ktFileBuilderFactory.create("ColorTokens") }
    private val lightBuilder by unsafeLazy { ktFileBuilder.rootObject("LightColorTokens") }
    private val darkBuilder by unsafeLazy { ktFileBuilder.rootObject("DarkColorTokens") }

    private val colorPaletteRegex = Regex("\\[\\w+.\\w+.\\d{2,4}](\\[-?0.\\d{1,2}\\])?")

    private val composeTokenDataCollector = mutableMapOf<ColorToken, String>()
    private val viewTokenDataCollector = mutableMapOf<ColorToken, String>()

    override fun collectResult() = ColorTokenData(
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
        if (colorPaletteRegex.matches(tokenValue)) return false // добавить поддержку палитры
        xmlDocumentBuilder.appendComment(token.description)
        xmlDocumentBuilder.appendElement(ElementName.COLOR, token.xmlName, tokenValue)
        viewTokenDataCollector[token] = token.toViewTokenRef()
        return true
    }

    private fun ColorToken.toViewTokenRef(): String = resourceReferenceProvider.color(xmlName)
    private fun ColorToken.toComposeTokenRef(): String = ktName

    /**
     * @see TokenGenerator.addComposeToken
     */
    @Suppress("ReturnCount")
    override fun addComposeToken(token: ColorToken): Boolean = with(ktFileBuilder) {
        val tokenValue = colorTokenValues[token.name] ?: return false
        if (colorPaletteRegex.matches(tokenValue)) return false // добавить поддержку палитры
        val root = if (token.isDark) {
            darkBuilder
        } else if (token.isLight) {
            lightBuilder
        } else {
            return false
        }
        val value = "Color(${colorToArgbHex(tokenValue)})"
        root.appendProperty(token.ktName, KtFileBuilder.TypeColor, value, token.description)
        composeTokenDataCollector[token] = token.toComposeTokenRef()
        return true
    }
}
