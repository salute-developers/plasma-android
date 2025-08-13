package com.sdds.playground.sandbox.plasma.giga.integration

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.sdds.compose.uikit.LocalListStyle
import com.sdds.compose.uikit.LocalOverlayStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.list.ListNormal
import com.sdds.plasma.giga.styles.list.M
import com.sdds.plasma.giga.styles.overlay.Default
import com.sdds.plasma.giga.styles.overlay.Overlay
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
import com.sdds.plasma.giga.theme.darkPlasmaGigaColors
import com.sdds.plasma.giga.theme.darkPlasmaGigaGradients
import com.sdds.plasma.giga.theme.lightPlasmaGigaColors
import com.sdds.plasma.giga.theme.lightPlasmaGigaGradients

/**
 * Позволяет обернуть Composable в тему
 */
@Composable
fun PlasmaGigaThemeWrapper(content: @Composable () -> Unit) {
    val isDark = isSystemInDarkTheme()
    PlasmaGigaTheme(
        colors = if (isDark) darkPlasmaGigaColors() else lightPlasmaGigaColors(),
        gradients = if (isDark) darkPlasmaGigaGradients() else lightPlasmaGigaGradients(),
    ) {
        CompositionLocalProvider(
            LocalOverlayStyle provides Overlay.Default.style(),
            LocalListStyle provides ListNormal.M.style(),
        ) {
            content()
        }
    }
}
