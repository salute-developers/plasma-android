package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Companion.appendObject
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.Companion.DEFAULT_ROOT_ATTRIBUTES
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult.ComposeTokenData
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult.ViewTokenData
import com.sdds.plugin.themebuilder.internal.token.BackgroundGradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.GradientPoint
import com.sdds.plugin.themebuilder.internal.token.GradientToken
import com.sdds.plugin.themebuilder.internal.token.GradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.LinearGradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.RadialGradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.SweepGradientTokenValue
import com.sdds.plugin.themebuilder.internal.token.colorAttrName
import com.sdds.plugin.themebuilder.internal.token.isDark
import com.sdds.plugin.themebuilder.internal.token.isLight
import com.sdds.plugin.themebuilder.internal.token.isTextGradient
import com.sdds.plugin.themebuilder.internal.utils.ColorResolver.HexFormat
import com.sdds.plugin.themebuilder.internal.utils.ColorResolver.resolveColor
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.gradientParametersXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.sdds.plugin.themebuilder.internal.validator.LinearGradientTokenValidator
import com.sdds.plugin.themebuilder.internal.validator.RadialGradientTokenValidator
import com.sdds.plugin.themebuilder.internal.validator.SweepGradientTokenValidator
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asTypeName
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
    private val resourceReferenceProvider: ResourceReferenceProvider,
) : TokenGenerator<GradientToken, GradientTokenResult>(target) {

    private val composeKtFileBuilder by unsafeLazy { ktFileBuilderFactory.create("GradientTokens") }
    private val composeLightBuilder by unsafeLazy {
        composeKtFileBuilder.rootObject(LIGHT_GRADIENT_TOKENS_NAME, LIGHT_GRADIENT_TOKENS_DESC)
    }
    private val composeDarkBuilder by unsafeLazy {
        composeKtFileBuilder.rootObject(DARK_GRADIENT_TOKENS_NAME, DARK_GRADIENT_TOKENS_DESC)
    }
    private val xmlParametersDocumentBuilder by unsafeLazy {
        xmlBuilderFactory.create(DEFAULT_ROOT_ATTRIBUTES)
    }

    private val composeKtLightTokenDataCollector =
        mutableMapOf<String, MutableList<ComposeTokenData.Gradient>>()
    private val composeKtDarkTokenDataCollector =
        mutableMapOf<String, MutableList<ComposeTokenData.Gradient>>()
    private val viewXmlDrawableLightTokenDataCollector =
        mutableMapOf<String, ViewTokenData.Gradient>()
    private val viewXmlDrawableDarkTokenDataCollector =
        mutableMapOf<String, ViewTokenData.Gradient>()

    override fun collectResult() = GradientTokenResult(
        tokens = tokens,
        composeTokens = ComposeTokenData(
            light = composeKtLightTokenDataCollector,
            dark = composeKtDarkTokenDataCollector,
        ),
        viewXmlTokens = ViewTokenData(
            light = viewXmlDrawableLightTokenDataCollector,
            dark = viewXmlDrawableDarkTokenDataCollector,
        ),
    )

    /**
     * @see TokenGenerator.generateViewSystem
     */
    override fun generateViewSystem() {
        super.generateViewSystem()
        xmlParametersDocumentBuilder.build(outputResDir.gradientParametersXmlFile())
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
        return addXmlViewToken(token, tokenValue)
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
        return addKtToken(token, tokenValues)
    }

    private fun addXmlViewToken(
        token: GradientToken,
        tokenValues: List<GradientTokenValue>,
    ): Boolean {
        val isSingleLayer = tokenValues.size == 1
        if (token.isTextGradient && !isSingleLayer) {
            throw ThemeBuilderException("Text gradient ${token.name} should not be composite")
        }
        val gradientParameters = tokenValues.mapIndexed { index, gradient ->
            val layerIndex = if (isSingleLayer) null else index
            when (gradient) {
                is LinearGradientTokenValue -> appendLinearGradient(
                    token = token,
                    tokenValue = gradient,
                    layerIndex = layerIndex,
                )

                is RadialGradientTokenValue -> appendRadialGradient(
                    token = token,
                    tokenValue = gradient,
                    layerIndex = layerIndex,
                )

                is SweepGradientTokenValue -> appendSweepGradient(
                    token = token,
                    tokenValue = gradient,
                    layerIndex = layerIndex,
                )

                is BackgroundGradientTokenValue -> appendSingleColorBackground(
                    token = token,
                    tokenValue = gradient,
                    layerIndex = layerIndex,
                )
            }
        }

        addViewGradientResult(token.colorAttrName(), token, gradientParameters)
        return true
    }

    private fun addViewGradientResult(
        attrName: String,
        token: GradientToken,
        gradientParameters: List<ViewTokenData.Gradient.Layer>,
    ) {
        when {
            token.isDark -> {
                viewXmlDrawableDarkTokenDataCollector[attrName] = ViewTokenData.Gradient(
                    nameSnakeCase = token.xmlName,
                    layers = gradientParameters,
                    isTextGradient = token.isTextGradient,
                    description = token.description,
                )
            }

            token.isLight -> {
                viewXmlDrawableLightTokenDataCollector[attrName] = ViewTokenData.Gradient(
                    nameSnakeCase = token.xmlName,
                    layers = gradientParameters,
                    isTextGradient = token.isTextGradient,
                    description = token.description,
                )
            }

            else -> {
                viewXmlDrawableDarkTokenDataCollector[attrName] = ViewTokenData.Gradient(
                    nameSnakeCase = token.xmlName,
                    layers = gradientParameters,
                    isTextGradient = token.isTextGradient,
                    description = token.description,
                )
                viewXmlDrawableLightTokenDataCollector[attrName] = ViewTokenData.Gradient(
                    nameSnakeCase = token.xmlName,
                    layers = gradientParameters,
                    isTextGradient = token.isTextGradient,
                    description = token.description,
                )
            }
        }
    }

    private fun getXmlGradientLayerSuffix(index: Int?): String {
        return index?.let { "_layer_$index" }.orEmpty()
    }

    private fun getXmlGradientLayerDescription(index: Int?): String {
        return index?.let { ", Слой $index" }.orEmpty()
    }

    private fun addKtToken(
        token: GradientToken,
        tokenValues: List<GradientTokenValue>,
    ): Boolean {
        val darkLightObjectBuilder = darkLightObjectBuilder(token)
        val baseTokenName = token.ktName
        with(darkLightObjectBuilder) {
            appendObject(baseTokenName, token.description) {
                if (tokenValues.size > 1) {
                    appendGradientLayers(tokenValues, token)
                } else {
                    appendGradientLayer(tokenValues.first(), token, null)
                }
            }
        }
        return true
    }

    private fun TypeSpec.Builder.appendGradientLayers(
        tokenValues: List<GradientTokenValue>,
        token: GradientToken,
    ) {
        tokenValues.mapIndexed { index, gradient ->
            appendObject("Layer$index", "Cлой $index") {
                appendGradientLayer(gradient, token, index)
            }
        }
    }

    private fun TypeSpec.Builder.appendGradientLayer(
        tokenValue: GradientTokenValue,
        token: GradientToken,
        layerIndex: Int?,
    ) {
        val layerRef = layerIndex?.let { "Layer$it." }.orEmpty()
        val tokenData = when (tokenValue) {
            is LinearGradientTokenValue -> appendLinearGradient(
                token = token,
                tokenValue = tokenValue,
                layerRef = layerRef,
            )

            is RadialGradientTokenValue -> appendRadialGradient(
                token = token,
                tokenValue = tokenValue,
                layerRef = layerRef,
            )

            is SweepGradientTokenValue -> appendSweepGradient(
                token = token,
                tokenValue = tokenValue,
                layerRef = layerRef,
            )

            is BackgroundGradientTokenValue -> appendSingleColorBackground(
                token = token,
                tokenValue = tokenValue,
                layerRef = layerRef,
            )
        }
        token.addKtTokenData(
            token.attrName(),
            tokenData,
        )
    }

    private fun appendLinearGradient(
        token: GradientToken,
        tokenValue: LinearGradientTokenValue,
        layerIndex: Int?,
    ): ViewTokenData.Gradient.Layer {
        val baseTokenName = token.xmlName + getXmlGradientLayerSuffix(layerIndex)
        LinearGradientTokenValidator.validate(tokenValue, baseTokenName)
        val resolvedColors = tokenValue.colors.resolveColors(HexFormat.XML_HEX, baseTokenName)

        val colorParameters = resolvedColors.colorsToTokenParameterData(baseTokenName)
        val positionParameters = tokenValue.locations.positionsToTokenParameterData(baseTokenName)
        val colorArrayParameter = "${baseTokenName}_colors"
        val positionArrayParameter = "${baseTokenName}_positions"
        val angleParameter = "${baseTokenName}_angle"
        val description = token.description + getXmlGradientLayerDescription(layerIndex)
        val startPointXParameter = "${baseTokenName}_start_point_x"
        val startPointYParameter = "${baseTokenName}_start_point_y"
        val endPointXParameter = "${baseTokenName}_end_point_x"
        val endPointYParameter = "${baseTokenName}_end_point_y"

        with(xmlParametersDocumentBuilder) {
            wrapWithRegion(description) {
                colorParameters.forEach { appendElement(ElementName.COLOR, it.name, it.value) }
                appendElementWithContent(ElementName.INTEGER_ARRAY, colorArrayParameter) {
                    colorParameters.forEach {
                        appendElement(
                            elementName = ElementName.ITEM,
                            value = resourceReferenceProvider.color(it.name),
                        )
                    }
                }
                appendElement(ElementName.STRING, angleParameter, tokenValue.angle.toString())
                if (tokenValue.startPoint != null && tokenValue.endPoint != null) {
                    appendElement(ElementName.STRING, startPointXParameter, tokenValue.startPoint.x.toString())
                    appendElement(ElementName.STRING, startPointYParameter, tokenValue.startPoint.y.toString())
                    appendElement(ElementName.STRING, endPointXParameter, tokenValue.endPoint.x.toString())
                    appendElement(ElementName.STRING, endPointYParameter, tokenValue.endPoint.y.toString())
                }
                appendElementWithContent(ElementName.STRING_ARRAY, positionArrayParameter) {
                    positionParameters.forEach {
                        appendElement(elementName = ElementName.ITEM, value = it.value)
                    }
                }
            }
        }
        val shouldUseEndPointRefs = tokenValue.startPoint != null && tokenValue.endPoint != null
        return ViewTokenData.Gradient.Layer.Linear(
            angle = resourceReferenceProvider.string(angleParameter),
            colors = resourceReferenceProvider.array(colorArrayParameter),
            stops = resourceReferenceProvider.array(positionArrayParameter),
            startX = resourceReferenceProvider.string(startPointXParameter).takeIf { shouldUseEndPointRefs },
            startY = resourceReferenceProvider.string(startPointYParameter).takeIf { shouldUseEndPointRefs },
            endX = resourceReferenceProvider.string(endPointXParameter).takeIf { shouldUseEndPointRefs },
            endY = resourceReferenceProvider.string(endPointYParameter).takeIf { shouldUseEndPointRefs },
        )
    }

    private fun appendSweepGradient(
        token: GradientToken,
        tokenValue: SweepGradientTokenValue,
        layerIndex: Int?,
    ): ViewTokenData.Gradient.Layer {
        val baseTokenName = token.xmlName + getXmlGradientLayerSuffix(layerIndex)
        SweepGradientTokenValidator.validate(tokenValue, baseTokenName)
        val resolvedColors = tokenValue.colors.resolveColors(HexFormat.XML_HEX, baseTokenName)

        val colorParameters = resolvedColors.colorsToTokenParameterData(baseTokenName)
        val positionParameters = tokenValue.locations.positionsToTokenParameterData(baseTokenName)
        val colorArrayParameter = "${baseTokenName}_colors"
        val positionArrayParameter = "${baseTokenName}_positions"
        val centerXParameter = "${baseTokenName}_center_x"
        val centerYParameter = "${baseTokenName}_center_y"
        val description = token.description + getXmlGradientLayerDescription(layerIndex)

        with(xmlParametersDocumentBuilder) {
            wrapWithRegion(description) {
                colorParameters.forEach { appendElement(ElementName.COLOR, it.name, it.value) }
                appendElementWithContent(ElementName.INTEGER_ARRAY, colorArrayParameter) {
                    colorParameters.forEach {
                        appendElement(
                            elementName = ElementName.ITEM,
                            value = resourceReferenceProvider.color(it.name),
                        )
                    }
                }
                appendElement(ElementName.STRING, centerXParameter, tokenValue.centerX.toString())
                appendElement(ElementName.STRING, centerYParameter, tokenValue.centerY.toString())
                appendElementWithContent(ElementName.STRING_ARRAY, positionArrayParameter) {
                    positionParameters.forEach {
                        appendElement(elementName = ElementName.ITEM, value = it.value)
                    }
                }
            }
        }

        return ViewTokenData.Gradient.Layer.Sweep(
            centerX = resourceReferenceProvider.string(centerXParameter),
            centerY = resourceReferenceProvider.string(centerYParameter),
            colors = resourceReferenceProvider.array(colorArrayParameter),
            stops = resourceReferenceProvider.array(positionArrayParameter),
        )
    }

    private fun appendRadialGradient(
        token: GradientToken,
        tokenValue: RadialGradientTokenValue,
        layerIndex: Int?,
    ): ViewTokenData.Gradient.Layer {
        val baseTokenName = token.xmlName + getXmlGradientLayerSuffix(layerIndex)
        RadialGradientTokenValidator.validate(tokenValue, baseTokenName)
        val resolvedColors = tokenValue.colors.resolveColors(HexFormat.XML_HEX, baseTokenName)

        val colorParameters = resolvedColors.colorsToTokenParameterData(baseTokenName)
        val positionParameters = tokenValue.locations.positionsToTokenParameterData(baseTokenName)
        val colorArrayParameter = "${baseTokenName}_colors"
        val positionArrayParameter = "${baseTokenName}_positions"
        val radiusParameter = "${baseTokenName}_radius"
        val centerXParameter = "${baseTokenName}_center_x"
        val centerYParameter = "${baseTokenName}_center_y"
        val description = token.description + getXmlGradientLayerDescription(layerIndex)

        with(xmlParametersDocumentBuilder) {
            wrapWithRegion(description) {
                colorParameters.forEach { appendElement(ElementName.COLOR, it.name, it.value) }
                appendElementWithContent(ElementName.INTEGER_ARRAY, colorArrayParameter) {
                    colorParameters.forEach {
                        appendElement(
                            elementName = ElementName.ITEM,
                            value = resourceReferenceProvider.color(it.name),
                        )
                    }
                }
                appendElement(ElementName.STRING, centerXParameter, tokenValue.centerX.toString())
                appendElement(ElementName.STRING, centerYParameter, tokenValue.centerY.toString())
                appendElement(ElementName.STRING, radiusParameter, tokenValue.radius.toString())
                appendElementWithContent(ElementName.STRING_ARRAY, positionArrayParameter) {
                    positionParameters.forEach {
                        appendElement(elementName = ElementName.ITEM, value = it.value)
                    }
                }
            }
        }

        return ViewTokenData.Gradient.Layer.Radial(
            centerX = resourceReferenceProvider.string(centerYParameter),
            centerY = resourceReferenceProvider.string(centerYParameter),
            radius = resourceReferenceProvider.string(radiusParameter),
            colors = resourceReferenceProvider.array(colorArrayParameter),
            stops = resourceReferenceProvider.array(positionArrayParameter),
        )
    }

    private fun appendSingleColorBackground(
        token: GradientToken,
        tokenValue: BackgroundGradientTokenValue,
        layerIndex: Int?,
    ): ViewTokenData.Gradient.Layer {
        val baseTokenName = token.xmlName + getXmlGradientLayerSuffix(layerIndex)
        val resolvedColor =
            resolveColor(tokenValue.background, token.name, palette, HexFormat.XML_HEX)
        val colorArrayParameter = "${baseTokenName}_colors"
        val description = token.description + getXmlGradientLayerDescription(layerIndex)
        with(xmlParametersDocumentBuilder) {
            wrapWithRegion(description) {
                appendElement(ElementName.COLOR, baseTokenName, resolvedColor)
                appendElementWithContent(ElementName.INTEGER_ARRAY, colorArrayParameter) {
                    appendElement(
                        elementName = ElementName.ITEM,
                        value = resourceReferenceProvider.color(baseTokenName),
                    )
                }
            }
        }

        return ViewTokenData.Gradient.Layer.Solid(
            colors = resourceReferenceProvider.array(colorArrayParameter),
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

    private fun darkLightObjectBuilder(token: GradientToken): TypeSpec.Builder {
        return if (token.isDark) {
            composeDarkBuilder
        } else {
            composeLightBuilder
        }
    }

    private fun TypeSpec.Builder.appendLinearGradient(
        token: GradientToken,
        tokenValue: LinearGradientTokenValue,
        layerRef: String,
    ): ComposeTokenData.Gradient {
        val baseTokenName = token.ktName
        LinearGradientTokenValidator.validate(tokenValue, baseTokenName)
        val resolvedColors =
            tokenValue.colors.resolveColors(HexFormat.INT_HEX, baseTokenName)
        with(composeKtFileBuilder) {
            appendBaseGradient(resolvedColors, tokenValue.locations)
            appendProperty(
                name = ANGLE_KT_PROPERTY_NAME,
                typeName = Float::class.asTypeName(),
                initializer = "${tokenValue.angle}f",
                modifiers = listOf(KtFileBuilder.Modifier.CONST),
                description = ANGLE_KT_PROPERTY_DESC,
            )
            appendGradientEndPoints(
                tokenValue.startPoint,
                tokenValue.endPoint,
            )
        }
        val tokenRefs = mutableListOf<String>().apply {
            add("$baseTokenName.$layerRef$COLORS_KT_PROPERTY_NAME")
            add("$baseTokenName.$layerRef$POSITIONS_KT_PROPERTY_NAME")
            add("$baseTokenName.$layerRef$ANGLE_KT_PROPERTY_NAME")
            if (tokenValue.startPoint != null && tokenValue.endPoint != null) {
                add("$baseTokenName.$layerRef$START_POINT_KT_PROPERTY_NAME")
                add("$baseTokenName.$layerRef$END_POINT_KT_PROPERTY_NAME")
            }
        }
        return ComposeTokenData.Gradient(
            tokenRefs = tokenRefs,
            gradientType = ComposeTokenData.GradientType.LINEAR,
            description = token.description,
        )
    }

    private fun TypeSpec.Builder.appendSweepGradient(
        token: GradientToken,
        tokenValue: SweepGradientTokenValue,
        layerRef: String,
    ): ComposeTokenData.Gradient {
        val baseTokenName = token.ktName
        SweepGradientTokenValidator.validate(tokenValue, baseTokenName)
        val resolvedColors =
            tokenValue.colors.resolveColors(HexFormat.INT_HEX, baseTokenName)
        with(composeKtFileBuilder) {
            appendBaseGradient(resolvedColors, tokenValue.locations)
            appendProperty(
                name = CENTER_X_KT_PROPERTY_NAME,
                typeName = Float::class.asTypeName(),
                initializer = "${tokenValue.centerX}f",
                modifiers = ConstModifier,
            )
            appendProperty(
                name = CENTER_Y_KT_PROPERTY_NAME,
                typeName = Float::class.asTypeName(),
                initializer = "${tokenValue.centerY}f",
                modifiers = ConstModifier,
            )
        }
        return ComposeTokenData.Gradient(
            tokenRefs = listOf(
                "$baseTokenName.$layerRef$COLORS_KT_PROPERTY_NAME",
                "$baseTokenName.$layerRef$POSITIONS_KT_PROPERTY_NAME",
                "$baseTokenName.$layerRef$CENTER_X_KT_PROPERTY_NAME",
                "$baseTokenName.$layerRef$CENTER_Y_KT_PROPERTY_NAME",
            ),
            gradientType = ComposeTokenData.GradientType.SWEEP,
            description = token.description,
        )
    }

    private fun TypeSpec.Builder.appendRadialGradient(
        token: GradientToken,
        tokenValue: RadialGradientTokenValue,
        layerRef: String,
    ): ComposeTokenData.Gradient {
        val baseTokenName = token.ktName
        RadialGradientTokenValidator.validate(tokenValue, baseTokenName)
        val resolvedColors =
            tokenValue.colors.resolveColors(HexFormat.INT_HEX, baseTokenName)
        with(composeKtFileBuilder) {
            appendBaseGradient(resolvedColors, tokenValue.locations)
            appendProperty(
                name = RADIUS_KT_PROPERTY_NAME,
                typeName = Float::class.asTypeName(),
                initializer = "${tokenValue.radius}f",
                modifiers = ConstModifier,
                description = RADIUS_KT_PROPERTY_DESC,
            )
            appendProperty(
                name = CENTER_X_KT_PROPERTY_NAME,
                typeName = Float::class.asTypeName(),
                initializer = "${tokenValue.centerX}f",
                modifiers = ConstModifier,
                description = CENTER_X_KT_PROPERTY_DESC,
            )
            appendProperty(
                name = CENTER_Y_KT_PROPERTY_NAME,
                typeName = Float::class.asTypeName(),
                initializer = "${tokenValue.centerY}f",
                modifiers = ConstModifier,
                description = CENTER_Y_KT_PROPERTY_DESC,
            )
        }
        return ComposeTokenData.Gradient(
            tokenRefs = listOf(
                "$baseTokenName.$layerRef$COLORS_KT_PROPERTY_NAME",
                "$baseTokenName.$layerRef$POSITIONS_KT_PROPERTY_NAME",
                "$baseTokenName.$layerRef$RADIUS_KT_PROPERTY_NAME",
                "$baseTokenName.$layerRef$CENTER_X_KT_PROPERTY_NAME",
                "$baseTokenName.$layerRef$CENTER_Y_KT_PROPERTY_NAME",
            ),
            gradientType = ComposeTokenData.GradientType.RADIAL,
            description = token.description,
        )
    }

    private fun TypeSpec.Builder.appendSingleColorBackground(
        token: GradientToken,
        tokenValue: BackgroundGradientTokenValue,
        layerRef: String,
    ): ComposeTokenData.Gradient {
        val baseTokenName = token.ktName
        val resolvedColor =
            resolveColor(tokenValue.background, token.name, palette, HexFormat.INT_HEX)
        with(composeKtFileBuilder) {
            appendProperty(
                name = BACKGROUND_PROPERTY_NAME,
                typeName = KtFileBuilder.TypeColor,
                initializer = "Color($resolvedColor)",
                description = BACKGROUND_PROPERTY_DESC,
            )
        }
        return ComposeTokenData.Gradient(
            tokenRefs = listOf(
                "$baseTokenName.$layerRef$BACKGROUND_PROPERTY_NAME",
            ),
            gradientType = ComposeTokenData.GradientType.BACKGROUND,
            description = token.description,
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
    ) = with(composeKtFileBuilder) {
        val colorParams = colors.joinToString { "Color($it)" }
        val positionParams = positions.joinToString { "${it}f" }
        appendProperty(
            COLORS_KT_PROPERTY_NAME,
            KtFileBuilder.TypeListOfColors,
            "listOf($colorParams)",
            description = COLORS_KT_PROPERTY_DESC,
        )
        appendProperty(
            POSITIONS_KT_PROPERTY_NAME,
            FloatArray::class,
            "floatArrayOf($positionParams)",
            description = POSITIONS_KT_PROPERTY_DESC,
        )
    }

    private fun TypeSpec.Builder.appendGradientEndPoints(
        startPoint: GradientPoint?,
        endPoint: GradientPoint?,
    ) = with(composeKtFileBuilder) {
        if (startPoint == null || endPoint == null) return@with
        appendProperty(
            name = START_POINT_KT_PROPERTY_NAME,
            typeName = KtFileBuilder.TypeOffset,
            initializer = "Offset(${startPoint.x}f, ${startPoint.y}f)",
            description = START_POINT_KT_PROPERTY_DESC,
        )
        appendProperty(
            name = END_POINT_KT_PROPERTY_NAME,
            typeName = KtFileBuilder.TypeOffset,
            initializer = "Offset(${endPoint.x}f, ${endPoint.y}f)",
            description = END_POINT_KT_PROPERTY_DESC,
        )
    }

    private fun GradientToken.addKtTokenData(
        attrName: String,
        params: ComposeTokenData.Gradient,
    ) {
        val lightDataCollector = composeKtLightTokenDataCollector
        val darkDataCollector = composeKtDarkTokenDataCollector
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

    companion object {
        val ConstModifier = listOf(KtFileBuilder.Modifier.CONST)
        private const val COLORS_KT_PROPERTY_NAME = "colors"
        private const val COLORS_KT_PROPERTY_DESC = "Цвета градиента"
        private const val POSITIONS_KT_PROPERTY_NAME = "positions"
        private const val POSITIONS_KT_PROPERTY_DESC = "Точки остановки цветов градиента"
        private const val ANGLE_KT_PROPERTY_NAME = "angle"
        private const val ANGLE_KT_PROPERTY_DESC = "Угол градиента"
        private const val RADIUS_KT_PROPERTY_NAME = "radius"
        private const val RADIUS_KT_PROPERTY_DESC = "Радиус градиента"
        private const val CENTER_X_KT_PROPERTY_NAME = "centerX"
        private const val CENTER_X_KT_PROPERTY_DESC = "Координата центра по оси X"
        private const val CENTER_Y_KT_PROPERTY_NAME = "centerY"
        private const val CENTER_Y_KT_PROPERTY_DESC = "Координата центра по оси Y"
        private const val BACKGROUND_PROPERTY_NAME = "background"
        private const val BACKGROUND_PROPERTY_DESC = "Фон градиента"
        private const val START_POINT_KT_PROPERTY_NAME = "startPoint"
        private const val START_POINT_KT_PROPERTY_DESC = "Координата начала"
        private const val END_POINT_KT_PROPERTY_NAME = "endPoint"
        private const val END_POINT_KT_PROPERTY_DESC = "Координата конца"

        internal const val LIGHT_GRADIENT_TOKENS_NAME = "LightGradientTokens"
        internal const val LIGHT_GRADIENT_TOKENS_DESC = "Токены градиента для светлой темы"
        internal const val DARK_GRADIENT_TOKENS_NAME = "DarkGradientTokens"
        internal const val DARK_GRADIENT_TOKENS_DESC = "Токены градиента для темной темы"
    }
}
