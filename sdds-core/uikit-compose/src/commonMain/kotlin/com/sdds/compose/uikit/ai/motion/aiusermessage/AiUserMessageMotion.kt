package com.sdds.compose.uikit.ai.motion.aiusermessage

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создаёт [Motion] для компонента AiUserMessage.
 *
 * @param style стиль анимации [AiUserMessageMotionStyle]
 * @param motionContext контекст анимации
 */
@Composable
@NonRestartableComposable
fun rememberAiUserMessageMotion(
    style: AiUserMessageMotionStyle = LocalAiUserMessageMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<AiUserMessageMotionStyle> {
    return rememberMotion(style, motionContext)
}
