package com.sdds.playground.sandbox.bottomsheet.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.BottomSheetHandlePlacement
import com.sdds.compose.uikit.ModalBottomSheetStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel для экранов с компонентом BottomSheet
 */
internal class BottomSheetParametersViewModel(
    defaultState: BottomSheetUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<BottomSheetUiState, ModalBottomSheetStyle>(defaultState, componentKey) {

    override fun BottomSheetUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = "handlePlacement",
                value = handlePlacement,
                onApply = { updateHandlePlacement(it) },
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
                name = "fixedHeader",
                value = fixedHeader,
                onApply = { updateFixedHeader(it) },
            ),
            Property.BooleanProperty(
                name = "fixedFooter",
                value = fixedFooter,
                onApply = { updateFixedFooter(it) },
            ),
            Property.BooleanProperty(
                name = "fitContent",
                value = fitContent,
                onApply = { updateFitContent(it) },
            ),
            Property.BooleanProperty(
                name = "littleContent",
                value = littleContent,
                onApply = { updateLittleContent(it) },
            ),
        )
    }

    private fun updateHandlePlacement(handlePlacement: BottomSheetHandlePlacement) {
        internalUiState.value = internalUiState.value.copy(
            handlePlacement = handlePlacement,
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

    private fun updateFixedHeader(fixedHeader: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            fixedHeader = fixedHeader,
        )
    }

    private fun updateFixedFooter(fixedFooter: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            fixedFooter = fixedFooter,
        )
    }
    private fun updateFitContent(fitContent: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            fitContent = fitContent,
        )
    }
    private fun updateLittleContent(littleContent: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            littleContent = littleContent,
        )
    }
}

/**
 * Фабрика [BottomSheetParametersViewModel]
 */
internal class BottomSheetParametersViewModelFactory(
    private val defaultState: BottomSheetUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return BottomSheetParametersViewModel(defaultState, componentKey) as T
    }
}
