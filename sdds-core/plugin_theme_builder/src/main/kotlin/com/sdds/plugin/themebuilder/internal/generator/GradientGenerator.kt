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
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult.ViewTokenData
import com.sdds.plugin.themebuilder.internal.token.GradientToken
import com.sdds.plugin.themebuilder.internal.token.GradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.LinearGradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.RadialGradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.SweepGradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.colorAttrName
import com.sdds.plugin.themebuilder.internal.token.isDark
import com.sdds.plugin.themebuilder.internal.token.isLight
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.gradientsXmlFile
import com.sdds.plugin.themebuilder.internal.utils.HexFormat
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
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
    private val resourceReferenceProvider: ResourceReferenceProvider,
) : TokenGenerator<GradientToken, GradientTokenResult>(target) {

    private val xmlDocumentBuilder by unsafeLazy { xmlBuilderFactory.create(DEFAULT_ROOT_ATTRIBUTES) }
    private val ktFileBuilder by unsafeLazy { ktFileBuilderFactory.create("GradientTokens") }
    private val lightBuilder by unsafeLazy { ktFileBuilder.rootObject("LightGradientTokens") }
    private val darkBuilder by unsafeLazy { ktFileBuilder.rootObject("DarkGradientTokens") }

    private val composeTokenDataCollector =
        mutableListOf<GradientTokenResult.ComposeTokenData>()
    private val viewTokenDataCollector =
        mutableListOf<ViewTokenData>()

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
        colors: List<TokenParameterData>,
        positions: List<TokenParameterData>,
    ) {
        colors.forEach { appendElement(ElementName.COLOR, it.name, it.value) }
        positions.forEach { appendDimenItem(it.name, it.value) }
    }

    private fun XmlResourcesDocumentBuilder.appendLinearGradient(
        token: GradientToken,
        tokenValue: LinearGradientTokenValue,
    ): Boolean {
        val baseTokenName = token.xmlName
        val resolvedColors = tokenValue.colors.resolveColors(HexFormat.XML_HEX) ?: return false

        val colorParameters = resolvedColors.colorsToTokenParameterData(baseTokenName)
        val positionParameters = tokenValue.locations.positionsToTokenParameterData(baseTokenName)
        val angleParameter = "${baseTokenName}_angle"

        wrapWithRegion(token.description) {
            appendBaseGradient(colorParameters, positionParameters)
            appendDimenItem(angleParameter, tokenValue.angle.toString())
        }

        val baseAttrName = token.colorAttrName()
        val colorAttrParams = colorParameters.toColorAttrParams(baseTokenName, baseAttrName)
        val positionAttrParams =
            positionParameters.toPositionAttrParams(baseTokenName, baseAttrName)
        val angleAttrParam = ViewTokenData.GradientParameter(
            attrName = angleParameter.replace(baseTokenName, baseAttrName),
            ref = resourceReferenceProvider.dimen(angleParameter),
        )
        viewTokenDataCollector.add(
            ViewTokenData(
                attrName = baseAttrName,
                gradientParameters = colorAttrParams +
                    positionAttrParams +
                    angleAttrParam,
                isLight = token.isLight,
            ),
        )
        return true
    }

    private fun XmlResourcesDocumentBuilder.appendSweepGradient(
        token: GradientToken,
        tokenValue: SweepGradientTokenValue,
    ): Boolean {
        val baseTokenName = token.xmlName
        val resolvedColors = tokenValue.colors.resolveColors(HexFormat.XML_HEX) ?: return false

        val colorParameters = resolvedColors.colorsToTokenParameterData(baseTokenName)
        val positionParameters = tokenValue.locations.positionsToTokenParameterData(baseTokenName)
        val centerXParameter = "${baseTokenName}_center_x"
        val centerYParameter = "${baseTokenName}_center_y"

        wrapWithRegion(token.description) {
            appendBaseGradient(colorParameters, positionParameters)
            appendDimenItem(centerXParameter, tokenValue.centerX.toString())
            appendDimenItem(centerYParameter, tokenValue.centerY.toString())
        }

        val baseAttrName = token.colorAttrName()
        val colorAttrParams = colorParameters.toColorAttrParams(baseTokenName, baseAttrName)
        val positionAttrParams =
            positionParameters.toPositionAttrParams(baseTokenName, baseAttrName)
        val centerXAttrParam = ViewTokenData.GradientParameter(
            attrName = centerXParameter.replace(baseTokenName, baseAttrName),
            ref = resourceReferenceProvider.dimen(centerXParameter),
        )
        val centerYAttrParam = ViewTokenData.GradientParameter(
            attrName = centerYParameter.replace(baseTokenName, baseAttrName),
            ref = resourceReferenceProvider.dimen(centerYParameter),
        )
        viewTokenDataCollector.add(
            ViewTokenData(
                attrName = baseAttrName,
                gradientParameters = colorAttrParams +
                    positionAttrParams +
                    centerXAttrParam +
                    centerYAttrParam,
                isLight = token.isLight,
            ),
        )
        return true
    }

    private fun XmlResourcesDocumentBuilder.appendRadialGradient(
        token: GradientToken,
        tokenValue: RadialGradientTokenValue,
    ): Boolean {
        val baseTokenName = token.xmlName
        val resolvedColors = tokenValue.colors.resolveColors(HexFormat.XML_HEX) ?: return false

        val colorParameters = resolvedColors.colorsToTokenParameterData(baseTokenName)
        val positionParameters = tokenValue.locations.positionsToTokenParameterData(baseTokenName)
        val radiusParameter = "${baseTokenName}_radius"
        val centerXParameter = "${baseTokenName}_center_x"
        val centerYParameter = "${baseTokenName}_center_y"

        wrapWithRegion(token.description) {
            appendBaseGradient(colorParameters, positionParameters)
            appendDimenItem(radiusParameter, tokenValue.radius.toString())
            appendDimenItem(centerXParameter, tokenValue.centerX.toString())
            appendDimenItem(centerYParameter, tokenValue.centerY.toString())
        }

        val baseAttrName = token.colorAttrName()
        val colorAttrParams = colorParameters.toColorAttrParams(baseTokenName, baseAttrName)
        val positionAttrParams =
            positionParameters.toPositionAttrParams(baseTokenName, baseAttrName)
        val radiusAttrParam = ViewTokenData.GradientParameter(
            attrName = radiusParameter.replace(baseTokenName, baseAttrName),
            ref = resourceReferenceProvider.dimen(radiusParameter),
        )
        val centerXAttrParam = ViewTokenData.GradientParameter(
            attrName = centerXParameter.replace(baseTokenName, baseAttrName),
            ref = resourceReferenceProvider.dimen(centerXParameter),
        )
        val centerYAttrParam = ViewTokenData.GradientParameter(
            attrName = centerYParameter.replace(baseTokenName, baseAttrName),
            ref = resourceReferenceProvider.dimen(centerYParameter),
        )
        viewTokenDataCollector.add(
            ViewTokenData(
                attrName = baseAttrName,
                gradientParameters = colorAttrParams +
                    positionAttrParams +
                    radiusAttrParam +
                    centerXAttrParam +
                    centerYAttrParam,
                isLight = token.isLight,
            ),
        )
        return true
    }

    /**
     * Данные о параметре токена градиента в XML.
     * Эта модель служит единственным источником правды о названии параметра токена и его значении.
     * Модель используется при генерации токенов и при формировании выходных данных для генерации атрибутов.
     *
     * @property name название параметра. Например "text_default_primary_gradient_color_0"
     * @property value значение параметра. Например "#EEFF001F"
     */
    private data class TokenParameterData(
        val name: String,
        val value: String,
    )

    private fun XmlResourcesDocumentBuilder.appendDimenItem(name: String, value: String) {
        appendElement(
            elementName = ElementName.ITEM,
            tokenName = name,
            value = value,
            ElementFormat.FLOAT,
            ElementType.DIMEN,
        )
    }

    private fun List<String>.colorsToTokenParameterData(
        baseTokenName: String,
    ): List<TokenParameterData> {
        return this.mapIndexed { index, color ->
            TokenParameterData(
                name = "${baseTokenName}_color_$index",
                value = color,
            )
        }
    }

    private fun List<Float>.positionsToTokenParameterData(
        baseTokenName: String,
    ): List<TokenParameterData> {
        return this.mapIndexed { index, position ->
            TokenParameterData(
                name = "${baseTokenName}_position_$index",
                value = position.toString(),
            )
        }
    }

    private fun List<TokenParameterData>.toColorAttrParams(
        baseTokenName: String,
        baseAttrName: String,
    ): List<ViewTokenData.GradientParameter> {
        return map {
            ViewTokenData.GradientParameter(
                attrName = it.name.replace(baseTokenName, baseAttrName),
                ref = resourceReferenceProvider.color(it.name),
            )
        }
    }

    private fun List<TokenParameterData>.toPositionAttrParams(
        baseTokenName: String,
        baseAttrName: String,
    ): List<ViewTokenData.GradientParameter> {
        return map {
            ViewTokenData.GradientParameter(
                attrName = it.name.replace(baseTokenName, baseAttrName),
                ref = resourceReferenceProvider.dimen(it.name),
            )
        }
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
            GradientTokenResult.ComposeTokenData(
                attrName = token.ktName.decapitalize(Locale.getDefault()),
                tokenRefs = listOf(
                    "${token.ktName}.$COLORS_KT_PROPERTY_NAME",
                    "${token.ktName}.$POSITIONS_KT_PROPERTY_NAME",
                    "${token.ktName}.$ANGLE_KT_PROPERTY_NAME",
                ),
                gradientType = GradientTokenResult.ComposeTokenData.GradientType.LINEAR,
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
            GradientTokenResult.ComposeTokenData(
                attrName = token.ktName.decapitalize(Locale.getDefault()),
                tokenRefs = listOf(
                    "${token.ktName}.$COLORS_KT_PROPERTY_NAME",
                    "${token.ktName}.$POSITIONS_KT_PROPERTY_NAME",
                    "${token.ktName}.$CENTER_X_KT_PROPERTY_NAME",
                    "${token.ktName}.$CENTER_Y_KT_PROPERTY_NAME",
                ),
                gradientType = GradientTokenResult.ComposeTokenData.GradientType.SWEEP,
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
            GradientTokenResult.ComposeTokenData(
                attrName = token.ktName.decapitalize(Locale.getDefault()),
                tokenRefs = listOf(
                    "${token.ktName}.$COLORS_KT_PROPERTY_NAME",
                    "${token.ktName}.$POSITIONS_KT_PROPERTY_NAME",
                    "${token.ktName}.$RADIUS_KT_PROPERTY_NAME",
                    "${token.ktName}.$CENTER_X_KT_PROPERTY_NAME",
                    "${token.ktName}.$CENTER_Y_KT_PROPERTY_NAME",
                ),
                gradientType = GradientTokenResult.ComposeTokenData.GradientType.RADIAL,
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
