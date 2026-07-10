package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.IntSize

@Composable
internal actual fun rememberWindowSize(): IntSize {
    val context = LocalContext.current
    val configuration = LocalConfiguration.current
    return remember(context, configuration) {
        val metrics = context.resources.displayMetrics
        IntSize(metrics.widthPixels, metrics.heightPixels)
    }
}
