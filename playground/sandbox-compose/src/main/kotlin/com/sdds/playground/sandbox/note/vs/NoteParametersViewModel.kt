package com.sdds.playground.sandbox.note.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.note.NoteUiState

/**
 * ViewModel для экранов с компонентом Note
 */
internal class NoteParametersViewModel(
    defaultState: NoteUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<NoteUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        when (NotePropertyName.values().find { it.value == name }) {
            NotePropertyName.Title -> updateTitle(value?.toString().orEmpty())
            NotePropertyName.Text -> updateText(value?.toString().orEmpty())
            NotePropertyName.HasAction -> updateHasActions((value as? Boolean) == true)
            else -> Unit
        }
    }

    private fun updateTitle(title: String) {
        internalUiState.value = internalUiState.value.copy(title = title)
    }

    private fun updateText(text: String) {
        internalUiState.value = internalUiState.value.copy(text = text)
    }

    private fun updateHasActions(hasActions: Boolean) {
        internalUiState.value = internalUiState.value.copy(hasAction = hasActions)
    }

    override fun NoteUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.StringProperty(
                name = NotePropertyName.Title.value,
                value = title,
            ),

            Property.StringProperty(
                name = NotePropertyName.Text.value,
                value = text,
            ),

            Property.BooleanProperty(
                name = NotePropertyName.HasAction.value,
                value = hasAction,
            ),
        )
    }

    private enum class NotePropertyName(val value: String) {
        Title("title"),
        Text("text"),
        HasAction("hasActions"),
    }
}

/**
 * Фабрика [NoteParametersViewModel]
 */
internal class NoteParametersViewModelFactory(
    private val defaultState: NoteUiState = NoteUiState(),
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NoteParametersViewModel(defaultState, componentKey) as T
    }
}
