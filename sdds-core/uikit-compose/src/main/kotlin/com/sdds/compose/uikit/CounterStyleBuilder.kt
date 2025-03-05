package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
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
 * CompositionLocal c [CounterStyle] для компонента [Counter]
 */
val LocalCounterStyle = compositionLocalOf { CounterStyle.counterBuilder().style() }

/**
 * Возвращает экземпляр [CounterStyleBuilder]
 */
fun CounterStyle.Companion.counterBuilder(receiver: Any? = null): CounterStyleBuilder =
    CounterStyleBuilderImpl(receiver)

/**
 * Builder стиля [Counter]
 */
interface CounterStyleBuilder : StyleBuilder<CounterStyle> {

    /**
     * Устанавливает форму компонента [shape]
     * @see CounterStyle.shape
     */
    fun shape(shape: CornerBasedShape): CounterStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder]
     * @see CounterStyle.colors
     * @see [CounterColorsBuilder]
     */
    @Composable
    fun colors(builder: @Composable CounterColorsBuilder.() -> Unit): CounterStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     * @see CounterStyle.dimensions
     * @see [CounterDimensionsBuilder]
     */
    @Composable
    fun dimensions(builder: @Composable CounterDimensionsBuilder.() -> Unit): CounterStyleBuilder

    /**
     * Устанавливает стиль основного текста компонента [textStyle]
     * @see CounterStyle.textStyle
     */
    fun textStyle(textStyle: TextStyle): CounterStyleBuilder
}

/**
 * Builder для [CounterColors].
 */
interface CounterColorsBuilder {

    /**
     * Устанавливает цвет фона компонента [backgroundColor]
     * @see CounterColors.backgroundColor
     * @see InteractiveColor
     */
    fun backgroundColor(bColor: InteractiveColor): CounterColorsBuilder

    /**
     * Устанавливает цвет фона компонента [backgroundColor]
     * @see CounterColors.backgroundColor
     */
    fun backgroundColor(bColor: Color): CounterColorsBuilder =
        backgroundColor(bColor.asInteractive())

    /**
     * Устанавливает цвет фона компонента [textColor]
     * @see CounterColors.textColor
     * @see InteractiveColor
     */
    fun textColor(tColor: InteractiveColor): CounterColorsBuilder

    /**
     * Устанавливает цвет фона компонента [textColor]
     * @see CounterColors.textColor
     */
    fun textColor(tColor: Color): CounterColorsBuilder =
        textColor(tColor.asInteractive())

    /**
     * Возвращает готовый экземпляр [CounterColors]
     */
    fun build(): CounterColors

    companion object {

        /**
         * Вернет экземпляр билдера [CounterColorsBuilder]
         */
        fun builder(): CounterColorsBuilder = DefaultCounterColors.Builder()
    }
}

/**
 * Builder для [CounterDimensions].
 */
interface CounterDimensionsBuilder {

    /**
     * Устанавливает ширину компонента
     */
    fun minWidth(width: Dp): CounterDimensionsBuilder

    /**
     * Устанавливает высоту компонента
     */
    fun minHeight(height: Dp): CounterDimensionsBuilder

    /**
     * Устанавливает отступ слева
     */
    fun paddingStart(pStart: Dp): CounterDimensionsBuilder

    /**
     * Устанавливает отступ справа
     */
    fun paddingEnd(pEnd: Dp): CounterDimensionsBuilder

    /**
     * Возвращает готовый экземпляр [CounterDimensions]
     */
    fun build(): CounterDimensions

    companion object {

        /**
         * Вернет экземпляр билдера [CounterDimensionsBuilder]
         */
        fun builder(): CounterDimensionsBuilder = DefaultCounterDimensions.Builder()
    }
}

@Immutable
private class DefaultCounterDimensions(
    override val minWidth: Dp,
    override val minHeight: Dp,
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
) : CounterDimensions {
    class Builder : CounterDimensionsBuilder {
        private var minWidth: Dp? = null
        private var minHeight: Dp? = null
        private var paddingStart: Dp? = null
        private var paddingEnd: Dp? = null
        private var paddingTop: Dp? = null
        private var paddingBottom: Dp? = null

        override fun minWidth(width: Dp): CounterDimensionsBuilder = apply {
            this.minWidth = width
        }

        override fun minHeight(height: Dp): CounterDimensionsBuilder = apply {
            this.minHeight = height
        }

        override fun paddingStart(pStart: Dp): CounterDimensionsBuilder = apply {
            this.paddingStart = pStart
        }

        override fun paddingEnd(pEnd: Dp): CounterDimensionsBuilder = apply {
            this.paddingEnd = pEnd
        }

        override fun build(): CounterDimensions {
            return DefaultCounterDimensions(
                minWidth = minWidth ?: 28.dp,
                minHeight = minHeight ?: 28.dp,
                paddingStart = paddingStart ?: 10.dp,
                paddingEnd = paddingEnd ?: 10.dp,
            )
        }
    }
}

@Immutable
private class DefaultCounterColors(
    override val backgroundColor: InteractiveColor,
    override val textColor: InteractiveColor,
) : CounterColors {
    class Builder : CounterColorsBuilder {
        private var backgroundColor: InteractiveColor? = null
        private var textColor: InteractiveColor? = null

        override fun backgroundColor(bColor: InteractiveColor): CounterColorsBuilder = apply {
            this.backgroundColor = bColor
        }

        override fun textColor(tColor: InteractiveColor): CounterColorsBuilder = apply {
            this.textColor = tColor
        }

        override fun build(): CounterColors {
            return DefaultCounterColors(
                backgroundColor = backgroundColor ?: Color.Black.asInteractive(),
                textColor = textColor ?: Color.White.asInteractive(),
            )
        }
    }
}

@Immutable
private class DefaultCounterStyle(
    override val colors: CounterColors,
    override val dimensions: CounterDimensions,
    override val shape: CornerBasedShape,
    override val textStyle: TextStyle,
    override val disableAlpha: Float,
) : CounterStyle

private class CounterStyleBuilderImpl(receiver: Any?) : CounterStyleBuilder {

    private var colorsBuilder: CounterColorsBuilder = CounterColorsBuilder.builder()
    private var dimensionsBuilder: CounterDimensionsBuilder = CounterDimensionsBuilder.builder()
    private var shape: CornerBasedShape? = null
    private var textStyle: TextStyle? = null
    private var disableAlpha: Float? = null

    override fun shape(shape: CornerBasedShape): CounterStyleBuilder = apply {
        this.shape = shape
    }

    @Composable
    override fun colors(
        builder:
        @Composable()
        (CounterColorsBuilder.() -> Unit),
    ): CounterStyleBuilder = apply {
        this.colorsBuilder.builder()
    }

    @Composable
    override fun dimensions(
        builder:
        @Composable()
        (CounterDimensionsBuilder.() -> Unit),
    ): CounterStyleBuilder = apply {
        this.dimensionsBuilder.builder()
    }

    override fun textStyle(textStyle: TextStyle): CounterStyleBuilder = apply {
        this.textStyle = textStyle
    }

    override fun style(): CounterStyle {
        return DefaultCounterStyle(
            colors = colorsBuilder.build(),
            dimensions = dimensionsBuilder.build(),
            shape = shape ?: RoundedCornerShape(50),
            textStyle = textStyle ?: TextStyle.Default,
            disableAlpha = disableAlpha ?: DISABLE_COUNTER_ALPHA,
        )
    }
}

private const val DISABLE_COUNTER_ALPHA = 0.4f
