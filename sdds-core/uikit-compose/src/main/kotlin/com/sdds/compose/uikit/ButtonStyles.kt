package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.Style

/**
 * Builder для [ButtonColors].
 */
interface ButtonColorsBuilder {

    /**
     * Устанавливает цвет контента кнопки [contentColor]
     * @see ButtonColors.contentColor
     * @see InteractiveColor
     */
    fun contentColor(contentColor: InteractiveColor): ButtonColorsBuilder

    /**
     * Устанавливает цвет контента кнопки [contentColor]
     * @see ButtonColorsBuilder.contentColor
     * @see ButtonColors.contentColor
     * @see InteractiveColor
     */
    fun contentColor(contentColor: Color): ButtonColorsBuilder =
        contentColor(contentColor.asInteractive())

    /**
     * Устанавливает цвет фона кнопки [backgroundColor]
     * @see ButtonColors.backgroundColor
     * @see InteractiveColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): ButtonColorsBuilder

    /**
     * Устанавливает цвет фона кнопки [backgroundColor]
     * @see ButtonColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): ButtonColorsBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Устанавливает цвет основного текста кнопки [labelColor]
     * @see ButtonColors.labelColor
     * @see InteractiveColor
     */
    fun labelColor(labelColor: InteractiveColor): ButtonColorsBuilder

    /**
     * Устанавливает цвет основного текста кнопки [labelColor]
     * @see ButtonColors.labelColor
     * @see InteractiveColor
     */
    fun labelColor(labelColor: Color): ButtonColorsBuilder =
        labelColor(labelColor.asInteractive())

    /**
     * Устанавливает цвет дополнительного текста кнопки [valueColor]
     * @see ButtonColors.valueColor
     * @see InteractiveColor
     */
    fun valueColor(valueColor: InteractiveColor): ButtonColorsBuilder

    /**
     * Устанавливает цвет дополнительного текста кнопки [valueColor]
     * @see ButtonColors.valueColor
     * @see InteractiveColor
     */
    fun valueColor(valueColor: Color): ButtonColorsBuilder =
        valueColor(valueColor.asInteractive())

    /**
     * Устанавливает цвет иконки кнопки [iconColor]
     * @see ButtonColors.iconColor
     * @see InteractiveColor
     */
    fun iconColor(iconColor: InteractiveColor): ButtonColorsBuilder

    /**
     * Устанавливает цвет иконки кнопки [iconColor]
     * @see ButtonColors.iconColor
     * @see InteractiveColor
     */
    fun iconColor(iconColor: Color): ButtonColorsBuilder =
        iconColor(iconColor.asInteractive())

    /**
     * Устанавливает цвет индикатора загрузки кнопки [spinnerColor]
     * @see ButtonColors.spinnerColor
     * @see InteractiveColor
     */
    fun spinnerColor(spinnerColor: InteractiveColor): ButtonColorsBuilder

    /**
     * Устанавливает цвет индикатора загрузки кнопки [spinnerColor]
     * @see ButtonColors.spinnerColor
     * @see InteractiveColor
     */
    fun spinnerColor(spinnerColor: Color): ButtonColorsBuilder =
        spinnerColor(spinnerColor.asInteractive())

    /**
     * Возвращает готовый экземпляр [ButtonColors]
     */
    fun build(): ButtonColors
}

/**
 * Стиль кнопки [Button]
 */
@Stable
interface ButtonStyle : Style {

    /**
     * Форма кнопки
     * @see CornerBasedShape
     */
    val shape: CornerBasedShape

    /**
     * Цвета кнопки
     * @see ButtonColors
     */
    val colors: ButtonColors

    /**
     * Стиль основного текста кнопки
     * @see TextStyle
     */
    val labelStyle: TextStyle

    /**
     * Стиль дополнительного текста кнопки
     * @see TextStyle
     */
    val valueStyle: TextStyle

    /**
     * Размеры и отступы контента кнопки
     * @see Button.Dimensions
     */
    val dimensions: Button.Dimensions

    /**
     * Значение прозрачности выключенной кнопки
     */
    val disableAlpha: Float

    /**
     * Режим работы индикатора загрузки
     * @see Button.SpinnerMode
     */
    val spinnerMode: Button.SpinnerMode
}

/**
 * Цвета кнопки
 */
@Stable
interface ButtonColors {

    /**
     * Цвет контента кнопки
     * @see InteractiveColor
     */
    val contentColor: InteractiveColor

    /**
     * Цвет фона кнопки
     * @see InteractiveColor
     */
    val backgroundColor: InteractiveColor

    /**
     * Цвет основного текста кнопки
     * @see InteractiveColor
     */
    val labelColor: InteractiveColor

    /**
     * Цвет дополнительного текста кнопки
     * @see InteractiveColor
     */
    val valueColor: InteractiveColor

    /**
     * Цвет иконки кнопки
     * @see InteractiveColor
     */
    val iconColor: InteractiveColor

    /**
     * Цвет индикатора загрузки кнопки
     * @see InteractiveColor
     */
    val spinnerColor: InteractiveColor

    companion object {

        /**
         * Возвращает экземпляр [ButtonColorsBuilder]
         */
        fun builder(): ButtonColorsBuilder = DefaultButtonColors.Builder()
    }
}

@Immutable
private class DefaultButtonColors(
    override val contentColor: InteractiveColor,
    override val backgroundColor: InteractiveColor,
    override val labelColor: InteractiveColor,
    override val valueColor: InteractiveColor,
    override val iconColor: InteractiveColor,
    override val spinnerColor: InteractiveColor,
) : ButtonColors {

    class Builder : ButtonColorsBuilder {
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
            return DefaultButtonColors(
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

@Immutable
internal class DefaultButtonStyle(
    override val shape: CornerBasedShape,
    override val colors: ButtonColors,
    override val labelStyle: TextStyle,
    override val valueStyle: TextStyle,
    override val dimensions: Button.Dimensions,
    override val disableAlpha: Float,
    override val spinnerMode: Button.SpinnerMode,
) : ButtonStyle
