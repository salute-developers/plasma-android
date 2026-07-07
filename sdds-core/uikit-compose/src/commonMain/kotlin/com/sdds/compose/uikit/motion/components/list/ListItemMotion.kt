package com.sdds.compose.uikit.motion.components.list

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [ListItem]
 * @param motionContext контекст анимации
 * @param style стиль анимации [ListItem]
 */
@Composable
@NonRestartableComposable
fun rememberListItemMotion(
    style: ListItemMotionStyle = LocalListItemMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<ListItemMotionStyle> {
    return rememberMotion(style, motionContext)
}
