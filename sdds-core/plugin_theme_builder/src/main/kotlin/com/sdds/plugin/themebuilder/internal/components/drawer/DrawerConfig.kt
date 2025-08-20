package com.sdds.plugin.themebuilder.internal.components.drawer

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
internal data class DrawerProperties(
    val shape: Shape? = null,
    val shadow: Shadow? = null,
    val backgroundColor: Color? = null,
    val closeColor: Color? = null,
    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingBottom: Dimension? = null,
    val closeSize: Dimension? = null,
    val closeIconPadding: Dimension? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? DrawerProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            shadow = shadow ?: otherProps.shadow,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            closeColor = closeColor ?: otherProps.closeColor,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            closeSize = closeSize ?: otherProps.closeSize,
            closeIconPadding = closeIconPadding ?: otherProps.closeIconPadding,
        )
    }
}

@Serializable
internal data class DrawerView(override val props: DrawerProperties) :
    ViewVariation<DrawerProperties> {
    override fun merge(parent: ViewVariation<DrawerProperties>): ViewVariation<DrawerProperties> =
        copy(props = props.merge(parent.props) as DrawerProperties)
}

@Serializable
internal data class DrawerVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, DrawerView> = emptyMap(),
    override val props: DrawerProperties,
) : ChildVariation<DrawerProperties>

@Serializable
internal data class DrawerConfig(
    override val view: Map<String, DrawerView> = emptyMap(),
    override val props: DrawerProperties,
    override val variations: List<DrawerVariation> = emptyList(),
) : Config<DrawerProperties>, ComponentConfig
