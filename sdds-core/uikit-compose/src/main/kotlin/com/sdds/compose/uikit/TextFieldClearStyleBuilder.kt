package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [TextFieldStyle] для компонента [TextField]
 */
val LocalTextFieldClearStyle = compositionLocalOf { TextFieldStyle.textFieldClearBuilder().style() }

/**
 * Возвращает экземпляр [TextFieldClearStyleBuilder]
 */
fun TextFieldStyle.Companion.textFieldClearBuilder(receiver: Any? = null): TextFieldClearStyleBuilder {
    return DefaultTextFieldClearStyle.Builder(receiver)
}

/**
 * Билдер стиля [TextFieldStyle]
 */
interface TextFieldClearStyleBuilder : StyleBuilder<TextFieldStyle> {

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     */
    @Composable
    fun dimensions(builder: @Composable TextFieldClearDimensionsBuilder.() -> Unit): TextFieldClearStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     */
    @Deprecated("Use dimensions() with builder instead")
    @Composable
    fun dimensions(dimensions: TextField.Dimensions): TextFieldClearStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder]
     */
    @Composable
    fun colors(builder: @Composable TextFieldClearColorsBuilder.() -> Unit): TextFieldClearStyleBuilder

    /**
     * Устанавливает расположение лэйбла [labelPlacement]
     */
    fun labelPlacement(labelPlacement: TextField.LabelPlacement): TextFieldClearStyleBuilder

    /**
     * Устанавливает тип поля [fieldType]
     */
    fun fieldType(fieldType: TextField.FieldType): TextFieldClearStyleBuilder

    /**
     * Устанавливает стиль лэйбла [labelStyle]
     */
    fun labelStyle(labelStyle: TextStyle): TextFieldClearStyleBuilder

    /**
     * Устанавливает стиль optional текста [optionalStyle]
     */
    fun optionalStyle(optionalStyle: TextStyle): TextFieldClearStyleBuilder

    /**
     * Устанавливает стиль основного текста [valueStyle]
     */
    fun valueStyle(valueStyle: TextStyle): TextFieldClearStyleBuilder

    /**
     * Устанавливает стиль надписи [captionStyle]
     */
    fun captionStyle(captionStyle: TextStyle): TextFieldClearStyleBuilder

    /**
     * Устанавливает стиль счетчика [counterStyle]
     */
    fun counterStyle(counterStyle: TextStyle): TextFieldClearStyleBuilder

    /**
     * Устанавливает стиль плэйсхолдера [placeholderStyle]
     */
    fun placeholderStyle(placeholderStyle: TextStyle): TextFieldClearStyleBuilder

    /**
     * Устанавливает наличие разделителя [hasDivider]
     */
    fun hasDivider(hasDivider: Boolean): TextFieldClearStyleBuilder

    /**
     * Устанавливает стиль группы чипов [chipGroupStyle]
     */
    fun chipGroupStyle(chipGroupStyle: ChipGroupStyle): TextFieldClearStyleBuilder

    /**
     * Устанавливает стиль чипов [chipStyle]
     */
    fun chipStyle(chipStyle: ChipStyle): TextFieldClearStyleBuilder
}

/**
 * Билдер цветов [TextFieldColors]
 */
interface TextFieldClearColorsBuilder {

    /**
     * Устанавливает альфу [disabledAlpha] в состоянии disabled
     */
    fun disabledAlpha(disabledAlpha: Float): TextFieldClearColorsBuilder

    /**
     * Устанавливает цвет курсора [cursorColor]
     */
    fun cursorColor(cursorColor: Color): TextFieldClearColorsBuilder =
        cursorColor(cursorColor.asInteractive())

    /**
     * Устанавливает цвет курсора [cursorColor]
     */
    fun cursorColor(cursorColor: InteractiveColor): TextFieldClearColorsBuilder

    /**
     * Устанавливает цвет контента в начале [startContentColor]
     */
    fun startContentColor(startContentColor: Color): TextFieldClearColorsBuilder =
        startContentColor(startContentColor.asInteractive())

    /**
     * Устанавливает цвет контента в начале [startContentColor]
     */
    fun startContentColor(startContentColor: InteractiveColor): TextFieldClearColorsBuilder

    /**
     * Устанавливает цвет контента в конце [endContentColor]
     */
    fun endContentColor(endContentColor: Color): TextFieldClearColorsBuilder =
        endContentColor(endContentColor.asInteractive())

    /**
     * Устанавливает цвет контента в конце [endContentColor]
     */
    fun endContentColor(endContentColor: InteractiveColor): TextFieldClearColorsBuilder

    /**
     * Устанавливает цвет лэйбла [labelColor]
     */
    fun labelColor(labelColor: Color): TextFieldClearColorsBuilder =
        this.labelColor(labelColor.asInteractive())

    /**
     * Устанавливает цвет лэйбла [labelColor]
     */
    fun labelColor(labelColor: InteractiveColor): TextFieldClearColorsBuilder

    /**
     * Устанавливает цвет лэйбла в состоянии readOnly [labelColorReadOnly]
     */
    fun labelColorReadOnly(labelColorReadOnly: Color): TextFieldClearColorsBuilder =
        this.labelColorReadOnly(labelColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет лэйбла в состоянии readOnly [labelColorReadOnly]
     */
    fun labelColorReadOnly(labelColorReadOnly: InteractiveColor): TextFieldClearColorsBuilder

    /**
     * Устанавливает цвет основного текста [valueColor]
     */
    fun valueColor(valueColor: Color): TextFieldClearColorsBuilder =
        valueColor(valueColor.asInteractive())

    /**
     * Устанавливает цвет основного текста [valueColor]
     */
    fun valueColor(valueColor: InteractiveColor): TextFieldClearColorsBuilder

    /**
     * Устанавливает цвет основного текста в состоянии readOnly [valueColorReadOnly]
     */
    fun valueColorReadOnly(valueColorReadOnly: Color): TextFieldClearColorsBuilder =
        valueColorReadOnly(valueColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет основного текста в состоянии readOnly [valueColorReadOnly]
     */
    fun valueColorReadOnly(valueColorReadOnly: InteractiveColor): TextFieldClearColorsBuilder

    /**
     * Устанавливает цвет надписи [captionColor]
     */
    fun captionColor(captionColor: Color): TextFieldClearColorsBuilder =
        captionColor(captionColor.asInteractive())

    /**
     * Устанавливает цвет надписи [captionColor]
     */
    fun captionColor(captionColor: InteractiveColor): TextFieldClearColorsBuilder

    /**
     * Устанавливает цвет надписи в состоянии readOnly [captionColorReadOnly]
     */
    fun captionColorReadOnly(captionColorReadOnly: Color): TextFieldClearColorsBuilder =
        captionColorReadOnly(captionColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет надписи в состоянии readOnly [captionColorReadOnly]
     */
    fun captionColorReadOnly(captionColorReadOnly: InteractiveColor): TextFieldClearColorsBuilder

    /**
     * Устанавливает цвет опционального текста [optionalColor]
     */
    fun optionalColor(optionalColor: Color): TextFieldClearColorsBuilder =
        optionalColor(optionalColor.asInteractive())

    /**
     * Устанавливает цвет опционального текста [optionalColor]
     */
    fun optionalColor(optionalColor: InteractiveColor): TextFieldClearColorsBuilder

    /**
     * Устанавливает цвет счетчика [counterColor]
     */
    fun counterColor(counterColor: Color): TextFieldClearColorsBuilder =
        counterColor(counterColor.asInteractive())

    /**
     * Устанавливает цвет счетчика [counterColor]
     */
    fun counterColor(counterColor: InteractiveColor): TextFieldClearColorsBuilder

    /**
     * Устанавливает цвет плэйсхолдера [placeholderColor]
     */
    fun placeholderColor(placeholderColor: Color): TextFieldClearColorsBuilder =
        placeholderColor(placeholderColor.asInteractive())

    /**
     * Устанавливает цвет плэйсхолдера [placeholderColor]
     */
    fun placeholderColor(placeholderColor: InteractiveColor): TextFieldClearColorsBuilder

    /**
     * Устанавливает цвет плэйсхолдеоа в состоянии readOnly [placeholderColorReadOnly]
     */
    fun placeholderColorReadOnly(placeholderColorReadOnly: Color): TextFieldClearColorsBuilder =
        placeholderColorReadOnly(placeholderColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет плэйсхолдеоа в состоянии readOnly [placeholderColorReadOnly]
     */
    fun placeholderColorReadOnly(placeholderColorReadOnly: InteractiveColor): TextFieldClearColorsBuilder

    /**
     * Устанавливает цвет разделителя [dividerColor]
     */
    fun dividerColor(dividerColor: Color): TextFieldClearColorsBuilder =
        dividerColor(dividerColor.asInteractive())

    /**
     * Устанавливает цвет разделителя [dividerColor]
     */
    fun dividerColor(dividerColor: InteractiveColor): TextFieldClearColorsBuilder

    /**
     * Устанавливает цвет разделителя в состоянии readOnlu [dividerColorReadOnly]
     */
    fun dividerColorReadOnly(dividerColorReadOnly: Color): TextFieldClearColorsBuilder =
        dividerColorReadOnly(dividerColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет разделителя в состоянии readOnlu [dividerColorReadOnly]
     */
    fun dividerColorReadOnly(dividerColorReadOnly: InteractiveColor): TextFieldClearColorsBuilder

    /**
     * Устанавливает цвет индикатора
     */
    fun indicatorColor(indicatorColor: Color): TextFieldClearColorsBuilder =
        indicatorColor(indicatorColor.asInteractive())

    /**
     * Устанавливает цвет индикатора
     */
    fun indicatorColor(indicatorColor: InteractiveColor): TextFieldClearColorsBuilder

    /**
     * Вернет экземпляр [TextFieldColors]
     */
    fun build(): TextFieldColors

    companion object {

        /**
         * Вернет экземпляр билдера [TextFieldClearColorsBuilder]
         */
        fun builder(): TextFieldClearColorsBuilder = DefaultTextFieldClearColors.Builder()
    }
}

/**
 * Билдер размеров для [TextField]
 */
interface TextFieldClearDimensionsBuilder {

    /**
     * Устанавливает отступ контента в начале
     */
    fun boxPaddingStart(boxPaddingStart: Dp): TextFieldClearDimensionsBuilder

    /**
     * Устанавливает отступ контента в конце
     */
    fun boxPaddingEnd(boxPaddingEnd: Dp): TextFieldClearDimensionsBuilder

    /**
     * Устанавливает верхний отступ контента
     */
    fun boxPaddingTop(boxPaddingTop: Dp): TextFieldClearDimensionsBuilder

    /**
     * Устанавливает нижний отступ контента
     */
    fun boxPaddingBottom(boxPaddingBottom: Dp): TextFieldClearDimensionsBuilder

    /**
     * Устанавливает нижний отступ лэйбла
     */
    fun labelPadding(labelPadding: Dp): TextFieldClearDimensionsBuilder

    /**
     * Устанавливает отступ в начале optional текста
     */
    fun optionalPadding(optionalPadding: Dp): TextFieldClearDimensionsBuilder

    /**
     * Устанавливает верхний отступ helper текста (caption/counter)
     */
    fun helperTextPadding(helperTextPadding: Dp): TextFieldClearDimensionsBuilder

    /**
     * Устанавливает отступ после startContent
     */
    fun startContentPadding(startContentPadding: Dp): TextFieldClearDimensionsBuilder

    /**
     * Устанавливает отступ перед endContent
     */
    fun endContentPadding(endContentPadding: Dp): TextFieldClearDimensionsBuilder

    /**
     * Устанавливает отступ от контейнера с chip-элементами
     */
    fun chipsPadding(chipsPadding: Dp): TextFieldClearDimensionsBuilder

    /**
     * Устанавливает минимальную высоту поля
     */
    fun boxMinHeight(boxMinHeight: Dp): TextFieldClearDimensionsBuilder

    /**
     * Устанавливает высоту первой строки контента
     */
    fun alignmentLineHeight(alignmentLineHeight: Dp): TextFieldClearDimensionsBuilder

    /**
     * Устанавливает размер иконки в начале
     */
    fun startContentSize(startContentSize: Dp): TextFieldClearDimensionsBuilder

    /**
     * Устанавливает размер иконки в конце
     */
    fun endContentSize(endContentSize: Dp): TextFieldClearDimensionsBuilder

    /**
     * Устанавливает настройки индикатора
     */
    @Composable
    fun indicatorDimensions(
        builder: @Composable TextFieldClearIndicatorDimensionsBuilder.() -> Unit,
    ): TextFieldClearDimensionsBuilder

    /**
     * Устанавливает толщину разделителя в clear режиме
     */
    fun dividerThickness(dividerThickness: Dp): TextFieldClearDimensionsBuilder

    /**
     * Возвращает [TextField.Dimensions]
     */
    fun build(): TextField.Dimensions

    companion object {
        /**
         * Вернет экземпляр билдера [TextFieldClearDimensionsBuilder]
         */
        fun builder(): TextFieldClearDimensionsBuilder = DefaultTextFieldClearDimensionsBuilder()
    }
}

/**
 * Билдер настроек индикатора
 */
interface TextFieldClearIndicatorDimensionsBuilder {

    /**
     * Устанавливает горизонтальный отступ индикатора
     */
    fun horizontalPadding(horizontalPadding: Dp): TextFieldClearIndicatorDimensionsBuilder

    /**
     * Устанавливает вертикальный отступ индикатора
     */
    fun verticalPadding(verticalPadding: Dp): TextFieldClearIndicatorDimensionsBuilder

    /**
     * Устанавливает размер индикатора
     */
    fun indicatorSize(indicatorSize: Dp): TextFieldClearIndicatorDimensionsBuilder

    /**
     * Возвращает экземпляр [TextField.Dimensions.IndicatorDimensions]
     */
    fun build(): TextField.Dimensions.IndicatorDimensions

    companion object {

        /**
         * Возвращает билдер [TextFieldClearIndicatorDimensionsBuilder]
         */
        fun builder(): TextFieldClearIndicatorDimensionsBuilder =
            DefaultTextFieldClearIndicatorDimensionsBuilder()
    }
}

private class DefaultTextFieldClearIndicatorDimensionsBuilder :
    TextFieldClearIndicatorDimensionsBuilder {
    private var horizontalPadding: Dp? = null
    private var verticalPadding: Dp? = null
    private var indicatorSize: Dp? = null
    override fun horizontalPadding(horizontalPadding: Dp) = apply {
        this.horizontalPadding = horizontalPadding
    }

    override fun verticalPadding(verticalPadding: Dp) = apply {
        this.verticalPadding = verticalPadding
    }

    override fun indicatorSize(indicatorSize: Dp) = apply {
        this.indicatorSize = indicatorSize
    }

    override fun build(): TextField.Dimensions.IndicatorDimensions {
        return TextField.Dimensions.IndicatorDimensions(
            horizontalPadding = horizontalPadding ?: 0.dp,
            verticalPadding = verticalPadding ?: 0.dp,
            indicatorSize = indicatorSize ?: 6.dp,
        )
    }
}

private class DefaultTextFieldClearDimensionsBuilder : TextFieldClearDimensionsBuilder {
    private var boxPaddingStart: Dp? = null
    private var boxPaddingEnd: Dp? = null
    private var boxPaddingTop: Dp? = null
    private var boxPaddingBottom: Dp? = null
    private var labelPadding: Dp? = null
    private var optionalPadding: Dp? = null
    private var helperTextPadding: Dp? = null
    private var startContentPadding: Dp? = null
    private var endContentPadding: Dp? = null
    private var chipsPadding: Dp? = null
    private var boxMinHeight: Dp? = null
    private var alignmentLineHeight: Dp? = null
    private var startContentSize: Dp? = null
    private var endContentSize: Dp? = null
    private var indicatorDimensionsBuilder: TextFieldClearIndicatorDimensionsBuilder =
        TextFieldClearIndicatorDimensionsBuilder.builder()
    private var dividerThickness: Dp? = null
    override fun boxPaddingStart(boxPaddingStart: Dp) = apply {
        this.boxPaddingStart = boxPaddingStart
    }

    override fun boxPaddingEnd(boxPaddingEnd: Dp) = apply {
        this.boxPaddingEnd = boxPaddingEnd
    }

    override fun boxPaddingTop(boxPaddingTop: Dp) = apply {
        this.boxPaddingTop = boxPaddingTop
    }

    override fun boxPaddingBottom(boxPaddingBottom: Dp) = apply {
        this.boxPaddingBottom = boxPaddingBottom
    }

    override fun labelPadding(labelPadding: Dp) = apply {
        this.labelPadding = labelPadding
    }

    override fun optionalPadding(optionalPadding: Dp) = apply {
        this.optionalPadding = optionalPadding
    }

    override fun helperTextPadding(helperTextPadding: Dp) = apply {
        this.helperTextPadding = helperTextPadding
    }

    override fun startContentPadding(startContentPadding: Dp) = apply {
        this.startContentPadding = startContentPadding
    }

    override fun endContentPadding(endContentPadding: Dp) = apply {
        this.endContentPadding = endContentPadding
    }

    override fun chipsPadding(chipsPadding: Dp) = apply {
        this.chipsPadding = chipsPadding
    }

    override fun boxMinHeight(boxMinHeight: Dp) = apply {
        this.boxMinHeight = boxMinHeight
    }

    override fun alignmentLineHeight(alignmentLineHeight: Dp) = apply {
        this.alignmentLineHeight = alignmentLineHeight
    }

    override fun startContentSize(startContentSize: Dp) = apply {
        this.startContentSize = startContentSize
    }

    override fun endContentSize(endContentSize: Dp) = apply {
        this.endContentSize = endContentSize
    }

    @Composable
    override fun indicatorDimensions(builder: @Composable TextFieldClearIndicatorDimensionsBuilder.() -> Unit) =
        apply { this.indicatorDimensionsBuilder.builder() }

    override fun dividerThickness(dividerThickness: Dp) = apply {
        this.dividerThickness = dividerThickness
    }

    @Suppress("CyclomaticComplexMethod")
    override fun build(): TextField.Dimensions {
        return TextField.Dimensions(
            boxPaddingStart = boxPaddingStart ?: 16.dp,
            boxPaddingEnd = boxPaddingEnd ?: 16.dp,
            boxPaddingTop = boxPaddingTop ?: 25.dp,
            boxPaddingBottom = boxPaddingBottom ?: 9.dp,
            labelPadding = labelPadding ?: 2.dp,
            optionalPadding = optionalPadding ?: 4.dp,
            startContentPadding = startContentPadding ?: 6.dp,
            endContentPadding = endContentPadding ?: 6.dp,
            chipsPadding = chipsPadding ?: 6.dp,
            boxMinHeight = boxMinHeight ?: 56.dp,
            alignmentLineHeight = alignmentLineHeight ?: 56.dp,
            startContentSize = startContentSize ?: 24.dp,
            endContentSize = endContentSize ?: 24.dp,
            indicatorDimensions = indicatorDimensionsBuilder.build(),
            dividerThickness = dividerThickness ?: 1.dp,
        )
    }
}

@Immutable
@Suppress("LongParameterList")
private class DefaultTextFieldClearStyle(
    override val dimensions: TextField.Dimensions,
    override val colors: TextFieldColors,
    override val shape: CornerBasedShape,
    override val fieldType: TextField.FieldType,
    override val fieldAppearance: TextField.FieldAppearance,
    override val labelPlacement: TextField.LabelPlacement,
    override val helperTextPlacement: TextField.HelperTextPlacement,
    override val scrollBar: ScrollBar?,
    override val valueStyle: TextStyle,
    override val captionStyle: TextStyle,
    override val counterStyle: TextStyle,
    override val placeholderStyle: TextStyle,
    override val singleLine: Boolean,
    override val hasDivider: Boolean,
    override val chipGroupStyle: ChipGroupStyle,
    override val chipStyle: ChipStyle,
    override val labelStyle: TextStyle,
    override val optionalStyle: TextStyle,
) : TextFieldStyle {

    class Builder(override val receiver: Any?) : TextFieldClearStyleBuilder {

        private var colorsBuilder: TextFieldClearColorsBuilder =
            TextFieldClearColorsBuilder.builder()
        private var dimensionsBuilder: TextFieldClearDimensionsBuilder =
            TextFieldClearDimensionsBuilder.builder()
        private var shape: CornerBasedShape? = null
        private var labelPlacement: TextField.LabelPlacement? = null
        private var fieldType: TextField.FieldType? = null
        private var labelStyle: TextStyle? = null
        private var optionalStyle: TextStyle? = null
        private var valueStyle: TextStyle? = null
        private var captionStyle: TextStyle? = null
        private var counterStyle: TextStyle? = null
        private var placeholderStyle: TextStyle? = null
        private var hasDivider: Boolean? = null
        private var chipGroupStyle: ChipGroupStyle? = null
        private var chipStyle: ChipStyle? = null

        @Composable
        override fun dimensions(builder: @Composable TextFieldClearDimensionsBuilder.() -> Unit) = apply {
            this.dimensionsBuilder.builder()
        }

        @Deprecated("Use dimensions() with builder instead")
        @Composable
        override fun dimensions(dimensions: TextField.Dimensions) = apply {
            this.dimensionsBuilder.apply {
                boxPaddingStart(dimensions.boxPaddingStart)
                boxPaddingEnd(dimensions.boxPaddingEnd)
                boxPaddingTop(dimensions.boxPaddingTop)
                boxPaddingBottom(dimensions.boxPaddingBottom)
                labelPadding(dimensions.labelPadding)
                optionalPadding(dimensions.optionalPadding)
                helperTextPadding(dimensions.helperTextPadding)
                startContentPadding(dimensions.startContentPadding)
                endContentPadding(dimensions.endContentPadding)
                chipsPadding(dimensions.chipsPadding)
                boxMinHeight(dimensions.boxMinHeight)
                alignmentLineHeight(dimensions.alignmentLineHeight)
                startContentSize(dimensions.startContentSize)
                endContentSize(dimensions.endContentSize)
                indicatorDimensions {
                    horizontalPadding(dimensions.indicatorDimensions.horizontalPadding)
                    verticalPadding(dimensions.indicatorDimensions.verticalPadding)
                    indicatorSize(dimensions.indicatorDimensions.indicatorSize)
                }
                dividerThickness(dimensions.dividerThickness)
            }
        }

        @Composable
        override fun colors(builder: @Composable (TextFieldClearColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        override fun labelPlacement(labelPlacement: TextField.LabelPlacement) = apply {
            this.labelPlacement = labelPlacement
        }

        override fun fieldType(fieldType: TextField.FieldType) = apply {
            this.fieldType = fieldType
        }

        override fun labelStyle(labelStyle: TextStyle) = apply {
            this.labelStyle = labelStyle
        }

        override fun optionalStyle(optionalStyle: TextStyle) = apply {
            this.optionalStyle = optionalStyle
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

        override fun hasDivider(hasDivider: Boolean) = apply {
            this.hasDivider = hasDivider
        }

        override fun chipGroupStyle(chipGroupStyle: ChipGroupStyle) = apply {
            this.chipGroupStyle = chipGroupStyle
        }

        override fun chipStyle(chipStyle: ChipStyle) = apply {
            this.chipStyle = chipStyle
        }

        @Suppress("CyclomaticComplexMethod")
        override fun style(): TextFieldStyle {
            return DefaultTextFieldClearStyle(
                scrollBar = null,
                singleLine = true,
                fieldAppearance = TextField.FieldAppearance.Clear,
                helperTextPlacement = TextField.HelperTextPlacement.Outer,
                dimensions = dimensionsBuilder.build(),
                colors = colorsBuilder.build(),
                shape = shape ?: RoundedCornerShape(CornerSize(8.dp)),
                fieldType = fieldType ?: TextField.FieldType.Optional,
                labelPlacement = labelPlacement ?: TextField.LabelPlacement.None,
                labelStyle = labelStyle ?: TextStyle.Default,
                optionalStyle = optionalStyle ?: TextStyle.Default,
                valueStyle = valueStyle ?: TextStyle.Default,
                captionStyle = captionStyle ?: TextStyle.Default,
                counterStyle = counterStyle ?: TextStyle.Default,
                placeholderStyle = placeholderStyle ?: TextStyle.Default,
                hasDivider = hasDivider ?: true,
                chipGroupStyle = chipGroupStyle ?: ChipGroupStyle.builder().style(),
                chipStyle = chipStyle ?: ChipStyle.builder().style(),
            )
        }
    }
}

@Suppress("LongParameterList")
private class DefaultTextFieldClearColors(
    override val disabledAlpha: Float,
    override val endContentColor: InteractiveColor,
    override val optionalColor: InteractiveColor,
    override val counterColor: InteractiveColor,
    override val cursorColor: InteractiveColor,
    override val indicatorColor: InteractiveColor,
    override val startContentColor: InteractiveColor,
    private val labelColor: InteractiveColor,
    private val labelColorReadOnly: InteractiveColor,
    private val valueColor: InteractiveColor,
    private val valueColorReadOnly: InteractiveColor,
    private val captionColor: InteractiveColor,
    private val captionColorReadOnly: InteractiveColor,
    private val placeholderColor: InteractiveColor,
    private val placeholderColorReadOnly: InteractiveColor,
    private val dividerColor: InteractiveColor,
    private val dividerColorReadOnly: InteractiveColor,
) : TextFieldColors {

    override fun labelColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) labelColorReadOnly else labelColor
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

    override fun backgroundColor(isReadOnly: Boolean): InteractiveColor = DUMMY_COLOR

    class Builder : TextFieldClearColorsBuilder {
        private var disabledAlpha: Float? = null
        private var cursorColor: InteractiveColor? = null
        private var startContentColor: InteractiveColor? = null
        private var endContentColor: InteractiveColor? = null
        private var labelColor: InteractiveColor? = null
        private var labelColorReadOnly: InteractiveColor? = null
        private var valueColor: InteractiveColor? = null
        private var valueColorReadOnly: InteractiveColor? = null
        private var captionColor: InteractiveColor? = null
        private var captionColorReadOnly: InteractiveColor? = null
        private var optionalColor: InteractiveColor? = null
        private var counterColor: InteractiveColor? = null
        private var placeholderColor: InteractiveColor? = null
        private var placeholderColorReadOnly: InteractiveColor? = null
        private var indicatorColor: InteractiveColor? = null
        private var dividerColor: InteractiveColor? = null
        private var dividerColorReadOnly: InteractiveColor? = null

        override fun disabledAlpha(disabledAlpha: Float) = apply {
            this.disabledAlpha = disabledAlpha
        }

        override fun cursorColor(cursorColor: InteractiveColor) = apply {
            this.cursorColor = cursorColor
        }

        override fun startContentColor(startContentColor: InteractiveColor) = apply {
            this.startContentColor = startContentColor
        }

        override fun endContentColor(endContentColor: InteractiveColor) = apply {
            this.endContentColor = endContentColor
        }

        override fun labelColor(labelColor: InteractiveColor) = apply {
            this.labelColor = labelColor
        }

        override fun labelColorReadOnly(labelColorReadOnly: InteractiveColor) = apply {
            this.labelColorReadOnly = labelColorReadOnly
        }

        override fun valueColor(valueColor: InteractiveColor) = apply {
            this.valueColor = valueColor
        }

        override fun valueColorReadOnly(valueColorReadOnly: InteractiveColor) = apply {
            this.valueColorReadOnly = valueColorReadOnly
        }

        override fun captionColor(captionColor: InteractiveColor) = apply {
            this.captionColor = captionColor
        }

        override fun captionColorReadOnly(captionColorReadOnly: InteractiveColor) = apply {
            this.captionColorReadOnly = captionColorReadOnly
        }

        override fun optionalColor(optionalColor: InteractiveColor) = apply {
            this.optionalColor = optionalColor
        }

        override fun counterColor(counterColor: InteractiveColor) = apply {
            this.counterColor = counterColor
        }

        override fun placeholderColor(placeholderColor: InteractiveColor) = apply {
            this.placeholderColor = placeholderColor
        }

        override fun placeholderColorReadOnly(placeholderColorReadOnly: InteractiveColor) = apply {
            this.placeholderColorReadOnly = placeholderColorReadOnly
        }

        override fun dividerColor(dividerColor: InteractiveColor) = apply {
            this.dividerColor = dividerColor
        }

        override fun dividerColorReadOnly(dividerColorReadOnly: InteractiveColor) = apply {
            this.dividerColorReadOnly = dividerColorReadOnly
        }

        override fun indicatorColor(indicatorColor: InteractiveColor) = apply {
            this.indicatorColor = indicatorColor
        }

        @Suppress("CyclomaticComplexMethod")
        override fun build(): TextFieldColors {
            return DefaultTextFieldClearColors(
                disabledAlpha = disabledAlpha ?: DEFAULT_DISABLED_ALPHA,
                cursorColor = cursorColor ?: Color.Black.asInteractive(),
                startContentColor = startContentColor ?: Color.Black.asInteractive(),
                endContentColor = endContentColor ?: Color.Black.asInteractive(),
                labelColor = labelColor ?: Color.Black.asInteractive(),
                labelColorReadOnly = labelColorReadOnly ?: Color.Black.asInteractive(),
                valueColor = valueColor ?: Color.Black.asInteractive(),
                valueColorReadOnly = valueColorReadOnly ?: Color.Black.asInteractive(),
                captionColor = captionColor ?: Color.Black.asInteractive(),
                captionColorReadOnly = captionColorReadOnly ?: Color.Black.asInteractive(),
                optionalColor = optionalColor ?: Color.Black.asInteractive(),
                counterColor = counterColor ?: Color.Black.asInteractive(),
                placeholderColor = placeholderColor ?: Color.Gray.asInteractive(),
                placeholderColorReadOnly = placeholderColorReadOnly ?: Color.Gray.asInteractive(),
                indicatorColor = indicatorColor ?: Color.Red.asInteractive(),
                dividerColor = dividerColor ?: Color.Gray.asInteractive(),
                dividerColorReadOnly = dividerColorReadOnly ?: Color.Gray.asInteractive(),
            )
        }
    }
}

private const val DEFAULT_DISABLED_ALPHA = 0.4f
private val DUMMY_COLOR = Color.Transparent.asInteractive()
