package com.sdds.plugin.themebuilder.internal.components.checkbox

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
internal data class CheckBoxProperties(
    val shape: Shape? = null,
    val labelStyle: Typography? = null,
    val descriptionStyle: Typography? = null,

    val togglePadding: Dimension? = null,
    val textPadding: Dimension? = null,
    val descriptionPadding: Dimension? = null,

    val toggleBorderWidth: Dimension? = null,
    val toggleBorderOffset: Dimension? = null,
    val toggleWidth: Dimension? = null,
    val toggleHeight: Dimension? = null,
    val toggleIconWidth: Dimension? = null,
    val toggleIconHeight: Dimension? = null,

    val labelColor: Color? = null,
    val descriptionColor: Color? = null,
    val toggleIconColor: Color? = null,

    val toggleBorderColor: Color? = null,
    val toggleColor: Color? = null,
    val disableAlpha: FloatValue? = null,

    ) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? CheckBoxProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            labelStyle = labelStyle ?: otherProps.labelStyle,
            descriptionStyle = descriptionStyle ?: otherProps.descriptionStyle,
            togglePadding = togglePadding ?: otherProps.togglePadding,
            textPadding = textPadding ?: otherProps.textPadding,
            descriptionPadding = descriptionPadding ?: otherProps.descriptionPadding,
            toggleBorderWidth = toggleBorderWidth ?: otherProps.toggleBorderWidth,
            toggleBorderOffset = toggleBorderOffset ?: otherProps.toggleBorderOffset,
            toggleWidth = toggleWidth ?: otherProps.toggleWidth,
            toggleHeight = toggleHeight ?: otherProps.toggleHeight,
            toggleIconWidth = toggleIconWidth ?: otherProps.toggleIconWidth,
            toggleIconHeight = toggleIconHeight ?: otherProps.toggleIconHeight,
            labelColor = labelColor ?: otherProps.labelColor,
            descriptionColor = descriptionColor ?: otherProps.descriptionColor,
            toggleIconColor = toggleIconColor ?: otherProps.toggleIconColor,
            toggleBorderColor = toggleBorderColor ?: otherProps.toggleBorderColor,
            toggleColor = toggleColor ?: otherProps.toggleColor,
            disableAlpha = disableAlpha ?: otherProps.disableAlpha,
        )
    }
}

@Serializable
internal data class CheckBoxView(
    override val props: CheckBoxProperties,
) : ViewVariation<CheckBoxProperties> {
    override fun merge(parent: ViewVariation<CheckBoxProperties>): ViewVariation<CheckBoxProperties> =
        copy(props = props.merge(parent.props) as CheckBoxProperties)
}

@Serializable
internal data class CheckBoxVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, CheckBoxView> = emptyMap(),
    override val props: CheckBoxProperties,
) : ChildVariation<CheckBoxProperties>

@Serializable
internal data class CheckBoxConfig(
    override val view: Map<String, CheckBoxView> = emptyMap(),
    override val props: CheckBoxProperties,
    override val variations: List<CheckBoxVariation> = emptyList(),
) : Config<CheckBoxProperties>, ComponentConfig
