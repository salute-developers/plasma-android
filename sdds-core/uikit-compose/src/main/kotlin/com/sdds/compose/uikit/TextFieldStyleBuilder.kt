package com.sdds.compose.uikit

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * Билдер стиля [TextFieldStyle]
 */
interface TextFieldStyleBuilder : StyleBuilder<TextFieldStyle> {

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     */
    @Composable
    fun dimensions(builder: @Composable TextFieldDimensionsBuilder.() -> Unit): TextFieldStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     */
    @Deprecated("Use dimensions() with builder instead")
    @Composable
    fun dimensions(dimensions: TextFieldDimensions): TextFieldStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder]
     */
    @Composable
    fun colors(builder: @Composable TextFieldColorsBuilder.() -> Unit): TextFieldStyleBuilder

    /**
     * Устанавливает форму компонента [shape]
     */
    fun shape(shape: CornerBasedShape): TextFieldStyleBuilder

    /**
     * Устанавливает расположение лэйбла [labelPlacement]
     */
    fun labelPlacement(labelPlacement: TextFieldLabelPlacement): TextFieldStyleBuilder

    /**
     * Устанавливает расположение текста надписи [captionPlacement]
     */
    fun captionPlacement(captionPlacement: TextFieldHelperTextPlacement): TextFieldStyleBuilder

    /**
     * Устанавливает расположение текста счетчика [counterPlacement]
     */
    fun counterPlacement(counterPlacement: TextFieldHelperTextPlacement): TextFieldStyleBuilder

    /**
     * Устанавливает тип поля [fieldType]
     */
    fun fieldType(fieldType: TextFieldType): TextFieldStyleBuilder

    /**
     * Устаналивает настройки скроллбара [scrollBar]
     */
    @Composable
    fun scrollBar(builder: @Composable TextFieldScrollBarBuilder.() -> Unit): TextFieldStyleBuilder

    /**
     * Устанавливает стиль лэйбла [labelStyle]
     */
    fun labelStyle(labelStyle: TextStyle): TextFieldStyleBuilder

    /**
     * Устанавливает стиль optional текста [optionalStyle]
     */
    fun optionalStyle(optionalStyle: TextStyle): TextFieldStyleBuilder

    /**
     * Устанавливает стиль основного текста [valueStyle]
     */
    fun valueStyle(valueStyle: TextStyle): TextFieldStyleBuilder

    /**
     * Устанавливает стиль надписи [captionStyle]
     */
    fun captionStyle(captionStyle: TextStyle): TextFieldStyleBuilder

    /**
     * Устанавливает стиль счетчика [counterStyle]
     */
    fun counterStyle(counterStyle: TextStyle): TextFieldStyleBuilder

    /**
     * Устанавливает стиль плэйсхолдера [placeholderStyle]
     */
    fun placeholderStyle(placeholderStyle: TextStyle): TextFieldStyleBuilder

    /**
     * Устанавливает стиль префикса [prefixStyle]
     */
    fun prefixStyle(prefixStyle: TextStyle): TextFieldStyleBuilder

    /**
     * Устанавливает стиль суффикса [suffixStyle]
     */
    fun suffixStyle(suffixStyle: TextStyle): TextFieldStyleBuilder

    /**
     * Устанавливает однострочный режим [singleLine]
     */
    fun singleLine(singleLine: Boolean): TextFieldStyleBuilder

    /**
     * Устанавливает режим размещения индикатора [singleLine]
     */
    fun indicatorAlignmentMode(indicatorAlignmentMode: TextFieldIndicatorAlignmentMode): TextFieldStyleBuilder

    /**
     * Устанавливает стиль группы чипов [chipGroupStyle]
     */
    fun chipGroupStyle(chipGroupStyle: ChipGroupStyle): TextFieldStyleBuilder

    /**
     * Устанавливает стиль чипов [chipStyle]
     */
    @Deprecated("Use chipGroupStyle")
    fun chipStyle(chipStyle: ChipStyle): TextFieldStyleBuilder
}

/**
 * Билдер цветов [TextFieldColors]
 */
interface TextFieldColorsBuilder {

    /**
     * Устанавливает альфу [disabledAlpha] в состоянии disabled
     */
    fun disabledAlpha(disabledAlpha: Float): TextFieldColorsBuilder

    /**
     * Устанавливает цвет курсора [cursorColor]
     */
    fun cursorColor(cursorColor: Color): TextFieldColorsBuilder =
        cursorColor(cursorColor.asInteractive())

    /**
     * Устанавливает цвет курсора [cursorColor]
     */
    fun cursorColor(cursorColor: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет курсора [cursorColorReadOnly]
     */
    fun cursorColorReadOnly(cursorColorReadOnly: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет курсора [cursorColorReadOnly]
     */
    fun cursorColorReadOnly(cursorColorReadOnly: Color): TextFieldColorsBuilder =
        cursorColorReadOnly(cursorColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет контента в начале [startContentColor]
     */
    fun startContentColor(startContentColor: Color): TextFieldColorsBuilder =
        startContentColor(startContentColor.asInteractive())

    /**
     * Устанавливает цвет контента в начале [startContentColor]
     */
    fun startContentColor(startContentColor: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет контента в начале [startContentColorReadOnly]
     */
    fun startContentColorReadOnly(startContentColorReadOnly: Color): TextFieldColorsBuilder =
        startContentColorReadOnly(startContentColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет контента в начале [startContentColorReadOnly]
     */
    fun startContentColorReadOnly(startContentColorReadOnly: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет контента в конце [endContentColor]
     */
    fun endContentColor(endContentColor: Color): TextFieldColorsBuilder =
        endContentColor(endContentColor.asInteractive())

    /**
     * Устанавливает цвет контента в конце [endContentColor]
     */
    fun endContentColor(endContentColor: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет контента в конце [endContentColorReadOnly]
     */
    fun endContentColorReadOnly(endContentColorReadOnly: Color): TextFieldColorsBuilder =
        endContentColorReadOnly(endContentColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет контента в конце [endContentColorReadOnly]
     */
    fun endContentColorReadOnly(endContentColorReadOnly: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет лэйбла [labelColor]
     */
    fun labelColor(labelColor: Color): TextFieldColorsBuilder =
        this.labelColor(labelColor.asInteractive())

    /**
     * Устанавливает цвет лэйбла [labelColor]
     */
    fun labelColor(labelColor: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет лэйбла в состоянии readOnly [labelColorReadOnly]
     */
    fun labelColorReadOnly(labelColorReadOnly: Color): TextFieldColorsBuilder =
        this.labelColorReadOnly(labelColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет лэйбла в состоянии readOnly [labelColorReadOnly]
     */
    fun labelColorReadOnly(labelColorReadOnly: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет основного текста [valueColor]
     */
    fun valueColor(valueColor: Color): TextFieldColorsBuilder =
        valueColor(valueColor.asInteractive())

    /**
     * Устанавливает цвет основного текста [valueColor]
     */
    fun valueColor(valueColor: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет основного текста в состоянии readOnly [valueColorReadOnly]
     */
    fun valueColorReadOnly(valueColorReadOnly: Color): TextFieldColorsBuilder =
        valueColorReadOnly(valueColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет основного текста в состоянии readOnly [valueColorReadOnly]
     */
    fun valueColorReadOnly(valueColorReadOnly: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет надписи [captionColor]
     */
    fun captionColor(captionColor: Color): TextFieldColorsBuilder =
        captionColor(captionColor.asInteractive())

    /**
     * Устанавливает цвет надписи [captionColor]
     */
    fun captionColor(captionColor: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет надписи в состоянии readOnly [captionColorReadOnly]
     */
    fun captionColorReadOnly(captionColorReadOnly: Color): TextFieldColorsBuilder =
        captionColorReadOnly(captionColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет надписи в состоянии readOnly [captionColorReadOnly]
     */
    fun captionColorReadOnly(captionColorReadOnly: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет опционального текста [optionalColor]
     */
    fun optionalColor(optionalColor: Color): TextFieldColorsBuilder =
        optionalColor(optionalColor.asInteractive())

    /**
     * Устанавливает цвет опционального текста [optionalColor]
     */
    fun optionalColor(optionalColor: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет опционального текста [optionalColorReadOnly]
     */
    fun optionalColorReadOnly(optionalColorReadOnly: Color): TextFieldColorsBuilder =
        optionalColorReadOnly(optionalColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет опционального текста [optionalColorReadOnly]
     */
    fun optionalColorReadOnly(optionalColorReadOnly: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет счетчика [counterColor]
     */
    fun counterColor(counterColor: Color): TextFieldColorsBuilder =
        counterColor(counterColor.asInteractive())

    /**
     * Устанавливает цвет счетчика [counterColor]
     */
    fun counterColor(counterColor: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет счетчика [counterColorReadOnly]
     */
    fun counterColorReadOnly(counterColorReadOnly: Color): TextFieldColorsBuilder =
        counterColorReadOnly(counterColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет счетчика [counterColorReadOnly]
     */
    fun counterColorReadOnly(counterColorReadOnly: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет плэйсхолдера [placeholderColor]
     */
    fun placeholderColor(placeholderColor: Color): TextFieldColorsBuilder =
        placeholderColor(placeholderColor.asInteractive())

    /**
     * Устанавливает цвет плэйсхолдера [placeholderColor]
     */
    fun placeholderColor(placeholderColor: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет плэйсхолдеоа в состоянии readOnly [placeholderColorReadOnly]
     */
    fun placeholderColorReadOnly(placeholderColorReadOnly: Color): TextFieldColorsBuilder =
        placeholderColorReadOnly(placeholderColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет плэйсхолдеоа в состоянии readOnly [placeholderColorReadOnly]
     */
    fun placeholderColorReadOnly(placeholderColorReadOnly: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет бэкграунда [backgroundColor]
     */
    fun backgroundColor(backgroundColor: Color): TextFieldColorsBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Устанавливает цвет бэкграунда [backgroundColor]
     */
    fun backgroundColor(backgroundColor: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет бэкграунда в состоянии readOnly [backgroundColorReadOnly]
     */
    fun backgroundColorReadOnly(backgroundColorReadOnly: Color): TextFieldColorsBuilder =
        backgroundColorReadOnly(backgroundColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет бэкграунда в состоянии readOnly [backgroundColorReadOnly]
     */
    fun backgroundColorReadOnly(backgroundColorReadOnly: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет разделителя [dividerColor]
     */
    fun dividerColor(dividerColor: Color): TextFieldColorsBuilder =
        dividerColor(dividerColor.asInteractive())

    /**
     * Устанавливает цвет разделителя [dividerColor]
     */
    fun dividerColor(dividerColor: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет разделителя в состоянии readOnlu [dividerColorReadOnly]
     */
    fun dividerColorReadOnly(dividerColorReadOnly: Color): TextFieldColorsBuilder =
        dividerColorReadOnly(dividerColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет разделителя в состоянии readOnlu [dividerColorReadOnly]
     */
    fun dividerColorReadOnly(dividerColorReadOnly: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет индикатора
     */
    fun indicatorColor(indicatorColor: Color): TextFieldColorsBuilder =
        indicatorColor(indicatorColor.asInteractive())

    /**
     * Устанавливает цвет индикатора
     */
    fun indicatorColor(indicatorColor: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет индикатора
     */
    fun indicatorColorReadOnly(indicatorColorReadOnly: Color): TextFieldColorsBuilder =
        indicatorColorReadOnly(indicatorColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет индикатора
     */
    fun indicatorColorReadOnly(indicatorColorReadOnly: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет префикса
     */
    fun prefixColor(prefixColor: Color): TextFieldColorsBuilder =
        prefixColor(prefixColor.asInteractive())

    /**
     * Устанавливает цвет префикса
     */
    fun prefixColor(prefixColor: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет суффикса
     */
    fun suffixColor(suffixColor: Color): TextFieldColorsBuilder =
        suffixColor(suffixColor.asInteractive())

    /**
     * Устанавливает цвет суффикса
     */
    fun suffixColor(suffixColor: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет префикса
     */
    fun prefixColorReadOnly(prefixColorReadOnly: Color): TextFieldColorsBuilder =
        prefixColorReadOnly(prefixColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет префикса
     */
    fun prefixColorReadOnly(prefixColorReadOnly: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет суффикса
     */
    fun suffixColorReadOnly(suffixColorReadOnly: Color): TextFieldColorsBuilder =
        suffixColorReadOnly(suffixColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет суффикса
     */
    fun suffixColorReadOnly(suffixColorReadOnly: InteractiveColor): TextFieldColorsBuilder

    /**
     * Вернет экземпляр [TextFieldColors]
     */
    fun build(): TextFieldColors

    companion object {

        /**
         * Вернет экземпляр билдера [TextFieldColorsBuilder]
         */
        fun builder(): TextFieldColorsBuilder = DefaultTextFieldColors.Builder()
    }
}

/**
 * Билдер размеров для [TextField]
 */
interface TextFieldDimensionsBuilder {

    /**
     * Устанавливает отступ контента в начале
     */
    fun boxPaddingStart(boxPaddingStart: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает отступ контента в конце
     */
    fun boxPaddingEnd(boxPaddingEnd: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает верхний отступ контента
     */
    fun boxPaddingTop(boxPaddingTop: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает нижний отступ контента
     */
    fun boxPaddingBottom(boxPaddingBottom: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает нижний отступ лэйбла
     */
    fun labelPadding(labelPadding: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает отступ в начале optional текста
     */
    fun optionalPadding(optionalPadding: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает верхний отступ helper текста (caption/counter)
     */
    fun helperTextPadding(helperTextPadding: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает отступ после startContent
     */
    fun startContentPadding(startContentPadding: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает отступ перед endContent
     */
    fun endContentPadding(endContentPadding: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает отступ от контейнера с chip-элементами
     */
    fun chipsPadding(chipsPadding: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает отступ от контейнера с chip-элементами в начале
     */
    fun chipsPaddingStart(chipsPaddingStart: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает отступ от контейнера с chip-элементами в конце
     */
    fun chipsPaddingEnd(chipsPaddingEnd: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает отступ от контейнера с chip-элементами сверху
     */
    fun chipsPaddingTop(chipsPaddingTop: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает отступ от контейнера с chip-элементами снизу
     */
    fun chipsPaddingBottom(chipsPaddingBottom: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает минимальную высоту поля
     */
    fun boxMinHeight(boxMinHeight: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает высоту первой строки контента
     */
    fun alignmentLineHeight(alignmentLineHeight: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает размер иконки в начале
     */
    fun startContentSize(startContentSize: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает размер иконки в конце
     */
    fun endContentSize(endContentSize: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает настройки индикатора
     */
    @Composable
    fun indicatorDimensions(
        builder: @Composable TextFieldIndicatorDimensionsBuilder.() -> Unit,
    ): TextFieldDimensionsBuilder

    /**
     * Устанавливает толщину разделителя
     */
    fun dividerThickness(dividerThickness: Dp): TextFieldDimensionsBuilder

    /**
     * Возвращает [TextFieldDimensions]
     */
    fun build(): TextFieldDimensions

    companion object {
        /**
         * Вернет экземпляр билдера [TextFieldDimensionsBuilder]
         */
        fun builder(): TextFieldDimensionsBuilder = DefaultTextFieldDimensionsBuilder()
    }
}

/**
 * Билдер настроек индикатора
 */
interface TextFieldIndicatorDimensionsBuilder {

    /**
     * Устанавливает горизонтальный отступ индикатора
     */
    fun horizontalPadding(horizontalPadding: Dp): TextFieldIndicatorDimensionsBuilder

    /**
     * Устанавливает вертикальный отступ индикатора
     */
    fun verticalPadding(verticalPadding: Dp): TextFieldIndicatorDimensionsBuilder

    /**
     * Устанавливает размер индикатора
     */
    fun indicatorSize(indicatorSize: Dp): TextFieldIndicatorDimensionsBuilder

    /**
     * Возвращает экземпляр [TextFieldDimensions.IndicatorDimensions]
     */
    fun build(): TextFieldDimensions.IndicatorDimensions

    companion object {

        /**
         * Возвращает билдер [TextFieldIndicatorDimensionsBuilder]
         */
        fun builder(): TextFieldIndicatorDimensionsBuilder =
            DefaultTextFieldIndicatorDimensionsBuilder()
    }
}

/**
 * Билдер scrollBar
 */
interface TextFieldScrollBarBuilder {

    /**
     * Устанавливает толщину scrollBar [scrollBarThickness]
     */
    fun scrollBarThickness(scrollBarThickness: Dp): TextFieldScrollBarBuilder

    /**
     * Устанавливает верхний отступ scrollBar [scrollBarPaddingTop]
     */
    fun scrollBarPaddingTop(scrollBarPaddingTop: Dp): TextFieldScrollBarBuilder

    /**
     * Устанавливает нижний отступ scrollBar [scrollBarPaddingBottom]
     */
    fun scrollBarPaddingBottom(scrollBarPaddingBottom: Dp): TextFieldScrollBarBuilder

    /**
     * Устанавливает отступ scrollBar в конце [scrollBarPaddingEnd]
     */
    fun scrollBarPaddingEnd(scrollBarPaddingEnd: Dp): TextFieldScrollBarBuilder

    /**
     * Устанавливает цвет scrollBar [scrollBarTrackColor]
     */
    fun scrollBarTrackColor(scrollBarTrackColor: InteractiveColor): TextFieldScrollBarBuilder

    /**
     * Устанавливает цвет фона scrollBar [scrollBarThumbColor]
     */
    fun scrollBarThumbColor(scrollBarThumbColor: InteractiveColor): TextFieldScrollBarBuilder

    /**
     * Возвращает экземпляр [ScrollBar]
     */
    fun build(): ScrollBar?

    companion object {

        /**
         * Возвращает билдер [TextFieldScrollBarBuilder]
         */
        fun builder(): TextFieldScrollBarBuilder =
            DefaultTextFieldScrollBarBuilder()
    }
}

@Immutable
@Suppress("LongParameterList")
internal class DefaultTextFieldStyle(
    override val dimensions: TextFieldDimensions,
    override val colors: TextFieldColors,
    override val shape: CornerBasedShape,
    override val fieldType: TextFieldType,
    override val labelPlacement: TextFieldLabelPlacement,
    override val captionPlacement: TextFieldHelperTextPlacement,
    override val counterPlacement: TextFieldHelperTextPlacement,
    override val indicatorAlignmentMode: TextFieldIndicatorAlignmentMode,
    override val scrollBar: ScrollBar?,
    override val valueStyle: TextStyle,
    override val captionStyle: TextStyle,
    override val counterStyle: TextStyle,
    override val placeholderStyle: TextStyle,
    override val singleLine: Boolean,
    override val chipGroupStyle: ChipGroupStyle,
    @Deprecated("Use chipGroupStyle")
    override val chipStyle: ChipStyle,
    override val labelStyle: TextStyle,
    override val optionalStyle: TextStyle,
    override val prefixStyle: TextStyle,
    override val suffixStyle: TextStyle,
) : TextFieldStyle {

    class Builder(override val receiver: Any?) : TextFieldStyleBuilder {

        private var colorsBuilder: TextFieldColorsBuilder = TextFieldColorsBuilder.builder()
        private var dimensionsBuilder: TextFieldDimensionsBuilder =
            TextFieldDimensionsBuilder.builder()
        private var scrollBarBuilder: TextFieldScrollBarBuilder =
            TextFieldScrollBarBuilder.builder()
        private var shape: CornerBasedShape? = null
        private var labelPlacement: TextFieldLabelPlacement? = null
        private var captionPlacement: TextFieldHelperTextPlacement? = null
        private var counterPlacement: TextFieldHelperTextPlacement? = null
        private var fieldType: TextFieldType? = null
        private var labelStyle: TextStyle? = null
        private var optionalStyle: TextStyle? = null
        private var valueStyle: TextStyle? = null
        private var captionStyle: TextStyle? = null
        private var counterStyle: TextStyle? = null
        private var placeholderStyle: TextStyle? = null
        private var prefixStyle: TextStyle? = null
        private var suffixStyle: TextStyle? = null
        private var chipGroupStyle: ChipGroupStyle? = null
        private var chipStyle: ChipStyle? = null
        private var singleLine: Boolean? = null
        private var indicatorAlignmentMode: TextFieldIndicatorAlignmentMode? = null

        @Composable
        override fun dimensions(builder: @Composable TextFieldDimensionsBuilder.() -> Unit) =
            apply {
                this.dimensionsBuilder.builder()
            }

        @Deprecated("Use dimensions() with builder instead")
        @Composable
        override fun dimensions(dimensions: TextFieldDimensions) = apply {
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
            }
        }

        @Composable
        override fun colors(builder: @Composable (TextFieldColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        override fun shape(shape: CornerBasedShape) = apply {
            this.shape = shape
        }

        override fun labelPlacement(labelPlacement: TextFieldLabelPlacement) = apply {
            this.labelPlacement = labelPlacement
        }

        override fun captionPlacement(captionPlacement: TextFieldHelperTextPlacement) = apply {
            this.captionPlacement = captionPlacement
        }

        override fun counterPlacement(counterPlacement: TextFieldHelperTextPlacement) = apply {
            this.counterPlacement = counterPlacement
        }

        override fun fieldType(fieldType: TextFieldType) = apply {
            this.fieldType = fieldType
        }

        @Composable
        override fun scrollBar(builder: @Composable (TextFieldScrollBarBuilder.() -> Unit)) =
            apply {
                this.scrollBarBuilder.builder()
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

        override fun prefixStyle(prefixStyle: TextStyle) = apply {
            this.prefixStyle = prefixStyle
        }

        override fun suffixStyle(suffixStyle: TextStyle) = apply {
            this.suffixStyle = suffixStyle
        }

        override fun singleLine(singleLine: Boolean) = apply {
            this.singleLine = singleLine
        }

        override fun indicatorAlignmentMode(indicatorAlignmentMode: TextFieldIndicatorAlignmentMode) =
            apply {
                this.indicatorAlignmentMode = indicatorAlignmentMode
            }

        override fun chipGroupStyle(chipGroupStyle: ChipGroupStyle) = apply {
            this.chipGroupStyle = chipGroupStyle
        }

        @Deprecated("Use chipGroupStyle")
        override fun chipStyle(chipStyle: ChipStyle) = apply {
            this.chipStyle = chipStyle
        }

        @Suppress("CyclomaticComplexMethod")
        override fun style(): TextFieldStyle {
            return DefaultTextFieldStyle(
                scrollBar = scrollBarBuilder.build(),
                singleLine = singleLine ?: true,
                captionPlacement = captionPlacement ?: TextFieldHelperTextPlacement.Outer,
                counterPlacement = counterPlacement ?: TextFieldHelperTextPlacement.Outer,
                dimensions = dimensionsBuilder.build(),
                colors = colorsBuilder.build(),
                shape = shape ?: RoundedCornerShape(CornerSize(0)),
                fieldType = fieldType ?: TextFieldType.Optional,
                labelPlacement = labelPlacement ?: TextFieldLabelPlacement.None,
                indicatorAlignmentMode = indicatorAlignmentMode
                    ?: TextFieldIndicatorAlignmentMode.Inside,
                labelStyle = labelStyle ?: TextStyle.Default,
                optionalStyle = optionalStyle ?: TextStyle.Default,
                valueStyle = valueStyle ?: TextStyle.Default,
                captionStyle = captionStyle ?: TextStyle.Default,
                counterStyle = counterStyle ?: TextStyle.Default,
                placeholderStyle = placeholderStyle ?: TextStyle.Default,
                prefixStyle = prefixStyle ?: TextStyle.Default,
                suffixStyle = suffixStyle ?: TextStyle.Default,
                chipStyle = chipStyle ?: ChipStyle.builder().style(),
                chipGroupStyle = chipGroupStyle ?: ChipGroupStyle
                    .builder()
                    .chipStyle(chipStyle ?: chipGroupStyle?.chipStyle ?: ChipStyle.builder().style())
                    .style(),
            )
        }
    }
}

@Suppress("LongParameterList")
private class DefaultTextFieldColors(
    override val disabledAlpha: Float,
    private val endContentColor: InteractiveColor,
    private val endContentColorReadOnly: InteractiveColor,
    private val optionalColor: InteractiveColor,
    private val optionalColorReadOnly: InteractiveColor,
    private val counterColor: InteractiveColor,
    private val counterColorReadOnly: InteractiveColor,
    private val cursorColor: InteractiveColor,
    private val cursorColorReadOnly: InteractiveColor,
    private val indicatorColor: InteractiveColor,
    private val indicatorColorReadOnly: InteractiveColor,
    private val startContentColor: InteractiveColor,
    private val startContentColorReadOnly: InteractiveColor,
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
    private val backgroundColor: InteractiveColor,
    private val backgroundColorReadOnly: InteractiveColor,
    private val prefixColor: InteractiveColor,
    private val prefixColorReadOnly: InteractiveColor,
    private val suffixColor: InteractiveColor,
    private val suffixColorReadOnly: InteractiveColor,
) : TextFieldColors {
    override fun cursorColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) cursorColorReadOnly else cursorColor
    }

    override fun indicatorColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) indicatorColorReadOnly else indicatorColor
    }

    override fun startContentColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) startContentColorReadOnly else startContentColor
    }

    override fun endContentColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) endContentColorReadOnly else endContentColor
    }

    override fun labelColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) labelColorReadOnly else labelColor
    }

    override fun valueColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) valueColorReadOnly else valueColor
    }

    override fun captionColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) captionColorReadOnly else captionColor
    }

    override fun optionalColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) optionalColorReadOnly else optionalColor
    }

    override fun counterColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) counterColorReadOnly else counterColor
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

    override fun prefixColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) prefixColorReadOnly else prefixColor
    }

    override fun suffixColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) suffixColorReadOnly else suffixColor
    }

    class Builder : TextFieldColorsBuilder {
        private var disabledAlpha: Float? = null
        private var cursorColor: InteractiveColor? = null
        private var cursorColorReadOnly: InteractiveColor? = null
        private var startContentColor: InteractiveColor? = null
        private var startContentColorReadOnly: InteractiveColor? = null
        private var endContentColor: InteractiveColor? = null
        private var endContentColorReadOnly: InteractiveColor? = null
        private var labelColor: InteractiveColor? = null
        private var labelColorReadOnly: InteractiveColor? = null
        private var valueColor: InteractiveColor? = null
        private var valueColorReadOnly: InteractiveColor? = null
        private var captionColor: InteractiveColor? = null
        private var captionColorReadOnly: InteractiveColor? = null
        private var optionalColor: InteractiveColor? = null
        private var optionalColorReadOnly: InteractiveColor? = null
        private var counterColor: InteractiveColor? = null
        private var counterColorReadOnly: InteractiveColor? = null
        private var backgroundColor: InteractiveColor? = null
        private var backgroundColorReadOnly: InteractiveColor? = null
        private var placeholderColor: InteractiveColor? = null
        private var placeholderColorReadOnly: InteractiveColor? = null
        private var indicatorColor: InteractiveColor? = null
        private var indicatorColorReadOnly: InteractiveColor? = null
        private var dividerColor: InteractiveColor? = null
        private var dividerColorReadOnly: InteractiveColor? = null
        private var prefixColor: InteractiveColor? = null
        private var prefixColorReadOnly: InteractiveColor? = null
        private var suffixColor: InteractiveColor? = null
        private var suffixColorReadOnly: InteractiveColor? = null

        override fun disabledAlpha(disabledAlpha: Float) = apply {
            this.disabledAlpha = disabledAlpha
        }

        override fun cursorColor(cursorColor: InteractiveColor) = apply {
            this.cursorColor = cursorColor
        }

        override fun cursorColorReadOnly(cursorColorReadOnly: InteractiveColor) = apply {
            this.cursorColorReadOnly = cursorColorReadOnly
        }

        override fun startContentColor(startContentColor: InteractiveColor) = apply {
            this.startContentColor = startContentColor
        }

        override fun startContentColorReadOnly(startContentColorReadOnly: InteractiveColor) =
            apply {
                this.startContentColorReadOnly = startContentColorReadOnly
            }

        override fun endContentColor(endContentColor: InteractiveColor) = apply {
            this.endContentColor = endContentColor
        }

        override fun endContentColorReadOnly(endContentColorReadOnly: InteractiveColor) = apply {
            this.endContentColorReadOnly = endContentColorReadOnly
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

        override fun optionalColorReadOnly(optionalColorReadOnly: InteractiveColor) = apply {
            this.optionalColorReadOnly = optionalColorReadOnly
        }

        override fun counterColor(counterColor: InteractiveColor) = apply {
            this.counterColor = counterColor
        }

        override fun counterColorReadOnly(counterColorReadOnly: InteractiveColor) = apply {
            this.counterColorReadOnly = counterColorReadOnly
        }

        override fun placeholderColor(placeholderColor: InteractiveColor) = apply {
            this.placeholderColor = placeholderColor
        }

        override fun placeholderColorReadOnly(placeholderColorReadOnly: InteractiveColor) = apply {
            this.placeholderColorReadOnly = placeholderColorReadOnly
        }

        override fun backgroundColor(backgroundColor: InteractiveColor) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun backgroundColorReadOnly(backgroundColorReadOnly: InteractiveColor) = apply {
            this.backgroundColorReadOnly = backgroundColorReadOnly
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

        override fun indicatorColorReadOnly(indicatorColorReadOnly: InteractiveColor) = apply {
            this.indicatorColorReadOnly = indicatorColorReadOnly
        }

        override fun prefixColor(prefixColor: InteractiveColor) = apply {
            this.prefixColor = prefixColor
        }

        override fun suffixColor(suffixColor: InteractiveColor) = apply {
            this.suffixColor = suffixColor
        }

        override fun prefixColorReadOnly(prefixColorReadOnly: InteractiveColor) = apply {
            this.prefixColorReadOnly = prefixColorReadOnly
        }

        override fun suffixColorReadOnly(suffixColorReadOnly: InteractiveColor) = apply {
            this.suffixColorReadOnly = suffixColorReadOnly
        }

        @Suppress("CyclomaticComplexMethod")
        override fun build(): TextFieldColors {
            return DefaultTextFieldColors(
                disabledAlpha = disabledAlpha ?: DEFAULT_DISABLED_ALPHA,
                cursorColor = cursorColor ?: Color.Black.asInteractive(),
                cursorColorReadOnly = cursorColorReadOnly ?: cursorColor
                    ?: Color.Black.asInteractive(),
                startContentColor = startContentColor ?: Color.Black.asInteractive(),
                startContentColorReadOnly = startContentColorReadOnly
                    ?: startContentColor
                    ?: Color.Black.asInteractive(),
                endContentColor = endContentColor ?: Color.Black.asInteractive(),
                endContentColorReadOnly = endContentColorReadOnly ?: endContentColor
                    ?: Color.Black.asInteractive(),
                labelColor = labelColor ?: Color.Black.asInteractive(),
                labelColorReadOnly = labelColorReadOnly ?: labelColor
                    ?: Color.Black.asInteractive(),
                valueColor = valueColor ?: Color.Black.asInteractive(),
                valueColorReadOnly = valueColorReadOnly ?: valueColor
                    ?: Color.Black.asInteractive(),
                captionColor = captionColor ?: Color.Black.asInteractive(),
                captionColorReadOnly = captionColorReadOnly ?: captionColor
                    ?: Color.Black.asInteractive(),
                optionalColor = optionalColor ?: Color.Black.asInteractive(),
                optionalColorReadOnly = optionalColorReadOnly ?: optionalColor
                    ?: Color.Black.asInteractive(),
                counterColor = counterColor ?: Color.Black.asInteractive(),
                counterColorReadOnly = counterColorReadOnly ?: counterColor
                    ?: Color.Black.asInteractive(),
                backgroundColor = backgroundColor ?: Color.Transparent.asInteractive(),
                backgroundColorReadOnly = backgroundColorReadOnly
                    ?: backgroundColor ?: Color.Transparent.asInteractive(),
                placeholderColor = placeholderColor ?: Color.Gray.asInteractive(),
                placeholderColorReadOnly = placeholderColorReadOnly ?: placeholderColor
                    ?: Color.Gray.asInteractive(),
                indicatorColor = indicatorColor ?: Color.Red.asInteractive(),
                indicatorColorReadOnly = indicatorColorReadOnly ?: indicatorColor
                    ?: Color.Red.asInteractive(),
                prefixColor = prefixColor ?: Color.Black.asInteractive(),
                prefixColorReadOnly = prefixColorReadOnly ?: prefixColor
                    ?: Color.Black.asInteractive(),
                suffixColor = suffixColor ?: Color.Black.asInteractive(),
                suffixColorReadOnly = suffixColorReadOnly ?: suffixColor
                    ?: Color.Black.asInteractive(),
                dividerColor = dividerColor ?: Color.Transparent.asInteractive(),
                dividerColorReadOnly = dividerColorReadOnly ?: dividerColor
                    ?: Color.Transparent.asInteractive(),
            )
        }
    }
}

private class DefaultTextFieldDimensionsBuilder : TextFieldDimensionsBuilder {
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
    private var chipsPaddingStart: Dp? = null
    private var chipsPaddingEnd: Dp? = null
    private var chipsPaddingTop: Dp? = null
    private var chipsPaddingBottom: Dp? = null
    private var boxMinHeight: Dp? = null
    private var alignmentLineHeight: Dp? = null
    private var startContentSize: Dp? = null
    private var endContentSize: Dp? = null
    private var indicatorDimensionsBuilder: TextFieldIndicatorDimensionsBuilder =
        TextFieldIndicatorDimensionsBuilder.builder()
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

    override fun chipsPaddingStart(chipsPaddingStart: Dp) = apply {
        this.chipsPaddingStart = chipsPaddingStart
    }

    override fun chipsPaddingEnd(chipsPaddingEnd: Dp) = apply {
        this.chipsPaddingEnd = chipsPaddingEnd
    }

    override fun chipsPaddingTop(chipsPaddingTop: Dp) = apply {
        this.chipsPaddingTop = chipsPaddingTop
    }

    override fun chipsPaddingBottom(chipsPaddingBottom: Dp) = apply {
        this.chipsPaddingBottom = chipsPaddingBottom
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
    override fun indicatorDimensions(builder: @Composable TextFieldIndicatorDimensionsBuilder.() -> Unit) =
        apply { this.indicatorDimensionsBuilder.builder() }

    override fun dividerThickness(dividerThickness: Dp) = apply {
        this.dividerThickness = dividerThickness
    }

    @Suppress("CyclomaticComplexMethod")
    override fun build(): TextFieldDimensions {
        return TextFieldDimensions(
            boxPaddingStart = boxPaddingStart ?: 16.dp,
            boxPaddingEnd = boxPaddingEnd ?: 16.dp,
            boxPaddingTop = boxPaddingTop ?: 25.dp,
            boxPaddingBottom = boxPaddingBottom ?: 9.dp,
            labelPadding = labelPadding ?: 2.dp,
            optionalPadding = optionalPadding ?: 4.dp,
            helperTextPadding = helperTextPadding ?: 4.dp,
            startContentPadding = startContentPadding ?: 6.dp,
            endContentPadding = endContentPadding ?: 6.dp,
            chipsPadding = chipsPadding ?: 6.dp,
            chipsPaddingStart = chipsPaddingStart ?: chipsPadding ?: 6.dp,
            chipsPaddingEnd = chipsPaddingEnd ?: chipsPadding ?: 6.dp,
            chipsPaddingTop = chipsPaddingTop ?: chipsPadding ?: 6.dp,
            chipsPaddingBottom = chipsPaddingBottom ?: chipsPadding ?: 6.dp,
            boxMinHeight = boxMinHeight ?: 56.dp,
            alignmentLineHeight = alignmentLineHeight ?: 56.dp,
            startContentSize = startContentSize ?: 24.dp,
            endContentSize = endContentSize ?: 24.dp,
            indicatorDimensions = indicatorDimensionsBuilder.build(),
            dividerThickness = dividerThickness ?: 1.dp,
        )
    }
}

private class DefaultTextFieldIndicatorDimensionsBuilder : TextFieldIndicatorDimensionsBuilder {
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

    override fun build(): TextFieldDimensions.IndicatorDimensions {
        return TextFieldDimensions.IndicatorDimensions(
            horizontalPadding = horizontalPadding ?: 0.dp,
            verticalPadding = verticalPadding ?: 0.dp,
            indicatorSize = indicatorSize ?: 6.dp,
        )
    }
}

private class DefaultTextFieldScrollBarBuilder : TextFieldScrollBarBuilder {
    private var scrollBarThickness: Dp? = null
    private var scrollBarPaddingTop: Dp? = null
    private var scrollBarPaddingBottom: Dp? = null
    private var scrollBarPaddingEnd: Dp? = null
    private var scrollBarTrackColor: InteractiveColor? = null
    private var scrollBarThumbColor: InteractiveColor? = null

    override fun scrollBarThickness(scrollBarThickness: Dp) = apply {
        this.scrollBarThickness = scrollBarThickness
    }

    override fun scrollBarPaddingTop(scrollBarPaddingTop: Dp) = apply {
        this.scrollBarPaddingTop = scrollBarPaddingTop
    }

    override fun scrollBarPaddingBottom(scrollBarPaddingBottom: Dp) = apply {
        this.scrollBarPaddingBottom = scrollBarPaddingBottom
    }

    override fun scrollBarPaddingEnd(scrollBarPaddingEnd: Dp) = apply {
        this.scrollBarPaddingEnd = scrollBarPaddingEnd
    }

    override fun scrollBarTrackColor(scrollBarTrackColor: InteractiveColor) = apply {
        this.scrollBarTrackColor = scrollBarTrackColor
    }

    override fun scrollBarThumbColor(scrollBarThumbColor: InteractiveColor) = apply {
        this.scrollBarThumbColor = scrollBarThumbColor
    }

    override fun build(): ScrollBar? {
        val configured = scrollBarTrackColor != null ||
            scrollBarThumbColor != null ||
            scrollBarThickness != null ||
            scrollBarPaddingTop != null ||
            scrollBarPaddingBottom != null ||
            scrollBarPaddingEnd != null
        return if (configured) {
            ScrollBar(
                indicatorColor = scrollBarTrackColor ?: Color.Gray.asInteractive(),
                backgroundColor = scrollBarThumbColor ?: Color.LightGray.asInteractive(),
                indicatorThickness = scrollBarThickness ?: 1.dp,
                padding = PaddingValues(
                    top = scrollBarPaddingTop ?: 2.dp,
                    bottom = scrollBarPaddingBottom ?: 2.dp,
                    end = scrollBarPaddingEnd ?: 2.dp,
                ),
            )
        } else {
            null
        }
    }
}

private const val DEFAULT_DISABLED_ALPHA = 0.4f
