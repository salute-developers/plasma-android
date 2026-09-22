package com.sdds.compose.uikit.motion.components.codeinput

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [CodeInput]
 * @param motionContext контекст анимации
 * @param style стиль анимации [CodeInput]
 */
@Composable
@NonRestartableComposable
fun rememberCodeInputMotion(
    style: CodeInputMotionStyle = LocalCodeInputMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<CodeInputMotionStyle> {
    return rememberMotion(style, motionContext)
}
