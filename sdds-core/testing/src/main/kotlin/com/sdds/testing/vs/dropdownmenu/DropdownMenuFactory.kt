package com.sdds.testing.vs.dropdownmenu

import android.content.Context
import android.view.View
import androidx.annotation.StyleRes
import com.sdds.testing.R
import com.sdds.testing.vs.button.basicButton
import com.sdds.testing.vs.popover.PopoverTrigger
import com.sdds.testing.vs.popover.toAlignment
import com.sdds.testing.vs.popover.toPlacement
import com.sdds.testing.vs.popover.toPlacementMode
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.DropdownMenu
import com.sdds.uikit.ListItem
import com.sdds.uikit.SimpleListViewAdapter
import com.sdds.uikit.colorstate.ColorState

/**
 * Создает [DropdownMenu]
 * @param context контекст
 * @param style стиль
 * @param state состояние
 */
fun dropdownMenu(
    context: Context,
    @StyleRes style: Int? = null,
    state: DropdownMenuUiState = DropdownMenuUiState(),
    colorState: ColorState? = null,
): DropdownMenu {
    return DropdownMenu(context.styleWrapper(style))
        .apply {
            itemAdapter = SimpleListViewAdapter()
            itemListView.itemAnimator = null
        }
        .applyState(state, colorState)
}

/**
 * Создает [PopoverTrigger] с [DropdownMenu]
 * @param context контекст
 * @param style стиль
 * @param state состояние
 */
fun dropdownMenuTrigger(
    context: Context,
    @StyleRes style: Int? = null,
    state: DropdownMenuUiState = DropdownMenuUiState(),
    colorState: ColorState? = null,
): PopoverTrigger<DropdownMenu> {
    val dropdown = dropdownMenu(context, style, state)
    val trigger = basicButton(context).apply {
        id = R.id.dropdown_menu_trigger
        text = "Show DropdownMenu"
        setOnClickListener { dropdown.showWithState(it, state, colorState) }
    }
    return PopoverTrigger(dropdown, trigger)
}

/**
 * Отображает [DropdownMenu] рядом с [trigger]
 */
fun DropdownMenu.showWithState(
    trigger: View,
    state: DropdownMenuUiState,
    colorState: ColorState? = null,
) {
    applyState(state, colorState)
    showWithTrigger(
        trigger = trigger,
        placement = state.placement.toPlacement(),
        placementMode = state.placementMode.toPlacementMode(),
        alignment = state.alignment.toAlignment(),
    )
}

/**
 * Применяет [DropdownMenuUiState] к [DropdownMenu]
 */
fun DropdownMenu.applyState(state: DropdownMenuUiState, colorState: ColorState?): DropdownMenu = apply {
    itemDividerEnabled = state.itemDividerEnabled
    setItems<SimpleListViewAdapter>(
        mutableListOf<ListItem>().apply {
            repeat(state.amount) {
                add(
                    ListItem.simpleItem(
                        id = it.toLong(),
                        title = state.itemTitle,
                        hasDisclosure = state.hasDisclosure,
                        colorState = colorState,
                    ),
                )
            }
        },
    )
}
