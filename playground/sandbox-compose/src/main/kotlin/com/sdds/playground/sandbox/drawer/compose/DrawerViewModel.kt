package com.sdds.playground.sandbox.drawer.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.CloseIconAlignment
import com.sdds.compose.uikit.DrawerAlignment
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.playground.sandbox.bottomsheet.compose.BottomSheetParametersViewModel
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel для экранов с компонентом Drawer
 */
internal class DrawerViewModel(
    defaultState: DrawerUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<DrawerUiState, DrawerStyle>(defaultState, componentKey) {

    override fun DrawerUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = "alignment",
                value = alignment,
                onApply = { updateAlignment(it) },
            ),
            enumProperty(
                name = "closeIconAlignment",
                value = closeIconAlignment,
                onApply = { updateCloseIconAlignment(it) },
            ),
            Property.BooleanProperty(
                name = "closeIconAbsolute",
                value = closeIconAbsolute,
                onApply = { updateCloseIconAbsolute(it) },
            ),
            Property.BooleanProperty(
                name = "header",
                value = header,
                onApply = { updateHeader(it) },
            ),
            Property.BooleanProperty(
                name = "footer",
                value = footer,
                onApply = { updateFooter(it) },
            ),
            Property.BooleanProperty(
                name = "hasOverlay",
                value = hasOverlay,
                onApply = { updateHasOverlay(it) },
            ),
            Property.BooleanProperty(
                name = "hasPeekOffset",
                value = hasPeekOffset,
                onApply = { updateHasPeekOffset(it) },
            ),
            Property.BooleanProperty(
                name = "gesturesEnabled",
                value = gesturesEnabled,
                onApply = { updateGesturesEnabled(it) },
            ),
            Property.BooleanProperty(
                name = "moveContentEnabled",
                value = moveContentEnabled,
                onApply = { updateMoveContentEnabled(it) },
            ),
        )
    }

    private fun updateAlignment(alignment: DrawerAlignment) {
        internalUiState.value = internalUiState.value.copy(
            alignment = alignment,
        )
    }

    private fun updateCloseIconAlignment(closeIconAlignment: CloseIconAlignment) {
        internalUiState.value = internalUiState.value.copy(
            closeIconAlignment = closeIconAlignment,
        )
    }

    private fun updateCloseIconAbsolute(closeIconAbsolute: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            closeIconAbsolute = closeIconAbsolute,
        )
    }

    private fun updateHeader(header: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            header = header,
        )
    }

    private fun updateFooter(footer: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            footer = footer,
        )
    }

    private fun updateHasOverlay(hasOverlay: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            hasOverlay = hasOverlay,
        )
    }

    private fun updateHasPeekOffset(hasPeekOffset: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            hasPeekOffset = hasPeekOffset,
        )
    }

    private fun updateGesturesEnabled(gesturesEnabled: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            gesturesEnabled = gesturesEnabled,
        )
    }

    private fun updateMoveContentEnabled(moveContentEnabled: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            moveContentEnabled = moveContentEnabled,
        )
    }
}

/**
 * Фабрика [BottomSheetParametersViewModel]
 */
internal class DrawerViewModelFactory(
    private val defaultState: DrawerUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return DrawerViewModel(defaultState, componentKey) as T
    }
}
