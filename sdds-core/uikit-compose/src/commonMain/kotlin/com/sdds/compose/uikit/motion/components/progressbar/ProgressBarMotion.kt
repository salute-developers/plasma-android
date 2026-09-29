package com.sdds.compose.uikit.motion.components.progressbar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [ProgressBar]
 * @param motionContext контекст анимации
 * @param style стиль анимации [ProgressBar]
 */
@Composable
@NonRestartableComposable
fun rememberProgressBarMotion(
    style: ProgressBarMotionStyle = LocalProgressBarMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<ProgressBarMotionStyle> {
    return rememberMotion(style, motionContext)
}
