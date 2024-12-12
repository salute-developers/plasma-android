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
 * Генератор стилей BasicButton для xml
 */
internal class BasicButtonStyleGeneratorView(
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    resourceReferenceProvider: ResourceReferenceProvider,
    dimensAggregator: DimensAggregator,
    outputResDir: File,
    resourcePrefix: String,
    viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
) : BaseButtonStyleGeneratorView(
    xmlBuilderFactory = xmlBuilderFactory,
    resourceReferenceProvider = resourceReferenceProvider,
    dimensAggregator = dimensAggregator,
    outputResDir = outputResDir,
    resourcePrefix = resourcePrefix,
    coreComponentName = CORE_COMPONENT_NAME,
    styleComponentName = STYLE_COMPONENT_NAME,
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
            sizeData.iconMargin?.let {
                dimenAttribute(variation, "sd_iconPadding", "icon_padding", it)
            }
            sizeData.valueMargin?.let {
                dimenAttribute(variation, "sd_valuePadding", "value_padding", it)
            }
            sizeData.shape?.let { shapeAttribute(variation, it.name, it.adjustment) }
            sizeData.labelStyle?.let { typographyAttribute("android:textAppearance", it) }
        }
    }

    private fun prepareColors(config: ButtonComponentConfig) {
        val colorVariations = config.variations.color

        colorVariations.forEach { (variation, colorScheme) ->
            val colorState = registerColorState(variation)

            val loadingAlpha = colorScheme.loadingAlpha
            colorScheme.backgroundColor.addToStateList(ButtonColorProperty.BACKGROUND_COLOR, colorState)
            colorScheme.valueColor.addToStateList(ButtonColorProperty.VALUE_COLOR, colorState, loadingAlpha)
            colorScheme.contentColor.addToStateList(ButtonColorProperty.TEXT_COLOR, colorState, loadingAlpha)
            colorScheme.contentColor.addToStateList(ButtonColorProperty.SPINNER_COLOR, colorState)
            colorScheme.contentColor.addToStateList(ButtonColorProperty.ICON_COLOR, colorState, loadingAlpha)
        }
    }

    private companion object {
        const val STYLE_COMPONENT_NAME = "BasicButton"
        const val CORE_COMPONENT_NAME = "Button"
        const val DEF_STYLE_ATTR = "android:buttonStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Button"
    }
}
