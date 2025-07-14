package com.sdds.plugin.themebuilder.internal.components.buttongroup

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.button.ButtonProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class ButtonGroupProperties(
    val internalShape: Shape? = null,
    val externalShape: Shape? = null,
    val spacing: Dimension? = null,
    val buttonStyle: ComponentStyle<ButtonProperties>? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? ButtonGroupProperties ?: return this
        return copy(
            internalShape = internalShape ?: otherProps.internalShape,
            externalShape = externalShape ?: otherProps.externalShape,
            spacing = spacing ?: otherProps.spacing,
            buttonStyle = buttonStyle ?: otherProps.buttonStyle,
        )
    }
}

@Serializable
internal data class ButtonGroupView(override val props: ButtonGroupProperties) :
    ViewVariation<ButtonGroupProperties> {
    override fun merge(parent: ViewVariation<ButtonGroupProperties>): ViewVariation<ButtonGroupProperties> =
        copy(props = props.merge(parent.props) as ButtonGroupProperties)
}

@Serializable
internal data class ButtonGroupVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, ButtonGroupView> = emptyMap(),
    override val props: ButtonGroupProperties,
) : ChildVariation<ButtonGroupProperties>

@Serializable
internal data class ButtonGroupConfig(
    override val view: Map<String, ButtonGroupView> = emptyMap(),
    override val props: ButtonGroupProperties,
    override val variations: List<ButtonGroupVariation> = emptyList(),
) : Config<ButtonGroupProperties>, ComponentConfig
