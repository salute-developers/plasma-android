package com.sdds.plasma.giga

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
import com.sdds.compose.uikit.LocalAccordionStyle
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
import com.sdds.compose.uikit.LocalCodeFieldStyle
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
import com.sdds.compose.uikit.LocalModalBottomSheetStyle
import com.sdds.compose.uikit.LocalModalStyle
import com.sdds.compose.uikit.LocalNotificationContentStyle
import com.sdds.compose.uikit.LocalNotificationStyle
import com.sdds.compose.uikit.LocalOverlayStyle
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
import com.sdds.compose.uikit.LocalTabBarStyle
import com.sdds.compose.uikit.LocalTextFieldStyle
import com.sdds.compose.uikit.LocalTextSkeletonStyle
import com.sdds.compose.uikit.LocalToastStyle
import com.sdds.compose.uikit.LocalTooltipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.accordion.AccordionSolidActionStart
import com.sdds.plasma.giga.styles.accordion.H3
import com.sdds.plasma.giga.styles.avatar.Avatar
import com.sdds.plasma.giga.styles.avatar.M
import com.sdds.plasma.giga.styles.avatargroup.AvatarGroup
import com.sdds.plasma.giga.styles.avatargroup.S
import com.sdds.plasma.giga.styles.badge.BadgeSolid
import com.sdds.plasma.giga.styles.badge.Default
import com.sdds.plasma.giga.styles.badge.M
import com.sdds.plasma.giga.styles.basicbutton.BasicButton
import com.sdds.plasma.giga.styles.basicbutton.Default
import com.sdds.plasma.giga.styles.basicbutton.M
import com.sdds.plasma.giga.styles.bottomsheet.Default
import com.sdds.plasma.giga.styles.bottomsheet.ModalBottomSheet
import com.sdds.plasma.giga.styles.buttongroup.BasicButtonGroup
import com.sdds.plasma.giga.styles.buttongroup.Default
import com.sdds.plasma.giga.styles.buttongroup.Dense
import com.sdds.plasma.giga.styles.buttongroup.M
import com.sdds.plasma.giga.styles.card.CardSolid
import com.sdds.plasma.giga.styles.card.M
import com.sdds.plasma.giga.styles.cell.Cell
import com.sdds.plasma.giga.styles.cell.M
import com.sdds.plasma.giga.styles.checkbox.CheckBox
import com.sdds.plasma.giga.styles.checkbox.Default
import com.sdds.plasma.giga.styles.checkbox.M
import com.sdds.plasma.giga.styles.checkboxgroup.CheckBoxGroup
import com.sdds.plasma.giga.styles.checkboxgroup.M
import com.sdds.plasma.giga.styles.chip.Chip
import com.sdds.plasma.giga.styles.chip.Default
import com.sdds.plasma.giga.styles.chip.M
import com.sdds.plasma.giga.styles.chipgroup.ChipGroupDense
import com.sdds.plasma.giga.styles.chipgroup.Default
import com.sdds.plasma.giga.styles.chipgroup.M
import com.sdds.plasma.giga.styles.circularprogressbar.CircularProgressBar
import com.sdds.plasma.giga.styles.circularprogressbar.Default
import com.sdds.plasma.giga.styles.circularprogressbar.M
import com.sdds.plasma.giga.styles.codefield.CodeField
import com.sdds.plasma.giga.styles.codefield.M
import com.sdds.plasma.giga.styles.codeinput.CodeInput
import com.sdds.plasma.giga.styles.codeinput.M
import com.sdds.plasma.giga.styles.counter.Counter
import com.sdds.plasma.giga.styles.counter.Default
import com.sdds.plasma.giga.styles.counter.M
import com.sdds.plasma.giga.styles.divider.Default
import com.sdds.plasma.giga.styles.divider.Divider
import com.sdds.plasma.giga.styles.drawer.DrawerCloseOuter
import com.sdds.plasma.giga.styles.drawer.M
import com.sdds.plasma.giga.styles.dropdownmenu.DropdownMenuNormal
import com.sdds.plasma.giga.styles.dropdownmenu.M
import com.sdds.plasma.giga.styles.iconbadge.Default
import com.sdds.plasma.giga.styles.iconbadge.IconBadgeSolid
import com.sdds.plasma.giga.styles.iconbadge.M
import com.sdds.plasma.giga.styles.image.Image
import com.sdds.plasma.giga.styles.image.Ratio3x4
import com.sdds.plasma.giga.styles.indicator.Default
import com.sdds.plasma.giga.styles.indicator.Indicator
import com.sdds.plasma.giga.styles.indicator.M
import com.sdds.plasma.giga.styles.list.ListNormal
import com.sdds.plasma.giga.styles.list.M
import com.sdds.plasma.giga.styles.loader.Default
import com.sdds.plasma.giga.styles.loader.Loader
import com.sdds.plasma.giga.styles.modal.Default
import com.sdds.plasma.giga.styles.modal.Modal
import com.sdds.plasma.giga.styles.notification.M
import com.sdds.plasma.giga.styles.notification.NotificationLoose
import com.sdds.plasma.giga.styles.notificationcontent.ButtonStretch
import com.sdds.plasma.giga.styles.notificationcontent.Default
import com.sdds.plasma.giga.styles.notificationcontent.NotificationContent
import com.sdds.plasma.giga.styles.overlay.Default
import com.sdds.plasma.giga.styles.overlay.Overlay
import com.sdds.plasma.giga.styles.popover.Default
import com.sdds.plasma.giga.styles.popover.M
import com.sdds.plasma.giga.styles.popover.Popover
import com.sdds.plasma.giga.styles.progressbar.Default
import com.sdds.plasma.giga.styles.progressbar.ProgressBar
import com.sdds.plasma.giga.styles.radiobox.M
import com.sdds.plasma.giga.styles.radiobox.RadioBox
import com.sdds.plasma.giga.styles.radioboxgroup.M
import com.sdds.plasma.giga.styles.radioboxgroup.RadioBoxGroup
import com.sdds.plasma.giga.styles.rectskeleton.Default
import com.sdds.plasma.giga.styles.rectskeleton.RectSkeleton
import com.sdds.plasma.giga.styles.scrollbar.M
import com.sdds.plasma.giga.styles.scrollbar.ScrollBar
import com.sdds.plasma.giga.styles.segment.M
import com.sdds.plasma.giga.styles.segment.Primary
import com.sdds.plasma.giga.styles.segment.Segment
import com.sdds.plasma.giga.styles.segmentitem.M
import com.sdds.plasma.giga.styles.segmentitem.Primary
import com.sdds.plasma.giga.styles.segmentitem.SegmentItem
import com.sdds.plasma.giga.styles.spinner.Default
import com.sdds.plasma.giga.styles.spinner.M
import com.sdds.plasma.giga.styles.spinner.Spinner
import com.sdds.plasma.giga.styles.switcher.M
import com.sdds.plasma.giga.styles.switcher.Switch
import com.sdds.plasma.giga.styles.tabbar.Default
import com.sdds.plasma.giga.styles.tabbar.M
import com.sdds.plasma.giga.styles.tabbar.TabBarSolid
import com.sdds.plasma.giga.styles.textfield.Default
import com.sdds.plasma.giga.styles.textfield.M
import com.sdds.plasma.giga.styles.textfield.TextField
import com.sdds.plasma.giga.styles.textskeleton.Default
import com.sdds.plasma.giga.styles.textskeleton.TextSkeleton
import com.sdds.plasma.giga.styles.toast.Default
import com.sdds.plasma.giga.styles.toast.Rounded
import com.sdds.plasma.giga.styles.toast.Toast
import com.sdds.plasma.giga.styles.tooltip.M
import com.sdds.plasma.giga.styles.tooltip.Tooltip
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
import com.sdds.plasma.giga.theme.darkPlasmaGigaColors
import com.sdds.plasma.giga.theme.darkPlasmaGigaGradients
import com.sdds.plasma.giga.theme.lightPlasmaGigaColors
import com.sdds.plasma.giga.theme.lightPlasmaGigaGradients

private val DarkColors = darkPlasmaGigaColors()
private val LightColors = lightPlasmaGigaColors()
private val DarkGradients = darkPlasmaGigaGradients()
private val LightGradients = lightPlasmaGigaGradients()

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

    PlasmaGigaTheme(
        colors = colorScheme,
        gradients = if (darkTheme) DarkGradients else LightGradients,
    ) {
        CompositionLocalProvider(
            LocalAccordionStyle provides AccordionSolidActionStart.H3.style(),
            LocalAvatarGroupStyle provides AvatarGroup.S.style(),
            LocalAvatarStyle provides Avatar.M.style(),
            LocalBadgeStyle provides BadgeSolid.M.Default.style(),
            LocalIconBadgeStyle provides IconBadgeSolid.M.Default.style(),
            LocalButtonGroupStyle provides BasicButtonGroup.M.Dense.Default.style(),
            LocalButtonStyle provides BasicButton.M.Default.style(),
            LocalCardStyle provides CardSolid.M.style(),
            LocalCellStyle provides Cell.M.style(),
            LocalCheckBoxGroupStyle provides CheckBoxGroup.M.style(),
            LocalCheckBoxStyle provides CheckBox.M.Default.style(),
            LocalChipGroupStyle provides ChipGroupDense.M.Default.style(),
            LocalChipStyle provides Chip.M.Default.style(),
            LocalCircularProgressBarStyle provides CircularProgressBar.M.Default.style(),
            LocalCodeFieldStyle provides CodeField.M.style(),
            LocalCodeInputStyle provides CodeInput.M.style(),
            LocalCounterStyle provides Counter.M.Default.style(),
            LocalDividerStyle provides Divider.Default.style(),
            LocalDrawerStyle provides DrawerCloseOuter.M.style(),
            LocalDropdownMenuStyle provides DropdownMenuNormal.M.style(),
            LocalImageStyle provides Image.Ratio3x4.style(),
            LocalIndicatorStyle provides Indicator.M.Default.style(),
            LocalListStyle provides ListNormal.M.style(),
            LocalLoaderStyle provides Loader.Default.style(),
            LocalModalBottomSheetStyle provides ModalBottomSheet.Default.style(),
            LocalModalStyle provides Modal.Default.style(),
            LocalNotificationContentStyle provides NotificationContent.ButtonStretch.Default.style(),
            LocalNotificationStyle provides NotificationLoose.M.style(),
            LocalOverlayStyle provides Overlay.Default.style(),
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
            LocalTabBarStyle provides TabBarSolid.M.Default.style(),
            LocalTextFieldStyle provides TextField.M.Default.style(),
            LocalTextSkeletonStyle provides TextSkeleton.Default.style(),
            LocalToastStyle provides Toast.Rounded.Default.style(),
            LocalTooltipStyle provides Tooltip.M.style(),
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
