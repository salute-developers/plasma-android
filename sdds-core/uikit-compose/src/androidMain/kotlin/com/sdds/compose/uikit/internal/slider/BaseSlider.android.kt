package com.sdds.compose.uikit.internal.slider

import androidx.compose.ui.window.PopupProperties

internal actual val SliderPopupProperties: PopupProperties = PopupProperties(
    clippingEnabled = false,
    focusable = false,
    excludeFromSystemGesture = false,
    usePlatformDefaultWidth = true,
)
