package com.sdds.playground.sandbox.core.vs

import androidx.annotation.CallSuper
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.integration.StylesProviderView
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn

internal abstract class ComponentViewModel<State : UiState>(
    private val defaultState: State,
) : ViewModel(), PropertiesOwner {

    protected val internalUiState = MutableStateFlow(defaultState)

    /**
     * Тема
     */
    val theme: StateFlow<Theme>
        get() = ViewSystemThemeState.theme

    /**
     * Cостояние компонента
     */
    val uiState: StateFlow<State>
        get() = internalUiState.asStateFlow()

    @Suppress("UNCHECKED_CAST")
    @CallSuper
    override fun updateProperty(name: String, value: Any?) {
        val valueString = value?.toString() ?: return
        if (name == VARIANT_PROPERTY_NAME) {
            internalUiState.value =
                internalUiState.value.updateVariant(valueString) as State
        }
        if (name == COLOR_VARIANT_PROPERTY_NAME) {
            internalUiState.value =
                internalUiState.value.updateColorVariant(valueString) as State
        }
    }

    final override val properties: StateFlow<List<Property<*>>>
        get() = internalUiState
            .combine(theme) { state, theme ->
                variantProperties(state, theme) + state.toProps()
            }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    private fun variantProperties(state: State, theme: Theme): List<Property.SingleChoiceProperty> {
        val styleProvider = getStyleProvider(theme.view.stylesProvider)
        val variantProperties = mutableListOf<Property.SingleChoiceProperty>()
        if (styleProvider.variants.isNotEmpty()) {
            updateUiStateWithDefaultVariant(theme)
            variantProperties.add(
                Property.SingleChoiceProperty(
                    VARIANT_PROPERTY_NAME,
                    variants = styleProvider.variants,
                    value = state.variant,
                ),
            )
        }
        if (styleProvider.colorVariants.isNotEmpty()) {
            updateUiStateWithDefaultColorVariant(theme)
            variantProperties.add(
                Property.SingleChoiceProperty(
                    COLOR_VARIANT_PROPERTY_NAME,
                    variants = styleProvider.colorVariants,
                    value = state.colorVariant,
                ),
            )
        }
        return variantProperties
    }

    @Suppress("UNCHECKED_CAST")
    private fun updateUiStateWithDefaultVariant(theme: Theme) {
        if (internalUiState.value.variant.isNotEmpty()) return
        internalUiState.value =
            internalUiState.value.updateVariant(
                getStyleProvider(theme.view.stylesProvider).defaultVariant,
            ) as State
    }

    @Suppress("UNCHECKED_CAST")
    private fun updateUiStateWithDefaultColorVariant(theme: Theme) {
        if (internalUiState.value.colorVariant.isNotEmpty()) return
        internalUiState.value =
            internalUiState.value.updateColorVariant(
                getStyleProvider(theme.view.stylesProvider).defaultColorVariant,
            ) as State
    }

    abstract fun getStyleProvider(stylesProvider: StylesProviderView): ViewStyleProvider<String>

    abstract fun State.toProps(): List<Property<*>>

    final override fun resetToDefault() {
        internalUiState.value = defaultState
    }

    private companion object {
        const val VARIANT_PROPERTY_NAME = "variant"
        const val COLOR_VARIANT_PROPERTY_NAME = "view"
    }
}

internal val ComponentViewModel<*>.stylesProvider: StylesProviderView
    get() = theme.value.view.stylesProvider
