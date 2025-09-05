package com.sdds.playground.sandbox.drawer.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.drawer.CloseAlignment
import com.sdds.testing.vs.drawer.DrawerUiState
import com.sdds.uikit.DrawerLayout

/**
 * ViewModel компонента Drawer
 */
internal class DrawerViewModel(
    defaultState: DrawerUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<DrawerUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)
        val valueString = value?.toString() ?: return
        val currentState = internalUiState.value
        internalUiState.value = when (name) {
            DrawerProperty.HasOverlay.value ->
                currentState.copy(hasOverlay = valueString.toBoolean())

            DrawerProperty.CloseIconAlignment.value ->
                currentState.copy(closeIconAlignment = CloseAlignment.valueOf(valueString))

            DrawerProperty.Alignment.value ->
                currentState.copy(alignment = DrawerLayout.DrawerPlacement.valueOf(valueString))

            DrawerProperty.GesturesEnabled.value -> currentState.copy(gesturesEnabled = valueString.toBoolean())
            DrawerProperty.MoveContentEnabled.value -> currentState.copy(moveContentEnabled = valueString.toBoolean())
            DrawerProperty.HasPeekOffset.value -> currentState.copy(hasPeekOffset = valueString.toBoolean())
            DrawerProperty.Header.value -> currentState.copy(header = valueString.toBoolean())
            DrawerProperty.Footer.value -> currentState.copy(footer = valueString.toBoolean())
            DrawerProperty.Absolute.value -> currentState.copy(absoluteClosePlacement = valueString.toBoolean())
            else -> currentState
        }
    }

    override fun DrawerUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.BooleanProperty(
                name = "hasOverlay",
                value = hasOverlay,
            ),
            enumProperty(
                name = "closeIconAlignment",
                value = closeIconAlignment,
            ),
            enumProperty(
                name = "alignment",
                value = alignment,
            ),
            Property.BooleanProperty(
                name = "gesturesEnabled",
                value = gesturesEnabled,
            ),
            Property.BooleanProperty(
                name = "moveContentEnabled",
                value = moveContentEnabled,
            ),
            Property.BooleanProperty(
                name = "hasPeekOffset",
                value = hasPeekOffset,
            ),
            Property.BooleanProperty(
                name = "header",
                value = header,
            ),
            Property.BooleanProperty(
                name = "footer",
                value = footer,
            ),
            Property.BooleanProperty(
                name = "absoluteClosePlacement",
                value = absoluteClosePlacement,
            ),
        )
    }

    private enum class DrawerProperty(val value: String) {
        HasOverlay("hasOverlay"),
        CloseIconAlignment("closeIconAlignment"),
        Alignment("alignment"),
        GesturesEnabled("gesturesEnabled"),
        MoveContentEnabled("moveContentEnabled"),
        HasPeekOffset("hasPeekOffset"),
        Header("header"),
        Footer("footer"),
        Absolute("absoluteClosePlacement"),
    }
}

internal class DrawerViewModelFactory(
    private val defaultState: DrawerUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return DrawerViewModel(defaultState, componentKey) as T
    }
}
