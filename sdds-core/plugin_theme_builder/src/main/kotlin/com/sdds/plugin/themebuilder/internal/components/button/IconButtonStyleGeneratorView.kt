package com.sdds.plugin.themebuilder.internal.components.button

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.ViewComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.iconButtonXmlFile
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
) : ViewComponentStyleGenerator<ButtonComponentConfig>(
    xmlBuilderFactory = xmlBuilderFactory,
    resourceReferenceProvider = resourceReferenceProvider,
    dimensAggregator = dimensAggregator,
    outputResDir = outputResDir.iconButtonXmlFile(),
    attrPrefix = attrPrefix,
    componentName = COMPONENT_NAME,
    componentParent = COMPONENT_PARENT,
) {
    override fun onGenerate(
        xmlResourcesBuilder: XmlResourcesDocumentBuilder,
        config: ButtonComponentConfig,
    ) = with(xmlResourcesBuilder) {
        baseStyle()
        addSizes(config)
    }

    private fun XmlResourcesDocumentBuilder.addSizes(config: ButtonComponentConfig) {
        val sizeVariations = config.variations.size

        sizeVariations.forEach { (size, sizeData) ->
            variationStyle(size) {
                dimenAttribute(size, "android:minHeight", "min_height", sizeData.height)
                dimenAttribute(size, "android:minWidth", "min_width", sizeData.minWidth)
                dimenAttribute(size, "android:paddingStart", "padding_start", sizeData.paddingStart)
                dimenAttribute(size, "android:paddingEnd", "padding_end", sizeData.paddingEnd)
                dimenAttribute(size, "sd_iconSize", "icon_size", sizeData.iconSize)
                dimenAttribute(size, "sd_spinnerSize", "spinner_size", sizeData.spinnerSize)
                sizeData.shape?.let { shapeAttribute(size, it) }
            }

            sizeData.shape?.let {
                variationStyle("$size.Pilled") {
                    circleShapeAttribute()
                }
            }
        }
    }

    private companion object {
        const val COMPONENT_NAME = "IconButton"
        const val COMPONENT_PARENT = "Sdds.Components.Button"
    }
}
