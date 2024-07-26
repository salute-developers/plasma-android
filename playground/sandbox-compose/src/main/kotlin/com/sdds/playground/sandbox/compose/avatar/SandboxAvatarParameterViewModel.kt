package com.sdds.playground.sandbox.avatar

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sdds.playground.sandbox.compose.avatar.SandboxAvatar
import com.sdds.playground.sandbox.core.PropertiesOwner
import com.sdds.playground.sandbox.core.Property
import com.sdds.playground.sandbox.core.enumProperty
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

/**
 * ViewModel для экранов с компонентом Avatar
 */
internal class SandboxAvatarParameterViewModel : ViewModel(), PropertiesOwner {

    private val _avatarUiState = MutableStateFlow(AvatarUiState())

    /**
     * Состояние кнопки
     */
    val avatarUiState: StateFlow<AvatarUiState>
        get() = _avatarUiState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _avatarUiState
            .mapLatest { state -> state.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    override fun resetToDefault() {
        _avatarUiState.value = AvatarUiState()
    }

    private fun updateDisplayType(type: ExampleMode) {
        _avatarUiState.value = _avatarUiState.value.copy(exampleMode = type)
    }

    private fun updateSize(size: SandboxAvatar.Size) {
        _avatarUiState.value = _avatarUiState.value.copy(size = size)
    }

    private fun updateStatus(status: SandboxAvatar.Status) {
        _avatarUiState.value = _avatarUiState.value.copy(status = status)
    }

    private fun updatePlaceholder(text: String) {
        _avatarUiState.value = _avatarUiState.value.copy(placeholder = text.ifEmpty { null })
    }

    private fun updateActionEnabledState(enabled: Boolean) {
        _avatarUiState.value = _avatarUiState.value.copy(actionEnabled = enabled)
    }

    private fun AvatarUiState.toProps(): List<Property<*>> {
        return listOfNotNull(

            enumProperty(
                name = "exampleMode",
                value = exampleMode,
                onApply = { updateDisplayType(it) },
            ),

            enumProperty(
                name = "size",
                value = size,
                onApply = { updateSize(it) },
            ),

            enumProperty(
                name = "status",
                value = status,
                onApply = { updateStatus(it) },
            ),

            Property.StringProperty(
                name = "placeholder",
                value = placeholder.orEmpty(),
                onApply = { updatePlaceholder(it) },
            ),

            Property.BooleanProperty(
                name = "actionEnabled",
                value = actionEnabled,
                onApply = { updateActionEnabledState(it) },
            ),
        )
    }
}
