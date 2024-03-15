package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.ThemeBuilderTarget.Companion.isComposeOrAll
import com.sdds.plugin.themebuilder.ThemeBuilderTarget.Companion.isViewSystemOrAll
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.colorsXmlFile
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
    private val target: ThemeBuilderTarget,
    private val xmlBuilderFactory: XmlDocumentBuilderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
) : TokenGenerator<ColorToken> {

    private val xmlDocumentBuilder by unsafeLazy { xmlBuilderFactory.create() }
    private val ktFileBuilder by unsafeLazy { ktFileBuilderFactory.create("ColorTokens") }
    private val lightBuilder by unsafeLazy { ktFileBuilder.rootObject("LightColorTokens") }
    private val darkBuilder by unsafeLazy { ktFileBuilder.rootObject("DarkColorTokens") }
    private var needGenerateCompose: Boolean = false
    private var needGenerateViewSystem: Boolean = false

    /**
     * @see TokenGenerator.addToken
     */
    override fun addToken(token: ColorToken) {
        when (target) {
            ThemeBuilderTarget.VIEW_SYSTEM -> addViewSystemToken(token)
            ThemeBuilderTarget.COMPOSE -> addComposeToken(token)
            ThemeBuilderTarget.ALL -> {
                addViewSystemToken(token)
                addComposeToken(token)
            }
        }
    }

    /**
     * @see TokenGenerator.generate
     */
    override fun generate() {
        if (needGenerateViewSystem) {
            xmlDocumentBuilder.build(outputResDir.colorsXmlFile())
        }

        if (needGenerateCompose) {
            ktFileBuilder.build(outputLocation)
        }
    }

    private fun addViewSystemToken(token: ColorToken) {
        val tokenValue = token.value ?: return
        xmlDocumentBuilder.appendComment(token.description)
        xmlDocumentBuilder.appendElement(ElementName.COLOR, token.xmlName, tokenValue.origin)
        if (!needGenerateViewSystem && target.isViewSystemOrAll) needGenerateViewSystem = true
    }

    private fun addComposeToken(token: ColorToken) = with(ktFileBuilder) {
        val tokenValue = token.value ?: return
        val root = if (token.tags.contains("dark")) {
            darkBuilder
        } else if (token.tags.contains("light")) {
            lightBuilder
        } else {
            return
        }
        val value = "Color(${tokenValue.origin.replace("#", "0x")})"
        root.appendProperty(token.ktName, KtFileBuilder.TypeColor, value, token.description)
        if (!needGenerateCompose && target.isComposeOrAll) needGenerateCompose = true
    }
}
