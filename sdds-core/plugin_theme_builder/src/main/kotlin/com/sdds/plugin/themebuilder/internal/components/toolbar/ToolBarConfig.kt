package com.sdds.plugin.themebuilder.internal.components.toolbar

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shadow
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Value
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.divider.DividerProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class ToolBarProperties(
    val shape: Shape? = null,
    val shadow: Shadow? = null,
    val backgroundColor: Color? = null,
    val dividerStyle: ComponentStyle<DividerProperties>? = null,
    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingBottom: Dimension? = null,
    val slotPadding: Dimension? = null,
    val dividerMargin: Dimension? = null,
    val orientation: Value? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? ToolBarProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            shadow = shadow ?: otherProps.shadow,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            slotPadding = slotPadding ?: otherProps.slotPadding,
            dividerMargin = dividerMargin ?: otherProps.dividerMargin,
            orientation = orientation ?: otherProps.orientation,
        )
    }
}

@Serializable
internal data class ToolBarView(override val props: ToolBarProperties) :
    ViewVariation<ToolBarProperties> {
    override fun merge(parent: ViewVariation<ToolBarProperties>): ViewVariation<ToolBarProperties> =
        copy(props = props.merge(parent.props) as ToolBarProperties)
}

@Serializable
internal data class ToolBarVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, ToolBarView> = emptyMap(),
    override val props: ToolBarProperties,
) : ChildVariation<ToolBarProperties>

@Serializable
internal data class ToolBarConfig(
    override val view: Map<String, ToolBarView> = emptyMap(),
    override val props: ToolBarProperties,
    override val variations: List<ToolBarVariation> = emptyList(),
) : Config<ToolBarProperties>, ComponentConfig
