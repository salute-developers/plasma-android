package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ShadowTokenResult
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.shadowsStylesXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import org.w3c.dom.Element
import java.io.File

/**
 * Генератор стилей теней
 */
internal class ShadowStyleGenerator(
    private val outputResDir: File,
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val resourceReferenceProvider: ResourceReferenceProvider,
) : SimpleBaseGenerator {

    private var needDeclareShadowStyle: Boolean = true
    private var needDeclareLayerStyle: Boolean = true

    private val xmlStylesDocumentBuilder: XmlResourcesDocumentBuilder by unsafeLazy {
        xmlBuilderFactory.create(XmlResourcesDocumentBuilder.DEFAULT_ROOT_ATTRIBUTES)
    }

    private val shadowStyles: MutableMap<String, String> = mutableMapOf()

    /**
     * Добавляет стиль тени
     *
     * @param tokenTechName техническое название токена тени
     * @param shadowLayers данные о слоях тени
     * @param description описание токена тени
     *
     * @return вернет ссылку стиль
     */
    fun addStyle(
        tokenTechName: String,
        shadowLayers: List<ShadowTokenResult.ShadowLayer>,
        description: String,
    ): String {
        val styleName = tokenTechName.techToCamelCase()
        val styleRes = resourceReferenceProvider.style("$BASE_STYLE.$styleName")
        if (shadowStyles.contains(styleName)) {
            return shadowStyles[styleName] ?: styleRes
        }
        shadowStyles[styleName] = styleRes
        with(xmlStylesDocumentBuilder) {
            wrapWithRegion(description) {
                val layersRef = appendShadowLayersIfNeed(styleName, shadowLayers)
                appendShadowAppearanceStyle(styleName, tokenTechName, layersRef, shadowLayers.firstOrNull())
            }
        }
        return styleRes
    }

    override fun generate() {
        xmlStylesDocumentBuilder.build(outputResDir.shadowsStylesXmlFile())
    }

    private fun XmlResourcesDocumentBuilder.appendShadowAppearanceStyle(
        styleName: String,
        tokenName: String,
        layerReferences: List<String>? = null,
        fallback: ShadowTokenResult.ShadowLayer? = null,
    ) {
        if (layerReferences == null && fallback == null) return
        if (needDeclareShadowStyle) {
            needDeclareShadowStyle = false
            appendStyleWithCompositePrefix(BASE_STYLE)
        }

        val layersArrayRef = if (layerReferences != null) {
            val refName = "shadow_${tokenName.techToSnakeCase()}_layers"
            appendElementWithContent(ElementName.INTEGER_ARRAY, refName) {
                layerReferences.forEach { appendElement(ElementName.ITEM, value = it) }
            }
            resourceReferenceProvider.array(refName)
        } else {
            null
        }
        appendStyleWithCompositePrefix("$BASE_STYLE.$styleName") {
            if (layersArrayRef != null) {
                appendElement(ElementName.ITEM, "sd_shadowLayers", layersArrayRef, usePrefix = false)
            } else if (fallback != null) {
                appendShadowLayerParams(fallback, this)
            }
        }
    }

    private fun XmlResourcesDocumentBuilder.appendShadowLayersIfNeed(
        styleName: String,
        shadowLayers: List<ShadowTokenResult.ShadowLayer>,
    ): List<String>? = if (shadowLayers.size > 1) {
        shadowLayers.mapIndexed { index, shadowLayer ->
            appendShadowLayerStyle(
                styleName = styleName,
                parameters = shadowLayer,
                layerIndex = index,
            )
        }
    } else {
        null
    }

    private fun XmlResourcesDocumentBuilder.appendShadowLayerStyle(
        styleName: String,
        parameters: ShadowTokenResult.ShadowLayer,
        layerIndex: Int,
    ): String {
        if (needDeclareLayerStyle) {
            needDeclareLayerStyle = false
            appendStyleWithCompositePrefix(BASE_LAYER_STYLE)
        }

        val layerStyleName = "$BASE_LAYER_STYLE.${styleName}Layer${layerIndex + 1}"
        appendStyleWithCompositePrefix(layerStyleName) {
            appendShadowLayerParams(parameters, this)
        }
        return resourceReferenceProvider.style(layerStyleName)
    }

    private fun XmlResourcesDocumentBuilder.appendShadowLayerParams(
        layer: ShadowTokenResult.ShadowLayer,
        destination: Element,
    ) = with(destination) {
        appendElement(
            elementName = ElementName.ITEM,
            tokenName = "sd_shadowColor",
            value = layer.colorRef,
            usePrefix = false,
        )
        appendElement(
            elementName = ElementName.ITEM,
            tokenName = "sd_shadowOffsetX",
            value = layer.offsetXRef,
            usePrefix = false,
        )
        appendElement(
            elementName = ElementName.ITEM,
            tokenName = "sd_shadowOffsetY",
            value = layer.offsetYRef,
            usePrefix = false,
        )
        appendElement(
            elementName = ElementName.ITEM,
            tokenName = "sd_shadowSpreadRadius",
            value = layer.spreadRef,
            usePrefix = false,
        )
        appendElement(
            elementName = ElementName.ITEM,
            tokenName = "sd_shadowBlurRadius",
            value = layer.blurRef,
            usePrefix = false,
        )
    }

    private companion object {
        const val BASE_STYLE = "Shadow"
        const val BASE_LAYER_STYLE = "ShadowLayer"
    }
}
