package com.sdds.plugin.themebuilder.internal.components.tabs

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
import com.sdds.plugin.themebuilder.internal.components.base.Value
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.divider.DividerProperties
import com.sdds.plugin.themebuilder.internal.components.tabbar.item.TabBarItemProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class TabsProperties(
    val shape: Shape? = null,
    val backgroundColor: Color? = null,
    val indicatorColor: Color? = null,
    val overflowNextIconColor: Color? = null,
    val overflowPrevIconColor: Color? = null,
    val disclosureColor: Color? = null,
    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingBottom: Dimension? = null,
    val indicatorThickness: Dimension? = null,
    val minSpacing: Dimension? = null,
    val minHeight: Dimension? = null,
    val overflowNextIcon: Icon? = null,
    val overflowPrevIcon: Icon? = null,
    val disclosureIcon: Icon? = null,
    val disclosureTextStyle: Typography? = null,
    val orientation: Value? = null,
    val tabItemStyle: ComponentStyle<TabBarItemProperties>? = null,
    val dividerStyle: ComponentStyle<DividerProperties>? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? TabsProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            indicatorColor = indicatorColor ?: otherProps.indicatorColor,
            overflowNextIconColor = overflowNextIconColor ?: otherProps.overflowNextIconColor,
            overflowPrevIconColor = overflowPrevIconColor ?: otherProps.overflowPrevIconColor,
            disclosureColor = disclosureColor ?: otherProps.disclosureColor,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            indicatorThickness = indicatorThickness ?: otherProps.indicatorThickness,
            minSpacing = minSpacing ?: otherProps.minSpacing,
            minHeight = minHeight ?: otherProps.minHeight,
            overflowNextIcon = overflowNextIcon ?: otherProps.overflowNextIcon,
            overflowPrevIcon = overflowPrevIcon ?: otherProps.overflowPrevIcon,
            disclosureIcon = disclosureIcon ?: otherProps.disclosureIcon,
            disclosureTextStyle = disclosureTextStyle ?: otherProps.disclosureTextStyle,
            orientation = orientation ?: otherProps.orientation,
            tabItemStyle = tabItemStyle ?: otherProps.tabItemStyle,
            dividerStyle = dividerStyle ?: otherProps.dividerStyle,
        )
    }
}

@Serializable
internal data class TabsView(
    override val props: TabsProperties = TabsProperties(),
) : ViewVariation<TabsProperties> {
    override fun merge(parent: ViewVariation<TabsProperties>): ViewVariation<TabsProperties> =
        copy(props = props.merge(parent.props) as TabsProperties)
}

@Serializable
internal data class TabsVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, TabsView> = emptyMap(),
    override val props: TabsProperties,
) : ChildVariation<TabsProperties>

@Serializable
internal data class TabsConfig(
    override val view: Map<String, TabsView> = emptyMap(),
    override val props: TabsProperties = TabsProperties(),
    override val variations: List<TabsVariation> = emptyList(),
) : Config<TabsProperties>, ComponentConfig
