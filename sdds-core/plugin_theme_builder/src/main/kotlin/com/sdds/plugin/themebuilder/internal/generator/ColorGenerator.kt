package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.ThemeBuilderTarget.Companion.isComposeOrAll
import com.sdds.plugin.themebuilder.ThemeBuilderTarget.Companion.isViewSystemOrAll
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.colorsXmlFile
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.factory.XmlDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import java.io.File

/**
 * Генератор токенов цветов
 * @param outputDir директория для сохранения kt-файла с токенами
 * @param outputResDir директория для сохранения xml-файла с токенами
 * @param target целевой фреймворк
 * @param xmlBuilderFactory фабрика делегата построения xml файлов
 * @param ktFileBuilder делегат построения kt файлов
 * @author Малышев Александр on 07.03.2024
 */
internal class ColorGenerator(
    private val outputDir: File,
    private val outputResDir: File,
    private val target: ThemeBuilderTarget,
    private val xmlBuilderFactory: XmlDocumentBuilderFactory,
    private val ktFileBuilder: FileSpec.Builder,
) : TokenGenerator<ColorToken> {

    private val xmlDocumentBuilder by unsafeLazy { xmlBuilderFactory.create() }
    private val lightBuilder by unsafeLazy { TypeSpec.objectBuilder("LightColorTokens") }
    private val darkBuilder by unsafeLazy { TypeSpec.objectBuilder("DarkColorTokens") }
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
            ktFileBuilder.addImport(
                className = ClassName(
                    packageName = "androidx.compose.ui.graphics",
                    simpleNames = listOf("Color"),
                ),
                names = emptyList(),
            )
            ktFileBuilder.addType(lightBuilder.build())
            ktFileBuilder.addType(darkBuilder.build())
            ktFileBuilder.build().writeTo(outputDir)
        }
    }

    private fun addViewSystemToken(token: ColorToken) {
        val tokenValue = token.value ?: return
        xmlDocumentBuilder.appendComment(token.description)
        xmlDocumentBuilder.appendElement(ElementName.COLOR, token.xmlName, tokenValue.origin)
        if (!needGenerateViewSystem && target.isViewSystemOrAll) needGenerateViewSystem = true
    }

    private fun addComposeToken(token: ColorToken) {
        val tokenValue = token.value ?: return
        if (token.tags.contains("dark")) {
            darkBuilder.addColorToken(token.ktName, tokenValue.origin)
        } else {
            lightBuilder.addColorToken(token.ktName, tokenValue.origin)
        }
        if (!needGenerateCompose && target.isComposeOrAll) needGenerateCompose = true
    }

    private fun TypeSpec.Builder.addColorToken(name: String, origin: String) {
        addProperty(
            PropertySpec.builder(
                name,
                ClassName("androidx.compose.ui.graphics", listOf("Color")),
            )
                .initializer("Color(${origin.replace("#", "0x")})")
                .build(),
        )
    }
}
