package com.sdds.compose.uikit.motion.components.file

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [File]
 * @param motionContext контекст анимации
 * @param style стиль анимации [File]
 */
@Composable
@NonRestartableComposable
fun rememberFileMotion(
    style: FileMotionStyle = LocalFileMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<FileMotionStyle> {
    return rememberMotion(style, motionContext)
}
