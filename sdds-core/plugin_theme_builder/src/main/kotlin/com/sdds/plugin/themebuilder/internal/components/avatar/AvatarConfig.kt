package com.sdds.plugin.themebuilder.internal.components.avatar

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
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.counter.CounterProperties
import com.sdds.plugin.themebuilder.internal.components.indicator.IndicatorProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class AvatarProperties(
    val shape: Shape? = null,
    val textStyle: Typography? = null,

    val width: Dimension? = null,
    val height: Dimension? = null,
    val statusOffsetX: Dimension? = null,
    val statusOffsetY: Dimension? = null,

    val background: Color? = null,
    val activeStatusColor: Color? = null,
    val inactiveStatusColor: Color? = null,
    val textColor: Color? = null,

    val statusStyle: ComponentStyle<IndicatorProperties>? = null,
    val badgeStyle: ComponentStyle<BadgeProperties>? = null,
    val counterStyle: ComponentStyle<CounterProperties>? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? AvatarProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            textStyle = textStyle ?: otherProps.textStyle,
            width = width ?: otherProps.width,
            height = height ?: otherProps.height,
            statusOffsetX = statusOffsetX ?: otherProps.statusOffsetX,
            statusOffsetY = statusOffsetY ?: otherProps.statusOffsetY,
            background = background ?: otherProps.background,
            activeStatusColor = activeStatusColor ?: otherProps.activeStatusColor,
            inactiveStatusColor = inactiveStatusColor ?: otherProps.inactiveStatusColor,
            textColor = textColor ?: otherProps.textColor,
            statusStyle = statusStyle ?: otherProps.statusStyle,
            badgeStyle = badgeStyle ?: otherProps.badgeStyle,
            counterStyle = counterStyle ?: otherProps.counterStyle,
        )
    }
}

@Serializable
internal data class AvatarView(
    override val props: AvatarProperties,
) : ViewVariation<AvatarProperties> {
    override fun merge(parent: ViewVariation<AvatarProperties>): ViewVariation<AvatarProperties> =
        copy(props = props.merge(parent.props) as AvatarProperties)
}

@Serializable
internal data class AvatarVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, AvatarView> = emptyMap(),
    override val props: AvatarProperties,
) : ChildVariation<AvatarProperties>

@Serializable
internal data class AvatarConfig(
    override val view: Map<String, AvatarView> = emptyMap(),
    override val props: AvatarProperties,
    override val variations: List<AvatarVariation> = emptyList(),
) : Config<AvatarProperties>, ComponentConfig
