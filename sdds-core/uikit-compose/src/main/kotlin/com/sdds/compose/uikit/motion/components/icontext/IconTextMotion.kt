package com.sdds.compose.uikit.motion.components.icontext

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для BaseIconText
 * @param motionContext контекст анимации
 * @param style стиль анимации BaseIconText
 */
@Composable
@NonRestartableComposable
internal fun rememberIconTextMotion(
    style: IconTextMotionStyle = LocalIconTextMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<IconTextMotionStyle> {
    return rememberMotion(style, motionContext)
}
