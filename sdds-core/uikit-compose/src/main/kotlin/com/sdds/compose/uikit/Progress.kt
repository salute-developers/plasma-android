package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.internal.BaseProgress

/**
 * Компонент Progress.
 * @param progress значение прогресса от 0.0 до 1.0
 * @param modifier модификатор
 * @param main кисть для прогресса
 * @param background кисть для фона
 * @param backgroundHeight высота бэкграунда
 * @param linearIndicatorHeight высота индикатора
 */
@Composable
@NonRestartableComposable
fun Progress(
    progress: Float,
    modifier: Modifier,
    main: Brush = SolidColor(Color.Green),
    background: Brush = SolidColor(Color.Gray),
    backgroundHeight: Dp = 4.dp,
    linearIndicatorHeight: Dp = 6.dp,
) {
    BaseProgress(
        progress = progress,
        modifier = modifier,
        main = main,
        background = background,
        backgroundHeight = backgroundHeight,
        linearIndicatorHeight = linearIndicatorHeight,
    )
}
