package com.sdds.plugin.themebuilder.internal.components.navigationdrawer

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.badge.BadgeProperties
import com.sdds.plugin.themebuilder.internal.components.base.Binding
import com.sdds.plugin.themebuilder.internal.components.base.Bindings
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
internal data class NavigationDrawerItemProperties(
    val shape: Shape? = null,
    val backgroundColor: Color? = null,
    val iconColor: Color? = null,
    val minHeight: Dimension? = null,
    val iconSize: Dimension? = null,
    val indicatorOffsetX: Dimension? = null,
    val indicatorOffsetY: Dimension? = null,
    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingBottom: Dimension? = null,
    val titleStyle: Typography? = null,
    val titleColor: Color? = null,
    val contentPaddingStart: Dimension? = null,
    val contentPaddingEnd: Dimension? = null,
    val badgeStyle: ComponentStyle<BadgeProperties>? = null,
    val counterStyle: ComponentStyle<CounterProperties>? = null,
) : PropertyOwner {
    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? NavigationDrawerItemProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            iconColor = iconColor ?: otherProps.iconColor,
            minHeight = minHeight ?: otherProps.minHeight,
            iconSize = iconSize ?: otherProps.iconSize,
            indicatorOffsetX = indicatorOffsetX ?: otherProps.indicatorOffsetX,
            indicatorOffsetY = indicatorOffsetY ?: otherProps.indicatorOffsetY,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            titleStyle = titleStyle ?: otherProps.titleStyle,
            titleColor = titleColor ?: otherProps.titleColor,
            contentPaddingStart = contentPaddingStart ?: otherProps.contentPaddingStart,
            contentPaddingEnd = contentPaddingEnd ?: otherProps.contentPaddingEnd,
            badgeStyle = badgeStyle ?: otherProps.badgeStyle,
            counterStyle = counterStyle ?: otherProps.counterStyle,
        )
    }
}

@Serializable
internal data class NavigationDrawerItemView(
    override val props: NavigationDrawerItemProperties,
    override val binding: List<Binding>? = null,
) : ViewVariation<NavigationDrawerItemProperties> {
    override fun merge(
        parent: ViewVariation<NavigationDrawerItemProperties>,
    ): ViewVariation<NavigationDrawerItemProperties> =
        copy(
            props = props.merge(parent.props) as NavigationDrawerItemProperties,
            binding = binding ?: parent.binding,
        )
}

@Serializable
internal data class NavigationDrawerItemVariation(
    override val id: String,
    override val parent: String? = null,
    override val binding: List<Binding>? = null,
    override val view: Map<String, NavigationDrawerItemView> = emptyMap(),
    override val props: NavigationDrawerItemProperties,
) : ChildVariation<NavigationDrawerItemProperties>

@Serializable
internal data class NavigationDrawerItemConfig(
    override val view: Map<String, NavigationDrawerItemView> = emptyMap(),
    override val props: NavigationDrawerItemProperties,
    override val variations: List<NavigationDrawerItemVariation> = emptyList(),
    override val bindings: List<Bindings> = emptyList(),
) : Config<NavigationDrawerItemProperties>, ComponentConfig
