package com.sdds.compose.uikit.motion.components.tabs

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [Tabs]
 * @param motionContext контекст анимации
 */
@Composable
fun rememberTabsMotion(
    motionContext: MotionContext = rememberMotionContext(),
): Motion<TabsMotionStyle> {
    return rememberMotion(TabsMotionStylePlaceholder, motionContext)
}

private object TabsMotionStylePlaceholder : TabsMotionStyle
