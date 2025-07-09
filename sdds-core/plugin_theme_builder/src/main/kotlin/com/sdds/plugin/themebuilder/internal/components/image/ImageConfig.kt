package com.sdds.plugin.themebuilder.internal.components.image

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.FloatValue
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class ImageProperties(
    val width: FloatValue? = null,
    val height: FloatValue? = null,
) : PropertyOwner {

    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? ImageProperties ?: return this
        return copy(
            width = width ?: otherProps.width,
            height = height ?: otherProps.height,
        )
    }
}

@Serializable
internal data class ImageView(override val props: ImageProperties) :
    ViewVariation<ImageProperties> {
    override fun merge(parent: ViewVariation<ImageProperties>): ViewVariation<ImageProperties> =
        copy(props = props.merge(parent.props) as ImageProperties)
}

@Serializable
internal data class ImageVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, ImageView> = emptyMap(),
    override val props: ImageProperties,
) : ChildVariation<ImageProperties>

@Serializable
internal data class ImageConfig(
    override val view: Map<String, ImageView> = emptyMap(),
    override val props: ImageProperties,
    override val variations: List<ImageVariation> = emptyList(),
) : Config<ImageProperties>, ComponentConfig
