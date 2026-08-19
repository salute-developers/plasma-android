package com.sdds.compose.uikit

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.api.info.compose.ApiName
import com.sdds.compose.uikit.graphics.brush.addStates
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * Билдер стиля [TextFieldStyle]
 */
@ApiInfo(components = ["TextField", "TextArea"])
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
    fun shape(shape: CornerBasedShape) = shape(shape.asStatefulValue())

    /**
     * Устанавливает формы компонента [shape]
     */
    fun shape(shape: StatefulValue<CornerBasedShape>): TextFieldStyleBuilder

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
    fun labelStyle(labelStyle: TextStyle) = labelStyle(labelStyle.asStatefulValue())

    /**
     * Устанавливает стили лэйбла [labelStyle]
     */
    fun labelStyle(labelStyle: StatefulValue<TextStyle>): TextFieldStyleBuilder

    /**
     * Устанавливает стиль optional текста [optionalStyle]
     */
    fun optionalStyle(optionalStyle: TextStyle) = optionalStyle(optionalStyle.asStatefulValue())

    /**
     * Устанавливает стили optional текста [optionalStyle]
     */
    fun optionalStyle(optionalStyle: StatefulValue<TextStyle>): TextFieldStyleBuilder

    /**
     * Устанавливает стиль основного текста [valueStyle]
     */
    fun valueStyle(valueStyle: TextStyle) = valueStyle(valueStyle.asStatefulValue())

    /**
     * Устанавливает стили основного текста [valueStyle]
     */
    fun valueStyle(valueStyle: StatefulValue<TextStyle>): TextFieldStyleBuilder

    /**
     * Устанавливает стиль надписи [captionStyle]
     */
    fun captionStyle(captionStyle: TextStyle) = captionStyle(captionStyle.asStatefulValue())

    /**
     * Устанавливает стили надписи [captionStyle]
     */
    fun captionStyle(captionStyle: StatefulValue<TextStyle>): TextFieldStyleBuilder

    /**
     * Устанавливает стиль счетчика [counterStyle]
     */
    fun counterStyle(counterStyle: TextStyle) = counterStyle(counterStyle.asStatefulValue())

    /**
     * Устанавливает стиль счетчика [counterStyle]
     */
    fun counterStyle(counterStyle: StatefulValue<TextStyle>): TextFieldStyleBuilder

    /**
     * Устанавливает стиль плэйсхолдера [placeholderStyle]
     */
    fun placeholderStyle(placeholderStyle: TextStyle) = placeholderStyle(placeholderStyle.asStatefulValue())

    /**
     * Устанавливает стили плэйсхолдера [placeholderStyle]
     */
    fun placeholderStyle(placeholderStyle: StatefulValue<TextStyle>): TextFieldStyleBuilder

    /**
     * Устанавливает стиль префикса [prefixStyle]
     */
    fun prefixStyle(prefixStyle: TextStyle) = prefixStyle(prefixStyle.asStatefulValue())

    /**
     * Устанавливает стили префикса [prefixStyle]
     */
    fun prefixStyle(prefixStyle: StatefulValue<TextStyle>): TextFieldStyleBuilder

    /**
     * Устанавливает стиль суффикса [suffixStyle]
     */
    fun suffixStyle(suffixStyle: TextStyle) = suffixStyle(suffixStyle.asStatefulValue())

    /**
     * Устанавливает стили суффикса [suffixStyle]
     */
    fun suffixStyle(suffixStyle: StatefulValue<TextStyle>): TextFieldStyleBuilder

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
        cursorColor(cursorColor.asStatefulBrush())

    /**
     * Устанавливает кисть курсора [cursorColor]
     */
    fun cursorColor(cursorColor: Brush): TextFieldColorsBuilder =
        cursorColor(cursorColor.asStatefulValue())

    /**
     * Устанавливает кисти курсора [cursorColor]
     */
    fun cursorColor(cursorColor: StatefulValue<Brush>): TextFieldColorsBuilder

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
        startContentColor(startContentColor.asStatefulBrush())

    /**
     * Устанавливает кисть контента в начале [startContentColor]
     */
    fun startContentColor(startContentColor: Brush): TextFieldColorsBuilder =
        startContentColor(startContentColor.asStatefulValue())

    /**
     * Устанавливает кисти контента в начале [startContentColor]
     */
    fun startContentColor(startContentColor: StatefulValue<Brush>): TextFieldColorsBuilder

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
        endContentColor(endContentColor.asStatefulBrush())

    /**
     * Устанавливает кисть контента в конце [endContentColor]
     */
    fun endContentColor(endContentColor: Brush): TextFieldColorsBuilder =
        endContentColor(endContentColor.asStatefulValue())

    /**
     * Устанавливает кисти контента в конце [endContentColor]
     */
    fun endContentColor(endContentColor: StatefulValue<Brush>): TextFieldColorsBuilder

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
        this.labelColor(labelColor.asStatefulBrush())

    /**
     * Устанавливает кисть лэйбла [labelColor]
     */
    fun labelColor(labelColor: Brush): TextFieldColorsBuilder =
        this.labelColor(labelColor.asStatefulValue())

    /**
     * Устанавливает кисти лэйбла [labelColor]
     */
    fun labelColor(labelColor: StatefulValue<Brush>): TextFieldColorsBuilder

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
        valueColor(valueColor.asStatefulBrush())

    /**
     * Устанавливает кисть основного текста [valueColor]
     */
    fun valueColor(valueColor: Brush): TextFieldColorsBuilder =
        valueColor(valueColor.asStatefulValue())

    /**
     * Устанавливает кисти основного текста [valueColor]
     */
    fun valueColor(valueColor: StatefulValue<Brush>): TextFieldColorsBuilder

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
        captionColor(captionColor.asStatefulBrush())

    /**
     * Устанавливает кисть надписи [captionColor]
     */
    fun captionColor(captionColor: Brush): TextFieldColorsBuilder =
        captionColor(captionColor.asStatefulValue())

    /**
     * Устанавливает кисти надписи [captionColor]
     */
    fun captionColor(captionColor: StatefulValue<Brush>): TextFieldColorsBuilder

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
        optionalColor(optionalColor.asStatefulBrush())

    /**
     * Устанавливает кисть опционального текста [optionalColor]
     */
    fun optionalColor(optionalColor: Brush): TextFieldColorsBuilder =
        optionalColor(optionalColor.asStatefulValue())

    /**
     * Устанавливает кисти опционального текста [optionalColor]
     */
    fun optionalColor(optionalColor: StatefulValue<Brush>): TextFieldColorsBuilder

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
        counterColor(counterColor.asStatefulBrush())

    /**
     * Устанавливает кисть счетчика [counterColor]
     */
    fun counterColor(counterColor: Brush): TextFieldColorsBuilder =
        counterColor(counterColor.asStatefulValue())

    /**
     * Устанавливает кисти счетчика [counterColor]
     */
    fun counterColor(counterColor: StatefulValue<Brush>): TextFieldColorsBuilder

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
        placeholderColor(placeholderColor.asStatefulBrush())

    /**
     * Устанавливает кисть плэйсхолдера [placeholderColor]
     */
    fun placeholderColor(placeholderColor: Brush): TextFieldColorsBuilder =
        placeholderColor(placeholderColor.asStatefulValue())

    /**
     * Устанавливает кисти плэйсхолдера [placeholderColor]
     */
    fun placeholderColor(placeholderColor: StatefulValue<Brush>): TextFieldColorsBuilder

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
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает кисть бэкграунда [backgroundColor]
     */
    fun backgroundColor(backgroundColor: Brush): TextFieldColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает кисти бэкграунда [backgroundColor]
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): TextFieldColorsBuilder

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
        dividerColor(dividerColor.asStatefulBrush())

    /**
     * Устанавливает кисть разделителя [dividerColor]
     */
    fun dividerColor(dividerColor: Brush): TextFieldColorsBuilder =
        dividerColor(dividerColor.asStatefulValue())

    /**
     * Устанавливает кисти разделителя [dividerColor]
     */
    fun dividerColor(dividerColor: StatefulValue<Brush>): TextFieldColorsBuilder

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
        indicatorColor(indicatorColor.asStatefulBrush())

    /**
     * Устанавливает кисть индикатора
     */
    fun indicatorColor(indicatorColor: Brush): TextFieldColorsBuilder =
        indicatorColor(indicatorColor.asStatefulValue())

    /**
     * Устанавливает кисти индикатора
     */
    fun indicatorColor(indicatorColor: StatefulValue<Brush>): TextFieldColorsBuilder

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
        prefixColor(prefixColor.asStatefulBrush())

    /**
     * Устанавливает кисть префикса
     */
    fun prefixColor(prefixColor: Brush): TextFieldColorsBuilder =
        prefixColor(prefixColor.asStatefulValue())

    /**
     * Устанавливает кисти префикса
     */
    fun prefixColor(prefixColor: StatefulValue<Brush>): TextFieldColorsBuilder

    /**
     * Устанавливает цвет префикса
     */
    fun prefixColor(prefixColor: InteractiveColor): TextFieldColorsBuilder

    /**
     * Устанавливает цвет суффикса
     */
    fun suffixColor(suffixColor: Color): TextFieldColorsBuilder =
        suffixColor(suffixColor.asStatefulBrush())

    /**
     * Устанавливает цвет суффикса
     */
    fun suffixColor(suffixColor: Brush): TextFieldColorsBuilder =
        suffixColor(suffixColor.asStatefulValue())

    /**
     * Устанавливает цвет суффикса
     */
    fun suffixColor(suffixColor: StatefulValue<Brush>): TextFieldColorsBuilder

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
    fun boxPaddingStart(boxPaddingStart: Dp): TextFieldDimensionsBuilder =
        boxPaddingStart(boxPaddingStart.asStatefulValue())

    /**
     * Устанавливает отступы контента в начале
     */
    fun boxPaddingStart(boxPaddingStart: StatefulValue<Dp>): TextFieldDimensionsBuilder

    /**
     * Устанавливает отступ контента в конце
     */
    fun boxPaddingEnd(boxPaddingEnd: Dp): TextFieldDimensionsBuilder =
        boxPaddingEnd(boxPaddingEnd.asStatefulValue())

    /**
     * Устанавливает отступы контента в конце
     */
    fun boxPaddingEnd(boxPaddingEnd: StatefulValue<Dp>): TextFieldDimensionsBuilder

    /**
     * Устанавливает верхний отступ контента
     */
    fun boxPaddingTop(boxPaddingTop: Dp): TextFieldDimensionsBuilder =
        boxPaddingTop(boxPaddingTop.asStatefulValue())

    /**
     * Устанавливает верхние отступы контента
     */
    fun boxPaddingTop(boxPaddingTop: StatefulValue<Dp>): TextFieldDimensionsBuilder

    /**
     * Устанавливает нижний отступ контента
     */
    fun boxPaddingBottom(boxPaddingBottom: Dp): TextFieldDimensionsBuilder =
        boxPaddingBottom(boxPaddingBottom.asStatefulValue())

    /**
     * Устанавливает нижние отступы контента
     */
    fun boxPaddingBottom(boxPaddingBottom: StatefulValue<Dp>): TextFieldDimensionsBuilder

    /**
     * Устанавливает нижний отступ лэйбла
     */
    fun labelPadding(labelPadding: Dp): TextFieldDimensionsBuilder =
        labelPadding(labelPadding.asStatefulValue())

    /**
     * Устанавливает нижние отступы лэйбла
     */
    fun labelPadding(labelPadding: StatefulValue<Dp>): TextFieldDimensionsBuilder

    /**
     * Устанавливает отступ в начале optional текста
     */
    fun optionalPadding(optionalPadding: Dp): TextFieldDimensionsBuilder =
        optionalPadding(optionalPadding.asStatefulValue())

    /**
     * Устанавливает отступы в начале optional текста
     */
    fun optionalPadding(optionalPadding: StatefulValue<Dp>): TextFieldDimensionsBuilder

    /**
     * Устанавливает верхний отступ helper текста (caption/counter)
     */
    fun helperTextPadding(helperTextPadding: Dp): TextFieldDimensionsBuilder =
        helperTextPadding(helperTextPadding.asStatefulValue())

    /**
     * Устанавливает верхние отступы helper текста (caption/counter)
     */
    fun helperTextPadding(helperTextPadding: StatefulValue<Dp>): TextFieldDimensionsBuilder

    /**
     * Устанавливает отступ после startContent
     */
    fun startContentPadding(startContentPadding: Dp): TextFieldDimensionsBuilder =
        startContentPadding(startContentPadding.asStatefulValue())

    /**
     * Устанавливает отступы после startContent
     */
    fun startContentPadding(startContentPadding: StatefulValue<Dp>): TextFieldDimensionsBuilder

    /**
     * Устанавливает отступ перед endContent
     */
    fun endContentPadding(endContentPadding: Dp): TextFieldDimensionsBuilder =
        endContentPadding(endContentPadding.asStatefulValue())

    /**
     * Устанавливает отступы перед endContent
     */
    fun endContentPadding(endContentPadding: StatefulValue<Dp>): TextFieldDimensionsBuilder

    /**
     * Устанавливает отступ от контейнера с chip-элементами
     */
    fun chipsPadding(chipsPadding: Dp): TextFieldDimensionsBuilder =
        chipsPadding(chipsPadding.asStatefulValue())

    /**
     * Устанавливает отступы от контейнера с chip-элементами
     */
    fun chipsPadding(chipsPadding: StatefulValue<Dp>): TextFieldDimensionsBuilder

    /**
     * Устанавливает отступ от контейнера с chip-элементами в начале
     */
    fun chipsPaddingStart(chipsPaddingStart: Dp): TextFieldDimensionsBuilder =
        chipsPaddingStart(chipsPaddingStart.asStatefulValue())

    /**
     * Устанавливает отступы от контейнера с chip-элементами в начале
     */
    fun chipsPaddingStart(chipsPaddingStart: StatefulValue<Dp>): TextFieldDimensionsBuilder

    /**
     * Устанавливает отступ от контейнера с chip-элементами в конце
     */
    fun chipsPaddingEnd(chipsPaddingEnd: Dp): TextFieldDimensionsBuilder =
        chipsPaddingEnd(chipsPaddingEnd.asStatefulValue())

    /**
     * Устанавливает отступы от контейнера с chip-элементами в конце
     */
    fun chipsPaddingEnd(chipsPaddingEnd: StatefulValue<Dp>): TextFieldDimensionsBuilder

    /**
     * Устанавливает отступ от контейнера с chip-элементами сверху
     */
    fun chipsPaddingTop(chipsPaddingTop: Dp): TextFieldDimensionsBuilder =
        chipsPaddingTop(chipsPaddingTop.asStatefulValue())

    /**
     * Устанавливает отступы от контейнера с chip-элементами сверху
     */
    fun chipsPaddingTop(chipsPaddingTop: StatefulValue<Dp>): TextFieldDimensionsBuilder

    /**
     * Устанавливает отступ от контейнера с chip-элементами снизу
     */
    fun chipsPaddingBottom(chipsPaddingBottom: Dp): TextFieldDimensionsBuilder =
        chipsPaddingBottom(chipsPaddingBottom.asStatefulValue())

    /**
     * Устанавливает отступы от контейнера с chip-элементами снизу
     */
    fun chipsPaddingBottom(chipsPaddingBottom: StatefulValue<Dp>): TextFieldDimensionsBuilder

    /**
     * Устанавливает минимальную высоту поля
     */
    fun boxMinHeight(boxMinHeight: Dp): TextFieldDimensionsBuilder =
        boxMinHeight(boxMinHeight.asStatefulValue())

    /**
     * Устанавливает минимальную высоту поля
     */
    fun boxMinHeight(boxMinHeight: StatefulValue<Dp>): TextFieldDimensionsBuilder

    /**
     * Устанавливает высоту первой строки контента
     */
    @ApiName(name = "alignmentMinHeight")
    fun alignmentLineHeight(alignmentLineHeight: Dp): TextFieldDimensionsBuilder =
        alignmentLineHeight(alignmentLineHeight.asStatefulValue())

    /**
     * Устанавливает высоту первой строки контента
     */
    @ApiName(name = "alignmentMinHeight")
    fun alignmentLineHeight(alignmentLineHeight: StatefulValue<Dp>): TextFieldDimensionsBuilder

    /**
     * Устанавливает размер иконки в начале
     */
    fun startContentSize(startContentSize: Dp): TextFieldDimensionsBuilder =
        startContentSize(startContentSize.asStatefulValue())

    /**
     * Устанавливает размеры иконки в начале
     */
    fun startContentSize(startContentSize: StatefulValue<Dp>): TextFieldDimensionsBuilder

    /**
     * Устанавливает размер иконки в конце
     */
    fun endContentSize(endContentSize: Dp): TextFieldDimensionsBuilder =
        endContentSize(endContentSize.asStatefulValue())

    /**
     * Устанавливает размеры иконки в конце
     */
    fun endContentSize(endContentSize: StatefulValue<Dp>): TextFieldDimensionsBuilder

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
    fun dividerThickness(dividerThickness: Dp): TextFieldDimensionsBuilder =
        dividerThickness(dividerThickness.asStatefulValue())

    /**
     * Устанавливает толщину разделителя
     */
    fun dividerThickness(dividerThickness: StatefulValue<Dp>): TextFieldDimensionsBuilder

    /**
     * Возвращает [TextFieldDimensions]
     */
    fun build(): TextFieldDimensionValues

    companion object {
        /**
         * Вернет экземпляр билдера [TextFieldDimensionsBuilder]
         */
        fun builder(): TextFieldDimensionsBuilder = DefaultTextFieldDimensions.Builder()
    }
}

/**
 * Билдер настроек индикатора
 */
interface TextFieldIndicatorDimensionsBuilder {

    /**
     * Устанавливает горизонтальный отступ индикатора
     */
    @ApiName(name = "indicatorOffsetX")
    fun horizontalPadding(horizontalPadding: Dp): TextFieldIndicatorDimensionsBuilder =
        horizontalPadding(horizontalPadding.asStatefulValue())

    /**
     * Устанавливает горизонтальные отступы индикатора
     */
    @ApiName(name = "indicatorOffsetX")
    fun horizontalPadding(horizontalPadding: StatefulValue<Dp>): TextFieldIndicatorDimensionsBuilder

    /**
     * Устанавливает вертикальный отступ индикатора
     */
    @ApiName(name = "indicatorOffsetY")
    fun verticalPadding(verticalPadding: Dp): TextFieldIndicatorDimensionsBuilder =
        verticalPadding(verticalPadding.asStatefulValue())

    /**
     * Устанавливает вертикальные отступы индикатора
     */
    @ApiName(name = "indicatorOffsetY")
    fun verticalPadding(verticalPadding: StatefulValue<Dp>): TextFieldIndicatorDimensionsBuilder

    /**
     * Устанавливает размер индикатора
     */
    fun indicatorSize(indicatorSize: Dp): TextFieldIndicatorDimensionsBuilder =
        indicatorSize(indicatorSize.asStatefulValue())

    /**
     * Устанавливает размеры индикатора
     */
    fun indicatorSize(indicatorSize: StatefulValue<Dp>): TextFieldIndicatorDimensionsBuilder

    /**
     * Возвращает экземпляр [TextFieldDimensions.IndicatorDimensions]
     */
    fun build(): TextFieldIndicatorDimensionValues

    companion object {

        /**
         * Возвращает билдер [TextFieldIndicatorDimensionsBuilder]
         */
        fun builder(): TextFieldIndicatorDimensionsBuilder =
            DefaultTextFieldIndicatorDimensions.Builder()
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
    override val fieldType: TextFieldType,
    override val labelPlacement: TextFieldLabelPlacement,
    override val captionPlacement: TextFieldHelperTextPlacement,
    override val counterPlacement: TextFieldHelperTextPlacement,
    override val indicatorAlignmentMode: TextFieldIndicatorAlignmentMode,
    override val scrollBar: ScrollBar?,
    override val singleLine: Boolean,
    override val chipGroupStyle: ChipGroupStyle,
    @Deprecated("Use chipGroupStyle")
    override val chipStyle: ChipStyle,
    override val shapes: StatefulValue<CornerBasedShape>,
    override val labelStyles: StatefulValue<TextStyle>,
    override val optionalStyles: StatefulValue<TextStyle>,
    override val valueStyles: StatefulValue<TextStyle>,
    override val captionStyles: StatefulValue<TextStyle>,
    override val counterStyles: StatefulValue<TextStyle>,
    override val placeholderStyles: StatefulValue<TextStyle>,
    override val prefixStyles: StatefulValue<TextStyle>,
    override val suffixStyles: StatefulValue<TextStyle>,
    override val dimensionValues: TextFieldDimensionValues,
) : TextFieldStyle {
    @Deprecated("Use shapes", replaceWith = ReplaceWith("shapes"))
    override val shape: CornerBasedShape = shapes.getDefaultValue()

    @Deprecated("Use valueStyles", replaceWith = ReplaceWith("valueStyles"))
    override val valueStyle: TextStyle = valueStyles.getDefaultValue()

    @Deprecated("Use captionStyles", replaceWith = ReplaceWith("captionStyles"))
    override val captionStyle: TextStyle = captionStyles.getDefaultValue()

    @Deprecated("Use counterStyles", replaceWith = ReplaceWith("counterStyles"))
    override val counterStyle: TextStyle = counterStyles.getDefaultValue()

    @Deprecated("Use placeholderStyles", replaceWith = ReplaceWith("placeholderStyles"))
    override val placeholderStyle: TextStyle = placeholderStyles.getDefaultValue()

    @Deprecated("Use labelStyles", replaceWith = ReplaceWith("labelStyles"))
    override val labelStyle: TextStyle = labelStyles.getDefaultValue()

    @Deprecated("Use optionalStyles", replaceWith = ReplaceWith("optionalStyles"))
    override val optionalStyle: TextStyle = optionalStyles.getDefaultValue()

    @Deprecated("Use prefixStyles", replaceWith = ReplaceWith("prefixStyles"))
    override val prefixStyle: TextStyle = prefixStyles.getDefaultValue()

    @Deprecated("Use suffixStyles", replaceWith = ReplaceWith("suffixStyles"))
    override val suffixStyle: TextStyle = suffixStyles.getDefaultValue()

    class Builder(override val receiver: Any?) : TextFieldStyleBuilder {

        private var colorsBuilder: TextFieldColorsBuilder = TextFieldColorsBuilder.builder()
        private var dimensionsBuilder: TextFieldDimensionsBuilder =
            TextFieldDimensionsBuilder.builder()
        private var dimensions: TextFieldDimensions? = null
        private var scrollBarBuilder: TextFieldScrollBarBuilder =
            TextFieldScrollBarBuilder.builder()
        private var shape: StatefulValue<CornerBasedShape>? = null
        private var labelPlacement: TextFieldLabelPlacement? = null
        private var captionPlacement: TextFieldHelperTextPlacement? = null
        private var counterPlacement: TextFieldHelperTextPlacement? = null
        private var fieldType: TextFieldType? = null
        private var labelStyle: StatefulValue<TextStyle>? = null
        private var optionalStyle: StatefulValue<TextStyle>? = null
        private var valueStyle: StatefulValue<TextStyle>? = null
        private var captionStyle: StatefulValue<TextStyle>? = null
        private var counterStyle: StatefulValue<TextStyle>? = null
        private var placeholderStyle: StatefulValue<TextStyle>? = null
        private var prefixStyle: StatefulValue<TextStyle>? = null
        private var suffixStyle: StatefulValue<TextStyle>? = null
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
            this.dimensions = dimensions
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

        override fun shape(shape: StatefulValue<CornerBasedShape>) = apply {
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

        override fun labelStyle(labelStyle: StatefulValue<TextStyle>) = apply {
            this.labelStyle = labelStyle
        }

        override fun optionalStyle(optionalStyle: StatefulValue<TextStyle>) = apply {
            this.optionalStyle = optionalStyle
        }

        override fun valueStyle(valueStyle: StatefulValue<TextStyle>) = apply {
            this.valueStyle = valueStyle
        }

        override fun captionStyle(captionStyle: StatefulValue<TextStyle>) = apply {
            this.captionStyle = captionStyle
        }

        override fun counterStyle(counterStyle: StatefulValue<TextStyle>) = apply {
            this.counterStyle = counterStyle
        }

        override fun placeholderStyle(placeholderStyle: StatefulValue<TextStyle>) = apply {
            this.placeholderStyle = placeholderStyle
        }

        override fun prefixStyle(prefixStyle: StatefulValue<TextStyle>) = apply {
            this.prefixStyle = prefixStyle
        }

        override fun suffixStyle(suffixStyle: StatefulValue<TextStyle>) = apply {
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
                dimensions = dimensions ?: TextFieldDimensions(),
                dimensionValues = dimensionsBuilder.build(),
                colors = colorsBuilder.build(),
                shapes = shape ?: RoundedCornerShape(CornerSize(0)).asStatefulValue(),
                fieldType = fieldType ?: TextFieldType.Optional,
                labelPlacement = labelPlacement ?: TextFieldLabelPlacement.None,
                indicatorAlignmentMode = indicatorAlignmentMode
                    ?: TextFieldIndicatorAlignmentMode.Inside,
                labelStyles = labelStyle ?: TextStyle.Default.asStatefulValue(),
                optionalStyles = optionalStyle ?: TextStyle.Default.asStatefulValue(),
                valueStyles = valueStyle ?: TextStyle.Default.asStatefulValue(),
                captionStyles = captionStyle ?: TextStyle.Default.asStatefulValue(),
                counterStyles = counterStyle ?: TextStyle.Default.asStatefulValue(),
                placeholderStyles = placeholderStyle ?: TextStyle.Default.asStatefulValue(),
                prefixStyles = prefixStyle ?: TextStyle.Default.asStatefulValue(),
                suffixStyles = suffixStyle ?: TextStyle.Default.asStatefulValue(),
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
    override val cursorBrush: StatefulValue<Brush>,
    override val indicatorBrush: StatefulValue<Brush>,
    override val startContentBrush: StatefulValue<Brush>,
    override val endContentBrush: StatefulValue<Brush>,
    override val labelBrush: StatefulValue<Brush>,
    override val valueBrush: StatefulValue<Brush>,
    override val captionBrush: StatefulValue<Brush>,
    override val optionalBrush: StatefulValue<Brush>,
    override val counterBrush: StatefulValue<Brush>,
    override val dividerBrush: StatefulValue<Brush>,
    override val placeholderBrush: StatefulValue<Brush>,
    override val backgroundBrush: StatefulValue<Brush>,
    override val prefixBrush: StatefulValue<Brush>,
    override val suffixBrush: StatefulValue<Brush>,
) : TextFieldColors {
    @Deprecated("Use cursorBrush", replaceWith = ReplaceWith("cursorBrush"))
    override fun cursorColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) cursorColorReadOnly else cursorColor
    }

    @Deprecated("Use indicatorBrush", replaceWith = ReplaceWith("indicatorBrush"))
    override fun indicatorColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) indicatorColorReadOnly else indicatorColor
    }

    @Deprecated("Use startContentBrush", replaceWith = ReplaceWith("startContentBrush"))
    override fun startContentColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) startContentColorReadOnly else startContentColor
    }

    @Deprecated("Use endContentBrush", replaceWith = ReplaceWith("endContentBrush"))
    override fun endContentColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) endContentColorReadOnly else endContentColor
    }

    @Deprecated("Use labelBrush", replaceWith = ReplaceWith("labelBrush"))
    override fun labelColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) labelColorReadOnly else labelColor
    }

    @Deprecated("Use valueBrush", replaceWith = ReplaceWith("valueBrush"))
    override fun valueColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) valueColorReadOnly else valueColor
    }

    @Deprecated("Use captionBrush", replaceWith = ReplaceWith("captionBrush"))
    override fun captionColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) captionColorReadOnly else captionColor
    }

    @Deprecated("Use optionalBrush", replaceWith = ReplaceWith("optionalBrush"))
    override fun optionalColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) optionalColorReadOnly else optionalColor
    }

    @Deprecated("Use counterBrush", replaceWith = ReplaceWith("counterBrush"))
    override fun counterColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) counterColorReadOnly else counterColor
    }

    @Deprecated("Use dividerBrush", replaceWith = ReplaceWith("dividerBrush"))
    override fun dividerColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) dividerColorReadOnly else dividerColor
    }

    @Deprecated("Use placeholderBrush", replaceWith = ReplaceWith("placeholderBrush"))
    override fun placeholderColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) placeholderColorReadOnly else placeholderColor
    }

    @Deprecated("Use backgroundBrush", replaceWith = ReplaceWith("backgroundBrush"))
    override fun backgroundColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) backgroundColorReadOnly else backgroundColor
    }

    @Deprecated("Use prefixBrush", replaceWith = ReplaceWith("prefixBrush"))
    override fun prefixColor(isReadOnly: Boolean): InteractiveColor {
        return if (isReadOnly) prefixColorReadOnly else prefixColor
    }

    @Deprecated("Use suffixBrush", replaceWith = ReplaceWith("suffixBrush"))
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
        private var cursorBrush: StatefulValue<Brush>? = null
        private var indicatorBrush: StatefulValue<Brush>? = null
        private var startContentBrush: StatefulValue<Brush>? = null
        private var endContentBrush: StatefulValue<Brush>? = null
        private var labelBrush: StatefulValue<Brush>? = null
        private var valueBrush: StatefulValue<Brush>? = null
        private var captionBrush: StatefulValue<Brush>? = null
        private var optionalBrush: StatefulValue<Brush>? = null
        private var counterBrush: StatefulValue<Brush>? = null
        private var dividerBrush: StatefulValue<Brush>? = null
        private var placeholderBrush: StatefulValue<Brush>? = null
        private var backgroundBrush: StatefulValue<Brush>? = null
        private var prefixBrush: StatefulValue<Brush>? = null
        private var suffixBrush: StatefulValue<Brush>? = null

        override fun disabledAlpha(disabledAlpha: Float) = apply {
            this.disabledAlpha = disabledAlpha
        }

        override fun cursorColor(cursorColor: InteractiveColor) = apply {
            this.cursorColor = cursorColor
        }

        override fun cursorColorReadOnly(cursorColorReadOnly: InteractiveColor) = apply {
            this.cursorColorReadOnly = cursorColorReadOnly
        }

        override fun startContentColor(startContentColor: StatefulValue<Brush>) = apply {
            this.startContentBrush = startContentColor
        }

        override fun cursorColor(cursorColor: StatefulValue<Brush>) = apply {
            this.cursorBrush = cursorColor
        }

        override fun startContentColor(startContentColor: InteractiveColor) = apply {
            this.startContentColor = startContentColor
        }

        override fun startContentColorReadOnly(startContentColorReadOnly: InteractiveColor) =
            apply {
                this.startContentColorReadOnly = startContentColorReadOnly
            }

        override fun endContentColor(endContentColor: StatefulValue<Brush>) = apply {
            this.endContentBrush = endContentColor
        }

        override fun endContentColor(endContentColor: InteractiveColor) = apply {
            this.endContentColor = endContentColor
        }

        override fun endContentColorReadOnly(endContentColorReadOnly: InteractiveColor) = apply {
            this.endContentColorReadOnly = endContentColorReadOnly
        }

        override fun labelColor(labelColor: StatefulValue<Brush>) = apply {
            this.labelBrush = labelColor
        }

        override fun labelColor(labelColor: InteractiveColor) = apply {
            this.labelColor = labelColor
        }

        override fun labelColorReadOnly(labelColorReadOnly: InteractiveColor) = apply {
            this.labelColorReadOnly = labelColorReadOnly
        }

        override fun valueColor(valueColor: StatefulValue<Brush>) = apply {
            this.valueBrush = valueColor
        }

        override fun valueColor(valueColor: InteractiveColor) = apply {
            this.valueColor = valueColor
        }

        override fun valueColorReadOnly(valueColorReadOnly: InteractiveColor) = apply {
            this.valueColorReadOnly = valueColorReadOnly
        }

        override fun captionColor(captionColor: StatefulValue<Brush>) = apply {
            this.captionBrush = captionColor
        }

        override fun captionColor(captionColor: InteractiveColor) = apply {
            this.captionColor = captionColor
        }

        override fun captionColorReadOnly(captionColorReadOnly: InteractiveColor) = apply {
            this.captionColorReadOnly = captionColorReadOnly
        }

        override fun optionalColor(optionalColor: StatefulValue<Brush>) = apply {
            this.optionalBrush = optionalColor
        }

        override fun optionalColor(optionalColor: InteractiveColor) = apply {
            this.optionalColor = optionalColor
        }

        override fun optionalColorReadOnly(optionalColorReadOnly: InteractiveColor) = apply {
            this.optionalColorReadOnly = optionalColorReadOnly
        }

        override fun counterColor(counterColor: StatefulValue<Brush>) = apply {
            this.counterBrush = counterColor
        }

        override fun counterColor(counterColor: InteractiveColor) = apply {
            this.counterColor = counterColor
        }

        override fun counterColorReadOnly(counterColorReadOnly: InteractiveColor) = apply {
            this.counterColorReadOnly = counterColorReadOnly
        }

        override fun placeholderColor(placeholderColor: StatefulValue<Brush>) = apply {
            this.placeholderBrush = placeholderColor
        }

        override fun placeholderColor(placeholderColor: InteractiveColor) = apply {
            this.placeholderColor = placeholderColor
        }

        override fun placeholderColorReadOnly(placeholderColorReadOnly: InteractiveColor) = apply {
            this.placeholderColorReadOnly = placeholderColorReadOnly
        }

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundBrush = backgroundColor
        }

        override fun backgroundColor(backgroundColor: InteractiveColor) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun backgroundColorReadOnly(backgroundColorReadOnly: InteractiveColor) = apply {
            this.backgroundColorReadOnly = backgroundColorReadOnly
        }

        override fun dividerColor(dividerColor: StatefulValue<Brush>) = apply {
            this.dividerBrush = dividerColor
        }

        override fun dividerColor(dividerColor: InteractiveColor) = apply {
            this.dividerColor = dividerColor
        }

        override fun dividerColorReadOnly(dividerColorReadOnly: InteractiveColor) = apply {
            this.dividerColorReadOnly = dividerColorReadOnly
        }

        override fun indicatorColor(indicatorColor: StatefulValue<Brush>) = apply {
            this.indicatorBrush = indicatorColor
        }

        override fun indicatorColor(indicatorColor: InteractiveColor) = apply {
            this.indicatorColor = indicatorColor
        }

        override fun indicatorColorReadOnly(indicatorColorReadOnly: InteractiveColor) = apply {
            this.indicatorColorReadOnly = indicatorColorReadOnly
        }

        override fun prefixColor(prefixColor: StatefulValue<Brush>) = apply {
            this.prefixBrush = prefixColor
        }

        override fun prefixColor(prefixColor: InteractiveColor) = apply {
            this.prefixColor = prefixColor
        }

        override fun suffixColor(suffixColor: StatefulValue<Brush>) = apply {
            this.suffixBrush = suffixColor
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
            val defaultColor = Color.Black.asInteractive()
            val curColor = cursorColor ?: defaultColor
            val curColorRead = cursorColorReadOnly ?: curColor
            val startColor = startContentColor ?: defaultColor
            val startColorRead = startContentColorReadOnly ?: startColor
            val endColor = endContentColor ?: defaultColor
            val endColorRead = endContentColorReadOnly ?: endColor
            val labColor = labelColor ?: defaultColor
            val labColorRead = labelColorReadOnly ?: labColor
            val valColor = valueColor ?: defaultColor
            val valColorRead = valueColorReadOnly ?: valColor
            val capColor = captionColor ?: defaultColor
            val capColorRead = captionColorReadOnly ?: capColor
            val optColor = optionalColor ?: defaultColor
            val optColorRead = optionalColorReadOnly ?: optColor
            val countColor = counterColor ?: defaultColor
            val countColorRead = counterColorReadOnly ?: countColor
            val backColor = backgroundColor ?: Color.Transparent.asInteractive()
            val backColorRead = backgroundColorReadOnly ?: backColor
            val placeColor = placeholderColor ?: Color.Gray.asInteractive()
            val placeColorRead = placeholderColorReadOnly ?: placeColor
            val indColor = indicatorColor ?: Color.Red.asInteractive()
            val indColorRead = indicatorColorReadOnly ?: indColor
            val prefColor = prefixColor ?: defaultColor
            val prefColorRead = prefixColorReadOnly ?: prefColor
            val sufColor = suffixColor ?: defaultColor
            val sufColorRead = suffixColorReadOnly ?: sufColor
            val divColor = dividerColor ?: Color.Transparent.asInteractive()
            val divColorRead = dividerColorReadOnly ?: divColor
            return DefaultTextFieldColors(
                disabledAlpha = disabledAlpha ?: DEFAULT_DISABLED_ALPHA,
                cursorColor = curColorRead,
                cursorColorReadOnly = curColorRead,
                cursorBrush = cursorBrush ?: curColor.asStatefulBrush().addStates(
                    setOf(TextFieldSemanticState.Readonly) to curColorRead,
                ),
                startContentColor = startColor,
                startContentColorReadOnly = startColorRead,
                startContentBrush = startContentBrush ?: startColor.asStatefulBrush().addStates(
                    setOf(TextFieldSemanticState.Readonly) to startColorRead,
                ),
                endContentColor = endColor,
                endContentColorReadOnly = endColorRead,
                endContentBrush = endContentBrush ?: endColor.asStatefulBrush().addStates(
                    setOf(TextFieldSemanticState.Readonly) to endColorRead,
                ),
                labelColor = labColor,
                labelColorReadOnly = labColorRead,
                labelBrush = labelBrush ?: labColor.asStatefulBrush().addStates(
                    setOf(TextFieldSemanticState.Readonly) to labColorRead,
                ),
                valueColor = valColor,
                valueColorReadOnly = valColorRead,
                valueBrush = valueBrush ?: valColor.asStatefulBrush().addStates(
                    setOf(TextFieldSemanticState.Readonly) to valColorRead,
                ),
                captionColor = capColor,
                captionColorReadOnly = capColorRead,
                captionBrush = captionBrush ?: capColor.asStatefulBrush().addStates(
                    setOf(TextFieldSemanticState.Readonly) to capColorRead,
                ),
                optionalColor = optColor,
                optionalColorReadOnly = optColorRead,
                optionalBrush = optionalBrush ?: optColor.asStatefulBrush().addStates(
                    setOf(TextFieldSemanticState.Readonly) to optColorRead,
                ),
                counterColor = countColor,
                counterColorReadOnly = countColorRead,
                counterBrush = counterBrush ?: countColor.asStatefulBrush().addStates(
                    setOf(TextFieldSemanticState.Readonly) to countColorRead,
                ),
                backgroundColor = backColor,
                backgroundColorReadOnly = backColorRead,
                backgroundBrush = backgroundBrush ?: backColor.asStatefulBrush().addStates(
                    setOf(TextFieldSemanticState.Readonly) to backColorRead,
                ),
                placeholderColor = placeColor,
                placeholderColorReadOnly = placeColorRead,
                placeholderBrush = placeholderBrush ?: placeColor.asStatefulBrush().addStates(
                    setOf(TextFieldSemanticState.Readonly) to placeColorRead,
                ),
                indicatorColor = indColor,
                indicatorColorReadOnly = indColorRead,
                indicatorBrush = indicatorBrush ?: indColor.asStatefulBrush().addStates(
                    setOf(TextFieldSemanticState.Readonly) to indColorRead,
                ),
                prefixColor = prefColor,
                prefixColorReadOnly = prefColorRead,
                prefixBrush = prefixBrush ?: prefColor.asStatefulBrush().addStates(
                    setOf(TextFieldSemanticState.Readonly) to prefColorRead,
                ),
                suffixColor = sufColor,
                suffixColorReadOnly = sufColorRead,
                suffixBrush = suffixBrush ?: sufColor.asStatefulBrush().addStates(
                    setOf(TextFieldSemanticState.Readonly) to sufColorRead,
                ),
                dividerColor = divColor,
                dividerColorReadOnly = divColorRead,
                dividerBrush = dividerBrush ?: divColor.asStatefulBrush().addStates(
                    setOf(TextFieldSemanticState.Readonly) to divColorRead,
                ),
            )
        }
    }
}

private class DefaultTextFieldDimensions(
    override val boxPaddingStartValues: StatefulValue<Dp>,
    override val boxPaddingEndValues: StatefulValue<Dp>,
    override val boxPaddingTopValues: StatefulValue<Dp>,
    override val boxPaddingBottomValues: StatefulValue<Dp>,
    override val labelPaddingValues: StatefulValue<Dp>,
    override val optionalPaddingValues: StatefulValue<Dp>,
    override val helperTextPaddingValues: StatefulValue<Dp>,
    override val startContentPaddingValues: StatefulValue<Dp>,
    override val endContentPaddingValues: StatefulValue<Dp>,
    override val chipsPaddingValues: StatefulValue<Dp>,
    override val chipsPaddingStartValues: StatefulValue<Dp>,
    override val chipsPaddingEndValues: StatefulValue<Dp>,
    override val chipsPaddingTopValues: StatefulValue<Dp>,
    override val chipsPaddingBottomValues: StatefulValue<Dp>,
    override val boxMinHeightValues: StatefulValue<Dp>,
    override val alignmentLineHeightValues: StatefulValue<Dp>,
    override val startContentSizeValues: StatefulValue<Dp>,
    override val endContentSizeValues: StatefulValue<Dp>,
    override val dividerThicknessValues: StatefulValue<Dp>,
    override val indicatorDimensions: TextFieldIndicatorDimensionValues,
) : TextFieldDimensionValues {

    class Builder : TextFieldDimensionsBuilder {
        private var boxPaddingStart: StatefulValue<Dp>? = null
        private var boxPaddingEnd: StatefulValue<Dp>? = null
        private var boxPaddingTop: StatefulValue<Dp>? = null
        private var boxPaddingBottom: StatefulValue<Dp>? = null
        private var labelPadding: StatefulValue<Dp>? = null
        private var optionalPadding: StatefulValue<Dp>? = null
        private var helperTextPadding: StatefulValue<Dp>? = null
        private var startContentPadding: StatefulValue<Dp>? = null
        private var endContentPadding: StatefulValue<Dp>? = null
        private var chipsPadding: StatefulValue<Dp>? = null
        private var chipsPaddingStart: StatefulValue<Dp>? = null
        private var chipsPaddingEnd: StatefulValue<Dp>? = null
        private var chipsPaddingTop: StatefulValue<Dp>? = null
        private var chipsPaddingBottom: StatefulValue<Dp>? = null
        private var boxMinHeight: StatefulValue<Dp>? = null
        private var alignmentLineHeight: StatefulValue<Dp>? = null
        private var startContentSize: StatefulValue<Dp>? = null
        private var endContentSize: StatefulValue<Dp>? = null
        private var indicatorDimensionsBuilder: TextFieldIndicatorDimensionsBuilder =
            TextFieldIndicatorDimensionsBuilder.builder()
        private var dividerThickness: StatefulValue<Dp>? = null

        override fun boxPaddingStart(boxPaddingStart: StatefulValue<Dp>) = apply {
            this.boxPaddingStart = boxPaddingStart
        }

        override fun boxPaddingEnd(boxPaddingEnd: StatefulValue<Dp>) = apply {
            this.boxPaddingEnd = boxPaddingEnd
        }

        override fun boxPaddingTop(boxPaddingTop: StatefulValue<Dp>) = apply {
            this.boxPaddingTop = boxPaddingTop
        }

        override fun boxPaddingBottom(boxPaddingBottom: StatefulValue<Dp>) = apply {
            this.boxPaddingBottom = boxPaddingBottom
        }

        override fun labelPadding(labelPadding: StatefulValue<Dp>) = apply {
            this.labelPadding = labelPadding
        }

        override fun optionalPadding(optionalPadding: StatefulValue<Dp>) = apply {
            this.optionalPadding = optionalPadding
        }

        override fun helperTextPadding(helperTextPadding: StatefulValue<Dp>) = apply {
            this.helperTextPadding = helperTextPadding
        }

        override fun startContentPadding(startContentPadding: StatefulValue<Dp>) = apply {
            this.startContentPadding = startContentPadding
        }

        override fun endContentPadding(endContentPadding: StatefulValue<Dp>) = apply {
            this.endContentPadding = endContentPadding
        }

        override fun chipsPadding(chipsPadding: StatefulValue<Dp>) = apply {
            this.chipsPadding = chipsPadding
        }

        override fun chipsPaddingStart(chipsPaddingStart: StatefulValue<Dp>) = apply {
            this.chipsPaddingStart = chipsPaddingStart
        }

        override fun chipsPaddingEnd(chipsPaddingEnd: StatefulValue<Dp>) = apply {
            this.chipsPaddingEnd = chipsPaddingEnd
        }

        override fun chipsPaddingTop(chipsPaddingTop: StatefulValue<Dp>) = apply {
            this.chipsPaddingTop = chipsPaddingTop
        }

        override fun chipsPaddingBottom(chipsPaddingBottom: StatefulValue<Dp>) = apply {
            this.chipsPaddingBottom = chipsPaddingBottom
        }

        override fun boxMinHeight(boxMinHeight: StatefulValue<Dp>) = apply {
            this.boxMinHeight = boxMinHeight
        }

        override fun alignmentLineHeight(alignmentLineHeight: StatefulValue<Dp>) = apply {
            this.alignmentLineHeight = alignmentLineHeight
        }

        override fun startContentSize(startContentSize: StatefulValue<Dp>) = apply {
            this.startContentSize = startContentSize
        }

        override fun endContentSize(endContentSize: StatefulValue<Dp>) = apply {
            this.endContentSize = endContentSize
        }

        @Composable
        override fun indicatorDimensions(builder: @Composable TextFieldIndicatorDimensionsBuilder.() -> Unit) =
            apply { this.indicatorDimensionsBuilder.builder() }

        override fun dividerThickness(dividerThickness: StatefulValue<Dp>) = apply {
            this.dividerThickness = dividerThickness
        }

        @Suppress("CyclomaticComplexMethod")
        override fun build(): TextFieldDimensionValues {
            return DefaultTextFieldDimensions(
                boxPaddingStartValues = boxPaddingStart ?: 16.dp.asStatefulValue(),
                boxPaddingEndValues = boxPaddingEnd ?: 16.dp.asStatefulValue(),
                boxPaddingTopValues = boxPaddingTop ?: 25.dp.asStatefulValue(),
                boxPaddingBottomValues = boxPaddingBottom ?: 9.dp.asStatefulValue(),
                labelPaddingValues = labelPadding ?: 2.dp.asStatefulValue(),
                optionalPaddingValues = optionalPadding ?: 4.dp.asStatefulValue(),
                helperTextPaddingValues = helperTextPadding ?: 4.dp.asStatefulValue(),
                startContentPaddingValues = startContentPadding ?: 6.dp.asStatefulValue(),
                endContentPaddingValues = endContentPadding ?: 6.dp.asStatefulValue(),
                chipsPaddingValues = chipsPadding ?: 6.dp.asStatefulValue(),
                chipsPaddingStartValues = chipsPaddingStart ?: chipsPadding ?: 6.dp.asStatefulValue(),
                chipsPaddingEndValues = chipsPaddingEnd ?: chipsPadding ?: 6.dp.asStatefulValue(),
                chipsPaddingTopValues = chipsPaddingTop ?: chipsPadding ?: 6.dp.asStatefulValue(),
                chipsPaddingBottomValues = chipsPaddingBottom ?: chipsPadding ?: 6.dp.asStatefulValue(),
                boxMinHeightValues = boxMinHeight ?: 56.dp.asStatefulValue(),
                alignmentLineHeightValues = alignmentLineHeight ?: 56.dp.asStatefulValue(),
                startContentSizeValues = startContentSize ?: 24.dp.asStatefulValue(),
                endContentSizeValues = endContentSize ?: 24.dp.asStatefulValue(),
                indicatorDimensions = indicatorDimensionsBuilder.build(),
                dividerThicknessValues = dividerThickness ?: 1.dp.asStatefulValue(),
            )
        }
    }
}

private class DefaultTextFieldIndicatorDimensions(
    override val horizontalPaddingValues: StatefulValue<Dp>,
    override val verticalPaddingValues: StatefulValue<Dp>,
    override val indicatorSizeValues: StatefulValue<Dp>,
) : TextFieldIndicatorDimensionValues {
    class Builder : TextFieldIndicatorDimensionsBuilder {
        private var horizontalPadding: StatefulValue<Dp>? = null
        private var verticalPadding: StatefulValue<Dp>? = null
        private var indicatorSize: StatefulValue<Dp>? = null
        override fun horizontalPadding(horizontalPadding: StatefulValue<Dp>) = apply {
            this.horizontalPadding = horizontalPadding
        }

        override fun verticalPadding(verticalPadding: StatefulValue<Dp>) = apply {
            this.verticalPadding = verticalPadding
        }

        override fun indicatorSize(indicatorSize: StatefulValue<Dp>) = apply {
            this.indicatorSize = indicatorSize
        }

        override fun build(): TextFieldIndicatorDimensionValues {
            return DefaultTextFieldIndicatorDimensions(
                horizontalPaddingValues = horizontalPadding ?: 0.dp.asStatefulValue(),
                verticalPaddingValues = verticalPadding ?: 0.dp.asStatefulValue(),
                indicatorSizeValues = indicatorSize ?: 6.dp.asStatefulValue(),
            )
        }
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
                indicatorColor = scrollBarThumbColor ?: Color.Gray.asInteractive(),
                backgroundColor = scrollBarTrackColor ?: Color.LightGray.asInteractive(),
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
