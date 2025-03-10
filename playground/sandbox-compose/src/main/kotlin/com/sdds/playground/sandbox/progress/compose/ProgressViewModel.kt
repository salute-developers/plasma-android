package com.sdds.playground.sandbox.progress.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента Progress
 */
internal class ProgressViewModel(
    defaultState: ProgressUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<ProgressUiState, ProgressBarStyle>(defaultState, componentKey) {

    private fun updateProgress(progress: Float) {
        internalUiState.value = internalUiState.value.copy(
            progress = progress.coerceIn(0f, 1f),
        )
    }

    override fun ProgressUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.IntProperty(
                name = "progress",
                value = (progress * MAX_PROGRESS).toInt(),
                onApply = { updateProgress(it.toFloat() / MAX_PROGRESS) },
            ),
        )
    }

    private companion object {
        const val MAX_PROGRESS = 100
    }
}

internal class ProgressViewModelFactory(
    private val defaultState: ProgressUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ProgressViewModel(defaultState, componentKey) as T
    }
}
