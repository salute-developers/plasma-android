package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
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

    companion object {
        /**
         * Возвращает экземпляр [CounterStyleBuilder]
         */
        fun builder(receiver: Any? = null): CounterStyleBuilder = CounterStyleBuilderImpl(receiver)
    }
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
    @Deprecated("Use backgroundBrush")
    val backgroundColor: InteractiveColor

    /**
     * Кисть фона
     */
    val backgroundBrush: StatefulValue<Brush>

    /**
     * Цвет текста
     * @see InteractiveColor
     */
    @Deprecated("Use textBrush")
    val textColor: InteractiveColor

    /**
     * Кисть текста
     */
    val textBrush: StatefulValue<Brush>
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
