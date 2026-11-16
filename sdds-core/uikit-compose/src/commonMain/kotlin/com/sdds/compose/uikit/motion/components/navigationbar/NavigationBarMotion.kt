package com.sdds.compose.uikit.motion.components.navigationbar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [NavigationBar]
 * @param motionContext контекст анимации
 * @param style стиль анимации [NavigationBar]
 */
@Composable
@NonRestartableComposable
fun rememberNavigationBarMotion(
    style: NavigationBarMotionStyle = LocalNavigationBarMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<NavigationBarMotionStyle> {
    return rememberMotion(style, motionContext)
}
