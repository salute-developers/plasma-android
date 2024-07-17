package com.sdds.playground.sandbox.progress

/**
 * Состояние компонента [SandboxProgress]
 * @property style стиль компонента
 * @property progress текущий прогресс
 */
internal data class ProgressUiState(
    val style: SandboxProgress.Style = SandboxProgress.Style.Default,
    val progress: Float = 0.5f,
)
