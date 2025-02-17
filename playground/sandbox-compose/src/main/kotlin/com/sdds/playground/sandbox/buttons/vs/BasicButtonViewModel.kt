package com.sdds.playground.sandbox.buttons.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.StylesProviderView
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.PropertiesOwner
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.button.ButtonIcon
import com.sdds.testing.vs.button.ButtonUiState
import com.sdds.uikit.Button

/**
 * ViewModel для экранов с компонентом BasicButton и IconButton
 */
internal class BasicButtonViewModel(
    defaultState: ButtonUiState,
) : ComponentViewModel<ButtonUiState>(defaultState) {

    override fun getStyleProvider(stylesProvider: StylesProviderView): ViewStyleProvider<String> {
        return stylesProvider.basicButton
    }

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
            PropertyName.Value -> updateValue(valueString)
            PropertyName.Spacing -> updateSpacing(Button.Spacing.valueOf(valueString))
            PropertyName.Loading -> updateLoadingState(valueString.toBoolean())
            PropertyName.Enabled -> updateEnabledState(valueString.toBoolean())
            PropertyName.FixedSize -> updateFixedSize(valueString.toBoolean())
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

    private fun updateValue(value: String?) {
        internalUiState.value = internalUiState.value.copy(
            buttonValue = value.takeIf { it?.isNotBlank() == true },
        )
    }

    private fun updateSpacing(spacing: Button.Spacing) {
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

    private fun updateFixedSize(fixedSize: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            fixedSize = fixedSize,
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
            Property.StringProperty(
                name = PropertyName.Value.value,
                value = buttonValue.orEmpty(),
            ),
            enumProperty(
                name = PropertyName.Spacing.value,
                value = spacing,
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
        Value("value"),
        Spacing("spacing"),
        Loading("loading"),
        Enabled("enabled"),
        FixedSize("fixedSize"),
    }
}

/**
 * Фабрика [BasicButtonViewModel]
 */
internal class BasicButtonViewModelFactory(
    private val defaultState: ButtonUiState,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return BasicButtonViewModel(defaultState) as T
    }
}
