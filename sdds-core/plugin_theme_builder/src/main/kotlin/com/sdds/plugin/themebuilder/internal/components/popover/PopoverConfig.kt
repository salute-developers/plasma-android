package com.sdds.plugin.themebuilder.internal.components.popover

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shadow
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class PopoverProperties(
    val shape: Shape? = null,
    val shadow: Shadow? = null,
    val backgroundColor: Color? = null,
    val width: Dimension? = null,
    val offset: Dimension? = null,
    val tailWidth: Dimension? = null,
    val tailHeight: Dimension? = null,
    val tailPadding: Dimension? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? PopoverProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            shadow = shadow ?: otherProps.shadow,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            width = width ?: otherProps.width,
            offset = offset ?: otherProps.offset,
            tailWidth = tailWidth ?: otherProps.tailWidth,
            tailHeight = tailHeight ?: otherProps.tailHeight,
            tailPadding = tailPadding ?: otherProps.tailPadding,
        )
    }
}

@Serializable
internal data class PopoverView(override val props: PopoverProperties) :
    ViewVariation<PopoverProperties> {
    override fun merge(parent: ViewVariation<PopoverProperties>): ViewVariation<PopoverProperties> =
        copy(props = props.merge(parent.props) as PopoverProperties)
}

@Serializable
internal data class PopoverVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, PopoverView> = emptyMap(),
    override val props: PopoverProperties,
) : ChildVariation<PopoverProperties>

@Serializable
internal data class PopoverConfig(
    override val view: Map<String, PopoverView> = emptyMap(),
    override val props: PopoverProperties,
    override val variations: List<PopoverVariation> = emptyList(),
) : Config<PopoverProperties>, ComponentConfig
