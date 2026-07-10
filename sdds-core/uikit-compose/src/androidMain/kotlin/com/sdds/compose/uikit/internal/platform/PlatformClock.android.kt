package com.sdds.compose.uikit.internal.platform

internal actual fun platformCurrentTimeMillis(): Long {
    return System.currentTimeMillis()
}
