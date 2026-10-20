package com.sdds.compose.uikit.motion.components.avatar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [AvatarGroup]
 * @param motionContext контекст анимации
 * @param style стиль анимации [AvatarGroup]
 */
@Composable
@NonRestartableComposable
fun rememberAvatarGroupMotion(
    motionContext: MotionContext = rememberMotionContext(),
): Motion<AvatarGroupMotionStyle> {
    return rememberMotion(AvatarGroupMotionStylePlaceholder, motionContext)
}

private object AvatarGroupMotionStylePlaceholder : AvatarGroupMotionStyle
