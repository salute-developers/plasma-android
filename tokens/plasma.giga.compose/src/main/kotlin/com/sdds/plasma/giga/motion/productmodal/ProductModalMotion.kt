package com.sdds.plasma.giga.motion.productmodal

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [ProductModal]
 * @param motionContext контекст анимации
 * @param style стиль анимации [ProductModal]
 */
@Composable
@NonRestartableComposable
fun rememberProductModalMotion(
    style: ProductModalMotionStyle = LocalProductModalMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<ProductModalMotionStyle> {
    return rememberMotion(style, motionContext)
}
