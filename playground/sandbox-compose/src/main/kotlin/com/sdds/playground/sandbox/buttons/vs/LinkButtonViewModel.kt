package com.sdds.playground.sandbox.buttons.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.PropertiesOwner
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.button.ButtonIcon
import com.sdds.testing.vs.button.ButtonUiState

/**
 * ViewModel для экранов с компонентом LinkButton
 */
internal class LinkButtonViewModel(
    defaultState: ButtonUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<ButtonUiState>(defaultState, componentKey) {

    /**
     * @see PropertiesOwner.updateProperty
     */
    @Suppress("CyclomaticComplexMethod")
    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val pName = PropertyName.values().find { it.value == name }
        val valueString = value?.toString() ?: return
        when (pName) {
            PropertyName.Icon -> updateIcon(
                when (valueString) {
                    ButtonIcon.Start::class.simpleName -> ButtonIcon.Start
                    ButtonIcon.End::class.simpleName -> ButtonIcon.End
                    else -> ButtonIcon.No
                },
            )
            PropertyName.Label -> updateLabel(value?.toString().orEmpty())
            PropertyName.Loading -> updateLoadingState(valueString.toBoolean())
            PropertyName.Enabled -> updateEnabledState(valueString.toBoolean())
            null -> {}
        }
    }

    private fun updateIcon(icon: ButtonIcon) {
        internalUiState.value = internalUiState.value.copy(
            icon = icon,
        )
    }

    private fun updateLabel(label: String) {
        internalUiState.value = internalUiState.value.copy(
            buttonLabel = label,
        )
    }

    private fun updateEnabledState(enabled: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            enabled = enabled,
        )
    }

    private fun updateLoadingState(loading: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            loading = loading,
        )
    }

    override fun ButtonUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.SingleChoiceProperty(
                name = PropertyName.Icon.value,
                value = icon::class.simpleName.orEmpty(),
                variants = listOf(
                    ButtonIcon.Start::class.simpleName.orEmpty(),
                    ButtonIcon.End::class.simpleName.orEmpty(),
                    ButtonIcon.No::class.simpleName.orEmpty(),
                ),
            ),

            Property.StringProperty(
                name = PropertyName.Label.value,
                value = buttonLabel,
            ),
            Property.BooleanProperty(
                name = PropertyName.Enabled.value,
                value = enabled,
            ),
            Property.BooleanProperty(
                name = PropertyName.Loading.value,
                value = loading,
            ),
        )
    }

    private enum class PropertyName(val value: String) {
        Icon("icon"),
        Label("label"),
        Loading("loading"),
        Enabled("enabled"),
    }
}

/**
 * Фабрика [BasicButtonViewModel]
 */
internal class LinkButtonViewModelFactory(
    private val defaultState: ButtonUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LinkButtonViewModel(defaultState = defaultState, componentKey = componentKey) as T
    }
}
