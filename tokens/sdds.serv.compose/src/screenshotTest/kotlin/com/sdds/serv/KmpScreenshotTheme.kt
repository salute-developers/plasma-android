package com.sdds.serv

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.fixtures.RoborazziScreenshotTheme
import com.sdds.serv.theme.SddsServTheme
import com.sdds.serv.theme.darkSddsServColors
import com.sdds.serv.theme.darkSddsServGradients
import com.sdds.serv.theme.lightSddsServColors
import com.sdds.serv.theme.lightSddsServGradients

private val DarkColors = darkSddsServColors()
private val LightColors = lightSddsServColors()
private val DarkGradients = darkSddsServGradients()
private val LightGradients = lightSddsServGradients()

internal object SddsServScreenshotTheme : RoborazziScreenshotTheme {

    @Composable
    override fun content(
        darkTheme: Boolean,
        content: @Composable () -> Unit,
    ) {
        SddsServTheme(
            colors = if (darkTheme) DarkColors else LightColors,
            gradients = if (darkTheme) DarkGradients else LightGradients,
        ) {
            Box(
                modifier = Modifier
                    .background(SddsServTheme.colors.backgroundDefaultPrimary)
                    .padding(16.dp),
            ) {
                content()
            }
        }
    }
}
