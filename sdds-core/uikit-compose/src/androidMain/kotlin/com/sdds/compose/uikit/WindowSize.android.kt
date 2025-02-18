package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.IntSize

/**
 * Возвращает информацию о размерности окна как state
 */
@Composable
actual fun collectWindowSizeInfoAsState(): State<WindowSizeInfo> {
    val info = remember { mutableStateOf(WindowSizeInfo()) }
    val context = LocalContext.current
    val mediumWidthBreakPoint = WindowSizeClass.Medium.widthBreakPoint().px
    val mediumHeightBreakPoint = WindowSizeClass.Medium.heightBreakPoint().px
    val expandedWidthBreakPoint = WindowSizeClass.Expanded.widthBreakPoint().px
    val expandedHeightBreakPoint = WindowSizeClass.Expanded.heightBreakPoint().px

    info.value = remember(context, LocalConfiguration.current) {
        val displayMetrics = context.resources.displayMetrics
        val size = IntSize(displayMetrics.widthPixels, displayMetrics.heightPixels)
        val widthClass = when {
            size.width < mediumWidthBreakPoint -> WindowSizeClass.Compact
            size.width in mediumWidthBreakPoint until expandedWidthBreakPoint -> WindowSizeClass.Medium
            else -> WindowSizeClass.Expanded
        }
        val heightClass = when {
            size.height < mediumHeightBreakPoint -> WindowSizeClass.Compact
            size.height in mediumHeightBreakPoint until expandedHeightBreakPoint -> WindowSizeClass.Medium
            else -> WindowSizeClass.Expanded
        }
        WindowSizeInfo(widthClass, heightClass)
    }

    return info
}