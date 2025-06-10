package com.sdds.testing.compose.tooltip

import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
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
