package com.sdds.plasma.homeds

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
import com.sdds.compose.uikit.LocalBadgeStyle
import com.sdds.compose.uikit.LocalButtonGroupStyle
import com.sdds.compose.uikit.LocalButtonStyle
import com.sdds.compose.uikit.LocalCardStyle
import com.sdds.compose.uikit.LocalCellStyle
import com.sdds.compose.uikit.LocalCheckBoxGroupStyle
import com.sdds.compose.uikit.LocalCheckBoxStyle
import com.sdds.compose.uikit.LocalChipGroupStyle
import com.sdds.compose.uikit.LocalChipStyle
import com.sdds.compose.uikit.LocalCircularProgressBarStyle
import com.sdds.compose.uikit.LocalCollapsingNavigationBarStyle
import com.sdds.compose.uikit.LocalCounterStyle
import com.sdds.compose.uikit.LocalDividerStyle
import com.sdds.compose.uikit.LocalIconBadgeStyle
import com.sdds.compose.uikit.LocalImageStyle
import com.sdds.compose.uikit.LocalIndicatorStyle
import com.sdds.compose.uikit.LocalListStyle
import com.sdds.compose.uikit.LocalLoaderStyle
import com.sdds.compose.uikit.LocalModalBottomSheetStyle
import com.sdds.compose.uikit.LocalNavigationBarStyle
import com.sdds.compose.uikit.LocalNoteCompactStyle
import com.sdds.compose.uikit.LocalNoteStyle
import com.sdds.compose.uikit.LocalOverlayStyle
import com.sdds.compose.uikit.LocalRadioBoxGroupStyle
import com.sdds.compose.uikit.LocalRadioBoxStyle
import com.sdds.compose.uikit.LocalRectSkeletonStyle
import com.sdds.compose.uikit.LocalSpinnerStyle
import com.sdds.compose.uikit.LocalSwitchStyle
import com.sdds.compose.uikit.LocalTabBarStyle
import com.sdds.compose.uikit.LocalTextFieldStyle
import com.sdds.compose.uikit.LocalTextSkeletonStyle
import com.sdds.compose.uikit.LocalToastStyle
import com.sdds.compose.uikit.LocalTooltipStyle
import com.sdds.compose.uikit.LocalWheelStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.avatar.Avatar
import com.sdds.plasma.homeds.styles.avatar.M
import com.sdds.plasma.homeds.styles.avatargroup.AvatarGroup
import com.sdds.plasma.homeds.styles.avatargroup.S
import com.sdds.plasma.homeds.styles.badge.BadgeSolid
import com.sdds.plasma.homeds.styles.badge.Default
import com.sdds.plasma.homeds.styles.badge.M
import com.sdds.plasma.homeds.styles.basicbutton.BasicButton
import com.sdds.plasma.homeds.styles.basicbutton.Default
import com.sdds.plasma.homeds.styles.basicbutton.M
import com.sdds.plasma.homeds.styles.bottomsheet.Default
import com.sdds.plasma.homeds.styles.bottomsheet.ModalBottomSheet
import com.sdds.plasma.homeds.styles.buttongroup.BasicButtonGroup
import com.sdds.plasma.homeds.styles.buttongroup.Default
import com.sdds.plasma.homeds.styles.buttongroup.Dense
import com.sdds.plasma.homeds.styles.buttongroup.M
import com.sdds.plasma.homeds.styles.card.Card
import com.sdds.plasma.homeds.styles.card.M
import com.sdds.plasma.homeds.styles.cell.Cell
import com.sdds.plasma.homeds.styles.cell.M
import com.sdds.plasma.homeds.styles.checkbox.CheckBox
import com.sdds.plasma.homeds.styles.checkbox.Default
import com.sdds.plasma.homeds.styles.checkbox.M
import com.sdds.plasma.homeds.styles.checkboxgroup.CheckBoxGroup
import com.sdds.plasma.homeds.styles.checkboxgroup.M
import com.sdds.plasma.homeds.styles.chip.Chip
import com.sdds.plasma.homeds.styles.chip.Default
import com.sdds.plasma.homeds.styles.chip.M
import com.sdds.plasma.homeds.styles.chipgroup.ChipGroupDense
import com.sdds.plasma.homeds.styles.chipgroup.Default
import com.sdds.plasma.homeds.styles.chipgroup.M
import com.sdds.plasma.homeds.styles.circularprogressbar.CircularProgressBar
import com.sdds.plasma.homeds.styles.circularprogressbar.Default
import com.sdds.plasma.homeds.styles.circularprogressbar.M
import com.sdds.plasma.homeds.styles.collapsingnavigationbar.CollapsingNavigationBarMainPage
import com.sdds.plasma.homeds.styles.collapsingnavigationbar.Default
import com.sdds.plasma.homeds.styles.counter.Counter
import com.sdds.plasma.homeds.styles.counter.Default
import com.sdds.plasma.homeds.styles.counter.M
import com.sdds.plasma.homeds.styles.divider.Default
import com.sdds.plasma.homeds.styles.divider.Divider
import com.sdds.plasma.homeds.styles.iconbadge.Default
import com.sdds.plasma.homeds.styles.iconbadge.IconBadgeSolid
import com.sdds.plasma.homeds.styles.iconbadge.M
import com.sdds.plasma.homeds.styles.image.Image
import com.sdds.plasma.homeds.styles.image.Ratio3x4
import com.sdds.plasma.homeds.styles.indicator.Default
import com.sdds.plasma.homeds.styles.indicator.Indicator
import com.sdds.plasma.homeds.styles.indicator.M
import com.sdds.plasma.homeds.styles.list.List
import com.sdds.plasma.homeds.styles.list.S
import com.sdds.plasma.homeds.styles.loader.Default
import com.sdds.plasma.homeds.styles.loader.Loader
import com.sdds.plasma.homeds.styles.navigationbar.Default
import com.sdds.plasma.homeds.styles.navigationbar.NavigationBarMainPage
import com.sdds.plasma.homeds.styles.note.ContentBeforeScalable
import com.sdds.plasma.homeds.styles.note.Default
import com.sdds.plasma.homeds.styles.note.Note
import com.sdds.plasma.homeds.styles.notecompact.ContentBeforeScalable
import com.sdds.plasma.homeds.styles.notecompact.Default
import com.sdds.plasma.homeds.styles.notecompact.NoteCompact
import com.sdds.plasma.homeds.styles.overlay.Default
import com.sdds.plasma.homeds.styles.overlay.Overlay
import com.sdds.plasma.homeds.styles.radiobox.M
import com.sdds.plasma.homeds.styles.radiobox.RadioBox
import com.sdds.plasma.homeds.styles.radioboxgroup.M
import com.sdds.plasma.homeds.styles.radioboxgroup.RadioBoxGroup
import com.sdds.plasma.homeds.styles.rectskeleton.Default
import com.sdds.plasma.homeds.styles.rectskeleton.RectSkeleton
import com.sdds.plasma.homeds.styles.spinner.Default
import com.sdds.plasma.homeds.styles.spinner.M
import com.sdds.plasma.homeds.styles.spinner.Spinner
import com.sdds.plasma.homeds.styles.switcher.M
import com.sdds.plasma.homeds.styles.switcher.Switch
import com.sdds.plasma.homeds.styles.tabbar.Default
import com.sdds.plasma.homeds.styles.tabbar.TabBar
import com.sdds.plasma.homeds.styles.textfield.Default
import com.sdds.plasma.homeds.styles.textfield.M
import com.sdds.plasma.homeds.styles.textfield.TextField
import com.sdds.plasma.homeds.styles.textskeleton.M
import com.sdds.plasma.homeds.styles.textskeleton.TextSkeletonText
import com.sdds.plasma.homeds.styles.toast.Default
import com.sdds.plasma.homeds.styles.toast.Toast
import com.sdds.plasma.homeds.styles.tooltip.M
import com.sdds.plasma.homeds.styles.tooltip.Tooltip
import com.sdds.plasma.homeds.styles.wheel.CenterAlign
import com.sdds.plasma.homeds.styles.wheel.H1
import com.sdds.plasma.homeds.styles.wheel.Wheel
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import com.sdds.plasma.homeds.theme.darkPlasmaHomeDsColors
import com.sdds.plasma.homeds.theme.darkPlasmaHomeDsGradients
import com.sdds.plasma.homeds.theme.lightPlasmaHomeDsColors
import com.sdds.plasma.homeds.theme.lightPlasmaHomeDsGradients

private val DarkColors = darkPlasmaHomeDsColors()
private val LightColors = lightPlasmaHomeDsColors()
private val DarkGradients = darkPlasmaHomeDsGradients()
private val LightGradients = lightPlasmaHomeDsGradients()

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

    PlasmaHomeDsTheme(
        colors = colorScheme,
        gradients = if (darkTheme) DarkGradients else LightGradients,
    ) {
        CompositionLocalProvider(
            LocalAvatarGroupStyle provides AvatarGroup.S.style(),
            LocalAvatarStyle provides Avatar.M.style(),
            LocalBadgeStyle provides BadgeSolid.M.Default.style(),
            LocalIconBadgeStyle provides IconBadgeSolid.M.Default.style(),
            LocalButtonGroupStyle provides BasicButtonGroup.M.Dense.Default.style(),
            LocalButtonStyle provides BasicButton.M.Default.style(),
            LocalCardStyle provides Card.M.style(),
            LocalCellStyle provides Cell.M.style(),
            LocalCheckBoxGroupStyle provides CheckBoxGroup.M.style(),
            LocalCheckBoxStyle provides CheckBox.M.Default.style(),
            LocalChipGroupStyle provides ChipGroupDense.M.Default.style(),
            LocalChipStyle provides Chip.M.Default.style(),
            LocalCircularProgressBarStyle provides CircularProgressBar.M.Default.style(),
            LocalCollapsingNavigationBarStyle provides CollapsingNavigationBarMainPage.Default.style(),
            LocalCounterStyle provides Counter.M.Default.style(),
            LocalDividerStyle provides Divider.Default.style(),
            LocalImageStyle provides Image.Ratio3x4.style(),
            LocalIndicatorStyle provides Indicator.M.Default.style(),
            LocalListStyle provides List.S.style(),
            LocalLoaderStyle provides Loader.Default.style(),
            LocalModalBottomSheetStyle provides ModalBottomSheet.Default.style(),
            LocalNavigationBarStyle provides NavigationBarMainPage.Default.style(),
            LocalNoteStyle provides Note.ContentBeforeScalable.Default.style(),
            LocalNoteCompactStyle provides NoteCompact.ContentBeforeScalable.Default.style(),
            LocalOverlayStyle provides Overlay.Default.style(),
            LocalRadioBoxGroupStyle provides RadioBoxGroup.M.style(),
            LocalRadioBoxStyle provides RadioBox.M.style(),
            LocalRectSkeletonStyle provides RectSkeleton.Default.style(),
            LocalSpinnerStyle provides Spinner.M.Default.style(),
            LocalSwitchStyle provides Switch.M.style(),
            LocalTabBarStyle provides TabBar.Default.style(),
            LocalTextFieldStyle provides TextField.M.Default.style(),
            LocalTextSkeletonStyle provides TextSkeletonText.M.style(),
            LocalToastStyle provides Toast.Default.style(),
            LocalTooltipStyle provides Tooltip.M.style(),
            LocalWheelStyle provides Wheel.H1.CenterAlign.style(),
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
