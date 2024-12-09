package com.sdds.plugin.themebuilder.internal.components.button.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.button.ButtonComponentConfig
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import java.io.File

/**
 * Генератор стилей IconButton для xml
 */
internal class IconButtonStyleGeneratorView(
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    resourceReferenceProvider: ResourceReferenceProvider,
    dimensAggregator: DimensAggregator,
    outputResDir: File,
    attrPrefix: String,
    viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
) : BaseButtonStyleGeneratorView(
    xmlBuilderFactory = xmlBuilderFactory,
    resourceReferenceProvider = resourceReferenceProvider,
    dimensAggregator = dimensAggregator,
    outputResDir = outputResDir,
    resourcePrefix = attrPrefix,
    coreComponentName = CORE_COMPONENT_NAME,
    componentParent = COMPONENT_PARENT,
    viewColorStateGeneratorFactory = viewColorStateGeneratorFactory,
    colorStateListGeneratorFactory = colorStateListGeneratorFactory,
    defStyleAttr = DEF_STYLE_ATTR,
) {
    override fun onGenerate(
        xmlResourcesBuilder: XmlResourcesDocumentBuilder,
        config: ButtonComponentConfig,
    ) = with(xmlResourcesBuilder) {
        prepareColors(config)
        baseStyle()
        config.variations.size.forEach { (sizeVariation, size) ->
            addSize(sizeVariation, size)
            config.variations.color.forEach { (colorVariation, _) ->
                addColor(sizeVariation, colorVariation)
            }
            size.shape?.let {
                addPilledShapes(config, sizeVariation)
            }
        }
    }

    private fun XmlResourcesDocumentBuilder.addPilledShapes(
        config: ButtonComponentConfig,
        base: String,
    ) {
        addShape(base)
        config.variations.color.forEach { (colorVariation, _) ->
            addColor("$base.Pilled", colorVariation)
        }
    }

    private fun XmlResourcesDocumentBuilder.addSize(variation: String, sizeData: ButtonComponentConfig.Size) {
        variationStyle(variation) {
            dimenAttribute(variation, "android:minHeight", "min_height", sizeData.height)
            dimenAttribute(variation, "android:minWidth", "min_width", sizeData.minWidth)
            dimenAttribute(variation, "android:paddingStart", "padding_start", sizeData.paddingStart)
            dimenAttribute(variation, "android:paddingEnd", "padding_end", sizeData.paddingEnd)
            dimenAttribute(variation, "sd_iconSize", "icon_size", sizeData.iconSize)
            dimenAttribute(variation, "sd_spinnerSize", "spinner_size", sizeData.spinnerSize)
            sizeData.shape?.let { shapeAttribute(variation, it.name, it.adjustment) }
        }
    }

    private fun XmlResourcesDocumentBuilder.addShape(baseVariation: String) {
        variationStyle("$baseVariation.Pilled") {
            circleShapeAttribute()
        }
    }

    private fun prepareColors(config: ButtonComponentConfig) {
        val colorVariations = config.variations.color

        colorVariations.forEach { (variation, colorScheme) ->
            val colorState = registerColorState(variation)

            val loadingAlpha = colorScheme.loadingAlpha ?: config.invariant?.loadingAlpha
            colorScheme.backgroundColor.addToStateList(ButtonColorProperty.BACKGROUND_COLOR, colorState)
            colorScheme.contentColor.addToStateList(ButtonColorProperty.SPINNER_COLOR, colorState)
            colorScheme.contentColor.addToStateList(ButtonColorProperty.ICON_COLOR, colorState, loadingAlpha)
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "IconButton"
        const val DEF_STYLE_ATTR = "sd_iconButtonStyle"
        const val COMPONENT_PARENT = "Sdds.Components.IconButton"
    }
}
