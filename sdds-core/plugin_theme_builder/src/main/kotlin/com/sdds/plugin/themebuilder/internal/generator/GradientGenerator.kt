package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Companion.appendObject
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.Companion.DEFAULT_ROOT_ATTRIBUTES
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementFormat
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementType
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult
import com.sdds.plugin.themebuilder.internal.token.GradientToken
import com.sdds.plugin.themebuilder.internal.token.GradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.LinearGradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.RadialGradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.SweepGradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.isDark
import com.sdds.plugin.themebuilder.internal.token.isLight
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.gradientsXmlFile
import com.sdds.plugin.themebuilder.internal.utils.HexFormat
import com.sdds.plugin.themebuilder.internal.utils.resolveColor
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.squareup.kotlinpoet.TypeSpec
import java.io.File
import java.util.Locale

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
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val gradientTokenValues: Map<String, List<GradientTokenValue>>,
    private val palette: Map<String, Map<String, String>>,
) : TokenGenerator<GradientToken, GradientTokenResult>(target) {

    private val xmlDocumentBuilder by unsafeLazy { xmlBuilderFactory.create(DEFAULT_ROOT_ATTRIBUTES) }
    private val ktFileBuilder by unsafeLazy { ktFileBuilderFactory.create("GradientTokens") }
    private val lightBuilder by unsafeLazy { ktFileBuilder.rootObject("LightGradientTokens") }
    private val darkBuilder by unsafeLazy { ktFileBuilder.rootObject("DarkGradientTokens") }

    private val composeTokenDataCollector =
        mutableListOf<GradientTokenResult.TokenData>()
    private val viewTokenDataCollector =
        mutableListOf<GradientTokenResult.TokenData>()

    override fun collectResult() = GradientTokenResult(
        composeTokens = composeTokenDataCollector,
        viewTokens = viewTokenDataCollector,
    )

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
    override fun addViewSystemToken(token: GradientToken): Boolean {
        val tokenValue = gradientTokenValues[token.name] ?: return false
        if (tokenValue.size != 1) return false
        // TODO: https://github.com/salute-developers/plasma-android/issues/28
        val result = when (val value = tokenValue[0]) {
            is LinearGradientTokenValue -> xmlDocumentBuilder.appendLinearGradient(token, value)
            is RadialGradientTokenValue -> xmlDocumentBuilder.appendRadialGradient(token, value)
            is SweepGradientTokenValue -> xmlDocumentBuilder.appendSweepGradient(token, value)
            else -> false
        }
        return result
    }

    /**
     * @see TokenGenerator.addComposeToken
     */
    override fun addComposeToken(token: GradientToken): Boolean {
        val tokenValue = gradientTokenValues[token.name]
            // TODO: https://github.com/salute-developers/plasma-android/issues/28
            ?.takeIf { it.size == 1 }
            ?: return false
        val builder = if (token.isDark) {
            darkBuilder
        } else if (token.isLight) {
            lightBuilder
        } else {
            return false
        }
        val result = when (val value = tokenValue[0]) {
            is LinearGradientTokenValue -> builder.appendLinearGradient(token, value)
            is RadialGradientTokenValue -> builder.appendRadialGradient(token, value)
            is SweepGradientTokenValue -> builder.appendSweepGradient(token, value)
            else -> false
        }
        return result
    }

    private fun XmlResourcesDocumentBuilder.appendBaseGradient(
        baseName: String,
        colors: List<String>,
        positions: List<Float>,
    ) {
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

    private fun XmlResourcesDocumentBuilder.appendLinearGradient(
        token: GradientToken,
        tokenValue: LinearGradientTokenValue,
    ): Boolean {
        val baseTokenName = token.xmlName
        val resolvedColors = tokenValue.colors.resolveColors(HexFormat.XML_HEX) ?: return false
        wrapWithRegion(token.description) {
            appendBaseGradient(baseTokenName, resolvedColors, tokenValue.locations)
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

    private fun XmlResourcesDocumentBuilder.appendSweepGradient(
        token: GradientToken,
        tokenValue: SweepGradientTokenValue,
    ): Boolean {
        val baseTokenName = token.xmlName
        val resolvedColors = tokenValue.colors.resolveColors(HexFormat.XML_HEX) ?: return false
        wrapWithRegion(token.description) {
            appendBaseGradient(baseTokenName, resolvedColors, tokenValue.locations)
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

    private fun XmlResourcesDocumentBuilder.appendRadialGradient(
        token: GradientToken,
        tokenValue: RadialGradientTokenValue,
    ): Boolean {
        val baseTokenName = token.xmlName
        val resolvedColors = tokenValue.colors.resolveColors(HexFormat.XML_HEX) ?: return false
        wrapWithRegion(token.description) {
            appendBaseGradient(baseTokenName, resolvedColors, tokenValue.locations)
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

    private fun TypeSpec.Builder.appendLinearGradient(
        token: GradientToken,
        tokenValue: LinearGradientTokenValue,
    ): Boolean {
        val baseTokenName = token.ktName
        val resolvedColors = tokenValue.colors.resolveColors(HexFormat.INT_HEX) ?: return false
        with(ktFileBuilder) {
            appendObject(baseTokenName, token.description) {
                appendBaseGradient(resolvedColors, tokenValue.locations)
                appendProperty(ANGLE_KT_PROPERTY_NAME, Float::class, "${tokenValue.angle}f")
            }
        }
        composeTokenDataCollector.add(
            GradientTokenResult.TokenData(
                attrName = token.ktName.decapitalize(Locale.getDefault()),
                tokenRefs = listOf(
                    "${token.ktName}.$COLORS_KT_PROPERTY_NAME",
                    "${token.ktName}.$POSITIONS_KT_PROPERTY_NAME",
                    "${token.ktName}.$ANGLE_KT_PROPERTY_NAME",
                ),
                gradientType = GradientTokenResult.TokenData.GradientType.LINEAR,
                isLight = token.isLight,
            ),
        )
        return true
    }

    private fun TypeSpec.Builder.appendSweepGradient(
        token: GradientToken,
        tokenValue: SweepGradientTokenValue,
    ): Boolean {
        val baseTokenName = token.ktName
        val resolvedColors = tokenValue.colors.resolveColors(HexFormat.INT_HEX) ?: return false
        with(ktFileBuilder) {
            appendObject(baseTokenName, token.description) {
                appendBaseGradient(resolvedColors, tokenValue.locations)
                appendProperty(CENTER_X_KT_PROPERTY_NAME, Float::class, "${tokenValue.centerX}f")
                appendProperty(CENTER_Y_KT_PROPERTY_NAME, Float::class, "${tokenValue.centerY}f")
            }
        }
        composeTokenDataCollector.add(
            GradientTokenResult.TokenData(
                attrName = token.ktName.decapitalize(Locale.getDefault()),
                tokenRefs = listOf(
                    "${token.ktName}.$COLORS_KT_PROPERTY_NAME",
                    "${token.ktName}.$POSITIONS_KT_PROPERTY_NAME",
                    "${token.ktName}.$CENTER_X_KT_PROPERTY_NAME",
                    "${token.ktName}.$CENTER_Y_KT_PROPERTY_NAME",
                ),
                gradientType = GradientTokenResult.TokenData.GradientType.SWEEP,
                isLight = token.isLight,
            ),
        )
        return true
    }

    private fun TypeSpec.Builder.appendRadialGradient(
        token: GradientToken,
        tokenValue: RadialGradientTokenValue,
    ): Boolean {
        val baseTokenName = token.ktName
        val resolvedColors = tokenValue.colors.resolveColors(HexFormat.INT_HEX) ?: return false
        with(ktFileBuilder) {
            appendObject(baseTokenName, token.description) {
                appendBaseGradient(resolvedColors, tokenValue.locations)
                appendProperty(RADIUS_KT_PROPERTY_NAME, Float::class, "${tokenValue.radius}f")
                appendProperty(CENTER_X_KT_PROPERTY_NAME, Float::class, "${tokenValue.centerX}f")
                appendProperty(CENTER_Y_KT_PROPERTY_NAME, Float::class, "${tokenValue.centerY}f")
            }
        }
        composeTokenDataCollector.add(
            GradientTokenResult.TokenData(
                attrName = token.ktName.decapitalize(Locale.getDefault()),
                tokenRefs = listOf(
                    "${token.ktName}.$COLORS_KT_PROPERTY_NAME",
                    "${token.ktName}.$POSITIONS_KT_PROPERTY_NAME",
                    "${token.ktName}.$RADIUS_KT_PROPERTY_NAME",
                    "${token.ktName}.$CENTER_X_KT_PROPERTY_NAME",
                    "${token.ktName}.$CENTER_Y_KT_PROPERTY_NAME",
                ),
                gradientType = GradientTokenResult.TokenData.GradientType.RADIAL,
                isLight = token.isLight,
            ),
        )
        return true
    }

    private fun List<String>.resolveColors(hexFormat: HexFormat): List<String>? =
        map { resolveColor(it, palette, hexFormat) ?: return null }

    private fun TypeSpec.Builder.appendBaseGradient(
        colors: List<String>,
        positions: List<Float>,
    ) = with(ktFileBuilder) {
        val colorParams = colors.joinToString { "Color($it)" }
        val positionParams = positions.joinToString { "${it}f" }
        appendProperty(
            COLORS_KT_PROPERTY_NAME,
            KtFileBuilder.TypeListOfColors,
            "listOf($colorParams)",
        )
        appendProperty(
            POSITIONS_KT_PROPERTY_NAME,
            FloatArray::class,
            "floatArrayOf($positionParams)",
        )
    }

    private companion object {
        const val COLORS_KT_PROPERTY_NAME = "colors"
        const val POSITIONS_KT_PROPERTY_NAME = "positions"
        const val ANGLE_KT_PROPERTY_NAME = "angle"
        const val RADIUS_KT_PROPERTY_NAME = "radius"
        const val CENTER_X_KT_PROPERTY_NAME = "centerX"
        const val CENTER_Y_KT_PROPERTY_NAME = "centerY"
    }
}
