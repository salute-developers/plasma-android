package com.sdds.playground.sandbox.plasma.stards.integration

import androidx.compose.runtime.Composable
import com.sdkit.star.designsystem.theme.StarDsTheme
import com.sdkit.star.designsystem.theme.darkStarDsColors
import com.sdkit.star.designsystem.theme.darkStarDsGradients

private val Colors = darkStarDsColors()
private val Gradients = darkStarDsGradients()

/**
 * Позволяет обернуть Composable в тему
 */
@Composable
fun StarDsThemeWrapper(content: @Composable () -> Unit) {
    StarDsTheme(
        colors = Colors,
        gradients = Gradients,
    ) {
        content()
    }
}
