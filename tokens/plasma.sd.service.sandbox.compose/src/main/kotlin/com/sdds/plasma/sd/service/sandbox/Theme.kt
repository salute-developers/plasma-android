package com.sdds.plasma.sd.service.sandbox

import android.app.Activity
import android.graphics.Color
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarGroup
import com.sdds.compose.uikit.BasicButton
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxGroup
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.IconButton
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
import com.sdds.compose.uikit.internal.focusselector.FocusSelectorMode
import com.sdds.compose.uikit.internal.focusselector.LocalFocusSelectorMode
import com.sdds.plasma.sd.service.styles.Default
import com.sdds.plasma.sd.service.styles.M
import com.sdds.plasma.sd.service.styles.Optional
import com.sdds.plasma.sd.service.styles.OuterLabel
import com.sdds.plasma.sd.service.styles.S
import com.sdds.plasma.sd.service.tokens.compose.PlasmaSdServiceTheme
import com.sdds.plasma.sd.service.tokens.compose.darkPlasmaSdServiceColors
import com.sdds.plasma.sd.service.tokens.compose.darkPlasmaSdServiceGradients
import com.sdds.plasma.sd.service.tokens.compose.lightPlasmaSdServiceColors
import com.sdds.plasma.sd.service.tokens.compose.lightPlasmaSdServiceGradients

private val DarkColors = darkPlasmaSdServiceColors()
private val LightColors = lightPlasmaSdServiceColors()
private val DarkGradients = darkPlasmaSdServiceGradients()
private val LightGradients = lightPlasmaSdServiceGradients()

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

    PlasmaSdServiceTheme(
        colors = colorScheme,
        gradients = if (darkTheme) DarkGradients else LightGradients,
        content = {
            CompositionLocalProvider(
                LocalFocusSelectorMode provides FocusSelectorMode.Border(
                    borderStroke = BorderStroke(1.dp, colorScheme.surfaceDefaultAccent),
                    strokePadding = 2.dp,
                ),
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
