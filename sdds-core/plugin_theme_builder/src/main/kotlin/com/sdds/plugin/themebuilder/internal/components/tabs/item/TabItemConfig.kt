package com.sdds.plugin.themebuilder.internal.components.tabs.item

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.Icon
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.counter.CounterProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class TabItemProperties(
    val shape: Shape? = null,

    val labelStyle: Typography? = null,
    val valueStyle: Typography? = null,

    val minHeight: Dimension? = null,
    val minWidth: Dimension? = null,
    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val startContentSize: Dimension? = null,
    val endContentSize: Dimension? = null,
    val iconPadding: Dimension? = null,
    val counterPadding: Dimension? = null,
    val valuePadding: Dimension? = null,
    val actionPadding: Dimension? = null,
    val actionSize: Dimension? = null,
    val counterOffsetX: Dimension? = null,
    val counterOffsetY: Dimension? = null,

    val backgroundColor: Color? = null,
    val labelColor: Color? = null,
    val valueColor: Color? = null,
    val startContentColor: Color? = null,
    val endContentColor: Color? = null,
    val actionColor: Color? = null,

    val counterStyle: ComponentStyle<CounterProperties>? = null,
    val actionIcon: Icon? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? TabItemProperties ?: return this
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
            iconPadding = iconPadding ?: otherProps.iconPadding,
            counterPadding = counterPadding ?: otherProps.counterPadding,
            valuePadding = valuePadding ?: otherProps.valuePadding,
            actionSize = actionSize ?: otherProps.actionSize,
            counterOffsetX = counterOffsetX ?: otherProps.counterOffsetX,
            counterOffsetY = counterOffsetY ?: otherProps.counterOffsetY,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            labelColor = labelColor ?: otherProps.labelColor,
            valueColor = valueColor ?: otherProps.valueColor,
            startContentColor = startContentColor ?: otherProps.startContentColor,
            endContentColor = endContentColor ?: otherProps.endContentColor,
            counterStyle = counterStyle ?: otherProps.counterStyle,
            actionPadding = actionPadding ?: otherProps.actionPadding,
            actionIcon = actionIcon ?: otherProps.actionIcon,
        )
    }
}

@Serializable
internal data class TabItemView(
    override val props: TabItemProperties = TabItemProperties(),
) : ViewVariation<TabItemProperties> {
    override fun merge(parent: ViewVariation<TabItemProperties>): ViewVariation<TabItemProperties> =
        copy(props = props.merge(parent.props) as TabItemProperties)
}

@Serializable
internal data class TabItemVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, TabItemView> = emptyMap(),
    override val props: TabItemProperties,
) : ChildVariation<TabItemProperties>

@Serializable
internal data class TabItemConfig(
    override val view: Map<String, TabItemView> = emptyMap(),
    override val props: TabItemProperties = TabItemProperties(),
    override val variations: List<TabItemVariation> = emptyList(),
) : Config<TabItemProperties>, ComponentConfig
