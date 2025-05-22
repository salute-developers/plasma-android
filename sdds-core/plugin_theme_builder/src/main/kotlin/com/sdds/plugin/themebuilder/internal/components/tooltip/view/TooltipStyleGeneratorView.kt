package com.sdds.plugin.themebuilder.internal.components.tooltip.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.tooltip.TooltipProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class TooltipStyleGeneratorView(
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
) : ViewVariationGenerator<TooltipProperties>(
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
        variationNode: VariationNode<TooltipProperties>,
    ) = with(styleElement) {
        addProps(variation, variationNode)
        TooltipDimensionProperties.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        TooltipColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(variation: String, variationNode: VariationNode<TooltipProperties>) {
        val props = variationNode.value.props

        props.shape?.let { shapeAttribute(variation, it.value, it.adjustment) }
        props.shadow?.let { shadowAttribute(it.value) }
        props.textStyle?.let { typographyAttribute("android:textAppearance", it.value) }
    }

    internal enum class TooltipColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<TooltipProperties> {
        BACKGROUND_COLOR("sd_background", "bg_color"),
        TEXT_COLOR("sd_textColor", "text_color"),
        CONTENT_START_COLOR("sd_contentStartTint", "content_start_color"),
        ;

        override fun provide(owner: TooltipProperties): Color? {
            return when (this) {
                BACKGROUND_COLOR -> owner.backgroundColor
                TEXT_COLOR -> owner.textColor
                CONTENT_START_COLOR -> owner.contentStartColor
            }
        }
    }

    internal enum class TooltipDimensionProperties(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<TooltipProperties, Float, Dimension> {
        CONTENT_START_SIZE("sd_contentStartSize", "content_start_size"),
        CONTENT_START_PADDING("sd_contentStartPadding", "content_start_padding"),
        PADDING_START("android:paddingStart", "padding_start"),
        PADDING_END("android:paddingEnd", "padding_end"),
        PADDING_TOP("android:paddingTop", "padding_top"),
        PADDING_BOTTOM("android:paddingBottom", "padding_bottom"),
        OFFSET("sd_offset", "offset"),
        TAIL_WIDTH("sd_shapeTailWidth", "tail_width"),
        TAIL_HEIGHT("sd_shapeTailHeight", "tail_height"),
        TAIL_OFFSET("sd_shapeTailOffset", "tail_offset"),
        ;

        override fun provide(owner: TooltipProperties): Dimension? {
            return when (this) {
                OFFSET -> owner.offset
                TAIL_WIDTH -> owner.tailWidth
                TAIL_HEIGHT -> owner.tailHeight
                TAIL_OFFSET -> owner.tailPadding
                CONTENT_START_SIZE -> owner.contentStartSize
                CONTENT_START_PADDING -> owner.contentStartPadding
                PADDING_START -> owner.paddingStart
                PADDING_END -> owner.paddingEnd
                PADDING_TOP -> owner.paddingTop
                PADDING_BOTTOM -> owner.paddingBottom
            }?.copy(states = emptyList())
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "Tooltip"
        const val DEF_STYLE_ATTR = "sd_tooltipStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Tooltip"
    }
}
