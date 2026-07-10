package com.sdds.compose.uikit.motion.components.radiobox

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [RadioBox]
 * @param motionContext контекст анимации
 * @param style стиль анимации [RadioBox]
 */
@Composable
@NonRestartableComposable
fun rememberRadioBoxMotion(
    style: RadioBoxMotionStyle = LocalRadioBoxMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<RadioBoxMotionStyle> {
    return rememberMotion(style, motionContext)
}
