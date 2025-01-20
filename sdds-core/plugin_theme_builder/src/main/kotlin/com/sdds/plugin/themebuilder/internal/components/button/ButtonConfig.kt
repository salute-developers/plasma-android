package com.sdds.plugin.themebuilder.internal.components.button

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
internal data class ButtonProperties(
    val shape: Shape? = null,

    val labelStyle: Typography? = null,
    val valueStyle: Typography? = null,

    val height: Dimension? = null,
    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val minWidth: Dimension? = null,
    val iconSize: Dimension? = null,
    val spinnerSize: Dimension? = null,
    val spinnerStrokeWidth: Dimension? = null,
    val iconMargin: Dimension? = null,
    val valueMargin: Dimension? = null,

    val backgroundColor: Color? = null,
    val iconColor: Color? = null,
    val labelColor: Color? = null,
    val valueColor: Color? = null,
    val spinnerColor: Color? = null,
    val loadingAlpha: FloatValue? = null,
    val disableAlpha: FloatValue? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? ButtonProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            labelStyle = labelStyle ?: otherProps.labelStyle,
            valueStyle = valueStyle ?: otherProps.valueStyle,
            height = height ?: otherProps.height,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            minWidth = minWidth ?: otherProps.minWidth,
            iconSize = iconSize ?: otherProps.iconSize,
            spinnerSize = spinnerSize ?: otherProps.spinnerSize,
            spinnerStrokeWidth = spinnerStrokeWidth ?: otherProps.spinnerStrokeWidth,
            iconMargin = iconMargin ?: otherProps.iconMargin,
            valueMargin = valueMargin ?: otherProps.valueMargin,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            iconColor = iconColor ?: otherProps.iconColor,
            labelColor = labelColor ?: otherProps.labelColor,
            valueColor = valueColor ?: otherProps.valueColor,
            spinnerColor = spinnerColor ?: otherProps.spinnerColor,
            loadingAlpha = loadingAlpha ?: otherProps.loadingAlpha,
            disableAlpha = disableAlpha ?: otherProps.disableAlpha,
        )
    }
}

@Serializable
internal data class ButtonView(
    override val props: ButtonProperties,
) : ViewVariation<ButtonProperties> {
    override fun merge(parent: ViewVariation<ButtonProperties>): ViewVariation<ButtonProperties> =
        copy(props = props.merge(parent.props) as ButtonProperties)
}

@Serializable
internal data class ButtonVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, ButtonView> = emptyMap(),
    override val props: ButtonProperties,
) : ChildVariation<ButtonProperties>

@Serializable
internal data class ButtonConfig(
    override val view: Map<String, ButtonView> = emptyMap(),
    override val props: ButtonProperties = ButtonProperties(),
    override val variations: List<ButtonVariation> = emptyList(),
) : Config<ButtonProperties>, ComponentConfig
