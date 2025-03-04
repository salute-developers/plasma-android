package com.sdds.plugin.themebuilder.internal.components.segment.item

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.counter.CounterProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class SegmentItemProperties(
    val shape: Shape? = null,

    val labelStyle: Typography? = null,
    val valueStyle: Typography? = null,

    val minHeight: Dimension? = null,
    val minWidth: Dimension? = null,
    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val startContentSize: Dimension? = null,
    val endContentSize: Dimension? = null,
    val startContentPadding: Dimension? = null,
    val endContentPadding: Dimension? = null,
    val valueMargin: Dimension? = null,

    val backgroundColor: Color? = null,
    val labelColor: Color? = null,
    val valueColor: Color? = null,
    val startContentColor: Color? = null,
    val endContentColor: Color? = null,

    val counterStyle: ComponentStyle<CounterProperties>? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? SegmentItemProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            labelStyle = labelStyle ?: otherProps.labelStyle,
            valueStyle = valueStyle ?: otherProps.valueStyle,
            minHeight = minHeight ?: otherProps.minHeight,
            minWidth = minWidth ?: otherProps.minWidth,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            startContentSize = startContentSize ?: otherProps.startContentSize,
            endContentSize = endContentSize ?: otherProps.endContentSize,
            startContentPadding = startContentPadding ?: otherProps.startContentPadding,
            endContentPadding = endContentPadding ?: otherProps.endContentPadding,
            valueMargin = valueMargin ?: otherProps.valueMargin,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            labelColor = labelColor ?: otherProps.labelColor,
            valueColor = valueColor ?: otherProps.valueColor,
            startContentColor = startContentColor ?: otherProps.startContentColor,
            endContentColor = endContentColor ?: otherProps.endContentColor,
            counterStyle = counterStyle ?: otherProps.counterStyle,
        )
    }
}

@Serializable
internal data class SegmentItemView(
    override val props: SegmentItemProperties = SegmentItemProperties(),
) : ViewVariation<SegmentItemProperties> {
    override fun merge(parent: ViewVariation<SegmentItemProperties>): ViewVariation<SegmentItemProperties> =
        copy(props = props.merge(parent.props) as SegmentItemProperties)
}

@Serializable
internal data class SegmentItemVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, SegmentItemView> = emptyMap(),
    override val props: SegmentItemProperties,
) : ChildVariation<SegmentItemProperties>

@Serializable
internal data class SegmentItemConfig(
    override val view: Map<String, SegmentItemView> = emptyMap(),
    override val props: SegmentItemProperties = SegmentItemProperties(),
    override val variations: List<SegmentItemVariation> = emptyList(),
) : Config<SegmentItemProperties>, ComponentConfig
