package com.sdds.compose.uikit.motion.components.switcher

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [Switch]
 * @param motionContext контекст анимации
 * @param style стиль анимации [Switch]
 */
@Composable
@NonRestartableComposable
fun rememberSwitchMotion(
    style: SwitchMotionStyle = LocalSwitchMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<SwitchMotionStyle> {
    return rememberMotion(style, motionContext)
}
