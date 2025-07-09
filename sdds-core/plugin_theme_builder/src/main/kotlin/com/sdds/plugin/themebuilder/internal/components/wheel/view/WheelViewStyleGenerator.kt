package com.sdds.plugin.themebuilder.internal.components.wheel.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.wheel.WheelProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

/**
 * Базовый генератор view стилей для компонента Wheel
 */
internal open class WheelViewStyleGenerator(
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    resourceReferenceProvider: ResourceReferenceProvider,
    dimensAggregator: DimensAggregator,
    outputResDir: File,
    resourcePrefix: String,
    styleComponentName: String,
    coreComponentName: String = CORE_COMPONENT_NAME,
    componentParent: String = COMPONENT_PARENT,
    viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
    defStyleAttr: String = DEF_STYLE_ATTR,
) : ViewVariationGenerator<WheelProperties>(
    xmlBuilderFactory = xmlBuilderFactory,
    resourceReferenceProvider = resourceReferenceProvider,
    dimensAggregator = dimensAggregator,
    outputResDir = outputResDir,
    resourcePrefix = resourcePrefix,
    styleComponentName = styleComponentName,
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
        variationNode: VariationNode<WheelProperties>,
    ) = with(styleElement) {
        addProps(variation, variationNode)
        WheelDimensionsProperty.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        WheelColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(variation: String, variationNode: VariationNode<WheelProperties>) {
        val props = variationNode.value.props

        props.itemTextStyle?.let { typographyAttribute("sd_itemTextAppearance", it.value) }
        props.itemTextAfterStyle?.let { typographyAttribute("sd_itemTextAfterAppearance", it.value) }
        props.descriptionStyle?.let { typographyAttribute("sd_descriptionTextAppearance", it.value) }

        props.itemAlignment?.let { valueAttribute("sd_itemAlignment", it.value) }
        props.wheelCount?.let { valueAttribute("sd_wheelCount", it.value) }
        props.visibleItemsCount?.let { valueAttribute("sd_visibleItemsCount", it.value) }

        props.controlIconUp?.let { iconAttribute("sd_controlIconUp", it.value) }
        props.controlIconDown?.let { iconAttribute("sd_controlIconDown", it.value) }
    }

    internal enum class WheelDimensionsProperty(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<WheelProperties, Float, Dimension> {
        ITEM_TEXT_AFTER_PADDING("sd_itemTextAfterPadding", "text_after_padding"),
        DESCRIPTION_PADDING("sd_descriptionPadding", "description_padding"),
        SEPARATOR_SPACING("sd_separatorSpacing", "separator_spacing"),
        ITEM_MIN_SPACING("sd_itemMinSpacing", "item_min_spacing"),
        ;

        override fun provide(owner: WheelProperties): Dimension? {
            return when (this) {
                ITEM_TEXT_AFTER_PADDING -> owner.itemTextAfterPadding
                DESCRIPTION_PADDING -> owner.descriptionPadding
                SEPARATOR_SPACING -> owner.separatorSpacing
                ITEM_MIN_SPACING -> owner.itemMinSpacing
            }
        }
    }

    internal enum class WheelColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<WheelProperties> {
        ITEM_TEXT_COLOR("sd_itemTextColor", "item_text_color"),
        ITEM_TEXT_AFTER_COLOR("sd_itemTextAfterColor", "item_text_after_color"),
        DESCRIPTION_COLOR("sd_descriptionTextColor", "description_color"),
        CONTROL_UP_COLOR("sd_controlIconUpTint", "control_up_color"),
        CONTROL_DOWN_COLOR("sd_controlIconDownTint", "control_down_color"),
        SEPARATOR_COLOR("sd_separatorColor", "separator_color"),
        ;

        override fun provide(owner: WheelProperties): Color? {
            return when (this) {
                ITEM_TEXT_COLOR -> owner.itemTextColor
                ITEM_TEXT_AFTER_COLOR -> owner.itemTextAfterColor
                DESCRIPTION_COLOR -> owner.descriptionColor
                CONTROL_UP_COLOR -> owner.controlIconUpColor
                CONTROL_DOWN_COLOR -> owner.controlIconDownColor
                SEPARATOR_COLOR -> owner.separatorColor
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "Wheel"
        const val DEF_STYLE_ATTR = "sd_wheelStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Wheel"
    }
}
