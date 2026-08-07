package com.sdds.compose.uikit.fixtures.kmp.testcases

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
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
 * PLASMA-T2007
 */
@Composable
fun PopoverMDefaultStrictBottomEndTopStartKmp(style: PopoverStyle, buttonStyle: ButtonStyle) {
    PopoverCommonKmp(
        style = style,
        buttonStyle = buttonStyle,
        buttonAlignment = Alignment.TopStart,
        placement = PopoverPlacement.Bottom,
        placementMode = PopoverPlacementMode.Strict,
        popoverAlignment = PopoverAlignment.End,
        triggerCentered = true,
    )
}

/**
 * PLASMA-T2013
 */
@Composable
fun PopoverMDefaultLooseTopEndKmp(style: PopoverStyle, buttonStyle: ButtonStyle) {
    PopoverCommonKmp(
        style = style,
        buttonStyle = buttonStyle,
        buttonAlignment = Alignment.TopEnd,
        placement = PopoverPlacement.Top,
        placementMode = PopoverPlacementMode.Loose,
        popoverAlignment = PopoverAlignment.End,
    )
}

/**
 * PLASMA-T2015
 */
@Composable
fun PopoverMDefaultLooseStartCenterBottomEndKmp(style: PopoverStyle, buttonStyle: ButtonStyle) {
    PopoverCommonKmp(
        style = style,
        buttonStyle = buttonStyle,
        buttonAlignment = Alignment.BottomEnd,
        placement = PopoverPlacement.Start,
        placementMode = PopoverPlacementMode.Loose,
        popoverAlignment = PopoverAlignment.Center,
    )
}

/**
 * Popover common
 */
@Composable
private fun PopoverCommonKmp(
    style: PopoverStyle,
    buttonStyle: ButtonStyle,
    buttonAlignment: Alignment,
    placement: PopoverPlacement,
    placementMode: PopoverPlacementMode,
    popoverAlignment: PopoverAlignment,
    triggerCentered: Boolean = false,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(buttonAlignment)
                .popoverTrigger(triggerInfo),
            label = "Show",
            onClick = {},
        )
        Popover(
            show = true,
            triggerInfo = triggerInfo.value,
            placement = placement,
            placementMode = placementMode,
            triggerCentered = triggerCentered,
            alignment = popoverAlignment,
            style = style,
            tailEnabled = true,
            enterTransition = EnterTransition.None,
            exitTransition = ExitTransition.None,
            onDismissRequest = {},
            duration = null,
        ) {
            PopoverContentKmp(buttonStyle)
        }
    }
}

/**
 * Popover content
 */
@Composable
fun PopoverContentKmp(buttonStyle: ButtonStyle) {
    Column(
        modifier = Modifier.padding(
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
