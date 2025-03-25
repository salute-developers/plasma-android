package com.sdds.playground.sandbox.buttons.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.ButtonSpacing
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel для экранов с компонентом BasicButton
 */
internal class ButtonViewModel(
    defaultState: ButtonUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<ButtonUiState, ButtonStyle>(defaultState, componentKey) {

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

    private fun updateValue(value: String?) {
        internalUiState.value = internalUiState.value.copy(
            buttonValue = value.takeIf { it?.isNotBlank() == true },
        )
    }

    private fun updateSpacing(spacing: ButtonSpacing) {
        internalUiState.value = internalUiState.value.copy(
            spacing = spacing,
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
                name = "icon",
                value = icon::class.simpleName.orEmpty(),
                variants = listOf(
                    ButtonIcon.Start::class.simpleName.orEmpty(),
                    ButtonIcon.End::class.simpleName.orEmpty(),
                    ButtonIcon.No::class.simpleName.orEmpty(),
                ),
                onApply = { variantName ->
                    updateIcon(
                        when (variantName) {
                            ButtonIcon.Start::class.simpleName -> ButtonIcon.Start
                            ButtonIcon.End::class.simpleName -> ButtonIcon.End
                            else -> ButtonIcon.No
                        },
                    )
                },
            ),

            Property.StringProperty(
                name = "buttonLabel",
                value = buttonLabel,
                onApply = { updateLabel(it) },
            ),
            Property.StringProperty(
                name = "buttonValue",
                value = buttonValue.orEmpty(),
                onApply = { updateValue(it) },
            ),
            enumProperty(
                name = "spacing",
                value = spacing,
                onApply = { updateSpacing(it) },
            ),
            Property.BooleanProperty(
                name = "enabled",
                value = enabled,
                onApply = { updateEnabledState(it) },
            ),
            Property.BooleanProperty(
                name = "loading",
                value = loading,
                onApply = { updateLoadingState(it) },
            ),
        )
    }
}

/**
 * Фабрика [ButtonViewModel]
 */
internal class ButtonViewModelFactory(
    private val defaultState: ButtonUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ButtonViewModel(defaultState, componentKey) as T
    }
}
