package com.sdds.testing.compose.popover

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
 * Тест кейсы для Popover
 */

/**
 * PLASMA-T2007
 */
@Composable
fun PopoverMDefaultStrictBottomEndTopStart(style: PopoverStyle, buttonStyle: ButtonStyle) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showPopover = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(Alignment.TopStart)
                .popoverTrigger(triggerInfo),
            label = "Show",
            onClick = { showPopover.value = true },
        )
        Popover(
            show = showPopover.value,
            triggerInfo = triggerInfo.value,
            placement = PopoverPlacement.Bottom,
            placementMode = PopoverPlacementMode.Strict,
            triggerCentered = true,
            alignment = PopoverAlignment.End,
            style = style,
            tailEnabled = true,
            enterTransition = EnterTransition.None,
            exitTransition = ExitTransition.None,
            onDismissRequest = {
                showPopover.value = false
            },
            duration = null,
        ) {
            PopoverContent(buttonStyle)
        }
    }
}

/**
 * PLASMA-T2008
 */
@Composable
fun PopoverMAccentStrictTopCenterCenterStart(style: PopoverStyle, buttonStyle: ButtonStyle) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showPopover = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(Alignment.CenterStart)
                .popoverTrigger(triggerInfo),
            label = "Show",
            onClick = { showPopover.value = true },
        )
        Popover(
            show = showPopover.value,
            triggerInfo = triggerInfo.value,
            placement = PopoverPlacement.Top,
            placementMode = PopoverPlacementMode.Strict,
            triggerCentered = false,
            alignment = PopoverAlignment.Center,
            style = style,
            tailEnabled = false,
            enterTransition = EnterTransition.None,
            exitTransition = ExitTransition.None,
            onDismissRequest = {
                showPopover.value = false
            },
            duration = null,
        ) {
            PopoverContent(buttonStyle)
        }
    }
}

/**
 * PLASMA-T2009
 */
@Composable
fun PopoverSDefaultLooseEndBottomStart(style: PopoverStyle, buttonStyle: ButtonStyle) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showPopover = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(Alignment.BottomStart)
                .popoverTrigger(triggerInfo),
            label = "Show",
            onClick = { showPopover.value = true },
        )
        Popover(
            show = showPopover.value,
            triggerInfo = triggerInfo.value,
            placement = PopoverPlacement.End,
            placementMode = PopoverPlacementMode.Loose,
            triggerCentered = false,
            alignment = PopoverAlignment.End,
            style = style,
            tailEnabled = true,
            enterTransition = EnterTransition.None,
            exitTransition = ExitTransition.None,
            onDismissRequest = {
                showPopover.value = false
            },
            duration = null,
        ) {
            PopoverContent(buttonStyle)
        }
    }
}

/**
 * PLASMA-T2010
 */
@Composable
fun PopoverSAccentStrictBottomStartTopCenter(style: PopoverStyle, buttonStyle: ButtonStyle) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showPopover = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .popoverTrigger(triggerInfo),
            label = "Show",
            onClick = { showPopover.value = true },
        )
        Popover(
            show = showPopover.value,
            triggerInfo = triggerInfo.value,
            placement = PopoverPlacement.Bottom,
            placementMode = PopoverPlacementMode.Strict,
            triggerCentered = false,
            alignment = PopoverAlignment.Start,
            style = style,
            tailEnabled = true,
            enterTransition = EnterTransition.None,
            exitTransition = ExitTransition.None,
            onDismissRequest = {
                showPopover.value = false
            },
            duration = null,
        ) {
            PopoverContent(buttonStyle)
        }
    }
}

/**
 * PLASMA-T2011
 */
@Composable
fun PopoverMDefaultLooseStartCenter(style: PopoverStyle, buttonStyle: ButtonStyle) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showPopover = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(Alignment.Center)
                .popoverTrigger(triggerInfo),
            label = "Show",
            onClick = { showPopover.value = true },
        )
        Popover(
            show = showPopover.value,
            triggerInfo = triggerInfo.value,
            placement = PopoverPlacement.Start,
            placementMode = PopoverPlacementMode.Loose,
            triggerCentered = false,
            alignment = PopoverAlignment.Start,
            style = style,
            tailEnabled = true,
            enterTransition = EnterTransition.None,
            exitTransition = ExitTransition.None,
            onDismissRequest = {
                showPopover.value = false
            },
            duration = null,
        ) {
            PopoverContent(buttonStyle)
        }
    }
}

/**
 * PLASMA-T2012
 */
@Composable
fun PopoverMDefaultLooseStartBottomCenter(style: PopoverStyle, buttonStyle: ButtonStyle) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showPopover = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .popoverTrigger(triggerInfo),
            label = "Show",
            onClick = { showPopover.value = true },
        )
        Popover(
            show = showPopover.value,
            triggerInfo = triggerInfo.value,
            placement = PopoverPlacement.Start,
            placementMode = PopoverPlacementMode.Loose,
            triggerCentered = false,
            alignment = PopoverAlignment.Start,
            style = style,
            tailEnabled = true,
            enterTransition = EnterTransition.None,
            exitTransition = ExitTransition.None,
            onDismissRequest = {
                showPopover.value = false
            },
            duration = null,
        ) {
            PopoverContent(buttonStyle)
        }
    }
}

/**
 * PLASMA-T2013
 */
@Composable
fun PopoverMDefaultLooseTopEnd(style: PopoverStyle, buttonStyle: ButtonStyle) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showPopover = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .popoverTrigger(triggerInfo),
            label = "Show",
            onClick = { showPopover.value = true },
        )
        Popover(
            show = showPopover.value,
            triggerInfo = triggerInfo.value,
            placement = PopoverPlacement.Top,
            placementMode = PopoverPlacementMode.Loose,
            triggerCentered = false,
            alignment = PopoverAlignment.End,
            style = style,
            tailEnabled = true,
            enterTransition = EnterTransition.None,
            exitTransition = ExitTransition.None,
            onDismissRequest = {
                showPopover.value = false
            },
            duration = null,
        ) {
            PopoverContent(buttonStyle)
        }
    }
}

/**
 * PLASMA-T2014
 */
@Composable
fun PopoverMDefaultLooseStartCenterEnd(style: PopoverStyle, buttonStyle: ButtonStyle) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showPopover = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .popoverTrigger(triggerInfo),
            label = "Show",
            onClick = { showPopover.value = true },
        )
        Popover(
            show = showPopover.value,
            triggerInfo = triggerInfo.value,
            placement = PopoverPlacement.Start,
            placementMode = PopoverPlacementMode.Loose,
            triggerCentered = false,
            alignment = PopoverAlignment.Start,
            style = style,
            tailEnabled = true,
            enterTransition = EnterTransition.None,
            exitTransition = ExitTransition.None,
            onDismissRequest = {
                showPopover.value = false
            },
            duration = null,
        ) {
            PopoverContent(buttonStyle)
        }
    }
}

/**
 * PLASMA-T2015
 */
@Composable
fun PopoverMDefaultLooseStartCenterBottomEnd(style: PopoverStyle, buttonStyle: ButtonStyle) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showPopover = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .popoverTrigger(triggerInfo),
            label = "Show",
            onClick = { showPopover.value = true },
        )
        Popover(
            show = showPopover.value,
            triggerInfo = triggerInfo.value,
            placement = PopoverPlacement.Start,
            placementMode = PopoverPlacementMode.Loose,
            triggerCentered = false,
            alignment = PopoverAlignment.Center,
            style = style,
            tailEnabled = true,
            enterTransition = EnterTransition.None,
            exitTransition = ExitTransition.None,
            onDismissRequest = {
                showPopover.value = false
            },
            duration = null,
        ) {
            PopoverContent(buttonStyle)
        }
    }
}

/**
 * Контент для Popover
 */
@Composable
fun PopoverContent(buttonStyle: ButtonStyle) {
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
