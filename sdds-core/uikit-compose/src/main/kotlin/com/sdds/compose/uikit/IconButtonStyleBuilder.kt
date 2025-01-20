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
 * CompositionLocal с [ButtonStyle]  для компонента [IconButton]
 */
val LocalIconButtonStyle = compositionLocalOf { ButtonStyle.iconButtonBuilder().style() }

/**
 * Возвращает экземпляр [IconButtonStyleBuilder]
 */
fun ButtonStyle.Companion.iconButtonBuilder(receiver: Any? = null): IconButtonStyleBuilder =
    IconButtonStyleBuilderImpl(receiver)

/**
 * Builder стиля кнопки c иконкой
 */
@Stable
interface IconButtonStyleBuilder : StyleBuilder<ButtonStyle> {

    /**
     * Устанавливает форму кнопки [shape]
     * @see ButtonStyle.shape
     */
    fun shape(shape: CornerBasedShape): IconButtonStyleBuilder

    /**
     * Устанавливает цвета кнопки при помощи [builder]
     * @see ButtonStyle.colors
     * @see [IconButtonColorsBuilder]
     */
    @Composable
    fun colors(builder: @Composable IconButtonColorsBuilder.() -> Unit): IconButtonStyleBuilder

    /**
     * Устанавливает размеры и отступы контента кнопки [dimensions]
     * @see ButtonStyle.dimensions
     * @see Button.Dimensions
     */
    @Deprecated("Use dimensions() with builder instead")
    fun dimensions(dimensions: Button.Dimensions): IconButtonStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     */
    @Composable
    fun dimensions(builder: @Composable IconButtonDimensionsBuilder.() -> Unit): IconButtonStyleBuilder

    /**
     * Устанавливает значение прозрачности выключенной кнопки [disableAlpha]
     * @see ButtonStyle.disableAlpha
     */
    fun disableAlpha(disableAlpha: Float): IconButtonStyleBuilder

    /**
     * Устанавливает значение прозрачности кнопки в состоянии загрузки [loadingAlpha]
     * @see ButtonStyle.loadingAlpha
     */
    fun loadingAlpha(loadingAlpha: Float): IconButtonStyleBuilder
}

/**
 * Builder для [ButtonColors].
 */
interface IconButtonColorsBuilder {

    /**
     * Устанавливает цвет контента кнопки [contentColor]
     * @see ButtonColors.contentColor
     * @see InteractiveColor
     */
    fun contentColor(contentColor: InteractiveColor): IconButtonColorsBuilder

    /**
     * Устанавливает цвет контента кнопки [contentColor]
     * @see IconButtonColorsBuilder.contentColor
     * @see ButtonColors.contentColor
     * @see InteractiveColor
     */
    fun contentColor(contentColor: Color): IconButtonColorsBuilder =
        contentColor(contentColor.asInteractive())

    /**
     * Устанавливает цвет фона кнопки [backgroundColor]
     * @see ButtonColors.backgroundColor
     * @see InteractiveColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): IconButtonColorsBuilder

    /**
     * Устанавливает цвет фона кнопки [backgroundColor]
     * @see ButtonColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): IconButtonColorsBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Устанавливает цвет иконки кнопки [iconColor]
     * @see ButtonColors.iconColor
     * @see InteractiveColor
     */
    fun iconColor(iconColor: InteractiveColor): IconButtonColorsBuilder

    /**
     * Устанавливает цвет иконки кнопки [iconColor]
     * @see ButtonColors.iconColor
     * @see InteractiveColor
     */
    fun iconColor(iconColor: Color): IconButtonColorsBuilder =
        iconColor(iconColor.asInteractive())

    /**
     * Устанавливает цвет индикатора загрузки кнопки [spinnerColor]
     * @see ButtonColors.spinnerColor
     * @see InteractiveColor
     */
    fun spinnerColor(spinnerColor: InteractiveColor): IconButtonColorsBuilder

    /**
     * Устанавливает цвет индикатора загрузки кнопки [spinnerColor]
     * @see ButtonColors.spinnerColor
     * @see InteractiveColor
     */
    fun spinnerColor(spinnerColor: Color): IconButtonColorsBuilder =
        spinnerColor(spinnerColor.asInteractive())

    /**
     * Возвращает готовый экземпляр [ButtonColors]
     */
    fun build(): ButtonColors

    companion object {
        /**
         * Возвращает экземпляр [IconButtonColorsBuilder]
         */
        fun builder(): IconButtonColorsBuilder = DefaultIconButtonColors.Builder()
    }
}

/**
 * Билдер размеров для [BasicButton]
 */
interface IconButtonDimensionsBuilder {

    /**
     * Устанавливает высоту кнопки
     */
    fun height(height: Dp): IconButtonDimensionsBuilder

    /**
     * Устанавливает отступ кнопки в начале
     */
    fun paddingStart(paddingStart: Dp): IconButtonDimensionsBuilder

    /**
     * Устанавливает отступ кнопки в конце
     */
    fun paddingEnd(paddingEnd: Dp): IconButtonDimensionsBuilder

    /**
     * Устанавливает минимальную ширину кнопки
     */
    fun minWidth(minWidth: Dp): IconButtonDimensionsBuilder

    /**
     * Устанавливает размер иконки
     */
    fun iconSize(iconSize: Dp): IconButtonDimensionsBuilder

    /**
     * Устанавливает размер спиннера
     */
    fun spinnerSize(spinnerSize: Dp): IconButtonDimensionsBuilder

    /**
     * Устанавливает толщину спиннера
     */
    fun spinnerStrokeWidth(spinnerStrokeWidth: Dp): IconButtonDimensionsBuilder

    /**
     * Возвращает [Button.Dimensions]
     */
    fun build(): Button.Dimensions

    companion object {
        /**
         * Вернет экземпляр билдера [IconButtonDimensionsBuilder]
         */
        fun builder(): IconButtonDimensionsBuilder = DefaultIconButtonDimensionsBuilder()
    }
}

private class DefaultIconButtonDimensionsBuilder : IconButtonDimensionsBuilder {
    private var height: Dp? = null
    private var paddingStart: Dp? = null
    private var paddingEnd: Dp? = null
    private var minWidth: Dp? = null
    private var iconSize: Dp? = null
    private var spinnerSize: Dp? = null
    private var spinnerStrokeWidth: Dp? = null
    override fun height(height: Dp): IconButtonDimensionsBuilder = apply {
        this.height = height
    }

    override fun paddingStart(paddingStart: Dp): IconButtonDimensionsBuilder = apply {
        this.paddingStart = paddingStart
    }

    override fun paddingEnd(paddingEnd: Dp): IconButtonDimensionsBuilder = apply {
        this.paddingEnd = paddingEnd
    }

    override fun minWidth(minWidth: Dp): IconButtonDimensionsBuilder = apply {
        this.minWidth = minWidth
    }

    override fun iconSize(iconSize: Dp): IconButtonDimensionsBuilder = apply {
        this.iconSize = iconSize
    }

    override fun spinnerSize(spinnerSize: Dp): IconButtonDimensionsBuilder = apply {
        this.spinnerSize = spinnerSize
    }

    override fun spinnerStrokeWidth(spinnerStrokeWidth: Dp) = apply {
        this.spinnerStrokeWidth = spinnerStrokeWidth
    }

    override fun build(): Button.Dimensions {
        return Button.Dimensions(
            height = height ?: 46.dp,
            paddingStart = paddingStart ?: 0.dp,
            paddingEnd = paddingEnd ?: 0.dp,
            minWidth = minWidth ?: 84.dp,
            iconSize = iconSize ?: 24.dp,
            spinnerSize = spinnerSize ?: 22.dp,
            spinnerStrokeWidth = spinnerStrokeWidth ?: 2.dp,
        )
    }
}

@Stable
private class IconButtonStyleBuilderImpl(override val receiver: Any?) : IconButtonStyleBuilder {
    private var shape: CornerBasedShape? = null
    private var colorsBuilder: IconButtonColorsBuilder = IconButtonColorsBuilder.builder()
    private var labelStyle: TextStyle? = null
    private var valueStyle: TextStyle? = null
    private var dimensionsBuilder: IconButtonDimensionsBuilder =
        IconButtonDimensionsBuilder.builder()
    private var disableAlpha: Float? = null
    private var loadingAlpha: Float? = null

    override fun shape(shape: CornerBasedShape) = apply {
        this.shape = shape
    }

    @Composable
    override fun colors(builder: @Composable IconButtonColorsBuilder.() -> Unit): IconButtonStyleBuilder =
        apply {
            this.colorsBuilder.builder()
        }

    @Deprecated("Use dimensions() with builder instead")
    override fun dimensions(dimensions: Button.Dimensions) = apply {
        this.dimensionsBuilder.apply {
            height(dimensions.height)
            paddingStart(dimensions.paddingStart)
            paddingEnd(dimensions.paddingEnd)
            minWidth(dimensions.minWidth)
            iconSize(dimensions.iconSize)
            spinnerSize(dimensions.spinnerSize)
        }
    }

    @Composable
    override fun dimensions(builder: @Composable (IconButtonDimensionsBuilder.() -> Unit)) =
        apply {
            this.dimensionsBuilder.builder()
        }

    override fun disableAlpha(disableAlpha: Float) = apply {
        this.disableAlpha = disableAlpha
    }

    override fun loadingAlpha(loadingAlpha: Float) = apply {
        this.loadingAlpha = loadingAlpha
    }

    override fun style(): ButtonStyle {
        return DefaultIconButtonStyle(
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
private class DefaultIconButtonStyle(
    override val shape: CornerBasedShape,
    override val colors: ButtonColors,
    override val labelStyle: TextStyle,
    override val valueStyle: TextStyle,
    override val dimensions: Button.Dimensions,
    override val disableAlpha: Float,
    override val loadingAlpha: Float,
) : ButtonStyle

@Immutable
private class DefaultIconButtonColors(
    override val backgroundColor: InteractiveColor,
    override val labelColor: InteractiveColor,
    override val valueColor: InteractiveColor,
    override val iconColor: InteractiveColor,
    override val spinnerColor: InteractiveColor,
) : ButtonColors {

    class Builder : IconButtonColorsBuilder {
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

        override fun iconColor(iconColor: InteractiveColor) = apply {
            this.iconColor = iconColor
        }

        override fun spinnerColor(spinnerColor: InteractiveColor) = apply {
            this.spinnerColor = spinnerColor
        }

        override fun build(): ButtonColors {
            return DefaultIconButtonColors(
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
