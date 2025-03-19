package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.internal.BaseProgress

/**
 * Компонент ProgressBar.
 * @param progress значение прогресса от 0.0 до 1.0
 * @param modifier модификатор
 * @param style стиль компонента
 */
@Composable
@NonRestartableComposable
fun ProgressBar(
    progress: Float,
    modifier: Modifier = Modifier,
    style: ProgressBarStyle = LocalProgressBarStyle.current,
) {
    BaseProgress(
        progress = progress,
        modifier = modifier,
        main = style.colors.indicatorColor,
        background = style.colors.backgroundColor,
        backgroundHeight = style.dimensions.backgroundHeight,
        backgroundCornerRadius = style.dimensions.backgroundCornerRadius,
        indicatorHeight = style.dimensions.indicatorHeight,
        indicatorCornerRadius = style.dimensions.indicatorCornerRadius,
    )
}
