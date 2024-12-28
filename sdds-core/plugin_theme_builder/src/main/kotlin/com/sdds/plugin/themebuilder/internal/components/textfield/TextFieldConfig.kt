package com.sdds.plugin.themebuilder.internal.components.textfield

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.ChildVariation
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.Value
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

@Serializable
internal data class TextFieldProperties(
    // field box
    val shape: Shape? = null, // not clear only
    val boxPaddingStart: Dimension? = null,
    val boxPaddingEnd: Dimension? = null,
    val boxPaddingTop: Dimension? = null,
    val boxPaddingBottom: Dimension? = null,
    val boxMinHeight: Dimension? = null,
    val alignmentMinHeight: Dimension? = null,

    // chips
    val chipGroupStyle: ComponentStyle? = null,
    val chipStyle: ComponentStyle? = null,
    val chipsPadding: Dimension? = null,

    // label
    val labelPlacement: Value? = null,
    val labelPadding: Dimension? = null,
    val labelStyle: Typography? = null,
    val labelColor: Color? = null,
    val labelColorReadOnly: Color? = null,

    // optional
    val optionalStyle: Typography? = null,
    val optionalColor: Color? = null,
    val optionalPadding: Dimension? = null,

    // value
    val valueStyle: Typography? = null,
    val valueColor: Color? = null,
    val valueColorReadOnly: Color? = null,

    // placeholder
    val placeholderStyle: Typography? = null,
    val placeholderColor: Color? = null,
    val placeholderColorReadOnly: Color? = null,

    // indicator
    val fieldType: Value? = null,
    val indicatorSize: Dimension? = null,
    val indicatorOffsetX: Dimension? = null,
    val indicatorOffsetY: Dimension? = null,
    val indicatorColor: Color? = null,

    // divider (clear only)
    val dividerColor: Color? = null,
    val dividerHeight: Dimension? = null,

    // start content
    val startContentSize: Dimension? = null,
    val startContentPadding: Dimension? = null,
    val startContentColor: Color? = null,

    // end content
    val endContentSize: Dimension? = null,
    val endContentPadding: Dimension? = null,
    val endContentColor: Color? = null,

    // helper text
    val helperTextPadding: Dimension? = null,
    val captionPlacement: Value? = null,
    val captionStyle: Typography? = null,
    val captionColor: Color? = null,
    val captionColorReadOnly: Color? = null,
    val counterPlacement: Value? = null,
    val counterStyle: Typography? = null,
    val counterColor: Color? = null,

    // background (not clear only)
    val backgroundColor: Color? = null,
    val backgroundColorReadOnly: Color? = null,

    // cursor
    val cursorColor: Color? = null,

    // scrollBar (text area only)
    val scrollBarThickness: Dimension? = null,
    val scrollBarPaddingTop: Dimension? = null,
    val scrollBarPaddingBottom: Dimension? = null,
    val scrollBarPaddingEnd: Dimension? = null,
    val scrollBarTrackColor: Color? = null,
    val scrollBarThumbColor: Color? = null,
) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    override fun merge(parent: PropertyOwner): PropertyOwner {
        val otherProps = parent as? TextFieldProperties ?: return this
        return copy(
            shape = shape ?: otherProps.shape,
            boxPaddingStart = boxPaddingStart ?: otherProps.boxPaddingStart,
            boxPaddingEnd = boxPaddingEnd ?: otherProps.boxPaddingEnd,
            boxPaddingTop = boxPaddingTop ?: otherProps.boxPaddingTop,
            boxPaddingBottom = boxPaddingBottom ?: otherProps.boxPaddingBottom,
            boxMinHeight = boxMinHeight ?: otherProps.boxMinHeight,
            alignmentMinHeight = alignmentMinHeight ?: otherProps.alignmentMinHeight,
            chipGroupStyle = chipGroupStyle ?: otherProps.chipGroupStyle,
            chipStyle = chipStyle ?: otherProps.chipStyle,
            chipsPadding = chipsPadding ?: otherProps.chipsPadding,
            labelPlacement = labelPlacement ?: otherProps.labelPlacement,
            labelPadding = labelPadding ?: otherProps.labelPadding,
            labelStyle = labelStyle ?: otherProps.labelStyle,
            labelColor = labelColor ?: otherProps.labelColor,
            labelColorReadOnly = labelColorReadOnly ?: otherProps.labelColorReadOnly,
            optionalStyle = optionalStyle ?: otherProps.optionalStyle,
            optionalColor = optionalColor ?: otherProps.optionalColor,
            optionalPadding = optionalPadding ?: otherProps.optionalPadding,
            valueStyle = valueStyle ?: otherProps.valueStyle,
            valueColor = valueColor ?: otherProps.valueColor,
            valueColorReadOnly = valueColorReadOnly ?: otherProps.valueColorReadOnly,
            placeholderStyle = placeholderStyle ?: otherProps.placeholderStyle,
            placeholderColor = placeholderColor ?: otherProps.placeholderColor,
            placeholderColorReadOnly = placeholderColorReadOnly ?: otherProps.placeholderColorReadOnly,
            fieldType = fieldType ?: otherProps.fieldType,
            indicatorSize = indicatorSize ?: otherProps.indicatorSize,
            indicatorOffsetX = indicatorOffsetX ?: otherProps.indicatorOffsetX,
            indicatorOffsetY = indicatorOffsetY ?: otherProps.indicatorOffsetY,
            indicatorColor = indicatorColor ?: otherProps.indicatorColor,
            startContentSize = startContentSize ?: otherProps.startContentSize,
            startContentPadding = startContentPadding ?: otherProps.startContentPadding,
            startContentColor = startContentColor ?: otherProps.startContentColor,
            endContentSize = endContentSize ?: otherProps.endContentSize,
            endContentPadding = endContentPadding ?: otherProps.endContentPadding,
            endContentColor = endContentColor ?: otherProps.endContentColor,
            helperTextPadding = helperTextPadding ?: otherProps.helperTextPadding,
            captionPlacement = captionPlacement ?: otherProps.captionPlacement,
            captionStyle = captionStyle ?: otherProps.captionStyle,
            captionColor = captionColor ?: otherProps.captionColor,
            captionColorReadOnly = captionColorReadOnly ?: otherProps.captionColorReadOnly,
            counterPlacement = counterPlacement ?: otherProps.counterPlacement,
            counterStyle = counterStyle ?: otherProps.counterStyle,
            counterColor = counterColor ?: otherProps.counterColor,
            backgroundColor = backgroundColor ?: otherProps.backgroundColor,
            backgroundColorReadOnly = backgroundColorReadOnly ?: otherProps.backgroundColorReadOnly,
            cursorColor = cursorColor ?: otherProps.cursorColor,
        )
    }
}

@Serializable
internal data class TextFieldView(override val props: TextFieldProperties) : ViewVariation<TextFieldProperties> {
    override fun merge(parent: ViewVariation<TextFieldProperties>): ViewVariation<TextFieldProperties> =
        copy(props = props.merge(parent.props) as TextFieldProperties)
}

@Serializable
internal data class TextFieldVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, TextFieldView> = emptyMap(),
    override val props: TextFieldProperties,
) : ChildVariation<TextFieldProperties>

@Serializable
internal data class TextFieldConfig(
    override val view: Map<String, TextFieldView> = emptyMap(),
    override val props: TextFieldProperties,
    override val variations: List<TextFieldVariation> = emptyList(),
) : Config<TextFieldProperties>, ComponentConfig
