package com.sdds.compose.uikit

import androidx.compose.ui.window.PopupProperties

internal actual val DefaultSelectDropdownProperties: DropdownProperties = DropdownProperties(
    popupProperties = PopupProperties(
        clippingEnabled = false,
        focusable = true,
    ),
)
