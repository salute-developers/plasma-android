package com.sdds.compose.uikit.motion.components.tabs

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [TabItem]
 * @param style стиль анимации [TabItem]
 * @param motionContext контекст анимации
 */
@Composable
fun rememberTabItemMotion(
    style: TabItemMotionStyle = LocalTabItemMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<TabItemMotionStyle> {
    return rememberMotion(style, motionContext)
}
