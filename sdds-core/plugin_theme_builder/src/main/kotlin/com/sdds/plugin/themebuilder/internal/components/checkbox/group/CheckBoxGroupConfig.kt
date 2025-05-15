package com.sdds.plugin.themebuilder.internal.components.checkbox.group

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.checkbox.CheckBoxProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class CheckBoxGroupProperties(
    val itemSpacing: Dimension? = null,
    val itemOffset: Dimension? = null,
    val checkBoxStyle: ComponentStyle<CheckBoxProperties>? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? CheckBoxGroupProperties ?: return this
        return copy(
            itemSpacing = itemSpacing ?: otherProps.itemSpacing,
            itemOffset = itemOffset ?: otherProps.itemOffset,
            checkBoxStyle = checkBoxStyle ?: otherProps.checkBoxStyle,
        )
    }
}

@Serializable
internal data class CheckBoxGroupView(override val props: CheckBoxGroupProperties) :
    ViewVariation<CheckBoxGroupProperties> {
    override fun merge(parent: ViewVariation<CheckBoxGroupProperties>): ViewVariation<CheckBoxGroupProperties> =
        copy(props = props.merge(parent.props) as CheckBoxGroupProperties)
}

@Serializable
internal data class CheckBoxGroupVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, CheckBoxGroupView> = emptyMap(),
    override val props: CheckBoxGroupProperties,
) : ChildVariation<CheckBoxGroupProperties>

@Serializable
internal data class CheckBoxGroupConfig(
    override val view: Map<String, CheckBoxGroupView> = emptyMap(),
    override val props: CheckBoxGroupProperties,
    override val variations: List<CheckBoxGroupVariation> = emptyList(),
) : Config<CheckBoxGroupProperties>, ComponentConfig
