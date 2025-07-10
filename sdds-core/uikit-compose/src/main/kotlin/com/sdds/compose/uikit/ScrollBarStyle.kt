package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [ScrollBarStyle] для компонента [ScrollBar]
 */
val LocalScrollBarStyle: ProvidableCompositionLocal<ScrollBarStyle> =
    compositionLocalOf(structuralEqualityPolicy()) { ScrollBarStyle.builder().style() }

/**
 * Стиль компонента
 */
@Immutable
interface ScrollBarStyle : Style {
    /**
     * Форма
     */
    val shape: Shape

    /**
     * Цвета компонента
     */
    val colors: ScrollBarColors

    /**
     * Размеры и отступы компонента
     */
    val dimensions: ScrollBarDimensions

    /**
     * Коэффциент увеличения ширины scrollbar при ховере
     */
    val hoverExpandFactor: Float

    companion object {
        /**
         * Возвращает экземпляр [ScrollBarStyleBuilder]
         */
        fun builder(receiver: Any? = null): ScrollBarStyleBuilder =
            DefaultScrollBarStyle.Builder()
    }
}

/**
 * Билдер стиля компонента
 */
interface ScrollBarStyleBuilder : StyleBuilder<ScrollBarStyle> {
    /**
     * Устанавливает форму
     */
    fun shape(shape: Shape): ScrollBarStyleBuilder

    /**
     * Устанавливает цвета компонента
     */
    @Composable
    fun colors(builder: @Composable ScrollBarColorsBuilder.() -> Unit): ScrollBarStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента
     */
    @Composable
    fun dimensions(builder: @Composable ScrollBarDimensionsBuilder.() -> Unit): ScrollBarStyleBuilder

    /**
     * Устанавливает коэффциент увеличения ширины scrollbar при ховере
     */
    fun hoverExpandFactor(hoverExpandFactor: Float): ScrollBarStyleBuilder
}

private data class DefaultScrollBarStyle(
    override val shape: Shape,
    override val colors: ScrollBarColors,
    override val dimensions: ScrollBarDimensions,
    override val hoverExpandFactor: Float,
) : ScrollBarStyle {
    class Builder : ScrollBarStyleBuilder {
        private var shape: Shape? = null

        private val colorsBuilder: ScrollBarColorsBuilder = ScrollBarColors.builder()

        private val dimensionsBuilder: ScrollBarDimensionsBuilder = ScrollBarDimensions.builder()

        private var hoverExpandFactor: Float? = null

        override fun shape(shape: Shape): ScrollBarStyleBuilder = apply { this.shape = shape }

        @Composable
        override fun colors(builder: @Composable ScrollBarColorsBuilder.() -> Unit):
            ScrollBarStyleBuilder = apply { this.colorsBuilder.builder() }

        @Composable
        override fun dimensions(builder: @Composable ScrollBarDimensionsBuilder.() -> Unit):
            ScrollBarStyleBuilder = apply { this.dimensionsBuilder.builder() }

        override fun hoverExpandFactor(hoverExpandFactor: Float): ScrollBarStyleBuilder =
            apply { this.hoverExpandFactor = hoverExpandFactor }

        override fun style(): ScrollBarStyle = DefaultScrollBarStyle(
            shape = shape ?: CircleShape,
            colors = colorsBuilder.build(),
            dimensions = dimensionsBuilder.build(),
            hoverExpandFactor = hoverExpandFactor ?: 2.0f,
        )
    }
}

/**
 * Цвета компонента
 */
@Immutable
interface ScrollBarColors {
    /**
     * Цвет
     */
    val thumbColor: InteractiveColor

    /**
     * Цвет
     */
    val trackColor: InteractiveColor

    companion object {
        /**
         * Возвращает экземпляр [ScrollBarColorsBuilder]
         */
        fun builder(): ScrollBarColorsBuilder = DefaultScrollBarColors.Builder()
    }
}

/**
 * Билдер для [ScrollBarColors]
 */
interface ScrollBarColorsBuilder {
    /**
     * Устанавливает цвет [thumbColor]
     */
    fun thumbColor(thumbColor: InteractiveColor): ScrollBarColorsBuilder

    /**
     * Устанавливает цвет [thumbColor]
     */
    fun thumbColor(thumbColor: Color): ScrollBarColorsBuilder =
        thumbColor(thumbColor.asInteractive())

    /**
     * Устанавливает цвет [trackColor]
     */
    fun trackColor(trackColor: InteractiveColor): ScrollBarColorsBuilder

    /**
     * Устанавливает цвет [trackColor]
     */
    fun trackColor(trackColor: Color): ScrollBarColorsBuilder =
        trackColor(trackColor.asInteractive())

    /**
     * Вернёт [ScrollBarColors]
     */
    fun build(): ScrollBarColors
}

private data class DefaultScrollBarColors(
    override val thumbColor: InteractiveColor,
    override val trackColor: InteractiveColor,
) : ScrollBarColors {
    class Builder : ScrollBarColorsBuilder {
        private var thumbColor: InteractiveColor? = null

        private var trackColor: InteractiveColor? = null

        override fun thumbColor(thumbColor: InteractiveColor): ScrollBarColorsBuilder = apply {
            this.thumbColor = thumbColor
        }

        override fun trackColor(trackColor: InteractiveColor): ScrollBarColorsBuilder = apply {
            this.trackColor = trackColor
        }

        override fun build(): ScrollBarColors = DefaultScrollBarColors(
            thumbColor = thumbColor ?: Color.DarkGray.asInteractive(),
            trackColor = trackColor ?: Color.LightGray.asInteractive(),
        )
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface ScrollBarDimensions {
    /**
     * Отступ
     */
    val width: Dp

    companion object {
        /**
         * Возвращает экземпляр [ScrollBarDimensionsBuilder]
         */
        fun builder(): ScrollBarDimensionsBuilder = DefaultScrollBarDimensions.Builder()
    }
}

/**
 * Билдер для [ScrollBarDimensions]
 */
interface ScrollBarDimensionsBuilder {
    /**
     * Устанавливает [width]
     */
    fun width(width: Dp): ScrollBarDimensionsBuilder

    /**
     * Вернёт [ScrollBarDimensions]
     */
    fun build(): ScrollBarDimensions
}

private data class DefaultScrollBarDimensions(
    override val width: Dp,
) : ScrollBarDimensions {
    class Builder : ScrollBarDimensionsBuilder {
        private var width: Dp? = null

        override fun width(width: Dp): ScrollBarDimensionsBuilder = apply { this.width = width }

        override fun build(): ScrollBarDimensions = DefaultScrollBarDimensions(
            width = width ?: 4.dp,
        )
    }
}
