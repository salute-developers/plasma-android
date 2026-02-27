package com.sdds.plugin.themebuilder.internal.components.select

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.FloatValue
import com.sdds.plugin.themebuilder.internal.components.base.Icon
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Value
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.cell.CellProperties
import com.sdds.plugin.themebuilder.internal.components.checkbox.CheckBoxProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class SelectItemProperties(
    val shape: Shape? = null,
    val disableAlpha: FloatValue? = null,
    val icon: Icon? = null,
    val iconColor: Color? = null,
    val backgroundColor: Color? = null,
    val controlSize: Dimension? = null,
    val controlMargin: Dimension? = null,
    val paddingStart: Dimension? = null,
    val paddingEnd: Dimension? = null,
    val paddingTop: Dimension? = null,
    val paddingBottom: Dimension? = null,
    val height: Dimension? = null,
    val itemType: Value? = null,
    val checkboxStyle: ComponentStyle<CheckBoxProperties>? = null,
    val cellStyle: ComponentStyle<CellProperties>? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? SelectItemProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            disableAlpha = disableAlpha ?: otherProps.disableAlpha,
            icon = icon ?: otherProps.icon,
            iconColor = iconColor ?: otherProps.iconColor,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            controlSize = controlSize ?: otherProps.controlSize,
            controlMargin = controlMargin ?: otherProps.controlMargin,
            paddingStart = paddingStart ?: otherProps.paddingStart,
            paddingEnd = paddingEnd ?: otherProps.paddingEnd,
            paddingTop = paddingTop ?: otherProps.paddingTop,
            paddingBottom = paddingBottom ?: otherProps.paddingBottom,
            height = height ?: otherProps.height,
            itemType = itemType ?: otherProps.itemType,
            checkboxStyle = checkboxStyle ?: otherProps.checkboxStyle,
            cellStyle = cellStyle ?: otherProps.cellStyle,
        )
    }
}

@Serializable
internal data class SelectItemView(override val props: SelectItemProperties) :
    ViewVariation<SelectItemProperties> {
    override fun merge(parent: ViewVariation<SelectItemProperties>): ViewVariation<SelectItemProperties> =
        copy(props = props.merge(parent.props) as SelectItemProperties)
}

@Serializable
internal data class SelectItemVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, SelectItemView> = emptyMap(),
    override val props: SelectItemProperties,
) : ChildVariation<SelectItemProperties>

@Serializable
internal data class SelectItemConfig(
    override val view: Map<String, SelectItemView> = emptyMap(),
    override val props: SelectItemProperties,
    override val variations: List<SelectItemVariation> = emptyList(),
) : Config<SelectItemProperties>, ComponentConfig
