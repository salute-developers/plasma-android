package com.sdds.testing.vs

import android.content.Context
import android.content.res.Configuration
import android.graphics.Color

internal fun Context.getTextColorPrimary(): Int {
    return if (isDarkMode()) {
        Color.WHITE
    } else {
        Color.BLACK
    }
}

internal fun Context.isDarkMode(): Boolean {
    val nightMode = resources?.configuration?.uiMode?.and(Configuration.UI_MODE_NIGHT_MASK)
    return nightMode == Configuration.UI_MODE_NIGHT_YES || nightMode == Configuration.UI_MODE_NIGHT_UNDEFINED
}
