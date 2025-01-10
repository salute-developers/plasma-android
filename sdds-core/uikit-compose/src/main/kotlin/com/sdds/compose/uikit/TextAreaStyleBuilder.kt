package com.sdds.compose.uikit

import androidx.compose.foundation.layout.PaddingValues
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
val LocalTextAreaStyle = compositionLocalOf { TextFieldStyle.textAreaBuilder().style() }

/**
 * Возвращает экземпляр [TextAreaStyleBuilder]
 */
fun TextFieldStyle.Companion.textAreaBuilder(receiver: Any? = null): TextAreaStyleBuilder {
    return DefaultTextAreaStyle.Builder(receiver)
}

/**
 * Билдер стиля [TextFieldStyle]
 */
interface TextAreaStyleBuilder : StyleBuilder<TextFieldStyle> {

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     */
    @Composable
    fun dimensions(builder: @Composable TextAreaDimensionsBuilder.() -> Unit): TextAreaStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     */
    @Deprecated("Use dimensions() with builder instead")
    @Composable
    fun dimensions(dimensions: TextField.Dimensions): TextAreaStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder]
     */
    @Composable
    fun colors(builder: @Composable TextAreaColorsBuilder.() -> Unit): TextAreaStyleBuilder

    /**
     * Устанавливает форму компонента [shape]
     */
    fun shape(shape: CornerBasedShape): TextAreaStyleBuilder

    /**
     * Устанавливает расположение лэйбла [labelPlacement]
     */
    fun labelPlacement(labelPlacement: TextField.LabelPlacement): TextAreaStyleBuilder

    /**
     * Устанавливает тип поля [fieldType]
     */
    fun fieldType(fieldType: TextField.FieldType): TextAreaStyleBuilder

    /**
     * Устаналивает настройки скроллбара [scrollBar]
     */
    @Composable
    fun scrollBar(builder: @Composable TextAreaScrollBarBuilder.() -> Unit): TextAreaStyleBuilder

    /**
     * Устанавливает стиль лэйбла [labelStyle]
     */
    fun labelStyle(labelStyle: TextStyle): TextAreaStyleBuilder

    /**
     * Устанавливает стиль optional текста [optionalStyle]
     */
    fun optionalStyle(optionalStyle: TextStyle): TextAreaStyleBuilder

    /**
     * Устанавливает стиль основного текста [valueStyle]
     */
    fun valueStyle(valueStyle: TextStyle): TextAreaStyleBuilder

    /**
     * Устанавливает стиль надписи [captionStyle]
     */
    fun captionStyle(captionStyle: TextStyle): TextAreaStyleBuilder

    /**
     * Устанавливает стиль счетчика [counterStyle]
     */
    fun counterStyle(counterStyle: TextStyle): TextAreaStyleBuilder

    /**
     * Устанавливает стиль плэйсхолдера [placeholderStyle]
     */
    fun placeholderStyle(placeholderStyle: TextStyle): TextAreaStyleBuilder

    /**
     * Устанавливает стиль группы чипов [chipGroupStyle]
     */
    fun chipGroupStyle(chipGroupStyle: ChipGroupStyle): TextAreaStyleBuilder

    /**
     * Устанавливает стиль чипов [chipStyle]
     */
    fun chipStyle(chipStyle: ChipStyle): TextAreaStyleBuilder
}

/**
 * Билдер цветов [TextFieldColors]
 */
interface TextAreaColorsBuilder {

    /**
     * Устанавливает альфу [disabledAlpha] в состоянии disabled
     */
    fun disabledAlpha(disabledAlpha: Float): TextAreaColorsBuilder

    /**
     * Устанавливает цвет курсора [cursorColor]
     */
    fun cursorColor(cursorColor: Color): TextAreaColorsBuilder =
        cursorColor(cursorColor.asInteractive())

    /**
     * Устанавливает цвет курсора [cursorColor]
     */
    fun cursorColor(cursorColor: InteractiveColor): TextAreaColorsBuilder

    /**
     * Устанавливает цвет контента в начале [startContentColor]
     */
    fun startContentColor(startContentColor: Color): TextAreaColorsBuilder =
        startContentColor(startContentColor.asInteractive())

    /**
     * Устанавливает цвет контента в начале [startContentColor]
     */
    fun startContentColor(startContentColor: InteractiveColor): TextAreaColorsBuilder

    /**
     * Устанавливает цвет контента в конце [endContentColor]
     */
    fun endContentColor(endContentColor: Color): TextAreaColorsBuilder =
        endContentColor(endContentColor.asInteractive())

    /**
     * Устанавливает цвет контента в конце [endContentColor]
     */
    fun endContentColor(endContentColor: InteractiveColor): TextAreaColorsBuilder

    /**
     * Устанавливает цвет лэйбла [labelColor]
     */
    fun labelColor(labelColor: Color): TextAreaColorsBuilder =
        this.labelColor(labelColor.asInteractive())

    /**
     * Устанавливает цвет лэйбла [labelColor]
     */
    fun labelColor(labelColor: InteractiveColor): TextAreaColorsBuilder

    /**
     * Устанавливает цвет лэйбла в состоянии readOnly [labelColorReadOnly]
     */
    fun labelColorReadOnly(labelColorReadOnly: Color): TextAreaColorsBuilder =
        this.labelColorReadOnly(labelColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет лэйбла в состоянии readOnly [labelColorReadOnly]
     */
    fun labelColorReadOnly(labelColorReadOnly: InteractiveColor): TextAreaColorsBuilder

    /**
     * Устанавливает цвет основного текста [valueColor]
     */
    fun valueColor(valueColor: Color): TextAreaColorsBuilder =
        valueColor(valueColor.asInteractive())

    /**
     * Устанавливает цвет основного текста [valueColor]
     */
    fun valueColor(valueColor: InteractiveColor): TextAreaColorsBuilder

    /**
     * Устанавливает цвет основного текста в состоянии readOnly [valueColorReadOnly]
     */
    fun valueColorReadOnly(valueColorReadOnly: Color): TextAreaColorsBuilder =
        valueColorReadOnly(valueColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет основного текста в состоянии readOnly [valueColorReadOnly]
     */
    fun valueColorReadOnly(valueColorReadOnly: InteractiveColor): TextAreaColorsBuilder

    /**
     * Устанавливает цвет надписи [captionColor]
     */
    fun captionColor(captionColor: Color): TextAreaColorsBuilder =
        captionColor(captionColor.asInteractive())

    /**
     * Устанавливает цвет надписи [captionColor]
     */
    fun captionColor(captionColor: InteractiveColor): TextAreaColorsBuilder

    /**
     * Устанавливает цвет надписи в состоянии readOnly [captionColorReadOnly]
     */
    fun captionColorReadOnly(captionColorReadOnly: Color): TextAreaColorsBuilder =
        captionColorReadOnly(captionColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет надписи в состоянии readOnly [captionColorReadOnly]
     */
    fun captionColorReadOnly(captionColorReadOnly: InteractiveColor): TextAreaColorsBuilder

    /**
     * Устанавливает цвет опционального текста [optionalColor]
     */
    fun optionalColor(optionalColor: Color): TextAreaColorsBuilder =
        optionalColor(optionalColor.asInteractive())

    /**
     * Устанавливает цвет опционального текста [optionalColor]
     */
    fun optionalColor(optionalColor: InteractiveColor): TextAreaColorsBuilder

    /**
     * Устанавливает цвет счетчика [counterColor]
     */
    fun counterColor(counterColor: Color): TextAreaColorsBuilder =
        counterColor(counterColor.asInteractive())

    /**
     * Устанавливает цвет счетчика [counterColor]
     */
    fun counterColor(counterColor: InteractiveColor): TextAreaColorsBuilder

    /**
     * Устанавливает цвет плэйсхолдера [placeholderColor]
     */
    fun placeholderColor(placeholderColor: Color): TextAreaColorsBuilder =
        placeholderColor(placeholderColor.asInteractive())

    /**
     * Устанавливает цвет плэйсхолдера [placeholderColor]
     */
    fun placeholderColor(placeholderColor: InteractiveColor): TextAreaColorsBuilder

    /**
     * Устанавливает цвет плэйсхолдеоа в состоянии readOnly [placeholderColorReadOnly]
     */
    fun placeholderColorReadOnly(placeholderColorReadOnly: Color): TextAreaColorsBuilder =
        placeholderColorReadOnly(placeholderColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет плэйсхолдеоа в состоянии readOnly [placeholderColorReadOnly]
     */
    fun placeholderColorReadOnly(placeholderColorReadOnly: InteractiveColor): TextAreaColorsBuilder

    /**
     * Устанавливает цвет бэкграунда [backgroundColor]
     */
    fun backgroundColor(backgroundColor: Color): TextAreaColorsBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Устанавливает цвет бэкграунда [backgroundColor]
     */
    fun backgroundColor(backgroundColor: InteractiveColor): TextAreaColorsBuilder

    /**
     * Устанавливает цвет бэкграунда в состоянии readOnly [backgroundColorReadOnly]
     */
    fun backgroundColorReadOnly(backgroundColorReadOnly: Color): TextAreaColorsBuilder =
        backgroundColorReadOnly(backgroundColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет бэкграунда в состоянии readOnly [backgroundColorReadOnly]
     */
    fun backgroundColorReadOnly(backgroundColorReadOnly: InteractiveColor): TextAreaColorsBuilder

    /**
     * Устанавливает цвет индикатора
     */
    fun indicatorColor(indicatorColor: Color): TextAreaColorsBuilder =
        indicatorColor(indicatorColor.asInteractive())

    /**
     * Устанавливает цвет индикатора
     */
    fun indicatorColor(indicatorColor: InteractiveColor): TextAreaColorsBuilder

    /**
     * Вернет экземпляр [TextFieldColors]
     */
    fun build(): TextFieldColors

    companion object {

        /**
         * Вернет экземпляр билдера [TextAreaColorsBuilder]
         */
        fun builder(): TextAreaColorsBuilder = DefaultTextAreaColors.Builder()
    }
}

/**
 * Билдер размеров для [TextField]
 */
interface TextAreaDimensionsBuilder {

    /**
     * Устанавливает отступ контента в начале
     */
    fun boxPaddingStart(boxPaddingStart: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает отступ контента в конце
     */
    fun boxPaddingEnd(boxPaddingEnd: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает верхний отступ контента
     */
    fun boxPaddingTop(boxPaddingTop: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает нижний отступ контента
     */
    fun boxPaddingBottom(boxPaddingBottom: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает нижний отступ
     */
    fun labelPadding(labelPadding: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает отступ в начале optional текста
     */
    fun optionalPadding(optionalPadding: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает верхний отступ helper текста (caption/counter)
     */
    fun helperTextPadding(helperTextPadding: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает отступ после startContent
     */
    fun startContentPadding(startContentPadding: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает отступ перед endContent
     */
    fun endContentPadding(endContentPadding: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает отступ от контейнера с chip-элементами
     */
    fun chipsPadding(chipsPadding: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает минимальную высоту поля
     */
    fun boxMinHeight(boxMinHeight: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает высоту первой строки контента
     */
    fun alignmentLineHeight(alignmentLineHeight: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает размер иконки в начале
     */
    fun startContentSize(startContentSize: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает размер иконки в конце
     */
    fun endContentSize(endContentSize: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает настройки индикатора
     */
    @Composable
    fun indicatorDimensions(
        builder: @Composable TextAreaIndicatorDimensionsBuilder.() -> Unit,
    ): TextAreaDimensionsBuilder

    /**
     * Возвращает [TextField.Dimensions]
     */
    fun build(): TextField.Dimensions

    companion object {
        /**
         * Вернет экземпляр билдера [TextAreaDimensionsBuilder]
         */
        fun builder(): TextAreaDimensionsBuilder = DefaultTextAreaDimensionsBuilder()
    }
}

/**
 * Билдер настроек индикатора
 */
interface TextAreaIndicatorDimensionsBuilder {

    /**
     * Устанавливает горизонтальный отступ индикатора
     */
    fun horizontalPadding(horizontalPadding: Dp): TextAreaIndicatorDimensionsBuilder

    /**
     * Устанавливает вертикальный отступ индикатора
     */
    fun verticalPadding(verticalPadding: Dp): TextAreaIndicatorDimensionsBuilder

    /**
     * Устанавливает размер индикатора
     */
    fun indicatorSize(indicatorSize: Dp): TextAreaIndicatorDimensionsBuilder

    /**
     * Возвращает экземпляр [TextField.Dimensions.IndicatorDimensions]
     */
    fun build(): TextField.Dimensions.IndicatorDimensions

    companion object {

        /**
         * Возвращает билдер [TextAreaIndicatorDimensionsBuilder]
         */
        fun builder(): TextAreaIndicatorDimensionsBuilder =
            DefaultTextAreaIndicatorDimensionsBuilder()
    }
}

/**
 * Билдер scrollBar
 */
interface TextAreaScrollBarBuilder {

    /**
     * Устанавливает толщину scrollBar [scrollBarThickness]
     */
    fun scrollBarThickness(scrollBarThickness: Dp): TextAreaScrollBarBuilder

    /**
     * Устанавливает верхний отступ scrollBar [scrollBarPaddingTop]
     */
    fun scrollBarPaddingTop(scrollBarPaddingTop: Dp): TextAreaScrollBarBuilder

    /**
     * Устанавливает нижний отступ scrollBar [scrollBarPaddingBottom]
     */
    fun scrollBarPaddingBottom(scrollBarPaddingBottom: Dp): TextAreaScrollBarBuilder

    /**
     * Устанавливает отступ scrollBar в конце [scrollBarPaddingEnd]
     */
    fun scrollBarPaddingEnd(scrollBarPaddingEnd: Dp): TextAreaScrollBarBuilder

    /**
     * Устанавливает цвет scrollBar [scrollBarTrackColor]
     */
    fun scrollBarTrackColor(scrollBarTrackColor: InteractiveColor): TextAreaScrollBarBuilder

    /**
     * Устанавливает цвет фона scrollBar [scrollBarThumbColor]
     */
    fun scrollBarThumbColor(scrollBarThumbColor: InteractiveColor): TextAreaScrollBarBuilder

    /**
     * Возвращает экземпляр [ScrollBar]
     */
    fun build(): ScrollBar?

    companion object {

        /**
         * Возвращает билдер [TextAreaScrollBarBuilder]
         */
        fun builder(): TextAreaScrollBarBuilder =
            DefaultTextAreaScrollBarBuilder()
    }
}

private class DefaultTextAreaIndicatorDimensionsBuilder : TextAreaIndicatorDimensionsBuilder {
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

private class DefaultTextAreaScrollBarBuilder : TextAreaScrollBarBuilder {
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

private class DefaultTextAreaDimensionsBuilder : TextAreaDimensionsBuilder {
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
    private var indicatorDimensionsBuilder: TextAreaIndicatorDimensionsBuilder =
        TextAreaIndicatorDimensionsBuilder.builder()

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
    override fun indicatorDimensions(builder: @Composable TextAreaIndicatorDimensionsBuilder.() -> Unit) =
        apply {
            this.indicatorDimensionsBuilder.builder()
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
            helperTextPadding = helperTextPadding ?: 4.dp,
            startContentPadding = startContentPadding ?: 6.dp,
            endContentPadding = endContentPadding ?: 6.dp,
            chipsPadding = chipsPadding ?: 6.dp,
            boxMinHeight = boxMinHeight ?: 56.dp,
            alignmentLineHeight = alignmentLineHeight ?: 56.dp,
            startContentSize = startContentSize ?: 24.dp,
            endContentSize = endContentSize ?: 24.dp,
            indicatorDimensions = indicatorDimensionsBuilder.build(),
        )
    }
}

@Immutable
@Suppress("LongParameterList")
private class DefaultTextAreaStyle(
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

    class Builder(override val receiver: Any?) : TextAreaStyleBuilder {

        private var colorsBuilder: TextAreaColorsBuilder = TextAreaColorsBuilder.builder()
        private var dimensionsBuilder: TextAreaDimensionsBuilder =
            TextAreaDimensionsBuilder.builder()
        private var scrollBarBuilder: TextAreaScrollBarBuilder = TextAreaScrollBarBuilder.builder()
        private var shape: CornerBasedShape? = null
        private var labelPlacement: TextField.LabelPlacement? = null
        private var fieldType: TextField.FieldType? = null
        private var labelStyle: TextStyle? = null
        private var optionalStyle: TextStyle? = null
        private var valueStyle: TextStyle? = null
        private var captionStyle: TextStyle? = null
        private var counterStyle: TextStyle? = null
        private var placeholderStyle: TextStyle? = null
        private var chipGroupStyle: ChipGroupStyle? = null
        private var chipStyle: ChipStyle? = null

        @Composable
        override fun dimensions(builder: @Composable TextAreaDimensionsBuilder.() -> Unit) = apply {
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
            }
        }

        @Composable
        override fun colors(builder: @Composable (TextAreaColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        override fun shape(shape: CornerBasedShape) = apply {
            this.shape = shape
        }

        override fun labelPlacement(labelPlacement: TextField.LabelPlacement) = apply {
            this.labelPlacement = labelPlacement
        }

        override fun fieldType(fieldType: TextField.FieldType) = apply {
            this.fieldType = fieldType
        }

        @Composable
        override fun scrollBar(builder: @Composable (TextAreaScrollBarBuilder.() -> Unit)) = apply {
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

        override fun chipGroupStyle(chipGroupStyle: ChipGroupStyle) = apply {
            this.chipGroupStyle = chipGroupStyle
        }

        override fun chipStyle(chipStyle: ChipStyle) = apply {
            this.chipStyle = chipStyle
        }

        @Suppress("CyclomaticComplexMethod")
        override fun style(): TextFieldStyle {
            return DefaultTextAreaStyle(
                singleLine = false,
                hasDivider = false,
                fieldAppearance = TextField.FieldAppearance.Solid,
                helperTextPlacement = TextField.HelperTextPlacement.Inner,
                dimensions = dimensionsBuilder.build(),
                colors = colorsBuilder.build(),
                shape = shape ?: RoundedCornerShape(CornerSize(8.dp)),
                fieldType = fieldType ?: TextField.FieldType.Optional,
                labelPlacement = labelPlacement ?: TextField.LabelPlacement.None,
                scrollBar = scrollBarBuilder.build(),
                labelStyle = labelStyle ?: TextStyle.Default,
                optionalStyle = optionalStyle ?: TextStyle.Default,
                valueStyle = valueStyle ?: TextStyle.Default,
                captionStyle = captionStyle ?: TextStyle.Default,
                counterStyle = counterStyle ?: TextStyle.Default,
                placeholderStyle = placeholderStyle ?: TextStyle.Default,
                chipGroupStyle = chipGroupStyle ?: ChipGroupStyle.builder().style(),
                chipStyle = chipStyle ?: ChipStyle.builder().style(),
            )
        }
    }
}

@Suppress("LongParameterList")
private class DefaultTextAreaColors(
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
    private val backgroundColor: InteractiveColor,
    private val backgroundColorReadOnly: InteractiveColor,
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

    override fun dividerColor(isReadOnly: Boolean) = DUMMY_COLOR

    override fun placeholderColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) placeholderColorReadOnly else placeholderColor
    }

    override fun backgroundColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) backgroundColorReadOnly else backgroundColor
    }

    class Builder : TextAreaColorsBuilder {
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
        private var backgroundColor: InteractiveColor? = null
        private var backgroundColorReadOnly: InteractiveColor? = null
        private var placeholderColor: InteractiveColor? = null
        private var placeholderColorReadOnly: InteractiveColor? = null
        private var indicatorColor: InteractiveColor? = null

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

        override fun backgroundColor(backgroundColor: InteractiveColor) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun backgroundColorReadOnly(backgroundColorReadOnly: InteractiveColor) = apply {
            this.backgroundColorReadOnly = backgroundColorReadOnly
        }

        override fun indicatorColor(indicatorColor: InteractiveColor) = apply {
            this.indicatorColor = indicatorColor
        }

        @Suppress("CyclomaticComplexMethod")
        override fun build(): TextFieldColors {
            return DefaultTextAreaColors(
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
                backgroundColor = backgroundColor ?: Color.LightGray.asInteractive(),
                backgroundColorReadOnly = backgroundColorReadOnly
                    ?: Color.LightGray.asInteractive(),
                placeholderColor = placeholderColor ?: Color.Gray.asInteractive(),
                placeholderColorReadOnly = placeholderColorReadOnly ?: Color.Gray.asInteractive(),
                indicatorColor = indicatorColor ?: Color.Red.asInteractive(),
            )
        }
    }
}

private const val DEFAULT_DISABLED_ALPHA = 0.4f
private val DUMMY_COLOR = Color.Transparent.asInteractive()
