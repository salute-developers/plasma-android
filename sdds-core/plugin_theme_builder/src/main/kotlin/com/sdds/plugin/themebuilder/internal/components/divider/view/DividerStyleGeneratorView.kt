package com.sdds.plugin.themebuilder.internal.components.divider.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ColorValue
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.isNullOrInherited
import com.sdds.plugin.themebuilder.internal.components.divider.DividerProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

/**
 * Базовый генератор view стилей для компонента Divider
 */
internal open class DividerStyleGeneratorView(
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    resourceReferenceProvider: ResourceReferenceProvider,
    dimensAggregator: DimensAggregator,
    outputResDir: File,
    resourcePrefix: String,
    coreComponentName: String = CORE_COMPONENT_NAME,
    componentParent: String = COMPONENT_PARENT,
    viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
    defStyleAttr: String = DEF_STYLE_ATTR,
) : ViewVariationGenerator<DividerProperties>(
    xmlBuilderFactory = xmlBuilderFactory,
    resourceReferenceProvider = resourceReferenceProvider,
    dimensAggregator = dimensAggregator,
    outputResDir = outputResDir,
    resourcePrefix = resourcePrefix,
    coreComponentName = coreComponentName,
    componentParent = componentParent,
    viewColorStateGeneratorFactory = viewColorStateGeneratorFactory,
    colorStateListGeneratorFactory = colorStateListGeneratorFactory,
    defStyleAttr = defStyleAttr,
) {
    override fun onCreateStyle(
        variation: String,
        rootDocument: XmlResourcesDocumentBuilder,
        styleElement: Element,
        variationNode: VariationNode<DividerProperties>,
    ) = with(styleElement) {
        addProps(variation, variationNode)
        DividerColorProperty.values().forEach {
            addColorProperties(it, variation, variationNode)
        }
    }

    private fun Element.addProps(variation: String, variationNode: VariationNode<DividerProperties>) {
        val props = variationNode.value.props

        props.thickness?.let { dimenAttribute(variation, "sd_thickness", "thickness", it.value) }
        props.shape?.let { shapeAttribute(variation, it.value, it.adjustment) }
    }

    private fun Element.addColorProperties(
        colorProperty: DividerColorProperty,
        variation: String,
        variationNode: VariationNode<DividerProperties>,
    ) {
        val colorValue = getColorProperty(colorProperty, variationNode)
        if (colorValue.isNullOrInherited) {
            return
        }

        when (colorValue) {
            is ColorValue.SimpleValue -> addToStateList(colorProperty, colorValue.color, variation)
            is ColorValue.ViewValue -> colorValue.colors.forEach { (colorStateName, color) ->
                addToStateList(colorProperty, color, variation, colorStateName)
            }
            else -> Unit
        }

        colorAttribute(colorProperty, variation)
    }

    internal enum class DividerColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<DividerProperties> {
        BACKGROUND_COLOR("backgroundTint", "bg_color"),
        ;

        override fun provide(owner: DividerProperties): Color? {
            return when (this) {
                BACKGROUND_COLOR -> owner.backgroundColor
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "Divider"
        const val DEF_STYLE_ATTR = "sd_dividerStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Divider"
    }
}
