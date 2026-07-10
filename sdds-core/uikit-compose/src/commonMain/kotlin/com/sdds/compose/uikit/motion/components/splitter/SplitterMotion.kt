package com.sdds.compose.uikit.motion.components.splitter

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [Splitter]
 * @param motionContext контекст анимации
 * @param style стиль анимации [Splitter]
 */
@Composable
@NonRestartableComposable
fun rememberSplitterMotion(
    style: SplitterMotionStyle = LocalSplitterMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<SplitterMotionStyle> {
    return rememberMotion(style, motionContext)
}
