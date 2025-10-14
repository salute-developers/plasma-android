package com.sdds.playground.sandbox.core.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AccordionStyle
import com.sdds.compose.uikit.AvatarGroupStyle
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.CheckBoxGroupStyle
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.CircularProgressBarStyle
import com.sdds.compose.uikit.CodeFieldStyle
import com.sdds.compose.uikit.CodeInputStyle
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.DividerStyle
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.ImageStyle
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.LoaderStyle
import com.sdds.compose.uikit.ModalBottomSheetStyle
import com.sdds.compose.uikit.ModalStyle
import com.sdds.compose.uikit.NotificationContentStyle
import com.sdds.compose.uikit.NotificationStyle
import com.sdds.compose.uikit.OverlayStyle
import com.sdds.compose.uikit.PopoverStyle
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.RectSkeletonStyle
import com.sdds.compose.uikit.ScrollBarStyle
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.compose.uikit.SegmentStyle
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.compose.uikit.ToastStyle
import com.sdds.compose.uikit.TooltipStyle
import com.sdds.compose.uikit.WheelStyle
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.accordion.AccordionPreview
import com.sdds.playground.sandbox.accordion.AccordionScreen
import com.sdds.playground.sandbox.avatar.compose.AvatarScreen
import com.sdds.playground.sandbox.avatar.compose.group.AvatarGroupScreen
import com.sdds.playground.sandbox.badge.compose.BadgeScreen
import com.sdds.playground.sandbox.badge.compose.IconBadgeScreen
import com.sdds.playground.sandbox.bottomsheet.compose.BottomSheetScreen
import com.sdds.playground.sandbox.buttongroup.compose.ButtonGroupPreview
import com.sdds.playground.sandbox.buttongroup.compose.ButtonGroupScreen
import com.sdds.playground.sandbox.buttons.compose.BasicButtonScreen
import com.sdds.playground.sandbox.buttons.compose.IconButtonScreen
import com.sdds.playground.sandbox.buttons.compose.LinkButtonScreen
import com.sdds.playground.sandbox.card.compose.CardScreen
import com.sdds.playground.sandbox.cell.compose.CellScreen
import com.sdds.playground.sandbox.checkbox.compose.CheckBoxScreen
import com.sdds.playground.sandbox.checkbox.compose.group.CheckBoxGroupScreen
import com.sdds.playground.sandbox.chip.compose.ChipScreen
import com.sdds.playground.sandbox.chip.compose.group.ChipGroupScreen
import com.sdds.playground.sandbox.codefield.compose.CodeFieldPreview
import com.sdds.playground.sandbox.codefield.compose.CodeFieldScreen
import com.sdds.playground.sandbox.codeinput.compose.CodeInputPreview
import com.sdds.playground.sandbox.codeinput.compose.CodeInputScreen
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderCompose
import com.sdds.playground.sandbox.core.integration.component.CoreComponent
import com.sdds.playground.sandbox.counter.compose.CounterScreen
import com.sdds.playground.sandbox.divider.compose.DividerScreen
import com.sdds.playground.sandbox.drawer.compose.DrawerPreview
import com.sdds.playground.sandbox.drawer.compose.DrawerScreen
import com.sdds.playground.sandbox.dropdownmenu.compose.DropdownMenuPreview
import com.sdds.playground.sandbox.dropdownmenu.compose.DropdownMenuScreen
import com.sdds.playground.sandbox.image.compose.ImageScreen
import com.sdds.playground.sandbox.image.compose.ImageScreenPreview
import com.sdds.playground.sandbox.indicator.compose.IndicatorScreen
import com.sdds.playground.sandbox.list.compose.ListScreen
import com.sdds.playground.sandbox.loader.compose.LoaderScreen
import com.sdds.playground.sandbox.modal.compose.ModalScreen
import com.sdds.playground.sandbox.notification.compose.NotificationScreen
import com.sdds.playground.sandbox.notificationcontent.compose.NotificationContentPreview
import com.sdds.playground.sandbox.notificationcontent.compose.NotificationContentScreen
import com.sdds.playground.sandbox.overlay.compose.OverlayScreen
import com.sdds.playground.sandbox.popover.compose.PopoverScreen
import com.sdds.playground.sandbox.progress.compose.CircularProgressScreen
import com.sdds.playground.sandbox.progress.compose.ProgressScreen
import com.sdds.playground.sandbox.radiobox.compose.RadioBoxScreen
import com.sdds.playground.sandbox.radiobox.compose.group.RadioBoxGroupScreen
import com.sdds.playground.sandbox.rectskeleton.compose.RectSkeletonScreen
import com.sdds.playground.sandbox.scrollbar.compose.ScrollBarPreview
import com.sdds.playground.sandbox.scrollbar.compose.ScrollBarScreen
import com.sdds.playground.sandbox.segment.compose.SegmentItemScreen
import com.sdds.playground.sandbox.segment.compose.SegmentScreen
import com.sdds.playground.sandbox.spinner.compose.SpinnerScreen
import com.sdds.playground.sandbox.switcher.compose.SwitchScreen
import com.sdds.playground.sandbox.tabbar.compose.TabBarPreview
import com.sdds.playground.sandbox.tabbar.compose.TabBarScreen
import com.sdds.playground.sandbox.textfield.compose.TextFieldScreen
import com.sdds.playground.sandbox.textskeleton.compose.TextSkeletonPreview
import com.sdds.playground.sandbox.textskeleton.compose.TextSkeletonScreen
import com.sdds.playground.sandbox.toast.compose.ToastScreen
import com.sdds.playground.sandbox.tooltip.compose.TooltipScreen
import com.sdds.playground.sandbox.wheel.compose.WheelPreview
import com.sdds.playground.sandbox.wheel.compose.WheelScreen
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.S
import com.sdds.serv.styles.iconbutton.IconButton
import com.sdds.serv.styles.iconbutton.S
import com.sdds.testing.compose.avatar.AvatarGroupSizeS
import com.sdds.testing.compose.avatar.AvatarSizeM
import com.sdds.testing.compose.badge.BadgeSizeLDefaultContentLeft
import com.sdds.testing.compose.badge.IconBadgeCommon
import com.sdds.testing.compose.bottomsheet.BottomSheetForSandbox
import com.sdds.testing.compose.button.ButtonSizeLSecondary
import com.sdds.testing.compose.button.IconButtonLDefault
import com.sdds.testing.compose.button.LinkButtonSizeLDefault
import com.sdds.testing.compose.card.CardVertical
import com.sdds.testing.compose.cell.CellMAvatarIcon
import com.sdds.testing.compose.checkbox.CheckBoxGroupSizeM
import com.sdds.testing.compose.checkbox.CheckBoxSizeM
import com.sdds.testing.compose.chip.ChipGroupSizeLDense
import com.sdds.testing.compose.chip.ChipSizeLDefault
import com.sdds.testing.compose.counter.CounterCommon
import com.sdds.testing.compose.divider.DividerDefault
import com.sdds.testing.compose.indicator.IndicatorCommon
import com.sdds.testing.compose.list.ListForSandbox
import com.sdds.testing.compose.loader.LoaderForSandbox
import com.sdds.testing.compose.modal.ModalForSandboxCompose
import com.sdds.testing.compose.notification.NotificationForSandbox
import com.sdds.testing.compose.overlay.OverlayForSandbox
import com.sdds.testing.compose.popover.PopoverForSandbox
import com.sdds.testing.compose.progress.CircularProgress
import com.sdds.testing.compose.progress.ProgressBarDefault
import com.sdds.testing.compose.radiobox.RadioBoxGroupSizeM
import com.sdds.testing.compose.radiobox.RadioBoxSizeM
import com.sdds.testing.compose.rectskeleton.RectSkeletonForSandbox
import com.sdds.testing.compose.segment.SegmentItemSizeMSecondaryPilled
import com.sdds.testing.compose.segment.SegmentSizeLCounter
import com.sdds.testing.compose.spinner.SpinnerTest
import com.sdds.testing.compose.switcher.SwitchS
import com.sdds.testing.compose.textarea.TextAreaLDefaultTBTA
import com.sdds.testing.compose.textfield.TextFieldLDefaultInnerLeft
import com.sdds.testing.compose.toast.ToastForSandbox
import com.sdds.testing.compose.tooltip.TooltipForSandbox

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
    return all.mapNotNull { (key, value) ->
        val screen = key.core.screen().takeIf { it !is ComponentScreen.Empty } ?: return@mapNotNull null
        MenuItem(value.name, key, screen)
    }.sortedWith(
        compareBy(
            { it.componentKey.group.ordinal },
            { it.title },
        ),
    )
}

internal sealed class ComponentScreen(
    val composeScreen: @Composable (ComponentKey) -> Unit,
    val preview: (@Composable (Style, ComponentKey) -> Unit)? = null,
) {
    object Avatar : ComponentScreen({ AvatarScreen(it) }, { it, _ -> AvatarSizeM(it as AvatarStyle) })
    object AvatarGroup : ComponentScreen(
        { AvatarGroupScreen(it) },
        { it, _ -> AvatarGroupSizeS(it as AvatarGroupStyle) },
    )
    object Buttons : ComponentScreen({ BasicButtonScreen(it) }, { it, _ -> ButtonSizeLSecondary(it as ButtonStyle) })
    object Badge : ComponentScreen({ BadgeScreen(it) }, { it, _ -> BadgeSizeLDefaultContentLeft(it as BadgeStyle) })
    object IconButtons : ComponentScreen({ IconButtonScreen(it) }, { it, _ -> IconButtonLDefault(it as ButtonStyle) })
    object IconBadge : ComponentScreen({ IconBadgeScreen(it) }, { it, _ -> IconBadgeCommon(it as BadgeStyle) })
    object BottomSheet : ComponentScreen(
        { BottomSheetScreen(it) },
        { it, _ -> BottomSheetForSandbox(it as ModalBottomSheetStyle) },
    )

    object LinkButtons : ComponentScreen(
        { LinkButtonScreen(it) },
        { it, _ -> LinkButtonSizeLDefault(it as ButtonStyle) },
    )
    object Cell : ComponentScreen({ CellScreen(it) }, { it, _ -> CellMAvatarIcon(it as CellStyle) })
    object Card : ComponentScreen({ CardScreen(it) }, { it, _ -> CardVertical(it as CardStyle) })
    object CheckBox : ComponentScreen({ CheckBoxScreen(it) }, { it, _ -> CheckBoxSizeM(it as CheckBoxStyle) })
    object CheckBoxGroup :
        ComponentScreen({ CheckBoxGroupScreen(it) }, { it, _ -> CheckBoxGroupSizeM(it as CheckBoxGroupStyle) })

    object RadioBox : ComponentScreen({ RadioBoxScreen(it) }, { it, _ -> RadioBoxSizeM(it as RadioBoxStyle) })
    object RadioBoxGroup :
        ComponentScreen({ RadioBoxGroupScreen(it) }, { it, _ -> RadioBoxGroupSizeM(it as RadioBoxGroupStyle) })

    object Switch : ComponentScreen({ SwitchScreen(it) }, { it, _ -> SwitchS(it as SwitchStyle) })
    object Progress : ComponentScreen({ ProgressScreen(it) }, { it, _ -> ProgressBarDefault(it as ProgressBarStyle) })
    object CircularProgress :
        ComponentScreen({ CircularProgressScreen(it) }, { it, _ -> CircularProgress(it as CircularProgressBarStyle) })

    object TextField : ComponentScreen(
        { TextFieldScreen(it) },
        { it, _ -> TextFieldLDefaultInnerLeft(it as TextFieldStyle) },
    )
    object TextArea : ComponentScreen(
        { TextFieldScreen(it) },
        { it, _ -> TextAreaLDefaultTBTA(it as TextFieldStyle) },
    )

    object Chip : ComponentScreen({ ChipScreen(it) }, { it, _ -> ChipSizeLDefault(it as ChipStyle) })
    object ChipGroup : ComponentScreen({ ChipGroupScreen(it) }, { it, _ -> ChipGroupSizeLDense(it as ChipGroupStyle) })
    object Indicator : ComponentScreen({ IndicatorScreen(it) }, { it, _ -> IndicatorCommon(it as IndicatorStyle) })
    object Counter : ComponentScreen({ CounterScreen(it) }, { it, _ -> CounterCommon(it as CounterStyle) })
    object SegmentItem :
        ComponentScreen({ SegmentItemScreen(it) }, { it, _ -> SegmentItemSizeMSecondaryPilled(it as SegmentItemStyle) })

    object Segment : ComponentScreen({ SegmentScreen(it) }, { it, _ -> SegmentSizeLCounter(it as SegmentStyle) })
    object Divider : ComponentScreen({ DividerScreen(it) }, { it, _ -> DividerDefault(it as DividerStyle) })
    object Overlay : ComponentScreen(
        { OverlayScreen(it) },
        { it, _ -> OverlayForSandbox(it as OverlayStyle, IconButton.S.style()) },
    )

    object Popover : ComponentScreen(
        { PopoverScreen(it) },
        { it, _ -> PopoverForSandbox(it as PopoverStyle, BasicButton.S.Default.style()) },
    )

    object Tooltip : ComponentScreen({ TooltipScreen(it) }, { it, _ -> TooltipForSandbox(it as TooltipStyle) })
    object Toast : ComponentScreen({ ToastScreen(it) }, { it, _ -> ToastForSandbox(it as ToastStyle) })
    object Modal : ComponentScreen({ ModalScreen(it) }, { it, _ -> ModalForSandboxCompose(it as ModalStyle) })
    object Notification : ComponentScreen(
        { NotificationScreen(it) },
        { it, _ -> NotificationForSandbox(it as NotificationStyle) },
    )

    object NotificationContent : ComponentScreen(
        { NotificationContentScreen(it) },
        { it, _ -> NotificationContentPreview(it as NotificationContentStyle) },
    )

    object RectSkeleton : ComponentScreen(
        { RectSkeletonScreen(it) },
        { it, _ -> RectSkeletonForSandbox(it as RectSkeletonStyle) },
    )
    object TextSkeleton : ComponentScreen(
        { TextSkeletonScreen(it) },
        { it, _ -> TextSkeletonPreview(it as TextSkeletonStyle) },
    )

    object Spinner : ComponentScreen({ SpinnerScreen(it) }, { it, _ -> SpinnerTest(it as SpinnerStyle) })
    object List : ComponentScreen({ ListScreen(it) }, { it, _ -> ListForSandbox(it as ListStyle) })
    object DropdownMenu : ComponentScreen(
        { DropdownMenuScreen(it) },
        { it, _ -> DropdownMenuPreview(it as DropdownMenuStyle) },
    )
    object Accordion : ComponentScreen(
        { AccordionScreen(it) },
        { it, _ -> AccordionPreview(it as AccordionStyle) },
    )
    object ScrollBar : ComponentScreen(
        { ScrollBarScreen(it) },
        { it, _ -> ScrollBarPreview(it as ScrollBarStyle) },
    )
    object Image : ComponentScreen(
        { ImageScreen(it) },
        { it, _ -> ImageScreenPreview(it as ImageStyle) },
    )
    object ButtonGroup : ComponentScreen(
        { ButtonGroupScreen(it) },
        { style, key -> ButtonGroupPreview(style as ButtonGroupStyle, key) },
    )
    object TabBar : ComponentScreen(
        { TabBarScreen(it) },
        { style, _ -> TabBarPreview(style as TabBarStyle) },
    )
    object Loader : ComponentScreen(
        { LoaderScreen(it) },
        { style, _ -> LoaderForSandbox(style as LoaderStyle) },
    )
    object CodeInput : ComponentScreen(
        { CodeInputScreen(it) },
        { style, _ -> CodeInputPreview(style as CodeInputStyle) },
    )
    object CodeField : ComponentScreen(
        { CodeFieldScreen(it) },
        { style, _ -> CodeFieldPreview(style as CodeFieldStyle) },
    )

    object Drawer : ComponentScreen(
        { DrawerScreen(it) },
        { style, _ -> DrawerPreview(style as DrawerStyle) },
    )

    object Wheel : ComponentScreen(
        { WheelScreen(it) },
        { style, _ -> WheelPreview(style as WheelStyle) },
    )
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
        CoreComponent.NOTIFICATION_CONTENT -> ComponentScreen.NotificationContent
        CoreComponent.RECT_SKELETON -> ComponentScreen.RectSkeleton
        CoreComponent.TEXT_SKELETON -> ComponentScreen.TextSkeleton
        CoreComponent.SPINNER -> ComponentScreen.Spinner
        CoreComponent.LIST -> ComponentScreen.List
        CoreComponent.DROPDOWN_MENU -> ComponentScreen.DropdownMenu
        CoreComponent.ACCORDION -> ComponentScreen.Accordion
        CoreComponent.SCROLL_BAR -> ComponentScreen.ScrollBar
        CoreComponent.IMAGE -> ComponentScreen.Image
        CoreComponent.BUTTON_GROUP -> ComponentScreen.ButtonGroup
        CoreComponent.TAB_BAR -> ComponentScreen.TabBar
        CoreComponent.LOADER -> ComponentScreen.Loader
        CoreComponent.CODE_INPUT -> ComponentScreen.CodeInput
        CoreComponent.CODE_FIELD -> ComponentScreen.CodeField
        CoreComponent.DRAWER -> ComponentScreen.Drawer
        CoreComponent.WHEEL -> ComponentScreen.Wheel
        else -> ComponentScreen.Empty
    }
}
