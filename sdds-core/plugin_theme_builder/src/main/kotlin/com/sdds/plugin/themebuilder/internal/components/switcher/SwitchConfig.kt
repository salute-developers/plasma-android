package com.sdds.plugin.themebuilder.internal.components.switcher

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.FloatValue
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class SwitchProperties(
    val toggleTrackShape: Shape? = null,
    val toggleThumbShape: Shape? = null,
    val shape: Shape? = null,

    val labelStyle: Typography? = null,
    val descriptionStyle: Typography? = null,

    val toggleTrackWidth: Dimension? = null,
    val toggleTrackHeight: Dimension? = null,
    val toggleThumbWidth: Dimension? = null,
    val toggleThumbHeight: Dimension? = null,
    val togglePadding: Dimension? = null,
    val textPadding: Dimension? = null,
    val descriptionPadding: Dimension? = null,
    val paddingStart: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val paddingBottom: Dimension? = null,

    val labelColor: Color? = null,
    val descriptionColor: Color? = null,
    val toggleTrackColor: Color? = null,
    val toggleTrackBorderColor: Color? = null,
    val toggleThumbColor: Color? = null,
    val backgroundColor: Color? = null,

    val disableAlpha: FloatValue? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? SwitchProperties ?: return this
        return copy(
            toggleTrackShape = toggleTrackShape ?: otherProps.toggleTrackShape,
            toggleThumbShape = toggleThumbShape ?: otherProps.toggleThumbShape,
            labelStyle = labelStyle ?: otherProps.labelStyle,
            descriptionStyle = descriptionStyle ?: otherProps.descriptionStyle,
            toggleTrackWidth = toggleTrackWidth ?: otherProps.toggleTrackWidth,
            toggleTrackHeight = toggleTrackHeight ?: otherProps.toggleTrackHeight,
            toggleThumbWidth = toggleThumbWidth ?: otherProps.toggleThumbWidth,
            toggleThumbHeight = toggleThumbHeight ?: otherProps.toggleThumbHeight,
            togglePadding = togglePadding ?: otherProps.togglePadding,
            textPadding = textPadding ?: otherProps.textPadding,
            descriptionPadding = descriptionPadding ?: otherProps.descriptionPadding,
            labelColor = labelColor ?: otherProps.labelColor,
            descriptionColor = descriptionColor ?: otherProps.descriptionColor,
            toggleTrackColor = toggleTrackColor ?: otherProps.toggleTrackColor,
            toggleTrackBorderColor = toggleTrackBorderColor ?: otherProps.toggleTrackBorderColor,
            toggleThumbColor = toggleThumbColor ?: otherProps.toggleThumbColor,
            disableAlpha = disableAlpha ?: otherProps.disableAlpha,
            shape = shape ?: otherProps.shape,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
        )
    }
}

@Serializable
internal data class SwitchView(
    override val props: SwitchProperties,
) : ViewVariation<SwitchProperties> {
    override fun merge(parent: ViewVariation<SwitchProperties>): ViewVariation<SwitchProperties> =
        copy(props = props.merge(parent.props) as SwitchProperties)
}

@Serializable
internal data class SwitchVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, SwitchView> = emptyMap(),
    override val props: SwitchProperties,
) : ChildVariation<SwitchProperties>

@Serializable
internal data class SwitchConfig(
    override val view: Map<String, SwitchView> = emptyMap(),
    override val props: SwitchProperties,
    override val variations: List<SwitchVariation> = emptyList(),
) : Config<SwitchProperties>, ComponentConfig
