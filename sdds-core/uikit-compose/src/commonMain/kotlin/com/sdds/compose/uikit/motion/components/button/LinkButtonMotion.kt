package com.sdds.compose.uikit.motion.components.button

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [LinkButton]
 * @param motionContext контекст анимации
 * @param style стиль анимации [LinkButton]
 */
@Composable
@NonRestartableComposable
fun rememberLinkButtonMotion(
    style: LinkButtonMotionStyle = LocalLinkButtonMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<LinkButtonMotionStyle> {
    return rememberMotion(style, motionContext)
}
