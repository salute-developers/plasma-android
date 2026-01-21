package com.sdds.playground.sandbox.file.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.file.ActionPlacement
import com.sdds.testing.vs.file.FileContentType
import com.sdds.testing.vs.file.FileUiState

/**
 * ViewModel для экранов с компонентом File
 */
internal class FileParametersViewModel(
    defaultState: FileUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<FileUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        when (FilePropertyName.values().find { it.value == name }) {
            FilePropertyName.Label -> updateTitle(value?.toString().orEmpty())
            FilePropertyName.Description -> updateText(value?.toString().orEmpty())
            FilePropertyName.IsLoading -> updateIsLoading((value as? Boolean) == true)
            FilePropertyName.ActionPlacement -> updateActionPlacement(ActionPlacement.valueOf(value.toString()))
            FilePropertyName.ContentType -> updateContentType(FileContentType.valueOf(value.toString()))
            FilePropertyName.HasContentStart -> updateHasContentStart((value as? Boolean) == true)
            else -> Unit
        }
    }

    private fun updateTitle(title: String) {
        internalUiState.value = internalUiState.value.copy(label = title)
    }

    private fun updateText(text: String) {
        internalUiState.value = internalUiState.value.copy(description = text)
    }

    private fun updateIsLoading(isLoading: Boolean) {
        internalUiState.value = internalUiState.value.copy(isLoading = isLoading)
    }

    private fun updateActionPlacement(actionPlacement: ActionPlacement) {
        internalUiState.value = internalUiState.value.copy(actionPlacement = actionPlacement)
    }

    private fun updateContentType(contentType: FileContentType) {
        internalUiState.value = internalUiState.value.copy(contentType = contentType)
    }

    private fun updateHasContentStart(hasContentStart: Boolean) {
        internalUiState.value = internalUiState.value.copy(hasContentStart = hasContentStart)
    }

    override fun FileUiState.toProps(): List<Property<*>> {
        val contentType = if (internalUiState.value.hasContentStart) {
            listOf<Property<*>>(
                enumProperty(
                    name = FilePropertyName.ContentType.value,
                    value = contentType,
                ),
            )
        } else {
            emptyList()
        }

        val startContent = if (internalUiState.value.actionPlacement == ActionPlacement.End) {
            listOf<Property<*>>(
                Property.BooleanProperty(
                    name = FilePropertyName.HasContentStart.value,
                    value = hasContentStart,
                ),
            ) + contentType
        } else {
            emptyList()
        }

        return listOfNotNull(
            Property.StringProperty(
                name = FilePropertyName.Label.value,
                value = label,
            ),
            Property.StringProperty(
                name = FilePropertyName.Description.value,
                value = description,
            ),
            Property.BooleanProperty(
                name = FilePropertyName.IsLoading.value,
                value = isLoading,
            ),
            enumProperty(
                name = FilePropertyName.ActionPlacement.value,
                value = actionPlacement,
            ),
        ) + startContent
    }

    private enum class FilePropertyName(val value: String) {
        Label("label"),
        Description("description"),
        IsLoading("isLoading"),
        ActionPlacement("actionPlacement"),
        ContentType("contentType"),
        HasContentStart("hasContentStart"),
    }
}

/**
 * Фабрика [FileParametersViewModel]
 */
internal class FileParametersViewModelFactory(
    private val defaultState: FileUiState = FileUiState(),
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return FileParametersViewModel(defaultState, componentKey) as T
    }
}
