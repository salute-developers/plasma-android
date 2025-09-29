package com.sdds.playground.sandbox.dropdownmenu.compose

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Divider
import com.sdds.compose.uikit.DropdownMenu
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.List
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.popoverTrigger
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.popover.compose.toAlignment

/**
 * Экран с компонентом [DropdownMenu]
 */
@Composable
internal fun DropdownMenuScreen(componentKey: ComponentKey = ComponentKey.DropdownMenu) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<DropdownMenuViewModel>(
            factory = DropdownMenuViewModelFactory(
                defaultState = DropdownMenuUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        componentAlignment = { dropdownMenuUiState -> dropdownMenuUiState.triggerPlacement.toAlignment() },
        component = { dropdownMenuUiState, style ->
            val showDropdownMenu = remember { mutableStateOf(false) }
            val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
            Button(
                modifier = Modifier.popoverTrigger(triggerInfo),
                label = "show",
                onClick = { showDropdownMenu.value = true },
            )
            DropdownMenu(
                opened = showDropdownMenu.value,
                onDismissRequest = {
                    showDropdownMenu.value = false
                },
                triggerInfo = triggerInfo.value,
                placement = dropdownMenuUiState.placement,
                placementMode = dropdownMenuUiState.placementMode,
                alignment = dropdownMenuUiState.alignment,
                style = style,
            ) {
                List(
                    modifier = Modifier
                        .widthIn(0.dp, 200.dp)
                        .heightIn(0.dp, 300.dp),
                ) {
                    items(dropdownMenuUiState.amount) {
                        val interactionSource = remember { MutableInteractionSource() }
                        ListItem(
                            modifier = Modifier
                                .focusable(interactionSource = interactionSource)
                                .fillMaxWidth(),
                            title = "${dropdownMenuUiState.itemTitle} $it",
                            disclosureEnabled = dropdownMenuUiState.hasDisclosure,
                            interactionSource = interactionSource,
                        )
                        if (dropdownMenuUiState.itemDividerEnabled && it != dropdownMenuUiState.amount - 1) {
                            Divider()
                        }
                    }
                }
            }
        },
    )
}

@Composable
internal fun DropdownMenuPreview(style: DropdownMenuStyle) {
    val showDropdownMenu = remember { mutableStateOf(false) }
    val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
    Button(
        modifier = Modifier.popoverTrigger(triggerInfo),
        label = "Show Dropdown",
        onClick = { showDropdownMenu.value = true },
    )
    DropdownMenu(
        opened = showDropdownMenu.value,
        onDismissRequest = {
            showDropdownMenu.value = false
        },
        placement = PopoverPlacement.Bottom,
        placementMode = PopoverPlacementMode.Strict,
        alignment = PopoverAlignment.Center,
        triggerInfo = triggerInfo.value,
        style = style,
    ) {
        List(modifier = Modifier.width(200.dp)) {
            items(3) {
                ListItem(
                    text = "Item Title $it",
                    disclosureEnabled = true,
                )
            }
        }
    }
}
