package com.sdds.plugin.themebuilder.internal.components.badge

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class BadgeProperties(
    val shape: Shape? = null,
    val labelStyle: Typography? = null,

    val height: Dimension? = null,
    val width: Dimension? = null,
    val startContentSize: Dimension? = null,
    val endContentSize: Dimension? = null,
    val startContentMargin: Dimension? = null,
    val endContentMargin: Dimension? = null,
    val startPadding: Dimension? = null,
    val endPadding: Dimension? = null,

    val backgroundColor: Color? = null,
    val contentColor: Color? = null,
    val labelColor: Color? = null,
    val startContentColor: Color? = null,
    val endContentColor: Color? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? BadgeProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            labelStyle = labelStyle ?: otherProps.labelStyle,
            height = height ?: otherProps.height,
            startContentSize = startContentSize ?: otherProps.startContentSize,
            endContentSize = endContentSize ?: otherProps.endContentSize,
            startContentMargin = startContentMargin ?: otherProps.startContentMargin,
            endContentMargin = endContentMargin ?: otherProps.endContentMargin,
            startPadding = startPadding ?: otherProps.startPadding,
            endPadding = endPadding ?: otherProps.endPadding,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            contentColor = contentColor ?: otherProps.contentColor,
            labelColor = labelColor ?: otherProps.labelColor,
            startContentColor = startContentColor ?: otherProps.startContentColor,
            endContentColor = endContentColor ?: otherProps.endContentColor,
        )
    }
}

@Serializable
internal data class BadgeView(
    override val props: BadgeProperties = BadgeProperties(),
) : ViewVariation<BadgeProperties> {
    override fun merge(parent: ViewVariation<BadgeProperties>): ViewVariation<BadgeProperties> =
        copy(props = props.merge(parent.props) as BadgeProperties)
}

@Serializable
internal data class BadgeVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, BadgeView> = emptyMap(),
    override val props: BadgeProperties,
) : ChildVariation<BadgeProperties>

@Serializable
internal data class BadgeConfig(
    override val view: Map<String, BadgeView> = emptyMap(),
    override val props: BadgeProperties = BadgeProperties(),
    override val variations: List<BadgeVariation> = emptyList(),
) : Config<BadgeProperties>, ComponentConfig
