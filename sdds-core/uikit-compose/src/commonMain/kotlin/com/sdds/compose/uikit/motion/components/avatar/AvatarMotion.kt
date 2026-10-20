package com.sdds.compose.uikit.motion.components.avatar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [Avatar]
 * @param motionContext контекст анимации
 * @param style стиль анимации [Avatar]
 */
@Composable
@NonRestartableComposable
fun rememberAvatarMotion(
    style: AvatarMotionStyle = LocalAvatarMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<AvatarMotionStyle> {
    return rememberMotion(style, motionContext)
}
