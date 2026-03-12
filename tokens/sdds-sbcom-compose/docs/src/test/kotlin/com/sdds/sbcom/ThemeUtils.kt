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
import com.sdds.compose.uikit.LocalButtonGroupStyle
import com.sdds.compose.uikit.LocalButtonStyle
import com.sdds.compose.uikit.LocalCheckBoxStyle
import com.sdds.compose.uikit.LocalChipGroupStyle
import com.sdds.compose.uikit.LocalChipStyle
import com.sdds.compose.uikit.LocalCircularProgressBarStyle
import com.sdds.compose.uikit.LocalCollapsingNavigationBarStyle
import com.sdds.compose.uikit.LocalCounterStyle
import com.sdds.compose.uikit.LocalDividerStyle
import com.sdds.compose.uikit.LocalIndicatorStyle
import com.sdds.compose.uikit.LocalLoaderStyle
import com.sdds.compose.uikit.LocalModalBottomSheetStyle
import com.sdds.compose.uikit.LocalOverlayStyle
import com.sdds.compose.uikit.LocalRadioBoxStyle
import com.sdds.compose.uikit.LocalRectSkeletonStyle
import com.sdds.compose.uikit.LocalSpinnerStyle
import com.sdds.compose.uikit.LocalSwitchStyle
import com.sdds.compose.uikit.LocalTabBarStyle
import com.sdds.compose.uikit.LocalTextFieldStyle
import com.sdds.compose.uikit.LocalTooltipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.basicbutton.AccentFilled
import com.sdds.sbcom.styles.basicbutton.BasicButton
import com.sdds.sbcom.styles.basicbutton.M
import com.sdds.sbcom.styles.bottomsheet.Default
import com.sdds.sbcom.styles.bottomsheet.ModalBottomSheet
import com.sdds.sbcom.styles.buttongroup.BasicButtonGroup
import com.sdds.sbcom.styles.buttongroup.Default
import com.sdds.sbcom.styles.checkbox.CheckBox
import com.sdds.sbcom.styles.checkbox.Default
import com.sdds.sbcom.styles.chip.Chip
import com.sdds.sbcom.styles.chip.Default
import com.sdds.sbcom.styles.chipgroup.ChipGroup
import com.sdds.sbcom.styles.chipgroup.Default
import com.sdds.sbcom.styles.circularprogressbar.Accent
import com.sdds.sbcom.styles.circularprogressbar.CircularProgressBar
import com.sdds.sbcom.styles.circularprogressbar.M
import com.sdds.sbcom.styles.collapsingnavigationbar.CollapsingNavigationBarMainPage
import com.sdds.sbcom.styles.collapsingnavigationbar.Default
import com.sdds.sbcom.styles.counter.Accent
import com.sdds.sbcom.styles.counter.Counter
import com.sdds.sbcom.styles.divider.Default
import com.sdds.sbcom.styles.divider.Divider
import com.sdds.sbcom.styles.indicator.Indicator
import com.sdds.sbcom.styles.indicator.Success
import com.sdds.sbcom.styles.loader.Default
import com.sdds.sbcom.styles.loader.Loader
import com.sdds.sbcom.styles.overlay.Default
import com.sdds.sbcom.styles.overlay.Overlay
import com.sdds.sbcom.styles.radiobox.Default
import com.sdds.sbcom.styles.radiobox.RadioBox
import com.sdds.sbcom.styles.rectskeleton.Default
import com.sdds.sbcom.styles.rectskeleton.RectSkeleton
import com.sdds.sbcom.styles.spinner.Accent
import com.sdds.sbcom.styles.spinner.M
import com.sdds.sbcom.styles.spinner.Spinner
import com.sdds.sbcom.styles.switcher.Default
import com.sdds.sbcom.styles.switcher.Switch
import com.sdds.sbcom.styles.tabbar.Default
import com.sdds.sbcom.styles.tabbar.TabBar
import com.sdds.sbcom.styles.textfield.Default
import com.sdds.sbcom.styles.textfield.TextField
import com.sdds.sbcom.styles.tooltip.Default
import com.sdds.sbcom.styles.tooltip.Tooltip
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
            LocalButtonGroupStyle provides BasicButtonGroup.Default.style(),
            LocalButtonStyle provides BasicButton.M.AccentFilled.style(),
            LocalCheckBoxStyle provides CheckBox.Default.style(),
            LocalChipGroupStyle provides ChipGroup.Default.style(),
            LocalChipStyle provides Chip.Default.style(),
            LocalCircularProgressBarStyle provides CircularProgressBar.M.Accent.style(),
            LocalCollapsingNavigationBarStyle provides CollapsingNavigationBarMainPage.Default.style(),
            LocalCounterStyle provides Counter.Accent.style(),
            LocalDividerStyle provides Divider.Default.style(),
            LocalIndicatorStyle provides Indicator.Success.style(),
            LocalLoaderStyle provides Loader.Default.style(),
            LocalModalBottomSheetStyle provides ModalBottomSheet.Default.style(),
            LocalOverlayStyle provides Overlay.Default.style(),
            LocalRadioBoxStyle provides RadioBox.Default.style(),
            LocalRectSkeletonStyle provides RectSkeleton.Default.style(),
            LocalSpinnerStyle provides Spinner.M.Accent.style(),
            LocalSwitchStyle provides Switch.Default.style(),
            LocalTabBarStyle provides TabBar.Default.style(),
            LocalTextFieldStyle provides TextField.Default.style(),
            LocalTooltipStyle provides Tooltip.Default.style(),
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
