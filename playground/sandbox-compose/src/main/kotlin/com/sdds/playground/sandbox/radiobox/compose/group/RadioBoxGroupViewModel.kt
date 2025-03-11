package com.sdds.playground.sandbox.radiobox.compose.group

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.PropertiesOwner
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel для экранов с компонентом RadioBox
 */
internal class RadioBoxGroupViewModel(
    defaultState: RadioBoxGroupUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<RadioBoxGroupUiState, RadioBoxGroupStyle>(defaultState, componentKey), PropertiesOwner {

    /**
     * Обновляет текущий выбранный элемент
     * @param currentId идентификатор текущего элемента
     */
    fun updateCurrentItem(currentId: Any) {
        internalUiState.value = internalUiState.value.copy(
            current = currentId,
        )
    }

    fun isChecked(id: Any): Boolean {
        return internalUiState.value.current == id
    }

    private fun updateVariant(variant: String) {
        internalUiState.value = internalUiState.value.copy(
            variant = variant,
        )
    }

    private fun updateLabel(label: String) {
        internalUiState.value = internalUiState.value.copy(
            items = internalUiState.value.items.map { item ->
                item.copy(label = label.takeIf { it.isNotBlank() })
            },
        )
    }

    private fun updateDescription(description: String) {
        internalUiState.value = internalUiState.value.copy(
            items = internalUiState.value.items.map { item ->
                item.copy(description = description.takeIf { it.isNotBlank() })
            },
        )
    }

    override fun RadioBoxGroupUiState.toProps(): List<Property<*>> {
        return listOf(
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

internal class RadioBoxGroupViewModelFactory(
    private val defaultState: RadioBoxGroupUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return RadioBoxGroupViewModel(defaultState, componentKey) as T
    }
}
