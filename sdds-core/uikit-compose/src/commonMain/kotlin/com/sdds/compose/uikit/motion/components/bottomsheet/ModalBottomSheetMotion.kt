package com.sdds.compose.uikit.motion.components.bottomsheet

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [ModalBottomSheet]
 * @param motionContext контекст анимации
 * @param style стиль анимации [ModalBottomSheet]
 */
@Composable
@NonRestartableComposable
fun rememberModalBottomSheetMotion(
    style: ModalBottomSheetMotionStyle = LocalModalBottomSheetMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<ModalBottomSheetMotionStyle> {
    return rememberMotion(style, motionContext)
}
