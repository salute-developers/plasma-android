package com.sdds.playground.sandbox.core.compose

import androidx.compose.runtime.Composable
import com.sdds.playground.sandbox.avatar.compose.AvatarScreen
import com.sdds.playground.sandbox.avatar.compose.group.AvatarGroupScreen
import com.sdds.playground.sandbox.badge.compose.BadgeScreen
import com.sdds.playground.sandbox.badge.compose.IconBadgeScreen
import com.sdds.playground.sandbox.bottomsheet.compose.BottomSheetScreen
import com.sdds.playground.sandbox.buttons.compose.BasicButtonScreen
import com.sdds.playground.sandbox.buttons.compose.IconButtonScreen
import com.sdds.playground.sandbox.buttons.compose.LinkButtonScreen
import com.sdds.playground.sandbox.card.compose.CardScreen
import com.sdds.playground.sandbox.cell.compose.CellScreen
import com.sdds.playground.sandbox.checkbox.compose.CheckBoxScreen
import com.sdds.playground.sandbox.checkbox.compose.group.CheckBoxGroupScreen
import com.sdds.playground.sandbox.chip.compose.ChipScreen
import com.sdds.playground.sandbox.chip.compose.group.ChipGroupScreen
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderCompose
import com.sdds.playground.sandbox.core.integration.component.CoreComponent
import com.sdds.playground.sandbox.counter.compose.CounterScreen
import com.sdds.playground.sandbox.divider.compose.DividerScreen
import com.sdds.playground.sandbox.indicator.compose.IndicatorScreen
import com.sdds.playground.sandbox.modal.compose.ModalScreen
import com.sdds.playground.sandbox.notification.compose.NotificationScreen
import com.sdds.playground.sandbox.overlay.compose.OverlayScreen
import com.sdds.playground.sandbox.popover.compose.PopoverScreen
import com.sdds.playground.sandbox.progress.compose.CircularProgressScreen
import com.sdds.playground.sandbox.progress.compose.ProgressScreen
import com.sdds.playground.sandbox.radiobox.compose.RadioBoxScreen
import com.sdds.playground.sandbox.radiobox.compose.group.RadioBoxGroupScreen
import com.sdds.playground.sandbox.rectskeleton.compose.RectSkeletonScreen
import com.sdds.playground.sandbox.segment.compose.SegmentItemScreen
import com.sdds.playground.sandbox.segment.compose.SegmentScreen
import com.sdds.playground.sandbox.spinner.SpinnerScreen
import com.sdds.playground.sandbox.switcher.compose.SwitchScreen
import com.sdds.playground.sandbox.textfield.compose.TextFieldScreen
import com.sdds.playground.sandbox.toast.compose.ToastScreen
import com.sdds.playground.sandbox.tooltip.compose.TooltipScreen

/**
 *
 * @author Малышев Александр on 25.02.2025
 */
internal class MenuItem(
    val title: String,
    val componentKey: ComponentKey,
    val destination: ComponentScreen,
) {

    val route: String = componentKey.value
}

internal fun ComponentsProviderCompose.getMenuItems(): List<MenuItem> {
    return all.map { (key, value) ->
        MenuItem(value.name, key, key.core.screen())
    }.sortedBy { it.title }
}

internal sealed class ComponentScreen(
    val composeScreen: @Composable (ComponentKey) -> Unit,
) {
    object Avatar : ComponentScreen({ AvatarScreen(it) })

    object AvatarGroup : ComponentScreen({ AvatarGroupScreen(it) })
    object Buttons : ComponentScreen({ BasicButtonScreen(it) })
    object Badge : ComponentScreen({ BadgeScreen(it) })
    object IconButtons : ComponentScreen({ IconButtonScreen(it) })
    object IconBadge : ComponentScreen({ IconBadgeScreen(it) })
    object BottomSheet : ComponentScreen({ BottomSheetScreen(it) })
    object LinkButtons : ComponentScreen({ LinkButtonScreen(it) })
    object Cell : ComponentScreen({ CellScreen(it) })
    object Card : ComponentScreen({ CardScreen(it) })
    object CheckBox : ComponentScreen({ CheckBoxScreen(it) })
    object CheckBoxGroup : ComponentScreen({ CheckBoxGroupScreen(it) })
    object RadioBox : ComponentScreen({ RadioBoxScreen(it) })
    object RadioBoxGroup : ComponentScreen({ RadioBoxGroupScreen(it) })
    object Switch : ComponentScreen({ SwitchScreen(it) })
    object Progress : ComponentScreen({ ProgressScreen(it) })
    object CircularProgress : ComponentScreen({ CircularProgressScreen(it) })
    object TextField : ComponentScreen({ TextFieldScreen(it) })

    object TextArea : ComponentScreen({ TextFieldScreen(it) })

    object Chip : ComponentScreen({ ChipScreen(it) })
    object ChipGroup : ComponentScreen({ ChipGroupScreen(it) })
    object Indicator : ComponentScreen({ IndicatorScreen(it) })
    object Counter : ComponentScreen({ CounterScreen(it) })
    object SegmentItem : ComponentScreen({ SegmentItemScreen(it) })
    object Segment : ComponentScreen({ SegmentScreen(it) })
    object Divider : ComponentScreen({ DividerScreen(it) })
    object Overlay : ComponentScreen({ OverlayScreen(it) })
    object Popover : ComponentScreen({ PopoverScreen(it) })
    object Tooltip : ComponentScreen({ TooltipScreen(it) })
    object Toast : ComponentScreen({ ToastScreen(it) })
    object Modal : ComponentScreen({ ModalScreen(it) })
    object Notification : ComponentScreen({ NotificationScreen(it) })
    object RectSkeleton : ComponentScreen({ RectSkeletonScreen(it) })
    object Spinner : ComponentScreen({ SpinnerScreen(it) })

    object Empty : ComponentScreen({})
}

@Suppress("CyclomaticComplexMethod")
private fun CoreComponent.screen(): ComponentScreen {
    return when (this) {
        CoreComponent.AVATAR -> ComponentScreen.Avatar
        CoreComponent.AVATAR_GROUP -> ComponentScreen.AvatarGroup
        CoreComponent.BADGE -> ComponentScreen.Badge
        CoreComponent.ICON_BADGE -> ComponentScreen.IconBadge
        CoreComponent.BOTTOMSHEET -> ComponentScreen.BottomSheet
        CoreComponent.BASIC_BUTTON -> ComponentScreen.Buttons
        CoreComponent.ICON_BUTTON -> ComponentScreen.IconButtons
        CoreComponent.LINK_BUTTON -> ComponentScreen.LinkButtons
        CoreComponent.CARD -> ComponentScreen.Card
        CoreComponent.CELL -> ComponentScreen.Cell
        CoreComponent.CHECKBOX -> ComponentScreen.CheckBox
        CoreComponent.CHECKBOX_GROUP -> ComponentScreen.CheckBoxGroup
        CoreComponent.CHIP -> ComponentScreen.Chip
        CoreComponent.CHIP_GROUP -> ComponentScreen.ChipGroup
        CoreComponent.INDICATOR -> ComponentScreen.Indicator
        CoreComponent.COUNTER -> ComponentScreen.Counter
        CoreComponent.PROGRESS -> ComponentScreen.Progress
        CoreComponent.CIRCULAR_PROGRESS -> ComponentScreen.CircularProgress
        CoreComponent.RADIOBOX -> ComponentScreen.RadioBox
        CoreComponent.RADIOBOX_GROUP -> ComponentScreen.RadioBoxGroup
        CoreComponent.SWITCH -> ComponentScreen.Switch
        CoreComponent.TEXT_FIELD -> ComponentScreen.TextField
        CoreComponent.TEXT_AREA -> ComponentScreen.TextArea
        CoreComponent.SEGMENT_ITEM -> ComponentScreen.SegmentItem
        CoreComponent.SEGMENT -> ComponentScreen.Segment
        CoreComponent.DIVIDER -> ComponentScreen.Divider
        CoreComponent.OVERLAY -> ComponentScreen.Overlay
        CoreComponent.POPOVER -> ComponentScreen.Popover
        CoreComponent.TOOLTIP -> ComponentScreen.Tooltip
        CoreComponent.TOAST -> ComponentScreen.Toast
        CoreComponent.MODAL -> ComponentScreen.Modal
        CoreComponent.NOTIFICATION -> ComponentScreen.Notification
        CoreComponent.RECT_SKELETON -> ComponentScreen.RectSkeleton
        CoreComponent.SPINNER -> ComponentScreen.Spinner
        else -> ComponentScreen.Empty
    }
}
