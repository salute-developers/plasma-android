package com.sdds.compose.uikit.motion.components.aiinput

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создаёт [Motion] для компонента AiInput.
 *
 * @param style стиль анимации [AiInputMotionStyle]
 * @param motionContext контекст анимации
 */
@Composable
@NonRestartableComposable
fun rememberAiInputMotion(
    style: AiInputMotionStyle = LocalAiInputMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<AiInputMotionStyle> {
    return rememberMotion(style, motionContext)
}
