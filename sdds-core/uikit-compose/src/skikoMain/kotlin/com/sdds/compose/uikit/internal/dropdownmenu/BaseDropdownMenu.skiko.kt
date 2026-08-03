package com.sdds.compose.uikit.internal.dropdownmenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.PopupProperties

internal actual val DefaultModalDropdownDialogProperties: DialogProperties
    get() = DialogProperties(
        usePlatformDefaultWidth = false,
        dismissOnClickOutside = false,
    )
internal actual val DefaultModalDropdownPopupProperties: PopupProperties =
    PopupProperties(
        clippingEnabled = false,
        focusable = true,
    )

@Composable
internal actual fun rememberDialogLocationInScreen(): IntOffset = IntOffset.Zero
