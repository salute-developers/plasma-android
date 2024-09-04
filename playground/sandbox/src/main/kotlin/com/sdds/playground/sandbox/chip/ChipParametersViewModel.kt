package com.sdds.playground.sandbox.chip

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.sdds.playground.sandbox.core.view.PropertiesOwner
import com.sdds.playground.sandbox.core.view.Property
import com.sdds.playground.sandbox.core.view.enumProperty
import com.sdds.uikit.ChipGroup
import com.sdds.uikit.viewstate.ViewState
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

/**
 * ViewModel для экранов с компонентом Chip
 * @param groupMode режим группы чипов
 * @param defaultState состояние по-умолчанию
 */
internal class ChipParametersViewModel(
    private val groupMode: Boolean,
    private val defaultState: ChipUiState,
) : ViewModel(), PropertiesOwner {

    private val _chipState = MutableStateFlow(defaultState)

    /**
     * Состояние chip
     */
    val chipState: StateFlow<ChipUiState>
        get() = _chipState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _chipState
            .mapLatest { state -> if (groupMode) state.toGroupProps() else state.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    @Suppress("CyclomaticComplexMethod", "ReturnCount")
    override fun updateProperty(name: String, value: Any?) {
        val pName = ChipPropertyName.values().find { it.value == name }
        when (pName) {
            ChipPropertyName.Variant -> updateVariant(ChipVariant.valueOf(value?.toString() ?: return))
            ChipPropertyName.Label -> updateLabel(value?.toString().orEmpty())
            ChipPropertyName.ContentLeft -> updateStartIcon(value as Boolean)
            ChipPropertyName.HasClose -> updateEndIcon(value as Boolean)
            ChipPropertyName.Enabled -> updateEnabledState(value as Boolean)
            ChipPropertyName.GapMode -> updateGapMode(GapMode.valueOf(value?.toString() ?: return))
            ChipPropertyName.Wrapped -> updateWrapped(value as Boolean)
            ChipPropertyName.Quantity -> updateQuantity(value?.toString()?.toInt() ?: 0)
            ChipPropertyName.GravityMode -> updateGravity(GravityMode.valueOf(value?.toString() ?: return))
            ChipPropertyName.CheckedState -> updateCheckedState(ViewState.valueOf(value?.toString() ?: return))
            ChipPropertyName.SelectionMode -> updateSelectionMode(
                ChipGroup.SelectionMode.valueOf(
                    value?.toString() ?: return,
                ),
            )
            else -> Unit
        }
    }

    override fun resetToDefault() {
        _chipState.value = defaultState
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

    private fun updateGapMode(gapMode: GapMode) {
        _chipState.value = _chipState.value.copy(gapMode = gapMode)
    }

    private fun updateWrapped(isWrapped: Boolean) {
        _chipState.value = _chipState.value.copy(isWrapped = isWrapped)
    }

    private fun updateQuantity(quantity: Int) {
        _chipState.value = _chipState.value.copy(quantity = quantity)
    }

    private fun updateGravity(gravityMode: GravityMode) {
        _chipState.value = _chipState.value.copy(gravityMode = gravityMode)
    }

    private fun updateCheckedState(checkedState: ViewState) {
        _chipState.value = _chipState.value.copy(checkedState = checkedState)
    }

    private fun updateSelectionMode(selectionMode: ChipGroup.SelectionMode) {
        _chipState.value = _chipState.value.copy(selectionMode = selectionMode)
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

    private fun ChipUiState.toGroupProps(): List<Property<*>> {
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
                name = ChipPropertyName.Wrapped.value,
                value = isWrapped,
            ),

            enumProperty(
                name = ChipPropertyName.GapMode.value,
                value = gapMode,
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
        Variant("Variant"),
        Label("Label"),
        ContentLeft("ContentLeft"),
        HasClose("hasClose"),
        Enabled("Enabled"),
        GapMode("Gap"),
        Wrapped("isWrapped"),
        Quantity("Quantity"),
        GravityMode("Gravity"),
        CheckedState("CheckedState"),
        SelectionMode("SelectionMode"),
    }
}

/**
 * Фабрика [ChipParametersViewModel]
 * @param groupMode режим группы чипов
 * @param defaultState состояние по-умолчанию
 */
internal class ChipParametersViewModelFactory(
    private val groupMode: Boolean = false,
    private val defaultState: ChipUiState,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ChipParametersViewModel(groupMode = groupMode, defaultState = defaultState) as T
    }
}
