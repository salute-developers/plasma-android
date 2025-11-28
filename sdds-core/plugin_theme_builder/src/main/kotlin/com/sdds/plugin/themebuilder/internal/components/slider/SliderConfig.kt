package com.sdds.plugin.themebuilder.internal.components.slider

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.Value
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.tooltip.TooltipProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class SliderProperties(
    val thumbShape: Shape? = null,
    val trackShape: Shape? = null,
    val indicatorShape: Shape? = null,

    val trackThickness: Dimension? = null,
    val indicatorThickness: Dimension? = null,
    val thumbSize: Dimension? = null,
    val thumbStrokeWidth: Dimension? = null,
    val iconSize: Dimension? = null,
    val labelMargin: Dimension? = null,
    val limitLabelMargin: Dimension? = null,
    val titleMargin: Dimension? = null,

    val thumbColor: Color? = null,
    val thumbStrokeColor: Color? = null,
    val trackColor: Color? = null,
    val indicatorColor: Color? = null,
    val iconColor: Color? = null,
    val titleColor: Color? = null,
    val limitLabelColor: Color? = null,

    val titleStyle: Typography? = null,
    val limitLabelStyle: Typography? = null,

    val orientation: Value? = null,
    val labelAlignment: Value? = null,
    val textAlignment: Value? = null,
    val slideDirection: Value? = null,
    val valuePlacement: Value? = null,
    val limitLabelAlignment: Value? = null,
    val alignment: Value? = null,

    val tooltipStyle: ComponentStyle<TooltipProperties>? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? SliderProperties ?: return this
        return copy(
            trackShape = trackShape ?: otherProps.trackShape,
            thumbShape = thumbShape ?: otherProps.thumbShape,
            indicatorShape = indicatorShape ?: otherProps.indicatorShape,
            trackThickness = trackThickness ?: otherProps.trackThickness,
            indicatorThickness = indicatorThickness ?: otherProps.indicatorThickness,
            thumbSize = thumbSize ?: otherProps.thumbSize,
            thumbStrokeWidth = thumbStrokeWidth ?: otherProps.thumbStrokeWidth,
            iconSize = iconSize ?: otherProps.iconSize,
            labelMargin = labelMargin ?: otherProps.labelMargin,
            limitLabelMargin = limitLabelMargin ?: otherProps.limitLabelMargin,
            titleMargin = titleMargin ?: otherProps.titleMargin,
            thumbColor = thumbColor ?: otherProps.thumbColor,
            thumbStrokeColor = thumbStrokeColor ?: otherProps.thumbStrokeColor,
            trackColor = trackColor ?: otherProps.trackColor,
            indicatorColor = indicatorColor ?: otherProps.indicatorColor,
            iconColor = iconColor ?: otherProps.iconColor,
            titleColor = titleColor ?: otherProps.titleColor,
            limitLabelColor = limitLabelColor ?: otherProps.limitLabelColor,
            titleStyle = titleStyle ?: otherProps.titleStyle,
            limitLabelStyle = limitLabelStyle ?: otherProps.limitLabelStyle,
            orientation = orientation ?: otherProps.orientation,
            labelAlignment = labelAlignment ?: otherProps.labelAlignment,
            textAlignment = textAlignment ?: otherProps.textAlignment,
            slideDirection = slideDirection ?: otherProps.slideDirection,
            valuePlacement = valuePlacement ?: otherProps.valuePlacement,
            limitLabelAlignment = limitLabelAlignment ?: otherProps.limitLabelAlignment,
            alignment = alignment ?: otherProps.alignment,
            tooltipStyle = tooltipStyle ?: otherProps.tooltipStyle,
        )
    }
}

@Serializable
internal data class SliderView(
    override val props: SliderProperties,
) : ViewVariation<SliderProperties> {
    override fun merge(parent: ViewVariation<SliderProperties>): ViewVariation<SliderProperties> =
        copy(props = props.merge(parent.props) as SliderProperties)
}

@Serializable
internal data class SliderVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, SliderView> = emptyMap(),
    override val props: SliderProperties,
) : ChildVariation<SliderProperties>

@Serializable
internal data class SliderConfig(
    override val view: Map<String, SliderView> = emptyMap(),
    override val props: SliderProperties,
    override val variations: List<SliderVariation> = emptyList(),
) : Config<SliderProperties>, ComponentConfig
