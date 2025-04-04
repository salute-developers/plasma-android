package com.sdds.plugin.themebuilder.internal.components.chip

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.FloatValue
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class ChipProperties(
    val backgroundColor: Color? = null,
    val contentStartColor: Color? = null,
    val contentEndColor: Color? = null,
    val labelColor: Color? = null,
    val shape: Shape? = null,
    val labelStyle: Typography? = null,
    val height: Dimension? = null,
    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val contentStartSize: Dimension? = null,
    val contentStartPadding: Dimension? = null,
    val contentEndSize: Dimension? = null,
    val contentEndPadding: Dimension? = null,
    val disableAlpha: FloatValue? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? ChipProperties ?: return this
        return copy(
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            contentStartColor = contentStartColor ?: otherProps.contentStartColor,
            contentEndColor = contentEndColor ?: otherProps.contentEndColor,
            labelColor = labelColor ?: otherProps.labelColor,
            shape = shape ?: otherProps.shape,
            labelStyle = labelStyle ?: otherProps.labelStyle,
            height = height ?: otherProps.height,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            contentStartSize = contentStartSize ?: otherProps.contentStartSize,
            contentStartPadding = contentStartPadding ?: otherProps.contentStartPadding,
            contentEndSize = contentEndSize ?: otherProps.contentEndSize,
            contentEndPadding = contentEndPadding ?: otherProps.contentEndPadding,
            disableAlpha = disableAlpha ?: otherProps.disableAlpha,
        )
    }
}

@Serializable
internal data class ChipView(override val props: ChipProperties) :
    ViewVariation<ChipProperties> {
    override fun merge(parent: ViewVariation<ChipProperties>): ViewVariation<ChipProperties> =
        copy(props = props.merge(parent.props) as ChipProperties)
}

@Serializable
internal data class ChipVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, ChipView> = emptyMap(),
    override val props: ChipProperties,
) : ChildVariation<ChipProperties>

@Serializable
internal data class ChipConfig(
    override val view: Map<String, ChipView> = emptyMap(),
    override val props: ChipProperties,
    override val variations: List<ChipVariation> = emptyList(),
) : Config<ChipProperties>, ComponentConfig
