package com.sdds.playground.sandbox.chip.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.chip.ChipUiState
import com.sdds.testing.vs.chip.GravityMode
import com.sdds.uikit.ChipGroup

/**
 * ViewModel для экранов с компонентом Chip
 * @param defaultState состояние по-умолчанию
 */
internal class ChipParametersViewModel(
    defaultState: ChipUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<ChipUiState>(defaultState, componentKey) {

    @Suppress("CyclomaticComplexMethod", "ReturnCount")
    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val pName = ChipPropertyName.values().find { it.value == name }
        when (pName) {
            ChipPropertyName.Label -> updateLabel(value?.toString().orEmpty())
            ChipPropertyName.ContentLeft -> updateStartIcon(value as Boolean)
            ChipPropertyName.HasClose -> updateEndIcon(value as Boolean)
            ChipPropertyName.Enabled -> updateEnabledState(value as Boolean)
            ChipPropertyName.Wrapped -> updateWrapped(value as Boolean)
            ChipPropertyName.Quantity -> updateQuantity(value?.toString()?.toInt() ?: 0)
            ChipPropertyName.GravityMode -> updateGravity(GravityMode.valueOf(value?.toString() ?: return))
            ChipPropertyName.SelectionMode -> updateSelectionMode(
                ChipGroup.SelectionMode.valueOf(
                    value?.toString() ?: return,
                ),
            )
            else -> Unit
        }
    }

    private fun updateLabel(text: String) {
        internalUiState.value = internalUiState.value.copy(label = text)
    }

    private fun updateEnabledState(enabled: Boolean) {
        internalUiState.value = internalUiState.value.copy(enabled = enabled)
    }

    private fun updateStartIcon(hasIcon: Boolean) {
        internalUiState.value = internalUiState.value.copy(contentLeft = hasIcon)
    }

    private fun updateEndIcon(hasIcon: Boolean) {
        internalUiState.value = internalUiState.value.copy(hasClose = hasIcon)
    }

    private fun updateWrapped(isWrapped: Boolean) {
        internalUiState.value = internalUiState.value.copy(isWrapped = isWrapped)
    }

    private fun updateQuantity(quantity: Int) {
        internalUiState.value = internalUiState.value.copy(quantity = quantity)
    }

    private fun updateGravity(gravityMode: GravityMode) {
        internalUiState.value = internalUiState.value.copy(gravityMode = gravityMode)
    }

    private fun updateSelectionMode(selectionMode: ChipGroup.SelectionMode) {
        internalUiState.value = internalUiState.value.copy(selectionMode = selectionMode)
    }

    override fun ChipUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
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
        Label("Label"),
        ContentLeft("ContentLeft"),
        HasClose("hasClose"),
        Enabled("Enabled"),
        GapMode("Gap"),
        Wrapped("isWrapped"),
        Quantity("Quantity"),
        GravityMode("Gravity"),
        SelectionMode("SelectionMode"),
    }
}

/**
 * Фабрика [ChipParametersViewModel]
 * @param groupMode режим группы чипов
 * @param defaultState состояние по-умолчанию
 */
internal class ChipParametersViewModelFactory(
    private val defaultState: ChipUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ChipParametersViewModel(defaultState, componentKey) as T
    }
}
