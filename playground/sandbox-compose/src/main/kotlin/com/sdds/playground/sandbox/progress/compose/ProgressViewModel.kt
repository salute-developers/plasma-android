package com.sdds.playground.sandbox.progress.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

/**
 * ViewModel компонента Progress
 */
internal class ProgressViewModel(
    defaultState: ProgressUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ComponentViewModel<ProgressUiState, ProgressBarStyle>(defaultState) {

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

    override fun getStyleProvider(): ComposeStyleProvider<String, ProgressBarStyle> {
        return theme.stylesProvider.progress
    }

    private companion object {
        const val MAX_PROGRESS = 100
    }
}

internal class ProgressViewModelFactory(
    private val defaultState: ProgressUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ProgressViewModel(defaultState, theme) as T
    }
}
