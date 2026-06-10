package com.sdds.compose.uikit.motion.components.divider

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [Divider]
 * @param motionContext контекст анимации
 * @param style стиль анимации [Divider]
 */
@Composable
@NonRestartableComposable
fun rememberDividerMotion(
    style: DividerMotionStyle = LocalDividerMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<DividerMotionStyle> {
    return rememberMotion(style, motionContext)
}
