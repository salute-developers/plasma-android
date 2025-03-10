package com.sdds.playground.sandbox.avatar.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.avatar.AvatarUiState
import com.sdds.testing.vs.avatar.ExampleMode
import com.sdds.uikit.Avatar

/**
 * ViewModel для экранов с компонентом [Avatar]
 */
internal class AvatarViewModel(
    defaultState: AvatarUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<AvatarUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val pName = AvatarPropertyName.values().find { it.value == name }
        when (pName) {
            AvatarPropertyName.ExampleMode -> updateDisplayType(ExampleMode.valueOf(value?.toString() ?: return))
            AvatarPropertyName.Status -> updateStatus(Avatar.Status.valueOf(value?.toString() ?: return))
            AvatarPropertyName.Placeholder -> updatePlaceholder(value?.toString())
            AvatarPropertyName.ActionEnabled -> updateActionEnabledState(value as Boolean)
            AvatarPropertyName.Threshold -> updateThreshold(value?.toString()?.toIntOrNull() ?: 0)
            else -> Unit
        }
    }

    private fun updateDisplayType(type: ExampleMode) {
        internalUiState.value = internalUiState.value.copy(exampleMode = type)
    }

    private fun updateStatus(status: Avatar.Status) {
        internalUiState.value = internalUiState.value.copy(status = status)
    }

    private fun updatePlaceholder(text: String?) {
        internalUiState.value = internalUiState.value.copy(fullName = text)
    }

    private fun updateActionEnabledState(enabled: Boolean) {
        internalUiState.value = internalUiState.value.copy(actionEnabled = enabled)
    }

    private fun updateThreshold(threshold: Int) {
        internalUiState.value = internalUiState.value.copy(threshold = threshold)
    }

    override fun AvatarUiState.toProps(): List<Property<*>> {
        return mutableListOf<Property<*>>().apply {
            add(
                enumProperty(
                    name = AvatarPropertyName.ExampleMode.value,
                    value = exampleMode,
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
            add(
                Property.StringProperty(
                    name = AvatarPropertyName.Placeholder.value,
                    value = fullName.orEmpty(),
                ),
            )
        }
    }

    private enum class AvatarPropertyName(val value: String) {
        ExampleMode("example mode"),
        Status("status"),
        Placeholder("placeholder"),
        ActionEnabled("action enabled"),
        Threshold("threshold"),
    }
}

/**
 * Фабрика [AvatarGroupViewModel]
 * @param groupMode режим группы аватаров
 */
internal class AvatarViewModelFactory(
    private val defaultState: AvatarUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return AvatarViewModel(defaultState = defaultState, componentKey = componentKey) as T
    }
}
