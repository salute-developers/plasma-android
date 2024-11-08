package com.sdds.plasma.sd.service.sandbox.checkbox.group

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sdds.plasma.sd.service.sandbox.checkbox.Size
import com.sdds.plasma.sd.service.sandbox.checkbox.group.CheckBoxGroupUiState.Companion.ROOT_ITEM
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
 * ViewModel для экранов с компонентом CheckBoxGroup
 */
internal class CheckBoxGroupParametersViewModel : ViewModel(), PropertiesOwner {
    private val _checkboxGroupState = MutableStateFlow(CheckBoxGroupUiState())

    /**
     * Состояние checkBoxGroup
     */
    val checkboxGroupState: StateFlow<CheckBoxGroupUiState>
        get() = _checkboxGroupState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _checkboxGroupState
            .mapLatest { state -> state.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    override fun resetToDefault() {
        _checkboxGroupState.value = CheckBoxGroupUiState()
    }

    private fun updateRootState(hasRoot: Boolean) {
        val rootItem = if (hasRoot) ROOT_ITEM else null
        _checkboxGroupState.value = _checkboxGroupState.value.copy(rootItem = rootItem)
    }

    private fun updateSize(size: Size) {
        _checkboxGroupState.value = _checkboxGroupState.value.copy(size = size)
    }

    private fun updateLabel(text: String) {
        _checkboxGroupState.value = _checkboxGroupState.value.copy(
            items = _checkboxGroupState.value.items.map { item ->
                item.copy(label = text.takeIf { it.isNotBlank() })
            },
            rootItem = _checkboxGroupState.value.rootItem?.copy(
                label = text.takeIf { it.isNotBlank() },
            ),
        )
    }

    private fun updateDescription(text: String) {
        _checkboxGroupState.value = _checkboxGroupState.value.copy(
            items = _checkboxGroupState.value.items.map { item ->
                item.copy(description = text.takeIf { it.isNotBlank() })
            },
            rootItem = _checkboxGroupState.value.rootItem?.copy(
                description = text.takeIf { it.isNotBlank() },
            ),
        )
    }

    private fun updateEnabledState(enabled: Boolean) {
        _checkboxGroupState.value = _checkboxGroupState.value.copy(enabled = enabled)
    }

    private fun CheckBoxGroupUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
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

            Property.BooleanProperty(
                name = "enabled",
                value = enabled,
                onApply = { updateEnabledState(it) },
            ),

            Property.BooleanProperty(
                name = "hasRoot",
                value = rootItem != null,
                onApply = { updateRootState(it) },
            ),
        )
    }
}
