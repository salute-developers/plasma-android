package com.sdkit.star.designsystem

import android.app.Activity
import android.graphics.Color
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.core.view.WindowCompat
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.sdkit.star.designsystem.theme.StarDsTheme
import com.sdkit.star.designsystem.theme.darkStarDsColors
import com.sdkit.star.designsystem.theme.darkStarDsGradients
import com.sdkit.star.designsystem.theme.lightStarDsColors
import com.sdkit.star.designsystem.theme.lightStarDsGradients

private val DarkColors = darkStarDsColors()
private val LightColors = lightStarDsColors()
private val DarkGradients = darkStarDsGradients()
private val LightGradients = lightStarDsGradients()

@Composable
private fun ThemeSetup(
    darkTheme: Boolean = true,
    content: @Composable () -> Unit,
) {
    val colorScheme = if (darkTheme) DarkColors else LightColors
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            (view.context as? Activity)?.window?.apply {
                statusBarColor = Color.TRANSPARENT
                navigationBarColor = Color.TRANSPARENT
                decorView.setBackgroundColor(colorScheme.backgroundDefaultPrimary.toArgb())
                WindowCompat.getInsetsController(this, view).apply {
                    isAppearanceLightStatusBars = !darkTheme
                    isAppearanceLightNavigationBars = !darkTheme
                }
            }
        }
    }
    StarDsTheme(
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
