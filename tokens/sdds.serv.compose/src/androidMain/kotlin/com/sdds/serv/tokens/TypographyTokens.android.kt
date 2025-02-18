package com.sdds.serv.tokens

import androidx.compose.ui.text.PlatformTextStyle

@Suppress("DEPRECATION")
internal actual fun getDefaultPlatformTextStyle(): PlatformTextStyle {
    return PlatformTextStyle(includeFontPadding = false)
}