package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlFontFamilyDocumentBuilder
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.FontDownloaderFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlFontFamilyDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.fonts.FontData
import com.sdds.plugin.themebuilder.internal.fonts.FontsAggregator
import com.sdds.plugin.themebuilder.internal.token.FontToken
import com.sdds.plugin.themebuilder.internal.token.FontTokenValue
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fontDir
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fontFamilyXmlFile
import com.sdds.plugin.themebuilder.internal.utils.fontFileNameFromUrl
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.sdds.plugin.themebuilder.internal.validator.FontTokenValidator
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeSpec
import java.io.File
import java.util.Locale

/**
 * Генератор токенов шрифтов
 * @param outputLocation локация для сохранения kt-файла с токенами
 * @param outputResDir директория для сохранения xml-файла с токенами
 * @param xmlFontFamilyBuilderFactory фабрика делегата построения xml файлов font-family
 * @param fontDownloaderFactory фабрика загрузчика шрифтов
 * @param ktFileBuilderFactory фабрика делегата построения kt файлов
 * @param resPrefix префикс для xml файлов с fontFamily
 * @param fontTokenValues значения токенов шрифтов
 * @param fontsAggregator агрегатор шрифтов
 *
 * @author Малышев Александр on 07.03.2024
 */
internal class FontTokenGenerator(
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val outputResDir: File,
    target: ThemeBuilderTarget,
    private val xmlFontFamilyBuilderFactory: XmlFontFamilyDocumentBuilderFactory,
    private val fontDownloaderFactory: FontDownloaderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    namespace: String,
    private val resPrefix: String,
    private val fontTokenValues: Map<String, FontTokenValue>,
    private val fontsAggregator: FontsAggregator,
) : TokenGenerator<FontToken, String>(target) {

    private val rFileImport = ClassName(namespace, "R")
    private val fontFamilyXmlBuilders = mutableMapOf<String, XmlFontFamilyDocumentBuilder>()
    private val ktFileBuilder by unsafeLazy { ktFileBuilderFactory.create("FontTokens") }
    private val ktFileRootObjectBuilder by unsafeLazy { ktFileBuilder.rootObject("FontTokens") }
    private val fontDownloader by unsafeLazy { fontDownloaderFactory.create() }

    override fun collectResult() = ""

    override fun generateViewSystem() {
        super.generateViewSystem()
        fontFamilyXmlBuilders.forEach {
            it.value.build(outputResDir.fontFamilyXmlFile(familyName = it.key, prefix = resPrefix))
        }
    }

    override fun addViewSystemToken(token: FontToken): Boolean {
        val tokenValue = fontTokenValues[token.name]
            ?: throw ThemeBuilderException(
                "Can't find value for font token ${token.name}. " +
                    "It should be in android_fontFamily.json.",
            )
        FontTokenValidator.validate(tokenValue, token.name)
        val builder = fontFamilyXmlBuilders[token.xmlName] ?: xmlFontFamilyBuilderFactory.create()
            .also { fontFamilyXmlBuilders[token.xmlName] = it }

        builder.appendComment(token.description)
        tokenValue.fonts.forEach { font ->
            val fontFile = fontDownloader.download(font.link, outputResDir.fontDir())
            builder.appendFontElement(
                fontStyle = font.fontStyle,
                fontWeight = font.fontWeight.toString(),
                font = fontFile.nameWithoutExtension,
            )
        }
        fontsAggregator.addFont(fontFamily = token.name, fonts = tokenValue.fonts.toFontDataSet())
        return true
    }

    override fun addComposeToken(token: FontToken): Boolean {
        val tokenValue = fontTokenValues[token.name]
            ?: throw ThemeBuilderException(
                "Can't find value for font token ${token.name}. " +
                    "It should be in android_fontFamily.json.",
            )
        FontTokenValidator.validate(tokenValue, token.name)
        ktFileRootObjectBuilder.addFontFamilyToken(
            name = token.ktName,
            description = token.description,
            tokenValue = tokenValue,
        )
        return true
    }

    override fun generateCompose() {
        super.generateCompose()
        ktFileBuilder.addImport(KtFileBuilder.TypeFont)
        ktFileBuilder.addImport(KtFileBuilder.TypeFontFamily)
        ktFileBuilder.addImport(KtFileBuilder.TypeFontStyle)
        ktFileBuilder.addImport(KtFileBuilder.TypeFontWeight)
        ktFileBuilder.addImport(rFileImport)
        ktFileBuilder.build(outputLocation)
    }

    private fun TypeSpec.Builder.addFontFamilyToken(
        name: String,
        description: String,
        tokenValue: FontTokenValue,
    ) {
        val initializers = tokenValue.fonts.map {
            val fontFile = fontDownloader.download(
                url = it.link,
                fontDir = outputResDir.fontDir(),
            )
            "Font(R.font.${fontFile.nameWithoutExtension}," +
                " FontWeight(${it.fontWeight}), " +
                "FontStyle.${it.fontStyle.toComposeFontStyle()})"
        }
        val initializer = KtFileBuilder.createConstructorCall(
            constructorName = "FontFamily",
            initializers = initializers.toTypedArray(),
        )
        with(ktFileBuilder) {
            appendProperty(
                name = name,
                typeName = KtFileBuilder.TypeFontFamily,
                initializer = initializer,
                description = description,
            )
        }
    }

    private fun String.toComposeFontStyle(): String =
        when (this.toLowerCase(Locale.getDefault())) {
            "italic" -> "Italic"
            else -> "Normal"
        }

    private fun List<FontToken.FontVariant>.toFontDataSet(): Set<FontData> {
        return this.map {
            FontData(
                fontName = it.link
                    .fontFileNameFromUrl()
                    .substringBeforeLast("."),
                fontWeight = it.fontWeight,
                fontStyle = it.fontStyle,
            )
        }.toSet()
    }
}
