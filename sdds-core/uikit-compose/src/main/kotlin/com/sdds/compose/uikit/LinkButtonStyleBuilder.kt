package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * Builder стиля кнопки.
 */
@Stable
interface LinkButtonStyleBuilder : StyleBuilder<ButtonStyle> {

    /**
     * Устанавливает форму кнопки [shape]
     * @see ButtonStyle.shape
     */
    fun shape(shape: CornerBasedShape): LinkButtonStyleBuilder

    /**
     * Устанавливает цвета кнопки при помощи [builder]
     * @see ButtonStyle.colors
     * @see [ButtonColorsBuilder]
     */
    @Composable
    fun colors(builder: @Composable LinkButtonColorsBuilder.() -> Unit): LinkButtonStyleBuilder

    /**
     * Устанавливает стиль основного текста кнопки [labelStyle]
     * @see ButtonStyle.labelStyle
     */
    fun labelStyle(labelStyle: TextStyle): LinkButtonStyleBuilder

    /**
     * Устанавливает стиль дополнительного текста кнопки [valueStyle]
     * @see ButtonStyle.valueStyle
     */
    fun valueStyle(valueStyle: TextStyle): LinkButtonStyleBuilder

    /**
     * Устанавливает размеры и отступы контента кнопки [dimensions]
     * @see ButtonStyle.dimensions
     * @see Button.Dimensions
     */
    fun dimensions(dimensions: Button.Dimensions): LinkButtonStyleBuilder

    /**
     * Устанавливает значение прозрачности выключенной кнопки [disableAlpha]
     * @see ButtonStyle.disableAlpha
     */
    fun disableAlpha(disableAlpha: Float): LinkButtonStyleBuilder

    /**
     * Устанавливает режим работы индикатора загрузки [spinnerMode]
     * @see ButtonStyle.spinnerMode
     * @see Button.SpinnerMode
     */
    fun spinnerMode(spinnerMode: Button.SpinnerMode): LinkButtonStyleBuilder

    companion object {
        /**
         * Возвращает экземпляр [LinkButtonStyleBuilder]
         */
        fun builder(receiver: Any? = null): LinkButtonStyleBuilder = LinkButtonStyleBuilderImpl(receiver)
    }
}

/**
 * Builder для [ButtonColors].
 */
interface LinkButtonColorsBuilder {

    /**
     * Устанавливает цвет контента кнопки [contentColor]
     * @see ButtonColors.contentColor
     * @see InteractiveColor
     */
    fun contentColor(contentColor: InteractiveColor): LinkButtonColorsBuilder

    /**
     * Устанавливает цвет контента кнопки [contentColor]
     * @see LinkButtonColorsBuilder.contentColor
     * @see ButtonColors.contentColor
     * @see InteractiveColor
     */
    fun contentColor(contentColor: Color): LinkButtonColorsBuilder =
        contentColor(contentColor.asInteractive())

    /**
     * Устанавливает цвет фона кнопки [backgroundColor]
     * @see ButtonColors.backgroundColor
     * @see InteractiveColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): LinkButtonColorsBuilder

    /**
     * Устанавливает цвет фона кнопки [backgroundColor]
     * @see ButtonColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): LinkButtonColorsBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Устанавливает цвет основного текста кнопки [labelColor]
     * @see ButtonColors.labelColor
     * @see InteractiveColor
     */
    fun labelColor(labelColor: InteractiveColor): LinkButtonColorsBuilder

    /**
     * Устанавливает цвет основного текста кнопки [labelColor]
     * @see ButtonColors.labelColor
     * @see InteractiveColor
     */
    fun labelColor(labelColor: Color): LinkButtonColorsBuilder =
        labelColor(labelColor.asInteractive())

    /**
     * Устанавливает цвет дополнительного текста кнопки [valueColor]
     * @see ButtonColors.valueColor
     * @see InteractiveColor
     */
    fun valueColor(valueColor: InteractiveColor): LinkButtonColorsBuilder

    /**
     * Устанавливает цвет дополнительного текста кнопки [valueColor]
     * @see ButtonColors.valueColor
     * @see InteractiveColor
     */
    fun valueColor(valueColor: Color): LinkButtonColorsBuilder =
        valueColor(valueColor.asInteractive())

    /**
     * Устанавливает цвет иконки кнопки [iconColor]
     * @see ButtonColors.iconColor
     * @see InteractiveColor
     */
    fun iconColor(iconColor: InteractiveColor): LinkButtonColorsBuilder

    /**
     * Устанавливает цвет иконки кнопки [iconColor]
     * @see ButtonColors.iconColor
     * @see InteractiveColor
     */
    fun iconColor(iconColor: Color): LinkButtonColorsBuilder =
        iconColor(iconColor.asInteractive())

    /**
     * Устанавливает цвет индикатора загрузки кнопки [spinnerColor]
     * @see ButtonColors.spinnerColor
     * @see InteractiveColor
     */
    fun spinnerColor(spinnerColor: InteractiveColor): LinkButtonColorsBuilder

    /**
     * Устанавливает цвет индикатора загрузки кнопки [spinnerColor]
     * @see ButtonColors.spinnerColor
     * @see InteractiveColor
     */
    fun spinnerColor(spinnerColor: Color): LinkButtonColorsBuilder =
        spinnerColor(spinnerColor.asInteractive())

    /**
     * Возвращает готовый экземпляр [ButtonColors]
     */
    fun build(): ButtonColors

    companion object {
        /**
         * Возвращает экземпляр [ButtonColorsBuilder]
         */
        fun builder(): LinkButtonColorsBuilder = DefaultLinkButtonColors.Builder()
    }
}

@Stable
private class LinkButtonStyleBuilderImpl(override val receiver: Any?) : LinkButtonStyleBuilder {
    private var shape: CornerBasedShape? = null
    private var colorsBuilder: LinkButtonColorsBuilder = LinkButtonColorsBuilder.builder()
    private var labelStyle: TextStyle? = null
    private var valueStyle: TextStyle? = null
    private var dimensions: Button.Dimensions? = null
    private var disableAlpha: Float? = null
    private var spinnerMode: Button.SpinnerMode? = null

    override fun shape(shape: CornerBasedShape) = apply {
        this.shape = shape
    }

    @Composable
    override fun colors(builder: @Composable LinkButtonColorsBuilder.() -> Unit): LinkButtonStyleBuilder = apply {
        this.colorsBuilder.builder()
    }

    override fun labelStyle(labelStyle: TextStyle) = apply {
        this.labelStyle = labelStyle
    }

    override fun valueStyle(valueStyle: TextStyle) = apply {
        this.valueStyle = valueStyle
    }

    override fun dimensions(dimensions: Button.Dimensions) = apply {
        this.dimensions = dimensions
    }

    override fun disableAlpha(disableAlpha: Float) = apply {
        this.disableAlpha = disableAlpha
    }

    override fun spinnerMode(spinnerMode: Button.SpinnerMode) = apply {
        this.spinnerMode = spinnerMode
    }

    override fun style(): ButtonStyle {
        return DefaultButtonStyle(
            shape = shape ?: RoundedCornerShape(25),
            colors = colorsBuilder.build(),
            labelStyle = labelStyle ?: TextStyle.Default,
            valueStyle = valueStyle ?: TextStyle.Default,
            dimensions = dimensions ?: Button.Dimensions(),
            disableAlpha = disableAlpha ?: DISABLED_BUTTON_ALPHA,
            spinnerMode = spinnerMode ?: Button.SpinnerMode.HideContent,
        )
    }
}

@Immutable
private class DefaultLinkButtonColors(
    override val contentColor: InteractiveColor,
    override val backgroundColor: InteractiveColor,
    override val labelColor: InteractiveColor,
    override val valueColor: InteractiveColor,
    override val iconColor: InteractiveColor,
    override val spinnerColor: InteractiveColor,
) : ButtonColors {

    class Builder : LinkButtonColorsBuilder {
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
            val contentColor = contentColor ?: Color.Black.asInteractive()
            return DefaultLinkButtonColors(
                contentColor = contentColor,
                backgroundColor = backgroundColor ?: Color.White.asInteractive(),
                labelColor = labelColor ?: contentColor,
                valueColor = valueColor ?: contentColor,
                iconColor = iconColor ?: contentColor,
                spinnerColor = spinnerColor ?: contentColor,
            )
        }
    }
}

private const val DISABLED_BUTTON_ALPHA = 0.4f
