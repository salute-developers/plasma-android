package com.sdds.plugin.themebuilder.internal.components.tabbar

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shadow
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.tabbar.item.TabBarItemProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class TabBarProperties(
    val topShape: Shape? = null,
    val bottomShape: Shape? = null,
    val shadow: Shadow? = null,
    val backgroundColor: Color? = null,
    val dividerColor: Color? = null,
    val backgroundBlurColor: Color? = null,
    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingBottom: Dimension? = null,
    val contentPaddingStart: Dimension? = null,
    val contentPaddingEnd: Dimension? = null,
    val contentPaddingTop: Dimension? = null,
    val contentPaddingBottom: Dimension? = null,
    val itemSpacing: Dimension? = null,
    val dividerThickness: Dimension? = null,
    val backgroundBlurRadius: Dimension? = null,
    val tabBarItemStyle: ComponentStyle<TabBarItemProperties>? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? TabBarProperties ?: return this
        return copy(
            topShape = topShape ?: otherProps.topShape,
            bottomShape = bottomShape ?: otherProps.bottomShape,
            shadow = shadow ?: otherProps.shadow,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            dividerColor = dividerColor ?: otherProps.dividerColor,
            backgroundBlurColor = backgroundBlurColor ?: otherProps.backgroundBlurColor,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            contentPaddingStart = contentPaddingStart ?: otherProps.contentPaddingStart,
            contentPaddingEnd = contentPaddingEnd ?: otherProps.contentPaddingEnd,
            contentPaddingTop = contentPaddingTop ?: otherProps.contentPaddingTop,
            contentPaddingBottom = contentPaddingBottom ?: otherProps.contentPaddingBottom,
            itemSpacing = itemSpacing ?: otherProps.itemSpacing,
            dividerThickness = dividerThickness ?: otherProps.dividerThickness,
            backgroundBlurRadius = backgroundBlurRadius ?: otherProps.backgroundBlurRadius,
            tabBarItemStyle = tabBarItemStyle ?: otherProps.tabBarItemStyle,
        )
    }
}

@Serializable
internal data class TabBarView(
    override val props: TabBarProperties = TabBarProperties(),
) : ViewVariation<TabBarProperties> {
    override fun merge(parent: ViewVariation<TabBarProperties>): ViewVariation<TabBarProperties> =
        copy(props = props.merge(parent.props) as TabBarProperties)
}

@Serializable
internal data class TabBarVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, TabBarView> = emptyMap(),
    override val props: TabBarProperties = TabBarProperties(),
) : ChildVariation<TabBarProperties>

@Serializable
internal data class TabBarConfig(
    override val view: Map<String, TabBarView> = emptyMap(),
    override val props: TabBarProperties = TabBarProperties(),
    override val variations: List<TabBarVariation> = emptyList(),
) : Config<TabBarProperties>, ComponentConfig
