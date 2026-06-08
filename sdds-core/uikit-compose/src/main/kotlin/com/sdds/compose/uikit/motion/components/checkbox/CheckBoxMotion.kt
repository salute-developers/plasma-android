package com.sdds.compose.uikit.motion.components.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [CheckBoxBox]
 * @param motionContext контекст анимации
 * @param style стиль анимации [CheckBoxBox]
 */
@Composable
@NonRestartableComposable
fun rememberCheckBoxMotion(
    style: CheckBoxMotionStyle = LocalCheckBoxMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<CheckBoxMotionStyle> {
    return rememberMotion(style, motionContext)
}
