package com.sdds.sbcom

import android.app.Activity
import androidx.activity.ComponentActivity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.core.view.WindowCompat
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.sdds.compose.uikit.AvatarGroupStyle
import com.sdds.compose.uikit.LocalAvatarGroupStyle
import com.sdds.compose.uikit.LocalAvatarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.theme.SddsSbComTheme
import com.sdds.sbcom.theme.darkSddsSbComColors
import com.sdds.sbcom.theme.darkSddsSbComGradients
import com.sdds.sbcom.theme.lightSddsSbComColors
import com.sdds.sbcom.theme.lightSddsSbComGradients
import org.json.JSONObject
import java.io.File

private val DarkColors = darkSddsSbComColors()
private val LightColors = lightSddsSbComColors()
private val DarkGradients = darkSddsSbComGradients()
private val LightGradients = lightSddsSbComGradients()

val LocalProvidedStyles = compositionLocalOf { emptySet<String>() }

val ProvidedStyleKeys: Set<String> by lazy {
    val moduleDir = System.getProperty("moduleDir") ?: ""
    println("mooduleDir: $moduleDir")
    val jsonFile = File(moduleDir).parentFile?.resolve("config-info-compose.json")
        ?: return@lazy emptySet()

    if (!jsonFile.exists()) return@lazy emptySet()

    val json = JSONObject(jsonFile.readText())
    val components = json.getJSONArray("components")

    buildSet {
        for (i in 0 until components.length()) {
            val component = components.getJSONObject(i)
            add(component.getString("key").replace("-", "").lowercase())
            add(component.getString("coreName").lowercase())
            add(component.getString("styleName").lowercase())
        }
    }
}

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
            LocalProvidedStyles provides ProvidedStyleKeys,
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
