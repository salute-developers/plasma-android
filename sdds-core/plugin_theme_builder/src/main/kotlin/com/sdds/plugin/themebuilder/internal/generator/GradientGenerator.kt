package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Companion.appendObject
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder.ElementFormat
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder.ElementType
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.token.GradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.LinearGradientToken
import com.sdds.plugin.themebuilder.internal.token.RadialGradientToken
import com.sdds.plugin.themebuilder.internal.token.SweepGradientToken
import com.sdds.plugin.themebuilder.internal.token.Token
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.gradientsXmlFile
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.squareup.kotlinpoet.TypeSpec
import java.io.File

/**
 * @param outputLocation локация для сохранения kt-файла с токенами
 * @param outputResDir директория для сохранения xml-файла с токенами
 * @param target целевой фреймворк
 * @param xmlBuilderFactory фабрика делегата построения xml файлов
 * @param ktFileBuilderFactory фабрика делегата построения kt файлов
 * @author Малышев Александр on 07.03.2024
 */
internal class GradientGenerator(
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val outputResDir: File,
    target: ThemeBuilderTarget,
    private val xmlBuilderFactory: XmlDocumentBuilderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
) : TokenGenerator<Token<GradientTokenValue>>(target) {

    private val xmlDocumentBuilder by unsafeLazy { xmlBuilderFactory.create() }
    private val ktFileBuilder by unsafeLazy { ktFileBuilderFactory.create("GradientTokens") }
    private val lightBuilder by unsafeLazy { ktFileBuilder.rootObject("LightGradientTokens") }
    private val darkBuilder by unsafeLazy { ktFileBuilder.rootObject("DarkGradientTokens") }

    /**
     * @see TokenGenerator.generateViewSystem
     */
    override fun generateViewSystem() {
        super.generateViewSystem()
        xmlDocumentBuilder.build(outputResDir.gradientsXmlFile())
    }

    /**
     * @see TokenGenerator.generateCompose
     */
    override fun generateCompose() {
        super.generateCompose()
        ktFileBuilder.build(outputLocation)
    }

    /**
     * @see TokenGenerator.addViewSystemToken
     */
    override fun addViewSystemToken(token: Token<GradientTokenValue>): Boolean {
        val result = when (token) {
            is LinearGradientToken -> xmlDocumentBuilder.appendLinearGradient(token)
            is RadialGradientToken -> xmlDocumentBuilder.appendRadialGradient(token)
            is SweepGradientToken -> xmlDocumentBuilder.appendSweepGradient(token)
            else -> false
        }
        return result
    }

    /**
     * @see TokenGenerator.addComposeToken
     */
    override fun addComposeToken(token: Token<GradientTokenValue>): Boolean = with(ktFileBuilder) {
        val builder = if (token.tags.contains("dark")) {
            darkBuilder
        } else if (token.tags.contains("light")) {
            lightBuilder
        } else {
            return false
        }
        val result = when (token) {
            is LinearGradientToken -> builder.appendLinearGradient(token)
            is RadialGradientToken -> builder.appendRadialGradient(token)
            is SweepGradientToken -> builder.appendSweepGradient(token)
            else -> false
        }
        return result
    }

    private fun XmlDocumentBuilder.appendBaseGradient(baseName: String, colors: List<String>, positions: List<Float>) {
        colors.forEachIndexed { index, color ->
            appendElement(ElementName.COLOR, "${baseName}_color_$index", color)
        }
        positions.forEachIndexed { index, position ->
            appendElement(
                ElementName.ITEM,
                "${baseName}_position_$index",
                position.toString(),
                ElementFormat.FLOAT,
                ElementType.DIMEN,
            )
        }
    }

    private fun XmlDocumentBuilder.appendLinearGradient(token: LinearGradientToken): Boolean {
        val tokenValue = token.value ?: return false
        val baseTokenName = token.xmlName

        wrapWithRegion(token.description) {
            appendBaseGradient(baseTokenName, tokenValue.colors, tokenValue.locations)
            appendElement(
                elementName = ElementName.ITEM,
                tokenName = "${baseTokenName}_angle",
                value = tokenValue.angle.toString(),
                ElementFormat.FLOAT,
                ElementType.DIMEN,
            )
        }
        return true
    }

    private fun XmlDocumentBuilder.appendSweepGradient(token: SweepGradientToken): Boolean {
        val tokenValue = token.value ?: return false
        val baseTokenName = token.xmlName

        wrapWithRegion(token.description) {
            appendBaseGradient(baseTokenName, tokenValue.colors, tokenValue.locations)
            appendElement(
                elementName = ElementName.ITEM,
                tokenName = "${baseTokenName}_start_angle",
                value = tokenValue.startAngle.toString(),
                ElementFormat.FLOAT,
                ElementType.DIMEN,
            )
            appendElement(
                elementName = ElementName.ITEM,
                tokenName = "${baseTokenName}_end_angle",
                value = tokenValue.endAngle.toString(),
                ElementFormat.FLOAT,
                ElementType.DIMEN,
            )
            appendElement(
                elementName = ElementName.ITEM,
                tokenName = "${baseTokenName}_center_x",
                value = tokenValue.centerX.toString(),
                ElementFormat.FLOAT,
                ElementType.DIMEN,
            )
            appendElement(
                elementName = ElementName.ITEM,
                tokenName = "${baseTokenName}_center_y",
                value = tokenValue.centerY.toString(),
                ElementFormat.FLOAT,
                ElementType.DIMEN,
            )
        }
        return true
    }

    private fun XmlDocumentBuilder.appendRadialGradient(token: RadialGradientToken): Boolean {
        val tokenValue = token.value ?: return false
        val baseTokenName = token.xmlName

        wrapWithRegion(token.description) {
            appendBaseGradient(baseTokenName, tokenValue.colors, tokenValue.locations)
            appendElement(
                elementName = ElementName.ITEM,
                tokenName = "${baseTokenName}_radius",
                value = tokenValue.radius.toString(),
                ElementFormat.FLOAT,
                ElementType.DIMEN,
            )
            appendElement(
                elementName = ElementName.ITEM,
                tokenName = "${baseTokenName}_center_x",
                value = tokenValue.centerX.toString(),
                ElementFormat.FLOAT,
                ElementType.DIMEN,
            )
            appendElement(
                elementName = ElementName.ITEM,
                tokenName = "${baseTokenName}_center_y",
                value = tokenValue.centerY.toString(),
                ElementFormat.FLOAT,
                ElementType.DIMEN,
            )
        }
        return true
    }

    context(KtFileBuilder)
    private fun TypeSpec.Builder.appendLinearGradient(token: LinearGradientToken): Boolean {
        val tokenValue = token.value ?: return false
        val baseTokenName = token.ktName

        appendObject(baseTokenName, token.description) {
            appendBaseGradient(tokenValue.colors, tokenValue.locations)
            appendProperty("angle", Float::class, "${tokenValue.angle}f")
        }
        return true
    }

    context(KtFileBuilder)
    private fun TypeSpec.Builder.appendSweepGradient(token: SweepGradientToken): Boolean {
        val tokenValue = token.value ?: return false
        val baseTokenName = token.ktName

        appendObject(baseTokenName, token.description) {
            appendBaseGradient(tokenValue.colors, tokenValue.locations)
            appendProperty("startAngle", Float::class, "${tokenValue.startAngle}f")
            appendProperty("endAngle", Float::class, "${tokenValue.endAngle}f")
            appendProperty("centerX", Float::class, "${tokenValue.centerX}f")
            appendProperty("centerY", Float::class, "${tokenValue.centerY}f")
        }
        return true
    }

    context(KtFileBuilder)
    private fun TypeSpec.Builder.appendRadialGradient(token: RadialGradientToken): Boolean {
        val tokenValue = token.value ?: return false
        val baseTokenName = token.ktName

        appendObject(baseTokenName, token.description) {
            appendBaseGradient(tokenValue.colors, tokenValue.locations)
            appendProperty("radius", Float::class, "${tokenValue.radius}f")
            appendProperty("centerX", Float::class, "${tokenValue.centerX}f")
            appendProperty("centerY", Float::class, "${tokenValue.centerY}f")
        }
        return true
    }

    context(KtFileBuilder)
    private fun TypeSpec.Builder.appendBaseGradient(
        colors: List<String>,
        positions: List<Float>,
    ) {
        val colorParams = colors.joinToString { "Color(${it.replace("#", "0x")})" }
        val positionParams = positions.joinToString { "${it}f" }
        appendProperty(
            "colors",
            KtFileBuilder.TypeListOfColors,
            "listOf($colorParams)",
        )
        appendProperty(
            "positions",
            FloatArray::class,
            "floatArrayOf($positionParams)",
        )
    }
}