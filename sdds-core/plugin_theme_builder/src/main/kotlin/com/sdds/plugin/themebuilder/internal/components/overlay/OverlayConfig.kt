package com.sdds.plugin.themebuilder.internal.components.overlay

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class OverlayProperties(
    val backgroundColor: Color? = null,
    val blurRadius: Dimension? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? OverlayProperties ?: return this
        return copy(
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            blurRadius = blurRadius ?: otherProps.blurRadius,
        )
    }
}

@Serializable
internal data class OverlayView(
    override val props: OverlayProperties,
) : ViewVariation<OverlayProperties> {
    override fun merge(parent: ViewVariation<OverlayProperties>): ViewVariation<OverlayProperties> =
        copy(props = props.merge(parent.props) as OverlayProperties)
}

@Serializable
internal data class OverlayVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, OverlayView> = emptyMap(),
    override val props: OverlayProperties,
) : ChildVariation<OverlayProperties>

@Serializable
internal data class OverlayConfig(
    override val view: Map<String, OverlayView> = emptyMap(),
    override val props: OverlayProperties,
    override val variations: List<OverlayVariation> = emptyList(),
) : Config<OverlayProperties>, ComponentConfig
