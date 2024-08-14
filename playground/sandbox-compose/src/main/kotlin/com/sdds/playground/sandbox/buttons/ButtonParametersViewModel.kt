package com.sdds.playground.sandbox.buttons

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.sdds.compose.uikit.Button
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
     * @see PropertiesOwner.resetToDefault
     */
    override fun resetToDefault() {
        _buttonSate.value = ButtonUiState()
    }

    private fun updateStyle(style: SandboxButton.Style) {
        _buttonSate.value = _buttonSate.value.copy(
            style = style,
        )
    }

    private fun updateSize(size: SandboxButton.Size) {
        _buttonSate.value = _buttonSate.value.copy(
            size = size,
        )
    }

    private fun updateIcon(icon: ButtonIcon) {
        _buttonSate.value = _buttonSate.value.copy(
            icon = icon,
        )
    }

    private fun updateShape(shape: SandboxButton.IconButtonShape) {
        _buttonSate.value = _buttonSate.value.copy(
            shape = shape,
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

    private fun ButtonUiState.toIconButtonProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = "style",
                value = style,
                onApply = { updateStyle(it) },
            ),

            enumProperty(
                name = "size",
                value = size,
                onApply = { updateSize(it) },
            ),

            enumProperty(
                name = "shape",
                value = shape,
                onApply = { updateShape(it) },
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

    private fun ButtonUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = "style",
                value = style,
                onApply = { updateStyle(it) },
            ),

            enumProperty(
                name = "size",
                value = size,
                onApply = { updateSize(it) },
            ),

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
