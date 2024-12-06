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
    fun dimensions(builder: TextAreaDimensionsBuilder.() -> Unit): TextAreaStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     */
    @Deprecated("Use dimensions() with builder instead")
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
     * Устанавливает расположение вспомогательного текста [helperTextPlacement]
     */
    fun helperTextPlacement(helperTextPlacement: TextField.HelperTextPlacement): TextAreaStyleBuilder

    /**
     * Устанавливает тип поля [fieldType]
     */
    fun fieldType(fieldType: TextField.FieldType): TextAreaStyleBuilder

    /**
     * Устанавливает внешний вид поля [fieldAppearance]
     */
    fun fieldAppearance(fieldAppearance: TextField.FieldAppearance): TextAreaStyleBuilder

    /**
     * Устаналивает настройки скроллбара [scrollBar]
     */
    fun scrollBar(scrollBar: ScrollBar?): TextAreaStyleBuilder

    /**
     * Устанавливает стиль внутреннего лэйбла [innerLabelStyle]
     */
    fun innerLabelStyle(innerLabelStyle: TextStyle): TextAreaStyleBuilder

    /**
     * Устанавливает стиль внешнего лэйбла [outerLabelStyle]
     */
    fun outerLabelStyle(outerLabelStyle: TextStyle): TextAreaStyleBuilder

    /**
     * Устанавливает стиль внутреннего optional текста [innerOptionalStyle]
     */
    fun innerOptionalStyle(innerOptionalStyle: TextStyle): TextAreaStyleBuilder

    /**
     * Устанавливает стиль внешнего optional текста [outerOptionalStyle]
     */
    fun outerOptionalStyle(outerOptionalStyle: TextStyle): TextAreaStyleBuilder

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
     * Устанавливает однострочный/многострочный режим [singleLine]
     */
    fun singleLine(singleLine: Boolean): TextAreaStyleBuilder

    /**
     * Устанавливает наличие разделителя [hasDivider]
     */
    fun hasDivider(hasDivider: Boolean): TextAreaStyleBuilder

    /**
     * Устаналивает необходимость скрывать внутренний лэйбл [dropInnerLabel]
     */
    fun dropInnerLabel(dropInnerLabel: Boolean): TextAreaStyleBuilder

    /**
     * Устанавливает стиль чипов [chipGroupStyle]
     */
    fun chipGroupStyle(chipGroupStyle: ChipGroupStyle): TextAreaStyleBuilder
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
     * Устанавливает альфу [enabledAlpha] в состоянии enabled
     */
    fun enabledAlpha(enabledAlpha: Float): TextAreaColorsBuilder

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
     * Устанавливает цвет внутреннего лэйбла [innerLabelColor]
     */
    fun innerLabelColor(innerLabelColor: Color): TextAreaColorsBuilder =
        innerLabelColor(innerLabelColor.asInteractive())

    /**
     * Устанавливает цвет внутреннего лэйбла [innerLabelColor]
     */
    fun innerLabelColor(innerLabelColor: InteractiveColor): TextAreaColorsBuilder

    /**
     * Устанавливает цвет внешнего лэйбла [outerLabelColor]
     */
    fun outerLabelColor(outerLabelColor: Color): TextAreaColorsBuilder =
        outerLabelColor(outerLabelColor.asInteractive())

    /**
     * Устанавливает цвет внешнего лэйбла [outerLabelColor]
     */
    fun outerLabelColor(outerLabelColor: InteractiveColor): TextAreaColorsBuilder

    /**
     * Устанавливает цвет внешнего лэйбла в состоянии readOnly [outerLabelColorReadOnly]
     */
    fun outerLabelColorReadOnly(outerLabelColorReadOnly: Color): TextAreaColorsBuilder =
        outerLabelColorReadOnly(outerLabelColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет внешнего лэйбла в состоянии readOnly [outerLabelColorReadOnly]
     */
    fun outerLabelColorReadOnly(outerLabelColorReadOnly: InteractiveColor): TextAreaColorsBuilder

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
     * Устанавливает цвет разделителя [dividerColor]
     */
    fun dividerColor(dividerColor: Color): TextAreaColorsBuilder =
        dividerColor(dividerColor.asInteractive())

    /**
     * Устанавливает цвет разделителя [dividerColor]
     */
    fun dividerColor(dividerColor: InteractiveColor): TextAreaColorsBuilder

    /**
     * Устанавливает цвет разделителя в состоянии readOnlu [dividerColorReadOnly]
     */
    fun dividerColorReadOnly(dividerColorReadOnly: Color): TextAreaColorsBuilder =
        dividerColorReadOnly(dividerColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет разделителя в состоянии readOnlu [dividerColorReadOnly]
     */
    fun dividerColorReadOnly(dividerColorReadOnly: InteractiveColor): TextAreaColorsBuilder

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
     * Устанавливает верхний отступ контента с внутренним лэйблом
     */
    fun boxPaddingTopInnerLabel(boxPaddingTopInnerLabel: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает нижний отступ контента с внутренним лэйблом
     */
    fun boxPaddingBottomInnerLabel(boxPaddingBottomInnerLabel: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает верхний отступ контента с наружным лэйблом
     */
    fun boxPaddingTopOuterLabel(boxPaddingTopOuterLabel: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает нижний отступ контента с наружным лэйблом
     */
    fun boxPaddingBottomOuterLabel(boxPaddingBottomOuterLabel: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает нижний отступ внутреннего лэйбла
     */
    fun innerLabelPadding(innerLabelPadding: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает нижний отступ наружного лэйбла
     */
    fun outerLabelPadding(outerLabelPadding: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает отступ в начале optional текста
     */
    fun optionalPadding(optionalPadding: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает верхний отступ внутреннего helper текста (caption/counter)
     */
    fun helperTextPaddingInner(helperTextPaddingInner: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает верхний отступ наружного helper текста (caption/counter)
     */
    fun helperTextPaddingOuter(helperTextPaddingOuter: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает отступ после startContent
     */
    fun startContentEndPadding(startContentEndPadding: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает отступ перед endContent
     */
    fun endContentStartPadding(endContentStartPadding: Dp): TextAreaDimensionsBuilder

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
     * Устанавливает размер иконки
     */
    fun iconSize(iconSize: Dp): TextAreaDimensionsBuilder

    /**
     * Устанавливает настройки индикатора
     */
    fun indicatorDimensions(builder: TextAreaIndicatorDimensionsBuilder.() -> Unit): TextAreaDimensionsBuilder

    /**
     * Устанавливает толщину разделителя в clear режиме
     */
    fun dividerThickness(dividerThickness: Dp): TextAreaDimensionsBuilder

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
     * Устанавливает начальный горизонтальный отступ внешнего индикатора
     */
    fun startLabelHorizontalPadding(startLabelHorizontalPadding: Dp): TextAreaIndicatorDimensionsBuilder

    /**
     * Устанавливает начальный вертикальный отступ внешнего индикатора
     */
    fun startLabelVerticalPadding(startLabelVerticalPadding: Dp): TextAreaIndicatorDimensionsBuilder

    /**
     * Устанавливает конечный горизонтальный отступ внешнего индикатора
     */
    fun endLabelHorizontalPadding(endLabelHorizontalPadding: Dp): TextAreaIndicatorDimensionsBuilder

    /**
     * Устанавливает конечный вертикальный отступ внешнего индикатора
     */
    fun endLabelVerticalPadding(endLabelVerticalPadding: Dp): TextAreaIndicatorDimensionsBuilder

    /**
     * Устанавливает начальный горизонтальный отступ внутреннего индикатора
     */
    fun startFieldHorizontalPadding(startFieldHorizontalPadding: Dp): TextAreaIndicatorDimensionsBuilder

    /**
     * Устанавливает начальный вертикальный отступ внутреннего индикатора
     */
    fun startFieldVerticalPadding(startFieldVerticalPadding: Dp): TextAreaIndicatorDimensionsBuilder

    /**
     * Устанавливает конечный горизонтальный отступ внутреннего индикатора
     */
    fun endFieldHorizontalPadding(endFieldHorizontalPadding: Dp): TextAreaIndicatorDimensionsBuilder

    /**
     * Устанавливает конечный вертикальный отступ внутреннего индикатора
     */
    fun endFieldVerticalPadding(endFieldVerticalPadding: Dp): TextAreaIndicatorDimensionsBuilder

    /**
     * Устанавливает размер внешнего индикатора
     */
    fun labelIndicatorSize(labelIndicatorSize: Dp): TextAreaIndicatorDimensionsBuilder

    /**
     * Устанавливает размер внутреннего индикатора
     */
    fun fieldIndicatorSize(fieldIndicatorSize: Dp): TextAreaIndicatorDimensionsBuilder

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

private class DefaultTextAreaIndicatorDimensionsBuilder : TextAreaIndicatorDimensionsBuilder {
    private var startLabelHorizontalPadding: Dp? = null
    private var startLabelVerticalPadding: Dp? = null
    private var endLabelHorizontalPadding: Dp? = null
    private var endLabelVerticalPadding: Dp? = null
    private var startFieldHorizontalPadding: Dp? = null
    private var startFieldVerticalPadding: Dp? = null
    private var endFieldHorizontalPadding: Dp? = null
    private var endFieldVerticalPadding: Dp? = null
    private var labelIndicatorSize: Dp? = null
    private var fieldIndicatorSize: Dp? = null
    override fun startLabelHorizontalPadding(startLabelHorizontalPadding: Dp) = apply {
        this.startLabelHorizontalPadding = startLabelHorizontalPadding
    }

    override fun startLabelVerticalPadding(startLabelVerticalPadding: Dp) = apply {
        this.startLabelVerticalPadding = startLabelVerticalPadding
    }

    override fun endLabelHorizontalPadding(endLabelHorizontalPadding: Dp) = apply {
        this.endLabelHorizontalPadding = endLabelHorizontalPadding
    }

    override fun endLabelVerticalPadding(endLabelVerticalPadding: Dp) = apply {
        this.endLabelVerticalPadding = endLabelVerticalPadding
    }

    override fun startFieldHorizontalPadding(startFieldHorizontalPadding: Dp) = apply {
        this.startFieldHorizontalPadding = startFieldHorizontalPadding
    }

    override fun startFieldVerticalPadding(startFieldVerticalPadding: Dp) = apply {
        this.startFieldVerticalPadding = startFieldVerticalPadding
    }

    override fun endFieldHorizontalPadding(endFieldHorizontalPadding: Dp) = apply {
        this.endFieldHorizontalPadding = endFieldHorizontalPadding
    }

    override fun endFieldVerticalPadding(endFieldVerticalPadding: Dp) = apply {
        this.endFieldVerticalPadding = endFieldVerticalPadding
    }

    override fun labelIndicatorSize(labelIndicatorSize: Dp) = apply {
        this.labelIndicatorSize = labelIndicatorSize
    }

    override fun fieldIndicatorSize(fieldIndicatorSize: Dp) = apply {
        this.fieldIndicatorSize = fieldIndicatorSize
    }

    override fun build(): TextField.Dimensions.IndicatorDimensions {
        return TextField.Dimensions.IndicatorDimensions(
            startLabelHorizontalPadding = startLabelHorizontalPadding ?: 0.dp,
            startLabelVerticalPadding = startLabelVerticalPadding ?: 0.dp,
            endLabelHorizontalPadding = endLabelHorizontalPadding ?: 0.dp,
            endLabelVerticalPadding = endLabelVerticalPadding ?: 0.dp,
            startFieldHorizontalPadding = startFieldHorizontalPadding ?: 0.dp,
            startFieldVerticalPadding = startFieldVerticalPadding ?: 0.dp,
            endFieldHorizontalPadding = endFieldHorizontalPadding ?: 0.dp,
            endFieldVerticalPadding = endFieldVerticalPadding ?: 0.dp,
            labelIndicatorSize = labelIndicatorSize ?: 6.dp,
            fieldIndicatorSize = fieldIndicatorSize ?: 6.dp,
        )
    }
}

private class DefaultTextAreaDimensionsBuilder : TextAreaDimensionsBuilder {
    private var boxPaddingStart: Dp? = null
    private var boxPaddingEnd: Dp? = null
    private var boxPaddingTopInnerLabel: Dp? = null
    private var boxPaddingBottomInnerLabel: Dp? = null
    private var boxPaddingTopOuterLabel: Dp? = null
    private var boxPaddingBottomOuterLabel: Dp? = null
    private var innerLabelPadding: Dp? = null
    private var outerLabelPadding: Dp? = null
    private var optionalPadding: Dp? = null
    private var helperTextPaddingInner: Dp? = null
    private var helperTextPaddingOuter: Dp? = null
    private var startContentEndPadding: Dp? = null
    private var endContentStartPadding: Dp? = null
    private var chipsPadding: Dp? = null
    private var boxMinHeight: Dp? = null
    private var alignmentLineHeight: Dp? = null
    private var iconSize: Dp? = null
    private var indicatorDimensionsBuilder: TextAreaIndicatorDimensionsBuilder =
        TextAreaIndicatorDimensionsBuilder.builder()
    private var dividerThickness: Dp? = null
    override fun boxPaddingStart(boxPaddingStart: Dp) = apply {
        this.boxPaddingStart = boxPaddingStart
    }

    override fun boxPaddingEnd(boxPaddingEnd: Dp) = apply {
        this.boxPaddingEnd = boxPaddingEnd
    }

    override fun boxPaddingTopInnerLabel(boxPaddingTopInnerLabel: Dp) = apply {
        this.boxPaddingTopInnerLabel = boxPaddingTopInnerLabel
    }

    override fun boxPaddingBottomInnerLabel(boxPaddingBottomInnerLabel: Dp) = apply {
        this.boxPaddingBottomInnerLabel = boxPaddingBottomInnerLabel
    }

    override fun boxPaddingTopOuterLabel(boxPaddingTopOuterLabel: Dp) = apply {
        this.boxPaddingTopOuterLabel = boxPaddingTopOuterLabel
    }

    override fun boxPaddingBottomOuterLabel(boxPaddingBottomOuterLabel: Dp) = apply {
        this.boxPaddingBottomOuterLabel = boxPaddingBottomOuterLabel
    }

    override fun innerLabelPadding(innerLabelPadding: Dp) = apply {
        this.innerLabelPadding = innerLabelPadding
    }

    override fun outerLabelPadding(outerLabelPadding: Dp) = apply {
        this.outerLabelPadding = outerLabelPadding
    }

    override fun optionalPadding(optionalPadding: Dp) = apply {
        this.optionalPadding = optionalPadding
    }

    override fun helperTextPaddingInner(helperTextPaddingInner: Dp) = apply {
        this.helperTextPaddingInner = helperTextPaddingInner
    }

    override fun helperTextPaddingOuter(helperTextPaddingOuter: Dp) = apply {
        this.helperTextPaddingOuter = helperTextPaddingOuter
    }

    override fun startContentEndPadding(startContentEndPadding: Dp) = apply {
        this.startContentEndPadding = startContentEndPadding
    }

    override fun endContentStartPadding(endContentStartPadding: Dp) = apply {
        this.endContentStartPadding = endContentStartPadding
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

    override fun iconSize(iconSize: Dp) = apply {
        this.iconSize = iconSize
    }

    override fun indicatorDimensions(builder: TextAreaIndicatorDimensionsBuilder.() -> Unit) =
        apply {
            this.indicatorDimensionsBuilder.builder()
        }

    override fun dividerThickness(dividerThickness: Dp) = apply {
        this.dividerThickness = dividerThickness
    }

    @Suppress("CyclomaticComplexMethod")
    override fun build(): TextField.Dimensions {
        return TextField.Dimensions(
            boxPaddingStart = boxPaddingStart ?: 16.dp,
            boxPaddingEnd = boxPaddingEnd ?: 16.dp,
            boxPaddingTopInnerLabel = boxPaddingTopInnerLabel ?: 25.dp,
            boxPaddingBottomInnerLabel = boxPaddingBottomInnerLabel ?: 9.dp,
            boxPaddingTopOuterLabel = boxPaddingTopOuterLabel ?: 25.dp,
            boxPaddingBottomOuterLabel = boxPaddingBottomOuterLabel ?: 9.dp,
            innerLabelPadding = innerLabelPadding ?: 2.dp,
            outerLabelPadding = outerLabelPadding ?: 2.dp,
            optionalPadding = optionalPadding ?: 4.dp,
            helperTextPaddingInner = helperTextPaddingInner ?: 4.dp,
            helperTextPaddingOuter = helperTextPaddingOuter ?: 4.dp,
            startContentEndPadding = startContentEndPadding ?: 6.dp,
            endContentStartPadding = endContentStartPadding ?: 6.dp,
            chipsPadding = chipsPadding ?: 6.dp,
            boxMinHeight = boxMinHeight ?: 56.dp,
            alignmentLineHeight = alignmentLineHeight ?: 56.dp,
            iconSize = iconSize ?: 24.dp,
            indicatorDimensions = indicatorDimensionsBuilder.build(),
            dividerThickness = dividerThickness ?: 1.dp,
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

    class Builder(override val receiver: Any?) : TextAreaStyleBuilder {

        private var colorsBuilder: TextAreaColorsBuilder = TextAreaColorsBuilder.builder()
        private var dimensionsBuilder: TextAreaDimensionsBuilder =
            TextAreaDimensionsBuilder.builder()
        private var shape: CornerBasedShape? = null
        private var labelPlacement: TextField.LabelPlacement? = null
        private var helperTextPlacement: TextField.HelperTextPlacement? = null
        private var fieldType: TextField.FieldType? = null
        private var fieldAppearance: TextField.FieldAppearance? = null
        private var scrollBar: ScrollBar? = null
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

        override fun dimensions(builder: TextAreaDimensionsBuilder.() -> Unit) = apply {
            this.dimensionsBuilder.builder()
        }

        @Deprecated("Use dimensions() with builder instead")
        override fun dimensions(dimensions: TextField.Dimensions) = apply {
            this.dimensionsBuilder.apply {
                boxPaddingStart(dimensions.boxPaddingStart)
                boxPaddingEnd(dimensions.boxPaddingEnd)
                boxPaddingTopInnerLabel(dimensions.boxPaddingTopInnerLabel)
                boxPaddingBottomInnerLabel(dimensions.boxPaddingBottomInnerLabel)
                boxPaddingTopOuterLabel(dimensions.boxPaddingTopOuterLabel)
                boxPaddingBottomOuterLabel(dimensions.boxPaddingBottomOuterLabel)
                innerLabelPadding(dimensions.innerLabelPadding)
                outerLabelPadding(dimensions.outerLabelPadding)
                optionalPadding(dimensions.optionalPadding)
                helperTextPaddingInner(dimensions.helperTextPaddingInner)
                helperTextPaddingOuter(dimensions.helperTextPaddingOuter)
                startContentEndPadding(dimensions.startContentEndPadding)
                endContentStartPadding(dimensions.endContentStartPadding)
                chipsPadding(dimensions.chipsPadding)
                boxMinHeight(dimensions.boxMinHeight)
                alignmentLineHeight(dimensions.alignmentLineHeight)
                iconSize(dimensions.iconSize)
                indicatorDimensions {
                    startLabelHorizontalPadding(dimensions.indicatorDimensions.startLabelHorizontalPadding)
                    startLabelVerticalPadding(dimensions.indicatorDimensions.startLabelVerticalPadding)
                    endLabelHorizontalPadding(dimensions.indicatorDimensions.endLabelHorizontalPadding)
                    endLabelVerticalPadding(dimensions.indicatorDimensions.endLabelVerticalPadding)
                    startFieldHorizontalPadding(dimensions.indicatorDimensions.startFieldHorizontalPadding)
                    startFieldVerticalPadding(dimensions.indicatorDimensions.startFieldVerticalPadding)
                    endFieldHorizontalPadding(dimensions.indicatorDimensions.endFieldHorizontalPadding)
                    endFieldVerticalPadding(dimensions.indicatorDimensions.endFieldVerticalPadding)
                    labelIndicatorSize(dimensions.indicatorDimensions.labelIndicatorSize)
                    fieldIndicatorSize(dimensions.indicatorDimensions.fieldIndicatorSize)
                }
                dividerThickness(dimensions.dividerThickness)
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

        @Suppress("CyclomaticComplexMethod")
        override fun style(): TextFieldStyle {
            return DefaultTextAreaStyle(
                dimensions = dimensionsBuilder.build(),
                colors = colorsBuilder.build(),
                shape = shape ?: RoundedCornerShape(CornerSize(8.dp)),
                fieldType = fieldType ?: TextField.FieldType.Optional,
                fieldAppearance = fieldAppearance ?: TextField.FieldAppearance.Solid,
                labelPlacement = labelPlacement ?: TextField.LabelPlacement.Outer,
                helperTextPlacement = helperTextPlacement ?: TextField.HelperTextPlacement.Inner,
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
                chipGroupStyle = chipGroupStyle ?: ChipGroupStyle.builder().style(),
            )
        }
    }
}

@Suppress("LongParameterList")
private class DefaultTextAreaColors(
    override val disabledAlpha: Float,
    override val enabledAlpha: Float,
    override val endContentColor: InteractiveColor,
    override val optionalColor: InteractiveColor,
    override val counterColor: InteractiveColor,
    override val cursorColor: InteractiveColor,
    override val indicatorColor: InteractiveColor,
    override val startContentColor: InteractiveColor,
    private val innerLabelColor: InteractiveColor,
    private val outerLabelColor: InteractiveColor,
    private val outerLabelColorReadOnly: InteractiveColor,
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
        labelPlacement: TextField.LabelPlacement,
    ): InteractiveColor {
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

    class Builder : TextAreaColorsBuilder {
        private var disabledAlpha: Float? = null
        private var enabledAlpha: Float? = null
        private var cursorColor: InteractiveColor? = null
        private var startContentColor: InteractiveColor? = null
        private var endContentColor: InteractiveColor? = null
        private var innerLabelColor: InteractiveColor? = null
        private var outerLabelColor: InteractiveColor? = null
        private var outerLabelColorReadOnly: InteractiveColor? = null
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
        private var dividerColor: InteractiveColor? = null
        private var dividerColorReadOnly: InteractiveColor? = null

        override fun disabledAlpha(disabledAlpha: Float) = apply {
            this.disabledAlpha = disabledAlpha
        }

        override fun enabledAlpha(enabledAlpha: Float) = apply {
            this.enabledAlpha = enabledAlpha
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

        override fun innerLabelColor(innerLabelColor: InteractiveColor) = apply {
            this.innerLabelColor = innerLabelColor
        }

        override fun outerLabelColor(outerLabelColor: InteractiveColor) = apply {
            this.outerLabelColor = outerLabelColor
        }

        override fun outerLabelColorReadOnly(outerLabelColorReadOnly: InteractiveColor) = apply {
            this.outerLabelColorReadOnly = outerLabelColorReadOnly
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
            return DefaultTextAreaColors(
                disabledAlpha = disabledAlpha ?: DEFAULT_DISABLED_ALPHA,
                enabledAlpha = enabledAlpha ?: DEFAULT_ENABLED_ALPHA,
                cursorColor = cursorColor ?: Color.Black.asInteractive(),
                startContentColor = startContentColor ?: Color.Black.asInteractive(),
                endContentColor = endContentColor ?: Color.Black.asInteractive(),
                innerLabelColor = innerLabelColor ?: Color.Black.asInteractive(),
                outerLabelColor = outerLabelColor ?: Color.Black.asInteractive(),
                outerLabelColorReadOnly = outerLabelColorReadOnly ?: Color.Black.asInteractive(),
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
                dividerColor = dividerColor ?: Color.Gray.asInteractive(),
                dividerColorReadOnly = dividerColorReadOnly ?: Color.Gray.asInteractive(),
            )
        }
    }
}

private const val DEFAULT_DISABLED_ALPHA = 0.4f
private const val DEFAULT_ENABLED_ALPHA = 1f
