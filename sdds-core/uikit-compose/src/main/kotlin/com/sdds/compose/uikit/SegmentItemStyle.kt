package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [SegmentItemStyle] для компонента [SegmentItem]
 */
val LocalSegmentItemStyle =
    compositionLocalOf(structuralEqualityPolicy()) { SegmentItemStyle.segmentItemBuilder().style() }

/**
 * Стиль компонента [SegmentItem]
 */
@Immutable
interface SegmentItemStyle : Style {

    /**
     * Форма компонента
     */
    val shape: CornerBasedShape

    /**
     * Стиль основного текста
     */
    val labelStyle: TextStyle

    /**
     * Стиль дополнительного текста
     */
    val valueStyle: TextStyle

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

    companion object
}

/**
 * Возвращает экземпляр [SegmentItemStyleBuilder]
 */
fun SegmentItemStyle.Companion.segmentItemBuilder(receiver: Any? = null): SegmentItemStyleBuilder =
    DefaultSegmentItemStyle.Builder()

/**
 * Билдер стиля [SegmentItemStyle]
 */
interface SegmentItemStyleBuilder : StyleBuilder<SegmentItemStyle> {

    /**
     * Устанавливает форму компонента
     */
    fun shape(shape: CornerBasedShape): SegmentItemStyleBuilder

    /**
     * Устанавливает стиль основного текста
     */
    fun labelStyle(labelStyle: TextStyle): SegmentItemStyleBuilder

    /**
     * Устанавливает стиль дополнительного текста
     */
    fun valueStyle(valueStyle: TextStyle): SegmentItemStyleBuilder

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
    override val shape: CornerBasedShape,
    override val labelStyle: TextStyle,
    override val valueStyle: TextStyle,
    override val colors: SegmentItemColors,
    override val dimensions: SegmentItemDimensions,
    override val disabledAlpha: Float,
    override val counterStyle: CounterStyle,
) : SegmentItemStyle {

    class Builder : SegmentItemStyleBuilder {
        private var shape: CornerBasedShape? = null
        private var labelStyle: TextStyle? = null
        private var valueStyle: TextStyle? = null
        private var colorsBuilder: SegmentItemColorsBuilder = SegmentItemColors.builder()
        private var dimensionsBuilder: SegmentItemDimensionsBuilder =
            SegmentItemDimensions.builder()
        private var disabledAlpha: Float? = null
        private var counterStyle: CounterStyle? = null

        override fun shape(shape: CornerBasedShape) = apply {
            this.shape = shape
        }

        override fun labelStyle(labelStyle: TextStyle) = apply {
            this.labelStyle = labelStyle
        }

        override fun valueStyle(valueStyle: TextStyle) = apply {
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
                shape = shape ?: CircleShape,
                labelStyle = labelStyle ?: TextStyle.Default,
                valueStyle = valueStyle ?: TextStyle.Default,
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                disabledAlpha = disabledAlpha ?: 0.4f,
                counterStyle = counterStyle ?: CounterStyle.counterBuilder().style(),
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
    val backgroundColor: InteractiveColor

    /**
     * Цвет основного текста
     */
    val labelColor: InteractiveColor

    /**
     * Цвет дополнительного текста
     */
    val valueColor: InteractiveColor

    /**
     * Цвет контента в начале
     */
    val startContentColor: InteractiveColor

    /**
     * Цвет контента в конце
     */
    val endContentColor: InteractiveColor

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
    fun backgroundColor(backgroundColor: InteractiveColor): SegmentItemColorsBuilder

    /**
     * Устанавливает цвет основного текста
     */
    fun labelColor(labelColor: Color): SegmentItemColorsBuilder =
        labelColor(labelColor.asInteractive())

    /**
     * Устанавливает цвет основного текста
     */
    fun labelColor(labelColor: InteractiveColor): SegmentItemColorsBuilder

    /**
     * Устанавливает цвет дополнительного текста
     */
    fun valueColor(valueColor: Color): SegmentItemColorsBuilder =
        valueColor(valueColor.asInteractive())

    /**
     * Устанавливает цвет дополнительного текста
     */
    fun valueColor(valueColor: InteractiveColor): SegmentItemColorsBuilder

    /**
     * Устанавливает цвет контента в начале
     */
    fun startContentColor(startContentColor: Color): SegmentItemColorsBuilder =
        startContentColor(startContentColor.asInteractive())

    /**
     * Устанавливает цвет контента в начале
     */
    fun startContentColor(startContentColor: InteractiveColor): SegmentItemColorsBuilder

    /**
     * Устанавливает цвет контента в конце
     */
    fun endContentColor(endContentColor: Color): SegmentItemColorsBuilder =
        endContentColor(endContentColor.asInteractive())

    /**
     * Устанавливает цвет контента в конце
     */
    fun endContentColor(endContentColor: InteractiveColor): SegmentItemColorsBuilder

    /**
     * Возвращает [SegmentItemColors]
     */
    fun build(): SegmentItemColors
}

@Immutable
private class DefaultSegmentItemColors(
    override val backgroundColor: InteractiveColor,
    override val labelColor: InteractiveColor,
    override val valueColor: InteractiveColor,
    override val startContentColor: InteractiveColor,
    override val endContentColor: InteractiveColor,
) : SegmentItemColors {

    class Builder : SegmentItemColorsBuilder {
        private var backgroundColor: InteractiveColor? = null
        private var labelColor: InteractiveColor? = null
        private var valueColor: InteractiveColor? = null
        private var startContentColor: InteractiveColor? = null
        private var endContentColor: InteractiveColor? = null

        override fun backgroundColor(backgroundColor: InteractiveColor) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun labelColor(labelColor: InteractiveColor) = apply {
            this.labelColor = labelColor
        }

        override fun valueColor(valueColor: InteractiveColor) = apply {
            this.valueColor = valueColor
        }

        override fun startContentColor(startContentColor: InteractiveColor) = apply {
            this.startContentColor = startContentColor
        }

        override fun endContentColor(endContentColor: InteractiveColor) = apply {
            this.endContentColor = endContentColor
        }

        override fun build(): SegmentItemColors {
            return DefaultSegmentItemColors(
                backgroundColor = backgroundColor ?: Color.LightGray.asInteractive(),
                labelColor = labelColor ?: Color.Black.asInteractive(),
                valueColor = valueColor ?: Color.Gray.asInteractive(),
                startContentColor = startContentColor ?: Color.DarkGray.asInteractive(),
                endContentColor = endContentColor ?: Color.DarkGray.asInteractive(),
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
    val minHeight: Dp

    /**
     * Минимальная ширина
     */
    val minWidth: Dp

    /**
     * Отступ в начале
     */
    val paddingStart: Dp

    /**
     * Отступ в конце
     */
    val paddingEnd: Dp

    /**
     * Отступ контента в начале
     */
    val startContentPadding: Dp

    /**
     * Отступ контента в конце
     */
    val endContentPadding: Dp

    /**
     * Отступ дополнительного текста
     */
    val valueMargin: Dp

    /**
     * Размер иконки в начале
     */
    val startContentSize: Dp

    /**
     * Размер иконки в конце
     */
    val endContentSize: Dp

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
    fun minHeight(minHeight: Dp): SegmentItemDimensionsBuilder

    /**
     * Устанавливает минимальную ширину
     */
    fun minWidth(minWidth: Dp): SegmentItemDimensionsBuilder

    /**
     * Устанавливает отступ в начале
     */
    fun paddingStart(paddingStart: Dp): SegmentItemDimensionsBuilder

    /**
     * Устанавливает отступ в конце
     */
    fun paddingEnd(paddingEnd: Dp): SegmentItemDimensionsBuilder

    /**
     * Устанавливает отступ контента в начале
     */
    fun startContentPadding(startContentPadding: Dp): SegmentItemDimensionsBuilder

    /**
     * Устанавливает отступ контента в конце
     */
    fun endContentPadding(endContentPadding: Dp): SegmentItemDimensionsBuilder

    /**
     * Устанавливает отступ дополнительного текста
     */
    fun valueMargin(valueMargin: Dp): SegmentItemDimensionsBuilder

    /**
     * Устанавливает размер иконки в начале
     */
    fun startContentSize(startContentSize: Dp): SegmentItemDimensionsBuilder

    /**
     * Устанавливает размер иконки в конце
     */
    fun endContentSize(endContentSize: Dp): SegmentItemDimensionsBuilder

    /**
     * Вернет [SegmentItemDimensions]
     */
    fun build(): SegmentItemDimensions
}

@Immutable
private class DefaultSegmentItemDimensions(
    override val minHeight: Dp,
    override val minWidth: Dp,
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
    override val startContentPadding: Dp,
    override val endContentPadding: Dp,
    override val valueMargin: Dp,
    override val startContentSize: Dp,
    override val endContentSize: Dp,
) : SegmentItemDimensions {

    class Builder : SegmentItemDimensionsBuilder {
        private var minHeight: Dp? = null
        private var minWidth: Dp? = null
        private var paddingStart: Dp? = null
        private var paddingEnd: Dp? = null
        private var startContentPadding: Dp? = null
        private var endContentPadding: Dp? = null
        private var valueMargin: Dp? = null
        private var startContentSize: Dp? = null
        private var endContentSize: Dp? = null

        override fun minHeight(minHeight: Dp) = apply {
            this.minHeight = minHeight
        }

        override fun minWidth(minWidth: Dp) = apply {
            this.minWidth = minWidth
        }

        override fun paddingStart(paddingStart: Dp) = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: Dp) = apply {
            this.paddingEnd = paddingEnd
        }

        override fun startContentPadding(startContentPadding: Dp) = apply {
            this.startContentPadding = startContentPadding
        }

        override fun endContentPadding(endContentPadding: Dp) = apply {
            this.endContentPadding = endContentPadding
        }

        override fun valueMargin(valueMargin: Dp) = apply {
            this.valueMargin = valueMargin
        }

        override fun startContentSize(startContentSize: Dp) = apply {
            this.startContentSize = startContentSize
        }

        override fun endContentSize(endContentSize: Dp) = apply {
            this.endContentSize = endContentSize
        }

        override fun build(): SegmentItemDimensions {
            return DefaultSegmentItemDimensions(
                minHeight = minHeight ?: 64.dp,
                minWidth = minWidth ?: 110.dp,
                paddingStart = paddingStart ?: 16.dp,
                paddingEnd = paddingEnd ?: 16.dp,
                startContentPadding = startContentPadding ?: 4.dp,
                endContentPadding = endContentPadding ?: 4.dp,
                valueMargin = valueMargin ?: 4.dp,
                startContentSize = startContentSize ?: 24.dp,
                endContentSize = endContentSize ?: 24.dp,
            )
        }
    }
}
