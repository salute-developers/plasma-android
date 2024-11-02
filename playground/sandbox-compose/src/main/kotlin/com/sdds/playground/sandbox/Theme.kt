package com.sdds.playground.sandbox

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
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.LocalAvatarGroupStyle
import com.sdds.compose.uikit.LocalAvatarStyle
import com.sdds.compose.uikit.LocalButtonStyle
import com.sdds.compose.uikit.LocalCheckBoxGroupStyle
import com.sdds.compose.uikit.LocalCheckBoxStyle
import com.sdds.compose.uikit.LocalChipStyle
import com.sdds.compose.uikit.LocalIconButtonStyle
import com.sdds.compose.uikit.LocalProgressBarStyle
import com.sdds.compose.uikit.LocalRadioBoxGroupStyle
import com.sdds.compose.uikit.LocalRadioBoxStyle
import com.sdds.compose.uikit.LocalSwitchStyle
import com.sdds.compose.uikit.LocalTextFieldStyle
import com.sdds.compose.uikit.ProgressBar
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.RadioBoxGroup
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.TextField
import com.sdds.playground.sandbox.avatar.M
import com.sdds.playground.sandbox.avatar.S
import com.sdds.playground.sandbox.buttons.Default
import com.sdds.playground.sandbox.buttons.M
import com.sdds.playground.sandbox.checkbox.M
import com.sdds.playground.sandbox.checkbox.group.M
import com.sdds.playground.sandbox.chip.Default
import com.sdds.playground.sandbox.chip.M
import com.sdds.playground.sandbox.progress.Default
import com.sdds.playground.sandbox.radiobox.M
import com.sdds.playground.sandbox.radiobox.group.M
import com.sdds.playground.sandbox.switch.M
import com.sdds.playground.sandbox.textfield.Default
import com.sdds.playground.sandbox.textfield.M
import com.sdds.playground.sandbox.textfield.Optional
import com.sdds.playground.sandbox.textfield.OuterLabel
import com.sdds.playground.sandbox.tokens.compose.SddsServTheme
import com.sdds.playground.sandbox.tokens.compose.darkSddsServColors
import com.sdds.playground.sandbox.tokens.compose.darkSddsServGradients
import com.sdds.playground.sandbox.tokens.compose.lightSddsServColors
import com.sdds.playground.sandbox.tokens.compose.lightSddsServGradients

private val DarkColors = darkSddsServColors()
private val LightColors = lightSddsServColors()
private val DarkGradients = darkSddsServGradients()
private val LightGradients = lightSddsServGradients()

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

    SddsServTheme(
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
                LocalChipStyle provides Chip.M.Default.style(),
                LocalTextFieldStyle provides TextField.M.Default.OuterLabel.Optional.style(),
                content = content,
            )
        },
    )
}
