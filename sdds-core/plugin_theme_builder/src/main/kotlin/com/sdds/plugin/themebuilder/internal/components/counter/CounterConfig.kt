package com.sdds.plugin.themebuilder.internal.components.counter

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class CounterProperties(
    val shape: Shape? = null,
    val labelStyle: Typography? = null,

    val minWidth: Dimension? = null,
    val minHeight: Dimension? = null,
    val paddingLeft: Dimension? = null,
    val paddingRight: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingBottom: Dimension? = null,

    val backgroundColor: Color? = null,
    val textColor: Color? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? CounterProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            labelStyle = labelStyle ?: otherProps.labelStyle,
            minWidth = minWidth ?: otherProps.minWidth,
            minHeight = minHeight ?: otherProps.minHeight,
            paddingLeft = paddingLeft ?: otherProps.paddingLeft,
            paddingRight = paddingRight ?: otherProps.paddingRight,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            textColor = textColor ?: otherProps.textColor,
        )
    }
}

@Serializable
internal data class CounterView(
    override val props: CounterProperties,
) : ViewVariation<CounterProperties> {
    override fun merge(parent: ViewVariation<CounterProperties>): ViewVariation<CounterProperties> =
        copy(props = props.merge(parent.props) as CounterProperties)
}

@Serializable
internal data class CounterVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, CounterView> = emptyMap(),
    override val props: CounterProperties,
) : ChildVariation<CounterProperties>

@Serializable
internal data class CounterConfig(
    override val view: Map<String, CounterView> = emptyMap(),
    override val props: CounterProperties,
    override val variations: List<CounterVariation> = emptyList(),
) : Config<CounterProperties>, ComponentConfig
