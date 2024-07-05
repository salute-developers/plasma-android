package com.sdds.playground.sandbox

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.sdds.playground.themebuilder.tokens.compose.DefaultTheme
import com.sdds.playground.themebuilder.tokens.compose.darkDefaultColors
import com.sdds.playground.themebuilder.tokens.compose.darkDefaultGradients
import com.sdds.playground.themebuilder.tokens.compose.lightDefaultColors
import com.sdds.playground.themebuilder.tokens.compose.lightDefaultGradients

private val DarkColors = darkDefaultColors()
private val LightColors = lightDefaultColors()
private val DarkGradients = darkDefaultGradients()
private val LightGradients = lightDefaultGradients()

/**
 * Тема демо-приложения
 */
@Composable
fun SandboxTheme(
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
            window.statusBarColor = colorScheme.surfaceDefaultSolidDefault.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    DefaultTheme(
        colors = if (darkTheme) DarkColors else LightColors,
        gradients = if (darkTheme) DarkGradients else LightGradients,
        content = content,
    )
}
