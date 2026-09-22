package com.sdds.compose.uikit.motion.components.codeinput

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.components.codeField.CodeFieldMotionStyle
import com.sdds.compose.uikit.motion.components.codeField.LocalCodeFieldMotionStyle
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [CodeField]
 * @param motionContext контекст анимации
 * @param style стиль анимации [CodeField]
 */
@Composable
@NonRestartableComposable
fun rememberCodeFieldMotion(
    style: CodeFieldMotionStyle = LocalCodeFieldMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<CodeFieldMotionStyle> {
    return rememberMotion(style, motionContext)
}
