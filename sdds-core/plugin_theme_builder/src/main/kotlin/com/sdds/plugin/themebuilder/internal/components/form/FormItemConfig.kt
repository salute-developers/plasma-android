package com.sdds.plugin.themebuilder.internal.components.form

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.FloatValue
import com.sdds.plugin.themebuilder.internal.components.base.Icon
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.Value
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import com.sdds.plugin.themebuilder.internal.components.indicator.IndicatorProperties
import kotlinx.serialization.Serializable

@Serializable
internal data class FormItemProperties(
    val formItemType: Value? = null,
    val disableAlpha: FloatValue? = null,

    val hintIcon: Icon? = null,
    val hintColor: Color? = null,
    val hintWidth: Dimension? = null,
    val hintHeight: Dimension? = null,

    val optionalStyle: Typography? = null,
    val optionalColor: Color? = null,

    val titleBlockWidth: Dimension? = null,
    val titleBlockPadding: Dimension? = null,
    val titleStyle: Typography? = null,
    val titleColor: Color? = null,
    val titlePlacement: Value? = null,
    val titleBlockSpacing: Dimension? = null,

    val titleCaptionPadding: Dimension? = null,
    val titleCaptionStyle: Typography? = null,
    val titleCaptionColor: Color? = null,

    val captionPadding: Dimension? = null,
    val captionStyle: Typography? = null,
    val captionColor: Color? = null,

    val counterStyle: Typography? = null,
    val counterColor: Color? = null,
    val counterPadding: Dimension? = null,

    val bottomTextAlignment: Value? = null,

    val indicatorOffsetX: Dimension? = null,
    val indicatorOffsetY: Dimension? = null,
    val indicatorAlignmentMode: Value? = null,
    val indicatorAlignment: Value? = null,
    val indicatorStyle: ComponentStyle<IndicatorProperties>? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod", "LongMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? FormItemProperties ?: return this
        return copy(
            formItemType = formItemType ?: otherProps.formItemType,
            disableAlpha = disableAlpha ?: otherProps.disableAlpha,
            hintIcon = hintIcon ?: otherProps.hintIcon,
            hintHeight = hintHeight ?: otherProps.hintHeight,
            hintWidth = hintWidth ?: otherProps.hintWidth,
            hintColor = hintColor ?: otherProps.hintColor,
            titleBlockWidth = titleBlockWidth ?: otherProps.titleBlockWidth,
            titlePlacement = titlePlacement ?: otherProps.titlePlacement,
            titleBlockPadding = titleBlockPadding ?: otherProps.titleBlockPadding,
            titleStyle = titleStyle ?: otherProps.titleStyle,
            titleColor = titleColor ?: otherProps.titleColor,
            optionalStyle = optionalStyle ?: otherProps.optionalStyle,
            optionalColor = optionalColor ?: otherProps.optionalColor,
            titleBlockSpacing = titleBlockSpacing ?: otherProps.titleBlockSpacing,
            titleCaptionPadding = titleCaptionPadding ?: otherProps.titleCaptionPadding,
            titleCaptionStyle = titleCaptionStyle ?: otherProps.titleCaptionStyle,
            titleCaptionColor = titleCaptionColor ?: otherProps.titleCaptionColor,
            captionPadding = captionPadding ?: otherProps.captionPadding,
            captionStyle = captionStyle ?: otherProps.captionStyle,
            captionColor = captionColor ?: otherProps.captionColor,
            counterStyle = counterStyle ?: otherProps.counterStyle,
            counterColor = counterColor ?: otherProps.counterColor,
            bottomTextAlignment = bottomTextAlignment ?: otherProps.bottomTextAlignment,
            indicatorOffsetX = indicatorOffsetX ?: otherProps.indicatorOffsetX,
            indicatorOffsetY = indicatorOffsetY ?: otherProps.indicatorOffsetY,
            indicatorAlignmentMode = indicatorAlignmentMode ?: otherProps.indicatorAlignmentMode,
            indicatorAlignment = indicatorAlignment ?: otherProps.indicatorAlignment,
            indicatorStyle = indicatorStyle ?: otherProps.indicatorStyle,
        )
    }
}

@Serializable
internal data class FormItemView(override val props: FormItemProperties) :
    ViewVariation<FormItemProperties> {
    override fun merge(parent: ViewVariation<FormItemProperties>): ViewVariation<FormItemProperties> =
        copy(props = props.merge(parent.props) as FormItemProperties)
}

@Serializable
internal data class FormItemVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, FormItemView> = emptyMap(),
    override val props: FormItemProperties,
) : ChildVariation<FormItemProperties>

@Serializable
internal data class FormItemConfig(
    override val view: Map<String, FormItemView> = emptyMap(),
    override val props: FormItemProperties,
    override val variations: List<FormItemVariation> = emptyList(),
) : Config<FormItemProperties>, ComponentConfig
