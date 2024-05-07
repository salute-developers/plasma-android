package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.Companion.DEFAULT_ROOT_ATTRIBUTES
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.theme.ThemeGenerator
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.isDark
import com.sdds.plugin.themebuilder.internal.token.isLight
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.colorsXmlFile
import com.sdds.plugin.themebuilder.internal.utils.colorToArgbHex
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import java.io.File

/**
 * Генератор токенов цветов
 * @param outputLocation локация для сохранения kt-файла с токенами
 * @param outputResDir директория для сохранения xml-файла с токенами
 * @param target целевой фреймворк
 * @param xmlBuilderFactory фабрика делегата построения xml файлов
 * @param ktFileBuilderFactory фабрика делегата построения kt файлов
 * @param colorTokenValues словарь значений токенов цвета
 * @param themeGenerator генератор атрибутов темы
 * @author Малышев Александр on 07.03.2024
 */
internal class ColorGenerator(
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val outputResDir: File,
    target: ThemeBuilderTarget,
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val colorTokenValues: Map<String, String>,
    private val themeGenerator: ThemeGenerator,
) : TokenGenerator<ColorToken>(target) {

    private val xmlDocumentBuilder by unsafeLazy { xmlBuilderFactory.create(DEFAULT_ROOT_ATTRIBUTES) }
    private val ktFileBuilder by unsafeLazy { ktFileBuilderFactory.create("ColorTokens") }
    private val lightBuilder by unsafeLazy { ktFileBuilder.rootObject("LightColorTokens") }
    private val darkBuilder by unsafeLazy { ktFileBuilder.rootObject("DarkColorTokens") }

    private val colorPaletteRegex = Regex("\\[\\w+.\\w+.\\d{2,4}](\\[-?0.\\d{1,2}\\])?")

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
        val themeMode = if (token.isDark) {
            ThemeGenerator.ThemeMode.DARK
        } else if (token.isLight) {
            ThemeGenerator.ThemeMode.LIGHT
        } else {
            return false
        }
        xmlDocumentBuilder.appendComment(token.description)
        xmlDocumentBuilder.appendElement(ElementName.COLOR, token.xmlName, tokenValue)
        themeGenerator.addXmlColorAttribute(
            colorName = token.displayName,
            colorTokenName = token.xmlName,
            themeMode = themeMode,
        )
        return true
    }

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
        return true
    }
}
