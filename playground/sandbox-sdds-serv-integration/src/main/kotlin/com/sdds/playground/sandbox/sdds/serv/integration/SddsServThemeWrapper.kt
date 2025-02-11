package com.sdds.playground.sandbox.sdds.serv.integration

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
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
        content()
    }
}