package com.sdds.plugin.themebuilder.internal.components.tabbar.item

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.badge.BadgeProperties
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
import com.sdds.plugin.themebuilder.internal.components.counter.CounterProperties
import com.sdds.plugin.themebuilder.internal.components.indicator.IndicatorProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class TabBarItemProperties(
    val shape: Shape? = null,
    val labelStyle: Typography? = null,
    val backgroundColor: Color? = null,
    val labelColor: Color? = null,
    val iconColor: Color? = null,
    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingBottom: Dimension? = null,
    val labelPadding: Dimension? = null,
    val iconSize: Dimension? = null,
    val minHeight: Dimension? = null,
    val labelPlacement: Value? = null,
    val counterStyle: ComponentStyle<CounterProperties>? = null,
    val indicatorStyle: ComponentStyle<IndicatorProperties>? = null,
    val badgeStyle: ComponentStyle<BadgeProperties>? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? TabBarItemProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            labelStyle = labelStyle ?: otherProps.labelStyle,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            labelColor = labelColor ?: otherProps.labelColor,
            iconColor = iconColor ?: otherProps.iconColor,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            labelPadding = labelPadding ?: otherProps.labelPadding,
            iconSize = iconSize ?: otherProps.iconSize,
            minHeight = minHeight ?: otherProps.minHeight,
            labelPlacement = labelPlacement ?: otherProps.labelPlacement,
            counterStyle = counterStyle ?: otherProps.counterStyle,
            indicatorStyle = indicatorStyle ?: otherProps.indicatorStyle,
            badgeStyle = badgeStyle ?: otherProps.badgeStyle,
        )
    }
}

@Serializable
internal data class TabBarItemView(
    override val props: TabBarItemProperties = TabBarItemProperties(),
) : ViewVariation<TabBarItemProperties> {
    override fun merge(parent: ViewVariation<TabBarItemProperties>): ViewVariation<TabBarItemProperties> =
        copy(props = props.merge(parent.props) as TabBarItemProperties)
}

@Serializable
internal data class TabBarItemVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, TabBarItemView> = emptyMap(),
    override val props: TabBarItemProperties,
) : ChildVariation<TabBarItemProperties>

@Serializable
internal data class TabBarItemConfig(
    override val view: Map<String, TabBarItemView> = emptyMap(),
    override val props: TabBarItemProperties = TabBarItemProperties(),
    override val variations: List<TabBarItemVariation> = emptyList(),
) : Config<TabBarItemProperties>, ComponentConfig
