package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.ThemeBuilderTarget.Companion.isComposeOrAll
import com.sdds.plugin.themebuilder.ThemeBuilderTarget.Companion.isViewSystemOrAll
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.gradientsXmlFile
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.factory.XmlDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.token.GradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.LinearGradientToken
import com.sdds.plugin.themebuilder.internal.token.RadialGradientToken
import com.sdds.plugin.themebuilder.internal.token.SweepGradientToken
import com.sdds.plugin.themebuilder.internal.token.Token
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asClassName
import java.io.File

/**
 * @param outputDir директория для сохранения kt-файла с токенами
 * @param outputResDir директория для сохранения xml-файла с токенами
 * @param target целевой фреймворк
 * @param xmlBuilderFactory фабрика делегата построения xml файлов
 * @param ktFileBuilder делегат построения kt файлов
 * @author Малышев Александр on 07.03.2024
 */
internal class GradientGenerator(
    private val outputDir: File,
    private val outputResDir: File,
    private val target: ThemeBuilderTarget,
    private val xmlBuilderFactory: XmlDocumentBuilderFactory,
    private val ktFileBuilder: FileSpec.Builder,
) : TokenGenerator<Token<GradientTokenValue>> {

    private val xmlDocumentBuilder by unsafeLazy { xmlBuilderFactory.create() }
    private val lightBuilder by unsafeLazy { TypeSpec.objectBuilder("LightGradientTokens") }
    private val darkBuilder by unsafeLazy { TypeSpec.objectBuilder("DarkGradientTokens") }
    private var needGenerateCompose: Boolean = false
    private var needGenerateViewSystem: Boolean = false

    /**
     * @see TokenGenerator.addToken
     */
    override fun addToken(token: Token<GradientTokenValue>) {
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
            xmlDocumentBuilder.build(outputResDir.gradientsXmlFile())
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
            ktFileBuilder.build()
                .writeTo(outputDir)
        }
    }

    private fun addViewSystemToken(token: Token<GradientTokenValue>) {
        val result = when (token) {
            is LinearGradientToken -> xmlDocumentBuilder.appendLinearGradient(token)
            is RadialGradientToken -> xmlDocumentBuilder.appendRadialGradient(token)
            is SweepGradientToken -> xmlDocumentBuilder.appendSweepGradient(token)
            else -> false
        }
        if (result && !needGenerateViewSystem && target.isViewSystemOrAll) needGenerateViewSystem = true
    }

    private fun addComposeToken(token: Token<GradientTokenValue>) {
        val builder = if (token.tags.contains("dark")) {
            darkBuilder
        } else if (token.tags.contains("light")) {
            lightBuilder
        } else {
            return
        }
        val result = when (token) {
            is LinearGradientToken -> builder.appendLinearGradient(token)
            is RadialGradientToken -> builder.appendRadialGradient(token)
            is SweepGradientToken -> builder.appendSweepGradient(token)
            else -> false
        }
        if (result && !needGenerateCompose && target.isComposeOrAll) needGenerateCompose = true
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
                "float",
                "dimen",
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
                format = "float",
                type = "dimen",
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
                format = "float",
                type = "dimen",
            )
            appendElement(
                elementName = ElementName.ITEM,
                tokenName = "${baseTokenName}_end_angle",
                value = tokenValue.endAngle.toString(),
                format = "float",
                type = "dimen",
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
                format = "float",
                type = "dimen",
            )
        }
        return true
    }

    private fun TypeSpec.Builder.appendLinearGradient(token: LinearGradientToken): Boolean {
        val tokenValue = token.value ?: return false
        val baseTokenName = token.ktName

        appendGradient(baseTokenName, tokenValue.colors, tokenValue.locations) {
            it.addProperty(
                PropertySpec.builder("angle", Float::class)
                    .initializer("${tokenValue.angle}f")
                    .build(),
            )
        }
        return true
    }

    private fun TypeSpec.Builder.appendSweepGradient(token: SweepGradientToken): Boolean {
        val tokenValue = token.value ?: return false
        val baseTokenName = token.ktName

        appendGradient(baseTokenName, tokenValue.colors, tokenValue.locations) {
            it.addProperty(
                PropertySpec.builder("startAngle", Float::class)
                    .initializer("${tokenValue.startAngle}f")
                    .build(),
            )
            it.addProperty(
                PropertySpec.builder("endAngle", Float::class)
                    .initializer("${tokenValue.endAngle}f")
                    .build(),
            )
            it.addProperty(
                PropertySpec.builder("centerX", Float::class)
                    .initializer("${tokenValue.centerX}f")
                    .build(),
            )
            it.addProperty(
                PropertySpec.builder("centerY", Float::class)
                    .initializer("${tokenValue.centerY}f")
                    .build(),
            )
        }
        return true
    }

    private fun TypeSpec.Builder.appendRadialGradient(token: RadialGradientToken): Boolean {
        val tokenValue = token.value ?: return false
        val baseTokenName = token.ktName

        appendGradient(baseTokenName, tokenValue.colors, tokenValue.locations) {
            it.addProperty(
                PropertySpec.builder("radius", Float::class)
                    .initializer("${tokenValue.radius}f")
                    .build(),
            )
            it.addProperty(
                PropertySpec.builder("centerX", Float::class)
                    .initializer("${tokenValue.centerX}f")
                    .build(),
            )
            it.addProperty(
                PropertySpec.builder("centerY", Float::class)
                    .initializer("${tokenValue.centerY}f")
                    .build(),
            )
        }
        return true
    }

    private fun TypeSpec.Builder.appendGradient(
        baseName: String,
        colors: List<String>,
        positions: List<Float>,
        propertyBuilder: (TypeSpec.Builder) -> Unit,
    ) {
        val colorParams = colors.joinToString { "Color(${it.replace("#", "0x")})" }
        val positionParams = positions.joinToString { "${it}f" }
        addType(
            TypeSpec.objectBuilder(baseName)
                .addProperty(
                    PropertySpec.builder(
                        "colors",
                        List::class.asClassName().parameterizedBy(
                            ClassName("androidx.compose.ui.graphics", listOf("Color")),
                        ),
                    )
                        .initializer("listOf($colorParams)")
                        .build(),
                )
                .addProperty(
                    PropertySpec.builder(
                        "positions",
                        FloatArray::class,
                    )
                        .initializer("floatArrayOf($positionParams)")
                        .build(),
                )
                .also { propertyBuilder(it) }
                .build(),
        )
    }
}
