package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [CircularProgressBarStyle] для компонента [CircularProgressBar]
 */
val LocalCircularProgressBarStyle =
    compositionLocalOf { CircularProgressBarStyle.builder().style() }

/**
 * Стиль компонента [CircularProgressBar]
 */
@Immutable
interface CircularProgressBarStyle : Style {

    /**
     * Цвета компонента
     * @see CircularProgressBarColors
     */
    val colors: CircularProgressBarColors

    /**
     * Размеры и отступы компонента
     * @see CircularProgressBarDimensions
     */
    val dimensions: CircularProgressBarDimensions

    /**
     * Стиль надписи
     */
    @Deprecated("Use valueStyleValues", replaceWith = ReplaceWith("valueStyleValues"))
    val valueStyle: TextStyle

    /**
     * Стиль надписи
     */
    val valueStyleValues: StatefulValue<TextStyle>

    /**
     * Включена ли надпись
     */
    val valueEnabled: Boolean

    /**
     * Включен ли трек прогресса
     */
    val trackEnabled: Boolean

    companion object {

        /**
         * Возвращает экземпляр [CircularProgressBarStyleBuilder]
         */
        fun builder(receiver: Any? = null): CircularProgressBarStyleBuilder =
            DefaultCircularProgressBarStyle.Builder()
    }
}

/**
 * Builder для [CircularProgressBarStyle]
 */
@ApiInfo
interface CircularProgressBarStyleBuilder : StyleBuilder<CircularProgressBarStyle> {

    /**
     * Устанавливает цвета компонента при помощи [builder].
     * @see CircularProgressBarColorsBuilder
     */
    @Composable
    fun colors(builder: @Composable CircularProgressBarColorsBuilder.() -> Unit): CircularProgressBarStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     * @see CircularProgressBarDimensionsBuilder
     */
    @Composable
    fun dimensions(
        builder: @Composable CircularProgressBarDimensionsBuilder.() -> Unit,
    ): CircularProgressBarStyleBuilder

    /**
     * Устанавливает стиль надписи
     */
    fun valueStyle(valueStyle: TextStyle): CircularProgressBarStyleBuilder =
        valueStyle(valueStyle.asStatefulValue())

    /**
     * Устанавливает стили надписи
     */
    fun valueStyle(valueStyle: StatefulValue<TextStyle>): CircularProgressBarStyleBuilder

    /**
     * Включает надпись
     */
    fun valueEnabled(valueEnabled: Boolean): CircularProgressBarStyleBuilder

    /**
     * Включает трек прогресса
     */
    fun trackEnabled(trackEnabled: Boolean): CircularProgressBarStyleBuilder
}

@Immutable
private data class DefaultCircularProgressBarStyle(
    override val colors: CircularProgressBarColors,
    override val dimensions: CircularProgressBarDimensions,
    override val valueEnabled: Boolean,
    override val trackEnabled: Boolean,
    override val valueStyleValues: StatefulValue<TextStyle>,
) : CircularProgressBarStyle {
    @Deprecated("Use valueStyleValues", replaceWith = ReplaceWith("valueStyleValues"))
    override val valueStyle: TextStyle = valueStyleValues.getDefaultValue()
    class Builder : CircularProgressBarStyleBuilder {
        private var valueStyle: StatefulValue<TextStyle>? = null
        private var valueEnabled: Boolean? = null
        private var trackEnabled: Boolean? = null
        private var colorsBuilder = CircularProgressBarColors.builder()
        private val dimensionBuilder = CircularProgressBarDimensions.builder()

        @Composable
        override fun colors(builder: @Composable CircularProgressBarColorsBuilder.() -> Unit) =
            apply {
                this.colorsBuilder.builder()
            }

        @Composable
        override fun dimensions(builder: @Composable (CircularProgressBarDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionBuilder.builder()
            }

        override fun valueStyle(valueStyle: StatefulValue<TextStyle>) = apply {
            this.valueStyle = valueStyle
        }

        override fun valueEnabled(valueEnabled: Boolean) = apply {
            this.valueEnabled = valueEnabled
        }

        override fun trackEnabled(trackEnabled: Boolean) = apply {
            this.trackEnabled = trackEnabled
        }

        override fun style(): CircularProgressBarStyle {
            return DefaultCircularProgressBarStyle(
                colors = colorsBuilder.build(),
                dimensions = dimensionBuilder.build(),
                valueStyleValues = valueStyle ?: TextStyle.Default.asStatefulValue(),
                valueEnabled = valueEnabled ?: true,
                trackEnabled = trackEnabled ?: true,
            )
        }
    }
}

/**
 * Цвета компонента [CircularProgressBar]
 */
@Immutable
interface CircularProgressBarColors {

    /**
     * Цвет или градиент индикатора [CircularProgressBar]
     */
    val indicatorColor: StatefulValue<Brush>

    /**
     * Цвет или градиент трека прогресса [CircularProgressBar]
     */
    val trackColor: StatefulValue<Brush>

    /**
     * Цвет надписи
     */
    val valueColor: StatefulValue<Brush>

    /**
     * Цвет суффикса надписи
     */
    val valueSuffixColor: StatefulValue<Brush>

    companion object {

        /**
         * Возвращает экземпляр [CircularProgressBarColorsBuilder]
         */
        fun builder(): CircularProgressBarColorsBuilder = DefaultCircularProgressBarColors.Builder()
    }
}

/**
 * Builder для [CircularProgressBarColors]
 */
interface CircularProgressBarColorsBuilder {

    /**
     * Устанавливает цвет [indicatorColor] индикатора компонента.
     * @see CircularProgressBarColors.indicatorColor
     */
    fun indicatorColor(indicatorColor: Color): CircularProgressBarColorsBuilder =
        indicatorColor(indicatorColor.asStatefulBrush())

    /**
     * Устанавливает цвет [indicatorColor] индикатора компонента.
     * @see CircularProgressBarColors.indicatorColor
     */
    fun indicatorColor(indicatorColor: InteractiveColor): CircularProgressBarColorsBuilder =
        indicatorColor(indicatorColor.asStatefulBrush())

    /**
     * Устанавливает цвет [indicatorColor] индикатора компонента.
     * @see CircularProgressBarColors.indicatorColor
     */
    fun indicatorColor(indicatorColor: Brush): CircularProgressBarColorsBuilder =
        indicatorColor(indicatorColor.asStatefulValue())

    /**
     * Устанавливает цвет [indicatorColor] индикатора компонента.
     * @see CircularProgressBarColors.indicatorColor
     */
    fun indicatorColor(indicatorColor: StatefulValue<Brush>): CircularProgressBarColorsBuilder

    /**
     * Устанавливает цвет [trackColor] трека прогресса.
     * @see CircularProgressBarColors.trackColor
     */
    fun trackColor(trackColor: Color): CircularProgressBarColorsBuilder =
        trackColor(trackColor.asStatefulBrush())

    /**
     * Устанавливает цвет [trackColor] трека прогресса.
     * @see CircularProgressBarColors.trackColor
     */
    fun trackColor(trackColor: InteractiveColor): CircularProgressBarColorsBuilder =
        trackColor(trackColor.asStatefulBrush())

    /**
     * Устанавливает цвет [trackColor] трека прогресса.
     * @see CircularProgressBarColors.trackColor
     */
    fun trackColor(trackColor: Brush): CircularProgressBarColorsBuilder =
        trackColor(trackColor.asStatefulValue())

    /**
     * Устанавливает цвет [trackColor] трека прогресса.
     * @see CircularProgressBarColors.trackColor
     */
    fun trackColor(trackColor: StatefulValue<Brush>): CircularProgressBarColorsBuilder

    /**
     * Устанавливает цвет [valueColor] надписи.
     * @see CircularProgressBarColors.valueColor
     */
    fun valueColor(valueColor: Color): CircularProgressBarColorsBuilder =
        valueColor(valueColor.asStatefulBrush())

    /**
     * Устанавливает цвет [valueColor] надписи.
     * @see CircularProgressBarColors.valueColor
     */
    fun valueColor(valueColor: InteractiveColor): CircularProgressBarColorsBuilder =
        valueColor(valueColor.asStatefulBrush())

    /**
     * Устанавливает цвет [valueColor] надписи.
     * @see CircularProgressBarColors.valueColor
     */
    fun valueColor(valueColor: Brush): CircularProgressBarColorsBuilder =
        valueColor(valueColor.asStatefulValue())

    /**
     * Устанавливает цвет [valueColor] надписи.
     * @see CircularProgressBarColors.valueColor
     */
    fun valueColor(valueColor: StatefulValue<Brush>): CircularProgressBarColorsBuilder

    /**
     * Устанавливает цвет [valueSuffixColor] суффикса надписи.
     * @see CircularProgressBarColors.valueSuffixColor
     */
    fun valueSuffixColor(valueSuffixColor: Color): CircularProgressBarColorsBuilder =
        valueSuffixColor(valueSuffixColor.asStatefulBrush())

    /**
     * Устанавливает цвет [valueSuffixColor] суффикса надписи.
     * @see CircularProgressBarColors.valueSuffixColor
     */
    fun valueSuffixColor(valueSuffixColor: InteractiveColor): CircularProgressBarColorsBuilder =
        valueSuffixColor(valueSuffixColor.asStatefulBrush())

    /**
     * Устанавливает цвет [valueSuffixColor] суффикса надписи.
     * @see CircularProgressBarColors.valueSuffixColor
     */
    fun valueSuffixColor(valueSuffixColor: Brush): CircularProgressBarColorsBuilder =
        valueSuffixColor(valueSuffixColor.asStatefulValue())

    /**
     * Устанавливает цвет [valueSuffixColor] суффикса надписи.
     * @see CircularProgressBarColors.valueSuffixColor
     */
    fun valueSuffixColor(valueSuffixColor: StatefulValue<Brush>): CircularProgressBarColorsBuilder

    /**
     * Создает экземпляр [CircularProgressBarColors]
     */
    fun build(): CircularProgressBarColors
}

@Immutable
private data class DefaultCircularProgressBarColors(
    override val indicatorColor: StatefulValue<Brush>,
    override val trackColor: StatefulValue<Brush>,
    override val valueColor: StatefulValue<Brush>,
    override val valueSuffixColor: StatefulValue<Brush>,
) : CircularProgressBarColors {

    class Builder : CircularProgressBarColorsBuilder {

        private var indicatorColor: StatefulValue<Brush>? = null
        private var trackColor: StatefulValue<Brush>? = null
        private var valueColor: StatefulValue<Brush>? = null
        private var valueSuffixColor: StatefulValue<Brush>? = null

        override fun indicatorColor(indicatorColor: StatefulValue<Brush>) = apply {
            this.indicatorColor = indicatorColor
        }

        override fun trackColor(trackColor: StatefulValue<Brush>) = apply {
            this.trackColor = trackColor
        }

        override fun valueColor(valueColor: StatefulValue<Brush>) = apply {
            this.valueColor = valueColor
        }

        override fun valueSuffixColor(valueSuffixColor: StatefulValue<Brush>) = apply {
            this.valueSuffixColor = valueSuffixColor
        }

        override fun build(): CircularProgressBarColors =
            DefaultCircularProgressBarColors(
                trackColor = trackColor ?: SolidColor(Color.LightGray).asStatefulValue(),
                indicatorColor = indicatorColor ?: SolidColor(Color.Black).asStatefulValue(),
                valueColor = valueColor ?: SolidColor(Color.Black).asStatefulValue(),
                valueSuffixColor = valueSuffixColor ?: valueColor ?: SolidColor(Color.Black).asStatefulValue(),
            )
    }
}

/**
 * Цвета компонента [CircularProgressBar]
 */
@Immutable
interface CircularProgressBarDimensions {

    /**
     * Ширина компонента [CircularProgressBar]
     */
    @Deprecated("Use widthValues", replaceWith = ReplaceWith("widthValues"))
    val width: Dp

    /**
     * Ширина компонента [CircularProgressBar]
     */
    val widthValues: StatefulValue<Dp>

    /**
     * Высота компонента [CircularProgressBar]
     */
    @Deprecated("Use heightValues", replaceWith = ReplaceWith("heightValues"))
    val height: Dp

    /**
     * Высота компонента [CircularProgressBar]
     */
    val heightValues: StatefulValue<Dp>

    /**
     * Толщина трека [CircularProgressBar]
     */
    @Deprecated("Use trackThicknessValues", replaceWith = ReplaceWith("trackThicknessValues"))
    val trackThickness: Dp

    /**
     * Толщина трека [CircularProgressBar]
     */
    val trackThicknessValues: StatefulValue<Dp>

    /**
     * Толщина инидкатора [CircularProgressBar]
     */
    @Deprecated("Use progressThicknessValues", replaceWith = ReplaceWith("progressThicknessValues"))
    val progressThickness: Dp

    /**
     * Толщина инидкатора [CircularProgressBar]
     */
    val progressThicknessValues: StatefulValue<Dp>

    /**
     * Размер иконки
     */
    @Deprecated("Use iconSizeValues", replaceWith = ReplaceWith("iconSizeValues"))
    val iconSize: Dp

    /**
     * Размер иконки
     */
    val iconSizeValues: StatefulValue<Dp>

    companion object {

        /**
         * Возвращает экземпляр [CircularProgressBarDimensions]
         */
        fun builder(): CircularProgressBarDimensionsBuilder =
            DefaultCircularProgressBarDimensions.Builder()
    }
}

/**
 * Билдер для [CircularProgressBarDimensions]
 */
interface CircularProgressBarDimensionsBuilder {

    /**
     * Устанавливает ширину компонента [width]
     */
    fun width(width: StatefulValue<Dp>): CircularProgressBarDimensionsBuilder

    /**
     * Устанавливает ширину компонента [width]
     */
    fun width(width: Dp): CircularProgressBarDimensionsBuilder =
        width(width.asStatefulValue())

    /**
     * Устанавливает высоту компонента [height]
     */
    fun height(height: StatefulValue<Dp>): CircularProgressBarDimensionsBuilder

    /**
     * Устанавливает высоту компонента [height]
     */
    fun height(height: Dp): CircularProgressBarDimensionsBuilder =
        height(height.asStatefulValue())

    /**
     * Устанавливает толщину трека [trackThickness]
     */
    fun trackThickness(trackThickness: StatefulValue<Dp>): CircularProgressBarDimensionsBuilder

    /**
     * Устанавливает толщину трека [trackThickness]
     */
    fun trackThickness(trackThickness: Dp): CircularProgressBarDimensionsBuilder =
        trackThickness(trackThickness.asStatefulValue())

    /**
     * Устанавливает толщину индикатора [progressThickness]
     */
    fun progressThickness(progressThickness: StatefulValue<Dp>): CircularProgressBarDimensionsBuilder

    /**
     * Устанавливает толщину индикатора [progressThickness]
     */
    fun progressThickness(progressThickness: Dp): CircularProgressBarDimensionsBuilder =
        progressThickness(progressThickness.asStatefulValue())

    /**
     * Устанавливает размер иконки [iconSize]
     */
    fun iconSize(iconSize: StatefulValue<Dp>): CircularProgressBarDimensionsBuilder

    /**
     * Устанавливает размер иконки [iconSize]
     */
    fun iconSize(iconSize: Dp): CircularProgressBarDimensionsBuilder =
        iconSize(iconSize.asStatefulValue())

    /**
     * Возвращает экземпляр [CircularProgressBarDimensions]
     */
    fun build(): CircularProgressBarDimensions
}

@Immutable
private class DefaultCircularProgressBarDimensions(
    override val widthValues: StatefulValue<Dp>,
    override val heightValues: StatefulValue<Dp>,
    override val trackThicknessValues: StatefulValue<Dp>,
    override val progressThicknessValues: StatefulValue<Dp>,
    override val iconSizeValues: StatefulValue<Dp>,

) : CircularProgressBarDimensions {
    @Deprecated("Use widthValues", replaceWith = ReplaceWith("widthValues"))
    override val width: Dp = widthValues.getDefaultValue()

    @Deprecated("Use heightValues", replaceWith = ReplaceWith("heightValues"))
    override val height: Dp = heightValues.getDefaultValue()

    @Deprecated("Use trackThicknessValues", replaceWith = ReplaceWith("trackThicknessValues"))
    override val trackThickness: Dp = trackThicknessValues.getDefaultValue()

    @Deprecated("Use progressThicknessValues", replaceWith = ReplaceWith("progressThicknessValues"))
    override val progressThickness: Dp = progressThicknessValues.getDefaultValue()

    @Deprecated("Use iconSizeValues", replaceWith = ReplaceWith("iconSizeValues"))
    override val iconSize: Dp = iconSizeValues.getDefaultValue()
    class Builder : CircularProgressBarDimensionsBuilder {
        private var width: StatefulValue<Dp>? = null
        private var height: StatefulValue<Dp>? = null
        private var trackThickness: StatefulValue<Dp>? = null
        private var progressThickness: StatefulValue<Dp>? = null
        private var iconSize: StatefulValue<Dp>? = null

        override fun width(width: StatefulValue<Dp>) = apply {
            this.width = width
        }

        override fun height(height: StatefulValue<Dp>) = apply {
            this.height = height
        }

        override fun trackThickness(trackThickness: StatefulValue<Dp>) = apply {
            this.trackThickness = trackThickness
        }

        override fun progressThickness(progressThickness: StatefulValue<Dp>) = apply {
            this.progressThickness = progressThickness
        }

        override fun iconSize(iconSize: StatefulValue<Dp>) = apply {
            this.iconSize = iconSize
        }

        override fun build(): CircularProgressBarDimensions {
            return DefaultCircularProgressBarDimensions(
                widthValues = width ?: 100.dp.asStatefulValue(),
                heightValues = height ?: 100.dp.asStatefulValue(),
                trackThicknessValues = trackThickness ?: progressThickness ?: 2.dp.asStatefulValue(),
                progressThicknessValues = progressThickness ?: trackThickness ?: 2.dp.asStatefulValue(),
                iconSizeValues = iconSize ?: Dp.Unspecified.asStatefulValue(),
            )
        }
    }
}
