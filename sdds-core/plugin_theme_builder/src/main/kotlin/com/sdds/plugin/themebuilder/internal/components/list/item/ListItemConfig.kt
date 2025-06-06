package com.sdds.plugin.themebuilder.internal.components.list.item

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.Icon
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class ListItemProperties(
    val shape: Shape? = null,
    val backgroundColor: Color? = null,
    val titleColor: Color? = null,
    val disclosureIconColor: Color? = null,
    val contentPaddingEnd: Dimension? = null,
    val titleStyle: Typography? = null,
    val disclosureIcon: Icon? = null,
    val paddingStart: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val paddingBottom: Dimension? = null,
    val height: Dimension? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? ListItemProperties ?: return this
        return copy(
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            titleColor = titleColor ?: otherProps.titleColor,
            disclosureIconColor = disclosureIconColor ?: otherProps.disclosureIconColor,
            contentPaddingEnd = contentPaddingEnd ?: otherProps.contentPaddingEnd,
            titleStyle = titleStyle ?: otherProps.titleStyle,
            disclosureIcon = disclosureIcon ?: otherProps.disclosureIcon,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            height = height ?: otherProps.height,
        )
    }
}

@Serializable
internal data class ListItemView(override val props: ListItemProperties) :
    ViewVariation<ListItemProperties> {
    override fun merge(parent: ViewVariation<ListItemProperties>): ViewVariation<ListItemProperties> =
        copy(props = props.merge(parent.props) as ListItemProperties)
}

@Serializable
internal data class ListItemVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, ListItemView> = emptyMap(),
    override val props: ListItemProperties,
) : ChildVariation<ListItemProperties>

@Serializable
internal data class ListItemConfig(
    override val view: Map<String, ListItemView> = emptyMap(),
    override val props: ListItemProperties,
    override val variations: List<ListItemVariation> = emptyList(),
) : Config<ListItemProperties>, ComponentConfig
