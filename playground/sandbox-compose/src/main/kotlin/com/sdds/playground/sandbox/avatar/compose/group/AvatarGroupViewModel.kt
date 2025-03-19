package com.sdds.playground.sandbox.avatar.compose.group

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.AvatarGroupStyle
import com.sdds.compose.uikit.AvatarPlaceholder
import com.sdds.playground.sandbox.avatar.compose.AvatarUiState
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel для экранов с компонентом Avatar
 */
internal class AvatarGroupViewModel(
    defaultState: AvatarUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<AvatarUiState, AvatarGroupStyle>(defaultState, componentKey) {

    private fun updatePlaceholder(text: String) {
        internalUiState.value = internalUiState.value.copy(
            placeholder = if (text.isNotBlank()) {
                AvatarPlaceholder.Name(text)
            } else {
                null
            },
        )
    }

    private fun updateThreshold(threshold: Int) {
        internalUiState.value = internalUiState.value.copy(threshold = threshold)
    }

    override fun AvatarUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.StringProperty(
                name = "placeholder",
                value = placeholder?.name.orEmpty(),
                onApply = { updatePlaceholder(it) },
            ),
            Property.IntProperty(
                name = "threshold",
                value = threshold,
                onApply = { updateThreshold(it) },
            ),
        )
    }

    companion object {
        val AvatarPlaceholder.name get() = (this as? AvatarPlaceholder.Name)?.fullName
    }
}

/**
 * Фабрика [AvatarGroupViewModel]
 */
internal class AvatarGroupViewModelFactory(
    private val defaultState: AvatarUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return AvatarGroupViewModel(defaultState, componentKey) as T
    }
}
