package com.sdds.compose.uikit.motion.components.dropdownmenu

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.DropdownMenu
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [DropdownMenu].
 *
 * @param style стиль анимации [DropdownMenu]
 * @param motionContext контекст анимации
 */
@Composable
@NonRestartableComposable
fun rememberDropdownMenuMotion(
    style: DropdownMenuMotionStyle = LocalDropdownMenuMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<DropdownMenuMotionStyle> {
    return rememberMotion(style, motionContext)
}
