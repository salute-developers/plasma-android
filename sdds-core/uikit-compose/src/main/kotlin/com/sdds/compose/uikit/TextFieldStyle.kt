package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

val LocalTextFieldStyle = compositionLocalOf { TextFieldStyle.builder().style() }

@Stable
interface TextFieldStyle : Style {

    val dimensions: TextField.Dimensions
    val colors: TextFieldColors
    val shape: CornerBasedShape
    val fieldType: TextField.FieldType
    val fieldAppearance: TextField.FieldAppearance
    val labelPlacement: TextField.LabelPlacement
    val helperTextPlacement: TextField.HelperTextPlacement
    val chipContainerShape: CornerBasedShape?
    val scrollBar: ScrollBar?
    val labelStyle: TextStyle
    val optionalStyle: TextStyle
    val valueStyle: TextStyle
    val captionStyle: TextStyle
    val counterStyle: TextStyle
    val placeholderStyle: TextStyle
    val singleLine: Boolean
    val hasDivider: Boolean
    val dropInnerLabel: Boolean
    val chipGroupStyle: ChipGroupStyle

    companion object {

        /**
         * Возвращает экземпляр [TextFieldStyleBuilder]
         */
        fun builder(receiver: Any? = null): TextFieldStyleBuilder = DefaultTextFieldStyle.Builder(receiver)
    }
}

interface TextFieldStyleBuilder : StyleBuilder<TextFieldStyle> {

    fun dimensions(dimensions: TextField.Dimensions): TextFieldStyleBuilder

    @Composable
    fun colors(builder: @Composable TextFieldColorsBuilder.() -> Unit): TextFieldStyleBuilder

    fun shape(shape: CornerBasedShape): TextFieldStyleBuilder

    fun labelPlacement(labelPlacement: TextField.LabelPlacement): TextFieldStyleBuilder

    fun helperTextPlacement(helperTextPlacement: TextField.HelperTextPlacement): TextFieldStyleBuilder

    fun fieldType(fieldType: TextField.FieldType): TextFieldStyleBuilder

    fun fieldAppearance(fieldAppearance: TextField.FieldAppearance): TextFieldStyleBuilder

    fun scrollBar(scrollBar: ScrollBar?): TextFieldStyleBuilder

    fun chipContainerShape(chipContainerShape: CornerBasedShape): TextFieldStyleBuilder

    fun innerLabelStyle(innerLabelStyle: TextStyle): TextFieldStyleBuilder

    fun outerLabelStyle(outerLabelStyle: TextStyle): TextFieldStyleBuilder

    fun innerOptionalStyle(innerOptionalStyle: TextStyle): TextFieldStyleBuilder

    fun outerOptionalStyle(outerOptionalStyle: TextStyle): TextFieldStyleBuilder

    fun valueStyle(valueStyle: TextStyle): TextFieldStyleBuilder

    fun captionStyle(captionStyle: TextStyle): TextFieldStyleBuilder

    fun counterStyle(counterStyle: TextStyle): TextFieldStyleBuilder

    fun placeholderStyle(placeholderStyle: TextStyle): TextFieldStyleBuilder

    fun singleLine(singleLine: Boolean): TextFieldStyleBuilder

    fun hasDivider(hasDivider: Boolean): TextFieldStyleBuilder

    fun dropInnerLabel(dropInnerLabel: Boolean): TextFieldStyleBuilder

    fun chipGroupStyle(chipGroupStyle: ChipGroupStyle): TextFieldStyleBuilder
}

@Stable
interface TextFieldColors {

    val disabledAlpha: Float

    val enabledAlpha: Float

    val cursorColor: Color

    val indicatorColor: Color

    val startContentColor: InteractiveColor

    val endContentColor: Color

    fun labelColor(isReadOnly: Boolean, labelPlacement: TextField.LabelPlacement): Color

    fun valueColor(isReadOnly: Boolean): InteractiveColor

    fun captionColor(isReadOnly: Boolean): InteractiveColor

    val optionalColor: Color

    val counterColor: Color

    fun dividerColor(isReadOnly: Boolean): InteractiveColor

    fun placeholderColor(isReadOnly: Boolean): InteractiveColor

    fun backgroundColor(isReadOnly: Boolean): InteractiveColor

    companion object {

        fun builder(): TextFieldColorsBuilder = DefaultTextFieldColors.Builder()
    }
}

@Immutable
private class DefaultTextFieldStyle(
    override val dimensions: TextField.Dimensions,
    override val colors: TextFieldColors,
    override val shape: CornerBasedShape,
    override val fieldType: TextField.FieldType,
    override val fieldAppearance: TextField.FieldAppearance,
    override val labelPlacement: TextField.LabelPlacement,
    override val helperTextPlacement: TextField.HelperTextPlacement,
    override val chipContainerShape: CornerBasedShape?,
    override val scrollBar: ScrollBar?,
    override val valueStyle: TextStyle,
    override val captionStyle: TextStyle,
    override val counterStyle: TextStyle,
    override val placeholderStyle: TextStyle,
    override val singleLine: Boolean,
    override val hasDivider: Boolean,
    override val dropInnerLabel: Boolean,
    override val chipGroupStyle: ChipGroupStyle,
    private val innerLabelStyle: TextStyle,
    private val outerLabelStyle: TextStyle,
    private val innerOptionalStyle: TextStyle,
    private val outerOptionalStyle: TextStyle,
) : TextFieldStyle {

    override val labelStyle: TextStyle
        get() = when (labelPlacement) {
            TextField.LabelPlacement.Outer -> outerLabelStyle
            TextField.LabelPlacement.Inner -> innerLabelStyle
        }
    override val optionalStyle: TextStyle
        get() = when (labelPlacement) {
            TextField.LabelPlacement.Outer -> outerOptionalStyle
            TextField.LabelPlacement.Inner -> innerOptionalStyle
        }

    class Builder(override val receiver: Any?) : TextFieldStyleBuilder {

        private var colorsBuilder: TextFieldColorsBuilder = TextFieldColors.builder()
        private var dimensions: TextField.Dimensions? = null
        private var shape: CornerBasedShape? = null
        private var labelPlacement: TextField.LabelPlacement? = null
        private var helperTextPlacement: TextField.HelperTextPlacement? = null
        private var fieldType: TextField.FieldType? = null
        private var fieldAppearance: TextField.FieldAppearance? = null
        private var scrollBar: ScrollBar? = null
        private var chipContainerShape: CornerBasedShape? = null
        private var innerLabelStyle: TextStyle? = null
        private var outerLabelStyle: TextStyle? = null
        private var innerOptionalStyle: TextStyle? = null
        private var outerOptionalStyle: TextStyle? = null
        private var valueStyle: TextStyle? = null
        private var captionStyle: TextStyle? = null
        private var counterStyle: TextStyle? = null
        private var placeholderStyle: TextStyle? = null
        private var singleLine: Boolean? = null
        private var hasDivider: Boolean? = null
        private var dropInnerLabel: Boolean? = null
        private var chipGroupStyle: ChipGroupStyle? = null

        override fun dimensions(dimensions: TextField.Dimensions) = apply {
            this.dimensions = dimensions
        }

        @Composable
        override fun colors(builder: @Composable (TextFieldColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        override fun shape(shape: CornerBasedShape) = apply {
            this.shape = shape
        }

        override fun labelPlacement(labelPlacement: TextField.LabelPlacement) = apply {
            this.labelPlacement = labelPlacement
        }

        override fun helperTextPlacement(helperTextPlacement: TextField.HelperTextPlacement) =
            apply {
                this.helperTextPlacement = helperTextPlacement
            }

        override fun fieldType(fieldType: TextField.FieldType) = apply {
            this.fieldType = fieldType
        }

        override fun fieldAppearance(fieldAppearance: TextField.FieldAppearance) = apply {
            this.fieldAppearance = fieldAppearance
        }

        override fun scrollBar(scrollBar: ScrollBar?) = apply {
            this.scrollBar = scrollBar
        }

        override fun chipContainerShape(chipContainerShape: CornerBasedShape) = apply {
            this.chipContainerShape = chipContainerShape
        }

        override fun innerLabelStyle(innerLabelStyle: TextStyle) = apply {
            this.innerLabelStyle = innerLabelStyle
        }

        override fun outerLabelStyle(outerLabelStyle: TextStyle) = apply {
            this.outerLabelStyle = outerLabelStyle
        }

        override fun innerOptionalStyle(innerOptionalStyle: TextStyle) = apply {
            this.innerOptionalStyle = innerOptionalStyle
        }

        override fun outerOptionalStyle(outerOptionalStyle: TextStyle) = apply {
            this.outerOptionalStyle = outerOptionalStyle
        }


        override fun valueStyle(valueStyle: TextStyle) = apply {
            this.valueStyle = valueStyle
        }

        override fun captionStyle(captionStyle: TextStyle) = apply {
            this.captionStyle = captionStyle
        }

        override fun counterStyle(counterStyle: TextStyle) = apply {
            this.counterStyle = counterStyle
        }

        override fun placeholderStyle(placeholderStyle: TextStyle) = apply {
            this.placeholderStyle = placeholderStyle
        }

        override fun singleLine(singleLine: Boolean) = apply {
            this.singleLine = singleLine
        }

        override fun hasDivider(hasDivider: Boolean) = apply {
            this.hasDivider = hasDivider
        }

        override fun dropInnerLabel(dropInnerLabel: Boolean) = apply {
            this.dropInnerLabel = dropInnerLabel
        }

        override fun chipGroupStyle(chipGroupStyle: ChipGroupStyle) = apply {
            this.chipGroupStyle = chipGroupStyle
        }

        override fun style(): TextFieldStyle {
            return DefaultTextFieldStyle(
                dimensions = dimensions ?: TextField.Dimensions(),
                colors = colorsBuilder.build(),
                shape = shape ?: RoundedCornerShape(CornerSize(8.dp)),
                fieldType = fieldType ?: TextField.FieldType.Optional,
                fieldAppearance = fieldAppearance ?: TextField.FieldAppearance.Solid,
                labelPlacement = labelPlacement ?: TextField.LabelPlacement.Outer,
                helperTextPlacement = helperTextPlacement ?: TextField.HelperTextPlacement.Inner,
                chipContainerShape = chipContainerShape ?: RoundedCornerShape(15),
                scrollBar = scrollBar,
                innerLabelStyle = innerLabelStyle ?: TextStyle.Default,
                outerLabelStyle = outerLabelStyle ?: TextStyle.Default,
                innerOptionalStyle = innerOptionalStyle ?: TextStyle.Default,
                outerOptionalStyle = outerOptionalStyle ?: TextStyle.Default,
                valueStyle = valueStyle ?: TextStyle.Default,
                captionStyle = captionStyle ?: TextStyle.Default,
                counterStyle = counterStyle ?: TextStyle.Default,
                placeholderStyle = placeholderStyle ?: TextStyle.Default,
                singleLine = singleLine ?: true,
                hasDivider = hasDivider ?: true,
                dropInnerLabel = dropInnerLabel ?: false,
                chipGroupStyle = chipGroupStyle ?: ChipGroupStyle.builder().style()
            )
        }
    }
}

interface TextFieldColorsBuilder {

    fun disabledAlpha(disabledAlpha: Float)

    fun enabledAlpha(enabledAlpha: Float)

    fun cursorColor(cursorColor: Color)

    fun startContentColor(startContentColor: InteractiveColor)

    fun endContentColor(endContentColor: Color)

    fun innerLabelColor(innerLabelColor: Color)

    fun outerLabelColor(outerLabelColor: Color)

    fun outerLabelColorReadOnly(outerLabelColorReadOnly: Color)

    fun valueColor(valueColor: InteractiveColor)

    fun valueColorReadOnly(valueColorReadOnly: InteractiveColor)

    fun captionColor(captionColor: InteractiveColor)

    fun captionColorReadOnly(captionColorReadOnly: InteractiveColor)

    fun optionalColor(optionalColor: Color)

    fun counterColor(counterColor: Color)

    fun placeholderColor(placeholderColor: InteractiveColor)

    fun placeholderColorReadOnly(placeholderColorReadOnly: InteractiveColor)

    fun backgroundColor(backgroundColor: InteractiveColor)

    fun backgroundColorReadOnly(backgroundColorReadOnly: InteractiveColor)

    fun dividerColor(dividerColor: InteractiveColor)

    fun dividerColorReadOnly(dividerColorReadOnly: InteractiveColor)

    fun indicatorColor(indicatorColor: Color)

    fun build(): TextFieldColors
}

private class DefaultTextFieldColors(
    override val disabledAlpha: Float,
    override val enabledAlpha: Float,
    override val endContentColor: Color,
    override val optionalColor: Color,
    override val counterColor: Color,
    override val cursorColor: Color,
    override val indicatorColor: Color,
    override val startContentColor: InteractiveColor,
    private val innerLabelColor: Color,
    private val outerLabelColor: Color,
    private val outerLabelColorReadOnly: Color,
    private val valueColor: InteractiveColor,
    private val valueColorReadOnly: InteractiveColor,
    private val captionColor: InteractiveColor,
    private val captionColorReadOnly: InteractiveColor,
    private val placeholderColor: InteractiveColor,
    private val placeholderColorReadOnly: InteractiveColor,
    private val backgroundColor: InteractiveColor,
    private val backgroundColorReadOnly: InteractiveColor,
    private val dividerColor: InteractiveColor,
    private val dividerColorReadOnly: InteractiveColor,
) : TextFieldColors {

    override fun labelColor(
        isReadOnly: Boolean,
        labelPlacement: TextField.LabelPlacement
    ): Color {
        return when (labelPlacement) {
            TextField.LabelPlacement.Outer -> if (isReadOnly) outerLabelColorReadOnly else outerLabelColor
            TextField.LabelPlacement.Inner -> innerLabelColor
        }
    }

    override fun valueColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) valueColorReadOnly else valueColor
    }

    override fun captionColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) captionColorReadOnly else captionColor
    }

    override fun dividerColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) dividerColorReadOnly else dividerColor
    }

    override fun placeholderColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) placeholderColorReadOnly else placeholderColor
    }

    override fun backgroundColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) backgroundColorReadOnly else backgroundColor
    }

    class Builder : TextFieldColorsBuilder {
        private var disabledAlpha: Float? = null
        private var enabledAlpha: Float? = null
        private var cursorColor: Color? = null
        private var startContentColor: InteractiveColor? = null
        private var endContentColor: Color? = null
        private var innerLabelColor: Color? = null
        private var outerLabelColor: Color? = null
        private var outerLabelColorReadOnly: Color? = null
        private var valueColor: InteractiveColor? = null
        private var valueColorReadOnly: InteractiveColor? = null
        private var captionColor: InteractiveColor? = null
        private var captionColorReadOnly: InteractiveColor? = null
        private var optionalColor: Color? = null
        private var counterColor: Color? = null
        private var backgroundColor: InteractiveColor? = null
        private var backgroundColorReadOnly: InteractiveColor? = null
        private var placeholderColor: InteractiveColor? = null
        private var placeholderColorReadOnly: InteractiveColor? = null
        private var indicatorColor: Color? = null
        private var dividerColor: InteractiveColor? = null
        private var dividerColorReadOnly: InteractiveColor? = null

        override fun disabledAlpha(disabledAlpha: Float) {
            this.disabledAlpha = disabledAlpha
        }

        override fun enabledAlpha(enabledAlpha: Float) {
            this.enabledAlpha = enabledAlpha
        }

        override fun cursorColor(cursorColor: Color) {
            this.cursorColor = cursorColor
        }

        override fun startContentColor(startContentColor: InteractiveColor) {
            this.startContentColor = startContentColor
        }

        override fun endContentColor(endContentColor: Color) {
            this.endContentColor = endContentColor
        }

        override fun innerLabelColor(innerLabelColor: Color) {
            this.innerLabelColor = innerLabelColor
        }

        override fun outerLabelColor(outerLabelColor: Color) {
            this.outerLabelColor = outerLabelColor
        }

        override fun outerLabelColorReadOnly(outerLabelColorReadOnly: Color) {
            this.outerLabelColorReadOnly = outerLabelColorReadOnly
        }


        override fun valueColor(valueColor: InteractiveColor) {
            this.valueColor = valueColor
        }

        override fun valueColorReadOnly(valueColorReadOnly: InteractiveColor) {
            this.valueColorReadOnly = valueColorReadOnly
        }

        override fun captionColor(captionColor: InteractiveColor) {
            this.captionColor = captionColor
        }

        override fun captionColorReadOnly(captionColorReadOnly: InteractiveColor) {
            this.captionColorReadOnly = captionColorReadOnly
        }

        override fun optionalColor(optionalColor: Color) {
            this.optionalColor = optionalColor
        }

        override fun counterColor(counterColor: Color) {
            this.counterColor = counterColor
        }

        override fun placeholderColor(placeholderColor: InteractiveColor) {
            this.placeholderColor = placeholderColor
        }

        override fun placeholderColorReadOnly(placeholderColorReadOnly: InteractiveColor) {
            this.placeholderColorReadOnly = placeholderColorReadOnly
        }

        override fun backgroundColor(backgroundColor: InteractiveColor) {
            this.backgroundColor = backgroundColor
        }

        override fun backgroundColorReadOnly(backgroundColorReadOnly: InteractiveColor) {
            this.backgroundColorReadOnly = backgroundColorReadOnly
        }

        override fun dividerColor(dividerColor: InteractiveColor) {
            this.dividerColor = dividerColor
        }

        override fun dividerColorReadOnly(dividerColorReadOnly: InteractiveColor) {
            this.dividerColorReadOnly = dividerColorReadOnly
        }

        override fun indicatorColor(indicatorColor: Color) {
            this.indicatorColor = indicatorColor
        }

        override fun build(): TextFieldColors {
            return DefaultTextFieldColors(
                disabledAlpha = disabledAlpha ?: DEFAULT_DISABLED_ALPHA,
                enabledAlpha = enabledAlpha ?: DEFAULT_ENABLED_ALPHA,
                cursorColor = cursorColor ?: Color.Black,
                startContentColor = startContentColor ?: Color.Black.asInteractive(),
                endContentColor = endContentColor ?: Color.Black,
                innerLabelColor = innerLabelColor ?: Color.Black,
                outerLabelColor = outerLabelColor ?: Color.Black,
                outerLabelColorReadOnly = outerLabelColorReadOnly ?: Color.Black,
                valueColor = valueColor ?: Color.Black.asInteractive(),
                valueColorReadOnly = valueColorReadOnly ?: Color.Black.asInteractive(),
                captionColor = captionColor ?: Color.Black.asInteractive(),
                captionColorReadOnly = captionColorReadOnly ?: Color.Black.asInteractive(),
                optionalColor = optionalColor ?: Color.Black,
                counterColor = counterColor ?: Color.Black,
                backgroundColor = backgroundColor ?: Color.LightGray.asInteractive(),
                backgroundColorReadOnly = backgroundColorReadOnly
                    ?: Color.LightGray.asInteractive(),
                placeholderColor = placeholderColor ?: Color.Gray.asInteractive(),
                placeholderColorReadOnly = placeholderColorReadOnly ?: Color.Gray.asInteractive(),
                indicatorColor = indicatorColor ?: Color.Red,
                dividerColor = dividerColor ?: Color.Gray.asInteractive(),
                dividerColorReadOnly = dividerColorReadOnly ?: Color.Gray.asInteractive(),
            )
        }
    }
}

private const val DEFAULT_DISABLED_ALPHA = 0.4f
private const val DEFAULT_ENABLED_ALPHA = 1f
