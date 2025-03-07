package com.sdds.playground.sandbox.core.vs

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.fragment.FragmentNavigatorDestinationBuilder
import androidx.navigation.fragment.fragment
import androidx.navigation.navArgument
import com.sdds.playground.sandbox.Theme
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
import com.sdds.playground.sandbox.indicator.vs.IndicatorFragment
import com.sdds.playground.sandbox.progress.vs.ProgressBarFragment
import com.sdds.playground.sandbox.radiobox.vs.RadioBoxFragment
import com.sdds.playground.sandbox.radiobox.vs.group.RadioBoxGroupFragment
import com.sdds.playground.sandbox.switcher.vs.SwitchFragment
import com.sdds.playground.sandbox.textfield.vs.TextAreaFragment
import com.sdds.playground.sandbox.textfield.vs.TextFieldFragment
import kotlinx.serialization.Serializable

/**
 *
 * @author Малышев Александр on 25.02.2025
 */
internal class MenuItem(
    val id: Int,
    val title: String,
    val componentKey: ComponentKey,
    val destination: ComponentScreen,
) {

    val componentKeyBundle by lazy {
        bundleOf(ComponentFragment.COMPONENT_KEY_ARG to componentKey)
    }
}

internal fun ComponentsProviderView.getMenuItems(): List<MenuItem> {
    return all.toList().mapIndexed { index, (item, value) ->
        MenuItem(View.generateViewId(), value.name, item, item.core.screen())
    }
}

@Serializable
internal sealed class Route {
    @Serializable
    object Avatar : Route()

    @Serializable
    object AvatarGroup : Route()

    @Serializable
    object Buttons : Route()

    @Serializable
    object Badge : Route()

    @Serializable
    object IconButtons : Route()

    @Serializable
    object IconBadge : Route()

    @Serializable
    object LinkButtons : Route()

    @Serializable
    object Cell : Route()

    @Serializable
    object CheckBox : Route()

    @Serializable
    object CheckBoxGroup : Route()

    @Serializable
    object RadioBox : Route()

    @Serializable
    object RadioBoxGroup : Route()

    @Serializable
    object Switch : Route()

    @Serializable
    object Progress : Route()

    @Serializable
    object TextField : Route()

    @Serializable
    object TextArea : Route()

    @Serializable
    object Chip : Route()

    @Serializable
    object ChipGroup : Route()

    @Serializable
    object Indicator : Route()
}

private val MenuItem.defaultBuilder: FragmentNavigatorDestinationBuilder.() -> Unit
    get() = {
        label = title
//        navArgument(ComponentFragment.COMPONENT_KEY_ARG) {
//            type = NavType.ParcelableType(ComponentKey::class.java)
//        }
    }

internal sealed class ComponentScreen(
    val builder: NavGraphBuilder.(MenuItem) -> Unit,
) {
    object Avatar : ComponentScreen(
        { item -> fragment<AvatarFragment>(item.id, item.defaultBuilder) }
    )

    object AvatarGroup : ComponentScreen(
        { item -> fragment<AvatarGroupFragment>(item.id, item.defaultBuilder) }
    )

    object Buttons : ComponentScreen(
        { item -> fragment<BasicButtonFragment>(item.id, item.defaultBuilder) }
    )

    object IconButtons : ComponentScreen(
        { item -> fragment<IconButtonFragment>(item.id, item.defaultBuilder) }
    )

    object Badge : ComponentScreen(
        { item -> fragment<BadgeFragment>(item.id, item.defaultBuilder) }
    )

    object IconBadge : ComponentScreen(
        { item -> fragment<IconBadgeFragment>(item.id, item.defaultBuilder) }
    )

    object LinkButtons : ComponentScreen(
        { item -> fragment<LinkButtonFragment>(item.id, item.defaultBuilder) }
    )

    object Cell : ComponentScreen(
        { item -> fragment<CellFragment>(item.id, item.defaultBuilder) }
    )

    object CheckBox : ComponentScreen(
        { item -> fragment<CheckBoxFragment>(item.id, item.defaultBuilder) }
    )

    object CheckBoxGroup : ComponentScreen(
        { item -> fragment<CheckBoxGroupFragment>(item.id, item.defaultBuilder) }
    )

    object RadioBox : ComponentScreen(
        { item -> fragment<RadioBoxFragment>(item.id, item.defaultBuilder) }
    )

    object RadioBoxGroup : ComponentScreen(
        { item -> fragment<RadioBoxGroupFragment>(item.id, item.defaultBuilder) }
    )

    object Switch : ComponentScreen(
        { item -> fragment<SwitchFragment>(item.id, item.defaultBuilder) }
    )

    object Progress : ComponentScreen(
        { item -> fragment<ProgressBarFragment>(item.id, item.defaultBuilder) }
    )

    object TextField : ComponentScreen(
        { item -> fragment<TextFieldFragment>(item.id, item.defaultBuilder) }
    )

    object TextArea : ComponentScreen(
        { item -> fragment<TextAreaFragment>(item.id, item.defaultBuilder) }
    )

    object Chip : ComponentScreen(
        { item -> fragment<ChipFragment>(item.id, item.defaultBuilder) }
    )

    object ChipGroup : ComponentScreen(
        { item -> fragment<ChipGroupFragment>(item.id, item.defaultBuilder) }
    )

    object Indicator : ComponentScreen(
        { item -> fragment<IndicatorFragment>(item.id, item.defaultBuilder) }
    )

    object Empty : ComponentScreen({})
}

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
        CoreComponent.INDICATOR -> ComponentScreen.Indicator
        CoreComponent.PROGRESS -> ComponentScreen.Progress
        CoreComponent.RADIOBOX -> ComponentScreen.RadioBox
        CoreComponent.RADIOBOX_GROUP -> ComponentScreen.RadioBoxGroup
        CoreComponent.SWITCH -> ComponentScreen.Switch
        CoreComponent.TEXT_FIELD -> ComponentScreen.TextField
        CoreComponent.TEXT_AREA -> ComponentScreen.TextArea
        else -> ComponentScreen.Empty
    }
}
