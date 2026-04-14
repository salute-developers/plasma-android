package com.sdds.sbcom

import android.app.Activity
import androidx.activity.ComponentActivity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.core.view.WindowCompat
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.sdds.compose.uikit.AvatarGroupStyle
import com.sdds.compose.uikit.LocalAvatarGroupStyle
import com.sdds.compose.uikit.LocalAvatarStyle
import com.sdds.sbcom.theme.SddsSbComTheme
import com.sdds.sbcom.theme.darkSddsSbComColors
import com.sdds.sbcom.theme.darkSddsSbComGradients
import com.sdds.sbcom.theme.lightSddsSbComColors
import com.sdds.sbcom.theme.lightSddsSbComGradients

private val DarkColors = darkSddsSbComColors()
private val LightColors = lightSddsSbComColors()
private val DarkGradients = darkSddsSbComGradients()
private val LightGradients = lightSddsSbComGradients()

/**
 * Тема для тестов
 */
@Composable
fun ThemeSetup(
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

            WindowCompat.setDecorFitsSystemWindows(window, false)

            window.statusBarColor = colorScheme.backgroundDefaultPrimary.toArgb()
            window.navigationBarColor = colorScheme.backgroundDefaultPrimary.toArgb()
            window.decorView.setBackgroundColor(colorScheme.backgroundDefaultPrimary.toArgb())
            WindowCompat.getInsetsController(window, view).apply {
                isAppearanceLightStatusBars = !darkTheme
                isAppearanceLightNavigationBars = !darkTheme
            }
        }
    }

    SddsSbComTheme(
        colors = colorScheme,
        gradients = if (darkTheme) DarkGradients else LightGradients,
    ) {
        CompositionLocalProvider(
            LocalAvatarGroupStyle provides AvatarGroupStyle.builder()
                .avatarStyle(LocalAvatarStyle.current)
                .style(),
        ) {
            content()
        }
    }
}

fun AndroidComposeTestRule<ActivityScenarioRule<ComponentActivity>, ComponentActivity>.content(
    content: @Composable () -> Unit,
) {
    val actionBar = activity.actionBar
    actionBar?.hide()
    setContent {
        ThemeSetup {
            content()
        }
    }
}
