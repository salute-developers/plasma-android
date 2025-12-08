package com.sdds.plugin.themebuilder.internal.components.emptystate

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.button.ButtonProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class EmptyStateProperties(
    val iconColor: Color? = null,
    val descriptionColor: Color? = null,
    val descriptionStyle: Typography? = null,
    val buttonStyle: ComponentStyle<ButtonProperties>? = null,
    val descriptionPadding: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingBottom: Dimension? = null,
    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? EmptyStateProperties ?: return this
        return copy(
            iconColor = iconColor ?: otherProps.iconColor,
            descriptionColor = descriptionColor ?: otherProps.descriptionColor,
            descriptionStyle = descriptionStyle ?: otherProps.descriptionStyle,
            buttonStyle = buttonStyle ?: otherProps.buttonStyle,
            descriptionPadding = descriptionPadding ?: otherProps.descriptionPadding,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
        )
    }
}

@Serializable
internal data class EmptyStateView(override val props: EmptyStateProperties) :
    ViewVariation<EmptyStateProperties> {
    override fun merge(parent: ViewVariation<EmptyStateProperties>): ViewVariation<EmptyStateProperties> =
        copy(props = props.merge(parent.props) as EmptyStateProperties)
}

@Serializable
internal data class EmptyStateVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, EmptyStateView> = emptyMap(),
    override val props: EmptyStateProperties,
) : ChildVariation<EmptyStateProperties>

@Serializable
internal data class EmptyStateConfig(
    override val view: Map<String, EmptyStateView> = emptyMap(),
    override val props: EmptyStateProperties,
    override val variations: List<EmptyStateVariation> = emptyList(),
) : Config<EmptyStateProperties>, ComponentConfig
