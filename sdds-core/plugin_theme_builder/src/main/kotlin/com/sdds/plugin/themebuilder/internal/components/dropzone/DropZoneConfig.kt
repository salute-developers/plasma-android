package com.sdds.plugin.themebuilder.internal.components.dropzone

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.Binding
import com.sdds.plugin.themebuilder.internal.components.base.Bindings
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.FloatValue
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.Value
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.overlay.OverlayProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class DropZoneProperties(
    val shape: Shape? = null,

    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingBottom: Dimension? = null,
    val iconSize: Dimension? = null,
    val iconPadding: Dimension? = null,
    val borderThickness: Dimension? = null,
    val borderDashWidth: Dimension? = null,
    val borderDashGap: Dimension? = null,
    val gap: Dimension? = null,

    val borderType: Value? = null,
    val iconPlacement: Value? = null,

    val backgroundColor: Color? = null,
    val iconColor: Color? = null,
    val titleColor: Color? = null,
    val descriptionColor: Color? = null,
    val borderColor: Color? = null,

    val titleStyle: Typography? = null,
    val descriptionStyle: Typography? = null,

    val overlayStyle: ComponentStyle<OverlayProperties>? = null,
    val disableAlpha: FloatValue? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? DropZoneProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            iconSize = iconSize ?: otherProps.iconSize,
            iconPadding = iconPadding ?: otherProps.iconPadding,
            borderThickness = borderThickness ?: otherProps.borderThickness,
            borderDashWidth = borderDashWidth ?: otherProps.borderDashWidth,
            borderDashGap = borderDashGap ?: otherProps.borderDashGap,
            gap = gap ?: otherProps.gap,
            borderType = borderType ?: otherProps.borderType,
            iconPlacement = iconPlacement ?: otherProps.iconPlacement,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            iconColor = iconColor ?: otherProps.iconColor,
            titleColor = titleColor ?: otherProps.titleColor,
            descriptionColor = descriptionColor ?: otherProps.descriptionColor,
            borderColor = borderColor ?: otherProps.borderColor,
            titleStyle = titleStyle ?: otherProps.titleStyle,
            descriptionStyle = descriptionStyle ?: otherProps.descriptionStyle,
            overlayStyle = overlayStyle ?: otherProps.overlayStyle,
            disableAlpha = disableAlpha ?: otherProps.disableAlpha,
        )
    }
}

@Serializable
internal data class DropZoneView(
    override val props: DropZoneProperties,
    override val binding: List<Binding>? = null,
) :
    ViewVariation<DropZoneProperties> {
    override fun merge(parent: ViewVariation<DropZoneProperties>): ViewVariation<DropZoneProperties> =
        copy(props = props.merge(parent.props) as DropZoneProperties, binding = binding ?: parent.binding)
}

@Serializable
internal data class DropZoneVariation(
    override val id: String,
    override val parent: String? = null,
    override val binding: List<Binding>? = null,
    override val view: Map<String, DropZoneView> = emptyMap(),
    override val props: DropZoneProperties,
) : ChildVariation<DropZoneProperties>

@Serializable
internal data class DropZoneConfig(
    override val view: Map<String, DropZoneView> = emptyMap(),
    override val props: DropZoneProperties,
    override val variations: List<DropZoneVariation> = emptyList(),
    override val bindings: List<Bindings> = emptyList(),
) : Config<DropZoneProperties>, ComponentConfig
