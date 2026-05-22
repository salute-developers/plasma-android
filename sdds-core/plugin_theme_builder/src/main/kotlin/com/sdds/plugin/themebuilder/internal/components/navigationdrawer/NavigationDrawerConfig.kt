package com.sdds.plugin.themebuilder.internal.components.navigationdrawer

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.Binding
import com.sdds.plugin.themebuilder.internal.components.base.Bindings
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shadow
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Value
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class NavigationDrawerProperties(
    val shape: Shape? = null,
    val shadow: Shadow? = null,
    val backgroundColor: Color? = null,
    val selectorColor: Color? = null,
    val width: Dimension? = null,
    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingBottom: Dimension? = null,
    val itemSpacing: Dimension? = null,
    val headerSpacing: Dimension? = null,
    val footerSpacing: Dimension? = null,
    val selectorPaddingStart: Dimension? = null,
    val selectorPaddingEnd: Dimension? = null,
    val itemStyle: Value? = null,
) : PropertyOwner {
    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? NavigationDrawerProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            shadow = shadow ?: otherProps.shadow,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            selectorColor = selectorColor ?: otherProps.selectorColor,
            width = width ?: otherProps.width,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            itemSpacing = itemSpacing ?: otherProps.itemSpacing,
            headerSpacing = headerSpacing ?: otherProps.headerSpacing,
            footerSpacing = footerSpacing ?: otherProps.footerSpacing,
            selectorPaddingStart = selectorPaddingStart ?: otherProps.selectorPaddingStart,
            selectorPaddingEnd = selectorPaddingEnd ?: otherProps.selectorPaddingEnd,
            itemStyle = itemStyle ?: otherProps.itemStyle,
        )
    }
}

@Serializable
internal data class NavigationDrawerView(
    override val props: NavigationDrawerProperties,
    override val binding: List<Binding>? = null,
) : ViewVariation<NavigationDrawerProperties> {
    override fun merge(
        parent: ViewVariation<NavigationDrawerProperties>,
    ): ViewVariation<NavigationDrawerProperties> =
        copy(props = props.merge(parent.props) as NavigationDrawerProperties, binding = binding ?: parent.binding)
}

@Serializable
internal data class NavigationDrawerVariation(
    override val id: String,
    override val parent: String? = null,
    override val binding: List<Binding>? = null,
    override val view: Map<String, NavigationDrawerView> = emptyMap(),
    override val props: NavigationDrawerProperties,
) : ChildVariation<NavigationDrawerProperties>

@Serializable
internal data class NavigationDrawerConfig(
    override val view: Map<String, NavigationDrawerView> = emptyMap(),
    override val props: NavigationDrawerProperties,
    override val variations: List<NavigationDrawerVariation> = emptyList(),
    override val bindings: List<Bindings> = emptyList(),
) : Config<NavigationDrawerProperties>, ComponentConfig
