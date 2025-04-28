package com.sdds.playground.sandbox.progress.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.CircularProgressBarStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента CircularProgress
 */
internal class CircularProgressViewModel(
    defaultState: CircularProgressUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<CircularProgressUiState, CircularProgressBarStyle>(defaultState, componentKey) {

    private fun updateProgress(progress: Float) {
        internalUiState.value = internalUiState.value.copy(
            progress = progress.coerceIn(0f, 1f),
        )
    }

    override fun CircularProgressUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.IntProperty(
                name = "progress",
                value = (progress * MAX_PROGRESS).toInt(),
                onApply = { updateProgress(it.toFloat() / MAX_PROGRESS) },
            ),
            Property.BooleanProperty(
                name = "trackEnabled",
                value = trackEnabled,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(
                        trackEnabled = it,
                    )
                },
            ),
        )
    }

    private companion object {
        const val MAX_PROGRESS = 100
    }
}

internal class CircularProgressViewModelFactory(
    private val defaultState: CircularProgressUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CircularProgressViewModel(defaultState, componentKey) as T
    }
}
