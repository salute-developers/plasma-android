package com.sdds.playground.sandbox.progress.compose

import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние компонента Progress
 * @property variant стиль компонента
 * @property progress текущий прогресс
 */
internal data class ProgressUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val progress: Float = 0.5f,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
