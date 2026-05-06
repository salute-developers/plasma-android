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
 * Стиль Badge
 */
@Immutable
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
    @Deprecated(
        "Use labelStyles",
        replaceWith = ReplaceWith(
            "labelStyles",
        ),
    )
    val labelStyle: TextStyle

    /**
     * Стиль основного текста
     */
    val labelStyles: StatefulValue<TextStyle>

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
@Immutable
interface BadgeDimensions {

    /**
     * Высота компонента
     */
    @Deprecated(
        "Use heightValues",
        replaceWith = ReplaceWith("heightValues"),
    )
    val height: Dp

    /**
     * Высота компонента
     */
    val heightValues: StatefulValue<Dp>

    /**
     * Размер контента в начале
     */
    @Deprecated(
        "Use startContentSizeValues",
        replaceWith = ReplaceWith("startContentSizeValues"),
    )
    val startContentSize: Dp

    /**
     * Размер контента в начале
     */
    val startContentSizeValues: StatefulValue<Dp>

    /**
     * Размер контента в конце
     */
    @Deprecated(
        "Use endContentSizeValues",
        replaceWith = ReplaceWith("endContentSizeValues"),
    )
    val endContentSize: Dp

    /**
     * Размер контента в конце
     */
    val endContentSizeValues: StatefulValue<Dp>

    /**
     * Отступы контента в начале
     */
    @Deprecated(
        "Use startContentMarginValues",
        replaceWith = ReplaceWith("startContentMarginValues"),
    )
    val startContentMargin: Dp

    /**
     * Отступы контента в начале
     */
    val startContentMarginValues: StatefulValue<Dp>

    /**
     * Отступы контента в конце
     */
    @Deprecated(
        "Use endContentMarginValues",
        replaceWith = ReplaceWith("endContentMarginValues"),
    )
    val endContentMargin: Dp

    /**
     * Отступы контента в конце
     */
    val endContentMarginValues: StatefulValue<Dp>

    /**
     * Отступ от начала компонента до контента
     */
    @Deprecated(
        "Use startPaddingValues",
        replaceWith = ReplaceWith("startPaddingValues"),
    )
    val startPadding: Dp

    /**
     * Отступ от начала компонента до контента
     */
    val startPaddingValues: StatefulValue<Dp>

    /**
     * Отступ от контента до конца компонента
     */
    @Deprecated(
        "Use endPaddingValues",
        replaceWith = ReplaceWith("endPaddingValues"),
    )
    val endPadding: Dp

    /**
     * Отступ от контента до конца компонента
     */
    val endPaddingValues: StatefulValue<Dp>
}

/**
 * Цвета компонента
 */
@Immutable
interface BadgeColors {

    /**
     * Цвет контента
     * @see InteractiveColor
     */
    @Deprecated(
        "Use contentBrush",
        replaceWith = ReplaceWith("contentBrush"),
    )
    val contentColor: InteractiveColor

    /**
     * Кисть контента
     */
    val contentBrush: StatefulValue<Brush>

    /**
     * Цвет фона
     * @see InteractiveColor
     */
    @Deprecated(
        "Use backgroundBrush",
        replaceWith = ReplaceWith("backgroundBrush"),
    )
    val backgroundColor: InteractiveColor

    /**
     * Кисть фона
     */
    val backgroundBrush: StatefulValue<Brush>

    /**
     * Цвет основного текста
     * @see InteractiveColor
     */
    @Deprecated(
        "Use labelBrush",
        replaceWith = ReplaceWith("labelBrush"),
    )
    val labelColor: InteractiveColor

    /**
     * Кисть основного текста
     */
    val labelBrush: StatefulValue<Brush>

    /**
     * Цвет контента в начале
     * @see InteractiveColor
     */
    @Deprecated(
        "Use startContentBrush",
        replaceWith = ReplaceWith("startContentBrush"),
    )
    val startContentColor: InteractiveColor

    /**
     * Кисть контента в начале
     */
    val startContentBrush: StatefulValue<Brush>

    /**
     * Цвет контента в конце
     * @see InteractiveColor
     */
    @Deprecated(
        "Use endContentBrush",
        replaceWith = ReplaceWith("endContentBrush"),
    )
    val endContentColor: InteractiveColor

    /**
     * Кисть контента в конце
     */
    val endContentBrush: StatefulValue<Brush>
}
