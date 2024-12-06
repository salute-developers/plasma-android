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
     * @see [ButtonColorsBuilder]
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
     * Устанавливает размеры и отступы контента кнопки [dimensions]
     * @see ButtonStyle.dimensions
     * @see Button.Dimensions
     */
    fun dimensions(dimensions: Button.Dimensions): BasicButtonStyleBuilder

    /**
     * Устанавливает значение прозрачности выключенной кнопки [disableAlpha]
     * @see ButtonStyle.disableAlpha
     */
    fun disableAlpha(disableAlpha: Float): BasicButtonStyleBuilder
}

/**
 * Builder для [ButtonColors].
 */
interface BasicButtonColorsBuilder {

    /**
     * Устанавливает цвет контента кнопки [contentColor]
     * @see ButtonColors.contentColor
     * @see InteractiveColor
     */
    fun contentColor(contentColor: InteractiveColor): BasicButtonColorsBuilder

    /**
     * Устанавливает цвет контента кнопки [contentColor]
     * @see BasicButtonColorsBuilder.contentColor
     * @see ButtonColors.contentColor
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
     * Устанавливает режим работы индикатора загрузки [spinnerMode]
     * @see ButtonColors.spinnerMode
     * @see Button.SpinnerMode
     */
    fun spinnerMode(spinnerMode: Button.SpinnerMode): BasicButtonColorsBuilder

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

@Stable
private class BasicButtonStyleBuilderImpl(override val receiver: Any?) : BasicButtonStyleBuilder {
    private var shape: CornerBasedShape? = null
    private var colorsBuilder: BasicButtonColorsBuilder = BasicButtonColorsBuilder.builder()
    private var labelStyle: TextStyle? = null
    private var valueStyle: TextStyle? = null
    private var dimensions: Button.Dimensions? = null
    private var disableAlpha: Float? = null

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
private class DefaultBasicButtonColors(
    override val contentColor: InteractiveColor,
    override val backgroundColor: InteractiveColor,
    override val labelColor: InteractiveColor,
    override val valueColor: InteractiveColor,
    override val iconColor: InteractiveColor,
    override val spinnerColor: InteractiveColor,
    override val spinnerMode: Button.SpinnerMode,
) : ButtonColors {

    class Builder : BasicButtonColorsBuilder {
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

        override fun spinnerMode(spinnerMode: Button.SpinnerMode) = apply {
            this.spinnerMode = spinnerMode
        }

        override fun build(): ButtonColors {
            val contentColor = contentColor ?: Color.Black.asInteractive()
            return DefaultBasicButtonColors(
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
