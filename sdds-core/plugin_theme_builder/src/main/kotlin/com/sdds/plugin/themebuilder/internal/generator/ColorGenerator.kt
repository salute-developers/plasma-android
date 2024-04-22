package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.token.ColorToken
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
 * @author Малышев Александр on 07.03.2024
 */
internal class ColorGenerator(
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val outputResDir: File,
    target: ThemeBuilderTarget,
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val colorTokenValues: Map<String, String>,
) : TokenGenerator<ColorToken>(target) {

    private val xmlDocumentBuilder by unsafeLazy { xmlBuilderFactory.create() }
    private val ktFileBuilder by unsafeLazy { ktFileBuilderFactory.create("ColorTokens") }
    private val lightBuilder by unsafeLazy { ktFileBuilder.rootObject("LightColorTokens") }
    private val darkBuilder by unsafeLazy { ktFileBuilder.rootObject("DarkColorTokens") }

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
    override fun addViewSystemToken(token: ColorToken): Boolean {
        val tokenValue = colorTokenValues[token.name] ?: return false
        xmlDocumentBuilder.appendComment(token.description)
        xmlDocumentBuilder.appendElement(ElementName.COLOR, token.xmlName, tokenValue)
        return true
    }

    /**
     * @see TokenGenerator.addComposeToken
     */
    override fun addComposeToken(token: ColorToken): Boolean = with(ktFileBuilder) {
        val tokenValue = colorTokenValues[token.name] ?: return false
        val root = if (token.tags.contains("dark")) {
            darkBuilder
        } else if (token.tags.contains("light")) {
            lightBuilder
        } else {
            return false
        }
        val value = "Color(${colorToArgbHex(tokenValue)})"
        root.appendProperty(token.ktName, KtFileBuilder.TypeColor, value, token.description)
        return true
    }
}
