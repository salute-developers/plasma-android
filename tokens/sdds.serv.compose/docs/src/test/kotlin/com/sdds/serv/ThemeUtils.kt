package com.sdds.serv

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
import com.sdds.compose.uikit.LocalNoteCompactStyle
import com.sdds.compose.uikit.LocalNoteStyle
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
import com.sdds.compose.uikit.LocalSliderStyle
import com.sdds.compose.uikit.LocalSpinnerStyle
import com.sdds.compose.uikit.LocalSwitchStyle
import com.sdds.compose.uikit.LocalTabBarStyle
import com.sdds.compose.uikit.LocalTabsStyle
import com.sdds.compose.uikit.LocalTextFieldStyle
import com.sdds.compose.uikit.LocalTextSkeletonStyle
import com.sdds.compose.uikit.LocalToastStyle
import com.sdds.compose.uikit.LocalTooltipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.accordion.AccordionSolidActionStart
import com.sdds.serv.styles.accordion.H3
import com.sdds.serv.styles.autocomplete.AutocompleteNormal
import com.sdds.serv.styles.autocomplete.M
import com.sdds.serv.styles.avatar.Avatar
import com.sdds.serv.styles.avatar.M
import com.sdds.serv.styles.avatargroup.AvatarGroup
import com.sdds.serv.styles.avatargroup.S
import com.sdds.serv.styles.badge.BadgeSolid
import com.sdds.serv.styles.badge.Default
import com.sdds.serv.styles.badge.M
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.M
import com.sdds.serv.styles.bottomsheet.Default
import com.sdds.serv.styles.bottomsheet.ModalBottomSheet
import com.sdds.serv.styles.buttongroup.BasicButtonGroup
import com.sdds.serv.styles.buttongroup.Default
import com.sdds.serv.styles.buttongroup.Dense
import com.sdds.serv.styles.buttongroup.M
import com.sdds.serv.styles.card.CardSolid
import com.sdds.serv.styles.card.M
import com.sdds.serv.styles.cell.Cell
import com.sdds.serv.styles.cell.M
import com.sdds.serv.styles.checkbox.CheckBox
import com.sdds.serv.styles.checkbox.Default
import com.sdds.serv.styles.checkbox.M
import com.sdds.serv.styles.checkboxgroup.CheckBoxGroup
import com.sdds.serv.styles.checkboxgroup.M
import com.sdds.serv.styles.chip.Chip
import com.sdds.serv.styles.chip.Default
import com.sdds.serv.styles.chip.M
import com.sdds.serv.styles.chipgroup.ChipGroupDense
import com.sdds.serv.styles.chipgroup.Default
import com.sdds.serv.styles.chipgroup.M
import com.sdds.serv.styles.circularprogressbar.CircularProgressBar
import com.sdds.serv.styles.circularprogressbar.Default
import com.sdds.serv.styles.circularprogressbar.M
import com.sdds.serv.styles.codefield.CodeField
import com.sdds.serv.styles.codefield.M
import com.sdds.serv.styles.codeinput.CodeInput
import com.sdds.serv.styles.codeinput.M
import com.sdds.serv.styles.counter.Counter
import com.sdds.serv.styles.counter.Default
import com.sdds.serv.styles.counter.M
import com.sdds.serv.styles.divider.Default
import com.sdds.serv.styles.divider.Divider
import com.sdds.serv.styles.drawer.DrawerCloseOuter
import com.sdds.serv.styles.drawer.M
import com.sdds.serv.styles.dropdownmenu.DropdownMenuNormal
import com.sdds.serv.styles.dropdownmenu.M
import com.sdds.serv.styles.file.Default
import com.sdds.serv.styles.file.FileCircularProgress
import com.sdds.serv.styles.file.FileLinearProgress
import com.sdds.serv.styles.file.M
import com.sdds.serv.styles.iconbadge.Default
import com.sdds.serv.styles.iconbadge.IconBadgeSolid
import com.sdds.serv.styles.iconbadge.M
import com.sdds.serv.styles.image.Image
import com.sdds.serv.styles.image.Ratio3x4
import com.sdds.serv.styles.indicator.Default
import com.sdds.serv.styles.indicator.Indicator
import com.sdds.serv.styles.indicator.M
import com.sdds.serv.styles.list.ListNormal
import com.sdds.serv.styles.list.M
import com.sdds.serv.styles.loader.Default
import com.sdds.serv.styles.loader.Loader
import com.sdds.serv.styles.modal.Default
import com.sdds.serv.styles.modal.Modal
import com.sdds.serv.styles.navigationbar.NavigationBarMainPage
import com.sdds.serv.styles.navigationbar.NoBackground
import com.sdds.serv.styles.note.Default
import com.sdds.serv.styles.note.M
import com.sdds.serv.styles.note.Note
import com.sdds.serv.styles.notecompact.Default
import com.sdds.serv.styles.notecompact.M
import com.sdds.serv.styles.notecompact.NoteCompact
import com.sdds.serv.styles.notification.M
import com.sdds.serv.styles.notification.NotificationLoose
import com.sdds.serv.styles.notificationcontent.ButtonStretch
import com.sdds.serv.styles.notificationcontent.Default
import com.sdds.serv.styles.notificationcontent.NotificationContent
import com.sdds.serv.styles.overlay.Default
import com.sdds.serv.styles.overlay.Overlay
import com.sdds.serv.styles.paginationdots.M
import com.sdds.serv.styles.paginationdots.PaginationDotsHorizontal
import com.sdds.serv.styles.popover.Default
import com.sdds.serv.styles.popover.M
import com.sdds.serv.styles.popover.Popover
import com.sdds.serv.styles.progressbar.Default
import com.sdds.serv.styles.progressbar.ProgressBar
import com.sdds.serv.styles.radiobox.M
import com.sdds.serv.styles.radiobox.RadioBox
import com.sdds.serv.styles.radioboxgroup.M
import com.sdds.serv.styles.radioboxgroup.RadioBoxGroup
import com.sdds.serv.styles.rectskeleton.Default
import com.sdds.serv.styles.rectskeleton.RectSkeleton
import com.sdds.serv.styles.scrollbar.M
import com.sdds.serv.styles.scrollbar.ScrollBar
import com.sdds.serv.styles.segment.M
import com.sdds.serv.styles.segment.Primary
import com.sdds.serv.styles.segment.Segment
import com.sdds.serv.styles.segmentitem.M
import com.sdds.serv.styles.segmentitem.Primary
import com.sdds.serv.styles.segmentitem.SegmentItem
import com.sdds.serv.styles.slider.Default
import com.sdds.serv.styles.slider.M
import com.sdds.serv.styles.slider.SliderHorizontalLabelInner
import com.sdds.serv.styles.spinner.Default
import com.sdds.serv.styles.spinner.M
import com.sdds.serv.styles.spinner.Spinner
import com.sdds.serv.styles.switcher.M
import com.sdds.serv.styles.switcher.Switch
import com.sdds.serv.styles.tabbar.Default
import com.sdds.serv.styles.tabbar.M
import com.sdds.serv.styles.tabbar.TabBarSolid
import com.sdds.serv.styles.tabs.M
import com.sdds.serv.styles.tabs.TabsDefault
import com.sdds.serv.styles.textfield.Default
import com.sdds.serv.styles.textfield.M
import com.sdds.serv.styles.textfield.TextField
import com.sdds.serv.styles.textskeleton.Default
import com.sdds.serv.styles.textskeleton.TextSkeleton
import com.sdds.serv.styles.toast.Default
import com.sdds.serv.styles.toast.Rounded
import com.sdds.serv.styles.toast.Toast
import com.sdds.serv.styles.tooltip.M
import com.sdds.serv.styles.tooltip.Tooltip
import com.sdds.serv.theme.SddsServTheme
import com.sdds.serv.theme.darkSddsServColors
import com.sdds.serv.theme.darkSddsServGradients
import com.sdds.serv.theme.lightSddsServColors
import com.sdds.serv.theme.lightSddsServGradients

private val DarkColors = darkSddsServColors()
private val LightColors = lightSddsServColors()
private val DarkGradients = darkSddsServGradients()
private val LightGradients = lightSddsServGradients()

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

    SddsServTheme(
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
            LocalNoteStyle provides Note.M.Default.style(),
            LocalNoteCompactStyle provides NoteCompact.M.Default.style(),
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
            LocalSliderStyle provides SliderHorizontalLabelInner.M.Default.style(),
            LocalSpinnerStyle provides Spinner.M.Default.style(),
            LocalSwitchStyle provides Switch.M.style(),
            LocalTabBarStyle provides TabBarSolid.M.Default.style(),
            LocalTabsStyle provides TabsDefault.M.style(),
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
