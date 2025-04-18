package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
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
     * Устанавливает цвет дополнительного текста компонента [contentStartColor]
     * @see ChipColors.contentStartColor
     * @see InteractiveColor
     */
    fun contentStartColor(contentStartColor: InteractiveColor): ChipColorsBuilder

    /**
     * Устанавливает цвет дополнительного текста компонента [valueColor]
     * @see ChipColors.contentStartColor
     * @see InteractiveColor
     */
    fun contentStartColor(valueColor: Color): ChipColorsBuilder =
        contentStartColor(valueColor.asInteractive())

    /**
     * Устанавливает цвет иконки компонента [contentEndColor]
     * @see ChipColors.contentEndColor
     * @see InteractiveColor
     */
    fun contentEndColor(contentEndColor: InteractiveColor): ChipColorsBuilder

    /**
     * Устанавливает цвет иконки компонента [contentEndColor]
     * @see ChipColors.contentEndColor
     * @see InteractiveColor
     */
    fun contentEndColor(contentEndColor: Color): ChipColorsBuilder =
        contentEndColor(contentEndColor.asInteractive())

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
     * Устанавливает размеры и отступы контента компонента при помощи [builder]
     * @see ChipStyle.dimensions
     * @see ChipDimensions
     */
    @Composable
    fun dimensions(builder: @Composable ChipDimensionsBuilder.() -> Unit): ChipStyleBuilder

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
     * @see ChipDimensions
     */
    val dimensions: ChipDimensions

    /**
     * Значение прозрачности выключенного компонента
     */
    val disableAlpha: Float

    companion object {

        /**
         * Возвращает экземпляр [ChipStyleBuilder]
         */
        fun builder(receiver: Any? = null): ChipStyleBuilder = DefaultChipStyle.Builder()
    }
}

/**
 * Размеры и отступы компонента Chip
 */
@Stable
interface ChipDimensions {

    /**
     * Высота компонента
     */
    val height: Dp

    /**
     * Размер контента в начале
     */
    val contentStartSize: Dp

    /**
     * Размер контента в окнце
     */
    val contentEndSize: Dp

    /**
     * Отступ от контента в начале
     */
    val contentStartPadding: Dp

    /**
     * Отступ от контента в конце
     */
    val contentEndPadding: Dp

    /**
     * Отступ в начале
     */
    val paddingStart: Dp

    /**
     * Отступ в конце
     */
    val paddingEnd: Dp

    companion object {

        /**
         * Возвращает экземпляр [ChipDimensionsBuilder]
         */
        fun builder(): ChipDimensionsBuilder = DefaultChipDimensions.Builder()
    }
}

/**
 * Билдер размеров для Chip
 */
interface ChipDimensionsBuilder {

    /**
     * Устанавливает высоту компонента
     */
    fun height(height: Dp): ChipDimensionsBuilder

    /**
     * Устанавливает размер контента в начале
     */
    fun contentStartSize(contentStartSize: Dp): ChipDimensionsBuilder

    /**
     * Устанавливает размер контента в конце
     */
    fun contentEndSize(contentEndSize: Dp): ChipDimensionsBuilder

    /**
     * Устанавливает отступ от контента в начале
     */
    fun contentStartPadding(contentStartPadding: Dp): ChipDimensionsBuilder

    /**
     * Устанавливает отступ от контента в конце
     */
    fun contentEndPadding(contentEndPadding: Dp): ChipDimensionsBuilder

    /**
     * Устанавливает отступ в начале
     */
    fun paddingStart(paddingStart: Dp): ChipDimensionsBuilder

    /**
     * Устанавливает отступ в конце
     */
    fun paddingEnd(paddingEnd: Dp): ChipDimensionsBuilder

    /**
     * Возвращает экземпляр [ChipDimensions]
     */
    fun build(): ChipDimensions
}

private class DefaultChipDimensions(
    override val height: Dp,
    override val contentStartSize: Dp,
    override val contentEndSize: Dp,
    override val contentStartPadding: Dp,
    override val contentEndPadding: Dp,
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
) : ChipDimensions {

    class Builder : ChipDimensionsBuilder {
        private var height: Dp? = null
        private var contentStartSize: Dp? = null
        private var contentEndSize: Dp? = null
        private var contentStartPadding: Dp? = null
        private var contentEndPadding: Dp? = null
        private var paddingStart: Dp? = null
        private var paddingEnd: Dp? = null
        override fun height(height: Dp) = apply {
            this.height = height
        }

        override fun contentStartSize(contentStartSize: Dp) = apply {
            this.contentStartSize = contentStartSize
        }

        override fun contentEndSize(contentEndSize: Dp) = apply {
            this.contentEndSize = contentEndSize
        }

        override fun contentStartPadding(contentStartPadding: Dp) = apply {
            this.contentStartPadding = contentStartPadding
        }

        override fun contentEndPadding(contentEndPadding: Dp) = apply {
            this.contentEndPadding = contentEndPadding
        }

        override fun paddingStart(paddingStart: Dp) = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: Dp) = apply {
            this.paddingEnd = paddingEnd
        }

        override fun build(): ChipDimensions {
            return DefaultChipDimensions(
                height = height ?: 48.dp,
                contentStartSize = contentStartSize ?: 24.dp,
                contentEndSize = contentEndSize ?: 24.dp,
                contentStartPadding = contentStartPadding ?: 16.dp,
                contentEndPadding = contentEndPadding ?: 16.dp,
                paddingStart = paddingStart ?: 16.dp,
                paddingEnd = paddingEnd ?: 16.dp,
            )
        }
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
    val contentStartColor: InteractiveColor

    /**
     * Цвет контента в конце (например, иконки)
     * @see InteractiveColor
     */
    val contentEndColor: InteractiveColor

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
    override val contentStartColor: InteractiveColor,
    override val contentEndColor: InteractiveColor,
) : ChipColors {

    class Builder : ChipColorsBuilder {
        private var contentColor: InteractiveColor? = null
        private var backgroundColor: InteractiveColor? = null
        private var labelColor: InteractiveColor? = null
        private var contentStartColor: InteractiveColor? = null
        private var contentEndColor: InteractiveColor? = null

        override fun contentColor(contentColor: InteractiveColor) = apply {
            this.contentColor = contentColor
        }

        override fun backgroundColor(backgroundColor: InteractiveColor) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun labelColor(labelColor: InteractiveColor) = apply {
            this.labelColor = labelColor
        }

        override fun contentStartColor(contentStartColor: InteractiveColor) = apply {
            this.contentStartColor = contentStartColor
        }

        override fun contentEndColor(contentEndColor: InteractiveColor) = apply {
            this.contentEndColor = contentEndColor
        }

        override fun build(): ChipColors {
            val contentColor = contentColor ?: Color.Black.asInteractive()
            return DefaultChipColors(
                contentColor = contentColor,
                backgroundColor = backgroundColor ?: Color.White.asInteractive(),
                labelColor = labelColor ?: contentColor,
                contentStartColor = contentStartColor ?: contentColor,
                contentEndColor = contentEndColor ?: contentColor,
            )
        }
    }
}

@Immutable
internal class DefaultChipStyle(
    override val shape: CornerBasedShape,
    override val colors: ChipColors,
    override val labelStyle: TextStyle,
    override val dimensions: ChipDimensions,
    override val disableAlpha: Float,
) : ChipStyle {

    @Stable
    class Builder : ChipStyleBuilder {
        private var shape: CornerBasedShape? = null
        private var colorsBuilder: ChipColorsBuilder = ChipColors.builder()
        private var labelStyle: TextStyle? = null
        private var dimensionsBuilder: ChipDimensionsBuilder = ChipDimensions.builder()
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

        @Composable
        override fun dimensions(builder: @Composable ChipDimensionsBuilder.() -> Unit) = apply {
            this.dimensionsBuilder.builder()
        }

        override fun disableAlpha(disableAlpha: Float) = apply {
            this.disableAlpha = disableAlpha
        }

        override fun style(): ChipStyle {
            return DefaultChipStyle(
                shape = shape ?: RoundedCornerShape(25),
                colors = colorsBuilder.build(),
                labelStyle = labelStyle ?: TextStyle.Default,
                dimensions = dimensionsBuilder.build(),
                disableAlpha = disableAlpha ?: DISABLED_BUTTON_ALPHA,
            )
        }
    }
}

private const val DISABLED_BUTTON_ALPHA = 0.4f
