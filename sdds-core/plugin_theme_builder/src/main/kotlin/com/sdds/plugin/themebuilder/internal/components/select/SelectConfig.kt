package com.sdds.plugin.themebuilder.internal.components.select

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.Binding
import com.sdds.plugin.themebuilder.internal.components.base.Bindings
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.button.ButtonProperties
import com.sdds.plugin.themebuilder.internal.components.dropdownmenu.DropdownMenuProperties
import com.sdds.plugin.themebuilder.internal.components.textfield.TextFieldProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class SelectProperties(
    val textFieldStyle: ComponentStyle<TextFieldProperties>? = null,
    val buttonStyle: ComponentStyle<ButtonProperties>? = null,
    val dropdownStyle: ComponentStyle<DropdownMenuProperties>? = null,
    val selectItemStyle: ComponentStyle<SelectItemProperties>? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? SelectProperties ?: return this
        return copy(
            textFieldStyle = textFieldStyle ?: otherProps.textFieldStyle,
            buttonStyle = buttonStyle ?: otherProps.buttonStyle,
            dropdownStyle = dropdownStyle ?: otherProps.dropdownStyle,
            selectItemStyle = selectItemStyle ?: otherProps.selectItemStyle,
        )
    }
}

@Serializable
internal data class SelectView(
    override val props: SelectProperties,
    override val binding: List<Binding>? = null,
) :
    ViewVariation<SelectProperties> {
    override fun merge(parent: ViewVariation<SelectProperties>): ViewVariation<SelectProperties> =
        copy(props = props.merge(parent.props) as SelectProperties, binding = binding ?: parent.binding)
}

@Serializable
internal data class SelectVariation(
    override val id: String,
    override val parent: String? = null,
    override val binding: List<Binding>? = null,
    override val view: Map<String, SelectView> = emptyMap(),
    override val props: SelectProperties,
) : ChildVariation<SelectProperties>

@Serializable
internal data class SelectConfig(
    override val view: Map<String, SelectView> = emptyMap(),
    override val props: SelectProperties,
    override val variations: List<SelectVariation> = emptyList(),
    override val bindings: List<Bindings> = emptyList(),
) : Config<SelectProperties>, ComponentConfig
