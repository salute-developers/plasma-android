package com.sdds.plugin.themebuilder.internal.components.wheel

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.Icon
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.Value
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.divider.DividerProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class WheelProperties(
    val itemTextStyle: Typography? = null,
    val itemTextAfterStyle: Typography? = null,
    val descriptionStyle: Typography? = null,
    val itemTextAfterPadding: Dimension? = null,
    val descriptionPadding: Dimension? = null,
    val separatorSpacing: Dimension? = null,
    val itemMinSpacing: Dimension? = null,
    val itemAlignment: Value? = null,
    val wheelCount: Value? = null,
    val visibleItemsCount: Value? = null,
    val itemTextColor: Color? = null,
    val itemTextAfterColor: Color? = null,
    val descriptionColor: Color? = null,
    val controlIconUpColor: Color? = null,
    val controlIconDownColor: Color? = null,
    val separatorColor: Color? = null,
    val controlIconUp: Icon? = null,
    val controlIconDown: Icon? = null,
    val dividerStyle: ComponentStyle<DividerProperties>? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? WheelProperties ?: return this
        return copy(
            itemTextStyle = itemTextStyle ?: otherProps.itemTextStyle,
            itemTextAfterStyle = itemTextAfterStyle ?: otherProps.itemTextAfterStyle,
            descriptionStyle = descriptionStyle ?: otherProps.descriptionStyle,
            itemTextAfterPadding = itemTextAfterPadding ?: otherProps.itemTextAfterPadding,
            descriptionPadding = descriptionPadding ?: otherProps.descriptionPadding,
            separatorSpacing = separatorSpacing ?: otherProps.separatorSpacing,
            itemMinSpacing = itemMinSpacing ?: otherProps.itemMinSpacing,
            itemAlignment = itemAlignment ?: otherProps.itemAlignment,
            wheelCount = wheelCount ?: otherProps.wheelCount,
            visibleItemsCount = visibleItemsCount ?: otherProps.visibleItemsCount,
            itemTextColor = itemTextColor ?: otherProps.itemTextColor,
            itemTextAfterColor = itemTextAfterColor ?: otherProps.itemTextAfterColor,
            descriptionColor = descriptionColor ?: otherProps.descriptionColor,
            controlIconUpColor = controlIconUpColor ?: otherProps.controlIconUpColor,
            controlIconDownColor = controlIconDownColor ?: otherProps.controlIconDownColor,
            separatorColor = separatorColor ?: otherProps.separatorColor,
            controlIconUp = controlIconUp ?: otherProps.controlIconUp,
            controlIconDown = controlIconDown ?: otherProps.controlIconDown,
        )
    }
}

@Serializable
internal data class WheelView(
    override val props: WheelProperties,
) : ViewVariation<WheelProperties> {
    override fun merge(parent: ViewVariation<WheelProperties>): ViewVariation<WheelProperties> =
        copy(props = props.merge(parent.props) as WheelProperties)
}

@Serializable
internal data class WheelVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, WheelView> = emptyMap(),
    override val props: WheelProperties,
) : ChildVariation<WheelProperties>

@Serializable
internal data class WheelConfig(
    override val view: Map<String, WheelView> = emptyMap(),
    override val props: WheelProperties,
    override val variations: List<WheelVariation> = emptyList(),
) : Config<WheelProperties>, ComponentConfig
