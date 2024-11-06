package com.sdds.playground.sandbox.progress

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ProgressBar
import com.sdds.compose.uikit.ProgressBarStyle

/**
 * Состояние компонента Progress
 * @property style стиль компонента
 * @property progress текущий прогресс
 */
internal data class ProgressUiState(
    val style: Style = Style.Default,
    val progress: Float = 0.5f,
)

internal enum class Style {
    Default,
    Secondary,
    Accent,
    GradientAccent,
    Positive,
    Warning,
    Negative,
}

@Composable
internal fun ProgressUiState.progressStyle(): ProgressBarStyle =
    when (style) {
        Style.Default -> ProgressBar.Default.style()
        Style.Secondary -> ProgressBar.Secondary.style()
        Style.Accent -> ProgressBar.Accent.style()
        Style.GradientAccent -> ProgressBar.GradientAccent.style()
        Style.Positive -> ProgressBar.Positive.style()
        Style.Warning -> ProgressBar.Warning.style()
        Style.Negative -> ProgressBar.Negative.style()
    }
