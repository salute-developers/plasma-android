package com.sdds.plugin.themebuilder.internal.components.base.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Variation
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

/**
 *
 * @author Малышев Александр on 10.12.2024
 */
internal abstract class ViewVariationGenerator<PO : PropertyOwner>(
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    resourceReferenceProvider: ResourceReferenceProvider,
    dimensAggregator: DimensAggregator,
    outputResDir: File,
    resourcePrefix: String,
    coreComponentName: String,
    private val styleComponentName: String = coreComponentName,
    componentParent: String,
    viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
    defStyleAttr: String,
) : ViewComponentStyleGenerator<Config<PO>>(
    xmlBuilderFactory = xmlBuilderFactory,
    resourceReferenceProvider = resourceReferenceProvider,
    dimensAggregator = dimensAggregator,
    outputResDir = outputResDir,
    resourcePrefix = resourcePrefix,
    coreComponentName = coreComponentName,
    styleComponentName = styleComponentName,
    componentParent = componentParent,
    viewColorStateGeneratorFactory = viewColorStateGeneratorFactory,
    colorStateListGeneratorFactory = colorStateListGeneratorFactory,
    defStyleAttr = defStyleAttr,
) {
    override fun onGenerate(
        xmlResourcesBuilder: XmlResourcesDocumentBuilder,
        config: Config<PO>,
    ): Unit = with(xmlResourcesBuilder) {
        // 1. add views with config.views
        registerViewVariations(config.view)
        // 2. populate props
        baseStyle {
            onCreateStyle(styleComponentName,this, config.props)
        }

        // 3. create variations
        createVariations(styleComponentName, config.variations)
    }

    protected abstract fun onCreateStyle(variation: String, styleElement: Element, props: PO)

    protected abstract fun onCreateColorState(props: PO, colorStateAttribute: ColorStateAttribute)

    protected abstract fun onOverrideColorState(variationName: String, props: PO, colorStateAttribute: ColorStateAttribute)

    private fun  XmlResourcesDocumentBuilder.createVariations(
        parentName: String,
        variations: Map<String, Variation<PO>>,
    ) {
        if (variations.isEmpty()) return
        variations.forEach { (variationName, variation) ->
            overrideViewVariations(variationName, variation.view)
            val fullVariationName = "$parentName.$variationName"
            variationStyle(fullVariationName) {
                onCreateStyle(fullVariationName, this, variation.props)
            }
        }
        variations.forEach { (variationName, variation) ->
            createVariations(variationName, variation.variations)
        }
    }

    private fun registerViewVariations(views: Map<String, Variation<PO>>) {
        views.forEach { (colorState, variation) ->
            val colorStateAttr = registerColorState(colorState)
            onCreateColorState(variation.props, colorStateAttr)
        }
    }

    private fun overrideViewVariations(variationName: String, views: Map<String, Variation<PO>>) {
        views.forEach { (colorState, variation) ->
            val colorStateAttr = getColorState(colorState)
            if (colorStateAttr != null) {
                onOverrideColorState(variationName, variation.props, colorStateAttr)
            }
        }
    }

}