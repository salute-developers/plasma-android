package com.sdds.playground.sandbox.progress.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.StylesProviderView
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property

/**
 * ViewModel компонента ProgressBar
 */
internal class ProgressBarViewModel(
    defaultState: ProgressUiState,
) : ComponentViewModel<ProgressUiState>(defaultState) {

    override fun getStyleProvider(stylesProvider: StylesProviderView): ViewStyleProvider<String> {
        return stylesProvider.progress
    }

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
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ProgressBarViewModel(defaultState) as T
    }
}
