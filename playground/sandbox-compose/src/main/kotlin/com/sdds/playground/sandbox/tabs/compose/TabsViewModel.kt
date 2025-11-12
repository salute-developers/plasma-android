package com.sdds.playground.sandbox.tabs.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.TabsStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента Tabs
 */
internal class TabsViewModel(
    defaultState: TabsUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<TabsUiState, TabsStyle>(
    defaultState,
    componentKey,
) {

    @Suppress("LongMethod")
    override fun TabsUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.IntProperty(
                name = "amount",
                value = amount,
                onApply = { internalUiState.value = internalUiState.value.copy(amount = it.coerceIn(1, 50)) },
            ),
            enumProperty(
                name = "clip",
                value = clip,
                onApply = { internalUiState.value = internalUiState.value.copy(clip = it) },
            ),
            enumProperty(
                name = "icon",
                value = icon,
                onApply = { internalUiState.value = internalUiState.value.copy(icon = it) },
            ),
            Property.StringProperty(
                name = "tabItemLabel",
                value = tabItemLabel,
                onApply = { internalUiState.value = internalUiState.value.copy(tabItemLabel = it) },
            ),
            Property.StringProperty(
                name = "tabItemValue",
                value = tabItemValue,
                onApply = { internalUiState.value = internalUiState.value.copy(tabItemValue = it) },
            ),
            Property.StringProperty(
                name = "count",
                value = count,
                onApply = { internalUiState.value = internalUiState.value.copy(count = it) },
            ),
            Property.BooleanProperty(
                name = "stretch",
                value = stretch,
                onApply = { internalUiState.value = internalUiState.value.copy(stretch = it) },
            ),
            Property.BooleanProperty(
                name = "enabled",
                value = enabled,
                onApply = { internalUiState.value = internalUiState.value.copy(enabled = it) },
            ),
            Property.BooleanProperty(
                name = "counter",
                value = counter,
                onApply = { internalUiState.value = internalUiState.value.copy(counter = it) },
            ),
            Property.BooleanProperty(
                name = "actionEnabled",
                value = actionEnabled,
                onApply = { internalUiState.value = internalUiState.value.copy(actionEnabled = it) },
            ),
            Property.BooleanProperty(
                name = "dividerEnabled",
                value = dividerEnabled,
                onApply = { internalUiState.value = internalUiState.value.copy(dividerEnabled = it) },
            ),
            Property.BooleanProperty(
                name = "indicatorEnabled",
                value = indicatorEnabled,
                onApply = { internalUiState.value = internalUiState.value.copy(indicatorEnabled = it) },
            ),
        )
    }
}

internal class TabsViewModelFactory(
    private val defaultState: TabsUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TabsViewModel(defaultState, componentKey) as T
    }
}
