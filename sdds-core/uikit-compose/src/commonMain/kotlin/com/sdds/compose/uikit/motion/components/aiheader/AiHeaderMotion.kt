package com.sdds.compose.uikit.motion.components.aiheader

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создаёт [Motion] для компонента AiHeader.
 *
 * @param style стиль анимации [AiHeaderMotionStyle]
 * @param motionContext контекст анимации
 */
@Composable
@NonRestartableComposable
fun rememberAiHeaderMotion(
    style: AiHeaderMotionStyle = LocalAiHeaderMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<AiHeaderMotionStyle> {
    return rememberMotion(style, motionContext)
}
