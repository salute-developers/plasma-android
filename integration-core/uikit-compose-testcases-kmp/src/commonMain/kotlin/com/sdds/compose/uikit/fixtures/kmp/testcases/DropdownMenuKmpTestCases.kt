package com.sdds.compose.uikit.fixtures.kmp.testcases

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import com.sdds.compose.uikit.List
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.popoverTrigger

/**
 * PLASMA-T2085
 */
@Composable
fun DropDownMenuXsStrictCenterKmp(style: DropdownMenuStyle, buttonStyle: ButtonStyle) {
    DropDownMenuCommonKmp(
        style = style,
        buttonStyle = buttonStyle,
        buttonAlignment = Alignment.Center,
        placement = PopoverPlacement.Start,
        placementMode = PopoverPlacementMode.Strict,
        popoverAlignment = PopoverAlignment.Center,
        content = {
            List(modifier = Modifier.width(200.dp)) {
                items(3) {
                    ListItem(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Title",
                        disclosureEnabled = false,
                    )
                }
            }
        },
    )
}

/**
 * PLASMA-T2087
 */
@Composable
fun DropDownMenuXlLooseTopEndDividerKmp(style: DropdownMenuStyle, buttonStyle: ButtonStyle) {
    DropDownMenuCommonKmp(
        style = style,
        buttonStyle = buttonStyle,
        buttonAlignment = Alignment.TopEnd,
        placement = PopoverPlacement.Start,
        placementMode = PopoverPlacementMode.Loose,
        popoverAlignment = PopoverAlignment.Center,
        content = {
            List(modifier = Modifier.width(200.dp)) {
                val items = listOf("Item 1", "Item 2", "Item 3")
                items(items.size) { index ->
                    ListItem(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Title",
                        disclosureEnabled = true,
                    )
                    if (index < items.lastIndex) {
                        Divider()
                    }
                }
            }
        },
    )
}

/**
 * PLASMA-T2088
 */
@Composable
fun DropDownMenuXlAmountTenStrictCenterEndKmp(
    style: DropdownMenuStyle,
    buttonStyle: ButtonStyle,
) {
    DropDownMenuCommonKmp(
        style = style,
        buttonStyle = buttonStyle,
        buttonAlignment = Alignment.CenterEnd,
        placement = PopoverPlacement.Top,
        placementMode = PopoverPlacementMode.Strict,
        popoverAlignment = PopoverAlignment.Center,
        content = { ListForDropDownMenuAmountTenKmp() },
    )
}

/**
 * DropdownMenu common
 */
@Composable
private fun DropDownMenuCommonKmp(
    style: DropdownMenuStyle,
    buttonStyle: ButtonStyle,
    buttonAlignment: Alignment,
    placement: PopoverPlacement,
    placementMode: PopoverPlacementMode,
    popoverAlignment: PopoverAlignment,
    content: @Composable () -> Unit,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(buttonAlignment)
                .popoverTrigger(triggerInfo),
            label = "Show DropDownMenu",
            onClick = {},
        )
        DropdownMenu(
            opened = true,
            onDismissRequest = {},
            triggerInfo = triggerInfo.value,
            style = style,
            placement = placement,
            placementMode = placementMode,
            alignment = popoverAlignment,
            enterTransition = EnterTransition.None,
            exitTransition = ExitTransition.None,
            content = content,
        )
    }
}

/**
 * Лист с 10 элементами
 */
@Composable
fun ListForDropDownMenuAmountTenKmp() {
    List(modifier = Modifier.width(200.dp)) {
        items(10) {
            ListItem(
                modifier = Modifier.fillMaxWidth(),
                text = "Title",
                disclosureEnabled = true,
            )
        }
    }
}
