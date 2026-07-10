package com.sdds.compose.uikit.motion.components.list

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [List]
 * @param motionContext контекст анимации
 * @param style стиль анимации [List]
 */
@Composable
@NonRestartableComposable
fun rememberListMotion(
    style: ListMotionStyle = LocalListMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<ListMotionStyle> {
    return rememberMotion(style, motionContext)
}
