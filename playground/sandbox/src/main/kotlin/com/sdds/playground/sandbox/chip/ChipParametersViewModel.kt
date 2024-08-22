package com.sdds.playground.sandbox.chip

import androidx.lifecycle.ViewModel
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
 * ViewModel для экранов с компонентом Chip
 */
internal class ChipParametersViewModel : ViewModel(), PropertiesOwner {

    private val _chipState = MutableStateFlow(ChipUiState())

    /**
     * Состояние chip
     */
    val chipState: StateFlow<ChipUiState>
        get() = _chipState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _chipState
            .mapLatest { state -> state.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    override fun updateProperty(name: String, value: Any?) {
        val pName = ChipPropertyName.values().find { it.value == name }
        when (pName) {
            ChipPropertyName.Variant -> updateVariant(ChipVariant.valueOf(value?.toString() ?: return))
            ChipPropertyName.Label -> updateLabel(value?.toString().orEmpty())
            ChipPropertyName.ContentLeft -> updateStartIcon(value as Boolean)
            ChipPropertyName.HasClose -> updateEndIcon(value as Boolean)
            ChipPropertyName.Enabled -> updateEnabledState(value as Boolean)
            else -> Unit
        }
    }

    override fun resetToDefault() {
        _chipState.value = ChipUiState()
    }

    private fun updateLabel(text: String) {
        _chipState.value = _chipState.value.copy(label = text)
    }

    private fun updateEnabledState(enabled: Boolean) {
        _chipState.value = _chipState.value.copy(enabled = enabled)
    }

    private fun updateVariant(variant: ChipVariant) {
        _chipState.value = _chipState.value.copy(variant = variant)
    }

    private fun updateStartIcon(hasIcon: Boolean) {
        _chipState.value = _chipState.value.copy(contentLeft = hasIcon)
    }

    private fun updateEndIcon(hasIcon: Boolean) {
        _chipState.value = _chipState.value.copy(hasClose = hasIcon)
    }

    private fun ChipUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = ChipPropertyName.Variant.value,
                value = variant,
            ),

            Property.StringProperty(
                name = ChipPropertyName.Label.value,
                value = label,
            ),

            Property.BooleanProperty(
                name = ChipPropertyName.ContentLeft.value,
                value = contentLeft,
            ),

            Property.BooleanProperty(
                name = ChipPropertyName.HasClose.value,
                value = hasClose,
            ),

            Property.BooleanProperty(
                name = ChipPropertyName.Enabled.value,
                value = enabled,
            ),
        )
    }

    private enum class ChipPropertyName(val value: String) {
        Variant("Variant"),
        Label("Label"),
        ContentLeft("ContentLeft"),
        HasClose("hasClose"),
        Enabled("Enabled"),
    }
}
