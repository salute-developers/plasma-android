package com.sdds.plugin.themebuilder.internal.components.divider

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class DividerProperties(
    val shape: Shape? = null,
    val thickness: Dimension? = null,
    val backgroundColor: Color? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? DividerProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            thickness = thickness ?: otherProps.thickness,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
        )
    }
}

@Serializable
internal data class DividerView(
    override val props: DividerProperties,
) : ViewVariation<DividerProperties> {
    override fun merge(parent: ViewVariation<DividerProperties>): ViewVariation<DividerProperties> =
        copy(props = props.merge(parent.props) as DividerProperties)
}

@Serializable
internal data class DividerVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, DividerView> = emptyMap(),
    override val props: DividerProperties,
) : ChildVariation<DividerProperties>

@Serializable
internal data class DividerConfig(
    override val view: Map<String, DividerView> = emptyMap(),
    override val props: DividerProperties,
    override val variations: List<DividerVariation> = emptyList(),
) : Config<DividerProperties>, ComponentConfig
