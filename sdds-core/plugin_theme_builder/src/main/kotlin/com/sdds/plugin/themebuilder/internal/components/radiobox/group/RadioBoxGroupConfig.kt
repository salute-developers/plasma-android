package com.sdds.plugin.themebuilder.internal.components.radiobox.group

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.radiobox.RadioBoxProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class RadioBoxGroupProperties(
    val itemSpacing: Dimension? = null,
    val radioBoxStyle: ComponentStyle<RadioBoxProperties>? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? RadioBoxGroupProperties ?: return this
        return copy(
            itemSpacing = itemSpacing ?: otherProps.itemSpacing,
            radioBoxStyle = radioBoxStyle ?: otherProps.radioBoxStyle,
        )
    }
}

@Serializable
internal data class RadioBoxGroupView(override val props: RadioBoxGroupProperties) :
    ViewVariation<RadioBoxGroupProperties> {
    override fun merge(parent: ViewVariation<RadioBoxGroupProperties>): ViewVariation<RadioBoxGroupProperties> =
        copy(props = props.merge(parent.props) as RadioBoxGroupProperties)
}

@Serializable
internal data class RadioBoxGroupVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, RadioBoxGroupView> = emptyMap(),
    override val props: RadioBoxGroupProperties,
) : ChildVariation<RadioBoxGroupProperties>

@Serializable
internal data class RadioBoxGroupConfig(
    override val view: Map<String, RadioBoxGroupView> = emptyMap(),
    override val props: RadioBoxGroupProperties,
    override val variations: List<RadioBoxGroupVariation> = emptyList(),
) : Config<RadioBoxGroupProperties>, ComponentConfig
