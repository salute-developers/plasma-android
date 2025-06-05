package com.sdds.playground.sandbox.core.vs

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavGraphBuilder
import androidx.navigation.fragment.FragmentNavigatorDestinationBuilder
import androidx.navigation.fragment.fragment
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.avatar.vs.AvatarFragment
import com.sdds.playground.sandbox.avatar.vs.AvatarGroupFragment
import com.sdds.playground.sandbox.badge.vs.BadgeFragment
import com.sdds.playground.sandbox.badge.vs.IconBadgeFragment
import com.sdds.playground.sandbox.buttons.vs.BasicButtonFragment
import com.sdds.playground.sandbox.buttons.vs.IconButtonFragment
import com.sdds.playground.sandbox.buttons.vs.LinkButtonFragment
import com.sdds.playground.sandbox.card.vs.CardFragment
import com.sdds.playground.sandbox.cell.vs.CellFragment
import com.sdds.playground.sandbox.checkbox.vs.CheckBoxFragment
import com.sdds.playground.sandbox.checkbox.vs.group.CheckBoxGroupFragment
import com.sdds.playground.sandbox.chip.vs.ChipFragment
import com.sdds.playground.sandbox.chip.vs.group.ChipGroupFragment
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderView
import com.sdds.playground.sandbox.core.integration.component.CoreComponent
import com.sdds.playground.sandbox.counter.vs.CounterFragment
import com.sdds.playground.sandbox.divider.vs.DividerFragment
import com.sdds.playground.sandbox.flow.vs.FlowFragment
import com.sdds.playground.sandbox.indicator.vs.IndicatorFragment
import com.sdds.playground.sandbox.modal.vs.ModalFragment
import com.sdds.playground.sandbox.navigationdrawer.NavigationDrawerFragment
import com.sdds.playground.sandbox.notification.vs.NotificationFragment
import com.sdds.playground.sandbox.overlay.vs.OverlayFragment
import com.sdds.playground.sandbox.popover.vs.PopoverFragment
import com.sdds.playground.sandbox.progress.vs.CircularProgressBarFragment
import com.sdds.playground.sandbox.progress.vs.ProgressBarFragment
import com.sdds.playground.sandbox.radiobox.vs.RadioBoxFragment
import com.sdds.playground.sandbox.radiobox.vs.group.RadioBoxGroupFragment
import com.sdds.playground.sandbox.segment.vs.SegmentItemFragment
import com.sdds.playground.sandbox.segment.vs.group.SegmentFragment
import com.sdds.playground.sandbox.switcher.vs.SwitchFragment
import com.sdds.playground.sandbox.textfield.vs.TextAreaFragment
import com.sdds.playground.sandbox.textfield.vs.TextFieldFragment
import com.sdds.playground.sandbox.toast.vs.ToastFragment
import com.sdds.playground.sandbox.tooltip.vs.TooltipFragment
import com.sdds.testing.vs.avatar.AvatarUiState
import com.sdds.testing.vs.avatar.avatar
import com.sdds.testing.vs.avatar.avatarGroup
import com.sdds.testing.vs.badge.BadgeUiState
import com.sdds.testing.vs.badge.badge
import com.sdds.testing.vs.badge.iconBadge
import com.sdds.testing.vs.button.ButtonUiState
import com.sdds.testing.vs.button.basicButton
import com.sdds.testing.vs.button.iconButton
import com.sdds.testing.vs.button.linkButton
import com.sdds.testing.vs.card.CardUiState
import com.sdds.testing.vs.card.card
import com.sdds.testing.vs.cell.CellUiState
import com.sdds.testing.vs.cell.cellLayout
import com.sdds.testing.vs.checkbox.CheckBoxUiState
import com.sdds.testing.vs.checkbox.checkBox
import com.sdds.testing.vs.checkbox.checkBoxGroup
import com.sdds.testing.vs.chip.ChipUiState
import com.sdds.testing.vs.chip.chip
import com.sdds.testing.vs.chip.chipGroup
import com.sdds.testing.vs.counter.CounterUiState
import com.sdds.testing.vs.counter.counter
import com.sdds.testing.vs.divider.divider
import com.sdds.testing.vs.flow.FlowUiState
import com.sdds.testing.vs.flow.flowLayout
import com.sdds.testing.vs.indicator.indicator
import com.sdds.testing.vs.modal.modalTrigger
import com.sdds.testing.vs.navigationdrawer.NavigationDrawerUiState
import com.sdds.testing.vs.navigationdrawer.navigationDrawer
import com.sdds.testing.vs.notification.notificationTrigger
import com.sdds.testing.vs.overlay.overlayWithTrigger
import com.sdds.testing.vs.popover.popoverWithTrigger
import com.sdds.testing.vs.progress.CircularProgressUiState
import com.sdds.testing.vs.progress.ProgressUiState
import com.sdds.testing.vs.progress.circularProgressBar
import com.sdds.testing.vs.progress.progressBar
import com.sdds.testing.vs.radiobox.RadioBoxUiState
import com.sdds.testing.vs.radiobox.radioBox
import com.sdds.testing.vs.radiobox.radioBoxGroup
import com.sdds.testing.vs.segement.SegmentUiState
import com.sdds.testing.vs.segement.segment
import com.sdds.testing.vs.segement.segmentItem
import com.sdds.testing.vs.switcher.SwitchUiState
import com.sdds.testing.vs.switcher.switch
import com.sdds.testing.vs.textfield.TextFieldUiState
import com.sdds.testing.vs.textfield.textArea
import com.sdds.testing.vs.textfield.textField
import com.sdds.testing.vs.toast.toastTrigger
import com.sdds.testing.vs.tooltip.tooltipWithTrigger
import com.sdds.uikit.colorstate.ColorState

internal class MenuItem(
    val id: Int,
    val title: String,
    val componentKey: ComponentKey,
    val destination: ComponentScreen,
    val previewStyle: Int = 0,
    val previewColorState: ColorState? = null,
) {

    val componentKeyBundle by lazy {
        bundleOf(ComponentFragment.COMPONENT_KEY_ARG to componentKey)
    }

    val route: Int = id
}

@Suppress("UNCHECKED_CAST")
internal fun ComponentsProviderView.getMenuItems(): List<MenuItem> {
    return all.toList().mapIndexed { index, (item, value) ->
        val styleProvider = value.styleProvider as ViewStyleProvider<String>
        MenuItem(
            id = item.routeId(),
            title = value.name,
            componentKey = item,
            destination = item.core.screen(),
            previewStyle = styleProvider.styleRes(key = value.styleProvider.defaultVariant as String),
            previewColorState = if (value.styleProvider.hasColorVariations) {
                styleProvider.colorState(key = value.styleProvider.defaultColorVariant as String)
            } else {
                null
            },
        )
    }
}

private val MenuItem.defaultBuilder: FragmentNavigatorDestinationBuilder.() -> Unit
    get() = {
        label = title
    }

internal sealed class ComponentScreen(
    val builder: NavGraphBuilder.(MenuItem) -> Unit,
) {
    object Avatar : ComponentScreen(
        { item -> fragment<AvatarFragment>(item.route, item.defaultBuilder) },
    )

    object AvatarGroup : ComponentScreen(
        { item -> fragment<AvatarGroupFragment>(item.route, item.defaultBuilder) },
    )

    object Buttons : ComponentScreen(
        { item -> fragment<BasicButtonFragment>(item.route, item.defaultBuilder) },
    )

    object IconButtons : ComponentScreen(
        { item -> fragment<IconButtonFragment>(item.route, item.defaultBuilder) },
    )

    object Badge : ComponentScreen(
        { item -> fragment<BadgeFragment>(item.route, item.defaultBuilder) },
    )

    object IconBadge : ComponentScreen(
        { item -> fragment<IconBadgeFragment>(item.route, item.defaultBuilder) },
    )

    object LinkButtons : ComponentScreen(
        { item -> fragment<LinkButtonFragment>(item.route, item.defaultBuilder) },
    )

    object Cell : ComponentScreen(
        { item -> fragment<CellFragment>(item.route, item.defaultBuilder) },
    )

    object CheckBox : ComponentScreen(
        { item -> fragment<CheckBoxFragment>(item.route, item.defaultBuilder) },
    )

    object CheckBoxGroup : ComponentScreen(
        { item -> fragment<CheckBoxGroupFragment>(item.route, item.defaultBuilder) },
    )

    object RadioBox : ComponentScreen(
        { item -> fragment<RadioBoxFragment>(item.route, item.defaultBuilder) },
    )

    object RadioBoxGroup : ComponentScreen(
        { item -> fragment<RadioBoxGroupFragment>(item.route, item.defaultBuilder) },
    )

    object Switch : ComponentScreen(
        { item -> fragment<SwitchFragment>(item.route, item.defaultBuilder) },
    )

    object Progress : ComponentScreen(
        { item -> fragment<ProgressBarFragment>(item.route, item.defaultBuilder) },
    )

    object TextField : ComponentScreen(
        { item -> fragment<TextFieldFragment>(item.route, item.defaultBuilder) },
    )

    object TextArea : ComponentScreen(
        { item -> fragment<TextAreaFragment>(item.route, item.defaultBuilder) },
    )

    object Chip : ComponentScreen(
        { item -> fragment<ChipFragment>(item.route, item.defaultBuilder) },
    )

    object ChipGroup : ComponentScreen(
        { item -> fragment<ChipGroupFragment>(item.route, item.defaultBuilder) },
    )

    object Indicator : ComponentScreen(
        { item -> fragment<IndicatorFragment>(item.route, item.defaultBuilder) },
    )

    object Counter : ComponentScreen(
        { item -> fragment<CounterFragment>(item.route, item.defaultBuilder) },
    )

    object Segment : ComponentScreen(
        { item -> fragment<SegmentFragment>(item.route, item.defaultBuilder) },
    )

    object SegmentItem : ComponentScreen(
        { item -> fragment<SegmentItemFragment>(item.route, item.defaultBuilder) },
    )

    object Flow : ComponentScreen(
        { item -> fragment<FlowFragment>(item.route, item.defaultBuilder) },
    )

    object Card : ComponentScreen(
        { item -> fragment<CardFragment>(item.route, item.defaultBuilder) },
    )

    object Divider : ComponentScreen(
        { item -> fragment<DividerFragment>(item.route, item.defaultBuilder) },
    )

    object NavigationDrawer : ComponentScreen(
        { item -> fragment<NavigationDrawerFragment>(item.route, item.defaultBuilder) },
    )

    object CircularProgress : ComponentScreen(
        { item -> fragment<CircularProgressBarFragment>(item.route, item.defaultBuilder) },
    )

    object Popover : ComponentScreen(
        { item -> fragment<PopoverFragment>(item.route, item.defaultBuilder) },
    )

    object Tooltip : ComponentScreen(
        { item -> fragment<TooltipFragment>(item.route, item.defaultBuilder) },
    )

    object Overlay : ComponentScreen(
        { item -> fragment<OverlayFragment>(item.route, item.defaultBuilder) },
    )

    object Toast : ComponentScreen(
        { item -> fragment<ToastFragment>(item.route, item.defaultBuilder) },
    )
    object Modal : ComponentScreen(
        { item -> fragment<ModalFragment>(item.route, item.defaultBuilder) },
    )

    object Notification : ComponentScreen(
        { item -> fragment<NotificationFragment>(item.route, item.defaultBuilder) },
    )
}

@Suppress("CyclomaticComplexMethod")
private fun CoreComponent.screen(): ComponentScreen {
    return when (this) {
        CoreComponent.AVATAR -> ComponentScreen.Avatar
        CoreComponent.AVATAR_GROUP -> ComponentScreen.AvatarGroup
        CoreComponent.BADGE -> ComponentScreen.Badge
        CoreComponent.ICON_BADGE -> ComponentScreen.IconBadge
        CoreComponent.BASIC_BUTTON -> ComponentScreen.Buttons
        CoreComponent.ICON_BUTTON -> ComponentScreen.IconButtons
        CoreComponent.LINK_BUTTON -> ComponentScreen.LinkButtons
        CoreComponent.CELL -> ComponentScreen.Cell
        CoreComponent.CHECKBOX -> ComponentScreen.CheckBox
        CoreComponent.CHECKBOX_GROUP -> ComponentScreen.CheckBoxGroup
        CoreComponent.CHIP -> ComponentScreen.Chip
        CoreComponent.CHIP_GROUP -> ComponentScreen.ChipGroup
        CoreComponent.COUNTER -> ComponentScreen.Counter
        CoreComponent.INDICATOR -> ComponentScreen.Indicator
        CoreComponent.PROGRESS -> ComponentScreen.Progress
        CoreComponent.RADIOBOX -> ComponentScreen.RadioBox
        CoreComponent.RADIOBOX_GROUP -> ComponentScreen.RadioBoxGroup
        CoreComponent.SWITCH -> ComponentScreen.Switch
        CoreComponent.TEXT_FIELD -> ComponentScreen.TextField
        CoreComponent.TEXT_AREA -> ComponentScreen.TextArea
        CoreComponent.SEGMENT -> ComponentScreen.Segment
        CoreComponent.SEGMENT_ITEM -> ComponentScreen.SegmentItem
        CoreComponent.FLOW -> ComponentScreen.Flow
        CoreComponent.CARD -> ComponentScreen.Card
        CoreComponent.DIVIDER -> ComponentScreen.Divider
        CoreComponent.NAVIGATION_DRAWER -> ComponentScreen.NavigationDrawer
        CoreComponent.CIRCULAR_PROGRESS -> ComponentScreen.CircularProgress
        CoreComponent.POPOVER -> ComponentScreen.Popover
        CoreComponent.TOOLTIP -> ComponentScreen.Tooltip
        CoreComponent.OVERLAY -> ComponentScreen.Overlay
        CoreComponent.TOAST -> ComponentScreen.Toast
        CoreComponent.MODAL -> ComponentScreen.Modal
        CoreComponent.NOTIFICATION -> ComponentScreen.Notification
        else -> throw NoSuchElementException("Component not implemented")
    }
}

@Suppress("CyclomaticComplexMethod")
private fun ComponentKey.routeId(): Int {
    return when (this.core) {
        CoreComponent.AVATAR -> R.id.nav_avatar
        CoreComponent.AVATAR_GROUP -> R.id.nav_avatargroup
        CoreComponent.BADGE -> R.id.nav_badge
        CoreComponent.ICON_BADGE -> R.id.nav_icon_badge
        CoreComponent.BASIC_BUTTON -> R.id.nav_basic_button
        CoreComponent.ICON_BUTTON -> R.id.nav_icon_button
        CoreComponent.LINK_BUTTON -> R.id.nav_link_button
        CoreComponent.CELL -> R.id.nav_cell
        CoreComponent.CHECKBOX -> R.id.nav_checkbox
        CoreComponent.CHECKBOX_GROUP -> R.id.nav_checkbox_group
        CoreComponent.CHIP -> R.id.nav_chip
        CoreComponent.CHIP_GROUP -> R.id.nav_chip_group
        CoreComponent.COUNTER -> R.id.nav_counter
        CoreComponent.INDICATOR -> R.id.nav_indicator
        CoreComponent.PROGRESS -> R.id.nav_progressbar
        CoreComponent.RADIOBOX -> R.id.nav_radiobox
        CoreComponent.RADIOBOX_GROUP -> R.id.nav_radiobox_group
        CoreComponent.SWITCH -> R.id.nav_switch
        CoreComponent.TEXT_FIELD -> R.id.nav_textfield
        CoreComponent.TEXT_AREA -> R.id.nav_textarea
        CoreComponent.SEGMENT -> R.id.nav_segment
        CoreComponent.SEGMENT_ITEM -> R.id.nav_segment_item
        CoreComponent.FLOW -> R.id.nav_flow
        CoreComponent.CARD -> R.id.nav_card
        CoreComponent.DIVIDER -> R.id.nav_divider
        CoreComponent.NAVIGATION_DRAWER -> R.id.nav_navigation_drawer
        CoreComponent.CIRCULAR_PROGRESS -> R.id.nav_circular_progressbar
        CoreComponent.POPOVER -> R.id.nav_popover
        CoreComponent.TOOLTIP -> R.id.nav_tooltip
        CoreComponent.OVERLAY -> R.id.nav_overlay
        CoreComponent.TOAST -> R.id.nav_toast
        CoreComponent.MODAL -> R.id.nav_modal
        CoreComponent.NOTIFICATION -> R.id.nav_notification
        else -> throw NoSuchElementException("Component not implemented")
    } + hashCode()
}

@Suppress("CyclomaticComplexMethod", "LongMethod")
internal fun MenuItem.preview(context: Context, style: Int): View {
    return when (this.componentKey.core) {
        CoreComponent.AVATAR -> avatar(context, style, AvatarUiState())
        CoreComponent.AVATAR_GROUP -> avatarGroup(context, style, AvatarUiState())
        CoreComponent.BADGE -> badge(context, style, BadgeUiState())
        CoreComponent.ICON_BADGE -> iconBadge(context, style, BadgeUiState())
        CoreComponent.BASIC_BUTTON -> basicButton(context, style, ButtonUiState())
        CoreComponent.ICON_BUTTON -> iconButton(context, style, ButtonUiState())
        CoreComponent.LINK_BUTTON -> linkButton(context, style, ButtonUiState())
        CoreComponent.CELL -> cellLayout(context, style, CellUiState()).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
        }

        CoreComponent.CHECKBOX -> checkBox(context, style, CheckBoxUiState())
        CoreComponent.CHECKBOX_GROUP -> checkBoxGroup(context, style, CheckBoxUiState()).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
        }

        CoreComponent.CHIP -> chip(context, style, ChipUiState())
        CoreComponent.CHIP_GROUP -> chipGroup(context, style, state = ChipUiState(), colorState = previewColorState)
        CoreComponent.COUNTER -> counter(context, style, CounterUiState())
        CoreComponent.INDICATOR -> indicator(context, style)
        CoreComponent.PROGRESS -> progressBar(context, style, ProgressUiState()).apply {
            layoutParams?.height = context.resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_3x)
        }

        CoreComponent.RADIOBOX -> radioBox(context, style, RadioBoxUiState())
        CoreComponent.RADIOBOX_GROUP -> radioBoxGroup(context, style, RadioBoxUiState()).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
        }

        CoreComponent.SWITCH -> switch(context, style, SwitchUiState())
        CoreComponent.TEXT_FIELD -> textField(
            context,
            style,
            state = TextFieldUiState(),
            colorState = previewColorState,
        )

        CoreComponent.TEXT_AREA -> textArea(context, style, state = TextFieldUiState(), colorState = previewColorState)
        CoreComponent.SEGMENT -> segment(context, style, SegmentUiState())
        CoreComponent.SEGMENT_ITEM -> segmentItem(context, style, SegmentUiState())
        CoreComponent.FLOW -> flowLayout(context, style, FlowUiState()).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
        }

        CoreComponent.CARD -> card(context, style, CardUiState())
        CoreComponent.DIVIDER -> divider(context, style).apply {
            layoutParams = ViewGroup.LayoutParams(
                context.resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_108x),
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
        }

        CoreComponent.NAVIGATION_DRAWER -> navigationDrawer(context, style, NavigationDrawerUiState())
        CoreComponent.CIRCULAR_PROGRESS -> circularProgressBar(context, style, CircularProgressUiState())
        CoreComponent.POPOVER -> popoverWithTrigger(context, style).trigger
        CoreComponent.TOOLTIP -> tooltipWithTrigger(context, style).trigger
        CoreComponent.OVERLAY -> overlayWithTrigger(context, style)
        CoreComponent.TOAST -> toastTrigger(context, style)
        CoreComponent.MODAL -> modalTrigger(context, style)
        CoreComponent.NOTIFICATION -> notificationTrigger(context, style)
        else -> throw NoSuchElementException("Component not implemented")
    }
}
