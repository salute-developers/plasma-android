package com.sdds.playground.sandbox.switcher

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.sdds.playground.sandbox.core.view.PropertiesOwner
import com.sdds.playground.sandbox.core.view.Property
import com.sdds.playground.sandbox.core.view.enumProperty
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

/**
 * ViewModel для экранов с компонентом Switch
 */
internal class SwitchParametersViewModel(
    private val defaultState: SwitchUiState,
) : ViewModel(), PropertiesOwner {

    private val _switchState = MutableStateFlow(defaultState)

    /**
     * Состояние switch
     */
    val switchState: StateFlow<SwitchUiState>
        get() = _switchState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _switchState
            .mapLatest { state -> state.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    override fun updateProperty(name: String, value: Any?) {
        val pName = SwitchPropertyName.values().find { it.value == name }
        when (pName) {
            SwitchPropertyName.Variant -> updateVariant(SwitchVariant.valueOf(value?.toString() ?: return))
            SwitchPropertyName.Active -> updateActive(value as Boolean)
            SwitchPropertyName.Label -> updateLabel(value?.toString())
            SwitchPropertyName.Description -> updateDescription(value?.toString())
            SwitchPropertyName.Enabled -> updateEnabledState(value as Boolean)
            else -> Unit
        }
    }

    override fun resetToDefault() {
        _switchState.value = defaultState
    }

    /**
     * Обновляет состояние active у компонента Switch
     */
    fun updateActive(active: Boolean) {
        _switchState.value = _switchState.value.copy(active = active)
    }

    private fun updateVariant(variant: SwitchVariant) {
        _switchState.value = _switchState.value.copy(variant = variant)
    }

    private fun updateLabel(text: String?) {
        _switchState.value = _switchState.value.copy(label = text)
    }

    private fun updateDescription(text: String?) {
        _switchState.value = _switchState.value.copy(description = text)
    }

    private fun updateEnabledState(enabled: Boolean) {
        _switchState.value = _switchState.value.copy(enabled = enabled)
    }

    private fun SwitchUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = SwitchPropertyName.Variant.value,
                value = variant,
            ),

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
        Variant("variant"),
        Active("active"),
        Label("label"),
        Description("description"),
        Enabled("enabled"),
    }
}

/**
 * Фабрика [SwitchParametersViewModel]
 * @param defaultState состояние по-умолчанию
 */
internal class SwitchParametersViewModelFactory(
    private val defaultState: SwitchUiState,
) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SwitchParametersViewModel(defaultState) as T
    }
}
