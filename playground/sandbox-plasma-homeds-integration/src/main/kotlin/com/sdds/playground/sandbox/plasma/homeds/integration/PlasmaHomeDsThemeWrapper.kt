package com.sdds.playground.sandbox.plasma.homeds.integration

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import com.sdds.plasma.homeds.theme.darkPlasmaHomeDsColors
import com.sdds.plasma.homeds.theme.darkPlasmaHomeDsGradients
import com.sdds.plasma.homeds.theme.lightPlasmaHomeDsColors
import com.sdds.plasma.homeds.theme.lightPlasmaHomeDsGradients

/**
 * Позволяет обернуть Composable в тему
 */
@Composable
fun PlasmaHomeDsThemeWrapper(content: @Composable () -> Unit) {
    val isDark = isSystemInDarkTheme()
    PlasmaHomeDsTheme(
        colors = if (isDark) darkPlasmaHomeDsColors() else lightPlasmaHomeDsColors(),
        gradients = if (isDark) darkPlasmaHomeDsGradients() else lightPlasmaHomeDsGradients(),
    ) {
        content()
    }
}
