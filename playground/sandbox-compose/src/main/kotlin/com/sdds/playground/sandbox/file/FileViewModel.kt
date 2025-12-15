package com.sdds.playground.sandbox.file

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.FileStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента File
 */
internal class FileViewModel(
    defaultState: FileUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<FileUiState, FileStyle>(defaultState, componentKey) {

    override fun FileUiState.toProps(): List<Property<*>> {
        val contentPropsList = if (hasContentStart) {
            listOf(
                enumProperty(
                    name = "contentType",
                    value = contentType,
                    onApply = {
                        internalUiState.value = internalUiState.value.copy(contentType = it)
                    },
                ),
            )
        } else {
            emptyList()
        }

        return listOf(
            Property.BooleanProperty(
                name = "isLoading",
                value = isLoading,
                onApply = { internalUiState.value = internalUiState.value.copy(isLoading = it) },
            ),
            Property.StringProperty(
                name = "label",
                value = label,
                onApply = { internalUiState.value = internalUiState.value.copy(label = it) },
            ),
            Property.StringProperty(
                name = "description",
                value = description,
                onApply = { internalUiState.value = internalUiState.value.copy(description = it) },
            ),
            enumProperty(
                name = "actionPlacement",
                value = actionPlacement,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(actionPlacement = it)
                },
            ),
            Property.BooleanProperty(
                name = "hasContentStart",
                value = hasContentStart,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(hasContentStart = it)
                },
            ),
        ) + contentPropsList
    }
}

internal class FileViewModelFactory(
    private val defaultState: FileUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return FileViewModel(defaultState, componentKey) as T
    }
}
