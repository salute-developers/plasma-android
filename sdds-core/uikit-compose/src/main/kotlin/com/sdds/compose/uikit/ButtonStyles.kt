package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.style.Style

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
     * Значение прозрачности кнопки в состоянии загрузки
     */
    val loadingAlpha: Float

    companion object
}

/**
 * Цвета кнопки
 */
@Stable
interface ButtonColors {

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
}
