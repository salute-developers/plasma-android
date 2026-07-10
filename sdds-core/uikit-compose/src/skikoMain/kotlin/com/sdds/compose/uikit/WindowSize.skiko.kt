package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.unit.IntSize

@Composable
internal actual fun rememberWindowSize(): IntSize {
    val windowInfo = LocalWindowInfo.current
    return remember(windowInfo) { windowInfo.containerSize }
}
