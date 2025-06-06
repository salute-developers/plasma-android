package com.sdds.plugin.themebuilder.internal.components.rectskeleton

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.FloatValue
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class RectSkeletonProperties(
    val shape: Shape? = null,
    val gradient: Color? = null,
    val duration: FloatValue? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? RectSkeletonProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            gradient = gradient ?: otherProps.gradient,
            duration = duration ?: otherProps.duration,
        )
    }
}

@Serializable
internal data class RectSkeletonView(override val props: RectSkeletonProperties) :
    ViewVariation<RectSkeletonProperties> {
    override fun merge(parent: ViewVariation<RectSkeletonProperties>): ViewVariation<RectSkeletonProperties> =
        copy(props = props.merge(parent.props) as RectSkeletonProperties)
}

@Serializable
internal data class RectSkeletonVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, RectSkeletonView> = emptyMap(),
    override val props: RectSkeletonProperties,
) : ChildVariation<RectSkeletonProperties>

@Serializable
internal data class RectSkeletonConfig(
    override val view: Map<String, RectSkeletonView> = emptyMap(),
    override val props: RectSkeletonProperties,
    override val variations: List<RectSkeletonVariation> = emptyList(),
) : Config<RectSkeletonProperties>, ComponentConfig
