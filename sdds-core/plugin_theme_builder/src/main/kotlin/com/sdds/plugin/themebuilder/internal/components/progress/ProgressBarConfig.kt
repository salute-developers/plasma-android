package com.sdds.plugin.themebuilder.internal.components.progress

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
internal data class ProgressBarProperties(
    val backgroundColor: Color? = null,
    val indicatorColor: Color? = null,
    val indicatorShape: Shape? = null,
    val backgroundShape: Shape? = null,
    val indicatorHeight: Dimension? = null,
    val backgroundHeight: Dimension? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? ProgressBarProperties ?: return this
        return copy(
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            indicatorColor = indicatorColor ?: otherProps.indicatorColor,
            indicatorShape = indicatorShape ?: otherProps.indicatorShape,
            backgroundShape = backgroundShape ?: otherProps.backgroundShape,
            indicatorHeight = indicatorHeight ?: otherProps.indicatorHeight,
            backgroundHeight = backgroundHeight ?: otherProps.backgroundHeight,
        )
    }
}

@Serializable
internal data class ProgressBarView(override val props: ProgressBarProperties) :
    ViewVariation<ProgressBarProperties> {
    override fun merge(parent: ViewVariation<ProgressBarProperties>): ViewVariation<ProgressBarProperties> =
        copy(props = props.merge(parent.props) as ProgressBarProperties)
}

@Serializable
internal data class ProgressBarVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, ProgressBarView> = emptyMap(),
    override val props: ProgressBarProperties,
) : ChildVariation<ProgressBarProperties>

@Serializable
internal data class ProgressBarConfig(
    override val view: Map<String, ProgressBarView> = emptyMap(),
    override val props: ProgressBarProperties,
    override val variations: List<ProgressBarVariation> = emptyList(),
) : Config<ProgressBarProperties>, ComponentConfig
