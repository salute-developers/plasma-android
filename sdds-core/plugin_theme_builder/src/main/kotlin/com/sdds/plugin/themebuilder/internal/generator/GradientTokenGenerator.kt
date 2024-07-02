package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Companion.appendObject
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.Companion.DEFAULT_ROOT_ATTRIBUTES
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementFormat
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementType
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory.Package.VS
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult.TokenData
import com.sdds.plugin.themebuilder.internal.token.BackgroundGradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.GradientToken
import com.sdds.plugin.themebuilder.internal.token.GradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.LinearGradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.RadialGradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.SweepGradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.isDark
import com.sdds.plugin.themebuilder.internal.token.isLight
import com.sdds.plugin.themebuilder.internal.utils.ColorResolver.HexFormat
import com.sdds.plugin.themebuilder.internal.utils.ColorResolver.resolveColor
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.gradientsXmlFile
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.sdds.plugin.themebuilder.internal.validator.LinearGradientTokenValidator
import com.sdds.plugin.themebuilder.internal.validator.RadialGradientTokenValidator
import com.sdds.plugin.themebuilder.internal.validator.SweepGradientTokenValidator
import com.squareup.kotlinpoet.TypeName
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
internal class GradientTokenGenerator(
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val outputResDir: File,
    target: ThemeBuilderTarget,
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val gradientTokenValues: Map<String, List<GradientTokenValue>>,
    private val palette: Map<String, Map<String, String>>,
) : TokenGenerator<GradientToken, GradientTokenResult>(target) {

    private val composeKtFileBuilder by unsafeLazy { ktFileBuilderFactory.create("GradientTokens") }
    private val composeLightBuilder by unsafeLazy { composeKtFileBuilder.rootObject("LightGradientTokens") }
    private val composeDarkBuilder by unsafeLazy { composeKtFileBuilder.rootObject("DarkGradientTokens") }
    private val xmlDocumentBuilder by unsafeLazy { xmlBuilderFactory.create(DEFAULT_ROOT_ATTRIBUTES) }
    private val viewKtFileBuilder by unsafeLazy { ktFileBuilderFactory.create("GradientTokens", VS) }
    private val viewLightBuilder by unsafeLazy { viewKtFileBuilder.rootObject("LightGradientTokens") }
    private val viewDarkBuilder by unsafeLazy { viewKtFileBuilder.rootObject("DarkGradientTokens") }

    private val composeKtLightTokenDataCollector = mutableMapOf<String, MutableList<TokenData.Gradient>>()
    private val composeKtDarkTokenDataCollector = mutableMapOf<String, MutableList<TokenData.Gradient>>()
    private val viewKtLightTokenDataCollector = mutableMapOf<String, MutableList<TokenData.Gradient>>()
    private val viewKtDarkTokenDataCollector = mutableMapOf<String, MutableList<TokenData.Gradient>>()

    override fun collectResult() = GradientTokenResult(
        composeTokens = TokenData(
            light = composeKtLightTokenDataCollector,
            dark = composeKtDarkTokenDataCollector,
        ),
        viewTokens = TokenData(
            light = viewKtLightTokenDataCollector,
            dark = viewKtDarkTokenDataCollector,
        )
    )

    /**
     * @see TokenGenerator.generateViewSystem
     */
    override fun generateViewSystem() {
        super.generateViewSystem()
        xmlDocumentBuilder.build(outputResDir.gradientsXmlFile())
        viewKtFileBuilder.addImport("android.graphics", listOf("Color"))
        viewKtFileBuilder.build(outputLocation)
    }

    /**
     * @see TokenGenerator.generateCompose
     */
    override fun generateCompose() {
        super.generateCompose()
        composeKtFileBuilder.build(outputLocation)
    }

    /**
     * @see TokenGenerator.addViewSystemToken
     */
    override fun addViewSystemToken(token: GradientToken): Boolean {
        val tokenValue = gradientTokenValues[token.name]
            ?: throw ThemeBuilderException(
                "Can't find value for gradient token ${token.name}. " +
                        "It should be in android_gradient.json.",
            )
        return addXmlViewToken(token, tokenValue) && addKtToken(token, tokenValue, Framework.VIEW)
    }

    /**
     * @see TokenGenerator.addComposeToken
     */
    override fun addComposeToken(token: GradientToken): Boolean {
        val tokenValues = gradientTokenValues[token.name]
            ?: throw ThemeBuilderException(
                "Can't find value for gradient token ${token.name}. " +
                        "It should be in android_gradient.json.",
            )
        return addKtToken(token, tokenValues, Framework.COMPOSE)
    }

    private fun addXmlViewToken(token: GradientToken, tokenValues: List<GradientTokenValue>): Boolean {
        tokenValues.forEachIndexed { index, gradient ->
            when (gradient) {
                is LinearGradientTokenValue -> xmlDocumentBuilder.appendLinearGradient(token, gradient, index)
                is RadialGradientTokenValue -> xmlDocumentBuilder.appendRadialGradient(token, gradient, index)
                is SweepGradientTokenValue -> xmlDocumentBuilder.appendSweepGradient(token, gradient, index)
                is BackgroundGradientTokenValue -> xmlDocumentBuilder.appendSingleColorBackground(
                    token = token,
                    tokenValue = gradient,
                    layerIndex = index,
                )
            }
        }
        return true
    }

    private fun addKtToken(token: GradientToken, tokenValues: List<GradientTokenValue>, framework: Framework): Boolean {
        val darkLightObjectBuilder = darkLightObjectBuilder(token, framework)
        val baseTokenName = token.ktName
        with(darkLightObjectBuilder) {
            appendObject(baseTokenName, token.description) {
                if (tokenValues.size > 1) {
                    appendGradientLayers(tokenValues, token, framework)
                } else {
                    appendGradientLayer(tokenValues.first(), token, framework, null)
                }
            }
        }
        return true
    }

    private fun TypeSpec.Builder.appendGradientLayers(
        tokenValues: List<GradientTokenValue>,
        token: GradientToken,
        framework: Framework
    ) {
        tokenValues.mapIndexed { index, gradient ->
            appendObject("Layer$index") {
                appendGradientLayer(gradient, token, framework, index)
            }
        }
    }

    private fun TypeSpec.Builder.appendGradientLayer(
        tokenValue: GradientTokenValue,
        token: GradientToken,
        framework: Framework,
        layerIndex: Int?,
    ) {
        val layerRef = layerIndex?.let { "Layer$it." }.orEmpty()
        val tokenData = when (tokenValue) {
            is LinearGradientTokenValue -> appendLinearGradient(token, tokenValue, framework, layerRef)
            is RadialGradientTokenValue -> appendRadialGradient(token, tokenValue, framework, layerRef)
            is SweepGradientTokenValue -> appendSweepGradient(token, tokenValue, framework, layerRef)
            is BackgroundGradientTokenValue -> appendSingleColorBackground(token, tokenValue, framework, layerRef)
        }
        token.addKtTokenData(
            token.attrName(),
            tokenData,
            framework
        )
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
        layerIndex: Int,
    ) {
        val baseTokenName = token.xmlName + "_layer_$layerIndex"
        LinearGradientTokenValidator.validate(tokenValue, baseTokenName)
        val resolvedColors = tokenValue.colors.resolveColors(HexFormat.XML_HEX, baseTokenName)

        val colorParameters = resolvedColors.colorsToTokenParameterData(baseTokenName)
        val positionParameters = tokenValue.locations.positionsToTokenParameterData(baseTokenName)
        val angleParameter = "${baseTokenName}_angle"
        val description = token.description + ", Слой $layerIndex"
        wrapWithRegion(description) {
            appendBaseGradient(colorParameters, positionParameters)
            appendDimenItem(angleParameter, tokenValue.angle.toString())
        }
    }

    private fun XmlResourcesDocumentBuilder.appendSweepGradient(
        token: GradientToken,
        tokenValue: SweepGradientTokenValue,
        layerIndex: Int,
    ) {
        val baseTokenName = token.xmlName + "_layer_$layerIndex"
        SweepGradientTokenValidator.validate(tokenValue, baseTokenName)
        val resolvedColors = tokenValue.colors.resolveColors(HexFormat.XML_HEX, baseTokenName)

        val colorParameters = resolvedColors.colorsToTokenParameterData(baseTokenName)
        val positionParameters = tokenValue.locations.positionsToTokenParameterData(baseTokenName)
        val centerXParameter = "${baseTokenName}_center_x"
        val centerYParameter = "${baseTokenName}_center_y"
        val description = token.description + ", Слой $layerIndex"
        wrapWithRegion(description) {
            appendBaseGradient(colorParameters, positionParameters)
            appendDimenItem(centerXParameter, tokenValue.centerX.toString())
            appendDimenItem(centerYParameter, tokenValue.centerY.toString())
        }
    }

    private fun XmlResourcesDocumentBuilder.appendRadialGradient(
        token: GradientToken,
        tokenValue: RadialGradientTokenValue,
        layerIndex: Int,
    ) {
        val baseTokenName = token.xmlName + "_layer_$layerIndex"
        RadialGradientTokenValidator.validate(tokenValue, baseTokenName)
        val resolvedColors = tokenValue.colors.resolveColors(HexFormat.XML_HEX, baseTokenName)

        val colorParameters = resolvedColors.colorsToTokenParameterData(baseTokenName)
        val positionParameters = tokenValue.locations.positionsToTokenParameterData(baseTokenName)
        val radiusParameter = "${baseTokenName}_radius"
        val centerXParameter = "${baseTokenName}_center_x"
        val centerYParameter = "${baseTokenName}_center_y"
        val description = token.description + ", Слой $layerIndex"
        wrapWithRegion(description) {
            appendBaseGradient(colorParameters, positionParameters)
            appendDimenItem(radiusParameter, tokenValue.radius.toString())
            appendDimenItem(centerXParameter, tokenValue.centerX.toString())
            appendDimenItem(centerYParameter, tokenValue.centerY.toString())
        }
    }

    private fun XmlResourcesDocumentBuilder.appendSingleColorBackground(
        token: GradientToken,
        tokenValue: BackgroundGradientTokenValue,
        layerIndex: Int
    ) {
        val baseTokenName = token.xmlName + "_layer_$layerIndex"
        val resolvedColor = resolveColor(tokenValue.background, token.name, palette, HexFormat.XML_HEX)
        val description = token.description + ", Слой $layerIndex"
        wrapWithRegion(description) {
            appendElement(ElementName.COLOR, baseTokenName, resolvedColor)
        }
    }

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

    private fun fileKtBuilder(framework: Framework): KtFileBuilder =
        when (framework) {
            Framework.COMPOSE -> composeKtFileBuilder
            Framework.VIEW -> viewKtFileBuilder
        }

    private fun darkLightObjectBuilder(token: GradientToken, framework: Framework): TypeSpec.Builder {
        return when (framework) {
            Framework.COMPOSE -> if (token.isDark) {
                composeDarkBuilder
            } else {
                composeLightBuilder
            }

            Framework.VIEW -> if (token.isDark) {
                viewDarkBuilder
            } else {
                viewLightBuilder
            }
        }
    }

    private fun lightDataCollector(framework: Framework): MutableMap<String, MutableList<GradientTokenResult. TokenData. Gradient>> {
        return when (framework) {
            Framework.COMPOSE -> composeKtLightTokenDataCollector
            Framework.VIEW -> viewKtLightTokenDataCollector
        }
    }

    private fun darkDataCollector(framework: Framework): MutableMap<String, MutableList<GradientTokenResult. TokenData. Gradient>> {
        return when (framework) {
            Framework.COMPOSE -> composeKtLightTokenDataCollector
            Framework.VIEW -> viewKtLightTokenDataCollector
        }
    }

    private fun TypeSpec.Builder.appendLinearGradient(
        token: GradientToken,
        tokenValue: LinearGradientTokenValue,
        framework: Framework,
        layerRef: String,
    ): TokenData.Gradient {
        val baseTokenName = token.ktName
        LinearGradientTokenValidator.validate(tokenValue, baseTokenName)
        val resolvedColors = tokenValue.colors.resolveColors(framework.colorHexFormat, baseTokenName)
        with(fileKtBuilder(framework)) {
            appendBaseGradient(resolvedColors, tokenValue.locations, framework)
            appendProperty(ANGLE_KT_PROPERTY_NAME, Float::class, "${tokenValue.angle}f")
        }
        return TokenData.Gradient(
            tokenRefs = listOf(
                "${baseTokenName}.${layerRef}$COLORS_KT_PROPERTY_NAME",
                "${baseTokenName}.${layerRef}$POSITIONS_KT_PROPERTY_NAME",
                "${baseTokenName}.${layerRef}$ANGLE_KT_PROPERTY_NAME",
            ),
            gradientType = TokenData.GradientType.LINEAR,
        )
    }

    private fun TypeSpec.Builder.appendSweepGradient(
        token: GradientToken,
        tokenValue: SweepGradientTokenValue,
        framework: Framework,
        layerRef: String,
    ): TokenData.Gradient {
        val baseTokenName = token.ktName
        SweepGradientTokenValidator.validate(tokenValue, baseTokenName)
        val resolvedColors = tokenValue.colors.resolveColors(framework.colorHexFormat, baseTokenName)
        with(fileKtBuilder(framework)) {
            appendBaseGradient(resolvedColors, tokenValue.locations, framework)
            appendProperty(CENTER_X_KT_PROPERTY_NAME, Float::class, "${tokenValue.centerX}f")
            appendProperty(CENTER_Y_KT_PROPERTY_NAME, Float::class, "${tokenValue.centerY}f")
        }
        return TokenData.Gradient(
            tokenRefs = listOf(
                "${baseTokenName}.$layerRef$COLORS_KT_PROPERTY_NAME",
                "${baseTokenName}.$layerRef$POSITIONS_KT_PROPERTY_NAME",
                "${baseTokenName}.$layerRef$CENTER_X_KT_PROPERTY_NAME",
                "${baseTokenName}.$layerRef$CENTER_Y_KT_PROPERTY_NAME",
            ),
            gradientType = TokenData.GradientType.SWEEP,
        )
    }

    private fun TypeSpec.Builder.appendRadialGradient(
        token: GradientToken,
        tokenValue: RadialGradientTokenValue,
        framework: Framework,
        layerRef: String,
    ): TokenData.Gradient {
        val baseTokenName = token.ktName
        RadialGradientTokenValidator.validate(tokenValue, baseTokenName)
        val resolvedColors = tokenValue.colors.resolveColors(framework.colorHexFormat, baseTokenName)
        with(fileKtBuilder(framework)) {
            appendBaseGradient(resolvedColors, tokenValue.locations, framework)
            appendProperty(RADIUS_KT_PROPERTY_NAME, Float::class, "${tokenValue.radius}f")
            appendProperty(CENTER_X_KT_PROPERTY_NAME, Float::class, "${tokenValue.centerX}f")
            appendProperty(CENTER_Y_KT_PROPERTY_NAME, Float::class, "${tokenValue.centerY}f")
        }
        return TokenData.Gradient(
            tokenRefs = listOf(
                "${baseTokenName}.${layerRef}$COLORS_KT_PROPERTY_NAME",
                "${baseTokenName}.${layerRef}$POSITIONS_KT_PROPERTY_NAME",
                "${baseTokenName}.${layerRef}$RADIUS_KT_PROPERTY_NAME",
                "${baseTokenName}.${layerRef}$CENTER_X_KT_PROPERTY_NAME",
                "${baseTokenName}.${layerRef}$CENTER_Y_KT_PROPERTY_NAME",
            ),
            gradientType = TokenData.GradientType.RADIAL,
        )
    }

    private fun TypeSpec.Builder.appendSingleColorBackground(
        token: GradientToken,
        tokenValue: BackgroundGradientTokenValue,
        framework: Framework,
        layerRef: String,
    ): TokenData.Gradient {
        val baseTokenName = token.ktName
        val resolvedColor = resolveColor(tokenValue.background, token.name, palette, framework.colorHexFormat)
        with(fileKtBuilder(framework)) {
            appendProperty(
                name = BACKGROUND_PROPERTY_NAME,
                typeName = framework.colorType,
                initializer = "${framework.colorInitializer}(${framework.colorValueBraces}$resolvedColor${framework.colorValueBraces})"
            )
        }
        return TokenData.Gradient(
            tokenRefs = listOf(
                "${baseTokenName}.$layerRef$BACKGROUND_PROPERTY_NAME",
            ),
            gradientType = TokenData.GradientType.BACKGROUND,
        )
    }

    private fun List<String>.resolveColors(hexFormat: HexFormat, tokenName: String): List<String> =
        map {
            resolveColor(
                tokenValue = it,
                tokenName = tokenName,
                palette = palette,
                hexFormat = hexFormat,
            )
        }

    private fun TypeSpec.Builder.appendBaseGradient(
        colors: List<String>,
        positions: List<Float>,
        framework: Framework,
    ) = with(viewKtFileBuilder) {
        val colorParams =
            colors.joinToString {
                "${framework.colorInitializer}(${framework.colorValueBraces}$it${framework.colorValueBraces})"
            }
        val positionParams = positions.joinToString { "${it}f" }
        appendProperty(
            COLORS_KT_PROPERTY_NAME,
            framework.colorListType,
            "${framework.colorListFabricCall}($colorParams)",
        )
        appendProperty(
            POSITIONS_KT_PROPERTY_NAME,
            FloatArray::class,
            "floatArrayOf($positionParams)",
        )
    }

    private fun GradientToken.addKtTokenData(
        attrName: String,
        params: TokenData.Gradient,
        framework: Framework
    ) {
        val lightDataCollector = lightDataCollector(framework)
        val darkDataCollector = darkDataCollector(framework)
        if (this.isLight) {
            lightDataCollector.getOrPut(attrName) { mutableListOf() }.add(params)
        } else if (this.isDark) {
            darkDataCollector.getOrPut(attrName) { mutableListOf() }.add(params)
        } else {
            lightDataCollector.getOrPut(attrName) { mutableListOf() }.add(params)
            darkDataCollector.getOrPut(attrName) { mutableListOf() }.add(params)
        }
    }

    private fun GradientToken.attrName(): String = ktName.decapitalize(Locale.getDefault())

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

    private enum class Framework(
        val colorInitializer: String,
        val colorType: TypeName,
        val colorListType: TypeName,
        val colorListFabricCall: String,
        val colorHexFormat: HexFormat,
        val colorValueBraces: String,
    ) {
        COMPOSE(
            colorInitializer = "Color",
            colorType = KtFileBuilder.TypeColor,
            colorListType = KtFileBuilder.TypeListOfColors,
            colorListFabricCall = "listOf",
            colorHexFormat = HexFormat.INT_HEX,
            colorValueBraces = ""
        ),
        VIEW(
            colorInitializer = "Color.parseColor",
            colorType = KtFileBuilder.TypeInt,
            colorListType = KtFileBuilder.TypeIntArray,
            colorListFabricCall = "intArrayOf",
            colorHexFormat = HexFormat.XML_HEX,
            colorValueBraces = "\""
        )
    }

    private companion object {
        const val COLORS_KT_PROPERTY_NAME = "colors"
        const val POSITIONS_KT_PROPERTY_NAME = "positions"
        const val ANGLE_KT_PROPERTY_NAME = "angle"
        const val RADIUS_KT_PROPERTY_NAME = "radius"
        const val CENTER_X_KT_PROPERTY_NAME = "centerX"
        const val CENTER_Y_KT_PROPERTY_NAME = "centerY"
        const val BACKGROUND_PROPERTY_NAME = "background"
    }
}
