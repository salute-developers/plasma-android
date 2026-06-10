package com.sdds.compose.uikit.motion.components.tabbar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [com.sdds.compose.uikit.TabBar].
 *
 * @param style стиль анимаций.
 * @param motionContext motion-контекст.
 */
@Composable
@NonRestartableComposable
fun rememberTabBarMotion(
    style: TabBarMotionStyle = LocalTabBarMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(label = "TabBar"),
): Motion<TabBarMotionStyle> {
    return rememberMotion(style, motionContext)
}
