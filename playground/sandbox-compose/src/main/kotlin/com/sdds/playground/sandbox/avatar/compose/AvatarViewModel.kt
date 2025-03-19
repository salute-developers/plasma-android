package com.sdds.playground.sandbox.avatar.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.AvatarPlaceholder
import com.sdds.compose.uikit.AvatarStatus
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel для экранов с компонентом Avatar
 */
internal class AvatarViewModel(
    defaultState: AvatarUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<AvatarUiState, AvatarStyle>(defaultState, componentKey) {

    private fun updateDisplayType(type: ExampleMode) {
        internalUiState.value = internalUiState.value.copy(exampleMode = type)
    }

    private fun updateStatus(status: AvatarStatus) {
        internalUiState.value = internalUiState.value.copy(status = status)
    }

    private fun updatePlaceholder(text: String) {
        internalUiState.value = internalUiState.value.copy(
            placeholder = if (text.isNotBlank()) {
                AvatarPlaceholder.Name(text)
            } else {
                null
            },
        )
    }

    private fun updateActionEnabledState(enabled: Boolean) {
        internalUiState.value = internalUiState.value.copy(actionEnabled = enabled)
    }

    override fun AvatarUiState.toProps(): List<Property<*>> {
        return listOf(
            enumProperty(
                name = "exampleMode",
                value = exampleMode,
                onApply = { updateDisplayType(it) },
            ),
            enumProperty(
                name = "status",
                value = status,
                onApply = { updateStatus(it) },
            ),
            Property.StringProperty(
                name = "placeholder",
                value = placeholder?.name.orEmpty(),
                onApply = { updatePlaceholder(it) },
            ),
            Property.BooleanProperty(
                name = "actionEnabled",
                value = actionEnabled,
                onApply = { updateActionEnabledState(it) },
            ),
        )
    }

    companion object {

        val AvatarPlaceholder.name get() = (this as? AvatarPlaceholder.Name)?.fullName
    }
}

/**
 * Фабрика [AvatarViewModel]
 */
internal class AvatarViewModelFactory(
    private val defaultState: AvatarUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return AvatarViewModel(defaultState, componentKey) as T
    }
}
