package com.sdds.playground.sandbox.plasma.stards.integration

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.sdkit.star.designsystem.theme.StarDsTheme
import com.sdkit.star.designsystem.theme.darkStarDsColors
import com.sdkit.star.designsystem.theme.darkStarDsGradients
import com.sdkit.star.designsystem.theme.lightStarDsColors
import com.sdkit.star.designsystem.theme.lightStarDsGradients

/**
 * Позволяет обернуть Composable в тему
 */
@Composable
fun StarDsThemeWrapper(content: @Composable () -> Unit) {
    val isDark = isSystemInDarkTheme()
    StarDsTheme(
        colors = if (isDark) darkStarDsColors() else lightStarDsColors(),
        gradients = if (isDark) darkStarDsGradients() else lightStarDsGradients(),
    ) {
        content()
    }
}
