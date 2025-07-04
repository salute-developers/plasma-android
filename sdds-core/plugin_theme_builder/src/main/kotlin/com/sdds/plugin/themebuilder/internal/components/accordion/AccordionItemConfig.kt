package com.sdds.plugin.themebuilder.internal.components.accordion

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.FloatValue
import com.sdds.plugin.themebuilder.internal.components.base.Icon
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.Value
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class AccordionItemProperties(
    val shape: Shape? = null,
    val backgroundColor: Color? = null,
    val titleColor: Color? = null,
    val contentTextColor: Color? = null,
    val iconColor: Color? = null,
    val titleStyle: Typography? = null,
    val contentTextStyle: Typography? = null,
    val iconPlacement: Value? = null,
    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingBottom: Dimension? = null,
    val contentPaddingStart: Dimension? = null,
    val contentPaddingEnd: Dimension? = null,
    val contentPaddingTop: Dimension? = null,
    val contentPaddingBottom: Dimension? = null,
    val iconPadding: Dimension? = null,
    val iconRotation: FloatValue? = null,
    val closedIcon: Icon? = null,
    val openedIcon: Icon? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? AccordionItemProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            titleColor = titleColor ?: otherProps.titleColor,
            contentTextColor = contentTextColor ?: otherProps.contentTextColor,
            iconColor = iconColor ?: otherProps.iconColor,
            titleStyle = titleStyle ?: otherProps.titleStyle,
            contentTextStyle = contentTextStyle ?: otherProps.contentTextStyle,
            iconPlacement = iconPlacement ?: otherProps.iconPlacement,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            contentPaddingStart = contentPaddingStart ?: otherProps.contentPaddingStart,
            contentPaddingEnd = contentPaddingEnd ?: otherProps.contentPaddingEnd,
            contentPaddingTop = contentPaddingTop ?: otherProps.contentPaddingTop,
            contentPaddingBottom = contentPaddingBottom ?: otherProps.contentPaddingBottom,
            iconPadding = iconPadding ?: otherProps.iconPadding,
            iconRotation = iconRotation ?: otherProps.iconRotation,
            closedIcon = closedIcon ?: otherProps.closedIcon,
            openedIcon = openedIcon ?: otherProps.openedIcon,
        )
    }
}

@Serializable
internal data class AccordionItemView(override val props: AccordionItemProperties) :
    ViewVariation<AccordionItemProperties> {
    override fun merge(parent: ViewVariation<AccordionItemProperties>): ViewVariation<AccordionItemProperties> =
        copy(props = props.merge(parent.props) as AccordionItemProperties)
}

@Serializable
internal data class AccordionItemVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, AccordionItemView> = emptyMap(),
    override val props: AccordionItemProperties,
) : ChildVariation<AccordionItemProperties>

@Serializable
internal data class AccordionItemConfig(
    override val view: Map<String, AccordionItemView> = emptyMap(),
    override val props: AccordionItemProperties,
    override val variations: List<AccordionItemVariation> = emptyList(),
) : Config<AccordionItemProperties>, ComponentConfig
