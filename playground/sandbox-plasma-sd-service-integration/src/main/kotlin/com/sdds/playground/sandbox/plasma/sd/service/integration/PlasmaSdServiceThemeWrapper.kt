package com.sdds.playground.sandbox.plasma.sd.service.integration

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
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
        content()
    }
}