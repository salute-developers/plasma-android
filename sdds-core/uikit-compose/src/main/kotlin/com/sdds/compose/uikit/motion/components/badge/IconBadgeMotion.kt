package com.sdds.compose.uikit.motion.components.badge

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [IconBadge]
 * @param motionContext контекст анимации
 * @param style стиль анимации [IconBadge]
 */
@Composable
@NonRestartableComposable
fun rememberIconBadgeMotion(
    style: IconBadgeMotionStyle = LocalIconBadgeMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<IconBadgeMotionStyle> {
    return rememberMotion(style, motionContext)
}
