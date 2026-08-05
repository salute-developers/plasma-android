package com.sdds.compose.sandbox.internal

internal enum class LargeNavigationMode {
    Persistent,
    FocusDriven,
}

internal expect val platformLargeNavigationMode: LargeNavigationMode
