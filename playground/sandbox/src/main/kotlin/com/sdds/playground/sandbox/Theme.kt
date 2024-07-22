package com.sdds.playground.sandbox

import android.app.Activity
import android.graphics.Color
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.sdds.playground.sandbox.tokens.compose.StylesSaluteTheme
import com.sdds.playground.sandbox.tokens.compose.darkStylesSaluteColors
import com.sdds.playground.sandbox.tokens.compose.darkStylesSaluteGradients
import com.sdds.playground.sandbox.tokens.compose.lightStylesSaluteColors
import com.sdds.playground.sandbox.tokens.compose.lightStylesSaluteGradients

private val DarkColors = darkStylesSaluteColors()
private val LightColors = lightStylesSaluteColors()
private val DarkGradients = darkStylesSaluteGradients()
private val LightGradients = lightStylesSaluteGradients()

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
            window.statusBarColor = Color.TRANSPARENT
            window.navigationBarColor = Color.TRANSPARENT
            window.decorView.setBackgroundColor(colorScheme.backgroundDefaultPrimary.toArgb())
            WindowCompat.getInsetsController(window, view).apply {
                isAppearanceLightStatusBars = !darkTheme
                isAppearanceLightNavigationBars = !darkTheme
            }
        }
    }

    StylesSaluteTheme(
        colors = colorScheme,
        gradients = if (darkTheme) DarkGradients else LightGradients,
        content = content,
    )
}
