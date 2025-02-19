package com.sdds.plugin.themebuilder.internal.components.cell

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.Icon
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class CellProperties(
    val labelColor: Color? = null,
    val titleColor: Color? = null,
    val subtitleColor: Color? = null,
    val disclosureTextColor: Color? = null,
    val disclosureIconColor: Color? = null,
    val contentPaddingStart: Dimension? = null,
    val contentPaddingEnd: Dimension? = null,
    val labelStyle: Typography? = null,
    val titleStyle: Typography? = null,
    val subtitleStyle: Typography? = null,
    val disclosureTextStyle: Typography? = null,
    val avatarStyle: ComponentStyle? = null,
    val iconButtonStyle: ComponentStyle? = null,
    val checkBoxStyle: ComponentStyle? = null,
    val radioBoxStyle: ComponentStyle? = null,
    val switchStyle: ComponentStyle? = null,
    val disclosureIcon: Icon? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? CellProperties ?: return this
        return copy(
            labelColor = labelColor ?: otherProps.labelColor,
            titleColor = titleColor ?: otherProps.titleColor,
            subtitleColor = subtitleColor ?: otherProps.subtitleColor,
            disclosureTextColor = disclosureTextColor ?: otherProps.disclosureTextColor,
            disclosureIconColor = disclosureIconColor ?: otherProps.disclosureIconColor,
            contentPaddingStart = contentPaddingStart ?: otherProps.contentPaddingStart,
            contentPaddingEnd = contentPaddingEnd ?: otherProps.contentPaddingEnd,
            labelStyle = labelStyle ?: otherProps.labelStyle,
            titleStyle = titleStyle ?: otherProps.titleStyle,
            subtitleStyle = subtitleStyle ?: otherProps.subtitleStyle,
            disclosureTextStyle = disclosureTextStyle ?: otherProps.disclosureTextStyle,
            avatarStyle = avatarStyle ?: otherProps.avatarStyle,
            iconButtonStyle = iconButtonStyle ?: otherProps.iconButtonStyle,
            checkBoxStyle = checkBoxStyle ?: otherProps.checkBoxStyle,
            radioBoxStyle = radioBoxStyle ?: otherProps.radioBoxStyle,
            switchStyle = switchStyle ?: otherProps.switchStyle,
        )
    }
}

@Serializable
internal data class CellView(override val props: CellProperties) :
    ViewVariation<CellProperties> {
    override fun merge(parent: ViewVariation<CellProperties>): ViewVariation<CellProperties> =
        copy(props = props.merge(parent.props) as CellProperties)
}

@Serializable
internal data class CellVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, CellView> = emptyMap(),
    override val props: CellProperties,
) : ChildVariation<CellProperties>

@Serializable
internal data class CellConfig(
    override val view: Map<String, CellView> = emptyMap(),
    override val props: CellProperties,
    override val variations: List<CellVariation> = emptyList(),
) : Config<CellProperties>, ComponentConfig
