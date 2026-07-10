package com.sdds.compose.uikit.motion.components.badge

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [Badge]
 * @param motionContext контекст анимации
 * @param style стиль анимации [Badge]
 */
@Composable
@NonRestartableComposable
fun rememberBadgeMotion(
    style: BadgeMotionStyle = LocalBadgeMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<BadgeMotionStyle> {
    return rememberMotion(style, motionContext)
}
