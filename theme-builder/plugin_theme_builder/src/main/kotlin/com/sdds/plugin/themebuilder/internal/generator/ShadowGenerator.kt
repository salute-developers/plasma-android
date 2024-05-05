package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.core.token.ShadowToken
import com.sdds.plugin.core.token.ShadowTokenValue
import com.sdds.plugin.core.utils.unsafeLazy
import com.sdds.plugin.themebuilder.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Companion.appendObject
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.Companion.DEFAULT_ROOT_ATTRIBUTES
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.shadowsXmlFile
import java.io.File

/**
 * Генератор токенов теней
 * @param outputLocation локация для сохранения kt-файла с токенами
 * @param outputResDir директория для сохранения xml-файла с токенами
 * @param target целевой фреймворк
 * @param xmlBuilderFactory фабрика делегата построения xml файлов
 * @param ktFileBuilderFactory фабрика делегата построения kt файлов
 * @author Малышев Александр on 07.03.2024
 */
internal class ShadowGenerator(
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val outputResDir: File,
    target: ThemeBuilderTarget,
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val shadowTokenValues: Map<String, ShadowTokenValue>,
) : TokenGenerator<ShadowToken>(target) {

    private val xmlDocumentBuilder by unsafeLazy { xmlBuilderFactory.create(DEFAULT_ROOT_ATTRIBUTES) }
    private val ktFileBuilder by unsafeLazy { ktFileBuilderFactory.create("ShadowTokens") }
    private val rootShadows by unsafeLazy { ktFileBuilder.rootObject("ShadowTokens") }

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
        val tokenValue = shadowTokenValues[token.name] ?: return@with false

        wrapWithRegion(token.description) {
            appendElement(ElementName.COLOR, "shadow_${token.xmlName}_color", tokenValue.color)
            appendElement(ElementName.DIMEN, "shadow_${token.xmlName}_elevation", "${tokenValue.elevation}dp")
        }
        return@with true
    }

    /**
     * @see TokenGenerator.addComposeToken
     */
    override fun addComposeToken(token: ShadowToken): Boolean = with(ktFileBuilder) {
        val tokenValue = shadowTokenValues[token.name] ?: return@with false

        rootShadows.appendObject(token.ktName, token.description) {
            appendProperty("elevation", KtFileBuilder.TypeDp, "${tokenValue.elevation}.dp", token.description)
            appendProperty(
                "color",
                KtFileBuilder.TypeColor,
                "Color(${tokenValue.color.replace("#", "0x")})",
                token.description,
            )
        }
        return@with true
    }
}
