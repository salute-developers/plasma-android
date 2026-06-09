package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.api.info.compose.ConfigName
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [CounterStyle] для компонента [Counter]
 */
val LocalCounterStyle = compositionLocalOf { CounterStyle.builder().style() }

/**
 * Builder стиля [Counter]
 */
@ApiInfo
interface CounterStyleBuilder : StyleBuilder<CounterStyle> {

    /**
     * Устанавливает форму компонента [shape]
     * @see CounterStyle.shape
     */
    fun shape(shape: CornerBasedShape): CounterStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает формы компонента [shape]
     * @see CounterStyle.shape
     */
    fun shape(shape: StatefulValue<CornerBasedShape>): CounterStyleBuilder

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
    @ConfigName(configName = "labelStyle")
    fun textStyle(textStyle: TextStyle): CounterStyleBuilder =
        textStyle(textStyle.asStatefulValue())

    /**
     * Устанавливает стили основного текста компонента [textStyle]
     * @see CounterStyle.textStyle
     */
    @ConfigName(configName = "labelStyle")
    fun textStyle(textStyle: StatefulValue<TextStyle>): CounterStyleBuilder
}

/**
 * Builder для [CounterColors].
 */
interface CounterColorsBuilder {

    /**
     * Устанавливает цвет фона компонента [backgroundBrush]
     * @see CounterColors.backgroundColor
     * @see InteractiveColor
     */
    fun backgroundColor(bColor: InteractiveColor): CounterColorsBuilder =
        backgroundBrush(bColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона компонента [backgroundBrush]
     * @see CounterColors.backgroundColor
     */
    fun backgroundColor(bColor: Color): CounterColorsBuilder =
        backgroundBrush(bColor.asStatefulBrush())

    /**
     * Устанавливает кисть фона компонента [backgroundBrush]
     * @see CounterColors.backgroundColor
     */
    fun backgroundBrush(bColor: Brush): CounterColorsBuilder =
        backgroundBrush(bColor.asStatefulValue())

    /**
     * Устанавливает кисти фона компонента [brush]
     */
    fun backgroundBrush(brush: StatefulValue<Brush>): CounterColorsBuilder

    /**
     * Устанавливает цвет текста компонента [textBrush]
     * @see CounterColors.textColor
     * @see InteractiveColor
     */
    fun textColor(tColor: InteractiveColor): CounterColorsBuilder =
        textBrush(tColor.asStatefulBrush())

    /**
     * Устанавливает цвет текста компонента [textBrush]
     * @see CounterColors.textColor
     */
    fun textColor(tColor: Color): CounterColorsBuilder =
        textBrush(tColor.asStatefulBrush())

    /**
     * Устанавливает ксить текста компонента [brush]
     */
    fun textBrush(brush: Brush): CounterColorsBuilder =
        textBrush(brush.asStatefulValue())

    /**
     * Устанавливает ксити текста компонента [brush]
     */
    fun textBrush(brush: StatefulValue<Brush>): CounterColorsBuilder

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
    fun minWidth(width: Dp): CounterDimensionsBuilder =
        minWidth(width.asStatefulValue())

    /**
     * Устанавливает ширину компонента
     */
    fun minWidth(width: StatefulValue<Dp>): CounterDimensionsBuilder

    /**
     * Устанавливает высоту компонента
     */
    fun minHeight(height: Dp): CounterDimensionsBuilder =
        minHeight(height.asStatefulValue())

    /**
     * Устанавливает высоту компонента
     */
    fun minHeight(height: StatefulValue<Dp>): CounterDimensionsBuilder

    /**
     * Устанавливает отступ слева
     */
    @ConfigName(configName = "paddingLeft")
    fun paddingStart(pStart: Dp): CounterDimensionsBuilder =
        paddingStart(pStart.asStatefulValue())

    /**
     * Устанавливает отступ слева
     */
    @ConfigName(configName = "paddingLeft")
    fun paddingStart(pStart: StatefulValue<Dp>): CounterDimensionsBuilder

    /**
     * Устанавливает отступ справа
     */
    @ConfigName(configName = "paddingRight")
    fun paddingEnd(pEnd: Dp): CounterDimensionsBuilder =
        paddingEnd(pEnd.asStatefulValue())

    /**
     * Устанавливает отступ справа
     */
    @ConfigName(configName = "paddingRight")
    fun paddingEnd(pEnd: StatefulValue<Dp>): CounterDimensionsBuilder

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
    override val minWidthValues: StatefulValue<Dp>,
    override val minHeightValues: StatefulValue<Dp>,
    override val paddingStartValues: StatefulValue<Dp>,
    override val paddingEndValues: StatefulValue<Dp>,
) : CounterDimensions {

    @Deprecated("use minWidthValues", ReplaceWith("minWidthValues"))
    override val minWidth: Dp = minWidthValues.getDefaultValue()

    @Deprecated("use minHeightValues", ReplaceWith("minHeightValues"))
    override val minHeight: Dp = minHeightValues.getDefaultValue()

    @Deprecated("use paddingStartValues", ReplaceWith("paddingStartValues"))
    override val paddingStart: Dp = paddingStartValues.getDefaultValue()

    @Deprecated("use paddingEndValues", ReplaceWith("paddingEndValues"))
    override val paddingEnd: Dp = paddingEndValues.getDefaultValue()
    class Builder : CounterDimensionsBuilder {
        private var minWidthValues: StatefulValue<Dp>? = null
        private var minHeightValues: StatefulValue<Dp>? = null
        private var paddingStartValues: StatefulValue<Dp>? = null
        private var paddingEndValues: StatefulValue<Dp>? = null

        override fun minWidth(width: StatefulValue<Dp>): CounterDimensionsBuilder = apply {
            this.minWidthValues = width
        }

        override fun minHeight(height: StatefulValue<Dp>): CounterDimensionsBuilder = apply {
            this.minHeightValues = height
        }

        override fun paddingStart(pStart: StatefulValue<Dp>): CounterDimensionsBuilder = apply {
            this.paddingStartValues = pStart
        }

        override fun paddingEnd(pEnd: StatefulValue<Dp>): CounterDimensionsBuilder = apply {
            this.paddingEndValues = pEnd
        }

        override fun build(): CounterDimensions {
            return DefaultCounterDimensions(
                minWidthValues = minWidthValues ?: 28.dp.asStatefulValue(),
                minHeightValues = minHeightValues ?: 28.dp.asStatefulValue(),
                paddingStartValues = paddingStartValues ?: 10.dp.asStatefulValue(),
                paddingEndValues = paddingEndValues ?: 10.dp.asStatefulValue(),
            )
        }
    }
}

@Immutable
private class DefaultCounterColors(
    override val backgroundBrush: StatefulValue<Brush>,
    override val textBrush: StatefulValue<Brush>,
) : CounterColors {

    @Deprecated("Use backgroundBrush")
    override val backgroundColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use textBrush")
    override val textColor: InteractiveColor = Color.Transparent.asInteractive()

    class Builder : CounterColorsBuilder {
        private var backgroundColor: StatefulValue<Brush>? = null
        private var textColor: StatefulValue<Brush>? = null

        override fun backgroundBrush(brush: StatefulValue<Brush>) = apply {
            this.backgroundColor = brush
        }

        override fun textBrush(brush: StatefulValue<Brush>) = apply {
            this.textColor = brush
        }

        override fun build(): CounterColors {
            return DefaultCounterColors(
                backgroundBrush = backgroundColor ?: Color.Black.asStatefulBrush(),
                textBrush = textColor ?: Color.White.asStatefulBrush(),
            )
        }
    }
}

@Immutable
internal class DefaultCounterStyle(
    override val colors: CounterColors,
    override val dimensions: CounterDimensions,
    override val textStyles: StatefulValue<TextStyle>,
    override val disableAlpha: Float,
    override val shapes: StatefulValue<CornerBasedShape>,
) : CounterStyle {
    @Deprecated("use textStyles", ReplaceWith("textStyles"))
    override val textStyle: TextStyle = textStyles.getDefaultValue()

    @Deprecated("use shapes", ReplaceWith("shapes"))
    override val shape: CornerBasedShape = shapes.getDefaultValue()

    class Builder(receiver: Any?) : CounterStyleBuilder {
        private var colorsBuilder: CounterColorsBuilder = CounterColorsBuilder.builder()
        private var dimensionsBuilder: CounterDimensionsBuilder = CounterDimensionsBuilder.builder()
        private var shapes: StatefulValue<CornerBasedShape>? = null
        private var textStyles: StatefulValue<TextStyle>? = null
        private var disableAlpha: Float? = null

        override fun shape(shape: StatefulValue<CornerBasedShape>): CounterStyleBuilder = apply {
            this.shapes = shape
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

        override fun textStyle(textStyle: StatefulValue<TextStyle>): CounterStyleBuilder = apply {
            this.textStyles = textStyle
        }

        override fun style(): CounterStyle {
            return DefaultCounterStyle(
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                shapes = shapes ?: RoundedCornerShape(50).asStatefulValue(),
                textStyles = textStyles ?: TextStyle.Default.asStatefulValue(),
                disableAlpha = disableAlpha ?: DISABLE_COUNTER_ALPHA,
            )
        }
    }
}

private const val DISABLE_COUNTER_ALPHA = 0.4f
