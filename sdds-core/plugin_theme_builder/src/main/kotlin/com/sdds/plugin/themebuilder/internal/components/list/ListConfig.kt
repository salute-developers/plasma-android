package com.sdds.plugin.themebuilder.internal.components.list

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.list.item.ListItemProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class ListProperties(
    val listItemStyle: ComponentStyle<ListItemProperties>? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? ListProperties ?: return this
        return copy(
            listItemStyle = listItemStyle ?: otherProps.listItemStyle,
        )
    }
}

@Serializable
internal data class ListView(override val props: ListProperties) : ViewVariation<ListProperties> {
    override fun merge(parent: ViewVariation<ListProperties>): ViewVariation<ListProperties> =
        copy(props = props.merge(parent.props) as ListProperties)
}

@Serializable
internal data class ListVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, ListView> = emptyMap(),
    override val props: ListProperties,
) : ChildVariation<ListProperties>

@Serializable
internal data class ListConfig(
    override val view: Map<String, ListView> = emptyMap(),
    override val props: ListProperties,
    override val variations: List<ListVariation> = emptyList(),
) : Config<ListProperties>, ComponentConfig
