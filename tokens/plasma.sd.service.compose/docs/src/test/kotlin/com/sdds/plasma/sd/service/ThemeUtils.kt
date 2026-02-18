package com.sdds.plasma.sd.service

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
import com.sdds.compose.uikit.LocalAutocompleteStyle
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
import com.sdds.compose.uikit.LocalFileStyle
import com.sdds.compose.uikit.LocalIconBadgeStyle
import com.sdds.compose.uikit.LocalImageStyle
import com.sdds.compose.uikit.LocalIndicatorStyle
import com.sdds.compose.uikit.LocalListStyle
import com.sdds.compose.uikit.LocalLoaderStyle
import com.sdds.compose.uikit.LocalModalBottomSheetStyle
import com.sdds.compose.uikit.LocalModalStyle
import com.sdds.compose.uikit.LocalNavigationBarStyle
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
import com.sdds.compose.uikit.LocalTabBarStyle
import com.sdds.compose.uikit.LocalTextFieldStyle
import com.sdds.compose.uikit.LocalTextSkeletonStyle
import com.sdds.compose.uikit.LocalToastStyle
import com.sdds.compose.uikit.LocalTooltipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.accordion.AccordionSolidActionStart
import com.sdds.plasma.sd.service.styles.accordion.H3
import com.sdds.plasma.sd.service.styles.autocomplete.AutocompleteNormal
import com.sdds.plasma.sd.service.styles.autocomplete.M
import com.sdds.plasma.sd.service.styles.avatar.Avatar
import com.sdds.plasma.sd.service.styles.avatar.M
import com.sdds.plasma.sd.service.styles.avatargroup.AvatarGroup
import com.sdds.plasma.sd.service.styles.avatargroup.S
import com.sdds.plasma.sd.service.styles.badge.BadgeSolid
import com.sdds.plasma.sd.service.styles.badge.Default
import com.sdds.plasma.sd.service.styles.badge.M
import com.sdds.plasma.sd.service.styles.basicbutton.BasicButton
import com.sdds.plasma.sd.service.styles.basicbutton.Default
import com.sdds.plasma.sd.service.styles.basicbutton.M
import com.sdds.plasma.sd.service.styles.bottomsheet.Default
import com.sdds.plasma.sd.service.styles.bottomsheet.ModalBottomSheet
import com.sdds.plasma.sd.service.styles.buttongroup.BasicButtonGroup
import com.sdds.plasma.sd.service.styles.buttongroup.Default
import com.sdds.plasma.sd.service.styles.buttongroup.Dense
import com.sdds.plasma.sd.service.styles.buttongroup.M
import com.sdds.plasma.sd.service.styles.card.CardSolid
import com.sdds.plasma.sd.service.styles.card.M
import com.sdds.plasma.sd.service.styles.cell.Cell
import com.sdds.plasma.sd.service.styles.cell.M
import com.sdds.plasma.sd.service.styles.checkbox.CheckBox
import com.sdds.plasma.sd.service.styles.checkbox.Default
import com.sdds.plasma.sd.service.styles.checkbox.M
import com.sdds.plasma.sd.service.styles.checkboxgroup.CheckBoxGroup
import com.sdds.plasma.sd.service.styles.checkboxgroup.M
import com.sdds.plasma.sd.service.styles.chip.Chip
import com.sdds.plasma.sd.service.styles.chip.Default
import com.sdds.plasma.sd.service.styles.chip.M
import com.sdds.plasma.sd.service.styles.chipgroup.ChipGroupDense
import com.sdds.plasma.sd.service.styles.chipgroup.Default
import com.sdds.plasma.sd.service.styles.chipgroup.M
import com.sdds.plasma.sd.service.styles.circularprogressbar.CircularProgressBar
import com.sdds.plasma.sd.service.styles.circularprogressbar.Default
import com.sdds.plasma.sd.service.styles.circularprogressbar.M
import com.sdds.plasma.sd.service.styles.codefield.CodeField
import com.sdds.plasma.sd.service.styles.codefield.M
import com.sdds.plasma.sd.service.styles.codeinput.CodeInput
import com.sdds.plasma.sd.service.styles.codeinput.M
import com.sdds.plasma.sd.service.styles.counter.Counter
import com.sdds.plasma.sd.service.styles.counter.Default
import com.sdds.plasma.sd.service.styles.counter.M
import com.sdds.plasma.sd.service.styles.divider.Default
import com.sdds.plasma.sd.service.styles.divider.Divider
import com.sdds.plasma.sd.service.styles.drawer.DrawerCloseOuter
import com.sdds.plasma.sd.service.styles.drawer.M
import com.sdds.plasma.sd.service.styles.dropdownmenu.DropdownMenuNormal
import com.sdds.plasma.sd.service.styles.dropdownmenu.M
import com.sdds.plasma.sd.service.styles.file.Default
import com.sdds.plasma.sd.service.styles.file.FileCircularProgress
import com.sdds.plasma.sd.service.styles.file.FileLinearProgress
import com.sdds.plasma.sd.service.styles.file.M
import com.sdds.plasma.sd.service.styles.iconbadge.Default
import com.sdds.plasma.sd.service.styles.iconbadge.IconBadgeSolid
import com.sdds.plasma.sd.service.styles.iconbadge.M
import com.sdds.plasma.sd.service.styles.image.Image
import com.sdds.plasma.sd.service.styles.image.Ratio3x4
import com.sdds.plasma.sd.service.styles.indicator.Default
import com.sdds.plasma.sd.service.styles.indicator.Indicator
import com.sdds.plasma.sd.service.styles.indicator.M
import com.sdds.plasma.sd.service.styles.list.ListNormal
import com.sdds.plasma.sd.service.styles.list.M
import com.sdds.plasma.sd.service.styles.loader.Default
import com.sdds.plasma.sd.service.styles.loader.Loader
import com.sdds.plasma.sd.service.styles.modal.Default
import com.sdds.plasma.sd.service.styles.modal.Modal
import com.sdds.plasma.sd.service.styles.navigationbar.NavigationBarMainPage
import com.sdds.plasma.sd.service.styles.navigationbar.NoBackground
import com.sdds.plasma.sd.service.styles.notification.M
import com.sdds.plasma.sd.service.styles.notification.NotificationLoose
import com.sdds.plasma.sd.service.styles.notificationcontent.ButtonStretch
import com.sdds.plasma.sd.service.styles.notificationcontent.Default
import com.sdds.plasma.sd.service.styles.notificationcontent.NotificationContent
import com.sdds.plasma.sd.service.styles.overlay.Default
import com.sdds.plasma.sd.service.styles.overlay.Overlay
import com.sdds.plasma.sd.service.styles.paginationdots.M
import com.sdds.plasma.sd.service.styles.paginationdots.PaginationDotsHorizontal
import com.sdds.plasma.sd.service.styles.popover.Default
import com.sdds.plasma.sd.service.styles.popover.M
import com.sdds.plasma.sd.service.styles.popover.Popover
import com.sdds.plasma.sd.service.styles.progressbar.Default
import com.sdds.plasma.sd.service.styles.progressbar.ProgressBar
import com.sdds.plasma.sd.service.styles.radiobox.M
import com.sdds.plasma.sd.service.styles.radiobox.RadioBox
import com.sdds.plasma.sd.service.styles.radioboxgroup.M
import com.sdds.plasma.sd.service.styles.radioboxgroup.RadioBoxGroup
import com.sdds.plasma.sd.service.styles.rectskeleton.Default
import com.sdds.plasma.sd.service.styles.rectskeleton.RectSkeleton
import com.sdds.plasma.sd.service.styles.scrollbar.M
import com.sdds.plasma.sd.service.styles.scrollbar.ScrollBar
import com.sdds.plasma.sd.service.styles.segment.M
import com.sdds.plasma.sd.service.styles.segment.Primary
import com.sdds.plasma.sd.service.styles.segment.Segment
import com.sdds.plasma.sd.service.styles.segmentitem.M
import com.sdds.plasma.sd.service.styles.segmentitem.Primary
import com.sdds.plasma.sd.service.styles.segmentitem.SegmentItem
import com.sdds.plasma.sd.service.styles.spinner.Default
import com.sdds.plasma.sd.service.styles.spinner.M
import com.sdds.plasma.sd.service.styles.spinner.Spinner
import com.sdds.plasma.sd.service.styles.switcher.M
import com.sdds.plasma.sd.service.styles.switcher.Switch
import com.sdds.plasma.sd.service.styles.tabbar.Default
import com.sdds.plasma.sd.service.styles.tabbar.M
import com.sdds.plasma.sd.service.styles.tabbar.TabBarSolid
import com.sdds.plasma.sd.service.styles.textfield.Default
import com.sdds.plasma.sd.service.styles.textfield.M
import com.sdds.plasma.sd.service.styles.textfield.TextField
import com.sdds.plasma.sd.service.styles.textskeleton.Default
import com.sdds.plasma.sd.service.styles.textskeleton.TextSkeleton
import com.sdds.plasma.sd.service.styles.toast.Default
import com.sdds.plasma.sd.service.styles.toast.Rounded
import com.sdds.plasma.sd.service.styles.toast.Toast
import com.sdds.plasma.sd.service.styles.tooltip.M
import com.sdds.plasma.sd.service.styles.tooltip.Tooltip
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import com.sdds.plasma.sd.service.theme.darkPlasmaSdServiceColors
import com.sdds.plasma.sd.service.theme.darkPlasmaSdServiceGradients
import com.sdds.plasma.sd.service.theme.lightPlasmaSdServiceColors
import com.sdds.plasma.sd.service.theme.lightPlasmaSdServiceGradients

private val DarkColors = darkPlasmaSdServiceColors()
private val LightColors = lightPlasmaSdServiceColors()
private val DarkGradients = darkPlasmaSdServiceGradients()
private val LightGradients = lightPlasmaSdServiceGradients()

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
    PlasmaSdServiceTheme(
        colors = colorScheme,
        gradients = if (darkTheme) DarkGradients else LightGradients,
    ) {
        CompositionLocalProvider(
            LocalAccordionStyle provides AccordionSolidActionStart.H3.style(),
            LocalAutocompleteStyle provides AutocompleteNormal.M.style(),
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
            LocalFileStyle provides FileCircularProgress.M.Default.style(),
            LocalFileStyle provides FileLinearProgress.M.Default.style(),
            LocalImageStyle provides Image.Ratio3x4.style(),
            LocalIndicatorStyle provides Indicator.M.Default.style(),
            LocalListStyle provides ListNormal.M.style(),
            LocalLoaderStyle provides Loader.Default.style(),
            LocalModalBottomSheetStyle provides ModalBottomSheet.Default.style(),
            LocalModalStyle provides Modal.Default.style(),
            LocalNavigationBarStyle provides NavigationBarMainPage.NoBackground.style(),
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
