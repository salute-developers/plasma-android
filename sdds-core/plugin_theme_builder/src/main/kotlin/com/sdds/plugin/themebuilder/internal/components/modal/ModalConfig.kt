package com.sdds.plugin.themebuilder.internal.components.modal

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shadow
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.overlay.OverlayProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class ModalProperties(
    val shape: Shape? = null,
    val shadow: Shadow? = null,
    val backgroundColor: Color? = null,
    val closeColor: Color? = null,
    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingBottom: Dimension? = null,
    val closeSize: Dimension? = null,
    val overlayStyle: ComponentStyle<OverlayProperties>? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? ModalProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            shadow = shadow ?: otherProps.shadow,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            closeColor = closeColor ?: otherProps.closeColor,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            closeSize = closeSize ?: otherProps.closeSize,
            overlayStyle = overlayStyle ?: otherProps.overlayStyle,
        )
    }
}

@Serializable
internal data class ModalView(override val props: ModalProperties) :
    ViewVariation<ModalProperties> {
    override fun merge(parent: ViewVariation<ModalProperties>): ViewVariation<ModalProperties> =
        copy(props = props.merge(parent.props) as ModalProperties)
}

@Serializable
internal data class ModalVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, ModalView> = emptyMap(),
    override val props: ModalProperties,
) : ChildVariation<ModalProperties>

@Serializable
internal data class ModalConfig(
    override val view: Map<String, ModalView> = emptyMap(),
    override val props: ModalProperties,
    override val variations: List<ModalVariation> = emptyList(),
) : Config<ModalProperties>, ComponentConfig
