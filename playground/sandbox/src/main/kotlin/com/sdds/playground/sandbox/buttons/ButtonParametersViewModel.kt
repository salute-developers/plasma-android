package com.sdds.playground.sandbox.buttons

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.sdds.playground.sandbox.core.view.PropertiesOwner
import com.sdds.playground.sandbox.core.view.Property
import com.sdds.playground.sandbox.core.view.enumProperty
import com.sdds.uikit.Button
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

/**
 * ViewModel для экранов с компонентом BasicButton и IconButton
 * @param buttonType тип кнопки (см. [ButtonType])
 */
internal class ButtonParametersViewModel(
    private val buttonType: ButtonType,
) : ViewModel(), PropertiesOwner {

    private val _buttonSate = MutableStateFlow(ButtonUiState())

    /**
     * Состояние кнопки
     */
    val buttonState: StateFlow<ButtonUiState>
        get() = _buttonSate.asStateFlow()

    /**
     * @see PropertiesOwner.properties
     */
    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _buttonSate
            .mapLatest { state ->
                when (buttonType) {
                    ButtonType.Basic -> state.toProps()
                    ButtonType.Icon -> state.toIconButtonProps()
                }
            }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    /**
     * @see PropertiesOwner.updateProperty
     */
    @Suppress("CyclomaticComplexMethod")
    override fun updateProperty(name: String, value: Any?) {
        val pName = PropertyName.values().find { it.value == name }
        when (pName) {
            PropertyName.Variant -> updateVariant(ButtonVariant.valueOf(value?.toString() ?: return))
            PropertyName.Icon -> updateIcon(
                when (value?.toString()) {
                    ButtonIcon.Start::class.simpleName -> ButtonIcon.Start
                    ButtonIcon.End::class.simpleName -> ButtonIcon.End
                    else -> ButtonIcon.No
                },
            )
            PropertyName.Label -> updateLabel(value?.toString().orEmpty())
            PropertyName.Value -> updateValue(value?.toString())
            PropertyName.Spacing -> updateSpacing(Button.Spacing.valueOf(value?.toString() ?: return))
            PropertyName.Loading -> updateLoadingState(value?.toString().toBoolean())
            PropertyName.Enabled -> updateEnabledState(value?.toString().toBoolean())
            PropertyName.FixedSize -> updateFixedSize(value?.toString().toBoolean())
            null -> {}
        }
    }

    /**
     * @see PropertiesOwner.resetToDefault
     */
    override fun resetToDefault() {
        _buttonSate.value = ButtonUiState()
    }

    private fun updateVariant(variant: ButtonVariant) {
        _buttonSate.value = _buttonSate.value.copy(
            variant = variant,
        )
    }

    private fun updateIcon(icon: ButtonIcon) {
        _buttonSate.value = _buttonSate.value.copy(
            icon = icon,
        )
    }

    private fun updateLabel(label: String) {
        _buttonSate.value = _buttonSate.value.copy(
            buttonLabel = label,
        )
    }

    private fun updateValue(value: String?) {
        _buttonSate.value = _buttonSate.value.copy(
            buttonValue = value.takeIf { it?.isNotBlank() == true },
        )
    }

    private fun updateSpacing(spacing: Button.Spacing) {
        _buttonSate.value = _buttonSate.value.copy(
            spacing = spacing,
        )
    }

    private fun updateEnabledState(enabled: Boolean) {
        _buttonSate.value = _buttonSate.value.copy(
            enabled = enabled,
        )
    }

    private fun updateLoadingState(loading: Boolean) {
        _buttonSate.value = _buttonSate.value.copy(
            loading = loading,
        )
    }

    private fun updateFixedSize(fixedSize: Boolean) {
        _buttonSate.value = _buttonSate.value.copy(
            fixedSize = fixedSize,
        )
    }

    private fun ButtonUiState.toIconButtonProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = PropertyName.Variant.value,
                value = variant,
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

    private fun ButtonUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = PropertyName.Variant.value,
                value = variant,
            ),

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
            Property.BooleanProperty(
                name = PropertyName.FixedSize.value,
                value = fixedSize,
            ),

        )
    }

    private enum class PropertyName(val value: String) {
        Variant("variant"),
        Icon("icon"),
        Label("label"),
        Value("value"),
        Spacing("spacing"),
        Loading("loading"),
        Enabled("enabled"),
        FixedSize("fixed size"),
    }
}

/**
 * Тип кнопки
 */
internal enum class ButtonType {

    /**
     * Компонент BasicButton
     */
    Basic,

    /**
     * Компонент IconButton
     */
    Icon,
}

/**
 * Фабрика [ButtonParametersViewModel]
 * @param type тип кнопки
 */
internal class ButtonParametersViewModelFactory(
    private val type: ButtonType,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        Log.e("ButtonParametersViewModelFactory", "create: type $type")
        return ButtonParametersViewModel(buttonType = type) as T
    }
}
