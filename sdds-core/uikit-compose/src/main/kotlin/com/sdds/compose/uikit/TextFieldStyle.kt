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

/**
 * CompositionLocal c [TextFieldStyle] для компонента [TextField]
 */
val LocalTextFieldStyle = compositionLocalOf { TextFieldStyle.builder().style() }

/**
 * Стиль компонента [TextField]
 */
@Stable
interface TextFieldStyle : Style {

    /**
     * Размеры и отступы компонента
     * @see TextField.Dimensions
     */
    val dimensions: TextField.Dimensions

    /**
     * Цвета компонента
     * @see TextFieldColors
     */
    val colors: TextFieldColors

    /**
     * Форма компонента
     * @see CornerBasedShape
     */
    val shape: CornerBasedShape

    /**
     * Тип текстового поля
     * @see TextField.FieldType
     */
    val fieldType: TextField.FieldType

    /**
     * Внешний вид текстового поля
     * @see TextField.FieldAppearance
     */
    val fieldAppearance: TextField.FieldAppearance

    /**
     * Расположение лэйбла
     * @see
     */
    val labelPlacement: TextField.LabelPlacement

    /**
     * Расположение вспомогательного текста
     * @see TextField.HelperTextPlacement
     */
    val helperTextPlacement: TextField.HelperTextPlacement

    /**
     * Форма контейнера для чипов
     * @see CornerBasedShape
     */
    val chipContainerShape: CornerBasedShape?

    /**
     * Настройки вертикального скроллбара
     * @see ScrollBar
     */
    val scrollBar: ScrollBar?

    /**
     * Стиль лэйбла
     */
    val labelStyle: TextStyle

    /**
     * Стиль опционального текста
     */
    val optionalStyle: TextStyle

    /**
     * Стиль основного текста
     */
    val valueStyle: TextStyle

    /**
     * Стиль надписи
     */
    val captionStyle: TextStyle

    /**
     * Стиль счетчика
     */
    val counterStyle: TextStyle

    /**
     * Стиль плэйсхолдера
     */
    val placeholderStyle: TextStyle

    /**
     * Однострочный или многострочный режим
     */
    val singleLine: Boolean

    /**
     * Есть ли разделитель
     */
    val hasDivider: Boolean

    /**
     * Нужно ли скрыть внутренний лэйбл
     */
    val dropInnerLabel: Boolean

    /**
     * Стиль чипов
     */
    val chipGroupStyle: ChipGroupStyle

    companion object {

        /**
         * Возвращает экземпляр [TextFieldStyleBuilder]
         */
        fun builder(receiver: Any? = null): TextFieldStyleBuilder = DefaultTextFieldStyle.Builder(receiver)
    }
}

/**
 * Билдер стиля [TextFieldStyle]
 */
interface TextFieldStyleBuilder : StyleBuilder<TextFieldStyle> {

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     */
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
     * Устанавливает форму контейнера чипов [chipContainerShape]
     */
    fun chipContainerShape(chipContainerShape: CornerBasedShape): TextFieldStyleBuilder

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
 * Цвета компонента [TextField]
 */
@Stable
interface TextFieldColors {

    /**
     * Альфа в состоянии disabled
     */
    val disabledAlpha: Float

    /**
     * Альфа в состоянии enabled
     */
    val enabledAlpha: Float

    /**
     * Цвет курсора
     */
    val cursorColor: Color

    /**
     * Цвет индикатора
     */
    val indicatorColor: Color

    /**
     * Цвет контенат в начале
     */
    val startContentColor: InteractiveColor

    /**
     * Цвет контента в конце
     */
    val endContentColor: Color

    /**
     * Цвет лэйбла
     */
    fun labelColor(isReadOnly: Boolean, labelPlacement: TextField.LabelPlacement): Color

    /**
     * Цвет основного текста
     */
    fun valueColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвет надписи
     */
    fun captionColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвет опционального текста
     */
    val optionalColor: Color

    /**
     * Цвет счетчика
     */
    val counterColor: Color

    /**
     * Цвет разделителя
     */
    fun dividerColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвет плэйсхолдера
     */
    fun placeholderColor(isReadOnly: Boolean): InteractiveColor

    /**
     * Цвет бэкграунда
     */
    fun backgroundColor(isReadOnly: Boolean): InteractiveColor

    companion object {

        /**
         * Вернет экземпляр билдера [TextFieldColorsBuilder]
         */
        fun builder(): TextFieldColorsBuilder = DefaultTextFieldColors.Builder()
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

        @Suppress("CyclomaticComplexMethod")
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
                chipGroupStyle = chipGroupStyle ?: ChipGroupStyle.builder().style(),
            )
        }
    }
}

/**
 * Билдер цветов [TextFieldColors]
 */
interface TextFieldColorsBuilder {

    /**
     * Устанавливает альфу [disabledAlpha] в состоянии disabled
     */
    fun disabledAlpha(disabledAlpha: Float)

    /**
     * Устанавливает альфу [enabledAlpha] в состоянии enabled
     */
    fun enabledAlpha(enabledAlpha: Float)

    /**
     * Устанавливает цвет курсора [cursorColor]
     */
    fun cursorColor(cursorColor: Color)

    /**
     * Устанавливает цвет контента в начале [startContentColor]
     */
    fun startContentColor(startContentColor: InteractiveColor)

    /**
     * Устанавливает цвет контента в конце [endContentColor]
     */
    fun endContentColor(endContentColor: Color)

    /**
     * Устанавливает цвет внутреннего лэйбла [innerLabelColor]
     */
    fun innerLabelColor(innerLabelColor: Color)

    /**
     * Устанавливает цвет внешнего лэйбла [outerLabelColor]
     */
    fun outerLabelColor(outerLabelColor: Color)

    /**
     * Устанавливает цвет внешнего лэйбла в состоянии readOnly [outerLabelColorReadOnly]
     */
    fun outerLabelColorReadOnly(outerLabelColorReadOnly: Color)

    /**
     * Устанавливает цвет основного текста [valueColor]
     */
    fun valueColor(valueColor: InteractiveColor)

    /**
     * Устанавливает цвет основного текста в состоянии readOnly [valueColorReadOnly]
     */
    fun valueColorReadOnly(valueColorReadOnly: InteractiveColor)

    /**
     * Устанавливает цвет надписи [captionColor]
     */
    fun captionColor(captionColor: InteractiveColor)

    /**
     * Устанавливает цвет надписи в состоянии readOnly [captionColorReadOnly]
     */
    fun captionColorReadOnly(captionColorReadOnly: InteractiveColor)

    /**
     * Устанавливает цвет опционального текста [optionalColor]
     */
    fun optionalColor(optionalColor: Color)

    /**
     * Устанавливает цвет счетчика [counterColor]
     */
    fun counterColor(counterColor: Color)

    /**
     * Устанавливает цвет плэйсхолдера [placeholderColor]
     */
    fun placeholderColor(placeholderColor: InteractiveColor)

    /**
     * Устанавливает цвет плэйсхолдеоа в состоянии readOnly [placeholderColorReadOnly]
     */
    fun placeholderColorReadOnly(placeholderColorReadOnly: InteractiveColor)

    /**
     * Устанавливает цвет бэкграунда [backgroundColor]
     */
    fun backgroundColor(backgroundColor: InteractiveColor)

    /**
     * Устанавливает цвет бэкграунда в состоянии readOnly [backgroundColorReadOnly]
     */
    fun backgroundColorReadOnly(backgroundColorReadOnly: InteractiveColor)

    /**
     * Устанавливает цвет разделителя [dividerColor]
     */
    fun dividerColor(dividerColor: InteractiveColor)

    /**
     * Устанавливает цвет разделителя в состоянии readOnlu [dividerColorReadOnly]
     */
    fun dividerColorReadOnly(dividerColorReadOnly: InteractiveColor)

    /**
     * Устанавливает цвет индикатора
     */
    fun indicatorColor(indicatorColor: Color)

    /**
     * Вернет экземпляр [TextFieldColors]
     */
    fun build(): TextFieldColors
}

@Suppress("LongParameterList")
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
        labelPlacement: TextField.LabelPlacement,
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

        @Suppress("CyclomaticComplexMethod")
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
