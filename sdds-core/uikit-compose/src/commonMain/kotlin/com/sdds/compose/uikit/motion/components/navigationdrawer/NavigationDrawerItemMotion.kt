package com.sdds.compose.uikit.motion.components.navigationdrawer

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создаёт [Motion] для [com.sdds.compose.uikit.NavigationDrawerItem].
 *
 * @param style стиль анимаций.
 * @param motionContext motion-контекст.
 */
@Composable
@NonRestartableComposable
fun rememberNavigationDrawerItemMotion(
    style: NavigationDrawerItemMotionStyle = LocalNavigationDrawerItemMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(label = "NavigationDrawerItem"),
): Motion<NavigationDrawerItemMotionStyle> {
    return rememberMotion(style, motionContext)
}
