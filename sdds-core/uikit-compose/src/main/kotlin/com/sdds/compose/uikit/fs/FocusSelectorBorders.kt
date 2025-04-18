package com.sdds.compose.uikit.fs

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.focusselector.FocusSelectorBorderNone
import com.sdds.compose.uikit.internal.focusselector.FocusSelectorGradientAnimatedBorder
import com.sdds.compose.uikit.internal.focusselector.FocusSelectorGradientBorder
import com.sdds.compose.uikit.internal.focusselector.FocusSelectorSolidBorder

/**
 * Вспомогательный объект для создания
 * разных borders фокус-селектора
 */
object FocusSelectorBorders {

    /**
     * Выключает FocusSelectorBorder
     */
    fun none(): FocusSelectorBorder = FocusSelectorBorderNone

    /**
     *  Создает SolidBorder
     *  @param shape форма бордера
     *  @param shapeAdjustment корректирующее значение для shape
     *  @param strokeWidth ширина бордера
     *  @param strokeInsets отступы бордера
     *  @param color цвет бордера
     */
    fun solid(
        shape: Shape = RoundedCornerShape(5),
        shapeAdjustment: Dp = 0.dp,
        strokeWidth: Dp = DEFAULT_STROKE_WIDTH.dp,
        strokeInsets: Dp = DEFAULT_STROKE_INSETS.dp,
        color: Color = Color.Gray,
    ): FocusSelectorBorder = FocusSelectorSolidBorder(
        shape = shape,
        shapeAdjustment = shapeAdjustment,
        strokeWidth = strokeWidth,
        strokeInsets = strokeInsets,
        color = color,
    )

    /**
     *  Создает GradientBorder
     *  @param shape форма бордера
     *  @param shapeAdjustment корректирующее значение для shape
     *  @param strokeWidth ширина бордера
     *  @param strokeInsets отступы бордера
     *  @param brush заливка градиента бордера
     */
    fun gradient(
        shape: Shape = RoundedCornerShape(5),
        shapeAdjustment: Dp = 0.dp,
        strokeWidth: Dp = DEFAULT_STROKE_WIDTH.dp,
        strokeInsets: Dp = DEFAULT_STROKE_INSETS.dp,
        brush: Brush = Brush.linearGradient(
            colors = listOf(Color.LightGray, Color.DarkGray),
        ),
    ): FocusSelectorBorder = FocusSelectorGradientBorder(
        shape = shape,
        shapeAdjustment = shapeAdjustment,
        strokeWidth = strokeWidth,
        strokeInsets = strokeInsets,
        brush = brush,
    )

    /**
     *  Создает AnimatedGradientBorder
     *  @param shape форма бордера
     *  @param shapeAdjustment корректирующее значение для shape
     *  @param strokeWidth ширина бордера
     *  @param strokeInsets отступы бордера
     *  @param mainColor цвет анимированной части бордера
     *  @param additionalColor цвет статичной части бордера,
     */
    fun animatedGradient(
        shape: Shape = RoundedCornerShape(5),
        shapeAdjustment: Dp = 0.dp,
        strokeWidth: Dp = DEFAULT_STROKE_WIDTH.dp,
        strokeInsets: Dp = DEFAULT_STROKE_INSETS.dp,
        mainColor: Color = Color.Green,
        additionalColor: Color = Color.White,
    ): FocusSelectorBorder = FocusSelectorGradientAnimatedBorder(
        shape = shape,
        shapeAdjustment = shapeAdjustment,
        strokeWidth = strokeWidth,
        strokeInsets = strokeInsets,
        mainColor = mainColor,
        additionalColor = additionalColor,
    )
}
private const val DEFAULT_STROKE_INSETS = 2
private const val DEFAULT_STROKE_WIDTH = 2
