package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.style.Style

/**
 * Стиль Card
 */
@Immutable
interface CardStyle : Style {

    /**
     * Цвета Компонента Card
     * @see CardColors
     */
    val colors: CardColors

    /**
     * Форма Card
     * @see CornerBasedShape
     */
    val shape: CornerBasedShape

    /**
     * Ориентация Card
     * @see CardOrientation
     */
    val orientation: CardOrientation

    /**
     * Стиль текста Label
     * @see TextStyle
     */
    val labelStyle: TextStyle

    /**
     * Форма контента Card
     * @see CornerBasedShape
     */
    val contentShape: CornerBasedShape

    /**
     * Отступы контента внутри Card
     * @see CardDimensions
     */
    val dimensions: CardDimensions

    companion object {
        /**
         * Возвращает экземпляр [CardStyleBuilder]
         */
        fun builder(receiver: Any? = null): CardStyleBuilder =
            DefaultCardStyleBuilderImpl(receiver)
    }
}

/**
 * Цвета Card
 */
@Immutable
interface CardColors {

    /**
     * Цвет фона
     * @see InteractiveColor
     */
    val backgroundColor: InteractiveColor
}

/**
 * Внутренние отступы контента
 */
@Immutable
interface CardDimensions {

    /**
     * Внутренний отступ вначале
     */
    val paddingStart: Dp

    /**
     * Внутренний отступ вконце
     */
    val paddingEnd: Dp

    /**
     * Внутренний отступ сверху
     */
    val paddingTop: Dp

    /**
     * Внутренний отступ снизу
     */
    val paddingBottom: Dp

    /**
     * Внутренний отступ у контента вначале
     */
    val contentPaddingStart: Dp

    /**
     * Внутренний отступ у контента вконце
     */
    val contentPaddingEnd: Dp

    /**
     * Внутренний отступ у контента сверху
     */
    val contentPaddingTop: Dp

    /**
     * Внутренний отступ у контента снизу
     */
    val contentPaddingBottom: Dp

    /**
     * Минимальная ширина контента
     */
    val contentMinWidth: Dp

    /**
     * Минимальная высота контента
     */
    val contentMinHeight: Dp

    /**
     * Отступ между content и label
     */
    val mainAxisGap: Dp
}
