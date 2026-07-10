package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
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
    @Deprecated("Use shapes", replaceWith = ReplaceWith("shapes"))
    val shape: CornerBasedShape

    /**
     * Формы кнопки
     */
    val shapes: StatefulValue<CornerBasedShape>

    /**
     * Цвета кнопки
     * @see ButtonColors
     */
    val colors: ButtonColors

    /**
     * Стиль основного текста кнопки
     * @see TextStyle
     */
    @Deprecated("Use labelStyles", replaceWith = ReplaceWith("labelStyles"))
    val labelStyle: TextStyle

    /**
     * Стили основного текста кнопки
     */
    val labelStyles: StatefulValue<TextStyle>

    /**
     * Стиль дополнительного текста кнопки
     * @see TextStyle
     */
    @Deprecated("Use valueStyles", replaceWith = ReplaceWith("valueStyles"))
    val valueStyle: TextStyle

    /**
     * Стили дополнительного текста кнопки
     */
    val valueStyles: StatefulValue<TextStyle>

    /**
     * Размеры и отступы контента кнопки
     * @see ButtonDimensions
     */
    val dimensions: ButtonDimension

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
    @Deprecated("Use backgroundBrush", replaceWith = ReplaceWith("backgroundBrush"))
    val backgroundColor: InteractiveColor

    /**
     * Кисти фона кнопки
     */
    val backgroundBrush: StatefulValue<Brush>

    /**
     * Цвет основного текста кнопки
     * @see InteractiveColor
     */
    @Deprecated("Use labelBrush", replaceWith = ReplaceWith("labelBrush"))
    val labelColor: InteractiveColor

    /**
     * Кисти основного текста кнопки
     */
    val labelBrush: StatefulValue<Brush>

    /**
     * Цвет дополнительного текста кнопки
     * @see InteractiveColor
     */
    @Deprecated("Use valueBrush", replaceWith = ReplaceWith("valueBrush"))
    val valueColor: InteractiveColor

    /**
     * Кисти дополнительного текста кнопки
     */
    val valueBrush: StatefulValue<Brush>

    /**
     * Цвет иконки кнопки
     * @see InteractiveColor
     */
    @Deprecated("Use iconBrush", replaceWith = ReplaceWith("iconBrush"))
    val iconColor: InteractiveColor

    /**
     * Кисти иконки кнопки
     */
    val iconBrush: StatefulValue<Brush>

    /**
     * Цвет индикатора загрузки кнопки
     * @see InteractiveColor
     */
    val spinnerColor: InteractiveColor
}

/**
 * Размеры кнопки
 */
@Stable
interface ButtonDimension {
    /**
     * Высота кнопки
     */
    val heightValues: StatefulValue<Dp>

    /**
     * Отступ кнопки в начале
     */
    val paddingStartValues: StatefulValue<Dp>

    /**
     * Отступ кнопки в конце
     */
    val paddingEndValues: StatefulValue<Dp>

    /**
     * Минимальная ширина кнопки
     */
    val minWidthValues: StatefulValue<Dp>

    /**
     * Размер иконки
     */
    val iconSizeValues: StatefulValue<Dp>

    /**
     * Размер спиннера
     */
    val spinnerSizeValues: StatefulValue<Dp>

    /**
     * Толщина спиннера
     */
    val spinnerStrokeWidthValues: StatefulValue<Dp>

    /**
     * Отступ иконки
     */
    val iconMarginValues: StatefulValue<Dp>

    /**
     * Отступ доп. текста
     */
    val valueMarginValues: StatefulValue<Dp>
}
