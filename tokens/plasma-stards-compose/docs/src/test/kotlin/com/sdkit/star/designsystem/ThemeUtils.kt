package com.sdkit.star.designsystem

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
import com.sdds.compose.uikit.LocalCellStyle
import com.sdds.compose.uikit.LocalCheckBoxGroupStyle
import com.sdds.compose.uikit.LocalCheckBoxStyle
import com.sdds.compose.uikit.LocalChipGroupStyle
import com.sdds.compose.uikit.LocalChipStyle
import com.sdds.compose.uikit.LocalCircularProgressBarStyle
import com.sdds.compose.uikit.LocalCodeInputStyle
import com.sdds.compose.uikit.LocalCounterStyle
import com.sdds.compose.uikit.LocalDividerStyle
import com.sdds.compose.uikit.LocalDrawerStyle
import com.sdds.compose.uikit.LocalDropdownMenuStyle
import com.sdds.compose.uikit.LocalIconBadgeStyle
import com.sdds.compose.uikit.LocalImageStyle
import com.sdds.compose.uikit.LocalIndicatorStyle
import com.sdds.compose.uikit.LocalListStyle
import com.sdds.compose.uikit.LocalLoaderStyle
import com.sdds.compose.uikit.LocalModalStyle
import com.sdds.compose.uikit.LocalNotificationContentStyle
import com.sdds.compose.uikit.LocalNotificationStyle
import com.sdds.compose.uikit.LocalOverlayStyle
import com.sdds.compose.uikit.LocalPaginationDotsStyle
import com.sdds.compose.uikit.LocalPopoverStyle
import com.sdds.compose.uikit.LocalProgressBarStyle
import com.sdds.compose.uikit.LocalRadioBoxGroupStyle
import com.sdds.compose.uikit.LocalRadioBoxStyle
import com.sdds.compose.uikit.LocalRectSkeletonStyle
import com.sdds.compose.uikit.LocalScrollBarStyle
import com.sdds.compose.uikit.LocalSegmentItemStyle
import com.sdds.compose.uikit.LocalSegmentStyle
import com.sdds.compose.uikit.LocalSpinnerStyle
import com.sdds.compose.uikit.LocalSwitchStyle
import com.sdds.compose.uikit.LocalTextFieldStyle
import com.sdds.compose.uikit.LocalTextSkeletonStyle
import com.sdds.compose.uikit.LocalTooltipStyle
import com.sdds.compose.uikit.LocalWheelStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.avatar.Avatar
import com.sdkit.star.designsystem.styles.avatar.M
import com.sdkit.star.designsystem.styles.avatargroup.AvatarGroup
import com.sdkit.star.designsystem.styles.avatargroup.S
import com.sdkit.star.designsystem.styles.badge.BadgeSolid
import com.sdkit.star.designsystem.styles.badge.Default
import com.sdkit.star.designsystem.styles.badge.M
import com.sdkit.star.designsystem.styles.basicbutton.BasicButton
import com.sdkit.star.designsystem.styles.basicbutton.Default
import com.sdkit.star.designsystem.styles.basicbutton.M
import com.sdkit.star.designsystem.styles.buttongroup.BasicButtonGroup
import com.sdkit.star.designsystem.styles.buttongroup.Default
import com.sdkit.star.designsystem.styles.buttongroup.Dense
import com.sdkit.star.designsystem.styles.buttongroup.M
import com.sdkit.star.designsystem.styles.cell.Cell
import com.sdkit.star.designsystem.styles.cell.M
import com.sdkit.star.designsystem.styles.checkbox.CheckBox
import com.sdkit.star.designsystem.styles.checkbox.Default
import com.sdkit.star.designsystem.styles.checkbox.M
import com.sdkit.star.designsystem.styles.checkboxgroup.CheckBoxGroup
import com.sdkit.star.designsystem.styles.checkboxgroup.M
import com.sdkit.star.designsystem.styles.chip.Chip
import com.sdkit.star.designsystem.styles.chip.Default
import com.sdkit.star.designsystem.styles.chip.M
import com.sdkit.star.designsystem.styles.chipgroup.ChipGroupDense
import com.sdkit.star.designsystem.styles.chipgroup.Default
import com.sdkit.star.designsystem.styles.chipgroup.M
import com.sdkit.star.designsystem.styles.circularprogressbar.CircularProgressBar
import com.sdkit.star.designsystem.styles.circularprogressbar.Default
import com.sdkit.star.designsystem.styles.circularprogressbar.M
import com.sdkit.star.designsystem.styles.codeinput.CodeInput
import com.sdkit.star.designsystem.styles.codeinput.M
import com.sdkit.star.designsystem.styles.counter.Counter
import com.sdkit.star.designsystem.styles.counter.Default
import com.sdkit.star.designsystem.styles.counter.M
import com.sdkit.star.designsystem.styles.divider.Default
import com.sdkit.star.designsystem.styles.divider.Divider
import com.sdkit.star.designsystem.styles.drawer.Drawer
import com.sdkit.star.designsystem.styles.drawer.HasBackground
import com.sdkit.star.designsystem.styles.dropdownmenu.DropdownMenu
import com.sdkit.star.designsystem.styles.dropdownmenu.M
import com.sdkit.star.designsystem.styles.iconbadge.Default
import com.sdkit.star.designsystem.styles.iconbadge.IconBadgeSolid
import com.sdkit.star.designsystem.styles.iconbadge.M
import com.sdkit.star.designsystem.styles.image.Image
import com.sdkit.star.designsystem.styles.image.Ratio3x4
import com.sdkit.star.designsystem.styles.indicator.Default
import com.sdkit.star.designsystem.styles.indicator.Indicator
import com.sdkit.star.designsystem.styles.indicator.M
import com.sdkit.star.designsystem.styles.list.List
import com.sdkit.star.designsystem.styles.list.M
import com.sdkit.star.designsystem.styles.loader.Default
import com.sdkit.star.designsystem.styles.loader.Loader
import com.sdkit.star.designsystem.styles.modal.Default
import com.sdkit.star.designsystem.styles.modal.Modal
import com.sdkit.star.designsystem.styles.notification.M
import com.sdkit.star.designsystem.styles.notification.NotificationLoose
import com.sdkit.star.designsystem.styles.notificationcontent.ButtonStretch
import com.sdkit.star.designsystem.styles.notificationcontent.Default
import com.sdkit.star.designsystem.styles.notificationcontent.NotificationContent
import com.sdkit.star.designsystem.styles.overlay.Default
import com.sdkit.star.designsystem.styles.overlay.Overlay
import com.sdkit.star.designsystem.styles.paginationdots.M
import com.sdkit.star.designsystem.styles.paginationdots.PaginationDotsHorizontal
import com.sdkit.star.designsystem.styles.popover.Default
import com.sdkit.star.designsystem.styles.popover.M
import com.sdkit.star.designsystem.styles.popover.Popover
import com.sdkit.star.designsystem.styles.progressbar.Default
import com.sdkit.star.designsystem.styles.progressbar.ProgressBar
import com.sdkit.star.designsystem.styles.radiobox.M
import com.sdkit.star.designsystem.styles.radiobox.RadioBox
import com.sdkit.star.designsystem.styles.radioboxgroup.M
import com.sdkit.star.designsystem.styles.radioboxgroup.RadioBoxGroup
import com.sdkit.star.designsystem.styles.rectskeleton.Default
import com.sdkit.star.designsystem.styles.rectskeleton.RectSkeleton
import com.sdkit.star.designsystem.styles.scrollbar.M
import com.sdkit.star.designsystem.styles.scrollbar.ScrollBar
import com.sdkit.star.designsystem.styles.segment.M
import com.sdkit.star.designsystem.styles.segment.Primary
import com.sdkit.star.designsystem.styles.segment.Segment
import com.sdkit.star.designsystem.styles.segmentitem.M
import com.sdkit.star.designsystem.styles.segmentitem.Primary
import com.sdkit.star.designsystem.styles.segmentitem.SegmentItem
import com.sdkit.star.designsystem.styles.spinner.Default
import com.sdkit.star.designsystem.styles.spinner.M
import com.sdkit.star.designsystem.styles.spinner.Spinner
import com.sdkit.star.designsystem.styles.switcher.M
import com.sdkit.star.designsystem.styles.switcher.Switch
import com.sdkit.star.designsystem.styles.textfield.Default
import com.sdkit.star.designsystem.styles.textfield.M
import com.sdkit.star.designsystem.styles.textfield.TextField
import com.sdkit.star.designsystem.styles.textskeleton.M
import com.sdkit.star.designsystem.styles.textskeleton.TextSkeletonText
import com.sdkit.star.designsystem.styles.tooltip.M
import com.sdkit.star.designsystem.styles.tooltip.Tooltip
import com.sdkit.star.designsystem.styles.wheel.CenterAlign
import com.sdkit.star.designsystem.styles.wheel.H1
import com.sdkit.star.designsystem.styles.wheel.Wheel
import com.sdkit.star.designsystem.theme.StarDsTheme
import com.sdkit.star.designsystem.theme.darkStarDsColors
import com.sdkit.star.designsystem.theme.darkStarDsGradients
import com.sdkit.star.designsystem.theme.lightStarDsColors
import com.sdkit.star.designsystem.theme.lightStarDsGradients

private val DarkColors = darkStarDsColors()
private val LightColors = lightStarDsColors()
private val DarkGradients = darkStarDsGradients()
private val LightGradients = lightStarDsGradients()

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

    StarDsTheme(
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
            LocalCellStyle provides Cell.M.style(),
            LocalCheckBoxGroupStyle provides CheckBoxGroup.M.style(),
            LocalCheckBoxStyle provides CheckBox.M.Default.style(),
            LocalChipGroupStyle provides ChipGroupDense.M.Default.style(),
            LocalChipStyle provides Chip.M.Default.style(),
            LocalCircularProgressBarStyle provides CircularProgressBar.M.Default.style(),
            LocalCodeInputStyle provides CodeInput.M.style(),
            LocalCounterStyle provides Counter.M.Default.style(),
            LocalDividerStyle provides Divider.Default.style(),
            LocalDrawerStyle provides Drawer.HasBackground.style(),
            LocalDropdownMenuStyle provides DropdownMenu.M.style(),
            LocalImageStyle provides Image.Ratio3x4.style(),
            LocalIndicatorStyle provides Indicator.M.Default.style(),
            LocalListStyle provides List.M.style(),
            LocalLoaderStyle provides Loader.Default.style(),
            LocalModalStyle provides Modal.Default.style(),
            LocalNotificationContentStyle provides NotificationContent.ButtonStretch.Default.style(),
            LocalNotificationStyle provides NotificationLoose.M.style(),
            LocalOverlayStyle provides Overlay.Default.style(),
            LocalPaginationDotsStyle provides PaginationDotsHorizontal.M.style(),
            LocalPopoverStyle provides Popover.M.Default.style(),
            LocalProgressBarStyle provides ProgressBar.Default.style(),
            LocalRadioBoxGroupStyle provides RadioBoxGroup.M.style(),
            LocalRadioBoxStyle provides RadioBox.M.style(),
            LocalRectSkeletonStyle provides RectSkeleton.Default.style(),
            LocalScrollBarStyle provides ScrollBar.M.style(),
            LocalSegmentItemStyle provides SegmentItem.M.Primary.style(),
            LocalSegmentStyle provides Segment.M.Primary.style(),
            LocalSpinnerStyle provides Spinner.M.Default.style(),
            LocalSwitchStyle provides Switch.M.style(),
            LocalTextFieldStyle provides TextField.M.Default.style(),
            LocalTextSkeletonStyle provides TextSkeletonText.M.style(),
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
