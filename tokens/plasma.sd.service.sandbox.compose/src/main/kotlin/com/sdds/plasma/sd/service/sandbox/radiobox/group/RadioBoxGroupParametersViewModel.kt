package com.sdds.plasma.sd.service.sandbox.radiobox.group

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sdds.plasma.sd.service.sandbox.core.PropertiesOwner
import com.sdds.plasma.sd.service.sandbox.core.Property
import com.sdds.plasma.sd.service.sandbox.core.enumProperty
import com.sdds.plasma.sd.service.sandbox.radiobox.Size
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

/**
 * ViewModel для экранов с компонентом RadioBox
 */
internal class RadioBoxGroupParametersViewModel : ViewModel(), PropertiesOwner {

    private val _radioBoxGroupUiState = MutableStateFlow(RadioBoxGroupUiState())

    /**
     * Состояние компонента
     */
    val radioBoxGroupUiState: StateFlow<RadioBoxGroupUiState>
        get() = _radioBoxGroupUiState.asStateFlow()

    /**
     * @see PropertiesOwner.properties
     */
    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _radioBoxGroupUiState
            .mapLatest { it.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    /**
     * @see PropertiesOwner.resetToDefault
     */
    override fun resetToDefault() {
        _radioBoxGroupUiState.value = RadioBoxGroupUiState()
    }

    /**
     * Обновляет текущий выбранный элемент
     * @param currentId идентификатор текущего элемента
     */
    fun updateCurrentItem(currentId: Any) {
        _radioBoxGroupUiState.value = _radioBoxGroupUiState.value.copy(
            current = currentId,
        )
    }

    fun isChecked(id: Any): Boolean {
        return _radioBoxGroupUiState.value.current == id
    }

    private fun updateSize(size: Size) {
        _radioBoxGroupUiState.value = _radioBoxGroupUiState.value.copy(
            size = size,
        )
    }

    private fun updateLabel(label: String) {
        _radioBoxGroupUiState.value = _radioBoxGroupUiState.value.copy(
            items = _radioBoxGroupUiState.value.items.map { item ->
                item.copy(label = label.takeIf { it.isNotBlank() })
            },
        )
    }

    private fun updateDescription(description: String) {
        _radioBoxGroupUiState.value = _radioBoxGroupUiState.value.copy(
            items = _radioBoxGroupUiState.value.items.map { item ->
                item.copy(description = description.takeIf { it.isNotBlank() })
            },
        )
    }

    private fun RadioBoxGroupUiState.toProps(): List<Property<*>> {
        return listOf(
            enumProperty(
                name = "size",
                value = size,
                onApply = { updateSize(it) },
            ),

            Property.StringProperty(
                name = "label",
                value = items.first().label ?: "Empty",
                onApply = { updateLabel(it) },
            ),

            Property.StringProperty(
                name = "description",
                value = items.first().description ?: "Empty",
                onApply = { updateDescription(it) },
            ),
        )
    }
}
