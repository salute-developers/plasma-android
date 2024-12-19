package com.sdds.playground.sandbox.avatar.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.sdds.compose.uikit.Avatar
import com.sdds.playground.sandbox.core.compose.PropertiesOwner
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
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
internal class AvatarParameterViewModel(
    private val groupMode: Boolean = false,
) : ViewModel(), PropertiesOwner {

    private val _avatarUiState = MutableStateFlow(AvatarUiState())

    /**
     * Состояние кнопки
     */
    val avatarUiState: StateFlow<AvatarUiState>
        get() = _avatarUiState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _avatarUiState
            .mapLatest { state -> if (groupMode) state.toGroupProps() else state.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    override fun resetToDefault() {
        _avatarUiState.value = AvatarUiState()
    }

    private fun updateDisplayType(type: ExampleMode) {
        _avatarUiState.value = _avatarUiState.value.copy(exampleMode = type)
    }

    private fun updateSize(size: Size) {
        _avatarUiState.value = _avatarUiState.value.copy(size = size)
    }

    private fun updateStatus(status: Avatar.Status) {
        _avatarUiState.value = _avatarUiState.value.copy(status = status)
    }

    private fun updatePlaceholder(text: String) {
        _avatarUiState.value = _avatarUiState.value.copy(
            placeholder = if (text.isNotBlank()) {
                Avatar.Placeholder.Name(text)
            } else {
                null
            },
        )
    }

    private fun updateActionEnabledState(enabled: Boolean) {
        _avatarUiState.value = _avatarUiState.value.copy(actionEnabled = enabled)
    }

    private fun updateThreshold(threshold: Int) {
        _avatarUiState.value = _avatarUiState.value.copy(threshold = threshold)
    }

    private fun AvatarUiState.toGroupProps(): List<Property<*>> {
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

    private fun AvatarUiState.toProps(): List<Property<*>> {
        return listOf(
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

        val Avatar.Placeholder.name get() = (this as? Avatar.Placeholder.Name)?.fullName
    }
}

/**
 * Фабрика [AvatarParameterViewModel]
 * @param groupMode режим группы аватаров
 */
internal class AvatarParameterViewModelFactory(
    private val groupMode: Boolean = false,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return AvatarParameterViewModel(groupMode = groupMode) as T
    }
}
