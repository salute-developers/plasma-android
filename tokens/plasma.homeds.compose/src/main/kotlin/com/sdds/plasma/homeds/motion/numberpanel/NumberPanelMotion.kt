package com.sdds.plasma.homeds.motion.numberpanel

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [NumberPanel]
 * @param motionContext контекст анимации
 * @param style стиль анимации [NumberPanel]
 */
@Composable
@NonRestartableComposable
fun rememberNumberPanelMotion(
    style: NumberPanelMotionStyle = LocalNumberPanelMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<NumberPanelMotionStyle> {
    return rememberMotion(style, motionContext)
}
