package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.style.Style

/**
 * Стиль Badge
 */
@Stable
interface BadgeStyle : Style {

    /**
     * Размеры и отступы контента
     * @see BadgeDimensions
     */
    val dimensions: BadgeDimensions

    /**
     * Цвета
     * @see BadgeColors
     */
    val colors: BadgeColors

    /**
     * Форма
     * @see CornerBasedShape
     */
    val shape: CornerBasedShape

    /**
     * Стиль основного текста
     * @see TextStyle
     */
    val labelStyle: TextStyle

    /**
     * Значение прозрачности выключенного компонента
     */
    val disableAlpha: Float

    companion object
}

/**
 * Размеры и отступы, которые используются внутри Badge.
 *
 */
@Stable
interface BadgeDimensions {

    /**
     * Высота компонента
     */
    val height: Dp

    /**
     * Размер контента в начале
     */
    val startContentSize: Dp

    /**
     * Размер контента в конце
     */
    val endContentSize: Dp

    /**
     * Отступы контента в начале
     */
    val startContentMargin: Dp

    /**
     * Отступы контента в конце
     */
    val endContentMargin: Dp

    /**
     * Отступ от начала компонента до контента
     */
    val startPadding: Dp

    /**
     * Отступ от контента до конца компонента
     */
    val endPadding: Dp
}

/**
 * Цвета компонента
 */
@Stable
interface BadgeColors {

    /**
     * Цвет контента
     * @see InteractiveColor
     */
    val contentColor: InteractiveColor

    /**
     * Цвет фона
     * @see InteractiveColor
     */
    val backgroundColor: InteractiveColor

    /**
     * Цвет основного текста
     * @see InteractiveColor
     */
    val labelColor: InteractiveColor

    /**
     * Цвет контента в начале
     * @see InteractiveColor
     */
    val startContentColor: InteractiveColor

    /**
     * Цвет контента в конце
     * @see InteractiveColor
     */
    val endContentColor: InteractiveColor
}
