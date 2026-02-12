package com.sdds.plugin.themebuilder.internal.components.editable

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class EditableProperties(
    val textColor: Color? = null,
    val textStyle: Typography? = null,
    val iconColor: Color? = null,
    val cursorColor: Color? = null,
    val iconMargin: Dimension? = null,
    val iconSize: Dimension? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? EditableProperties ?: return this
        return copy(
            textColor = textColor ?: otherProps.textColor,
            textStyle = textStyle ?: otherProps.textStyle,
            iconColor = iconColor ?: otherProps.iconColor,
            cursorColor = cursorColor ?: otherProps.cursorColor,
            iconMargin = iconMargin ?: otherProps.iconMargin,
            iconSize = iconSize ?: otherProps.iconSize,
        )
    }
}

@Serializable
internal data class EditableView(override val props: EditableProperties) :
    ViewVariation<EditableProperties> {
    override fun merge(parent: ViewVariation<EditableProperties>): ViewVariation<EditableProperties> =
        copy(props = props.merge(parent.props) as EditableProperties)
}

@Serializable
internal data class EditableVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, EditableView> = emptyMap(),
    override val props: EditableProperties,
) : ChildVariation<EditableProperties>

@Serializable
internal data class EditableConfig(
    override val view: Map<String, EditableView> = emptyMap(),
    override val props: EditableProperties,
    override val variations: List<EditableVariation> = emptyList(),
) : Config<EditableProperties>, ComponentConfig
