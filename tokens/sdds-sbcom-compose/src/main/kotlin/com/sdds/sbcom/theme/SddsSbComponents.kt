package com.sdds.sbcom.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.sdds.compose.uikit.LocalAvatarStyle
import com.sdds.compose.uikit.LocalButtonGroupStyle
import com.sdds.compose.uikit.LocalButtonStyle
import com.sdds.compose.uikit.LocalCheckBoxStyle
import com.sdds.compose.uikit.LocalChipGroupStyle
import com.sdds.compose.uikit.LocalChipStyle
import com.sdds.compose.uikit.LocalCircularProgressBarStyle
import com.sdds.compose.uikit.LocalCollapsingNavigationBarStyle
import com.sdds.compose.uikit.LocalCounterStyle
import com.sdds.compose.uikit.LocalDividerStyle
import com.sdds.compose.uikit.LocalDropdownMenuStyle
import com.sdds.compose.uikit.LocalIconButtonStyle
import com.sdds.compose.uikit.LocalIndicatorStyle
import com.sdds.compose.uikit.LocalLoaderStyle
import com.sdds.compose.uikit.LocalModalBottomSheetStyle
import com.sdds.compose.uikit.LocalModalStyle
import com.sdds.compose.uikit.LocalOverlayStyle
import com.sdds.compose.uikit.LocalRadioBoxStyle
import com.sdds.compose.uikit.LocalRectSkeletonStyle
import com.sdds.compose.uikit.LocalScrollBarStyle
import com.sdds.compose.uikit.LocalSegmentStyle
import com.sdds.compose.uikit.LocalSpinnerStyle
import com.sdds.compose.uikit.LocalSwitchStyle
import com.sdds.compose.uikit.LocalTabBarStyle
import com.sdds.compose.uikit.LocalTabsStyle
import com.sdds.compose.uikit.LocalTextFieldStyle
import com.sdds.compose.uikit.LocalTooltipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.avatar.Avatar
import com.sdds.sbcom.styles.avatar.Size36
import com.sdds.sbcom.styles.basicbutton.BasicButton
import com.sdds.sbcom.styles.basicbutton.ModeAccentFilled
import com.sdds.sbcom.styles.basicbutton.Size40
import com.sdds.sbcom.styles.bottomsheet.Default
import com.sdds.sbcom.styles.bottomsheet.ModalBottomSheet
import com.sdds.sbcom.styles.buttongroup.BasicButtonGroup
import com.sdds.sbcom.styles.buttongroup.Default
import com.sdds.sbcom.styles.checkbox.CheckBox
import com.sdds.sbcom.styles.checkbox.Default
import com.sdds.sbcom.styles.chip.Chip
import com.sdds.sbcom.styles.chip.ChipSlotPadding
import com.sdds.sbcom.styles.chipgroup.ChipGroup
import com.sdds.sbcom.styles.chipgroup.ChipSlotPadding
import com.sdds.sbcom.styles.circularprogressbar.CircularProgressBar
import com.sdds.sbcom.styles.circularprogressbar.ModeColorPrimary
import com.sdds.sbcom.styles.circularprogressbar.Size40
import com.sdds.sbcom.styles.collapsingnavigationbar.CollapsingNavigationBarMainPage
import com.sdds.sbcom.styles.collapsingnavigationbar.Default
import com.sdds.sbcom.styles.counter.Counter
import com.sdds.sbcom.styles.counter.MuteNo
import com.sdds.sbcom.styles.divider.Default
import com.sdds.sbcom.styles.divider.Divider
import com.sdds.sbcom.styles.dropdownmenu.Default
import com.sdds.sbcom.styles.dropdownmenu.DropdownMenu
import com.sdds.sbcom.styles.iconbutton.IconButton
import com.sdds.sbcom.styles.iconbutton.ModeAccentFilled
import com.sdds.sbcom.styles.iconbutton.Size40
import com.sdds.sbcom.styles.indicator.Indicator
import com.sdds.sbcom.styles.indicator.StateSuccess
import com.sdds.sbcom.styles.loader.Loader
import com.sdds.sbcom.styles.loader.ModeColorPrimary
import com.sdds.sbcom.styles.loader.Size40
import com.sdds.sbcom.styles.modal.Default
import com.sdds.sbcom.styles.modal.Modal
import com.sdds.sbcom.styles.overlay.Default
import com.sdds.sbcom.styles.overlay.Overlay
import com.sdds.sbcom.styles.radiobox.Default
import com.sdds.sbcom.styles.radiobox.RadioBox
import com.sdds.sbcom.styles.rectskeleton.Default
import com.sdds.sbcom.styles.rectskeleton.RectSkeleton
import com.sdds.sbcom.styles.scrollbar.Default
import com.sdds.sbcom.styles.scrollbar.ScrollBar
import com.sdds.sbcom.styles.segment.Default
import com.sdds.sbcom.styles.segment.Segment
import com.sdds.sbcom.styles.spinner.ModeColorPrimary
import com.sdds.sbcom.styles.spinner.Size40
import com.sdds.sbcom.styles.spinner.Spinner
import com.sdds.sbcom.styles.switcher.Default
import com.sdds.sbcom.styles.switcher.Switch
import com.sdds.sbcom.styles.tabbar.Default
import com.sdds.sbcom.styles.tabbar.TabBar
import com.sdds.sbcom.styles.tabs.Default
import com.sdds.sbcom.styles.tabs.TabsFolder
import com.sdds.sbcom.styles.textfield.Default
import com.sdds.sbcom.styles.textfield.TextField
import com.sdds.sbcom.styles.tooltip.Default
import com.sdds.sbcom.styles.tooltip.Tooltip

@Composable
internal fun DefaultComponents(
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalAvatarStyle provides Avatar.Size36.style(),
        LocalButtonGroupStyle provides BasicButtonGroup.Default.style(),
        LocalButtonStyle provides BasicButton.Size40.ModeAccentFilled.style(),
        LocalCheckBoxStyle provides CheckBox.Default.style(),
        LocalChipGroupStyle provides ChipGroup.ChipSlotPadding.style(),
        LocalChipStyle provides Chip.ChipSlotPadding.style(),
        LocalCircularProgressBarStyle provides CircularProgressBar.Size40.ModeColorPrimary.style(),
        LocalCollapsingNavigationBarStyle provides CollapsingNavigationBarMainPage.Default.style(),
        LocalCounterStyle provides Counter.MuteNo.style(),
        LocalDividerStyle provides Divider.Default.style(),
        LocalIndicatorStyle provides Indicator.StateSuccess.style(),
        LocalLoaderStyle provides Loader.Size40.ModeColorPrimary.style(),
        LocalModalBottomSheetStyle provides ModalBottomSheet.Default.style(),
        LocalOverlayStyle provides Overlay.Default.style(),
        LocalRadioBoxStyle provides RadioBox.Default.style(),
        LocalRectSkeletonStyle provides RectSkeleton.Default.style(),
        LocalSpinnerStyle provides Spinner.Size40.ModeColorPrimary.style(),
        LocalSwitchStyle provides Switch.Default.style(),
        LocalTabBarStyle provides TabBar.Default.style(),
        LocalTextFieldStyle provides TextField.Default.style(),
        LocalTooltipStyle provides Tooltip.Default.style(),
        LocalDropdownMenuStyle provides DropdownMenu.Default.style(),
        LocalIconButtonStyle provides IconButton.Size40.ModeAccentFilled.style(),
        LocalModalStyle provides Modal.Default.style(),
        LocalScrollBarStyle provides ScrollBar.Default.style(),
        LocalSegmentStyle provides Segment.Default.style(),
        LocalTabsStyle provides TabsFolder.Default.style(),
    ) {
        content()
    }
}
