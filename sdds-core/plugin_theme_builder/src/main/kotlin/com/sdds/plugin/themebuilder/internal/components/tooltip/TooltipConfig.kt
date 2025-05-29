package com.sdds.plugin.themebuilder.internal.components.tooltip

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shadow
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class TooltipProperties(
    val shape: Shape? = null,
    val shadow: Shadow? = null,
    val backgroundColor: Color? = null,
    val textStyle: Typography? = null,
    val textColor: Color? = null,
    val contentStartColor: Color? = null,

    val offset: Dimension? = null,
    val contentStartSize: Dimension? = null,
    val contentStartPadding: Dimension? = null,
    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingBottom: Dimension? = null,
    val tailWidth: Dimension? = null,
    val tailHeight: Dimension? = null,
    val tailPadding: Dimension? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? TooltipProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            shadow = shadow ?: otherProps.shadow,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            textStyle = textStyle ?: otherProps.textStyle,
            textColor = textColor ?: otherProps.textColor,
            contentStartColor = contentStartColor ?: otherProps.contentStartColor,
            offset = offset ?: otherProps.offset,
            contentStartSize = contentStartSize ?: otherProps.contentStartSize,
            contentStartPadding = contentStartPadding ?: otherProps.contentStartPadding,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            tailWidth = tailWidth ?: otherProps.tailWidth,
            tailHeight = tailHeight ?: otherProps.tailHeight,
            tailPadding = tailPadding ?: otherProps.tailPadding,
        )
    }
}

@Serializable
internal data class TooltipView(override val props: TooltipProperties) :
    ViewVariation<TooltipProperties> {
    override fun merge(parent: ViewVariation<TooltipProperties>): ViewVariation<TooltipProperties> =
        copy(props = props.merge(parent.props) as TooltipProperties)
}

@Serializable
internal data class TooltipVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, TooltipView> = emptyMap(),
    override val props: TooltipProperties,
) : ChildVariation<TooltipProperties>

@Serializable
internal data class TooltipConfig(
    override val view: Map<String, TooltipView> = emptyMap(),
    override val props: TooltipProperties,
    override val variations: List<TooltipVariation> = emptyList(),
) : Config<TooltipProperties>, ComponentConfig
