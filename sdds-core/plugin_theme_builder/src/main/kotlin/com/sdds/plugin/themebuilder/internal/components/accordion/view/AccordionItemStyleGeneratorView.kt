package com.sdds.plugin.themebuilder.internal.components.accordion.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.accordion.AccordionItemProperties
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class AccordionItemStyleGeneratorView(
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
) : ViewVariationGenerator<AccordionItemProperties>(
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
        variationNode: VariationNode<AccordionItemProperties>,
    ) = with(styleElement) {
        addProps(variation, variationNode)
        AccordionItemDimensionProperties.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        AccordionItemColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(variation: String, variationNode: VariationNode<AccordionItemProperties>) {
        val props = variationNode.value.props

        props.shape?.let { shapeAttribute(variation, it.value, it.adjustment) }
        props.titleStyle?.let { typographyAttribute("sd_titleAppearance", it.value) }
        props.contentTextStyle?.let { typographyAttribute("sd_contentTextAppearance", it.value) }
        props.closedIcon?.let { iconAttribute("sd_closedIcon", it.value) }
        props.openedIcon?.let { iconAttribute("sd_openedIcon", it.value) }
        props.iconPlacement?.let { valueAttribute("sd_iconPlacement", it.value) }
    }

    internal enum class AccordionItemColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<AccordionItemProperties> {
        BACKGROUND_COLOR("sd_background", "bg_color"),
        TITLE_COLOR("sd_titleColor", "text_color"),
        CONTENT_TEXT_COLOR("sd_contentTextColor", "content_text_color"),
        ICON_COLOR("sd_iconColor", "icon_color"),
        ;

        override fun provide(owner: AccordionItemProperties): Color? {
            return when (this) {
                BACKGROUND_COLOR -> owner.backgroundColor
                TITLE_COLOR -> owner.titleColor
                CONTENT_TEXT_COLOR -> owner.contentTextColor
                ICON_COLOR -> owner.iconColor
            }
        }
    }

    internal enum class AccordionItemDimensionProperties(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<AccordionItemProperties, Float, Dimension> {
        CONTENT_PADDING_END("sd_contentPaddingEnd", "content_end_padding"),
        CONTENT_PADDING_START("sd_contentPaddingStart", "content_start_padding"),
        CONTENT_PADDING_TOP("sd_contentPaddingTop", "content_top_padding"),
        CONTENT_PADDING_BOTTOM("sd_contentPaddingBottom", "content_bottom_padding"),
        PADDING_START("sd_headerPaddingStart", "header_padding_start"),
        PADDING_END("sd_headerPaddingEnd", "header_padding_end"),
        PADDING_TOP("sd_headerPaddingTop", "header_padding_top"),
        PADDING_BOTTOM("sd_headerPaddingBottom", "header_padding_bottom"),
        ICON_PADDING("sd_iconPadding", "icon_padding"),
        ;

        override fun provide(owner: AccordionItemProperties): Dimension? {
            return when (this) {
                CONTENT_PADDING_END -> owner.contentPaddingEnd
                CONTENT_PADDING_START -> owner.contentPaddingStart
                CONTENT_PADDING_TOP -> owner.contentPaddingTop
                CONTENT_PADDING_BOTTOM -> owner.contentPaddingBottom
                PADDING_START -> owner.paddingStart
                PADDING_END -> owner.paddingEnd
                PADDING_TOP -> owner.paddingTop
                PADDING_BOTTOM -> owner.paddingBottom
                ICON_PADDING -> owner.iconPadding
            }?.copy(states = emptyList())
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "AccordionItemView"
        const val DEF_STYLE_ATTR = "sd_accordionItemViewStyle"
        const val COMPONENT_PARENT = "Sdds.Components.AccordionItem"
    }
}
