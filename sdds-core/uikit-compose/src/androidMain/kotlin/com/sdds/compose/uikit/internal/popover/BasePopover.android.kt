package com.sdds.compose.uikit.internal.popover

import android.view.ViewGroup
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.window.PopupProperties
import androidx.core.view.updateLayoutParams

@Composable
internal actual fun EnsurePopoverCorrectWidth(popupProperties: PopupProperties) {
    if (popupProperties.usePlatformDefaultWidth) {
        val contentView = LocalView.current.rootView
        SideEffect {
            contentView.updateLayoutParams { width = ViewGroup.LayoutParams.MATCH_PARENT }
        }
    }
}