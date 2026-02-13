package com.sdds.stylessalute

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
import com.sdds.compose.uikit.LocalCodeInputStyle
import com.sdds.compose.uikit.LocalCounterStyle
import com.sdds.compose.uikit.LocalDividerStyle
import com.sdds.compose.uikit.LocalDropdownMenuStyle
import com.sdds.compose.uikit.LocalIconBadgeStyle
import com.sdds.compose.uikit.LocalIndicatorStyle
import com.sdds.compose.uikit.LocalListStyle
import com.sdds.compose.uikit.LocalModalBottomSheetStyle
import com.sdds.compose.uikit.LocalModalStyle
import com.sdds.compose.uikit.LocalNotificationContentStyle
import com.sdds.compose.uikit.LocalNotificationStyle
import com.sdds.compose.uikit.LocalPopoverStyle
import com.sdds.compose.uikit.LocalProgressBarStyle
import com.sdds.compose.uikit.LocalRadioBoxGroupStyle
import com.sdds.compose.uikit.LocalRadioBoxStyle
import com.sdds.compose.uikit.LocalRectSkeletonStyle
import com.sdds.compose.uikit.LocalScrollBarStyle
import com.sdds.compose.uikit.LocalSegmentItemStyle
import com.sdds.compose.uikit.LocalSegmentStyle
import com.sdds.compose.uikit.LocalSwitchStyle
import com.sdds.compose.uikit.LocalTextFieldStyle
import com.sdds.compose.uikit.LocalTextSkeletonStyle
import com.sdds.compose.uikit.LocalToastStyle
import com.sdds.compose.uikit.LocalTooltipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.stylessalute.styles.accordion.AccordionSolidActionStart
import com.sdds.stylessalute.styles.accordion.H3
import com.sdds.stylessalute.styles.avatar.Avatar
import com.sdds.stylessalute.styles.avatar.M
import com.sdds.stylessalute.styles.avatargroup.AvatarGroup
import com.sdds.stylessalute.styles.avatargroup.S
import com.sdds.stylessalute.styles.badge.BadgeSolid
import com.sdds.stylessalute.styles.badge.Default
import com.sdds.stylessalute.styles.badge.M
import com.sdds.stylessalute.styles.basicbutton.BasicButton
import com.sdds.stylessalute.styles.basicbutton.Default
import com.sdds.stylessalute.styles.basicbutton.M
import com.sdds.stylessalute.styles.bottomsheet.Default
import com.sdds.stylessalute.styles.bottomsheet.ModalBottomSheet
import com.sdds.stylessalute.styles.buttongroup.BasicButtonGroup
import com.sdds.stylessalute.styles.buttongroup.Default
import com.sdds.stylessalute.styles.buttongroup.Dense
import com.sdds.stylessalute.styles.buttongroup.M
import com.sdds.stylessalute.styles.card.CardSolid
import com.sdds.stylessalute.styles.card.Default
import com.sdds.stylessalute.styles.cell.Cell
import com.sdds.stylessalute.styles.cell.M
import com.sdds.stylessalute.styles.checkbox.CheckBox
import com.sdds.stylessalute.styles.checkbox.Default
import com.sdds.stylessalute.styles.checkbox.M
import com.sdds.stylessalute.styles.checkboxgroup.CheckBoxGroup
import com.sdds.stylessalute.styles.checkboxgroup.M
import com.sdds.stylessalute.styles.chip.Chip
import com.sdds.stylessalute.styles.chip.Default
import com.sdds.stylessalute.styles.chip.M
import com.sdds.stylessalute.styles.chipgroup.ChipGroupDense
import com.sdds.stylessalute.styles.chipgroup.Default
import com.sdds.stylessalute.styles.chipgroup.M
import com.sdds.stylessalute.styles.codeinput.CodeInput
import com.sdds.stylessalute.styles.codeinput.M
import com.sdds.stylessalute.styles.counter.Counter
import com.sdds.stylessalute.styles.counter.Default
import com.sdds.stylessalute.styles.counter.M
import com.sdds.stylessalute.styles.divider.Default
import com.sdds.stylessalute.styles.divider.Divider
import com.sdds.stylessalute.styles.dropdownmenu.DropdownMenuNormal
import com.sdds.stylessalute.styles.dropdownmenu.M
import com.sdds.stylessalute.styles.iconbadge.Default
import com.sdds.stylessalute.styles.iconbadge.IconBadgeSolid
import com.sdds.stylessalute.styles.iconbadge.M
import com.sdds.stylessalute.styles.indicator.Default
import com.sdds.stylessalute.styles.indicator.Indicator
import com.sdds.stylessalute.styles.indicator.M
import com.sdds.stylessalute.styles.list.ListNormal
import com.sdds.stylessalute.styles.list.M
import com.sdds.stylessalute.styles.modal.Default
import com.sdds.stylessalute.styles.modal.Modal
import com.sdds.stylessalute.styles.notification.M
import com.sdds.stylessalute.styles.notification.NotificationLoose
import com.sdds.stylessalute.styles.notificationcontent.ButtonStretch
import com.sdds.stylessalute.styles.notificationcontent.Default
import com.sdds.stylessalute.styles.notificationcontent.NotificationContent
import com.sdds.stylessalute.styles.popover.Default
import com.sdds.stylessalute.styles.popover.M
import com.sdds.stylessalute.styles.popover.Popover
import com.sdds.stylessalute.styles.progressbar.Default
import com.sdds.stylessalute.styles.progressbar.ProgressBar
import com.sdds.stylessalute.styles.radiobox.M
import com.sdds.stylessalute.styles.radiobox.RadioBox
import com.sdds.stylessalute.styles.radioboxgroup.M
import com.sdds.stylessalute.styles.radioboxgroup.RadioBoxGroup
import com.sdds.stylessalute.styles.rectskeleton.Default
import com.sdds.stylessalute.styles.rectskeleton.RectSkeleton
import com.sdds.stylessalute.styles.scrollbar.M
import com.sdds.stylessalute.styles.scrollbar.ScrollBar
import com.sdds.stylessalute.styles.segment.M
import com.sdds.stylessalute.styles.segment.Primary
import com.sdds.stylessalute.styles.segment.Segment
import com.sdds.stylessalute.styles.segmentitem.M
import com.sdds.stylessalute.styles.segmentitem.Primary
import com.sdds.stylessalute.styles.segmentitem.SegmentItem
import com.sdds.stylessalute.styles.switcher.M
import com.sdds.stylessalute.styles.switcher.Switch
import com.sdds.stylessalute.styles.textfield.Default
import com.sdds.stylessalute.styles.textfield.M
import com.sdds.stylessalute.styles.textfield.TextField
import com.sdds.stylessalute.styles.textskeleton.Default
import com.sdds.stylessalute.styles.textskeleton.TextSkeleton
import com.sdds.stylessalute.styles.toast.Rounded
import com.sdds.stylessalute.styles.toast.Toast
import com.sdds.stylessalute.styles.tooltip.M
import com.sdds.stylessalute.styles.tooltip.Tooltip
import com.sdds.stylessalute.theme.StylesSaluteTheme
import com.sdds.stylessalute.theme.darkStylesSaluteColors
import com.sdds.stylessalute.theme.darkStylesSaluteGradients
import com.sdds.stylessalute.theme.lightStylesSaluteColors
import com.sdds.stylessalute.theme.lightStylesSaluteGradients

private val DarkColors = darkStylesSaluteColors()
private val LightColors = lightStylesSaluteColors()
private val DarkGradients = darkStylesSaluteGradients()
private val LightGradients = lightStylesSaluteGradients()

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

    StylesSaluteTheme(
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
            LocalCardStyle provides CardSolid.Default.style(),
            LocalCellStyle provides Cell.M.style(),
            LocalCheckBoxGroupStyle provides CheckBoxGroup.M.style(),
            LocalCheckBoxStyle provides CheckBox.M.Default.style(),
            LocalChipGroupStyle provides ChipGroupDense.M.Default.style(),
            LocalChipStyle provides Chip.M.Default.style(),
            LocalCodeInputStyle provides CodeInput.M.style(),
            LocalCounterStyle provides Counter.M.Default.style(),
            LocalDividerStyle provides Divider.Default.style(),
            LocalDropdownMenuStyle provides DropdownMenuNormal.M.style(),
            LocalIndicatorStyle provides Indicator.M.Default.style(),
            LocalListStyle provides ListNormal.M.style(),
            LocalModalBottomSheetStyle provides ModalBottomSheet.Default.style(),
            LocalModalStyle provides Modal.Default.style(),
            LocalNotificationContentStyle provides NotificationContent.ButtonStretch.Default.style(),
            LocalNotificationStyle provides NotificationLoose.M.style(),
            LocalPopoverStyle provides Popover.M.Default.style(),
            LocalProgressBarStyle provides ProgressBar.Default.style(),
            LocalRadioBoxGroupStyle provides RadioBoxGroup.M.style(),
            LocalRadioBoxStyle provides RadioBox.M.style(),
            LocalRectSkeletonStyle provides RectSkeleton.Default.style(),
            LocalScrollBarStyle provides ScrollBar.M.style(),
            LocalSegmentItemStyle provides SegmentItem.M.Primary.style(),
            LocalSegmentStyle provides Segment.M.Primary.style(),
            LocalSwitchStyle provides Switch.M.style(),
            LocalTextFieldStyle provides TextField.M.Default.style(),
            LocalTextSkeletonStyle provides TextSkeleton.Default.style(),
            LocalToastStyle provides Toast.Rounded.style(),
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
