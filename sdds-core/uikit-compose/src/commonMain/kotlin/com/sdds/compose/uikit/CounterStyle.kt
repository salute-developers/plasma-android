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
    @Deprecated("use shapes", ReplaceWith("shapes"))
    val shape: CornerBasedShape

    /**
     * Формы
     * @see CornerBasedShape
     */
    val shapes: StatefulValue<CornerBasedShape>

    /**
     * Стиль основного текста
     * @see TextStyle
     */
    @Deprecated("use textStyles", ReplaceWith("textStyles"))
    val textStyle: TextStyle

    /**
     * Стиль основного текста
     * @see TextStyle
     */
    val textStyles: StatefulValue<TextStyle>

    /**
     * Значение прозрачности выключенного компонента
     */
    val disableAlpha: Float

    companion object {
        /**
         * Возвращает экземпляр [CounterStyleBuilder]
         */
        fun builder(receiver: Any? = null): CounterStyleBuilder = DefaultCounterStyle.Builder(receiver)
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
    @Deprecated("use minWidthValues", ReplaceWith("minWidthValues"))
    val minWidth: Dp

    /**
     * Минимальная ширина компонента
     */
    val minWidthValues: StatefulValue<Dp>

    /**
     * Минимальная высота компонента
     */
    @Deprecated("use minHeightValues", ReplaceWith("minHeightValues"))
    val minHeight: Dp

    /**
     * Минимальная высота компонента
     */
    val minHeightValues: StatefulValue<Dp>

    /**
     * Отступ слева
     */
    @Deprecated("use paddingStartValues", ReplaceWith("paddingStartValues"))
    val paddingStart: Dp

    /**
     * Отступ слева
     */
    val paddingStartValues: StatefulValue<Dp>

    /**
     * Отступ справа
     */
    @Deprecated("use paddingEndValues", ReplaceWith("paddingEndValues"))
    val paddingEnd: Dp

    /**
     * Отступ справа
     */
    val paddingEndValues: StatefulValue<Dp>
}
