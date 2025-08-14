package com.sdds.playground.sandbox.plasma.sd.service.integration

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.sdds.compose.uikit.LocalListStyle
import com.sdds.compose.uikit.LocalOverlayStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.list.ListNormal
import com.sdds.plasma.sd.service.styles.list.M
import com.sdds.plasma.sd.service.styles.overlay.Default
import com.sdds.plasma.sd.service.styles.overlay.Overlay
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import com.sdds.plasma.sd.service.theme.darkPlasmaSdServiceColors
import com.sdds.plasma.sd.service.theme.darkPlasmaSdServiceGradients
import com.sdds.plasma.sd.service.theme.lightPlasmaSdServiceColors
import com.sdds.plasma.sd.service.theme.lightPlasmaSdServiceGradients

/**
 * Позволяет обернуть Composable в тему
 */
@Composable
fun PlasmaSdServiceThemeWrapper(content: @Composable () -> Unit) {
    val isDark = isSystemInDarkTheme()
    PlasmaSdServiceTheme(
        colors = if (isDark) darkPlasmaSdServiceColors() else lightPlasmaSdServiceColors(),
        gradients = if (isDark) darkPlasmaSdServiceGradients() else lightPlasmaSdServiceGradients(),
    ) {
        CompositionLocalProvider(
            LocalOverlayStyle provides Overlay.Default.style(),
            LocalListStyle provides ListNormal.M.style(),
        ) {
            content()
        }
    }
}
