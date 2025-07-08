package com.sdds.plugin.themebuilder.internal.components.scrollbar

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.FloatValue
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class ScrollBarProperties(
    val shape: Shape? = null,
    val width: Dimension? = null,
    val thumbColor: Color? = null,
    val trackColor: Color? = null,
    val hoverExpandFactor: FloatValue? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? ScrollBarProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            width = width ?: otherProps.width,
            thumbColor = thumbColor ?: otherProps.thumbColor,
            trackColor = trackColor ?: otherProps.trackColor,
            hoverExpandFactor = hoverExpandFactor ?: otherProps.hoverExpandFactor,
        )
    }
}

@Serializable
internal data class ScrollBarView(
    override val props: ScrollBarProperties,
) : ViewVariation<ScrollBarProperties> {
    override fun merge(parent: ViewVariation<ScrollBarProperties>): ViewVariation<ScrollBarProperties> =
        copy(props = props.merge(parent.props) as ScrollBarProperties)
}

@Serializable
internal data class ScrollBarVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, ScrollBarView> = emptyMap(),
    override val props: ScrollBarProperties,
) : ChildVariation<ScrollBarProperties>

@Serializable
internal data class ScrollBarConfig(
    override val view: Map<String, ScrollBarView> = emptyMap(),
    override val props: ScrollBarProperties,
    override val variations: List<ScrollBarVariation> = emptyList(),
) : Config<ScrollBarProperties>, ComponentConfig
