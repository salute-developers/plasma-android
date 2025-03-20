package com.sdds.playground.sandbox.core.vs

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
import com.sdds.playground.sandbox.cell.vs.CellFragment
import com.sdds.playground.sandbox.checkbox.vs.CheckBoxFragment
import com.sdds.playground.sandbox.checkbox.vs.group.CheckBoxGroupFragment
import com.sdds.playground.sandbox.chip.vs.ChipFragment
import com.sdds.playground.sandbox.chip.vs.group.ChipGroupFragment
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderView
import com.sdds.playground.sandbox.core.integration.component.CoreComponent
import com.sdds.playground.sandbox.counter.vs.CounterFragment
import com.sdds.playground.sandbox.divider.vs.DividerFragment
import com.sdds.playground.sandbox.flow.vs.FlowFragment
import com.sdds.playground.sandbox.indicator.vs.IndicatorFragment
import com.sdds.playground.sandbox.progress.vs.ProgressBarFragment
import com.sdds.playground.sandbox.radiobox.vs.RadioBoxFragment
import com.sdds.playground.sandbox.radiobox.vs.group.RadioBoxGroupFragment
import com.sdds.playground.sandbox.segment.vs.SegmentItemFragment
import com.sdds.playground.sandbox.segment.vs.group.SegmentFragment
import com.sdds.playground.sandbox.switcher.vs.SwitchFragment
import com.sdds.playground.sandbox.textfield.vs.TextAreaFragment
import com.sdds.playground.sandbox.textfield.vs.TextFieldFragment

internal class MenuItem(
    val id: Int,
    val title: String,
    val componentKey: ComponentKey,
    val destination: ComponentScreen,
) {

    val componentKeyBundle by lazy {
        bundleOf(ComponentFragment.COMPONENT_KEY_ARG to componentKey)
    }

    val route: Int = id
}

internal fun ComponentsProviderView.getMenuItems(): List<MenuItem> {
    return all.toList().mapIndexed { index, (item, value) ->
        MenuItem(item.routeId(), value.name, item, item.core.screen())
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
    object Divider : ComponentScreen(
        { item -> fragment<DividerFragment>(item.route, item.defaultBuilder) },
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
        CoreComponent.DIVIDER -> ComponentScreen.Divider
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
        CoreComponent.DIVIDER -> R.id.nav_divider
        else -> throw NoSuchElementException("Component not implemented")
    } + hashCode()
}
