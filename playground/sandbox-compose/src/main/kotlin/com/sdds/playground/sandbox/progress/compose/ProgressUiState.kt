package com.sdds.playground.sandbox.progress.compose

import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние компонента Progress
 * @property variant стиль компонента
 * @property progress текущий прогресс
 */
internal data class ProgressUiState(
    override val variant: String = "",
    val progress: Float = 0.5f,
): UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
