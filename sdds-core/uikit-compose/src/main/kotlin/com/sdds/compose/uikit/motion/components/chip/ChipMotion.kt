package com.sdds.compose.uikit.motion.components.chip

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [Chip]
 * @param motionContext контекст анимации
 * @param style стиль анимации [Chip]
 */
@Composable
@NonRestartableComposable
fun rememberChipMotion(
    style: ChipMotionStyle = LocalChipMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<ChipMotionStyle> {
    return rememberMotion(style, motionContext)
}
