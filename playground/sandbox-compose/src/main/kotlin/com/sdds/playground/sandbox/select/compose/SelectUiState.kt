package com.sdds.playground.sandbox.select.compose

import androidx.compose.ui.Alignment
import androidx.compose.ui.window.PopupProperties
import com.sdds.compose.uikit.DropdownProperties
import com.sdds.playground.sandbox.core.compose.UiState

internal data class SelectUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val showLoading: Boolean = false,
    val showEmptyState: Boolean = false,
    val readOnly: Boolean = false,
    val enabled: Boolean = true,
    val triggerType: TriggerType = TriggerType.TextField,
    val triggerAlignment: SelectTriggerAlignment = SelectTriggerAlignment.TopCenter,
    val dropdownProperties: DropdownProperties = DropdownProperties(
        popupProperties = PopupProperties(focusable = true, clippingEnabled = false),
    ),
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

internal enum class TriggerType {
    TextField, Button
}

internal enum class SelectTriggerAlignment(val alignment: Alignment) {
    TopStart(Alignment.TopStart),
    TopEnd(Alignment.TopEnd),
    TopCenter(Alignment.TopCenter),
    Center(Alignment.Center),
    CenterStart(Alignment.CenterStart),
    CenterEnd(Alignment.CenterEnd),
    BottomStart(Alignment.BottomStart),
    BottomEnd(Alignment.BottomEnd),
    BottomCenter(Alignment.BottomCenter),
}
