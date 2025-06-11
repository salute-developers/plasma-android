package com.sdds.testing.compose.popover

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.Popover
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.PopoverStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.popoverTrigger

/**
 * Тест кейсы для Popover
 */

/**
 * Preview для меню песочницы
 */
@Composable
fun PopoverForSandbox(style: PopoverStyle, buttonStyle: ButtonStyle) {
    val showPopover = remember { mutableStateOf(false) }
    val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
    Button(
        modifier = Modifier
            .popoverTrigger(triggerInfo),
        label = "Show Popover",
        onClick = { showPopover.value = true },
    )
    Popover(
        show = showPopover.value,
        triggerInfo = triggerInfo.value,
        placement = PopoverPlacement.Top,
        placementMode = PopoverPlacementMode.Loose,
        triggerCentered = false,
        alignment = PopoverAlignment.Start,
        style = style,
        tailEnabled = true,
        onDismissRequest = {
            showPopover.value = false
        },
        duration = 3000L,
    ) {
        Column(
            modifier = Modifier
                .padding(
                    top = 12.dp,
                    bottom = 8.dp,
                    start = 8.dp,
                    end = 8.dp,
                ),
        ) {
            Text("Title")
            Spacer(Modifier.height(4.dp))
            Text("Text")
            Spacer(Modifier.height(12.dp))
            Button(
                modifier = Modifier.width(166.dp),
                style = buttonStyle,
                label = "Ok",
                onClick = {},
            )
        }
    }
}
