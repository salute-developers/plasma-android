package com.sdds.compose.uikit.motion.components.common

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для комопнентов со свойствами стиля как у [Button]
 * @param motionContext контекст анимации
 * @param style стиль анимации комопнентов со свойствами стиля как у [Button]
 */
@Composable
@NonRestartableComposable
internal fun rememberCommonButtonMotion(
    style: CommonButtonMotionStyle = LocalCommonButtonMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<CommonButtonMotionStyle> {
    return rememberMotion(style, motionContext)
}
