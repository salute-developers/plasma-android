package com.sdds.playground.sandbox.core.compose

import androidx.compose.runtime.Composable
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.avatar.compose.AvatarScreen
import com.sdds.playground.sandbox.avatar.compose.group.AvatarGroupScreen
import com.sdds.playground.sandbox.badge.compose.BadgeScreen
import com.sdds.playground.sandbox.badge.compose.IconBadgeScreen
import com.sdds.playground.sandbox.buttons.compose.BasicButtonScreen
import com.sdds.playground.sandbox.buttons.compose.IconButtonScreen
import com.sdds.playground.sandbox.buttons.compose.LinkButtonScreen
import com.sdds.playground.sandbox.cell.compose.CellScreen
import com.sdds.playground.sandbox.checkbox.compose.CheckBoxScreen
import com.sdds.playground.sandbox.checkbox.compose.group.CheckBoxGroupScreen
import com.sdds.playground.sandbox.chip.compose.ChipScreen
import com.sdds.playground.sandbox.chip.compose.group.ChipGroupScreen
import com.sdds.playground.sandbox.counter.compose.CounterScreen
import com.sdds.playground.sandbox.indicator.compose.IndicatorScreen
import com.sdds.playground.sandbox.progress.compose.ProgressScreen
import com.sdds.playground.sandbox.radiobox.compose.RadioBoxScreen
import com.sdds.playground.sandbox.radiobox.compose.group.RadioBoxGroupScreen
import com.sdds.playground.sandbox.segment.compose.SegmentItemScreen
import com.sdds.playground.sandbox.switcher.compose.SwitchScreen
import com.sdds.playground.sandbox.textfield.compose.TextFieldScreen
import com.sdds.playground.sandbox.textfield.compose.TextFieldType

/**
 *
 * @author Малышев Александр on 25.02.2025
 */
internal sealed class MenuItem(
    val title: String,
    val screen: @Composable (theme: Theme.ThemeInfoCompose) -> Unit,
) {
    object Avatar : MenuItem("Avatar", { AvatarScreen(it) })
    object AvatarGroup : MenuItem("AvatarGroup", { AvatarGroupScreen(it) })
    object Buttons : MenuItem("BasicButton", { BasicButtonScreen(it) })
    object Badge : MenuItem("Badge", { BadgeScreen(it) })
    object IconButtons : MenuItem("IconButton", { IconButtonScreen(it) })
    object IconBadge : MenuItem("IconBadge", { IconBadgeScreen(it) })
    object LinkButtons : MenuItem("LinkButton", { LinkButtonScreen(it) })
    object Cell : MenuItem("Cell", { CellScreen(it) })
    object CheckBox : MenuItem("CheckBox", { CheckBoxScreen(it) })
    object CheckBoxGroup : MenuItem("CheckBoxGroup", { CheckBoxGroupScreen(it) })
    object Counter : MenuItem("Counter", { CounterScreen(it) })
    object RadioBox : MenuItem("RadioBox", { RadioBoxScreen(it) })
    object RadioBoxGroup : MenuItem("RadioBoxGroup", { RadioBoxGroupScreen(it) })
    object Switch : MenuItem("Switch", { SwitchScreen(it) })
    object SegmentItem : MenuItem("SegmentItem", { SegmentItemScreen(it) })
    object Progress : MenuItem("Progress", { ProgressScreen(it) })
    object TextField : MenuItem("TextField", { TextFieldScreen(it, TextFieldType.TextField) })
    object TextFieldClear :
        MenuItem("TextFieldClear", { TextFieldScreen(it, TextFieldType.TextFieldClear) })

    object TextArea : MenuItem("TextArea", { TextFieldScreen(it, TextFieldType.TextArea) })
    object TextAreaClear :
        MenuItem("TextAreaClear", { TextFieldScreen(it, TextFieldType.TextAreaClear) })

    object Chip : MenuItem("Chip", { ChipScreen(it) })
    object ChipGroup : MenuItem("ChipGroup", { ChipGroupScreen(it) })
    object Indicator : MenuItem("Indicator", { IndicatorScreen(it) })

    companion object {
        val all = listOf(
            Avatar,
            AvatarGroup,
            Badge,
            Buttons,
            Cell,
            CheckBox,
            CheckBoxGroup,
            Chip,
            ChipGroup,
            Counter,
            IconBadge,
            IconButtons,
            Indicator,
            LinkButtons,
            Progress,
            RadioBox,
            RadioBoxGroup,
            SegmentItem,
            Switch,
            TextField,
            TextFieldClear,
            TextArea,
            TextAreaClear,
        )
    }
}
