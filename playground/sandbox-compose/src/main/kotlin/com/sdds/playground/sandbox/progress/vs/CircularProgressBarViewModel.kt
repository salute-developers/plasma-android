package com.sdds.playground.sandbox.progress.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.progress.CircularProgressUiState

/**
 * ViewModel компонента CircularProgressBar
 */
internal class CircularProgressBarViewModel(
    defaultState: CircularProgressUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<CircularProgressUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val pName = ProgressPropertyName.values().find { it.value == name }
        val valueString = value?.toString() ?: return
        when (pName) {
            ProgressPropertyName.Progress -> updateProgress(
                (valueString.toFloatOrNull() ?: 0f) / MAX_PROGRESS,
            )
            ProgressPropertyName.HasTrack -> updateTrackEnabled(valueString.toBoolean())
            else -> {}
        }
    }

    private fun updateProgress(progress: Float) {
        internalUiState.value = internalUiState.value.copy(
            progress = progress.coerceIn(0f, 1f),
        )
    }

    private fun updateTrackEnabled(enabled: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            trackEnabled = enabled,
        )
    }

    override fun CircularProgressUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.IntProperty(
                name = ProgressPropertyName.Progress.value,
                value = (progress * MAX_PROGRESS).toInt(),
            ),
            Property.BooleanProperty(
                name = ProgressPropertyName.HasTrack.value,
                value = trackEnabled,
            ),
        )
    }

    private enum class ProgressPropertyName(val value: String) {
        Progress("progress"),
        HasTrack("hasTrack"),
    }

    private companion object {
        const val MAX_PROGRESS = 100
    }
}

internal class CircularProgressBarViewModelFactory(
    private val defaultState: CircularProgressUiState = CircularProgressUiState(),
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CircularProgressBarViewModel(defaultState, componentKey) as T
    }
}
