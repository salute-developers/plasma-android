package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.gradientStylesXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import org.w3c.dom.Element
import java.io.File

/**
 * Генератор стилей градиентов
 */
internal class GradientStyleGenerator(
    private val outputResDir: File,
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val resourceReferenceProvider: ResourceReferenceProvider,
) : SimpleBaseGenerator {

    private var needDeclareStyle: Boolean = true

    private val xmlStylesDocumentBuilder: XmlResourcesDocumentBuilder by unsafeLazy {
        xmlBuilderFactory.create(XmlResourcesDocumentBuilder.DEFAULT_ROOT_ATTRIBUTES)
    }

    private val gradientStyles: MutableMap<String, String> = mutableMapOf()

    /**
     * Добавляет стиль градиента
     *
     * @param nameSnakeCase имя градиента
     * @param gradientParameters пары атрибут-значение
     * @param description описание градиента
     *
     * @return вернет ссылку стиль
     */
    fun addStyle(
        nameSnakeCase: String,
        gradientLayers: List<GradientTokenResult.ViewTokenData.Gradient.Layer>,
        description: String,
    ): String {
        val styleName = nameSnakeCase.snakeToCamelCase()
        val styleRes = resourceReferenceProvider.style("$BASE_STYLE.$styleName")
        if (gradientStyles.contains(styleName)) {
            return gradientStyles[styleName] ?: styleRes
        }
        gradientStyles[styleName] = styleRes
        with(xmlStylesDocumentBuilder) {
            if (needDeclareStyle) {
                needDeclareStyle = false
                appendStyleWithCompositePrefix(BASE_STYLE)
            }
            wrapWithRegion(description) {
                val layersRef = appendShaderLayersIfNeed(styleName, gradientLayers)
                appendShaderAppearanceStyle(styleName, nameSnakeCase, layersRef, gradientLayers.firstOrNull())
            }
        }
        return styleRes
    }

    override fun generate() {
        xmlStylesDocumentBuilder.build(outputResDir.gradientStylesXmlFile())
    }

    private fun XmlResourcesDocumentBuilder.appendShaderLayersIfNeed(
        styleName: String,
        shaderLayers: List<GradientTokenResult.ViewTokenData.Gradient.Layer>,
    ): List<String>? = if (shaderLayers.size > 1) {
        shaderLayers.mapIndexed { index, shaderLayer ->
            appendShaderLayerStyle(
                styleName = styleName,
                parameters = shaderLayer,
                layerIndex = index,
            )
        }
    } else {
        null
    }

    private fun XmlResourcesDocumentBuilder.appendShaderLayerStyle(
        styleName: String,
        parameters: GradientTokenResult.ViewTokenData.Gradient.Layer,
        layerIndex: Int,
    ): String {
        val layerStyleName = "$BASE_STYLE.${styleName}Layer$layerIndex"
        appendStyleWithCompositePrefix(layerStyleName) {
            appendShaderLayerParams(parameters, this)
        }
        return resourceReferenceProvider.style(layerStyleName)
    }

    private fun XmlResourcesDocumentBuilder.appendShaderAppearanceStyle(
        styleName: String,
        tokenName: String,
        layerReferences: List<String>? = null,
        fallback: GradientTokenResult.ViewTokenData.Gradient.Layer? = null,
    ) {
        val layersArrayRef = if (layerReferences != null) {
            val refName = "shader_${tokenName.techToSnakeCase()}_layers"
            appendElementWithContent(ElementName.INTEGER_ARRAY, refName) {
                layerReferences.forEach { appendElement(ElementName.ITEM, value = it) }
            }
            resourceReferenceProvider.array(refName)
        } else {
            null
        }

        appendStyleWithCompositePrefix("$BASE_STYLE.$styleName") {
            if (layersArrayRef != null) {
                appendElement(ElementName.ITEM, "sd_shaderLayers", layersArrayRef, usePrefix = false)
            } else if (fallback != null) {
                appendShaderLayerParams(fallback, this)
            }
        }
    }

    @Suppress("ComplexCondition")
    private fun GradientTokenResult.ViewTokenData.Gradient.Layer.Linear.getEndpoints(): Map<String, String> {
        return if (this.startX != null && this.startY != null && this.endX != null && this.endY != null) {
            mapOf(
                "sd_startX" to this.startX,
                "sd_startY" to this.startY,
                "sd_endX" to this.endX,
                "sd_endY" to this.endY,
            )
        } else {
            emptyMap()
        }
    }

    private fun GradientTokenResult.ViewTokenData.Gradient.Layer.getGradientParameters(): Map<String, String> {
        return when (this) {
            is GradientTokenResult.ViewTokenData.Gradient.Layer.Linear -> {
                mapOf(
                    "sd_gradientType" to "linear",
                    "sd_angle" to this.angle,
                    "sd_colors" to this.colors,
                    "sd_stops" to this.stops,
                ) + getEndpoints()
            }

            is GradientTokenResult.ViewTokenData.Gradient.Layer.Radial -> mapOf(
                "sd_gradientType" to "radial",
                "sd_radius" to this.radius,
                "sd_centerX" to this.centerX,
                "sd_centerY" to this.centerY,
                "sd_colors" to this.colors,
                "sd_stops" to this.stops,
            )

            is GradientTokenResult.ViewTokenData.Gradient.Layer.Sweep -> mapOf(
                "sd_gradientType" to "sweep",
                "sd_centerX" to this.centerX,
                "sd_centerY" to this.centerY,
                "sd_colors" to this.colors,
                "sd_stops" to this.stops,
            )

            is GradientTokenResult.ViewTokenData.Gradient.Layer.Solid -> mapOf(
                "sd_gradientType" to "solid",
                "sd_colors" to this.colors,
            )
        }
    }

    private fun XmlResourcesDocumentBuilder.appendShaderLayerParams(
        layer: GradientTokenResult.ViewTokenData.Gradient.Layer,
        destination: Element,
    ) = with(destination) {
        layer.getGradientParameters().entries.forEach {
            appendElement(
                elementName = ElementName.ITEM,
                tokenName = it.key,
                value = it.value,
                usePrefix = false,
            )
        }
    }

    private companion object {
        const val BASE_STYLE = "Gradient"
    }
}
