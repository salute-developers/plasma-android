package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.ThemeBuilderTarget.Companion.isComposeOrAll
import com.sdds.plugin.themebuilder.ThemeBuilderTarget.Companion.isViewSystemOrAll
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
    private val target: ThemeBuilderTarget,
    private val xmlBuilderFactory: XmlDocumentBuilderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
) : TokenGenerator<ShadowToken> {

    private val xmlDocumentBuilder by unsafeLazy { xmlBuilderFactory.create() }
    private val ktFileBuilder by unsafeLazy { ktFileBuilderFactory.create("ShadowTokens") }
    private val rootShadows by unsafeLazy { ktFileBuilder.rootObject("ShadowTokens") }
    private var needGenerateCompose: Boolean = false
    private var needGenerateViewSystem: Boolean = false

    /**
     * @see TokenGenerator.addToken
     */
    override fun addToken(token: ShadowToken) {
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
            xmlDocumentBuilder.build(outputResDir.shadowsXmlFile())
        }

        if (needGenerateCompose) {
            ktFileBuilder.addImport(KtFileBuilder.TypeDpExtension)
            ktFileBuilder.addImport(KtFileBuilder.TypeCornerSize)
            ktFileBuilder.build(outputLocation)
        }
    }

    private fun addViewSystemToken(token: ShadowToken) = with(xmlDocumentBuilder) {
        val tokenValue = token.value ?: return

        wrapWithRegion(token.description) {
            appendElement(ElementName.DIMEN, "shadow_${token.xmlName}_dx", "${tokenValue.dX}dp")
            appendElement(ElementName.DIMEN, "shadow_${token.xmlName}_dY", "${tokenValue.dY}dp")
            appendElement(ElementName.COLOR, "shadow_${token.xmlName}_color", tokenValue.color)
            appendElement(ElementName.DIMEN, "shadow_${token.xmlName}_radius", "${tokenValue.radius}dp")
        }
        if (!needGenerateViewSystem && target.isViewSystemOrAll) needGenerateViewSystem = true
    }

    private fun addComposeToken(token: ShadowToken) = with(ktFileBuilder) {
        val tokenValue = token.value ?: return

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
        if (!needGenerateCompose && target.isComposeOrAll) needGenerateCompose = true
    }
}
