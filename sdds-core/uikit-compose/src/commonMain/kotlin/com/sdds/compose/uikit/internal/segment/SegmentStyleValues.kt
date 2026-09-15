package com.sdds.compose.uikit.internal.segment

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.getDpAsState

/**
 * Сохраняет состояния однотонных заливок в старом цветовом API.
 * Градиенты, не представимые как Color, возвращаются как Color.Transparent.
 */
@Suppress("SpreadOperator")
internal fun StatefulValue<Brush>.asLegacyColor(): InteractiveColor =
    getDefaultValue().legacyColor().asInteractive(
        *getStateSets().zip(getValues()) { states, brush -> states to brush.legacyColor() }.toTypedArray(),
    )

private fun Brush.legacyColor(): Color = (this as? SolidColor)?.value ?: Color.Transparent

/**
 * Неопределённые размеры переключаются без интерполяции, чтобы не анимировать NaN.
 */
@Composable
internal fun StatefulValue<Dp>.getSegmentDpAsState(
    context: MotionContext,
    motionProperty: MotionProperty<Dp>,
): State<Dp> = if (getDefaultValue().value.isFinite() && getValues().all { it.value.isFinite() }) {
    getDpAsState(context, motionProperty)
} else {
    getValueAsState(context)
}
