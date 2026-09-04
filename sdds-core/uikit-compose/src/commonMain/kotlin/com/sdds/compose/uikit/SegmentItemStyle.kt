package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.api.info.compose.ApiName
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.internal.segment.asLegacyColor
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [SegmentItemStyle] для компонента [SegmentItem]
 */
val LocalSegmentItemStyle =
    compositionLocalOf(structuralEqualityPolicy()) { SegmentItemStyle.builder().style() }

/**
 * Стиль компонента [SegmentItem]
 */
@Immutable
interface SegmentItemStyle : Style {

    /**
     * Форма компонента
     */
    @Deprecated("Use shapes", ReplaceWith("shapes"))
    val shape: CornerBasedShape

    /**
     * Значения [shape] для состояний компонента.
     */
    val shapes: StatefulValue<CornerBasedShape>

    /**
     * Стиль основного текста
     */
    @Deprecated("Use labelStyles", ReplaceWith("labelStyles"))
    val labelStyle: TextStyle

    /**
     * Значения [labelStyle] для состояний компонента.
     */
    val labelStyles: StatefulValue<TextStyle>

    /**
     * Стиль дополнительного текста
     */
    @Deprecated("Use valueStyles", ReplaceWith("valueStyles"))
    val valueStyle: TextStyle

    /**
     * Значения [valueStyle] для состояний компонента.
     */
    val valueStyles: StatefulValue<TextStyle>

    /**
     * Цвета компонента [SegmentItem]
     */
    val colors: SegmentItemColors

    /**
     * Размеры и отступы компонента [SegmentItem]
     */
    val dimensions: SegmentItemDimensions

    /**
     * Альфа в состоянии disabled
     */
    val disabledAlpha: Float

    /**
     * Стиль каунтера [Counter]
     */
    val counterStyle: CounterStyle

    companion object {
        /**
         * Возвращает экземпляр [SegmentItemStyleBuilder]
         */
        fun builder(receiver: Any? = null): SegmentItemStyleBuilder =
            DefaultSegmentItemStyle.Builder()
    }
}

/**
 * Билдер стиля [SegmentItemStyle]
 */
@ApiInfo
interface SegmentItemStyleBuilder : StyleBuilder<SegmentItemStyle> {

    /**
     * Устанавливает форму компонента
     */
    fun shape(shape: CornerBasedShape): SegmentItemStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает значения [shape] для состояний компонента.
     */
    fun shape(shape: StatefulValue<CornerBasedShape>): SegmentItemStyleBuilder

    /**
     * Устанавливает стиль основного текста
     */
    fun labelStyle(labelStyle: TextStyle): SegmentItemStyleBuilder =
        labelStyle(labelStyle.asStatefulValue())

    /**
     * Устанавливает значения [labelStyle] для состояний компонента.
     */
    fun labelStyle(labelStyle: StatefulValue<TextStyle>): SegmentItemStyleBuilder

    /**
     * Устанавливает стиль дополнительного текста
     */
    fun valueStyle(valueStyle: TextStyle): SegmentItemStyleBuilder =
        valueStyle(valueStyle.asStatefulValue())

    /**
     * Устанавливает значения [valueStyle] для состояний компонента.
     */
    fun valueStyle(valueStyle: StatefulValue<TextStyle>): SegmentItemStyleBuilder

    /**
     * Устанавливает цвета компонента [SegmentItem]
     */
    @Composable
    fun colors(builder: @Composable SegmentItemColorsBuilder.() -> Unit): SegmentItemStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [SegmentItem]
     */
    @Composable
    fun dimensions(builder: @Composable SegmentItemDimensionsBuilder.() -> Unit): SegmentItemStyleBuilder

    /**
     * Устанавливает альфу в состоянии disabled
     */
    fun disabledAlpha(disabledAlpha: Float): SegmentItemStyleBuilder

    /**
     * Устанавливает стиль [Counter]
     */
    fun counterStyle(counterStyle: CounterStyle): SegmentItemStyleBuilder
}

@Immutable
private class DefaultSegmentItemStyle(
    override val shapes: StatefulValue<CornerBasedShape>,
    override val labelStyles: StatefulValue<TextStyle>,
    override val valueStyles: StatefulValue<TextStyle>,
    override val colors: SegmentItemColors,
    override val dimensions: SegmentItemDimensions,
    override val disabledAlpha: Float,
    override val counterStyle: CounterStyle,
) : SegmentItemStyle {

    @Deprecated("Use shapes", ReplaceWith("shapes"))
    override val shape: CornerBasedShape = shapes.getDefaultValue()

    @Deprecated("Use labelStyles", ReplaceWith("labelStyles"))
    override val labelStyle: TextStyle = labelStyles.getDefaultValue()

    @Deprecated("Use valueStyles", ReplaceWith("valueStyles"))
    override val valueStyle: TextStyle = valueStyles.getDefaultValue()

    class Builder : SegmentItemStyleBuilder {
        private var shape: StatefulValue<CornerBasedShape>? = null
        private var labelStyle: StatefulValue<TextStyle>? = null
        private var valueStyle: StatefulValue<TextStyle>? = null
        private var colorsBuilder: SegmentItemColorsBuilder = SegmentItemColors.builder()
        private var dimensionsBuilder: SegmentItemDimensionsBuilder =
            SegmentItemDimensions.builder()
        private var disabledAlpha: Float? = null
        private var counterStyle: CounterStyle? = null

        override fun shape(shape: StatefulValue<CornerBasedShape>) = apply {
            this.shape = shape
        }

        override fun labelStyle(labelStyle: StatefulValue<TextStyle>) = apply {
            this.labelStyle = labelStyle
        }

        override fun valueStyle(valueStyle: StatefulValue<TextStyle>) = apply {
            this.valueStyle = valueStyle
        }

        @Composable
        override fun colors(builder: @Composable (SegmentItemColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable (SegmentItemDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun disabledAlpha(disabledAlpha: Float) = apply {
            this.disabledAlpha = disabledAlpha
        }

        override fun counterStyle(counterStyle: CounterStyle) = apply {
            this.counterStyle = counterStyle
        }

        override fun style(): SegmentItemStyle {
            return DefaultSegmentItemStyle(
                shapes = shape ?: RoundedCornerShape(0).asStatefulValue(),
                labelStyles = labelStyle ?: TextStyle.Default.asStatefulValue(),
                valueStyles = valueStyle ?: TextStyle.Default.asStatefulValue(),
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                disabledAlpha = disabledAlpha ?: 0.4f,
                counterStyle = counterStyle ?: CounterStyle.builder().style(),
            )
        }
    }
}

/**
 * Цвета компонента [SegmentItem]
 */
@Immutable
interface SegmentItemColors {

    /**
     * Цвет фона
     */
    @Deprecated("Use backgroundBrush", ReplaceWith("backgroundBrush"))
    val backgroundColor: InteractiveColor

    /**
     * Значения [backgroundColor] для состояний компонента.
     */
    val backgroundBrush: StatefulValue<Brush>

    /**
     * Цвет основного текста
     */
    @Deprecated("Use labelBrush", ReplaceWith("labelBrush"))
    val labelColor: InteractiveColor

    /**
     * Значения [labelColor] для состояний компонента.
     */
    val labelBrush: StatefulValue<Brush>

    /**
     * Цвет дополнительного текста
     */
    @Deprecated("Use valueBrush", ReplaceWith("valueBrush"))
    val valueColor: InteractiveColor

    /**
     * Значения [valueColor] для состояний компонента.
     */
    val valueBrush: StatefulValue<Brush>

    /**
     * Цвет контента в начале
     */
    @Deprecated("Use startContentBrush", ReplaceWith("startContentBrush"))
    val startContentColor: InteractiveColor

    /**
     * Значения [startContentColor] для состояний компонента.
     */
    val startContentBrush: StatefulValue<Brush>

    /**
     * Цвет контента в конце
     */
    @Deprecated("Use endContentBrush", ReplaceWith("endContentBrush"))
    val endContentColor: InteractiveColor

    /**
     * Значения [endContentColor] для состояний компонента.
     */
    val endContentBrush: StatefulValue<Brush>

    companion object {

        /**
         * Возвращает экземпляр [SegmentItemColorsBuilder]
         */
        fun builder(): SegmentItemColorsBuilder = DefaultSegmentItemColors.Builder()
    }
}

/**
 * Билдер для [SegmentItemColors]
 */
interface SegmentItemColorsBuilder {

    /**
     * Устанавливает цвет фона
     */
    fun backgroundColor(backgroundColor: Color): SegmentItemColorsBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Устанавливает цвет фона
     */
    fun backgroundColor(backgroundColor: InteractiveColor): SegmentItemColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает значения [backgroundColor] для состояний компонента.
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): SegmentItemColorsBuilder

    /**
     * Устанавливает заливку [backgroundColor].
     */
    fun backgroundColor(backgroundColor: Brush): SegmentItemColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает цвет основного текста
     */
    fun labelColor(labelColor: Color): SegmentItemColorsBuilder =
        labelColor(labelColor.asInteractive())

    /**
     * Устанавливает цвет основного текста
     */
    fun labelColor(labelColor: InteractiveColor): SegmentItemColorsBuilder =
        labelColor(labelColor.asStatefulBrush())

    /**
     * Устанавливает значения [labelColor] для состояний компонента.
     */
    fun labelColor(labelColor: StatefulValue<Brush>): SegmentItemColorsBuilder

    /**
     * Устанавливает заливку [labelColor].
     */
    fun labelColor(labelColor: Brush): SegmentItemColorsBuilder =
        labelColor(labelColor.asStatefulValue())

    /**
     * Устанавливает цвет дополнительного текста
     */
    fun valueColor(valueColor: Color): SegmentItemColorsBuilder =
        valueColor(valueColor.asInteractive())

    /**
     * Устанавливает цвет дополнительного текста
     */
    fun valueColor(valueColor: InteractiveColor): SegmentItemColorsBuilder =
        valueColor(valueColor.asStatefulBrush())

    /**
     * Устанавливает значения [valueColor] для состояний компонента.
     */
    fun valueColor(valueColor: StatefulValue<Brush>): SegmentItemColorsBuilder

    /**
     * Устанавливает заливку [valueColor].
     */
    fun valueColor(valueColor: Brush): SegmentItemColorsBuilder =
        valueColor(valueColor.asStatefulValue())

    /**
     * Устанавливает цвет контента в начале
     */
    fun startContentColor(startContentColor: Color): SegmentItemColorsBuilder =
        startContentColor(startContentColor.asInteractive())

    /**
     * Устанавливает цвет контента в начале
     */
    fun startContentColor(startContentColor: InteractiveColor): SegmentItemColorsBuilder =
        startContentColor(startContentColor.asStatefulBrush())

    /**
     * Устанавливает значения [startContentColor] для состояний компонента.
     */
    fun startContentColor(startContentColor: StatefulValue<Brush>): SegmentItemColorsBuilder

    /**
     * Устанавливает заливку [startContentColor].
     */
    fun startContentColor(startContentColor: Brush): SegmentItemColorsBuilder =
        startContentColor(startContentColor.asStatefulValue())

    /**
     * Устанавливает цвет контента в конце
     */
    fun endContentColor(endContentColor: Color): SegmentItemColorsBuilder =
        endContentColor(endContentColor.asInteractive())

    /**
     * Устанавливает цвет контента в конце
     */
    fun endContentColor(endContentColor: InteractiveColor): SegmentItemColorsBuilder =
        endContentColor(endContentColor.asStatefulBrush())

    /**
     * Устанавливает значения [endContentColor] для состояний компонента.
     */
    fun endContentColor(endContentColor: StatefulValue<Brush>): SegmentItemColorsBuilder

    /**
     * Устанавливает заливку [endContentColor].
     */
    fun endContentColor(endContentColor: Brush): SegmentItemColorsBuilder =
        endContentColor(endContentColor.asStatefulValue())

    /**
     * Возвращает [SegmentItemColors]
     */
    fun build(): SegmentItemColors
}

@Immutable
private class DefaultSegmentItemColors(
    override val backgroundBrush: StatefulValue<Brush>,
    override val labelBrush: StatefulValue<Brush>,
    override val valueBrush: StatefulValue<Brush>,
    override val startContentBrush: StatefulValue<Brush>,
    override val endContentBrush: StatefulValue<Brush>,
) : SegmentItemColors {

    @Deprecated("Use backgroundBrush", ReplaceWith("backgroundBrush"))
    override val backgroundColor: InteractiveColor = backgroundBrush.asLegacyColor()

    @Deprecated("Use labelBrush", ReplaceWith("labelBrush"))
    override val labelColor: InteractiveColor = labelBrush.asLegacyColor()

    @Deprecated("Use valueBrush", ReplaceWith("valueBrush"))
    override val valueColor: InteractiveColor = valueBrush.asLegacyColor()

    @Deprecated("Use startContentBrush", ReplaceWith("startContentBrush"))
    override val startContentColor: InteractiveColor = startContentBrush.asLegacyColor()

    @Deprecated("Use endContentBrush", ReplaceWith("endContentBrush"))
    override val endContentColor: InteractiveColor = endContentBrush.asLegacyColor()

    class Builder : SegmentItemColorsBuilder {
        private var backgroundColor: StatefulValue<Brush>? = null
        private var labelColor: StatefulValue<Brush>? = null
        private var valueColor: StatefulValue<Brush>? = null
        private var startContentColor: StatefulValue<Brush>? = null
        private var endContentColor: StatefulValue<Brush>? = null

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun labelColor(labelColor: StatefulValue<Brush>) = apply {
            this.labelColor = labelColor
        }

        override fun valueColor(valueColor: StatefulValue<Brush>) = apply {
            this.valueColor = valueColor
        }

        override fun startContentColor(startContentColor: StatefulValue<Brush>) = apply {
            this.startContentColor = startContentColor
        }

        override fun endContentColor(endContentColor: StatefulValue<Brush>) = apply {
            this.endContentColor = endContentColor
        }

        override fun build(): SegmentItemColors {
            return DefaultSegmentItemColors(
                backgroundBrush = backgroundColor
                    ?: Color.LightGray.asInteractive(selected = Color.Black).asStatefulBrush(),
                labelBrush = labelColor ?: Color.Black.asInteractive(selected = Color.Gray).asStatefulBrush(),
                valueBrush = valueColor ?: Color.Gray.asInteractive(selected = Color.Gray).asStatefulBrush(),
                startContentBrush = startContentColor
                    ?: Color.DarkGray.asInteractive(selected = Color.Gray).asStatefulBrush(),
                endContentBrush = endContentColor
                    ?: Color.DarkGray.asInteractive(selected = Color.Gray).asStatefulBrush(),
            )
        }
    }
}

/**
 * Размеры и отступы компонента [SegmentItem]
 */
@Immutable
interface SegmentItemDimensions {

    /**
     * Минимальная высота
     */
    @Deprecated("Use minHeightValues", ReplaceWith("minHeightValues"))
    val minHeight: Dp

    /**
     * Значения [minHeight] для состояний компонента.
     */
    val minHeightValues: StatefulValue<Dp>

    /**
     * Минимальная ширина
     */
    @Deprecated("Use minWidthValues", ReplaceWith("minWidthValues"))
    val minWidth: Dp

    /**
     * Значения [minWidth] для состояний компонента.
     */
    val minWidthValues: StatefulValue<Dp>

    /**
     * Отступ в начале
     */
    @Deprecated("Use paddingStartValues", ReplaceWith("paddingStartValues"))
    val paddingStart: Dp

    /**
     * Значения [paddingStart] для состояний компонента.
     */
    val paddingStartValues: StatefulValue<Dp>

    /**
     * Отступ в конце
     */
    @Deprecated("Use paddingEndValues", ReplaceWith("paddingEndValues"))
    val paddingEnd: Dp

    /**
     * Значения [paddingEnd] для состояний компонента.
     */
    val paddingEndValues: StatefulValue<Dp>

    /**
     * Отступ контента в начале
     */
    @Deprecated("Use startContentPaddingValues", ReplaceWith("startContentPaddingValues"))
    val startContentPadding: Dp

    /**
     * Значения [startContentPadding] для состояний компонента.
     */
    val startContentPaddingValues: StatefulValue<Dp>

    /**
     * Отступ контента в конце
     */
    @Deprecated("Use endContentPaddingValues", ReplaceWith("endContentPaddingValues"))
    val endContentPadding: Dp

    /**
     * Значения [endContentPadding] для состояний компонента.
     */
    val endContentPaddingValues: StatefulValue<Dp>

    /**
     * Отступ дополнительного текста
     */
    @Deprecated("Use valueMarginValues", ReplaceWith("valueMarginValues"))
    val valueMargin: Dp

    /**
     * Значения [valueMargin] для состояний компонента.
     */
    val valueMarginValues: StatefulValue<Dp>

    /**
     * Размер иконки в начале
     */
    @Deprecated("Use startContentSizeValues", ReplaceWith("startContentSizeValues"))
    val startContentSize: Dp

    /**
     * Значения [startContentSize] для состояний компонента.
     */
    val startContentSizeValues: StatefulValue<Dp>

    /**
     * Размер иконки в конце
     */
    @Deprecated("Use endContentSizeValues", ReplaceWith("endContentSizeValues"))
    val endContentSize: Dp

    /**
     * Значения [endContentSize] для состояний компонента.
     */
    val endContentSizeValues: StatefulValue<Dp>

    companion object {

        /**
         * Возвращает экземпляр [SegmentItemDimensionsBuilder]
         */
        fun builder(): SegmentItemDimensionsBuilder = DefaultSegmentItemDimensions.Builder()
    }
}

/**
 * Билдер для [SegmentItemDimensions]
 */
interface SegmentItemDimensionsBuilder {

    /**
     * Устанавливает минимальную высоту
     */
    fun minHeight(minHeight: Dp): SegmentItemDimensionsBuilder =
        minHeight(minHeight.asStatefulValue())

    /**
     * Устанавливает значения [minHeight] для состояний компонента.
     */
    fun minHeight(minHeight: StatefulValue<Dp>): SegmentItemDimensionsBuilder

    /**
     * Устанавливает минимальную ширину
     */
    fun minWidth(minWidth: Dp): SegmentItemDimensionsBuilder =
        minWidth(minWidth.asStatefulValue())

    /**
     * Устанавливает значения [minWidth] для состояний компонента.
     */
    fun minWidth(minWidth: StatefulValue<Dp>): SegmentItemDimensionsBuilder

    /**
     * Устанавливает отступ в начале
     */
    fun paddingStart(paddingStart: Dp): SegmentItemDimensionsBuilder =
        paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает значения [paddingStart] для состояний компонента.
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): SegmentItemDimensionsBuilder

    /**
     * Устанавливает отступ в конце
     */
    fun paddingEnd(paddingEnd: Dp): SegmentItemDimensionsBuilder =
        paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает значения [paddingEnd] для состояний компонента.
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): SegmentItemDimensionsBuilder

    /**
     * Устанавливает отступ контента в начале
     */
    @ApiName(name = "iconMargin")
    fun startContentPadding(startContentPadding: Dp): SegmentItemDimensionsBuilder =
        startContentPadding(startContentPadding.asStatefulValue())

    /**
     * Устанавливает значения [startContentPadding] для состояний компонента.
     */
    @ApiName(name = "iconMargin")
    fun startContentPadding(startContentPadding: StatefulValue<Dp>): SegmentItemDimensionsBuilder

    /**
     * Устанавливает отступ контента в конце
     */
    @ApiName(name = "counterMargin")
    fun endContentPadding(endContentPadding: Dp): SegmentItemDimensionsBuilder =
        endContentPadding(endContentPadding.asStatefulValue())

    /**
     * Устанавливает значения [endContentPadding] для состояний компонента.
     */
    @ApiName(name = "counterMargin")
    fun endContentPadding(endContentPadding: StatefulValue<Dp>): SegmentItemDimensionsBuilder

    /**
     * Устанавливает отступ дополнительного текста
     */
    fun valueMargin(valueMargin: Dp): SegmentItemDimensionsBuilder =
        valueMargin(valueMargin.asStatefulValue())

    /**
     * Устанавливает значения [valueMargin] для состояний компонента.
     */
    fun valueMargin(valueMargin: StatefulValue<Dp>): SegmentItemDimensionsBuilder

    /**
     * Устанавливает размер иконки в начале
     */
    fun startContentSize(startContentSize: Dp): SegmentItemDimensionsBuilder =
        startContentSize(startContentSize.asStatefulValue())

    /**
     * Устанавливает значения [startContentSize] для состояний компонента.
     */
    fun startContentSize(startContentSize: StatefulValue<Dp>): SegmentItemDimensionsBuilder

    /**
     * Устанавливает размер иконки в конце
     */
    fun endContentSize(endContentSize: Dp): SegmentItemDimensionsBuilder =
        endContentSize(endContentSize.asStatefulValue())

    /**
     * Устанавливает значения [endContentSize] для состояний компонента.
     */
    fun endContentSize(endContentSize: StatefulValue<Dp>): SegmentItemDimensionsBuilder

    /**
     * Вернет [SegmentItemDimensions]
     */
    fun build(): SegmentItemDimensions
}

@Immutable
private class DefaultSegmentItemDimensions(
    override val minHeightValues: StatefulValue<Dp>,
    override val minWidthValues: StatefulValue<Dp>,
    override val paddingStartValues: StatefulValue<Dp>,
    override val paddingEndValues: StatefulValue<Dp>,
    override val startContentPaddingValues: StatefulValue<Dp>,
    override val endContentPaddingValues: StatefulValue<Dp>,
    override val valueMarginValues: StatefulValue<Dp>,
    override val startContentSizeValues: StatefulValue<Dp>,
    override val endContentSizeValues: StatefulValue<Dp>,
) : SegmentItemDimensions {

    @Deprecated("Use minHeightValues", ReplaceWith("minHeightValues"))
    override val minHeight: Dp = minHeightValues.getDefaultValue()

    @Deprecated("Use minWidthValues", ReplaceWith("minWidthValues"))
    override val minWidth: Dp = minWidthValues.getDefaultValue()

    @Deprecated("Use paddingStartValues", ReplaceWith("paddingStartValues"))
    override val paddingStart: Dp = paddingStartValues.getDefaultValue()

    @Deprecated("Use paddingEndValues", ReplaceWith("paddingEndValues"))
    override val paddingEnd: Dp = paddingEndValues.getDefaultValue()

    @Deprecated("Use startContentPaddingValues", ReplaceWith("startContentPaddingValues"))
    override val startContentPadding: Dp = startContentPaddingValues.getDefaultValue()

    @Deprecated("Use endContentPaddingValues", ReplaceWith("endContentPaddingValues"))
    override val endContentPadding: Dp = endContentPaddingValues.getDefaultValue()

    @Deprecated("Use valueMarginValues", ReplaceWith("valueMarginValues"))
    override val valueMargin: Dp = valueMarginValues.getDefaultValue()

    @Deprecated("Use startContentSizeValues", ReplaceWith("startContentSizeValues"))
    override val startContentSize: Dp = startContentSizeValues.getDefaultValue()

    @Deprecated("Use endContentSizeValues", ReplaceWith("endContentSizeValues"))
    override val endContentSize: Dp = endContentSizeValues.getDefaultValue()

    class Builder : SegmentItemDimensionsBuilder {
        private var minHeight: StatefulValue<Dp>? = null
        private var minWidth: StatefulValue<Dp>? = null
        private var paddingStart: StatefulValue<Dp>? = null
        private var paddingEnd: StatefulValue<Dp>? = null
        private var startContentPadding: StatefulValue<Dp>? = null
        private var endContentPadding: StatefulValue<Dp>? = null
        private var valueMargin: StatefulValue<Dp>? = null
        private var startContentSize: StatefulValue<Dp>? = null
        private var endContentSize: StatefulValue<Dp>? = null

        override fun minHeight(minHeight: StatefulValue<Dp>) = apply {
            this.minHeight = minHeight
        }

        override fun minWidth(minWidth: StatefulValue<Dp>) = apply {
            this.minWidth = minWidth
        }

        override fun paddingStart(paddingStart: StatefulValue<Dp>) = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: StatefulValue<Dp>) = apply {
            this.paddingEnd = paddingEnd
        }

        override fun startContentPadding(startContentPadding: StatefulValue<Dp>) = apply {
            this.startContentPadding = startContentPadding
        }

        override fun endContentPadding(endContentPadding: StatefulValue<Dp>) = apply {
            this.endContentPadding = endContentPadding
        }

        override fun valueMargin(valueMargin: StatefulValue<Dp>) = apply {
            this.valueMargin = valueMargin
        }

        override fun startContentSize(startContentSize: StatefulValue<Dp>) = apply {
            this.startContentSize = startContentSize
        }

        override fun endContentSize(endContentSize: StatefulValue<Dp>) = apply {
            this.endContentSize = endContentSize
        }

        override fun build(): SegmentItemDimensions {
            return DefaultSegmentItemDimensions(
                minHeightValues = minHeight ?: 64.dp.asStatefulValue(),
                minWidthValues = minWidth ?: 110.dp.asStatefulValue(),
                paddingStartValues = paddingStart ?: 16.dp.asStatefulValue(),
                paddingEndValues = paddingEnd ?: 16.dp.asStatefulValue(),
                startContentPaddingValues = startContentPadding ?: 4.dp.asStatefulValue(),
                endContentPaddingValues = endContentPadding ?: 4.dp.asStatefulValue(),
                valueMarginValues = valueMargin ?: 4.dp.asStatefulValue(),
                startContentSizeValues = startContentSize ?: 24.dp.asStatefulValue(),
                endContentSizeValues = endContentSize ?: 24.dp.asStatefulValue(),
            )
        }
    }
}
