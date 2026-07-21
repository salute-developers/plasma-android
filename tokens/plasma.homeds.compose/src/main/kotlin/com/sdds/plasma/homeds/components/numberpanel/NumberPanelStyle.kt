package com.sdds.plasma.homeds.components.numberpanel

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [NumberPanelStyle] для компонента [NumberPanel]
 */
val LocalNumberPanelStyle =
    compositionLocalOf { NumberPanelStyle.builder().style() }

/**
 * Стиль компонента [com.sdds.plasma.homeds.styles.customcomponents.numberpanel.NumberPanel]
 */
@Stable
interface NumberPanelStyle : Style {

    /**
     * Цвета компонента
     * @see NumberPanelColors
     */
    val colors: NumberPanelColors

    /**
     * Размеры компонента
     * @see NumberPanelDimensions
     */
    val dimensions: NumberPanelDimensions

    /**
     * Стили текста целой части числа компонента
     * @see TextStyle
     */
    val valueStyle: StatefulValue<TextStyle>

    /**
     * Стили текста разделительного знака числа компонента
     * @see TextStyle
     */
    val separatorStyle: StatefulValue<TextStyle>

    /**
     * Стили текста целой части числа компонента
     * @see TextStyle
     */
    val fractionStyle: StatefulValue<TextStyle>

    /**
     * Режим отображения значения
     * @see NumberPanelMode
     */
    val mode: NumberPanelMode

    /**
     * Иконка
     */
    @get:DrawableRes
    val icon: Int?

    /**
     * Значение прозрачности выключенного компонента
     */
    val disableAlpha: Float

    companion object {

        /**
         * Возвращает экземпляр [NumberPanelStyleBuilder]
         */
        fun builder(receiver: Any? = null): NumberPanelStyleBuilder = DefaultNumberPanelStyle.Builder()
    }
}

/**
 * Builder стиля [com.sdds.plasma.homeds.styles.customcomponents.numberpanel.NumberPanel].
 */
@Stable
interface NumberPanelStyleBuilder : StyleBuilder<NumberPanelStyle> {

    /**
     * Устанавливает цвета компонента при помощи [builder]
     * @see NumberPanelStyle.colors
     * @see [NumberPanelColorsBuilder]
     */
    @Composable
    fun colors(builder: @Composable NumberPanelColorsBuilder.() -> Unit): NumberPanelStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     * @see NumberPanelStyle.dimensions
     * @see [NumberPanelDimensionsBuilder]
     */
    @Composable
    fun dimensions(builder: @Composable NumberPanelDimensionsBuilder.() -> Unit): NumberPanelStyleBuilder

    /**
     * Устанавливает стиль текста [textStyle] целой части числа компонента.
     * @see NumberPanelStyleBuilder.valueStyle
     */
    fun valueStyle(textStyle: TextStyle): NumberPanelStyleBuilder =
        valueStyle(textStyle.asStatefulValue())

    /**
     * Устанавливает стили текста [textStyle] целой части числа компонента.
     * @see NumberPanelStyle.valueStyle
     */
    fun valueStyle(textStyle: StatefulValue<TextStyle>): NumberPanelStyleBuilder

    /**
     * Устанавливает стиль текста [textStyle] разделительного знака числа компонента.
     * @see NumberPanelStyleBuilder.fractionStyle
     */
    fun separatorStyle(textStyle: TextStyle): NumberPanelStyleBuilder =
        separatorStyle(textStyle.asStatefulValue())

    /**
     * Устанавливает стили текста [textStyle] разделительного знака числа компонента.
     * @see NumberPanelStyle.fractionStyle
     */
    fun separatorStyle(textStyle: StatefulValue<TextStyle>): NumberPanelStyleBuilder

    /**
     * Устанавливает стиль текста [textStyle] дробной части числа компонента.
     * @see NumberPanelStyleBuilder.fractionStyle
     */
    fun fractionStyle(textStyle: TextStyle): NumberPanelStyleBuilder =
        fractionStyle(textStyle.asStatefulValue())

    /**
     * Устанавливает стили текста [textStyle] дробной части числа компонента.
     * @see NumberPanelStyle.fractionStyle
     */
    fun fractionStyle(textStyle: StatefulValue<TextStyle>): NumberPanelStyleBuilder

    /**
     * Устанавливает режим отображения значения компонента.
     * @see NumberPanelStyle.mode
     */
    fun mode(mode: NumberPanelMode): NumberPanelStyleBuilder

    /**
     * Устанавливает идентифактор иконки [icon]
     */
    fun icon(@DrawableRes icon: Int): NumberPanelStyleBuilder

    /**
     * Устанавливает значение прозрачности [disableAlpha] выключенной компонента.
     * @see NumberPanelStyle.disableAlpha
     */
    fun disableAlpha(disableAlpha: Float): NumberPanelStyleBuilder
}

/**
 * Цвета компонента [NumberPanel]
 */
@Stable
interface NumberPanelColors {

    /**
     * Кисти текста целой части числа
     */
    val valueBrush: StatefulValue<Brush>

    /**
     * Кисти текста дробной части числа
     */
    val fractionBrush: StatefulValue<Brush>

    /**
     * Кисти иконки
     */
    val iconBrush: StatefulValue<Brush>

    companion object {

        /**
         * Возвращает экземпляр [NumberPanelColorsBuilder]
         */
        fun builder(): NumberPanelColorsBuilder = DefaultNumberPanelColors.Builder()
    }
}

/**
 * Builder для [NumberPanelColors].
 */
interface NumberPanelColorsBuilder {

    /**
     * Устанавливает цвет [textColor] текста целой части числа компонента
     * @see NumberPanelColorsBuilder.valueColor
     * @see InteractiveColor
     */
    fun valueColor(textColor: InteractiveColor): NumberPanelColorsBuilder =
        valueColor(textColor.asStatefulBrush())

    /**
     * Устанавливает цвет [textColor] текста целой части числа компонента
     * @see NumberPanelColorsBuilder.valueColor
     */
    fun valueColor(textColor: Color): NumberPanelColorsBuilder =
        valueColor(textColor.asStatefulBrush())

    /**
     * Устанавливает цвет [textColor] текста целой части числа компонента
     * @see NumberPanelColorsBuilder.valueColor
     */
    fun valueColor(textColor: Brush): NumberPanelColorsBuilder =
        valueColor(textColor.asStatefulValue())

    /**
     * Устанавливает цвет [textColor] текста целой части числа компонента
     * @see NumberPanelColors.valueBrush
     */
    fun valueColor(textColor: StatefulValue<Brush>): NumberPanelColorsBuilder

    /**
     * Устанавливает цвет [textColor] текста дробной части числа компонента
     * @see NumberPanelColorsBuilder.valueColor
     * @see InteractiveColor
     */
    fun fractionColor(textColor: InteractiveColor): NumberPanelColorsBuilder =
        fractionColor(textColor.asStatefulBrush())

    /**
     * Устанавливает цвет [textColor] текста дробной части числа компонента
     * @see NumberPanelColorsBuilder.valueColor
     */
    fun fractionColor(textColor: Color): NumberPanelColorsBuilder =
        fractionColor(textColor.asStatefulBrush())

    /**
     * Устанавливает цвет [textColor] текста дробной части числа компонента
     * @see NumberPanelColorsBuilder.valueColor
     */
    fun fractionColor(textColor: Brush): NumberPanelColorsBuilder =
        fractionColor(textColor.asStatefulValue())

    /**
     * Устанавливает цвет [textColor] текста дробной части числа компонента
     * @see NumberPanelColors.valueBrush
     */
    fun fractionColor(textColor: StatefulValue<Brush>): NumberPanelColorsBuilder

    /**
     * Устанавливает цвет [iconColor] дополнительного текста целой части числа компонента
     * @see NumberPanelColorsBuilder.iconColor
     * @see InteractiveColor
     */
    fun iconColor(iconColor: InteractiveColor): NumberPanelColorsBuilder =
        iconColor(iconColor.asStatefulBrush())

    /**
     * Устанавливает цвет [iconColor] дополнительного текста целой части числа компонента
     * @see NumberPanelColorsBuilder.iconColor
     */
    fun iconColor(iconColor: Color): NumberPanelColorsBuilder =
        iconColor(iconColor.asStatefulBrush())

    /**
     * Устанавливает цвет [iconColor] дополнительного текста целой части числа компонента
     * @see NumberPanelColorsBuilder.iconColor
     */
    fun iconColor(iconColor: Brush): NumberPanelColorsBuilder =
        iconColor(iconColor.asStatefulValue())

    /**
     * Устанавливает цвет [iconColor] дополнительного текста целой части числа компонента
     * @see NumberPanelColors.iconBrush
     */
    fun iconColor(iconColor: StatefulValue<Brush>): NumberPanelColorsBuilder

    /**
     * Возвращает готовый экземпляр [NumberPanelColors]
     */
    fun build(): NumberPanelColors
}

@Immutable
private class DefaultNumberPanelColors(
    override val valueBrush: StatefulValue<Brush>,
    override val iconBrush: StatefulValue<Brush>,
    override val fractionBrush: StatefulValue<Brush>,
) : NumberPanelColors {

    class Builder : NumberPanelColorsBuilder {
        private var valueBrush: StatefulValue<Brush>? = null
        private var fractionBrush: StatefulValue<Brush>? = null
        private var iconBrush: StatefulValue<Brush>? = null

        override fun valueColor(textColor: StatefulValue<Brush>) = apply {
            this.valueBrush = textColor
        }

        override fun fractionColor(textColor: StatefulValue<Brush>) = apply {
            this.fractionBrush = textColor
        }

        override fun iconColor(iconColor: StatefulValue<Brush>) = apply {
            this.iconBrush = iconColor
        }

        override fun build(): NumberPanelColors {
            val brush = valueBrush ?: Color.Black.asStatefulBrush()
            return DefaultNumberPanelColors(
                valueBrush = brush,
                fractionBrush = fractionBrush ?: brush,
                iconBrush = iconBrush ?: brush,
            )
        }
    }
}

/**
 *  Размеры компонента [NumberPanel]
 */
@Stable
interface NumberPanelDimensions {

    /**
     * Отступ от целой части значения в начале [NumberPanel]
     */
    val valueStartPadding: StatefulValue<Dp>

    /**
     * Отступ от целой части значения в конце [NumberPanel]
     */
    val valueEndPadding: StatefulValue<Dp>

    /**
     * Отступ от дробной части значения в начале [NumberPanel]
     */
    val fractionStartPadding: StatefulValue<Dp>

    /**
     * Отступ от дробной части значения в конце [NumberPanel]
     */
    val fractionEndPadding: StatefulValue<Dp>

    /**
     * Возвращает готовый экземпляр [NumberPanelDimensions]
     */

    companion object {

        /**
         * Возвращает экземпляр [NumberPanelColorsBuilder]
         */
        fun builder(): NumberPanelDimensionsBuilder = DefaultNumberPanelDimensions.Builder()
    }
}

/**
 * Билдер размеров для [NumberPanel]
 */
@Stable
interface NumberPanelDimensionsBuilder {

    /**
     * Устанавливает отступ [padding] от целой части значения в начале [NumberPanel]
     * @see NumberPanelDimensionsBuilder.valueStartPadding
     */
    fun valueStartPadding(padding: Dp): NumberPanelDimensionsBuilder =
        valueStartPadding(padding.asStatefulValue())

    /**
     * Устанавливает отступы [padding] от целой части значения в начале [NumberPanel]
     * @see NumberPanelDimensions.valueStartPadding
     */
    fun valueStartPadding(padding: StatefulValue<Dp>): NumberPanelDimensionsBuilder

    /**
     * Устанавливает отступ [padding] от целой части значения в конце [NumberPanel]
     * @see NumberPanelDimensionsBuilder.valueEndPadding
     */
    fun valueEndPadding(padding: Dp): NumberPanelDimensionsBuilder =
        valueEndPadding(padding.asStatefulValue())

    /**
     * Устанавливает отступы [padding] от целой части значения в конце [NumberPanel]
     * @see NumberPanelDimensions.valueEndPadding
     */
    fun valueEndPadding(padding: StatefulValue<Dp>): NumberPanelDimensionsBuilder

    /**
     * Устанавливает отступ [padding] от дробной части значения в начале [NumberPanel]
     * @see NumberPanelDimensionsBuilder.fractionStartPadding
     */
    fun fractionStartPadding(padding: Dp): NumberPanelDimensionsBuilder =
        fractionStartPadding(padding.asStatefulValue())

    /**
     * Устанавливает отступы [padding] от дробной части значения в начале [NumberPanel]
     * @see NumberPanelDimensions.fractionStartPadding
     */
    fun fractionStartPadding(padding: StatefulValue<Dp>): NumberPanelDimensionsBuilder

    /**
     * Устанавливает отступ [padding] от дробной части значения в конце [NumberPanel]
     * @see NumberPanelDimensionsBuilder.fractionEndPadding
     */
    fun fractionEndPadding(padding: Dp): NumberPanelDimensionsBuilder =
        fractionEndPadding(padding.asStatefulValue())

    /**
     * Устанавливает отступы [padding] от дробной части значения в конце [NumberPanel]
     * @see NumberPanelDimensions.fractionEndPadding
     */
    fun fractionEndPadding(padding: StatefulValue<Dp>): NumberPanelDimensionsBuilder

    /**
     * Возвращает [NumberPanelDimensions]
     */
    fun build(): NumberPanelDimensions

    companion object {

        /**
         * Возвращает экземпляр [NumberPanelDimensionsBuilder]
         */
        fun builder(): NumberPanelDimensionsBuilder = DefaultNumberPanelDimensions.Builder()
    }
}

@Immutable
private class DefaultNumberPanelDimensions(
    override val valueStartPadding: StatefulValue<Dp>,
    override val valueEndPadding: StatefulValue<Dp>,
    override val fractionStartPadding: StatefulValue<Dp>,
    override val fractionEndPadding: StatefulValue<Dp>,

) : NumberPanelDimensions {
    class Builder : NumberPanelDimensionsBuilder {
        private var valueStartPadding: StatefulValue<Dp>? = null
        private var valueEndPadding: StatefulValue<Dp>? = null
        private var fractionStartPadding: StatefulValue<Dp>? = null
        private var fractionEndPadding: StatefulValue<Dp>? = null

        override fun valueStartPadding(padding: StatefulValue<Dp>): NumberPanelDimensionsBuilder = apply {
            this.valueStartPadding = padding
        }

        override fun valueEndPadding(padding: StatefulValue<Dp>): NumberPanelDimensionsBuilder = apply {
            this.valueEndPadding = padding
        }

        override fun fractionStartPadding(padding: StatefulValue<Dp>): NumberPanelDimensionsBuilder = apply {
            this.fractionStartPadding = padding
        }

        override fun fractionEndPadding(padding: StatefulValue<Dp>): NumberPanelDimensionsBuilder = apply {
            this.fractionEndPadding = padding
        }

        override fun build(): NumberPanelDimensions = DefaultNumberPanelDimensions(
            valueStartPadding = valueStartPadding ?: 12.dp.asStatefulValue(),
            valueEndPadding = valueEndPadding ?: 12.dp.asStatefulValue(),
            fractionStartPadding = fractionStartPadding ?: 12.dp.asStatefulValue(),
            fractionEndPadding = fractionEndPadding ?: 12.dp.asStatefulValue(),
        )
    }
}

@Immutable
internal class DefaultNumberPanelStyle(
    override val colors: NumberPanelColors,
    override val dimensions: NumberPanelDimensions,
    override val valueStyle: StatefulValue<TextStyle>,
    override val disableAlpha: Float,
    override val fractionStyle: StatefulValue<TextStyle>,
    override val separatorStyle: StatefulValue<TextStyle>,
    override val mode: NumberPanelMode,
    override val icon: Int?,
) : NumberPanelStyle {
    @Stable
    class Builder : NumberPanelStyleBuilder {
        private var valueStyle: StatefulValue<TextStyle>? = null
        private var separatorStyle: StatefulValue<TextStyle>? = null
        private var fractionStyle: StatefulValue<TextStyle>? = null
        private var colorsBuilder: NumberPanelColorsBuilder = NumberPanelColors.builder()
        private var dimensionsBuilder: NumberPanelDimensionsBuilder = NumberPanelDimensions.builder()
        private var mode: NumberPanelMode? = null
        private var icon: Int? = null
        private var disableAlpha: Float? = null

        @Composable
        override fun colors(builder: @Composable NumberPanelColorsBuilder.() -> Unit): NumberPanelStyleBuilder = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable NumberPanelDimensionsBuilder.() -> Unit) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun valueStyle(textStyle: StatefulValue<TextStyle>) = apply {
            this.valueStyle = textStyle
        }

        override fun separatorStyle(textStyle: StatefulValue<TextStyle>) = apply {
            this.separatorStyle = textStyle
        }

        override fun fractionStyle(textStyle: StatefulValue<TextStyle>) = apply {
            this.fractionStyle = textStyle
        }

        override fun mode(mode: NumberPanelMode) = apply {
            this.mode = mode
        }

        override fun disableAlpha(disableAlpha: Float) = apply {
            this.disableAlpha = disableAlpha
        }

        override fun icon(icon: Int) = apply {
            this.icon = icon
        }

        override fun style(): NumberPanelStyle {
            val style = valueStyle ?: TextStyle.Default.asStatefulValue()
            return DefaultNumberPanelStyle(
                colors = colorsBuilder.build(),
                valueStyle = style,
                separatorStyle = separatorStyle ?: style,
                fractionStyle = fractionStyle ?: style,
                disableAlpha = disableAlpha ?: DISABLED_NUMBER_PANEL_ALPHA,
                mode = mode ?: NumberPanelMode.Temperature,
                dimensions = dimensionsBuilder.build(),
                icon = icon,
            )
        }
    }
}

private const val DISABLED_NUMBER_PANEL_ALPHA = 0.4f
