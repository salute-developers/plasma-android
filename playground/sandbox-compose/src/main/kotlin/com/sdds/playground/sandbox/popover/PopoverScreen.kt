package com.sdds.playground.sandbox.popover

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Popover
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.PopoverTailAlignment
import com.sdds.compose.uikit.popoverTrigger
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.Xl
import com.sdds.serv.theme.SddsServTheme

@Composable
fun PopoverScreen() {
    Column(
        modifier = Modifier
            .background(Color.LightGray.copy(0.5f))
            .padding(start = 10.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        var showPopover by remember { mutableStateOf(false) }
        val triggerLC = remember { mutableStateOf<LayoutCoordinates?>(null) }
        Box(
            contentAlignment = Alignment.CenterStart
        ) {
            Button(
                modifier = Modifier.popoverTrigger(triggerLC),
                style = BasicButton.Xl.Default.style(),
                label = "Show",
                onClick = { showPopover = true },
            )
        }
        Popover(
            show = showPopover,
            placement = PopoverPlacement.Start,
            placementMode = PopoverPlacementMode.Loose,
            tailAlignment = PopoverTailAlignment.Start,
            triggerCentered = true,
            triggerLayoutCoordinates = triggerLC,
            onDismissRequest = { showPopover = false },
            shadow = SddsServTheme.shadows.downHardM, //todo
            duration = 2000,
        ) {
            Box(
                modifier = Modifier.padding(16.dp)
            ) {
                Button("Ok", {})
            }
        }
    }
}