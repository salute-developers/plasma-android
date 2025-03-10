package com.sdds.playground.sandbox.checkbox.compose.group

import androidx.compose.ui.state.ToggleableState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.CheckBoxGroupStyle
import com.sdds.playground.sandbox.checkbox.compose.group.CheckBoxGroupUiState.Companion.ROOT_ITEM
import com.sdds.playground.sandbox.checkbox.compose.toggle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel для экранов с компонентом CheckBoxGroup
 */
internal class CheckBoxGroupViewModel(
    defaultState: CheckBoxGroupUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<CheckBoxGroupUiState, CheckBoxGroupStyle>(defaultState, componentKey) {

    fun checkBoxClicked(id: Int) {
        internalUiState.value = internalUiState.value.copy(
            items = internalUiState.value.items.mapIndexed { i, item ->
                if (i == id) {
                    item.copy(state = item.state.toggle())
                } else {
                    item
                }
            },
        )
        internalUiState.value = internalUiState.value.copy(
            rootItem = internalUiState.value.rootItem?.copy(
                state = internalUiState.value.getParentState(),
            ),
        )
    }

    fun rootCheckBoxClicked() {
        val newState = internalUiState.value.rootItem?.state!!.toggle()
        internalUiState.value = internalUiState.value.copy(
            rootItem = internalUiState.value.rootItem?.copy(
                state = newState,
            ),
            items = internalUiState.value.items.map {
                it.copy(state = newState)
            },
        )
    }

    private fun CheckBoxGroupUiState.getParentState(): ToggleableState =
        when {
            this.items.all { it.state == ToggleableState.On } -> ToggleableState.On
            this.items.all { it.state == ToggleableState.Off } -> ToggleableState.Off
            else -> ToggleableState.Indeterminate
        }

    private fun updateRootState(hasRoot: Boolean) {
        val rootItem = if (hasRoot) ROOT_ITEM else null
        internalUiState.value = internalUiState.value.copy(rootItem = rootItem)
    }

    private fun updateLabel(text: String) {
        internalUiState.value = internalUiState.value.copy(
            items = internalUiState.value.items.map { item ->
                item.copy(label = text.takeIf { it.isNotBlank() })
            },
            rootItem = internalUiState.value.rootItem?.copy(
                label = text.takeIf { it.isNotBlank() },
            ),
        )
    }

    private fun updateDescription(text: String) {
        internalUiState.value = internalUiState.value.copy(
            items = internalUiState.value.items.map { item ->
                item.copy(description = text.takeIf { it.isNotBlank() })
            },
            rootItem = internalUiState.value.rootItem?.copy(
                description = text.takeIf { it.isNotBlank() },
            ),
        )
    }

    private fun updateEnabledState(enabled: Boolean) {
        internalUiState.value = internalUiState.value.copy(enabled = enabled)
    }

    override fun CheckBoxGroupUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
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

internal class CheckBoxGroupViewModelFactory(
    private val defaultState: CheckBoxGroupUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CheckBoxGroupViewModel(defaultState, componentKey) as T
    }
}
