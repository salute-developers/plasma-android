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
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal с [ButtonStyle]  для компонента [IconButton]
 */
val LocalIconButtonStyle = compositionLocalOf { IconButtonStyleBuilder.builder().style() }

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
     * @see [ButtonColorsBuilder]
     */
    @Composable
    fun colors(builder: @Composable IconButtonColorsBuilder.() -> Unit): IconButtonStyleBuilder

    /**
     * Устанавливает размеры и отступы контента кнопки [dimensions]
     * @see ButtonStyle.dimensions
     * @see Button.Dimensions
     */
    fun dimensions(dimensions: Button.Dimensions): IconButtonStyleBuilder

    /**
     * Устанавливает значение прозрачности выключенной кнопки [disableAlpha]
     * @see ButtonStyle.disableAlpha
     */
    fun disableAlpha(disableAlpha: Float): IconButtonStyleBuilder

    companion object {
        /**
         * Возвращает экземпляр [IconButtonStyleBuilder]
         */
        fun builder(receiver: Any? = null): IconButtonStyleBuilder = IconButtonStyleBuilderImpl(receiver)
    }
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
     * Устанавливает режим работы индикатора загрузки [spinnerMode]
     * @see ButtonColors.spinnerMode
     * @see Button.SpinnerMode
     */
    fun spinnerMode(spinnerMode: Button.SpinnerMode): IconButtonColorsBuilder

    /**
     * Возвращает готовый экземпляр [ButtonColors]
     */
    fun build(): ButtonColors

    companion object {
        /**
         * Возвращает экземпляр [ButtonColorsBuilder]
         */
        fun builder(): IconButtonColorsBuilder = DefaultIconButtonColors.Builder()
    }
}

@Stable
private class IconButtonStyleBuilderImpl(override val receiver: Any?) : IconButtonStyleBuilder {
    private var shape: CornerBasedShape? = null
    private var colorsBuilder: IconButtonColorsBuilder = IconButtonColorsBuilder.builder()
    private var labelStyle: TextStyle? = null
    private var valueStyle: TextStyle? = null
    private var dimensions: Button.Dimensions? = null
    private var disableAlpha: Float? = null

    override fun shape(shape: CornerBasedShape) = apply {
        this.shape = shape
    }

    @Composable
    override fun colors(builder: @Composable IconButtonColorsBuilder.() -> Unit): IconButtonStyleBuilder = apply {
        this.colorsBuilder.builder()
    }

    override fun dimensions(dimensions: Button.Dimensions) = apply {
        this.dimensions = dimensions
    }

    override fun disableAlpha(disableAlpha: Float) = apply {
        this.disableAlpha = disableAlpha
    }

    override fun style(): ButtonStyle {
        return DefaultButtonStyle(
            shape = shape ?: RoundedCornerShape(25),
            colors = colorsBuilder.build(),
            labelStyle = labelStyle ?: TextStyle.Default,
            valueStyle = valueStyle ?: TextStyle.Default,
            dimensions = dimensions ?: Button.Dimensions(),
            disableAlpha = disableAlpha ?: DISABLED_BUTTON_ALPHA,
        )
    }
}

@Immutable
private class DefaultIconButtonColors(
    override val contentColor: InteractiveColor,
    override val backgroundColor: InteractiveColor,
    override val labelColor: InteractiveColor,
    override val valueColor: InteractiveColor,
    override val iconColor: InteractiveColor,
    override val spinnerColor: InteractiveColor,
    override val spinnerMode: Button.SpinnerMode,
) : ButtonColors {

    class Builder : IconButtonColorsBuilder {
        private var contentColor: InteractiveColor? = null
        private var backgroundColor: InteractiveColor? = null
        private var labelColor: InteractiveColor? = null
        private var valueColor: InteractiveColor? = null
        private var iconColor: InteractiveColor? = null
        private var spinnerColor: InteractiveColor? = null
        private var spinnerMode: Button.SpinnerMode? = null

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

        override fun spinnerMode(spinnerMode: Button.SpinnerMode) = apply {
            this.spinnerMode = spinnerMode
        }

        override fun build(): ButtonColors {
            val contentColor = contentColor ?: Color.Black.asInteractive()
            return DefaultIconButtonColors(
                contentColor = contentColor,
                backgroundColor = backgroundColor ?: Color.White.asInteractive(),
                labelColor = labelColor ?: contentColor,
                valueColor = valueColor ?: contentColor,
                iconColor = iconColor ?: contentColor,
                spinnerColor = spinnerColor ?: contentColor,
                spinnerMode = spinnerMode ?: Button.SpinnerMode.HideContent,
            )
        }
    }
}

private const val DISABLED_BUTTON_ALPHA = 0.4f
