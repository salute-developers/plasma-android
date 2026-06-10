package com.sdds.plugin.themebuilder.internal.components.combobox

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.Binding
import com.sdds.plugin.themebuilder.internal.components.base.Bindings
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.dropdownmenu.DropdownMenuProperties
import com.sdds.plugin.themebuilder.internal.components.select.SelectItemProperties
import com.sdds.plugin.themebuilder.internal.components.textfield.TextFieldProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class ComboBoxProperties(
    val textFieldStyle: ComponentStyle<TextFieldProperties>? = null,
    val dropdownStyle: ComponentStyle<DropdownMenuProperties>? = null,
    val selectItemStyle: ComponentStyle<SelectItemProperties>? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? ComboBoxProperties ?: return this
        return copy(
            textFieldStyle = textFieldStyle ?: otherProps.textFieldStyle,
            dropdownStyle = dropdownStyle ?: otherProps.dropdownStyle,
            selectItemStyle = selectItemStyle ?: otherProps.selectItemStyle,
        )
    }
}

@Serializable
internal data class ComboBoxView(
    override val props: ComboBoxProperties,
    override val binding: List<Binding>? = null,
) : ViewVariation<ComboBoxProperties> {
    override fun merge(parent: ViewVariation<ComboBoxProperties>): ViewVariation<ComboBoxProperties> =
        copy(props = props.merge(parent.props) as ComboBoxProperties, binding = binding ?: parent.binding)
}

@Serializable
internal data class ComboBoxVariation(
    override val id: String,
    override val parent: String? = null,
    override val binding: List<Binding>? = null,
    override val view: Map<String, ComboBoxView> = emptyMap(),
    override val props: ComboBoxProperties,
) : ChildVariation<ComboBoxProperties>

@Serializable
internal data class ComboBoxConfig(
    override val view: Map<String, ComboBoxView> = emptyMap(),
    override val props: ComboBoxProperties,
    override val variations: List<ComboBoxVariation> = emptyList(),
    override val bindings: List<Bindings> = emptyList(),
) : Config<ComboBoxProperties>, ComponentConfig
