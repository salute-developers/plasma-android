package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder


/**
 * CompositionLocal c [SliderStyle] для компонента [Slider]
 */
val LocalSliderStyle: ProvidableCompositionLocal<SliderStyle> =
    compositionLocalOf(structuralEqualityPolicy()) { SliderStyle.builder().style() }

/**
 * Стиль компонента
 */
@Immutable
interface SliderStyle : Style {
    /**
     * Форма трэка
     */
    val shape: CornerBasedShape

    /**
     * Форма индикатора
     */
    val indicatorShape: CornerBasedShape

    /**
     * Форма ползунка
     */
    val thumbShape: CornerBasedShape

    /**
     * Цвета компонента
     */
    val colors: SliderColors

    /**
     * Размеры и отступы компонента
     */
    val dimensions: SliderDimensions


    companion object {
        /**
         * Возвращает экземпляр [SliderStyleBuilder]
         */
        fun builder(receiver: Any? = null): SliderStyleBuilder =
            DefaultSliderStyle.Builder()
    }
}

/**
 * Билдер стиля компонента
 */
interface SliderStyleBuilder : StyleBuilder<SliderStyle> {
    /**
     * Устанавливает форму трэка
     */
    fun shape(shape: CornerBasedShape): SliderStyleBuilder

    /**
     * Устанавливает форму индикатора
     */
    fun indicatorShape(indicatorShape: CornerBasedShape): SliderStyleBuilder


    /**
     * Устанавливает форму ползунка
     */
    fun thumbShape(thumbShape: CornerBasedShape): SliderStyleBuilder

    /**
     * Устанавливает цвета компонента
     */
    @Composable
    fun colors(builder: @Composable SliderColorsBuilder.() -> Unit): SliderStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента
     */
    @Composable
    fun dimensions(builder: @Composable SliderDimensionsBuilder.() -> Unit): SliderStyleBuilder
}

private data class DefaultSliderStyle(
    override val shape: CornerBasedShape,
    override val indicatorShape: CornerBasedShape,
    override val thumbShape: CornerBasedShape,
    override val colors: SliderColors,
    override val dimensions: SliderDimensions,
) : SliderStyle {
    class Builder : SliderStyleBuilder {
        private var shape: CornerBasedShape? = null
        private var indicatorShape: CornerBasedShape? = null
        private var thumbShape: CornerBasedShape? = null

        private val colorsBuilder: SliderColorsBuilder = SliderColors.builder()

        private val dimensionsBuilder: SliderDimensionsBuilder = SliderDimensions.builder()

        override fun shape(shape: CornerBasedShape): SliderStyleBuilder = apply {
            this.shape = shape
        }

        override fun indicatorShape(indicatorShape: CornerBasedShape): SliderStyleBuilder = apply {
            this.indicatorShape = indicatorShape
        }

        override fun thumbShape(thumbShape: CornerBasedShape): SliderStyleBuilder = apply {
            this.thumbShape = thumbShape
        }

        @Composable
        override fun colors(builder: @Composable SliderColorsBuilder.() -> Unit):
                SliderStyleBuilder = apply { this.colorsBuilder.builder() }

        @Composable
        override fun dimensions(builder: @Composable SliderDimensionsBuilder.() -> Unit):
                SliderStyleBuilder = apply { this.dimensionsBuilder.builder() }


        override fun style(): SliderStyle = DefaultSliderStyle(
            shape = shape ?: CircleShape,
            indicatorShape = indicatorShape ?: CircleShape,
            thumbShape = thumbShape ?: CircleShape,
            colors = colorsBuilder.build(),
            dimensions = dimensionsBuilder.build(),
        )
    }
}

/**
 * Цвета компонента
 */
@Immutable
interface SliderColors {
    /**
     * Цвет ползунка
     */
    val thumbColor: InteractiveColor

    /**
     * Цвет трэка
     */
    val trackColor: InteractiveColor

    /**
     * Цвет (или градиент) индикатора [Slider]
     */
    val indicatorBrush: StatefulValue<Brush>?

    /**
     * Цвет (или градиент) индикатора [Slider]
     */
    val indicatorColor: InteractiveColor

    companion object {
        /**
         * Возвращает экземпляр [SliderColorsBuilder]
         */
        fun builder(): SliderColorsBuilder = DefaultSliderColors.Builder()
    }
}

/**
 * Билдер для [SliderColors]
 */
interface SliderColorsBuilder {
    /**
     * Устанавливает цвет [thumbColor]
     */
    fun thumbColor(thumbColor: InteractiveColor): SliderColorsBuilder

    /**
     * Устанавливает цвет [thumbColor]
     */
    fun thumbColor(thumbColor: Color): SliderColorsBuilder =
        thumbColor(thumbColor.asInteractive())

    /**
     * Устанавливает цвет [trackColor]
     */
    fun trackColor(trackColor: InteractiveColor): SliderColorsBuilder

    /**
     * Устанавливает цвет [trackColor]
     */
    fun trackColor(trackColor: Color): SliderColorsBuilder =
        trackColor(trackColor.asInteractive())

    /**
     * Устанавливает цвет [indicatorColor] индикатора компонента.
     * @see SliderColors.indicatorColor
     */
    fun indicatorColor(indicatorColor: Color): SliderColorsBuilder =
        indicatorColor(indicatorColor.asInteractive())

    /**
     * Устанавливает цвет [indicatorColor] индикатора компонента.
     * @see SliderColors.indicatorColor
     */
    fun indicatorColor(indicatorColor: InteractiveColor): SliderColorsBuilder

    /**
     * Устанавливает цвет (или градиент) [indicatorColor] индикатора компонента.
     * @see SliderColors.indicatorColor
     */
    fun indicatorColor(indicatorColor: StatefulValue<Brush>): SliderColorsBuilder

    /**
     * Вернёт [SliderColors]
     */
    fun build(): SliderColors
}

private data class DefaultSliderColors(
    override val thumbColor: InteractiveColor,
    override val trackColor: InteractiveColor,
    override val indicatorColor: InteractiveColor,
    override val indicatorBrush: StatefulValue<Brush>?,
) : SliderColors {
    class Builder : SliderColorsBuilder {
        private var thumbColor: InteractiveColor? = null
        private var trackColor: InteractiveColor? = null
        private var indicatorColor: InteractiveColor? = null
        private var indicatorBrush: StatefulValue<Brush>? = null

        override fun thumbColor(thumbColor: InteractiveColor): SliderColorsBuilder = apply {
            this.thumbColor = thumbColor
        }

        override fun trackColor(trackColor: InteractiveColor): SliderColorsBuilder = apply {
            this.trackColor = trackColor
        }

        override fun indicatorColor(indicatorColor: InteractiveColor): SliderColorsBuilder = apply {
            this.indicatorColor = indicatorColor
        }

        override fun indicatorColor(indicatorColor: StatefulValue<Brush>): SliderColorsBuilder  = apply {
            this.indicatorBrush = indicatorColor
        }

        override fun build(): SliderColors = DefaultSliderColors(
            thumbColor = thumbColor ?: Color.DarkGray.asInteractive(),
            trackColor = trackColor ?: Color.LightGray.asInteractive(),
            indicatorColor = indicatorColor ?: Color.Green.asInteractive(),
            indicatorBrush = indicatorBrush,
        )
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface SliderDimensions {

    /**
     * Толщина трэка
     */
    val trackThickness: Dp

    /**
     * Толщина индикатора
     */
    val indicatorThickness: Dp

    /**
     * Размер ползунка
     */
    val thumbSize: Dp

    /**
     * Ширина бордера ползунка
     */
    val thumbStrokeWidth: Dp


    companion object {
        /**
         * Возвращает экземпляр [SliderDimensionsBuilder]
         */
        fun builder(): SliderDimensionsBuilder = DefaultSliderDimensions.Builder()
    }
}

/**
 * Билдер для [SliderDimensions]
 */
interface SliderDimensionsBuilder {

    /**
     * Устанавливает толщину трэка [trackThickness]
     */
    fun trackThickness(trackThickness: Dp): SliderDimensionsBuilder

    /**
     * Устанавливает толщину линии индикатора [indicatorThickness]
     */
    fun indicatorThickness(indicatorThickness: Dp): SliderDimensionsBuilder

    /**
     * Устанавливает размер ползунка [thumbSize]
     */
    fun thumbSize(thumbSize: Dp): SliderDimensionsBuilder

    /**
     * Устанавливает ширину бордера у ползунка [thumbStrokeWidth]
     */
    fun thumbStrokeWidth(thumbStrokeWidth: Dp): SliderDimensionsBuilder

    /**
     * Вернёт [SliderDimensions]
     */
    fun build(): SliderDimensions
}

private data class DefaultSliderDimensions(
    override val trackThickness: Dp,
    override val indicatorThickness: Dp,
    override val thumbSize: Dp,
    override val thumbStrokeWidth: Dp
) : SliderDimensions {
    class Builder : SliderDimensionsBuilder {
        private var trackThickness: Dp? = null
        private var indicatorThickness: Dp? = null
        private var thumbSize: Dp? = null
        private var thumbStrokeWidth: Dp? = null

        override fun trackThickness(trackThickness: Dp): SliderDimensionsBuilder = apply {
            this.trackThickness = trackThickness
        }

        override fun indicatorThickness(indicatorThickness: Dp): SliderDimensionsBuilder = apply {
            this.indicatorThickness = indicatorThickness
        }

        override fun thumbSize(thumbSize: Dp): SliderDimensionsBuilder = apply {
            this.thumbSize = thumbSize
        }

        override fun thumbStrokeWidth(thumbStrokeWidth: Dp): SliderDimensionsBuilder = apply {
            this.thumbStrokeWidth = thumbStrokeWidth
        }

        override fun build(): SliderDimensions = DefaultSliderDimensions(
            trackThickness = trackThickness ?: 4.dp,
            indicatorThickness = indicatorThickness ?: 4.dp,
            thumbSize = thumbSize ?: 20.dp,
            thumbStrokeWidth = thumbStrokeWidth ?: 1.dp,
        )
    }
}