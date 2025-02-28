package com.sdds.plasma.sd.service

import android.app.Activity
import android.graphics.Color
import androidx.activity.ComponentActivity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.core.view.WindowCompat
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import com.sdds.plasma.sd.service.theme.darkPlasmaSdServiceColors
import com.sdds.plasma.sd.service.theme.darkPlasmaSdServiceGradients
import com.sdds.plasma.sd.service.theme.lightPlasmaSdServiceColors
import com.sdds.plasma.sd.service.theme.lightPlasmaSdServiceGradients

private val DarkColors = darkPlasmaSdServiceColors()
private val LightColors = lightPlasmaSdServiceColors()
private val DarkGradients = darkPlasmaSdServiceGradients()
private val LightGradients = lightPlasmaSdServiceGradients()

@Composable
private fun ThemeSetup(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = when {
        darkTheme -> DarkColors
        else -> LightColors
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = Color.TRANSPARENT
            window.navigationBarColor = Color.TRANSPARENT
            window.decorView.setBackgroundColor(colorScheme.backgroundDefaultPrimary.toArgb())
            WindowCompat.getInsetsController(window, view).apply {
                isAppearanceLightStatusBars = !darkTheme
                isAppearanceLightNavigationBars = !darkTheme
            }
        }
    }
    PlasmaSdServiceTheme(
        colors = colorScheme,
        gradients = if (darkTheme) DarkGradients else LightGradients,
        content = content,
    )
}

internal fun AndroidComposeTestRule<ActivityScenarioRule<ComponentActivity>, ComponentActivity>.content(
    content: @Composable () -> Unit,
) {
    setContent {
        ThemeSetup {
            content()
        }
    }
}
