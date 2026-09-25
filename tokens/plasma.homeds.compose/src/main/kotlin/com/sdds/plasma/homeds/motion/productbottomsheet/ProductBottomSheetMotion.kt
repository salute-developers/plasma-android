package com.sdds.plasma.homeds.motion.productbottomsheet

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создает [Motion] для [ProductBottomSheet]
 * @param motionContext контекст анимации
 * @param style стиль анимации [ProductBottomSheet]
 */
@Composable
@NonRestartableComposable
fun rememberProductBottomSheetMotion(
    style: ProductBottomSheetMotionStyle = LocalProductBottomSheetMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(),
): Motion<ProductBottomSheetMotionStyle> {
    return rememberMotion(style, motionContext)
}
