package com.sdds.playground.sandbox.sdds.sbcom.integration

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.sdds.sbcom.theme.SddsSbComTheme
import com.sdds.sbcom.theme.darkSddsSbComColors
import com.sdds.sbcom.theme.darkSddsSbComGradients
import com.sdds.sbcom.theme.lightSddsSbComColors
import com.sdds.sbcom.theme.lightSddsSbComGradients

/**
 * Позволяет обернуть Composable в тему
 */
@Composable
fun SddsSbComThemeWrapper(content: @Composable () -> Unit) {
    val isDark = isSystemInDarkTheme()
    SddsSbComTheme(
        colors = if (isDark) darkSddsSbComColors() else lightSddsSbComColors(),
        gradients = if (isDark) darkSddsSbComGradients() else lightSddsSbComGradients(),
    ) {
        content()
    }
}
