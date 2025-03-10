package com.sdds.playground.sandbox.switcher.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.switcher.SwitchUiState

/**
 * ViewModel для экранов с компонентом Switch
 */
internal class SwitchViewModel(
    defaultState: SwitchUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<SwitchUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val pName = SwitchPropertyName.values().find { it.value == name }
        when (pName) {
            SwitchPropertyName.Active -> updateActive(value as Boolean)
            SwitchPropertyName.Label -> updateLabel(value?.toString())
            SwitchPropertyName.Description -> updateDescription(value?.toString())
            SwitchPropertyName.Enabled -> updateEnabledState(value as Boolean)
            else -> Unit
        }
    }

    /**
     * Обновляет состояние active у компонента Switch
     */
    fun updateActive(active: Boolean) {
        internalUiState.value = internalUiState.value.copy(active = active)
    }

    private fun updateLabel(text: String?) {
        internalUiState.value = internalUiState.value.copy(label = text)
    }

    private fun updateDescription(text: String?) {
        internalUiState.value = internalUiState.value.copy(description = text)
    }

    private fun updateEnabledState(enabled: Boolean) {
        internalUiState.value = internalUiState.value.copy(enabled = enabled)
    }

    override fun SwitchUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.BooleanProperty(
                name = SwitchPropertyName.Active.value,
                value = active,
            ),

            Property.StringProperty(
                name = SwitchPropertyName.Label.value,
                value = label.orEmpty(),
            ),

            Property.StringProperty(
                name = SwitchPropertyName.Description.value,
                value = description.orEmpty(),
            ),

            Property.BooleanProperty(
                name = SwitchPropertyName.Enabled.value,
                value = enabled,
            ),
        )
    }

    private enum class SwitchPropertyName(val value: String) {
        Active("active"),
        Label("label"),
        Description("description"),
        Enabled("enabled"),
    }
}

/**
 * Фабрика [SwitchViewModel]
 * @param defaultState состояние по-умолчанию
 */
internal class SwitchViewModelFactory(
    private val defaultState: SwitchUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SwitchViewModel(defaultState, componentKey) as T
    }
}
