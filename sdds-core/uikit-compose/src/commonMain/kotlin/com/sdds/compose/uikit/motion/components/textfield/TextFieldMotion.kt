package com.sdds.compose.uikit.motion.components.textfield

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [TextField]
 * @param motionContext контекст анимации
 * @param style стиль анимации [TextField]
 */
@Composable
@NonRestartableComposable
fun rememberTextFieldMotion(
    style: TextFieldMotionStyle = LocalTextFieldMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<TextFieldMotionStyle> {
    return rememberMotion(style, motionContext)
}
