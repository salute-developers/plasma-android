package com.sdds.compose.uikit.internal.checkable

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times
import com.sdds.compose.uikit.RadioBoxColors
import com.sdds.compose.uikit.RadioBoxDimensions

/**
 * Control вида RadioBox для [BaseCheckableLayout]
 * @param checked флаг-индикатор выбора
 * @param focused флаг-индикатор состояния фокуса
 * @param modifier модификатор
 * @param dimensions размеры и отступы
 * @param animationDuration длительность анимации
 * @param colors цвета RadioBox
 */
@Composable
internal fun RadioBoxControl(
    checked: Boolean,
    focused: Boolean,
    dimensions: RadioBoxDimensions,
    animationDuration: Int,
    colors: RadioBoxColors,
    modifier: Modifier = Modifier,
) {
    val focusBorderPadding = FocusBorderPadding
    val targetCheckedRadius = dimensions.innerDiameter / 2
    val baseRadius = animateDpAsState(
        targetValue = if (checked) targetCheckedRadius else 0.dp,
        animationSpec = tween(durationMillis = animationDuration),
        label = "baseRadius",
    )
    val radioColor = colors.checkedColor
    val borderColor = colors.controlBorderColor(checked, focused)
    val baseColor = colors.baseColor

    Canvas(
        modifier
            .wrapContentSize(Alignment.Center)
            .requiredSize(dimensions.controlSize),
    ) {
        val radioRadius = dimensions.controlSize.toPx() / 2 - dimensions.checkedPadding.toPx()
        val strokeWidth = if (checked) dimensions.checkedStrokeWidth.toPx() else dimensions.strokeWidth.toPx()
        if ((checked && focused) || !checked) {
            // Рисуем пограничную окружность
            val borderRadius =
                if (focused) (size.width + FocusBorderPadding.toPx()) / 2 else radioRadius
            drawCircle(
                borderColor.value,
                borderRadius - strokeWidth,
                style = Stroke(strokeWidth),
            )
        }

        if (checked) {
            // Рисуем заполняющий круг при checked = true
            drawCircle(
                radioColor,
                radioRadius,
                style = Fill,
            )
        }

        if (baseRadius.value > 0.dp) {
            // Рисуем основной круг при checked = true
            drawCircle(baseColor, baseRadius.value.toPx(), style = Fill)
        }
    }
}

private val FocusBorderPadding = 2.dp
