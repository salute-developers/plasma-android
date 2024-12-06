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
val LocalTextFieldStyle = compositionLocalOf { TextFieldStyle.textFieldBuilder().style() }

/**
 * Возвращает экземпляр [TextFieldStyleBuilder]
 */
fun TextFieldStyle.Companion.textFieldBuilder(receiver: Any? = null): TextFieldStyleBuilder {
    return DefaultTextFieldStyle.Builder(receiver)
}

/**
 * Билдер стиля [TextFieldStyle]
 */
interface TextFieldStyleBuilder : StyleBuilder<TextFieldStyle> {

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     */
    fun dimensions(builder: TextFieldDimensionsBuilder.() -> Unit): TextFieldStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     */
    @Deprecated("Use dimensions() with builder instead")
    fun dimensions(dimensions: TextField.Dimensions): TextFieldStyleBuilder

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
    fun labelPlacement(labelPlacement: TextField.LabelPlacement): TextFieldStyleBuilder

    /**
     * Устанавливает расположение вспомогательного текста [helperTextPlacement]
     */
    fun helperTextPlacement(helperTextPlacement: TextField.HelperTextPlacement): TextFieldStyleBuilder

    /**
     * Устанавливает тип поля [fieldType]
     */
    fun fieldType(fieldType: TextField.FieldType): TextFieldStyleBuilder

    /**
     * Устанавливает внешний вид поля [fieldAppearance]
     */
    fun fieldAppearance(fieldAppearance: TextField.FieldAppearance): TextFieldStyleBuilder

    /**
     * Устаналивает настройки скроллбара [scrollBar]
     */
    fun scrollBar(scrollBar: ScrollBar?): TextFieldStyleBuilder

    /**
     * Устанавливает стиль внутреннего лэйбла [innerLabelStyle]
     */
    fun innerLabelStyle(innerLabelStyle: TextStyle): TextFieldStyleBuilder

    /**
     * Устанавливает стиль внешнего лэйбла [outerLabelStyle]
     */
    fun outerLabelStyle(outerLabelStyle: TextStyle): TextFieldStyleBuilder

    /**
     * Устанавливает стиль внутреннего optional текста [innerOptionalStyle]
     */
    fun innerOptionalStyle(innerOptionalStyle: TextStyle): TextFieldStyleBuilder

    /**
     * Устанавливает стиль внешнего optional текста [outerOptionalStyle]
     */
    fun outerOptionalStyle(outerOptionalStyle: TextStyle): TextFieldStyleBuilder

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
     * Устанавливает однострочный/многострочный режим [singleLine]
     */
    fun singleLine(singleLine: Boolean): TextFieldStyleBuilder

    /**
     * Устанавливает наличие разделителя [hasDivider]
     */
    fun hasDivider(hasDivider: Boolean): TextFieldStyleBuilder

    /**
     * Устаналивает необходимость скрывать внутренний лэйбл [dropInnerLabel]
     */
    fun dropInnerLabel(dropInnerLabel: Boolean): TextFieldStyleBuilder

    /**
     * Устанавливает стиль чипов [chipGroupStyle]
     */
    fun chipGroupStyle(chipGroupStyle: ChipGroupStyle): TextFieldStyleBuilder
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
     * Устанавливает альфу [enabledAlpha] в состоянии enabled
     */
    fun enabledAlpha(enabledAlpha: Float): TextFieldColorsBuilder

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
     * Устанавливает цвет контента в начале [startContentColor]
     */
    fun startContentColor(startContentColor: Color): TextFieldColorsBuilder =
        startContentColor(startContentColor.asInteractive())

    /**
     * Устанавливает цвет контента в начале [startContentColor]
     */
    fun startContentColor(startContentColor: InteractiveColor): TextFieldColorsBuilder

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
     * Устанавливает цвет внутреннего лэйбла [innerLabelColor]
     */
    fun innerLabelColor(innerLabelColor: Color): TextFieldColorsBuilder =
        innerLabelColor(innerLabelColor.asInteractive())

    /**
     * Устанавливает цвет внутреннего лэйбла [innerLabelColor]
     */
    fun innerLabelColor(innerLabelColor: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет внешнего лэйбла [outerLabelColor]
     */
    fun outerLabelColor(outerLabelColor: Color): TextFieldColorsBuilder =
        outerLabelColor(outerLabelColor.asInteractive())

    /**
     * Устанавливает цвет внешнего лэйбла [outerLabelColor]
     */
    fun outerLabelColor(outerLabelColor: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет внешнего лэйбла в состоянии readOnly [outerLabelColorReadOnly]
     */
    fun outerLabelColorReadOnly(outerLabelColorReadOnly: Color): TextFieldColorsBuilder =
        outerLabelColorReadOnly(outerLabelColorReadOnly.asInteractive())

    /**
     * Устанавливает цвет внешнего лэйбла в состоянии readOnly [outerLabelColorReadOnly]
     */
    fun outerLabelColorReadOnly(outerLabelColorReadOnly: InteractiveColor): TextFieldColorsBuilder

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
     * Устанавливает цвет счетчика [counterColor]
     */
    fun counterColor(counterColor: Color): TextFieldColorsBuilder =
        counterColor(counterColor.asInteractive())

    /**
     * Устанавливает цвет счетчика [counterColor]
     */
    fun counterColor(counterColor: InteractiveColor): TextFieldColorsBuilder

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
     * Устанавливает верхний отступ контента с внутренним лэйблом
     */
    fun boxPaddingTopInnerLabel(boxPaddingTopInnerLabel: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает нижний отступ контента с внутренним лэйблом
     */
    fun boxPaddingBottomInnerLabel(boxPaddingBottomInnerLabel: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает верхний отступ контента с наружным лэйблом
     */
    fun boxPaddingTopOuterLabel(boxPaddingTopOuterLabel: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает нижний отступ контента с наружным лэйблом
     */
    fun boxPaddingBottomOuterLabel(boxPaddingBottomOuterLabel: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает нижний отступ внутреннего лэйбла
     */
    fun innerLabelPadding(innerLabelPadding: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает нижний отступ наружного лэйбла
     */
    fun outerLabelPadding(outerLabelPadding: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает отступ в начале optional текста
     */
    fun optionalPadding(optionalPadding: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает верхний отступ внутреннего helper текста (caption/counter)
     */
    fun helperTextPaddingInner(helperTextPaddingInner: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает верхний отступ наружного helper текста (caption/counter)
     */
    fun helperTextPaddingOuter(helperTextPaddingOuter: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает отступ после startContent
     */
    fun startContentEndPadding(startContentEndPadding: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает отступ перед endContent
     */
    fun endContentStartPadding(endContentStartPadding: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает отступ от контейнера с chip-элементами
     */
    fun chipsPadding(chipsPadding: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает минимальную высоту поля
     */
    fun boxMinHeight(boxMinHeight: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает высоту первой строки контента
     */
    fun alignmentLineHeight(alignmentLineHeight: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает размер иконки
     */
    fun iconSize(iconSize: Dp): TextFieldDimensionsBuilder

    /**
     * Устанавливает настройки индикатора
     */
    fun indicatorDimensions(builder: TextFieldIndicatorDimensionsBuilder.() -> Unit): TextFieldDimensionsBuilder

    /**
     * Устанавливает толщину разделителя в clear режиме
     */
    fun dividerThickness(dividerThickness: Dp): TextFieldDimensionsBuilder

    /**
     * Возвращает [TextField.Dimensions]
     */
    fun build(): TextField.Dimensions

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
     * Устанавливает начальный горизонтальный отступ внешнего индикатора
     */
    fun startLabelHorizontalPadding(startLabelHorizontalPadding: Dp): TextFieldIndicatorDimensionsBuilder

    /**
     * Устанавливает начальный вертикальный отступ внешнего индикатора
     */
    fun startLabelVerticalPadding(startLabelVerticalPadding: Dp): TextFieldIndicatorDimensionsBuilder

    /**
     * Устанавливает конечный горизонтальный отступ внешнего индикатора
     */
    fun endLabelHorizontalPadding(endLabelHorizontalPadding: Dp): TextFieldIndicatorDimensionsBuilder

    /**
     * Устанавливает конечный вертикальный отступ внешнего индикатора
     */
    fun endLabelVerticalPadding(endLabelVerticalPadding: Dp): TextFieldIndicatorDimensionsBuilder

    /**
     * Устанавливает начальный горизонтальный отступ внутреннего индикатора
     */
    fun startFieldHorizontalPadding(startFieldHorizontalPadding: Dp): TextFieldIndicatorDimensionsBuilder

    /**
     * Устанавливает начальный вертикальный отступ внутреннего индикатора
     */
    fun startFieldVerticalPadding(startFieldVerticalPadding: Dp): TextFieldIndicatorDimensionsBuilder

    /**
     * Устанавливает конечный горизонтальный отступ внутреннего индикатора
     */
    fun endFieldHorizontalPadding(endFieldHorizontalPadding: Dp): TextFieldIndicatorDimensionsBuilder

    /**
     * Устанавливает конечный вертикальный отступ внутреннего индикатора
     */
    fun endFieldVerticalPadding(endFieldVerticalPadding: Dp): TextFieldIndicatorDimensionsBuilder

    /**
     * Устанавливает размер внешнего индикатора
     */
    fun labelIndicatorSize(labelIndicatorSize: Dp): TextFieldIndicatorDimensionsBuilder

    /**
     * Устанавливает размер внутреннего индикатора
     */
    fun fieldIndicatorSize(fieldIndicatorSize: Dp): TextFieldIndicatorDimensionsBuilder

    /**
     * Возвращает экземпляр [TextField.Dimensions.IndicatorDimensions]
     */
    fun build(): TextField.Dimensions.IndicatorDimensions

    companion object {

        /**
         * Возвращает билдер [TextFieldIndicatorDimensionsBuilder]
         */
        fun builder(): TextFieldIndicatorDimensionsBuilder =
            DefaultTextFieldIndicatorDimensionsBuilder()
    }
}

private class DefaultTextFieldIndicatorDimensionsBuilder : TextFieldIndicatorDimensionsBuilder {
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

private class DefaultTextFieldDimensionsBuilder : TextFieldDimensionsBuilder {
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
    private var indicatorDimensionsBuilder: TextFieldIndicatorDimensionsBuilder =
        TextFieldIndicatorDimensionsBuilder.builder()
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

    override fun indicatorDimensions(builder: TextFieldIndicatorDimensionsBuilder.() -> Unit) =
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
private class DefaultTextFieldStyle(
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

    class Builder(override val receiver: Any?) : TextFieldStyleBuilder {

        private var colorsBuilder: TextFieldColorsBuilder = TextFieldColorsBuilder.builder()
        private var dimensionsBuilder: TextFieldDimensionsBuilder =
            TextFieldDimensionsBuilder.builder()
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

        override fun dimensions(builder: TextFieldDimensionsBuilder.() -> Unit) = apply {
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
            return DefaultTextFieldStyle(
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
private class DefaultTextFieldColors(
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

    class Builder : TextFieldColorsBuilder {
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
            return DefaultTextFieldColors(
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
