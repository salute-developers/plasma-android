package com.sdds.plugin.themebuilder.internal.components.indicator

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
internal data class IndicatorProperties(
    val shape: Shape? = null,
    val width: Dimension? = null,
    val height: Dimension? = null,
    val backgroundColor: Color? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? IndicatorProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            width = width ?: otherProps.width,
            height = height ?: otherProps.height,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
        )
    }
}

@Serializable
internal data class IndicatorView(
    override val props: IndicatorProperties,
) : ViewVariation<IndicatorProperties> {
    override fun merge(parent: ViewVariation<IndicatorProperties>): ViewVariation<IndicatorProperties> =
        copy(props = props.merge(parent.props) as IndicatorProperties)
}

@Serializable
internal data class IndicatorVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, IndicatorView> = emptyMap(),
    override val props: IndicatorProperties,
) : ChildVariation<IndicatorProperties>

@Serializable
internal data class IndicatorConfig(
    override val view: Map<String, IndicatorView> = emptyMap(),
    override val props: IndicatorProperties,
    override val variations: List<IndicatorVariation> = emptyList(),
) : Config<IndicatorProperties>, ComponentConfig
