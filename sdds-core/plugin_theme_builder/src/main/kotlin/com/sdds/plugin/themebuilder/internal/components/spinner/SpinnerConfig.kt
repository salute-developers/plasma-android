package com.sdds.plugin.themebuilder.internal.components.spinner

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.FloatValue
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Value
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class SpinnerProperties(
    val backgroundColor: Color? = null,
    val startColor: Color? = null,
    val endColor: Color? = null,
    val angle: FloatValue? = null,
    val strokeCap: Value? = null,
    val strokeWidth: Dimension? = null,
    val size: Dimension? = null,
    val padding: Dimension? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? SpinnerProperties ?: return this
        return copy(
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            startColor = startColor ?: otherProps.startColor,
            endColor = endColor ?: otherProps.endColor,
            angle = angle ?: otherProps.angle,
            strokeCap = strokeCap ?: otherProps.strokeCap,
            size = size ?: otherProps.size,
            padding = padding ?: otherProps.padding,
        )
    }
}

@Serializable
internal data class SpinnerView(override val props: SpinnerProperties) :
    ViewVariation<SpinnerProperties> {
    override fun merge(parent: ViewVariation<SpinnerProperties>): ViewVariation<SpinnerProperties> =
        copy(props = props.merge(parent.props) as SpinnerProperties)
}

@Serializable
internal data class SpinnerVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, SpinnerView> = emptyMap(),
    override val props: SpinnerProperties,
) : ChildVariation<SpinnerProperties>

@Serializable
internal data class SpinnerConfig(
    override val view: Map<String, SpinnerView> = emptyMap(),
    override val props: SpinnerProperties,
    override val variations: List<SpinnerVariation> = emptyList(),
) : Config<SpinnerProperties>, ComponentConfig
