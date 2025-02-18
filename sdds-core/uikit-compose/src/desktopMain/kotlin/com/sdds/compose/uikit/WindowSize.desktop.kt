package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState

/**
 * Возвращает информацию о размерности окна как state
 */
@Composable
actual fun collectWindowSizeInfoAsState(): State<WindowSizeInfo> {
    return rememberUpdatedState(WindowSizeInfo())
}