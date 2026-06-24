package com.sdds.compose.uikit.motion.components.skeleton

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [RectSkeleton]
 * @param motionContext контекст анимации
 * @param style стиль анимации [RectSkeleton]
 */
@Composable
@NonRestartableComposable
fun rememberRectSkeletonMotion(
    style: RectSkeletonMotionStyle = LocalRectSkeletonMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<RectSkeletonMotionStyle> {
    return rememberMotion(style, motionContext)
}
