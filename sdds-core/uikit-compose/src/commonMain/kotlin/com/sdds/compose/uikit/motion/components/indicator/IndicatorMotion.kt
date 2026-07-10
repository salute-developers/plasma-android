package com.sdds.compose.uikit.motion.components.indicator

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [Indicator]
 * @param motionContext контекст анимации
 * @param style стиль анимации [Indicator]
 */
@Composable
@NonRestartableComposable
fun rememberIndicatorMotion(
    style: IndicatorMotionStyle = LocalIndicatorMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<IndicatorMotionStyle> {
    return rememberMotion(style, motionContext)
}
