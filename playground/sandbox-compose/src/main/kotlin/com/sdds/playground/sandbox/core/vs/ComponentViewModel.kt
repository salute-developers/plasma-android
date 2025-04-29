package com.sdds.playground.sandbox.core.vs

import androidx.annotation.CallSuper
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.ThemeManager
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.CoreComponent
import com.sdds.playground.sandbox.viewTheme
import com.sdds.testing.vs.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn

internal abstract class ComponentViewModel<State : UiState>(
    private val defaultState: State,
    open val componentKey: ComponentKey = ComponentKey("", CoreComponent.CELL),
    private val savedStateHandle: SavedStateHandle = SavedStateHandle(),
    private val themeManager: ThemeManager = ThemeManager,
) : ViewModel(), PropertiesOwner {

    protected val internalUiState = MutableStateFlow(defaultState)

    protected open val colorVariantPropertyName: String
        get() = COLOR_VARIANT_PROPERTY_NAME

    /**
     * Тема
     */
    val theme: StateFlow<Theme>
        get() = themeManager.currentTheme

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
        if (name == colorVariantPropertyName) {
            internalUiState.value =
                internalUiState.value.updateColorVariant(valueString) as State
        }
    }

    final override val properties: StateFlow<List<Property<*>>>
        get() = internalUiState
            .combine(theme) { state, _ ->
                variantProperties(state) + state.toProps()
            }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    private fun variantProperties(state: State): List<Property.SingleChoiceProperty> {
        val styleProvider = getStyleProvider()
        val variantProperties = mutableListOf<Property.SingleChoiceProperty>()
        if (styleProvider.variants.isNotEmpty()) {
            updateUiStateWithDefaultVariant()
            variantProperties.add(
                Property.SingleChoiceProperty(
                    VARIANT_PROPERTY_NAME,
                    variants = styleProvider.variants,
                    value = state.variant,
                ),
            )
        }
        if (styleProvider.colorVariants.isNotEmpty()) {
            updateUiStateWithDefaultColorVariant()
            variantProperties.add(
                Property.SingleChoiceProperty(
                    colorVariantPropertyName,
                    variants = styleProvider.colorVariants,
                    value = state.colorVariant,
                ),
            )
        }
        return variantProperties
    }

    @Suppress("UNCHECKED_CAST")
    private fun updateUiStateWithDefaultVariant() {
        val variant = internalUiState.value.variant
        if (variant.isNotEmpty() &&
            getStyleProvider().variants.contains(variant)
        ) {
            return
        }
        internalUiState.value =
            internalUiState.value.updateVariant(
                getStyleProvider().defaultVariant,
            ) as State
    }

    @Suppress("UNCHECKED_CAST")
    private fun updateUiStateWithDefaultColorVariant() {
        if (internalUiState.value.colorVariant.isNotEmpty()) return
        internalUiState.value =
            internalUiState.value.updateColorVariant(
                getStyleProvider().defaultColorVariant,
            ) as State
    }

    open fun getStyleProvider(): ViewStyleProvider<String> {
        return viewTheme(theme.value).components.get<String>(componentKey).styleProvider
    }

    abstract fun State.toProps(): List<Property<*>>

    final override fun resetToDefault() {
        internalUiState.value = defaultState
    }

    private companion object {
        const val VARIANT_PROPERTY_NAME = "variant"
        const val COLOR_VARIANT_PROPERTY_NAME = "view"
    }
}
