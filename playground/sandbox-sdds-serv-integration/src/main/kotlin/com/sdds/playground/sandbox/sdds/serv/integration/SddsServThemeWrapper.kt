package com.sdds.playground.sandbox.sdds.serv.integration

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.sdds.compose.uikit.LocalListStyle
import com.sdds.compose.uikit.LocalOverlayStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.list.ListNormal
import com.sdds.serv.styles.list.M
import com.sdds.serv.styles.overlay.Default
import com.sdds.serv.styles.overlay.Overlay
import com.sdds.serv.theme.SddsServTheme
import com.sdds.serv.theme.darkSddsServColors
import com.sdds.serv.theme.darkSddsServGradients
import com.sdds.serv.theme.lightSddsServColors
import com.sdds.serv.theme.lightSddsServGradients

/**
 * Позволяет обернуть Composable в тему
 */
@Composable
fun SddsServThemeWrapper(content: @Composable () -> Unit) {
    val isDark = isSystemInDarkTheme()
    SddsServTheme(
        colors = if (isDark) darkSddsServColors() else lightSddsServColors(),
        gradients = if (isDark) darkSddsServGradients() else lightSddsServGradients(),
    ) {
        CompositionLocalProvider(
            LocalOverlayStyle provides Overlay.Default.style(),
            LocalListStyle provides ListNormal.M.style(),
        ) {
            content()
        }
    }
}
