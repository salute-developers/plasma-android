package com.sdds.plasma.b2c.sandbox

import android.app.Activity
import android.graphics.Color
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarGroup
import com.sdds.compose.uikit.BasicButton
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxGroup
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.LocalAvatarGroupStyle
import com.sdds.compose.uikit.LocalAvatarStyle
import com.sdds.compose.uikit.LocalButtonStyle
import com.sdds.compose.uikit.LocalCheckBoxGroupStyle
import com.sdds.compose.uikit.LocalCheckBoxStyle
import com.sdds.compose.uikit.LocalIconButtonStyle
import com.sdds.compose.uikit.LocalProgressBarStyle
import com.sdds.compose.uikit.LocalRadioBoxGroupStyle
import com.sdds.compose.uikit.LocalRadioBoxStyle
import com.sdds.compose.uikit.LocalSwitchStyle
import com.sdds.compose.uikit.ProgressBar
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.RadioBoxGroup
import com.sdds.compose.uikit.Switch
import com.sdds.plasma.b2c.tokens.compose.PlasmaB2cTheme
import com.sdds.plasma.b2c.tokens.compose.darkPlasmaB2cColors
import com.sdds.plasma.b2c.tokens.compose.darkPlasmaB2cGradients
import com.sdds.plasma.b2c.tokens.compose.lightPlasmaB2cColors
import com.sdds.plasma.b2c.tokens.compose.lightPlasmaB2cGradients

private val DarkColors = darkPlasmaB2cColors()
private val LightColors = lightPlasmaB2cColors()
private val DarkGradients = darkPlasmaB2cGradients()
private val LightGradients = lightPlasmaB2cGradients()

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

    PlasmaB2cTheme(
        colors = colorScheme,
        gradients = if (darkTheme) DarkGradients else LightGradients,
        content = {
            CompositionLocalProvider(
                LocalSwitchStyle provides Switch.M.style(),
                LocalButtonStyle provides BasicButton.M.Default.style(),
                LocalIconButtonStyle provides IconButton.M.Default.style(),
                LocalCheckBoxStyle provides CheckBox.M.style(),
                LocalCheckBoxGroupStyle provides CheckBoxGroup.M.style(),
                LocalRadioBoxStyle provides RadioBox.M.style(),
                LocalRadioBoxGroupStyle provides RadioBoxGroup.M.style(),
                LocalProgressBarStyle provides ProgressBar.Default.style(),
                LocalAvatarStyle provides Avatar.M.style(),
                LocalAvatarGroupStyle provides AvatarGroup.S.style(),
                content = content,
            )
        },
    )
}