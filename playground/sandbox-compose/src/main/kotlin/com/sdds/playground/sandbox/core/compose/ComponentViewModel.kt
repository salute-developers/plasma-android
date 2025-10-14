package com.sdds.playground.sandbox.core.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sdds.compose.uikit.style.Style
import com.sdds.playground.sandbox.composeTheme
import com.sdds.playground.sandbox.core.ThemeManager
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.CoreComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

internal abstract class ComponentViewModel<State : UiState, S : Style>(
    private val defaultState: State,
    private val componentKey: ComponentKey = ComponentKey("", CoreComponent.CELL),
    private val themeManager: ThemeManager = ThemeManager,
) : ViewModel(), PropertiesOwner {

    protected val internalUiState = MutableStateFlow(defaultState)

    val uiState: StateFlow<State>
        get() = internalUiState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    final override val properties: StateFlow<List<Property<*>>>
        get() = internalUiState
            .mapLatest { state ->
                updateUiStateWithDefaultVariant()
                appearanceProperties(state) + variantProperty(state) + state.toProps()
            }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    @Suppress("UNCHECKED_CAST")
    private fun updateUiStateWithDefaultVariant() {
        val state = internalUiState.value
        val defaultAppearance = getDefaultAppearances()
        val styleProvider = getStyleProvider(defaultAppearance) ?: return
        if (state.variant.isNotEmpty() &&
            styleProvider.variants.contains(state.variant)
        ) {
            return
        }
        internalUiState.value = state.updateVariant(defaultAppearance, styleProvider.defaultVariant) as State
    }

    private fun appearanceProperties(state: State): List<Property.SingleChoiceProperty> {
        return listOf(
            Property.SingleChoiceProperty(
                APPEARANCE_PROPERTY_NAME,
                variants = getAppearances().toList(),
                value = state.appearance,
                onApply = {
                    internalUiState.value = internalUiState.value.updateVariant(it, state.variant) as State
                },
            ),
        )
    }

    @Suppress("UNCHECKED_CAST")
    private fun variantProperty(state: State): List<Property.SingleChoiceProperty> {
        val styleProvider = getStyleProvider(state.appearance) ?: return emptyList()
        val variantProperties = mutableListOf<Property.SingleChoiceProperty>()
        if (styleProvider.variants.isNotEmpty()) {
            variantProperties.add(
                Property.SingleChoiceProperty(
                    VARIANT_PROPERTY_NAME,
                    variants = styleProvider.variants,
                    value = state.variant,
                    onApply = {
                        internalUiState.value = internalUiState.value.updateVariant(state.appearance, it) as State
                    },
                ),
            )
        }
        return variantProperties
    }

    open fun getStyleProvider(appearance: String): ComposeStyleProvider<String, S>? {
        return runCatching {
            val themeInfo = composeTheme(themeManager.currentTheme.value)
            themeInfo.components.get<String, S>(componentKey).styleProviders[appearance]
        }.getOrNull()
    }

    open fun getAppearances(): Set<String> {
        return composeTheme(themeManager.currentTheme.value)
            .components.get<String, S>(componentKey).styleProviders.keys
    }

    open fun getDefaultAppearances(): String {
        return composeTheme(themeManager.currentTheme.value)
            .components.get<String, S>(componentKey).defaultAppearance
    }

    abstract fun State.toProps(): List<Property<*>>

    final override fun resetToDefault() {
        internalUiState.value = defaultState
    }

    private companion object {
        const val VARIANT_PROPERTY_NAME = "variant"
        const val APPEARANCE_PROPERTY_NAME = "appearance"
    }
}
