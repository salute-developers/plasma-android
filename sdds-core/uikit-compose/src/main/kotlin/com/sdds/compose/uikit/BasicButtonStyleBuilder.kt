package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [ButtonStyle] для компонента [Button]
 */
val LocalButtonStyle = compositionLocalOf { ButtonStyle.basicButtonBuilder().style() }

/**
 * Возвращает экземпляр [BasicButtonStyleBuilder]
 */
fun ButtonStyle.Companion.basicButtonBuilder(receiver: Any? = null): BasicButtonStyleBuilder =
    DefaultBasicButtonStyle.Builder(receiver)

/**
 * Builder стиля базовой кнопки.
 */
@Stable
interface BasicButtonStyleBuilder : StyleBuilder<ButtonStyle> {

    /**
     * Устанавливает форму кнопки [shape]
     * @see ButtonStyle.shape
     */
    fun shape(shape: CornerBasedShape): BasicButtonStyleBuilder

    /**
     * Устанавливает цвета кнопки при помощи [builder]
     * @see ButtonStyle.colors
     * @see [BasicButtonColorsBuilder]
     */
    @Composable
    fun colors(builder: @Composable BasicButtonColorsBuilder.() -> Unit): BasicButtonStyleBuilder

    /**
     * Устанавливает стиль основного текста кнопки [labelStyle]
     * @see ButtonStyle.labelStyle
     */
    fun labelStyle(labelStyle: TextStyle): BasicButtonStyleBuilder =
        labelStyle(labelStyle.asStatefulValue())

    /**
     * Устанавливает стили основного текста кнопки [labelStyle]
     * @see ButtonStyle.labelStyle
     */
    fun labelStyle(labelStyle: StatefulValue<TextStyle>): BasicButtonStyleBuilder

    /**
     * Устанавливает стиль дополнительного текста кнопки [valueStyle]
     * @see ButtonStyle.valueStyle
     */
    fun valueStyle(valueStyle: TextStyle): BasicButtonStyleBuilder =
        valueStyle(valueStyle.asStatefulValue())

    /**
     * Устанавливает стили дополнительного текста кнопки [valueStyle]
     * @see ButtonStyle.valueStyle
     */
    fun valueStyle(valueStyle: StatefulValue<TextStyle>): BasicButtonStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     */
    @Composable
    fun dimensions(builder: @Composable BasicButtonDimensionsBuilder.() -> Unit): BasicButtonStyleBuilder

    /**
     * Устанавливает размеры и отступы контента кнопки [dimensions]
     * @see ButtonStyle.dimensions
     * @see ButtonDimensions
     */
    @Deprecated("Use dimensions() with builder instead")
    fun dimensions(dimensions: ButtonDimensions): BasicButtonStyleBuilder

    /**
     * Устанавливает значение прозрачности выключенной кнопки [disableAlpha]
     * @see ButtonStyle.disableAlpha
     */
    fun disableAlpha(disableAlpha: Float): BasicButtonStyleBuilder

    /**
     * Устанавливает значение прозрачности кнопки в состоянии загрузки [loadingAlpha]
     * @see ButtonStyle.loadingAlpha
     */
    fun loadingAlpha(loadingAlpha: Float): BasicButtonStyleBuilder
}

/**
 * Builder для [ButtonColors].
 */
interface BasicButtonColorsBuilder {

    /**
     * Устанавливает цвет контента кнопки [contentColor]
     * @see InteractiveColor
     */
    fun contentColor(contentColor: InteractiveColor): BasicButtonColorsBuilder =
        contentColor(contentColor.asStatefulBrush())

    /**
     * Устанавливает цвет контента кнопки [contentColor]
     * @see BasicButtonColorsBuilder.contentColor
     */
    fun contentColor(contentColor: Color): BasicButtonColorsBuilder =
        contentColor(contentColor.asStatefulBrush())

    /**
     * Устанавливает кисти контента кнопки [contentColor]
     */
    fun contentColor(contentColor: StatefulValue<Brush>): BasicButtonColorsBuilder

    /**
     * Устанавливает цвет фона кнопки [backgroundColor]
     * @see ButtonColors.backgroundColor
     * @see InteractiveColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): BasicButtonColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона кнопки [backgroundColor]
     * @see ButtonColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): BasicButtonColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает кисти фона кнопки [backgroundColor]
     * @see ButtonColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): BasicButtonColorsBuilder

    /**
     * Устанавливает цвет основного текста кнопки [labelColor]
     * @see ButtonColors.labelColor
     * @see InteractiveColor
     */
    fun labelColor(labelColor: InteractiveColor): BasicButtonColorsBuilder =
        labelColor(labelColor.asStatefulBrush())

    /**
     * Устанавливает цвет основного текста кнопки [labelColor]
     * @see ButtonColors.labelColor
     */
    fun labelColor(labelColor: Color): BasicButtonColorsBuilder =
        labelColor(labelColor.asStatefulBrush())

    /**
     * Устанавливает кисти основного текста кнопки [labelColor]
     * @see ButtonColors.labelColor
     */
    fun labelColor(labelColor: StatefulValue<Brush>): BasicButtonColorsBuilder

    /**
     * Устанавливает цвет дополнительного текста кнопки [valueColor]
     * @see ButtonColors.valueColor
     * @see InteractiveColor
     */
    fun valueColor(valueColor: InteractiveColor): BasicButtonColorsBuilder =
        valueColor(valueColor.asStatefulBrush())

    /**
     * Устанавливает цвет дополнительного текста кнопки [valueColor]
     * @see ButtonColors.valueColor
     */
    fun valueColor(valueColor: Color): BasicButtonColorsBuilder =
        valueColor(valueColor.asStatefulBrush())

    /**
     * Устанавливает кисти дополнительного текста кнопки [valueColor]
     * @see ButtonColors.valueColor
     */
    fun valueColor(valueColor: StatefulValue<Brush>): BasicButtonColorsBuilder

    /**
     * Устанавливает цвет иконки кнопки [iconColor]
     * @see ButtonColors.iconColor
     * @see InteractiveColor
     */
    fun iconColor(iconColor: InteractiveColor): BasicButtonColorsBuilder =
        iconColor(iconColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки кнопки [iconColor]
     * @see ButtonColors.iconColor
     */
    fun iconColor(iconColor: Color): BasicButtonColorsBuilder =
        iconColor(iconColor.asStatefulBrush())

    /**
     * Устанавливает кисти иконки кнопки [iconColor]
     * @see ButtonColors.iconColor
     */
    fun iconColor(iconColor: StatefulValue<Brush>): BasicButtonColorsBuilder

    /**
     * Устанавливает цвет индикатора загрузки кнопки [spinnerColor]
     * @see ButtonColors.spinnerColor
     * @see InteractiveColor
     */
    fun spinnerColor(spinnerColor: InteractiveColor): BasicButtonColorsBuilder

    /**
     * Устанавливает цвет индикатора загрузки кнопки [spinnerColor]
     * @see ButtonColors.spinnerColor
     */
    fun spinnerColor(spinnerColor: Color): BasicButtonColorsBuilder =
        spinnerColor(spinnerColor.asInteractive())

    /**
     * Возвращает готовый экземпляр [ButtonColors]
     */
    fun build(): ButtonColors

    companion object {
        /**
         * Возвращает экземпляр [BasicButtonColorsBuilder]
         */
        fun builder(): BasicButtonColorsBuilder = DefaultBasicButtonColors.Builder()
    }
}

/**
 * Билдер размеров для BasicButton
 */
interface BasicButtonDimensionsBuilder {

    /**
     * Устанавливает высоту кнопки
     */
    fun height(height: Dp): BasicButtonDimensionsBuilder =
        height(height.asStatefulValue())

    /**
     * Устанавливает высоту кнопки
     */
    fun height(height: StatefulValue<Dp>): BasicButtonDimensionsBuilder

    /**
     * Устанавливает отступ кнопки в начале
     */
    fun paddingStart(paddingStart: Dp): BasicButtonDimensionsBuilder =
        paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает отступы кнопки в начале
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): BasicButtonDimensionsBuilder

    /**
     * Устанавливает отступ кнопки в конце
     */
    fun paddingEnd(paddingEnd: Dp): BasicButtonDimensionsBuilder =
        paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает отступы кнопки в конце
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): BasicButtonDimensionsBuilder

    /**
     * Устанавливает минимальную ширину кнопки
     */
    fun minWidth(minWidth: Dp): BasicButtonDimensionsBuilder =
        minWidth(minWidth.asStatefulValue())

    /**
     * Устанавливает минимальную ширину кнопки
     */
    fun minWidth(minWidth: StatefulValue<Dp>): BasicButtonDimensionsBuilder

    /**
     * Устанавливает размер иконки
     */
    fun iconSize(iconSize: Dp): BasicButtonDimensionsBuilder =
        iconSize(iconSize.asStatefulValue())

    /**
     * Устанавливает размеры иконки
     */
    fun iconSize(iconSize: StatefulValue<Dp>): BasicButtonDimensionsBuilder

    /**
     * Устанавливает размер спиннера
     */
    fun spinnerSize(spinnerSize: Dp): BasicButtonDimensionsBuilder =
        spinnerSize(spinnerSize.asStatefulValue())

    /**
     * Устанавливает размеры спиннера
     */
    fun spinnerSize(spinnerSize: StatefulValue<Dp>): BasicButtonDimensionsBuilder

    /**
     * Устанавливает толщину спиннера
     */
    fun spinnerStrokeWidth(spinnerStrokeWidth: Dp): BasicButtonDimensionsBuilder =
        spinnerStrokeWidth(spinnerStrokeWidth.asStatefulValue())

    /**
     * Устанавливает толщину спиннера
     */
    fun spinnerStrokeWidth(spinnerStrokeWidth: StatefulValue<Dp>): BasicButtonDimensionsBuilder

    /**
     * Устанавливает отступ иконки
     */
    fun iconMargin(iconMargin: Dp): BasicButtonDimensionsBuilder =
        iconMargin(iconMargin.asStatefulValue())

    /**
     * Устанавливает отступы иконки
     */
    fun iconMargin(iconMargin: StatefulValue<Dp>): BasicButtonDimensionsBuilder

    /**
     * Устанавливает отступ доп. текста
     */
    fun valueMargin(valueMargin: Dp): BasicButtonDimensionsBuilder =
        valueMargin(valueMargin.asStatefulValue())

    /**
     * Устанавливает отступы доп. текста
     */
    fun valueMargin(valueMargin: StatefulValue<Dp>): BasicButtonDimensionsBuilder

    /**
     * Возвращает [ButtonDimensions]
     */
    fun build(): ButtonDimension

    companion object {
        /**
         * Вернет экземпляр билдера [BasicButtonDimensionsBuilder]
         */
        fun builder(): BasicButtonDimensionsBuilder = DefaultBasicButtonDimensions.Builder()
    }
}

@Immutable
private class DefaultBasicButtonDimensions(
    override val heightValues: StatefulValue<Dp>,
    override val paddingStartValues: StatefulValue<Dp>,
    override val paddingEndValues: StatefulValue<Dp>,
    override val minWidthValues: StatefulValue<Dp>,
    override val iconSizeValues: StatefulValue<Dp>,
    override val spinnerSizeValues: StatefulValue<Dp>,
    override val spinnerStrokeWidthValues: StatefulValue<Dp>,
    override val iconMarginValues: StatefulValue<Dp>,
    override val valueMarginValues: StatefulValue<Dp>,

) : ButtonDimension {
    class Builder : BasicButtonDimensionsBuilder {
        private var heightValues: StatefulValue<Dp>? = null
        private var paddingStartValues: StatefulValue<Dp>? = null
        private var paddingEndValues: StatefulValue<Dp>? = null
        private var minWidthValues: StatefulValue<Dp>? = null
        private var iconSizeValues: StatefulValue<Dp>? = null
        private var spinnerSizeValues: StatefulValue<Dp>? = null
        private var spinnerStrokeWidthValues: StatefulValue<Dp>? = null
        private var iconMarginValues: StatefulValue<Dp>? = null
        private var valueMarginValues: StatefulValue<Dp>? = null

        override fun height(height: StatefulValue<Dp>): BasicButtonDimensionsBuilder = apply {
            this.heightValues = height
        }

        override fun paddingStart(paddingStart: StatefulValue<Dp>): BasicButtonDimensionsBuilder = apply {
            this.paddingStartValues = paddingStart
        }

        override fun paddingEnd(paddingEnd: StatefulValue<Dp>): BasicButtonDimensionsBuilder = apply {
            this.paddingEndValues = paddingEnd
        }

        override fun minWidth(minWidth: StatefulValue<Dp>): BasicButtonDimensionsBuilder = apply {
            this.minWidthValues = minWidth
        }

        override fun iconSize(iconSize: StatefulValue<Dp>): BasicButtonDimensionsBuilder = apply {
            this.iconSizeValues = iconSize
        }

        override fun spinnerSize(spinnerSize: StatefulValue<Dp>): BasicButtonDimensionsBuilder = apply {
            this.spinnerSizeValues = spinnerSize
        }

        override fun spinnerStrokeWidth(spinnerStrokeWidth: StatefulValue<Dp>) = apply {
            this.spinnerStrokeWidthValues = spinnerStrokeWidth
        }

        override fun iconMargin(iconMargin: StatefulValue<Dp>): BasicButtonDimensionsBuilder = apply {
            this.iconMarginValues = iconMargin
        }

        override fun valueMargin(valueMargin: StatefulValue<Dp>): BasicButtonDimensionsBuilder = apply {
            this.valueMarginValues = valueMargin
        }

        override fun build(): ButtonDimension {
            return DefaultBasicButtonDimensions(
                heightValues = heightValues ?: 46.dp.asStatefulValue(),
                paddingStartValues = paddingStartValues ?: 0.dp.asStatefulValue(),
                paddingEndValues = paddingEndValues ?: 0.dp.asStatefulValue(),
                minWidthValues = minWidthValues ?: 84.dp.asStatefulValue(),
                iconSizeValues = iconSizeValues ?: 24.dp.asStatefulValue(),
                spinnerSizeValues = spinnerSizeValues ?: 22.dp.asStatefulValue(),
                spinnerStrokeWidthValues = spinnerStrokeWidthValues ?: 2.dp.asStatefulValue(),
                iconMarginValues = iconMarginValues ?: 6.dp.asStatefulValue(),
                valueMarginValues = valueMarginValues ?: 4.dp.asStatefulValue(),
            )
        }
    }
}

@Immutable
private class DefaultBasicButtonStyle(
    override val shape: CornerBasedShape,
    override val colors: ButtonColors,
    override val labelStyles: StatefulValue<TextStyle>,
    override val valueStyles: StatefulValue<TextStyle>,
    override val dimensions: ButtonDimension,
    override val disableAlpha: Float,
    override val loadingAlpha: Float,
) : ButtonStyle {

    @Deprecated("Use labelStyles", replaceWith = ReplaceWith("labelStyles"))
    override val labelStyle: TextStyle
        get() = labelStyles.getDefaultValue()

    @Deprecated("Use valueStyles", replaceWith = ReplaceWith("valueStyles"))
    override val valueStyle: TextStyle
        get() = valueStyles.getDefaultValue()

    class Builder(override val receiver: Any?) : BasicButtonStyleBuilder {
        private var shape: CornerBasedShape? = null
        private var colorsBuilder: BasicButtonColorsBuilder = BasicButtonColorsBuilder.builder()
        private var labelStyles: StatefulValue<TextStyle>? = null
        private var valueStyles: StatefulValue<TextStyle>? = null
        private var dimensionsBuilder: BasicButtonDimensionsBuilder =
            BasicButtonDimensionsBuilder.builder()
        private var disableAlpha: Float? = null
        private var loadingAlpha: Float? = null

        override fun shape(shape: CornerBasedShape) = apply {
            this.shape = shape
        }

        @Composable
        override fun colors(builder: @Composable BasicButtonColorsBuilder.() -> Unit): BasicButtonStyleBuilder =
            apply {
                this.colorsBuilder.builder()
            }

        override fun labelStyle(labelStyle: StatefulValue<TextStyle>) = apply {
            this.labelStyles = labelStyle
        }

        override fun valueStyle(valueStyle: StatefulValue<TextStyle>) = apply {
            this.valueStyles = valueStyle
        }

        @Composable
        override fun dimensions(builder: @Composable (BasicButtonDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        @Deprecated("Use dimensions() with builder instead")
        override fun dimensions(dimensions: ButtonDimensions) = apply {
            this.dimensionsBuilder.apply {
                height(dimensions.height)
                paddingStart(dimensions.paddingStart)
                paddingEnd(dimensions.paddingEnd)
                minWidth(dimensions.minWidth)
                iconSize(dimensions.iconSize)
                spinnerSize(dimensions.spinnerSize)
                iconMargin(dimensions.iconMargin)
                valueMargin(dimensions.valueMargin)
            }
        }

        override fun disableAlpha(disableAlpha: Float) = apply {
            this.disableAlpha = disableAlpha
        }

        override fun loadingAlpha(loadingAlpha: Float) = apply {
            this.loadingAlpha = loadingAlpha
        }

        override fun style(): ButtonStyle {
            return DefaultBasicButtonStyle(
                shape = shape ?: RoundedCornerShape(25),
                colors = colorsBuilder.build(),
                labelStyles = labelStyles ?: TextStyle.Default.asStatefulValue(),
                valueStyles = valueStyles ?: TextStyle.Default.asStatefulValue(),
                dimensions = dimensionsBuilder.build(),
                disableAlpha = disableAlpha ?: DISABLED_BUTTON_ALPHA,
                loadingAlpha = loadingAlpha ?: LOADING_BUTTON_ALPHA,
            )
        }
    }
}

@Immutable
private class DefaultBasicButtonColors(
    override val backgroundBrush: StatefulValue<Brush>,
    override val labelBrush: StatefulValue<Brush>,
    override val valueBrush: StatefulValue<Brush>,
    override val iconBrush: StatefulValue<Brush>,
    override val spinnerColor: InteractiveColor,
) : ButtonColors {
    @Deprecated("Use backgroundBrush", replaceWith = ReplaceWith("backgroundBrush"))
    override val backgroundColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use labelBrush", replaceWith = ReplaceWith("labelBrush"))
    override val labelColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use valueBrush", replaceWith = ReplaceWith("valueBrush"))
    override val valueColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use iconBrush", replaceWith = ReplaceWith("iconBrush"))
    override val iconColor: InteractiveColor = Color.Transparent.asInteractive()
    class Builder : BasicButtonColorsBuilder {
        private var contentBrush: StatefulValue<Brush>? = null
        private var backgroundBrush: StatefulValue<Brush>? = null
        private var labelBrush: StatefulValue<Brush>? = null
        private var valueBrush: StatefulValue<Brush>? = null
        private var iconBrush: StatefulValue<Brush>? = null
        private var spinnerColor: InteractiveColor? = null

        override fun contentColor(contentColor: StatefulValue<Brush>) = apply {
            this.contentBrush = contentColor
        }

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundBrush = backgroundColor
        }

        override fun labelColor(labelColor: StatefulValue<Brush>) = apply {
            this.labelBrush = labelColor
        }

        override fun valueColor(valueColor: StatefulValue<Brush>) = apply {
            this.valueBrush = valueColor
        }

        override fun iconColor(iconColor: StatefulValue<Brush>) = apply {
            this.iconBrush = iconColor
        }

        override fun spinnerColor(spinnerColor: InteractiveColor) = apply {
            this.spinnerColor = spinnerColor
        }

        override fun build(): ButtonColors {
            return DefaultBasicButtonColors(
                backgroundBrush = backgroundBrush ?: Color.White.asStatefulBrush(),
                labelBrush = labelBrush ?: Color.Black.asStatefulBrush(),
                valueBrush = valueBrush ?: Color.Black.asStatefulBrush(),
                iconBrush = iconBrush ?: Color.Black.asStatefulBrush(),
                spinnerColor = spinnerColor ?: Color.Black.asInteractive(),
            )
        }
    }
}

private const val DISABLED_BUTTON_ALPHA = 0.4f
private const val LOADING_BUTTON_ALPHA = 0f
