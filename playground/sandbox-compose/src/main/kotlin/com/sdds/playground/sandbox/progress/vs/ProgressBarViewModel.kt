package com.sdds.playground.sandbox.progress.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.progress.ProgressUiState

/**
 * ViewModel компонента ProgressBar
 */
internal class ProgressBarViewModel(
    defaultState: ProgressUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<ProgressUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val pName = ProgressPropertyName.values().find { it.value == name }
        when (pName) {
            ProgressPropertyName.Progress -> updateProgress(
                (value?.toString()?.toFloatOrNull() ?: 0f) / MAX_PROGRESS,
            )

            else -> {}
        }
    }

    private fun updateProgress(progress: Float) {
        internalUiState.value = internalUiState.value.copy(
            progress = progress.coerceIn(0f, 1f),
        )
    }

    override fun ProgressUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.IntProperty(
                name = ProgressPropertyName.Progress.value,
                value = (progress * MAX_PROGRESS).toInt(),
            ),
        )
    }

    private enum class ProgressPropertyName(val value: String) {
        Progress("progress"),
    }

    private companion object {
        const val MAX_PROGRESS = 100
    }
}

internal class ProgressBarViewModelFactory(
    private val defaultState: ProgressUiState = ProgressUiState(),
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ProgressBarViewModel(defaultState, componentKey) as T
    }
}
