package com.sdds.compose.uikit.fixtures.kmp.testcases

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
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
import com.sdds.icons.compose.SddsIcons
import com.sdds.icons.compose.Shazam16

/**
 * PLASMA-T2093
 */
@Composable
fun TooltipMLooseTopEnd(style: TooltipStyle, buttonStyle: ButtonStyle) {
    Box(modifier = Modifier.fillMaxSize()) {
        val showPopover = remember { mutableStateOf(true) }
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
            triggerInfo = { triggerInfo.value },
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
            contentStart = { Icon(imageVector = SddsIcons.Shazam16, contentDescription = "") },
            text = AnnotatedString("Tooltip text you can replace"),
        )
    }
}

/**
 * PLASMA-T2024
 */
@Composable
fun TooltipMLooseStartCenterBottomEndKmp(style: TooltipStyle, buttonStyle: ButtonStyle) {
    Box(modifier = Modifier.fillMaxSize()) {
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }

        Button(
            style = buttonStyle,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .popoverTrigger(triggerInfo),
            label = "Show",
            onClick = {},
        )
        Tooltip(
            show = true,
            triggerInfo = { triggerInfo.value },
            placement = PopoverPlacement.Start,
            placementMode = PopoverPlacementMode.Loose,
            triggerCentered = false,
            alignment = PopoverAlignment.Center,
            style = style,
            tailEnabled = true,
            enterTransition = EnterTransition.None,
            exitTransition = ExitTransition.None,
            onDismissRequest = {},
            duration = null,
            contentStart = {
                Icon(imageVector = SddsIcons.Shazam16, contentDescription = "")
            },
            text = AnnotatedString("Tooltip text you can replace"),
        )
    }
}
