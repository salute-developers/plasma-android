package com.sdds.compose.uikit.motion.components.progressbar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [CircularProgressBar]
 * @param motionContext контекст анимации
 * @param style стиль анимации [CircularProgressBar]
 */
@Composable
@NonRestartableComposable
fun rememberCircularProgressBarMotion(
    style: CircularProgressBarMotionStyle = LocalCircularProgressBarMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<CircularProgressBarMotionStyle> {
    return rememberMotion(style, motionContext)
}
