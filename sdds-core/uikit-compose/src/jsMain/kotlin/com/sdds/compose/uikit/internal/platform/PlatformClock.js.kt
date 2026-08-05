package com.sdds.compose.uikit.internal.platform

import kotlin.time.TimeSource

private val platformClockStart = TimeSource.Monotonic.markNow()

internal actual fun platformCurrentTimeMillis(): Long {
    return platformClockStart.elapsedNow().inWholeMilliseconds
}
