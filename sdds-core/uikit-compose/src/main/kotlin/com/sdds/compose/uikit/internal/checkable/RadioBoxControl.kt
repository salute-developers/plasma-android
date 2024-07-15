package com.sdds.compose.uikit.internal.checkable

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Control вида RadioBox для [BaseCheckableLayout]
 * @param checked флаг-индикатор выбора
 * @param focused флаг-индикатор состояния фокуса
 * @param controlSize размер заполняющего круга контрола
 * @param baseSize размер базового круга контрола
 * @param modifier модификатор
 * @param strokeWidth Ширина линии в состоянии checked = false
 * @param checkedStrokeWidth ширина линии в состоянии checked = true
 * @param checkedPadding отступ в состоянии checked = true
 * @param animationDuration длительность анимации
 * @param colors цвета RadioBox
 */
@Composable
internal fun RadioBoxControl(
    checked: Boolean,
    focused: Boolean,
    controlSize: Dp,
    baseSize: Dp,
    modifier: Modifier = Modifier,
    strokeWidth: Dp,
    checkedStrokeWidth: Dp,
    checkedPadding: Dp,
    animationDuration: Int,
    colors: RadioBoxColors,
) {
    val targetCheckedRadius = baseSize / 2
    val radioRadius = controlSize / 2
    val baseRadius = animateDpAsState(
        targetValue = if (checked) targetCheckedRadius else 0.dp,
        animationSpec = tween(durationMillis = animationDuration),
        label = "baseRadius",
    )
    val radioColor = colors.radioColorFill(checked)
    val borderColor = colors.borderColor(checked, focused)
    val baseColor = colors.radioColorBase()

    Canvas(
        modifier
            .wrapContentSize(Alignment.Center)
            .requiredSize(controlSize),
    ) {
        val strokeWidth = if (checked) checkedStrokeWidth.toPx() else strokeWidth.toPx()
        if ((checked && focused) || !checked) {
            // Рисуем пограничную окружность
            val borderRadius =
                if (focused) radioRadius.toPx() else (radioRadius - checkedPadding).toPx()
            drawCircle(
                borderColor.value,
                borderRadius - strokeWidth,
                style = Stroke(strokeWidth),
            )
        }

        if (checked) {
            // Рисуем заполняющий круг при checked = true
            drawCircle(
                radioColor.value,
                (radioRadius - checkedPadding).toPx() - strokeWidth / 2,
                style = Fill,
            )
        }

        if (baseRadius.value > 0.dp) {
            // Рисуем основной круг при checked = true
            drawCircle(baseColor.value, baseRadius.value.toPx(), style = Fill)
        }
    }
}
