package com.sdds.playground.sandbox.plasma.giga.app.integration

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.sdds.compose.uikit.LocalListStyle
import com.sdds.compose.uikit.LocalOverlayStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.list.ListNormal
import com.sdds.plasma.giga.app.styles.list.M
import com.sdds.plasma.giga.app.styles.overlay.Default
import com.sdds.plasma.giga.app.styles.overlay.Overlay
import com.sdds.plasma.giga.app.theme.PlasmaGigaAppTheme
import com.sdds.plasma.giga.app.theme.darkPlasmaGigaAppColors
import com.sdds.plasma.giga.app.theme.darkPlasmaGigaAppGradients
import com.sdds.plasma.giga.app.theme.lightPlasmaGigaAppColors
import com.sdds.plasma.giga.app.theme.lightPlasmaGigaAppGradients

/**
 * Позволяет обернуть Composable в тему
 */
@Composable
fun PlasmaGigaAppThemeWrapper(content: @Composable () -> Unit) {
    val isDark = isSystemInDarkTheme()
    PlasmaGigaAppTheme(
        colors = if (isDark) darkPlasmaGigaAppColors() else lightPlasmaGigaAppColors(),
        gradients = if (isDark) darkPlasmaGigaAppGradients() else lightPlasmaGigaAppGradients(),
    ) {
        CompositionLocalProvider(
            LocalOverlayStyle provides Overlay.Default.style(),
            LocalListStyle provides ListNormal.M.style(),
        ) {
            content()
        }
    }
}
