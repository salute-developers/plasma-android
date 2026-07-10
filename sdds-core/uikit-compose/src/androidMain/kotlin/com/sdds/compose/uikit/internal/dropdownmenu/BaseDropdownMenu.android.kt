package com.sdds.compose.uikit.internal.dropdownmenu

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.PopupProperties

internal actual val DefaultModalDropdownDialogProperties: DialogProperties = DialogProperties(
    usePlatformDefaultWidth = false,
    decorFitsSystemWindows = false,
    dismissOnClickOutside = false,
)
internal actual val DefaultModalDropdownPopupProperties: PopupProperties = PopupProperties(
    clippingEnabled = false,
    focusable = true,
    usePlatformDefaultWidth = false,
)

@Composable
internal actual fun rememberDialogLocationInScreen(): IntOffset {
    val rootView = LocalView.current.rootView
    return remember(rootView) {
        val location = IntArray(2)
        rootView.getLocationOnScreen(location)
        IntOffset(location[0], location[1])
    }
}
