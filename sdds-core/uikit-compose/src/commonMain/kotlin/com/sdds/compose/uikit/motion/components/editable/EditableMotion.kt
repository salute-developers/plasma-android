package com.sdds.compose.uikit.motion.components.editable

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [Editable]
 * @param motionContext контекст анимации
 * @param style стиль анимации [Editable]
 */
@Composable
@NonRestartableComposable
fun rememberEditableMotion(
    style: EditableMotionStyle = LocalEditableMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<EditableMotionStyle> {
    return rememberMotion(style, motionContext)
}
