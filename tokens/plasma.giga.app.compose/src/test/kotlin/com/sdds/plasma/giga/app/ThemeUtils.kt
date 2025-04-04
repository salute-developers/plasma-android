package com.sdds.plasma.giga.app

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
import com.sdds.plasma.giga.app.theme.PlasmaGigaAppTheme
import com.sdds.plasma.giga.app.theme.darkPlasmaGigaAppColors
import com.sdds.plasma.giga.app.theme.darkPlasmaGigaAppGradients
import com.sdds.plasma.giga.app.theme.lightPlasmaGigaAppColors
import com.sdds.plasma.giga.app.theme.lightPlasmaGigaAppGradients

private val DarkColors = darkPlasmaGigaAppColors()
private val LightColors = lightPlasmaGigaAppColors()
private val DarkGradients = darkPlasmaGigaAppGradients()
private val LightGradients = lightPlasmaGigaAppGradients()

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
    PlasmaGigaAppTheme(
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
