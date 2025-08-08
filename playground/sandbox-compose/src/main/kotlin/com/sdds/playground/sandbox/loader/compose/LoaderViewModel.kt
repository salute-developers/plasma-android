package com.sdds.playground.sandbox.loader.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.LoaderStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import kotlin.math.roundToInt

internal class LoaderViewModel(
    defaultState: LoaderUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<LoaderUiState, LoaderStyle>(defaultState, componentKey) {

    private fun updateProgress(progress: Float) {
        internalUiState.value = internalUiState.value.copy(
            progress = progress.coerceIn(0f, 1f),
        )
    }

    override fun LoaderUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.IntProperty(
                name = "progress",
                value = (progress * MAX_PROGRESS).roundToInt(),
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
            enumProperty(
                name = "loaderType",
                value = loaderType,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(loaderType = it)
                },
            ),
        )
    }

    private companion object {
        const val MAX_PROGRESS = 100
    }
}

internal class LoaderViewModelFactory(
    private val defaultState: LoaderUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LoaderViewModel(defaultState, componentKey) as T
    }
}
