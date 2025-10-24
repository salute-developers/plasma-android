package com.sdds.playground.sandbox.note.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.NoteStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента Note
 */
internal class NoteViewModel(
    defaultState: NoteUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<NoteUiState, NoteStyle>(defaultState, componentKey) {

    override fun NoteUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.StringProperty(
                name = "title",
                value = title,
                onApply = { internalUiState.value = internalUiState.value.copy(title = it) },
            ),
            Property.StringProperty(
                name = "text",
                value = text,
                onApply = { internalUiState.value = internalUiState.value.copy(text = it) },
            ),
            Property.BooleanProperty(
                name = "hasAction",
                value = hasAction,
                onApply = { internalUiState.value = internalUiState.value.copy(hasAction = it) },
            ),
        )
    }
}

internal class NoteViewModelFactory(
    private val defaultState: NoteUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NoteViewModel(defaultState, componentKey) as T
    }
}
