package com.sdds.plugin.themebuilder.internal.components.list.item.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.camelCaseValue
import com.sdds.plugin.themebuilder.internal.components.list.item.ListItemProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class ListItemStyleGeneratorView(
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
) : ViewVariationGenerator<ListItemProperties>(
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
        variationNode: VariationNode<ListItemProperties>,
    ) = with(styleElement) {
        addProps(variation, variationNode)
        ListItemDimensionProperties.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        ListItemTypographyProperties.values().forEach {
            addTypographyProperty(it, variation, variationNode)
        }
        ListItemColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    override fun onCreateOverlayStyle(
        variation: String,
        rootDocument: XmlResourcesDocumentBuilder,
        styleElement: Element,
        variationNode: VariationNode<ListItemProperties>,
    ) {
        super.onCreateOverlayStyle(variation, rootDocument, styleElement, variationNode)
        styleElement.addListContentStyleAttribute(variationNode)
    }

    private fun Element.addProps(variation: String, variationNode: VariationNode<ListItemProperties>) {
        val props = variationNode.value.props

        props.shape?.let { shapeAttribute(variation, it.value, it.adjustment) }
        props.disclosureIcon?.let { iconAttribute("sd_disclosureIcon", it.value) }
        props.counterStyle?.let {
            iconAttribute("sd_disclosureIcon", it.value)
        }
    }

    private fun Element.addListContentStyleAttribute(variationNode: VariationNode<ListItemProperties>) {
        val props = variationNode.value.props
        props.counterStyle?.let { componentStyleAttribute("sd_counterStyle", it.camelCaseValue(".")) }
    }

    internal enum class ListItemColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<ListItemProperties> {
        BACKGROUND_COLOR("sd_background", "bg_color"),
        TITLE_COLOR("sd_titleColor", "text_color"),
        SUBTITLE_COLOR("sd_subtitleColor", "subtitle_color"),
        LABEL_COLOR("sd_labelColor", "label_color"),
        DISCLOSURE_ICON_COLOR("sd_disclosureColor", "disclosure_icon_color"),
        ;

        override fun provide(owner: ListItemProperties): Color? {
            return when (this) {
                BACKGROUND_COLOR -> owner.backgroundColor
                TITLE_COLOR -> owner.titleColor
                DISCLOSURE_ICON_COLOR -> owner.disclosureIconColor
                SUBTITLE_COLOR -> owner.subtitleColor
                LABEL_COLOR -> owner.labelColor
            }
        }
    }

    internal enum class ListItemDimensionProperties(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<ListItemProperties, Float, Dimension> {
        CONTENT_END_PADDING("sd_contentEndPadding", "content_end_padding"),
        CONTENT_START_PADDING("sd_contentStartPadding", "content_start_padding"),
        PADDING_START("android:paddingStart", "padding_start"),
        PADDING_END("android:paddingEnd", "padding_end"),
        PADDING_TOP("android:paddingTop", "padding_top"),
        PADDING_BOTTOM("android:paddingBottom", "padding_bottom"),
        HEIGHT("android:minHeight", "min_height"),
        ;

        override fun provide(owner: ListItemProperties): Dimension? {
            return when (this) {
                CONTENT_END_PADDING -> owner.contentPaddingEnd
                CONTENT_START_PADDING -> owner.contentPaddingStart
                PADDING_START -> owner.paddingStart
                PADDING_END -> owner.paddingEnd
                PADDING_TOP -> owner.paddingTop
                PADDING_BOTTOM -> owner.paddingBottom
                HEIGHT -> owner.height
            }?.copy(states = emptyList())
        }
    }

    internal enum class ListItemTypographyProperties(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<ListItemProperties, String, Typography> {
        TITLE_APPEARANCE("sd_titleAppearance", "title_appearance"),
        LABEL_APPEARANCE("sd_labelAppearance", "label_appearance"),
        SUBTITLE_APPEARANCE("sd_subtitleAppearance", "subtitle_appearance"),
        ;

        override fun provide(owner: ListItemProperties): Typography? {
            return when (this) {
                TITLE_APPEARANCE -> owner.titleStyle
                LABEL_APPEARANCE -> owner.labelStyle
                SUBTITLE_APPEARANCE -> owner.subtitleStyle
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "ListItemView"
        const val DEF_STYLE_ATTR = "sd_listItemViewStyle"
        const val COMPONENT_PARENT = "Sdds.Components.ListItem"
    }
}
