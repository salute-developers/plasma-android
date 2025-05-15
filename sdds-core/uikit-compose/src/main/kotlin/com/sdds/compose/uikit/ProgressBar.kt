package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.interactions.getValue
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
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
) {
    BaseProgress(
        progress = progress,
        modifier = modifier,
        indicatorBrush = style.colorValues.indicatorBrush?.getValue(interactionSource),
        indicatorColor = style.colorValues.indicatorColor?.colorForInteraction(interactionSource),
        backgroundBrush = style.colorValues.backgroundBrush?.getValue(interactionSource),
        backgroundColor = style.colorValues.backgroundColor?.colorForInteraction(interactionSource),
        indicatorHeight = style.dimensionValues.indicatorHeight,
        backgroundHeight = style.dimensionValues.backgroundHeight,
        indicatorShape = style.indicatorShape,
        backgroundShape = style.backgroundShape,
    )
}
