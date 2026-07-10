package com.sdds.compose.uikit.motion.components.skeleton

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [TextSkeleton]
 * @param motionContext контекст анимации
 * @param style стиль анимации [TextSkeleton]
 */
@Composable
@NonRestartableComposable
fun rememberTextSkeletonMotion(
    style: TextSkeletonMotionStyle = LocalTextSkeletonMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<TextSkeletonMotionStyle> {
    return rememberMotion(style, motionContext)
}
