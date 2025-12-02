package com.sdds.plugin.themebuilder.internal.components.autocomplete

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.dropdownmenu.DropdownMenuProperties
import com.sdds.plugin.themebuilder.internal.components.textfield.TextFieldProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class AutoCompleteProperties(
    val textFieldStyle: ComponentStyle<TextFieldProperties>? = null,
    val dropdownStyle: ComponentStyle<DropdownMenuProperties>? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? AutoCompleteProperties ?: return this
        return copy(
            textFieldStyle = textFieldStyle ?: otherProps.textFieldStyle,
            dropdownStyle = dropdownStyle ?: otherProps.dropdownStyle,
        )
    }
}

@Serializable
internal data class AutoCompleteView(override val props: AutoCompleteProperties) :
    ViewVariation<AutoCompleteProperties> {
    override fun merge(parent: ViewVariation<AutoCompleteProperties>): ViewVariation<AutoCompleteProperties> =
        copy(props = props.merge(parent.props) as AutoCompleteProperties)
}

@Serializable
internal data class AutoCompleteVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, AutoCompleteView> = emptyMap(),
    override val props: AutoCompleteProperties,
) : ChildVariation<AutoCompleteProperties>

@Serializable
internal data class AutoCompleteConfig(
    override val view: Map<String, AutoCompleteView> = emptyMap(),
    override val props: AutoCompleteProperties,
    override val variations: List<AutoCompleteVariation> = emptyList(),
) : Config<AutoCompleteProperties>, ComponentConfig
