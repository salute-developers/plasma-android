package com.sdds.compose.uikit.overlay

import androidx.compose.runtime.Composable

@Composable
internal actual fun rememberOverlayPlatformAnchor(): OverlayPlatformAnchor = SkikoOverlayPlatformAnchor

@Composable
internal actual fun ConfigureOverlayPopup(
    position: OverlayPosition,
    isFocusable: Boolean,
    platformAnchor: OverlayPlatformAnchor,
) = Unit

private object SkikoOverlayPlatformAnchor : OverlayPlatformAnchor
