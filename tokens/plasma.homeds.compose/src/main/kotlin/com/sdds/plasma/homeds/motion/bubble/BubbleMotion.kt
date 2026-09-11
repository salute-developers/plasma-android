package com.sdds.plasma.homeds.motion.bubble

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создаёт [Motion] для апсейл-бабла.
 * @param style стиль анимации interaction-состояний
 * @param motionContext контекст анимации
 */
@Composable
@NonRestartableComposable
public fun rememberBubbleMotion(
    style: BubbleMotionStyle = LocalBubbleMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<BubbleMotionStyle> {
    return rememberMotion(style, motionContext)
}
