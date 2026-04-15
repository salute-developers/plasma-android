package com.sdds.compose.uikit.motion.components.counter

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [Counter]
 * @param motionContext контекст анимации
 * @param style стиль анимации [Counter]
 */
@Composable
@NonRestartableComposable
fun rememberCounterMotion(
    style: CounterMotionStyle = LocalCounterMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<CounterMotionStyle> {
    return rememberMotion(style, motionContext)
}
