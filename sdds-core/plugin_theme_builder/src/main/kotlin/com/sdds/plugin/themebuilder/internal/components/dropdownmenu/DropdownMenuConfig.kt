package com.sdds.plugin.themebuilder.internal.components.dropdownmenu

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
import com.sdds.plugin.themebuilder.internal.components.divider.DividerProperties
import com.sdds.plugin.themebuilder.internal.components.list.ListProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class DropdownMenuProperties(
    val shape: Shape? = null,
    val shadow: Shadow? = null,
    val backgroundColor: Color? = null,
    val strokeColor: Color? = null,
    val width: Dimension? = null,
    val offset: Dimension? = null,
    val strokeWidth: Dimension? = null,
    val listStyle: ComponentStyle<ListProperties>? = null,
    val dividerStyle: ComponentStyle<DividerProperties>? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? DropdownMenuProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            shadow = shadow ?: otherProps.shadow,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            strokeColor = strokeColor ?: otherProps.strokeColor,
            width = width ?: otherProps.width,
            offset = offset ?: otherProps.offset,
            listStyle = listStyle ?: otherProps.listStyle,
            dividerStyle = dividerStyle ?: otherProps.dividerStyle,
            strokeWidth = strokeWidth ?: otherProps.strokeWidth,
        )
    }
}

@Serializable
internal data class DropdownMenuView(override val props: DropdownMenuProperties) :
    ViewVariation<DropdownMenuProperties> {
    override fun merge(parent: ViewVariation<DropdownMenuProperties>): ViewVariation<DropdownMenuProperties> =
        copy(props = props.merge(parent.props) as DropdownMenuProperties)
}

@Serializable
internal data class DropdownMenuVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, DropdownMenuView> = emptyMap(),
    override val props: DropdownMenuProperties,
) : ChildVariation<DropdownMenuProperties>

@Serializable
internal data class DropdownMenuConfig(
    override val view: Map<String, DropdownMenuView> = emptyMap(),
    override val props: DropdownMenuProperties,
    override val variations: List<DropdownMenuVariation> = emptyList(),
) : Config<DropdownMenuProperties>, ComponentConfig
