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
     * Стиль текста Label.
     *
     * @see titleStyle
     */
    @Deprecated(
        message = "Use titleStyle",
        replaceWith = ReplaceWith("titleStyle"),
    )
    val labelStyle: TextStyle

    /**
     * Стиль текста Title
     * @see TextStyle
     */
    val titleStyle: TextStyle

    /**
     * Стили текста Subtitle
     * @see TextStyle
     */
    val subtitleStyles: StatefulValue<TextStyle>

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
     * Цвет текса в label.
     */
    val labelColor: InteractiveColor

    /**
     * Цвет фона.
     *
     * @see backgroundBrush
     */
    @Deprecated(
        message = "Use backgroundBrush: StatefulValue<Brush>",
        replaceWith = ReplaceWith("backgroundBrush"),
    )
    val backgroundColor: InteractiveColor

    /**
     * Цвет текста в title
     * @see Brush
     */
    val titleColor: StatefulValue<Brush>

    /**
     * Кисть текста в subtitle
     * @see Brush
     */
    val subtitleBrush: StatefulValue<Brush>

    /**
     * Кисть фона
     * @see Brush
     */
    val backgroundBrush: StatefulValue<Brush>
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
     * Максимальная ширина контента
     */
    val contentMaxWidth: Dp

    /**
     * Максимальная высота контента
     */
    val contentMaxHeight: Dp

    /**
     * Отступ между content и label
     */
    val mainAxisGap: Dp

    /**
     * Отступ между title и subtitle
     */
    val subtitleGap: StatefulValue<Dp>
}
