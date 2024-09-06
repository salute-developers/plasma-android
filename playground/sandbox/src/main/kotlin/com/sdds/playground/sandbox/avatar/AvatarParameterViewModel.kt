package com.sdds.playground.sandbox.avatar

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.sdds.playground.sandbox.core.view.PropertiesOwner
import com.sdds.playground.sandbox.core.view.Property
import com.sdds.playground.sandbox.core.view.enumProperty
import com.sdds.uikit.Avatar
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

/**
 * ViewModel для экранов с компонентом [Avatar]
 */
internal class AvatarParameterViewModel(
    private val groupMode: Boolean = false,
) : ViewModel(), PropertiesOwner {

    private val _avatarUiState = MutableStateFlow(AvatarUiState())

    /**
     * Состояние [Avatar]
     */
    val avatarUiState: StateFlow<AvatarUiState>
        get() = _avatarUiState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _avatarUiState
            .mapLatest { state -> state.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    override fun updateProperty(name: String, value: Any?) {
        val pName = AvatarPropertyName.values().find { it.value == name }
        when (pName) {
            AvatarPropertyName.Variant -> updateVariant(AvatarVariant.valueOf(value?.toString() ?: return))
            AvatarPropertyName.ExampleMode -> updateDisplayType(ExampleMode.valueOf(value?.toString() ?: return))
            AvatarPropertyName.Status -> updateStatus(Avatar.Status.valueOf(value?.toString() ?: return))
            AvatarPropertyName.Placeholder -> updatePlaceholder(value?.toString())
            AvatarPropertyName.ActionEnabled -> updateActionEnabledState(value as Boolean)
            AvatarPropertyName.Threshold -> updateThreshold(value?.toString()?.toIntOrNull() ?: 0)
            else -> Unit
        }
    }

    override fun resetToDefault() {
        _avatarUiState.value = AvatarUiState()
    }

    private fun updateDisplayType(type: ExampleMode) {
        _avatarUiState.value = _avatarUiState.value.copy(exampleMode = type)
    }

    private fun updateVariant(variant: AvatarVariant) {
        _avatarUiState.value = _avatarUiState.value.copy(variant = variant)
    }

    private fun updateStatus(status: Avatar.Status) {
        _avatarUiState.value = _avatarUiState.value.copy(status = status)
    }

    private fun updatePlaceholder(text: String?) {
        _avatarUiState.value = _avatarUiState.value.copy(fullName = text)
    }

    private fun updateActionEnabledState(enabled: Boolean) {
        _avatarUiState.value = _avatarUiState.value.copy(actionEnabled = enabled)
    }

    private fun updateThreshold(threshold: Int) {
        _avatarUiState.value = _avatarUiState.value.copy(threshold = threshold)
    }

    private fun AvatarUiState.toProps(): List<Property<*>> {
        return mutableListOf<Property<*>>().apply {
            if (!groupMode) {
                add(
                    enumProperty(
                        name = AvatarPropertyName.ExampleMode.value,
                        value = exampleMode,
                    ),
                )
                add(
                    enumProperty(
                        name = AvatarPropertyName.Variant.value,
                        value = variant,
                    ),
                )
                add(
                    enumProperty(
                        name = AvatarPropertyName.Status.value,
                        value = status,
                    ),
                )
                add(
                    Property.BooleanProperty(
                        name = AvatarPropertyName.ActionEnabled.value,
                        value = actionEnabled,
                    ),
                )
            }

            add(
                Property.StringProperty(
                    name = AvatarPropertyName.Placeholder.value,
                    value = fullName.orEmpty(),
                ),
            )

            if (groupMode) {
                add(
                    Property.IntProperty(
                        name = AvatarPropertyName.Threshold.value,
                        value = threshold,
                    ),
                )
            }
        }
    }

    private enum class AvatarPropertyName(val value: String) {
        Variant("variant"),
        ExampleMode("example mode"),
        Status("status"),
        Placeholder("placeholder"),
        ActionEnabled("action enabled"),
        Threshold("threshold"),
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
        Log.e("SandboxAvatarParameterViewModel", "create: groupMode = $groupMode")
        return AvatarParameterViewModel(groupMode = groupMode) as T
    }
}
