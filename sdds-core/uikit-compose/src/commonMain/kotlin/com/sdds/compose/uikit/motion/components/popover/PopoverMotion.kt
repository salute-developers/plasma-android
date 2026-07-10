package com.sdds.compose.uikit.motion.components.popover

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.Popover
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [Popover].
 *
 * @param style стиль анимации [Popover]
 * @param motionContext контекст анимации
 */
@Composable
@NonRestartableComposable
fun rememberPopoverMotion(
    style: PopoverMotionStyle = LocalPopoverMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<PopoverMotionStyle> {
    return rememberMotion(style, motionContext)
}
