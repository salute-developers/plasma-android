package com.sdds.playground.sandbox.chip.vs.group

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.chip.vs.CheckedState
import com.sdds.playground.sandbox.chip.vs.ChipUiState
import com.sdds.playground.sandbox.chip.vs.GravityMode
import com.sdds.playground.sandbox.core.integration.StylesProviderView
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.uikit.ChipGroup

/**
 * ViewModel для экранов с компонентом Chip
 * @param defaultState состояние по-умолчанию
 */
internal class ChipGroupParametersViewModel(
    defaultState: ChipUiState,
) : ComponentViewModel<ChipUiState>(defaultState) {

    override fun getStyleProvider(stylesProvider: StylesProviderView): ViewStyleProvider<String> {
        return stylesProvider.chipGroup
    }

    @Suppress("CyclomaticComplexMethod", "ReturnCount")
    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val pName = ChipPropertyName.values().find { it.value == name }
        when (pName) {
            ChipPropertyName.Label -> updateLabel(value?.toString().orEmpty())
            ChipPropertyName.ContentLeft -> updateStartIcon(value as Boolean)
            ChipPropertyName.HasClose -> updateEndIcon(value as Boolean)
            ChipPropertyName.Wrapped -> updateWrapped(value as Boolean)
            ChipPropertyName.Quantity -> updateQuantity(value?.toString()?.toInt() ?: 0)
            ChipPropertyName.GravityMode -> updateGravity(GravityMode.valueOf(value?.toString() ?: return))
            ChipPropertyName.CheckedState -> updateCheckedState(CheckedState.valueOf(value?.toString() ?: return))
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

    private fun updateCheckedState(checkedState: CheckedState) {
        internalUiState.value = internalUiState.value.copy(checkedState = checkedState)
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
                name = ChipPropertyName.Wrapped.value,
                value = isWrapped,
            ),

            enumProperty(
                name = ChipPropertyName.GravityMode.value,
                value = gravityMode,
            ),

            Property.IntProperty(
                name = ChipPropertyName.Quantity.value,
                value = quantity,
            ),

            enumProperty(
                name = ChipPropertyName.CheckedState.value,
                value = checkedState,
            ),

            enumProperty(
                name = ChipPropertyName.SelectionMode.value,
                value = selectionMode,
            ),
        )
    }

    private enum class ChipPropertyName(val value: String) {
        Label("Label"),
        ContentLeft("ContentLeft"),
        HasClose("hasClose"),
        GapMode("Gap"),
        Wrapped("isWrapped"),
        Quantity("Quantity"),
        GravityMode("Gravity"),
        CheckedState("CheckedState"),
        SelectionMode("SelectionMode"),
    }
}

/**
 * Фабрика [ChipGroupParametersViewModel]
 * @param defaultState состояние по-умолчанию
 */
internal class ChipGroupParametersViewModelFactory(
    private val defaultState: ChipUiState,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ChipGroupParametersViewModel(defaultState) as T
    }
}
