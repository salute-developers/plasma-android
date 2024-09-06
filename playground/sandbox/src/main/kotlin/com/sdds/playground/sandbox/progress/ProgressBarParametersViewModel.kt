package com.sdds.playground.sandbox.progress

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sdds.playground.sandbox.core.view.PropertiesOwner
import com.sdds.playground.sandbox.core.view.Property
import com.sdds.playground.sandbox.core.view.enumProperty
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

/**
 * ViewModel компонента ProgressBar
 */
internal class ProgressBarParametersViewModel : ViewModel(), PropertiesOwner {

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

    override fun updateProperty(name: String, value: Any?) {
        val pName = ProgressPropertyName.values().find { it.value == name }
        when (pName) {
            ProgressPropertyName.Variant -> updateVariant(ProgressVariant.valueOf(value?.toString() ?: return))
            ProgressPropertyName.Progress -> updateProgress((value?.toString()?.toFloatOrNull() ?: 0f) / MAX_PROGRESS)
            else -> {}
        }
    }

    private fun updateVariant(variant: ProgressVariant) {
        _progressUiState.value = _progressUiState.value.copy(
            variant = variant,
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
                name = ProgressPropertyName.Variant.value,
                value = variant,
            ),

            Property.IntProperty(
                name = ProgressPropertyName.Progress.value,
                value = (progress * MAX_PROGRESS).toInt(),
            ),
        )
    }

    private enum class ProgressPropertyName(val value: String) {
        Variant("variant"),
        Progress("progress"),
    }

    private companion object {
        const val MAX_PROGRESS = 100
    }
}
