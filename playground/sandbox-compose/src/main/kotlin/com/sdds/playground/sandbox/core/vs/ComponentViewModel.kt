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
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

internal abstract class ComponentViewModel<State : UiState>(
    private val defaultState: State,
    open val componentKey: ComponentKey = ComponentKey("", CoreComponent.CELL),
    private val savedStateHandle: SavedStateHandle = SavedStateHandle(),
    private val themeManager: ThemeManager = ThemeManager,
) : ViewModel(), PropertiesOwner {

    protected val internalUiState = MutableStateFlow(defaultState)
    private val _showEditor = MutableSharedFlow<Property<*>>()

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

    /**
     * Отображает редактор свойста
     */
    val showEditor: SharedFlow<Property<*>> get() = _showEditor.asSharedFlow()

    @Suppress("UNCHECKED_CAST")
    @CallSuper
    override fun updateProperty(name: String, value: Any?) {
        val valueString = value?.toString() ?: return

        if (name == APPEARANCE_PROPERTY_NAME) {
            internalUiState.value =
                internalUiState.value.updateVariant(appearance = valueString) as State
        }

        if (name == VARIANT_PROPERTY_NAME) {
            internalUiState.value =
                internalUiState.value.updateVariant(variant = valueString) as State
        }
        if (name == colorVariantPropertyName) {
            internalUiState.value =
                internalUiState.value.updateColorVariant(valueString) as State
        }
    }

    final override val properties: StateFlow<List<Property<*>>>
        get() = internalUiState
            .combine(theme) { state, _ ->
                appearanceProperties(state) + variantProperties(state) + state.toProps()
            }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    private fun appearanceProperties(state: State): List<Property.SingleChoiceProperty> {
        return listOf(
            Property.SingleChoiceProperty(
                APPEARANCE_PROPERTY_NAME,
                variants = getAppearances().toList(),
                value = state.appearance,
            ),
        )
    }

    private fun variantProperties(state: State): List<Property.SingleChoiceProperty> {
        val styleProvider = getStyleProvider(state.appearance)
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
        val appearance = getDefaultAppearances()
        val variant = internalUiState.value.variant
        if (variant.isNotEmpty() &&
            getStyleProvider(appearance).variants.contains(variant)
        ) {
            return
        }
        internalUiState.value =
            internalUiState.value.updateVariant(
                appearance,
                getStyleProvider(appearance).defaultVariant,
            ) as State
    }

    @Suppress("UNCHECKED_CAST")
    private fun updateUiStateWithDefaultColorVariant() {
        if (internalUiState.value.colorVariant.isNotEmpty()) return
        val appearance = getDefaultAppearances()
        internalUiState.value =
            internalUiState.value.updateColorVariant(
                getStyleProvider(appearance).defaultColorVariant,
            ) as State
    }

    open fun getStyleProvider(appearance: String): ViewStyleProvider<String> {
        return viewTheme(theme.value).components.get<String>(componentKey).run {
            styleProviders[appearance] ?: styleProviders.values.first()
        }
    }

    open fun getAppearances(): Set<String> {
        return viewTheme(theme.value).components.get<String>(componentKey).styleProviders.keys
    }

    open fun getDefaultAppearances(): String {
        return viewTheme(themeManager.currentTheme.value)
            .components.get<String>(componentKey).defaultAppearance
    }

    abstract fun State.toProps(): List<Property<*>>

    final override fun resetToDefault() {
        internalUiState.value = defaultState
    }

    final override fun sendEditPropertyRequest(property: Property<*>) {
        viewModelScope.launch {
            _showEditor.emit(property)
        }
    }

    private companion object {
        const val VARIANT_PROPERTY_NAME = "variant"
        const val APPEARANCE_PROPERTY_NAME = "appearance"
        const val COLOR_VARIANT_PROPERTY_NAME = "view"
    }
}
