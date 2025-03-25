package com.sdds.playground.sandbox.plasma.giga.integration

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
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
        content()
    }
}
