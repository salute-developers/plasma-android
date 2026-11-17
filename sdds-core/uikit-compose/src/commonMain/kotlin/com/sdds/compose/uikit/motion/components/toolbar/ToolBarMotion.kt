package com.sdds.compose.uikit.motion.components.toolbar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [ToolBar]
 * @param motionContext контекст анимации
 * @param style стиль анимации [ToolBar]
 */
@Composable
@NonRestartableComposable
fun rememberToolBarMotion(
    style: ToolBarMotionStyle = LocalToolBarMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<ToolBarMotionStyle> {
    return rememberMotion(style, motionContext)
}
