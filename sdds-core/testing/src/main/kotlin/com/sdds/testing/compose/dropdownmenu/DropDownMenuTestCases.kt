package com.sdds.testing.compose.dropdownmenu

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.Divider
import com.sdds.compose.uikit.DropdownMenu
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.popoverTrigger

/**
 * Тест кейсы для DropDownMenu
 */

/**
 * PLASMA-T2081
 */
@Composable
fun DropDownMenuXlHasDisclosureTopStart(style: DropdownMenuStyle, buttonStyle: ButtonStyle) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showDropDownMenu = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(Alignment.TopStart)
                .popoverTrigger(triggerInfo),
            label = "Show DropDownMenu",
            onClick = { showDropDownMenu.value = true },
        )
        DropdownMenu(
            opened = showDropDownMenu.value,
            onDismissRequest = {
                showDropDownMenu.value = false
            },
            triggerInfo = triggerInfo.value,
            style = style,
            placement = PopoverPlacement.Start,
            placementMode = PopoverPlacementMode.Loose,
            alignment = PopoverAlignment.Start,
            enterTransition = EnterTransition.None,
            exitTransition = ExitTransition.None,
        ) {
            ListForDropDownMenu()
        }
    }
}

/**
 * PLASMA-T2082
 */
@Composable
fun DropDownMenuLStrictCenterStart(style: DropdownMenuStyle, buttonStyle: ButtonStyle) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showDropDownMenu = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(Alignment.CenterStart)
                .popoverTrigger(triggerInfo),
            label = "Show DropDownMenu",
            onClick = { showDropDownMenu.value = true },
        )
        DropdownMenu(
            opened = showDropDownMenu.value,
            onDismissRequest = {
                showDropDownMenu.value = false
            },
            triggerInfo = triggerInfo.value,
            style = style,
            placement = PopoverPlacement.Top,
            placementMode = PopoverPlacementMode.Strict,
            alignment = PopoverAlignment.Center,
            enterTransition = EnterTransition.None,
            exitTransition = ExitTransition.None,
        ) {
            ListForDropDownMenu()
        }
    }
}

/**
 * PLASMA-T2083
 */
@Composable
fun DropDownMenuMStrictBottomStart(style: DropdownMenuStyle, buttonStyle: ButtonStyle) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showDropDownMenu = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(Alignment.BottomStart)
                .popoverTrigger(triggerInfo),
            label = "Show DropDownMenu",
            onClick = { showDropDownMenu.value = true },
        )
        DropdownMenu(
            opened = showDropDownMenu.value,
            onDismissRequest = {
                showDropDownMenu.value = false
            },
            triggerInfo = triggerInfo.value,
            style = style,
            placement = PopoverPlacement.End,
            placementMode = PopoverPlacementMode.Strict,
            alignment = PopoverAlignment.End,
            enterTransition = EnterTransition.None,
            exitTransition = ExitTransition.None,
        ) {
            ListForDropDownMenu()
        }
    }
}

/**
 * PLASMA-T2084
 */
@Composable
fun DropDownMenuSStrictTopCenter(style: DropdownMenuStyle, buttonStyle: ButtonStyle) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showDropDownMenu = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .popoverTrigger(triggerInfo),
            label = "Show DropDownMenu",
            onClick = { showDropDownMenu.value = true },
        )
        DropdownMenu(
            opened = showDropDownMenu.value,
            onDismissRequest = {
                showDropDownMenu.value = false
            },
            triggerInfo = triggerInfo.value,
            style = style,
            placement = PopoverPlacement.Bottom,
            placementMode = PopoverPlacementMode.Strict,
            alignment = PopoverAlignment.Start,
            enterTransition = EnterTransition.None,
            exitTransition = ExitTransition.None,
        ) {
            com.sdds.compose.uikit.List(
                modifier = Modifier.width(200.dp),
            ) {
                val items = listOf("Item 1", "Item 2", "Item 3")
                items(items.size) { index ->
                    ListItem(
                        title = "",
                        disclosureEnabled = false,
                    )
                    if (index < items.lastIndex) {
                        Divider()
                    }
                }
            }
        }
    }
}

/**
 * PLASMA-T2085
 */
@Composable
fun DropDownMenuXsStrictCenter(style: DropdownMenuStyle, buttonStyle: ButtonStyle) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showDropDownMenu = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(Alignment.Center)
                .popoverTrigger(triggerInfo),
            label = "Show DropDownMenu",
            onClick = { showDropDownMenu.value = true },
        )
        DropdownMenu(
            opened = showDropDownMenu.value,
            onDismissRequest = {
                showDropDownMenu.value = false
            },
            triggerInfo = triggerInfo.value,
            style = style,
            placement = PopoverPlacement.Start,
            placementMode = PopoverPlacementMode.Strict,
            alignment = PopoverAlignment.Center,
            enterTransition = EnterTransition.None,
            exitTransition = ExitTransition.None,
        ) {
            com.sdds.compose.uikit.List(
                modifier = Modifier.width(200.dp),
            ) {
                items(3) {
                    ListItem(
                        title = "Title",
                        disclosureEnabled = false,
                    )
                }
            }
        }
    }
}

/**
 * PLASMA-T2086
 */
@Composable
fun DropDownMenuXlAmountTenLooseBottomCenter(
    style: DropdownMenuStyle,
    buttonStyle: ButtonStyle,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showDropDownMenu = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .popoverTrigger(triggerInfo),
            label = "Show DropDownMenu",
            onClick = { showDropDownMenu.value = true },
        )
        DropdownMenu(
            opened = showDropDownMenu.value,
            onDismissRequest = {
                showDropDownMenu.value = false
            },
            triggerInfo = triggerInfo.value,
            style = style,
            placement = PopoverPlacement.Start,
            placementMode = PopoverPlacementMode.Loose,
            alignment = PopoverAlignment.Center,
            enterTransition = EnterTransition.None,
            exitTransition = ExitTransition.None,
        ) {
            ListForDropDownMenuAmountTen()
        }
    }
}

/**
 * PLASMA-T2087
 */
@Composable
fun DropDownMenuXlLooseTopEndDivider(style: DropdownMenuStyle, buttonStyle: ButtonStyle) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showDropDownMenu = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .popoverTrigger(triggerInfo),
            label = "Show DropDownMenu",
            onClick = { showDropDownMenu.value = true },
        )
        DropdownMenu(
            opened = showDropDownMenu.value,
            onDismissRequest = {
                showDropDownMenu.value = false
            },
            triggerInfo = triggerInfo.value,
            style = style,
            placement = PopoverPlacement.Start,
            placementMode = PopoverPlacementMode.Loose,
            alignment = PopoverAlignment.Center,
            enterTransition = EnterTransition.None,
            exitTransition = ExitTransition.None,
        ) {
            com.sdds.compose.uikit.List(
                modifier = Modifier.width(200.dp),
            ) {
                val items = listOf("Item 1", "Item 2", "Item 3")
                items(items.size) { index ->
                    ListItem(
                        title = "Title",
                        disclosureEnabled = true,
                    )
                    if (index < items.lastIndex) {
                        Divider()
                    }
                }
            }
        }
    }
}

/**
 * PLASMA-T2088
 */
@Composable
fun DropDownMenuXlAmountTenStrictCenterEnd(
    style: DropdownMenuStyle,
    buttonStyle: ButtonStyle,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showDropDownMenu = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .popoverTrigger(triggerInfo),
            label = "Show DropDownMenu",
            onClick = { showDropDownMenu.value = true },
        )
        DropdownMenu(
            opened = showDropDownMenu.value,
            onDismissRequest = {
                showDropDownMenu.value = false
            },
            triggerInfo = triggerInfo.value,
            style = style,
            placement = PopoverPlacement.Top,
            placementMode = PopoverPlacementMode.Strict,
            alignment = PopoverAlignment.Center,
            enterTransition = EnterTransition.None,
            exitTransition = ExitTransition.None,
        ) {
            ListForDropDownMenuAmountTen()
        }
    }
}

/**
 * PLASMA-T2089
 */
@Composable
fun DropDownMenuXlLooseBottomEnd(style: DropdownMenuStyle, buttonStyle: ButtonStyle) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showDropDownMenu = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .popoverTrigger(triggerInfo),
            label = "Show DropDownMenu",
            onClick = { showDropDownMenu.value = true },
        )
        DropdownMenu(
            opened = showDropDownMenu.value,
            onDismissRequest = {
                showDropDownMenu.value = false
            },
            triggerInfo = triggerInfo.value,
            style = style,
            placement = PopoverPlacement.Bottom,
            placementMode = PopoverPlacementMode.Loose,
            alignment = PopoverAlignment.End,
            enterTransition = EnterTransition.None,
            exitTransition = ExitTransition.None,
        ) {
            ListForDropDownMenu()
        }
    }
}

/**
 * PLASMA-T2090
 */
@Composable
fun DropDownMenuTightXsStrictCenter(style: DropdownMenuStyle, buttonStyle: ButtonStyle) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showDropDownMenu = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(Alignment.Center)
                .popoverTrigger(triggerInfo),
            label = "Show DropDownMenu",
            onClick = { showDropDownMenu.value = true },
        )
        DropdownMenu(
            opened = showDropDownMenu.value,
            onDismissRequest = {
                showDropDownMenu.value = false
            },
            triggerInfo = triggerInfo.value,
            style = style,
            placement = PopoverPlacement.Top,
            placementMode = PopoverPlacementMode.Strict,
            alignment = PopoverAlignment.Center,
            enterTransition = EnterTransition.None,
            exitTransition = ExitTransition.None,
        ) {
            ListForDropDownMenu()
        }
    }
}

/**
 * List для тестов DropDownMenu
 */
@Composable
fun ListForDropDownMenu() {
    com.sdds.compose.uikit.List(
        modifier = Modifier.width(200.dp),
    ) {
        items(3) {
            ListItem(
                title = "Title",
                disclosureEnabled = true,
            )
        }
    }
}

/**
 * List для тестов DropDownMenu c 20 элементами
 */
@Composable
fun ListForDropDownMenuAmountTen() {
    com.sdds.compose.uikit.List(
        modifier = Modifier.width(200.dp),
    ) {
        items(10) {
            ListItem(
                title = "Title",
                disclosureEnabled = true,
            )
        }
    }
}
