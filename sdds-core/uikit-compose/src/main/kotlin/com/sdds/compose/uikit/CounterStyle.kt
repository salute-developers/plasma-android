package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.style.Style

/**
 * Стиль Counter
 */
@Immutable
interface CounterStyle : Style {

    /**
     * Цвета
     * @see CounterColors
     */
    val colors: CounterColors

    /**
     * Размеры и отступы контента
     * @see CounterDimensions
     */
    val dimensions: CounterDimensions

    /**
     * Форма
     * @see CornerBasedShape
     */
    val shape: CornerBasedShape

    /**
     * Стиль основного текста
     * @see TextStyle
     */
    val textStyle: TextStyle

    /**
     * Значение прозрачности выключенного компонента
     */
    val disableAlpha: Float

    companion object
}

/**
 * Цвета компонента
 */
@Immutable
interface CounterColors {

    /**
     * Цвет фона
     * @see InteractiveColor
     */
    val backgroundColor: InteractiveColor

    /**
     * Цвет текста
     * @see InteractiveColor
     */
    val textColor: InteractiveColor
}

/**
 * Размеры и отступы, которые используются внутри Counter.
 *
 */
@Immutable
interface CounterDimensions {

    /**
     * Минимальная ширина компонента
     */
    val minWidth: Dp

    /**
     * Минимальная высота компонента
     */
    val minHeight: Dp

    /**
     * Отступ слева
     */
    val paddingStart: Dp

    /**
     * Отступ справа
     */
    val paddingEnd: Dp
}
