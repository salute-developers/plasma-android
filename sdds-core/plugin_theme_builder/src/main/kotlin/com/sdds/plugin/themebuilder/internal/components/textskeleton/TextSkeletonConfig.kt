package com.sdds.plugin.themebuilder.internal.components.textskeleton

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.FloatValue
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class TextSkeletonProperties(
    val textStyle: Typography? = null,
    val shape: Shape? = null,
    val gradient: Color? = null,
    val duration: FloatValue? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? TextSkeletonProperties ?: return this
        return copy(
            textStyle = textStyle ?: otherProps.textStyle,
            shape = shape ?: otherProps.shape,
            gradient = gradient ?: otherProps.gradient,
            duration = duration ?: otherProps.duration,
        )
    }
}

@Serializable
internal data class TextSkeletonView(override val props: TextSkeletonProperties) :
    ViewVariation<TextSkeletonProperties> {
    override fun merge(parent: ViewVariation<TextSkeletonProperties>): ViewVariation<TextSkeletonProperties> =
        copy(props = props.merge(parent.props) as TextSkeletonProperties)
}

@Serializable
internal data class TextSkeletonVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, TextSkeletonView> = emptyMap(),
    override val props: TextSkeletonProperties,
) : ChildVariation<TextSkeletonProperties>

@Serializable
internal data class TextSkeletonConfig(
    override val view: Map<String, TextSkeletonView> = emptyMap(),
    override val props: TextSkeletonProperties,
    override val variations: List<TextSkeletonVariation> = emptyList(),
) : Config<TextSkeletonProperties>, ComponentConfig
