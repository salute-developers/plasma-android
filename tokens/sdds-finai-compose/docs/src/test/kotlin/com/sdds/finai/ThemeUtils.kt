package com.sdds.finai

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
import com.sdds.compose.uikit.LocalAvatarGroupStyle
import com.sdds.compose.uikit.LocalAvatarStyle
import com.sdds.compose.uikit.LocalButtonStyle
import com.sdds.compose.uikit.LocalCellStyle
import com.sdds.compose.uikit.LocalCheckBoxStyle
import com.sdds.compose.uikit.LocalChipStyle
import com.sdds.compose.uikit.LocalCounterStyle
import com.sdds.compose.uikit.LocalDividerStyle
import com.sdds.compose.uikit.LocalDropdownMenuStyle
import com.sdds.compose.uikit.LocalIconButtonStyle
import com.sdds.compose.uikit.LocalIndicatorStyle
import com.sdds.compose.uikit.LocalListStyle
import com.sdds.compose.uikit.LocalModalBottomSheetStyle
import com.sdds.compose.uikit.LocalModalStyle
import com.sdds.compose.uikit.LocalOverlayStyle
import com.sdds.compose.uikit.LocalRadioBoxStyle
import com.sdds.compose.uikit.LocalScrollBarStyle
import com.sdds.compose.uikit.LocalSwitchStyle
import com.sdds.compose.uikit.LocalTabsStyle
import com.sdds.compose.uikit.LocalTextFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.finai.styles.avatar.Avatar
import com.sdds.finai.styles.avatar.M
import com.sdds.finai.styles.avatargroup.AvatarGroup
import com.sdds.finai.styles.avatargroup.S
import com.sdds.finai.styles.basicbutton.BasicButton
import com.sdds.finai.styles.basicbutton.Default
import com.sdds.finai.styles.basicbutton.S
import com.sdds.finai.styles.bottomsheet.Default
import com.sdds.finai.styles.bottomsheet.ModalBottomSheet
import com.sdds.finai.styles.cell.Cell
import com.sdds.finai.styles.cell.M
import com.sdds.finai.styles.checkbox.CheckBox
import com.sdds.finai.styles.checkbox.Default
import com.sdds.finai.styles.checkbox.M
import com.sdds.finai.styles.chip.ChipSolid
import com.sdds.finai.styles.chip.Default
import com.sdds.finai.styles.chip.M
import com.sdds.finai.styles.counter.Counter
import com.sdds.finai.styles.counter.Default
import com.sdds.finai.styles.counter.M
import com.sdds.finai.styles.divider.Default
import com.sdds.finai.styles.divider.Divider
import com.sdds.finai.styles.dropdownmenu.DropdownMenuNormal
import com.sdds.finai.styles.dropdownmenu.M
import com.sdds.finai.styles.iconbutton.Clear
import com.sdds.finai.styles.iconbutton.IconButton
import com.sdds.finai.styles.iconbutton.S
import com.sdds.finai.styles.indicator.Default
import com.sdds.finai.styles.indicator.Indicator
import com.sdds.finai.styles.indicator.M
import com.sdds.finai.styles.list.ListNormal
import com.sdds.finai.styles.list.M
import com.sdds.finai.styles.modal.Default
import com.sdds.finai.styles.modal.Modal
import com.sdds.finai.styles.overlay.Default
import com.sdds.finai.styles.overlay.Overlay
import com.sdds.finai.styles.radiobox.M
import com.sdds.finai.styles.radiobox.RadioBox
import com.sdds.finai.styles.scrollbar.Default
import com.sdds.finai.styles.scrollbar.ScrollBar
import com.sdds.finai.styles.switcher.M
import com.sdds.finai.styles.switcher.Switch
import com.sdds.finai.styles.tabs.M
import com.sdds.finai.styles.tabs.TabsDefault
import com.sdds.finai.styles.textfield.Default
import com.sdds.finai.styles.textfield.OuterLabel
import com.sdds.finai.styles.textfield.S
import com.sdds.finai.styles.textfield.TextField
import com.sdds.finai.theme.SddsFinAiTheme
import com.sdds.finai.theme.darkSddsFinAiColors
import com.sdds.finai.theme.darkSddsFinAiGradients
import com.sdds.finai.theme.lightSddsFinAiColors
import com.sdds.finai.theme.lightSddsFinAiGradients

private val DarkColors = darkSddsFinAiColors()
private val LightColors = lightSddsFinAiColors()
private val DarkGradients = darkSddsFinAiGradients()
private val LightGradients = lightSddsFinAiGradients()

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
    SddsFinAiTheme(
        colors = colorScheme,
        gradients = if (darkTheme) DarkGradients else LightGradients,
    ) {
        CompositionLocalProvider(
            LocalAvatarStyle provides Avatar.M.style(),
            LocalAvatarGroupStyle provides AvatarGroup.S.style(),
            LocalButtonStyle provides BasicButton.S.Default.style(),
            LocalCellStyle provides Cell.M.style(),
            LocalCheckBoxStyle provides CheckBox.M.Default.style(),
            LocalChipStyle provides ChipSolid.M.Default.style(),
            LocalCounterStyle provides Counter.M.Default.style(),
            LocalDividerStyle provides Divider.Default.style(),
            LocalDropdownMenuStyle provides DropdownMenuNormal.M.style(),
            LocalIconButtonStyle provides IconButton.S.Clear.style(),
            LocalIndicatorStyle provides Indicator.M.Default.style(),
            LocalListStyle provides ListNormal.M.style(),
            LocalModalStyle provides Modal.Default.style(),
            LocalModalBottomSheetStyle provides ModalBottomSheet.Default.style(),
            LocalOverlayStyle provides Overlay.Default.style(),
            LocalRadioBoxStyle provides RadioBox.M.style(),
            LocalScrollBarStyle provides ScrollBar.Default.style(),
            LocalSwitchStyle provides Switch.M.style(),
            LocalTabsStyle provides TabsDefault.M.style(),
            LocalTextFieldStyle provides TextField.S.OuterLabel.Default.style(),
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
