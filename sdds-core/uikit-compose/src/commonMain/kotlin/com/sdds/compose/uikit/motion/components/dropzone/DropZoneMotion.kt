package com.sdds.compose.uikit.motion.components.dropzone

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [DropZone]
 * @param motionContext контекст анимации
 * @param style стиль анимации [DropZone]
 */
@Composable
@NonRestartableComposable
fun rememberDropZoneMotion(
    style: DropZoneMotionStyle = LocalDropZoneMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<DropZoneMotionStyle> {
    return rememberMotion(style, motionContext)
}
