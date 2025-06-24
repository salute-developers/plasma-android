package com.sdds.testing.compose.tooltip

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.Tooltip
import com.sdds.compose.uikit.TooltipStyle
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.popoverTrigger
import com.sdds.icons.R

/**
 * Тест кейсы для Tooltip
 */

/**
 * PLASMA-T2016
 */
@Composable
fun TooltipMStrictBottomEndTopStart(style: TooltipStyle, buttonStyle: ButtonStyle) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showTooltip = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }

        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(Alignment.TopStart)
                .popoverTrigger(triggerInfo),
            label = "Show",
            onClick = { showTooltip.value = true },
        )
        Tooltip(
            show = showTooltip.value,
            modifier = Modifier.widthIn(0.dp, 160.dp),
            triggerInfo = triggerInfo.value,
            placement = PopoverPlacement.Bottom,
            placementMode = PopoverPlacementMode.Strict,
            triggerCentered = true,
            alignment = PopoverAlignment.End,
            style = style,
            tailEnabled = true,
            onDismissRequest = {
                showTooltip.value = false
            },
            duration = null,
            contentStart = { Icon(painter = painterResource(R.drawable.ic_shazam_16), "") },
            text = AnnotatedString("Tooltip text you can replace"),
        )
    }
}

/**
 * PLASMA-T2017
 */
@Composable
fun TooltipMStrictTopCenterCenterStart(style: TooltipStyle, buttonStyle: ButtonStyle) {
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
        Tooltip(
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
            contentStart = { Icon(painter = painterResource(R.drawable.ic_shazam_16), "") },
            text = AnnotatedString("Tooltip text you can replace"),
        )
    }
}

/**
 * PLASMA-T2018
 */
@Composable
fun TooltipSLooseEndBottomStart(style: TooltipStyle, buttonStyle: ButtonStyle) {
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
        Tooltip(
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
            contentStart = { Icon(painter = painterResource(R.drawable.ic_shazam_16), "") },
            text = AnnotatedString("Tooltip text you can replace"),
        )
    }
}

/**
 * PLASMA-T2019
 */
@Composable
fun TooltipSStrictBottomStartTopCenter(style: TooltipStyle, buttonStyle: ButtonStyle) {
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
        Tooltip(
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
            contentStart = { Icon(painter = painterResource(R.drawable.ic_shazam_16), "") },
            text = AnnotatedString("Tooltip text you can replace"),
        )
    }
}

/**
 * PLASMA-T2020
 */
@Composable
fun TooltipMLooseStartCenter(style: TooltipStyle, buttonStyle: ButtonStyle) {
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
        Tooltip(
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
            contentStart = { Icon(painter = painterResource(R.drawable.ic_shazam_16), "") },
        )
    }
}

/**
 * PLASMA-T2021
 */
@Composable
fun TooltipMLooseStartBottomCenter(style: TooltipStyle, buttonStyle: ButtonStyle) {
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
        Tooltip(
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
            contentStart = null,
            text = AnnotatedString("Tooltip text you can replace"),
        )
    }
}

/**
 * PLASMA-T2022
 */
@Composable
fun TooltipMLooseTopEndNotVisible(style: TooltipStyle, buttonStyle: ButtonStyle) {
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
        Tooltip(
            modifier = Modifier
                .testTag("Tooltip"),
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
            contentStart = null,
        )
    }
}

/**
 * PLASMA-T2023
 */
@Composable
fun TooltipMLooseStartCenterEnd(style: TooltipStyle, buttonStyle: ButtonStyle) {
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
        Tooltip(
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
            contentStart = { Icon(painter = painterResource(R.drawable.ic_shazam_16), "") },
            text = AnnotatedString("Tooltip text you can replace"),
        )
    }
}

/**
 * PLASMA-T2024
 */
@Composable
fun TooltipMLooseStartCenterBottomEnd(style: TooltipStyle, buttonStyle: ButtonStyle) {
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
        Tooltip(
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
            contentStart = { Icon(painter = painterResource(R.drawable.ic_shazam_16), "") },
            text = AnnotatedString("Tooltip text you can replace"),
        )
    }
}

/**
 * PLASMA-T2093
 */
@Composable
fun TooltipMLooseTopEnd(style: TooltipStyle, buttonStyle: ButtonStyle) {
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
        Tooltip(
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
            contentStart = { Icon(painter = painterResource(R.drawable.ic_shazam_16), "") },
            text = AnnotatedString("Tooltip text you can replace"),
        )
    }
}

/**
 * Preview для меню песочницы
 */
@Composable
fun TooltipForSandbox(style: TooltipStyle) {
    val showTooltip = remember { mutableStateOf(false) }
    val triggerInfo = remember { mutableStateOf(TriggerInfo()) }

    Button(
        modifier = Modifier
            .popoverTrigger(triggerInfo),
        label = "Show Tooltip",
        onClick = { showTooltip.value = true },
    )
    Tooltip(
        show = showTooltip.value,
        modifier = Modifier.widthIn(0.dp, 160.dp),
        triggerInfo = triggerInfo.value,
        placement = PopoverPlacement.Top,
        placementMode = PopoverPlacementMode.Loose,
        triggerCentered = false,
        alignment = PopoverAlignment.Start,
        style = style,
        tailEnabled = true,
        onDismissRequest = {
            showTooltip.value = false
        },
        duration = 3000,
        contentStart = { Icon(painter = painterResource(R.drawable.ic_shazam_16), "") },
        text = AnnotatedString("Tooltip text you can replace"),
    )
}
