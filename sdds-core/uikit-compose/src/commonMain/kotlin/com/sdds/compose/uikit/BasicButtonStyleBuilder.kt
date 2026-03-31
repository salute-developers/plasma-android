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
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [ButtonStyle] для компонента [Button]
 */
val LocalButtonStyle = compositionLocalOf { ButtonStyle.basicButtonBuilder().style() }

/**
 * Возвращает экземпляр [BasicButtonStyleBuilder]
 */
fun ButtonStyle.Companion.basicButtonBuilder(receiver: Any? = null): BasicButtonStyleBuilder =
    BasicButtonStyleBuilderImpl(receiver)

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
    fun labelStyle(labelStyle: TextStyle): BasicButtonStyleBuilder

    /**
     * Устанавливает стиль дополнительного текста кнопки [valueStyle]
     * @see ButtonStyle.valueStyle
     */
    fun valueStyle(valueStyle: TextStyle): BasicButtonStyleBuilder

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
    fun contentColor(contentColor: InteractiveColor): BasicButtonColorsBuilder

    /**
     * Устанавливает цвет контента кнопки [contentColor]
     * @see BasicButtonColorsBuilder.contentColor
     * @see InteractiveColor
     */
    fun contentColor(contentColor: Color): BasicButtonColorsBuilder =
        contentColor(contentColor.asInteractive())

    /**
     * Устанавливает цвет фона кнопки [backgroundColor]
     * @see ButtonColors.backgroundColor
     * @see InteractiveColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): BasicButtonColorsBuilder

    /**
     * Устанавливает цвет фона кнопки [backgroundColor]
     * @see ButtonColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): BasicButtonColorsBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Устанавливает цвет основного текста кнопки [labelColor]
     * @see ButtonColors.labelColor
     * @see InteractiveColor
     */
    fun labelColor(labelColor: InteractiveColor): BasicButtonColorsBuilder

    /**
     * Устанавливает цвет основного текста кнопки [labelColor]
     * @see ButtonColors.labelColor
     * @see InteractiveColor
     */
    fun labelColor(labelColor: Color): BasicButtonColorsBuilder =
        labelColor(labelColor.asInteractive())

    /**
     * Устанавливает цвет дополнительного текста кнопки [valueColor]
     * @see ButtonColors.valueColor
     * @see InteractiveColor
     */
    fun valueColor(valueColor: InteractiveColor): BasicButtonColorsBuilder

    /**
     * Устанавливает цвет дополнительного текста кнопки [valueColor]
     * @see ButtonColors.valueColor
     * @see InteractiveColor
     */
    fun valueColor(valueColor: Color): BasicButtonColorsBuilder =
        valueColor(valueColor.asInteractive())

    /**
     * Устанавливает цвет иконки кнопки [iconColor]
     * @see ButtonColors.iconColor
     * @see InteractiveColor
     */
    fun iconColor(iconColor: InteractiveColor): BasicButtonColorsBuilder

    /**
     * Устанавливает цвет иконки кнопки [iconColor]
     * @see ButtonColors.iconColor
     * @see InteractiveColor
     */
    fun iconColor(iconColor: Color): BasicButtonColorsBuilder =
        iconColor(iconColor.asInteractive())

    /**
     * Устанавливает цвет индикатора загрузки кнопки [spinnerColor]
     * @see ButtonColors.spinnerColor
     * @see InteractiveColor
     */
    fun spinnerColor(spinnerColor: InteractiveColor): BasicButtonColorsBuilder

    /**
     * Устанавливает цвет индикатора загрузки кнопки [spinnerColor]
     * @see ButtonColors.spinnerColor
     * @see InteractiveColor
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
    fun height(height: Dp): BasicButtonDimensionsBuilder

    /**
     * Устанавливает отступ кнопки в начале
     */
    fun paddingStart(paddingStart: Dp): BasicButtonDimensionsBuilder

    /**
     * Устанавливает отступ кнопки в конце
     */
    fun paddingEnd(paddingEnd: Dp): BasicButtonDimensionsBuilder

    /**
     * Устанавливает минимальную ширину кнопки
     */
    fun minWidth(minWidth: Dp): BasicButtonDimensionsBuilder

    /**
     * Устанавливает размер иконки
     */
    fun iconSize(iconSize: Dp): BasicButtonDimensionsBuilder

    /**
     * Устанавливает размер спиннера
     */
    fun spinnerSize(spinnerSize: Dp): BasicButtonDimensionsBuilder

    /**
     * Устанавливает толщину спиннера
     */
    fun spinnerStrokeWidth(spinnerStrokeWidth: Dp): BasicButtonDimensionsBuilder

    /**
     * Устанавливает отступ иконки
     */
    fun iconMargin(iconMargin: Dp): BasicButtonDimensionsBuilder

    /**
     * Устанавливает отступ доп. текста
     */
    fun valueMargin(valueMargin: Dp): BasicButtonDimensionsBuilder

    /**
     * Возвращает [ButtonDimensions]
     */
    fun build(): ButtonDimensions

    companion object {
        /**
         * Вернет экземпляр билдера [BasicButtonDimensionsBuilder]
         */
        fun builder(): BasicButtonDimensionsBuilder = DefaultBasicButtonDimensionsBuilder()
    }
}

private class DefaultBasicButtonDimensionsBuilder : BasicButtonDimensionsBuilder {
    private var height: Dp? = null
    private var paddingStart: Dp? = null
    private var paddingEnd: Dp? = null
    private var minWidth: Dp? = null
    private var iconSize: Dp? = null
    private var spinnerSize: Dp? = null
    private var spinnerStrokeWidth: Dp? = null
    private var iconMargin: Dp? = null
    private var valueMargin: Dp? = null
    override fun height(height: Dp): BasicButtonDimensionsBuilder = apply {
        this.height = height
    }

    override fun paddingStart(paddingStart: Dp): BasicButtonDimensionsBuilder = apply {
        this.paddingStart = paddingStart
    }

    override fun paddingEnd(paddingEnd: Dp): BasicButtonDimensionsBuilder = apply {
        this.paddingEnd = paddingEnd
    }

    override fun minWidth(minWidth: Dp): BasicButtonDimensionsBuilder = apply {
        this.minWidth = minWidth
    }

    override fun iconSize(iconSize: Dp): BasicButtonDimensionsBuilder = apply {
        this.iconSize = iconSize
    }

    override fun spinnerSize(spinnerSize: Dp): BasicButtonDimensionsBuilder = apply {
        this.spinnerSize = spinnerSize
    }

    override fun spinnerStrokeWidth(spinnerStrokeWidth: Dp) = apply {
        this.spinnerStrokeWidth = spinnerStrokeWidth
    }

    override fun iconMargin(iconMargin: Dp): BasicButtonDimensionsBuilder = apply {
        this.iconMargin = iconMargin
    }

    override fun valueMargin(valueMargin: Dp): BasicButtonDimensionsBuilder = apply {
        this.valueMargin = valueMargin
    }

    override fun build(): ButtonDimensions {
        return ButtonDimensions(
            height = height ?: 46.dp,
            paddingStart = paddingStart ?: 0.dp,
            paddingEnd = paddingEnd ?: 0.dp,
            minWidth = minWidth ?: 84.dp,
            iconSize = iconSize ?: 24.dp,
            spinnerSize = spinnerSize ?: 22.dp,
            spinnerStrokeWidth = spinnerStrokeWidth ?: 2.dp,
            iconMargin = iconMargin ?: 6.dp,
            valueMargin = valueMargin ?: 4.dp,
        )
    }
}

@Stable
private class BasicButtonStyleBuilderImpl(override val receiver: Any?) : BasicButtonStyleBuilder {
    private var shape: CornerBasedShape? = null
    private var colorsBuilder: BasicButtonColorsBuilder = BasicButtonColorsBuilder.builder()
    private var labelStyle: TextStyle? = null
    private var valueStyle: TextStyle? = null
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

    override fun labelStyle(labelStyle: TextStyle) = apply {
        this.labelStyle = labelStyle
    }

    override fun valueStyle(valueStyle: TextStyle) = apply {
        this.valueStyle = valueStyle
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
            labelStyle = labelStyle ?: TextStyle.Default,
            valueStyle = valueStyle ?: TextStyle.Default,
            dimensions = dimensionsBuilder.build(),
            disableAlpha = disableAlpha ?: DISABLED_BUTTON_ALPHA,
            loadingAlpha = loadingAlpha ?: LOADING_BUTTON_ALPHA,
        )
    }
}

@Immutable
private class DefaultBasicButtonStyle(
    override val shape: CornerBasedShape,
    override val colors: ButtonColors,
    override val labelStyle: TextStyle,
    override val valueStyle: TextStyle,
    override val dimensions: ButtonDimensions,
    override val disableAlpha: Float,
    override val loadingAlpha: Float,
) : ButtonStyle

@Immutable
private class DefaultBasicButtonColors(
    override val backgroundColor: InteractiveColor,
    override val labelColor: InteractiveColor,
    override val valueColor: InteractiveColor,
    override val iconColor: InteractiveColor,
    override val spinnerColor: InteractiveColor,
) : ButtonColors {

    class Builder : BasicButtonColorsBuilder {
        private var contentColor: InteractiveColor? = null
        private var backgroundColor: InteractiveColor? = null
        private var labelColor: InteractiveColor? = null
        private var valueColor: InteractiveColor? = null
        private var iconColor: InteractiveColor? = null
        private var spinnerColor: InteractiveColor? = null

        override fun contentColor(contentColor: InteractiveColor) = apply {
            this.contentColor = contentColor
        }

        override fun backgroundColor(backgroundColor: InteractiveColor) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun labelColor(labelColor: InteractiveColor) = apply {
            this.labelColor = labelColor
        }

        override fun valueColor(valueColor: InteractiveColor) = apply {
            this.valueColor = valueColor
        }

        override fun iconColor(iconColor: InteractiveColor) = apply {
            this.iconColor = iconColor
        }

        override fun spinnerColor(spinnerColor: InteractiveColor) = apply {
            this.spinnerColor = spinnerColor
        }

        override fun build(): ButtonColors {
            return DefaultBasicButtonColors(
                backgroundColor = backgroundColor ?: Color.White.asInteractive(),
                labelColor = labelColor ?: Color.Black.asInteractive(),
                valueColor = valueColor ?: Color.Black.asInteractive(),
                iconColor = iconColor ?: Color.Black.asInteractive(),
                spinnerColor = spinnerColor ?: Color.Black.asInteractive(),
            )
        }
    }
}

private const val DISABLED_BUTTON_ALPHA = 0.4f
private const val LOADING_BUTTON_ALPHA = 0f
