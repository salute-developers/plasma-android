package com.sdds.compose.uikit.motion.components.button

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [IconButton]
 * @param motionContext контекст анимации
 * @param style стиль анимации [IconButton]
 */
@Composable
@NonRestartableComposable
fun rememberIconButtonMotion(
    style: IconButtonMotionStyle = LocalIconButtonMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<IconButtonMotionStyle> {
    return rememberMotion(style, motionContext)
}
