package com.sdds.plugin.themebuilder.internal.components.slider.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.camelCaseValue
import com.sdds.plugin.themebuilder.internal.components.slider.SliderProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class SliderStyleGeneratorView(
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
) : ViewVariationGenerator<SliderProperties>(
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
        variationNode: VariationNode<SliderProperties>,
        props: SliderProperties,
    ) = with(styleElement) {
        SliderDimensionsProperty.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        addProps(variation, props)
        SliderColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(variation: String, props: SliderProperties) {
        props.thumbShape?.let { shapeAttribute(variation, it.value, attrName = "thumb") }
        props.indicatorShape?.let { shapeAttribute(variation, it.value, attrName = "indicator") }
        props.trackShape?.let { shapeAttribute(variation, it.value) }
        props.titleStyle?.let { typographyAttribute("sd_titleAppearance", it.value) }
        props.limitLabelStyle?.let { typographyAttribute("sd_limitLabelAppearance", it.value) }
        props.tooltipStyle?.let {
            componentOverlayAttribute("sd_tooltipStyleOverlay", it.camelCaseValue(""))
        }
        props.orientation?.let { valueAttribute("android:orientation", it.value.asOrientation()) }
        props.labelAlignment?.let { valueAttribute("sd_labelAlignment", it.value.asLabelAlignment()) }
        props.textAlignment?.let { valueAttribute("sd_titleAlignment", it.value.asTitleAlignment()) }
        props.slideDirection?.let { valueAttribute("sd_slideDirection", it.value.asSlideDirection()) }
        props.valuePlacement?.let { valueAttribute("sd_valuePlacement", it.value.asValuePlacement()) }
        props.limitLabelAlignment?.let { valueAttribute("sd_limitLabelAlignment", it.value.asLimitLabelAlignment()) }
        props.alignment?.let { valueAttribute("sd_alignment", it.value.asAlignment()) }
    }

    private enum class SliderDimensionsProperty(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<SliderProperties, Float, Dimension> {
        TRACK_THICKNESS("sd_trackThickness", "track_thickness"),
        INDICATOR_THICKNESS("sd_indicatorThickness", "indicator_thickness"),
        THUMB_SIZE("sd_thumbSize", "thumb_size"),
        THUMB_STROKE_WIDTH("sd_strokeWidth", "stroke_width"),
        ICON_SIZE("sd_iconSize", "icon_size"),
        LABEL_MARGIN("sd_labelMargin", "label_margin"),
        LIMIT_LABEL_MARGIN("sd_limitLabelMargin", "limit_label_margin"),
        TITLE_MARGIN("sd_titleMargin", "title_margin"),
        ;

        override fun provide(owner: SliderProperties): Dimension? {
            return when (this) {
                TRACK_THICKNESS -> owner.trackThickness
                INDICATOR_THICKNESS -> owner.indicatorThickness
                THUMB_SIZE -> owner.thumbSize
                THUMB_STROKE_WIDTH -> owner.thumbStrokeWidth
                ICON_SIZE -> owner.iconSize
                LABEL_MARGIN -> owner.labelMargin
                LIMIT_LABEL_MARGIN -> owner.limitLabelMargin
                TITLE_MARGIN -> owner.titleMargin
            }
        }
    }

    private enum class SliderColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<SliderProperties> {
        THUMB_COLOR("sd_thumbColor", "thumb_color"),
        THUMB_STROKE_COLOR("sd_strokeColor", "stroke_color"),
        TRACK_COLOR("sd_trackColor", "track_color"),
        INDICATOR_COLOR("sd_indicatorColor", "indicator_color"),
        ICON_COLOR("sd_iconTint", "icon_tint"),
        TITLE_COLOR("sd_titleColor", "title_color"),
        LIMIT_LABEL_COLOR("sd_limitLabelColor", "limit_label_color"),
        ;

        override fun provide(owner: SliderProperties): Color? {
            return when (this) {
                THUMB_COLOR -> owner.thumbColor
                TRACK_COLOR -> owner.trackColor
                INDICATOR_COLOR -> owner.indicatorColor
                THUMB_STROKE_COLOR -> owner.thumbStrokeColor
                ICON_COLOR -> owner.iconColor
                TITLE_COLOR -> owner.titleColor
                LIMIT_LABEL_COLOR -> owner.limitLabelColor
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "Slider"
        const val DEF_STYLE_ATTR = "sd_sliderStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Slider"

        fun String.asOrientation(): String {
            return when (this) {
                "horizontal" -> "horizontal"
                else -> "vertical"
            }
        }

        fun String.asLabelAlignment(): String {
            return when (this) {
                "top" -> "top"
                "center" -> "center"
                else -> "bottom"
            }
        }

        fun String.asTitleAlignment(): String {
            return when (this) {
                "start" -> "start"
                "end" -> "end"
                else -> "none"
            }
        }

        fun String.asSlideDirection(): String {
            return when (this) {
                "reversed" -> "reversed"
                else -> "normal"
            }
        }

        fun String.asValuePlacement(): String {
            return when (this) {
                "start" -> "start"
                "top" -> "top"
                "end" -> "end"
                else -> "bottom"
            }
        }

        fun String.asLimitLabelAlignment(): String {
            return when (this) {
                "start" -> "start"
                "end" -> "end"
                else -> "center"
            }
        }

        fun String.asAlignment(): String {
            return when (this) {
                "start" -> "start"
                "end" -> "end"
                else -> "center"
            }
        }
    }
}
