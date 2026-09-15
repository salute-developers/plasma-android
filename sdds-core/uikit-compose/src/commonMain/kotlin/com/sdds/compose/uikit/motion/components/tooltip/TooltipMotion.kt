package com.sdds.compose.uikit.motion.components.tooltip

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.Tooltip
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [Tooltip].
 *
 * @param style стиль анимации [Tooltip]
 * @param motionContext контекст анимации
 */
@Composable
@NonRestartableComposable
fun rememberTooltipMotion(
    style: TooltipMotionStyle = LocalTooltipMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<TooltipMotionStyle> {
    return rememberMotion(style, motionContext)
}
