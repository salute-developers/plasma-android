package com.sdds.compose.uikit.internal.platform

import platform.Foundation.NSDate
import platform.Foundation.timeIntervalSince1970

internal actual fun platformCurrentTimeMillis(): Long {
    return (NSDate().timeIntervalSince1970 * 1000).toLong()
}
