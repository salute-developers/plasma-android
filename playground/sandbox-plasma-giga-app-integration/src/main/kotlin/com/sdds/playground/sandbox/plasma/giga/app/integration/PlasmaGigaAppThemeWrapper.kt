package com.sdds.playground.sandbox.plasma.giga.app.integration

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
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
        content()
    }
}
