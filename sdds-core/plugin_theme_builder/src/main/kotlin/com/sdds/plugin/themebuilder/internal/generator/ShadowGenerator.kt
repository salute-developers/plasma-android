package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Companion.appendObject
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.token.ShadowToken
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.shadowsXmlFile
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
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
    private val xmlBuilderFactory: XmlDocumentBuilderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
) : TokenGenerator<ShadowToken>(target) {

    private val xmlDocumentBuilder by unsafeLazy { xmlBuilderFactory.create() }
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
        val tokenValue = token.value ?: return@with false

        wrapWithRegion(token.description) {
            appendElement(ElementName.DIMEN, "shadow_${token.xmlName}_dx", "${tokenValue.dX}dp")
            appendElement(ElementName.DIMEN, "shadow_${token.xmlName}_dY", "${tokenValue.dY}dp")
            appendElement(ElementName.COLOR, "shadow_${token.xmlName}_color", tokenValue.color)
            appendElement(ElementName.DIMEN, "shadow_${token.xmlName}_radius", "${tokenValue.radius}dp")
        }
        return@with true
    }

    /**
     * @see TokenGenerator.addComposeToken
     */
    override fun addComposeToken(token: ShadowToken): Boolean = with(ktFileBuilder) {
        val tokenValue = token.value ?: return@with false

        rootShadows.appendObject(token.ktName, token.description) {
            appendProperty("dX", KtFileBuilder.TypeDp, "${tokenValue.dX}.dp", token.description)
            appendProperty("dY", KtFileBuilder.TypeDp, "${tokenValue.dY}.dp", token.description)
            appendProperty("radius", KtFileBuilder.TypeDp, "${tokenValue.radius}.dp", token.description)
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