package com.sdds.plasma.sd.service.sandbox.progress

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sdds.plasma.sd.service.sandbox.core.PropertiesOwner
import com.sdds.plasma.sd.service.sandbox.core.Property
import com.sdds.plasma.sd.service.sandbox.core.enumProperty
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

/**
 * ViewModel компонента Progress
 */
internal class ProgressViewModel : ViewModel(), PropertiesOwner {

    private val _progressUiState = MutableStateFlow(ProgressUiState())

    /**
     * Состояние компонента
     */
    val progressUiState: StateFlow<ProgressUiState>
        get() = _progressUiState.asStateFlow()

    /**
     * @see PropertiesOwner.properties
     */
    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _progressUiState
            .mapLatest { it.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    /**
     * @see PropertiesOwner.resetToDefault
     */
    override fun resetToDefault() {
        _progressUiState.value = ProgressUiState()
    }

    private fun updateStyle(style: Style) {
        _progressUiState.value = _progressUiState.value.copy(
            style = style,
        )
    }

    private fun updateProgress(progress: Float) {
        _progressUiState.value = _progressUiState.value.copy(
            progress = progress.coerceIn(0f, 1f),
        )
    }

    private fun ProgressUiState.toProps(): List<Property<*>> {
        return listOf(
            enumProperty(
                name = "style",
                value = style,
                onApply = { updateStyle(it) },
            ),

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
