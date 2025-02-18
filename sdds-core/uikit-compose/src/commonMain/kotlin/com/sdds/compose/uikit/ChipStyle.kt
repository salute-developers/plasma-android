package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [ChipStyle] для компонента [Chip]
 */
val LocalChipStyle = compositionLocalOf { ChipStyle.builder().style() }

/**
 * Builder для [ChipColors].
 */
interface ChipColorsBuilder {

    /**
     * Устанавливает цвет контента компонента [contentColor]
     * @see ChipColors.contentColor
     * @see InteractiveColor
     */
    fun contentColor(contentColor: InteractiveColor): ChipColorsBuilder

    /**
     * Устанавливает цвет контента компонента [contentColor]
     * @see ChipColorsBuilder.contentColor
     * @see ChipColors.contentColor
     * @see InteractiveColor
     */
    fun contentColor(contentColor: Color): ChipColorsBuilder =
        contentColor(contentColor.asInteractive())

    /**
     * Устанавливает цвет фона компонента [backgroundColor]
     * @see ChipColors.backgroundColor
     * @see InteractiveColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): ChipColorsBuilder

    /**
     * Устанавливает цвет фона компонента [backgroundColor]
     * @see ChipColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): ChipColorsBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Устанавливает цвет основного текста компонента [labelColor]
     * @see ChipColors.labelColor
     * @see InteractiveColor
     */
    fun labelColor(labelColor: InteractiveColor): ChipColorsBuilder

    /**
     * Устанавливает цвет основного текста компонента [labelColor]
     * @see ChipColors.labelColor
     * @see InteractiveColor
     */
    fun labelColor(labelColor: Color): ChipColorsBuilder =
        labelColor(labelColor.asInteractive())

    /**
     * Устанавливает цвет дополнительного текста компонента [startContentColor]
     * @see ChipColors.startContentColor
     * @see InteractiveColor
     */
    fun startContentColor(startContentColor: InteractiveColor): ChipColorsBuilder

    /**
     * Устанавливает цвет дополнительного текста компонента [valueColor]
     * @see ChipColors.startContentColor
     * @see InteractiveColor
     */
    fun startContentColor(valueColor: Color): ChipColorsBuilder =
        startContentColor(valueColor.asInteractive())

    /**
     * Устанавливает цвет иконки компонента [endContentColor]
     * @see ChipColors.endContentColor
     * @see InteractiveColor
     */
    fun endContentColor(endContentColor: InteractiveColor): ChipColorsBuilder

    /**
     * Устанавливает цвет иконки компонента [endContentColor]
     * @see ChipColors.endContentColor
     * @see InteractiveColor
     */
    fun endContentColor(endContentColor: Color): ChipColorsBuilder =
        endContentColor(endContentColor.asInteractive())

    /**
     * Возвращает готовый экземпляр [ChipColors]
     */
    fun build(): ChipColors
}

/**
 * Builder стиля [Chip].
 */
@Stable
interface ChipStyleBuilder : StyleBuilder<ChipStyle> {

    /**
     * Устанавливает форму компонента [shape]
     * @see ChipStyle.shape
     */
    fun shape(shape: CornerBasedShape): ChipStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder]
     * @see ChipStyle.colors
     * @see [ChipColorsBuilder]
     */
    @Composable
    fun colors(builder: @Composable ChipColorsBuilder.() -> Unit): ChipStyleBuilder

    /**
     * Устанавливает стиль основного текста компонента [labelStyle]
     * @see ChipStyle.labelStyle
     */
    fun labelStyle(labelStyle: TextStyle): ChipStyleBuilder

    /**
     * Устанавливает размеры и отступы контента компонента [dimensions]
     * @see ChipStyle.dimensions
     * @see Chip.Dimensions
     */
    fun dimensions(dimensions: Chip.Dimensions): ChipStyleBuilder

    /**
     * Устанавливает значение прозрачности выключенной компонента [disableAlpha]
     * @see ChipStyle.disableAlpha
     */
    fun disableAlpha(disableAlpha: Float): ChipStyleBuilder
}

/**
 * Стиль компонента [Chip]
 */
@Stable
interface ChipStyle : Style {

    /**
     * Форма компонента
     * @see CornerBasedShape
     */
    val shape: CornerBasedShape

    /**
     * Цвета компонента
     * @see ChipColors
     */
    val colors: ChipColors

    /**
     * Стиль основного текста компонента
     * @see TextStyle
     */
    val labelStyle: TextStyle

    /**
     * Размеры и отступы контента компонента
     * @see Chip.Dimensions
     */
    val dimensions: Chip.Dimensions

    /**
     * Значение прозрачности выключенного компонента
     */
    val disableAlpha: Float

    companion object {

        /**
         * Возвращает экземпляр [ChipStyleBuilder]
         */
        fun builder(): ChipStyleBuilder = DefaultChipStyle.Builder()
    }
}

/**
 * Цвета компонента [Chip]
 */
@Stable
interface ChipColors {

    /**
     * Цвет контента
     * @see InteractiveColor
     */
    val contentColor: InteractiveColor

    /**
     * Цвет фона
     * @see InteractiveColor
     */
    val backgroundColor: InteractiveColor

    /**
     * Цвет текста
     * @see InteractiveColor
     */
    val labelColor: InteractiveColor

    /**
     * Цвет контента в начале (например, иконки)
     * @see InteractiveColor
     */
    val startContentColor: InteractiveColor

    /**
     * Цвет контента в конце (например, иконки)
     * @see InteractiveColor
     */
    val endContentColor: InteractiveColor

    companion object {

        /**
         * Возвращает экземпляр [ChipColorsBuilder]
         */
        fun builder(): ChipColorsBuilder = DefaultChipColors.Builder()
    }
}

@Immutable
private class DefaultChipColors(
    override val contentColor: InteractiveColor,
    override val backgroundColor: InteractiveColor,
    override val labelColor: InteractiveColor,
    override val startContentColor: InteractiveColor,
    override val endContentColor: InteractiveColor,
) : ChipColors {

    class Builder : ChipColorsBuilder {
        private var contentColor: InteractiveColor? = null
        private var backgroundColor: InteractiveColor? = null
        private var labelColor: InteractiveColor? = null
        private var startContentColor: InteractiveColor? = null
        private var endContentColor: InteractiveColor? = null

        override fun contentColor(contentColor: InteractiveColor) = apply {
            this.contentColor = contentColor
        }

        override fun backgroundColor(backgroundColor: InteractiveColor) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun labelColor(labelColor: InteractiveColor) = apply {
            this.labelColor = labelColor
        }

        override fun startContentColor(startContentColor: InteractiveColor) = apply {
            this.startContentColor = startContentColor
        }

        override fun endContentColor(endContentColor: InteractiveColor) = apply {
            this.endContentColor = endContentColor
        }

        override fun build(): ChipColors {
            val contentColor = contentColor ?: Color.Black.asInteractive()
            return DefaultChipColors(
                contentColor = contentColor,
                backgroundColor = backgroundColor ?: Color.White.asInteractive(),
                labelColor = labelColor ?: contentColor,
                startContentColor = startContentColor ?: contentColor,
                endContentColor = endContentColor ?: contentColor,
            )
        }
    }
}

@Immutable
internal class DefaultChipStyle(
    override val shape: CornerBasedShape,
    override val colors: ChipColors,
    override val labelStyle: TextStyle,
    override val dimensions: Chip.Dimensions,
    override val disableAlpha: Float,
) : ChipStyle {

    @Stable
    class Builder : ChipStyleBuilder {
        private var shape: CornerBasedShape? = null
        private var colorsBuilder: ChipColorsBuilder = ChipColors.builder()
        private var labelStyle: TextStyle? = null
        private var dimensions: Chip.Dimensions? = null
        private var disableAlpha: Float? = null

        override fun shape(shape: CornerBasedShape) = apply {
            this.shape = shape
        }

        @Composable
        override fun colors(builder: @Composable ChipColorsBuilder.() -> Unit): ChipStyleBuilder = apply {
            this.colorsBuilder.builder()
        }

        override fun labelStyle(labelStyle: TextStyle) = apply {
            this.labelStyle = labelStyle
        }

        override fun dimensions(dimensions: Chip.Dimensions) = apply {
            this.dimensions = dimensions
        }

        override fun disableAlpha(disableAlpha: Float) = apply {
            this.disableAlpha = disableAlpha
        }

        override fun style(): ChipStyle {
            return DefaultChipStyle(
                shape = shape ?: RoundedCornerShape(25),
                colors = colorsBuilder.build(),
                labelStyle = labelStyle ?: TextStyle.Default,
                dimensions = dimensions ?: Chip.Dimensions(),
                disableAlpha = disableAlpha ?: DISABLED_BUTTON_ALPHA,
            )
        }
    }
}

private const val DISABLED_BUTTON_ALPHA = 0.4f
