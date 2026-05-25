package com.sdds.compose.uikit.motion.components.button

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [Button]
 * @param motionContext контекст анимации
 * @param style стиль анимации [Button]
 */
@Composable
@NonRestartableComposable
fun rememberButtonMotion(
    style: ButtonMotionStyle = LocalButtonMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<ButtonMotionStyle> {
    return rememberMotion(style, motionContext)
}
