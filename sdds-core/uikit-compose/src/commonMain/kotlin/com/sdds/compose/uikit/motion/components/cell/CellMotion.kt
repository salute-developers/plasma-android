package com.sdds.compose.uikit.motion.components.cell

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [Cell]
 * @param motionContext контекст анимации
 * @param style стиль анимации [Cell]
 */
@Composable
@NonRestartableComposable
fun rememberCellMotion(
    style: CellMotionStyle = LocalCellMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<CellMotionStyle> {
    return rememberMotion(style, motionContext)
}
