package com.sdds.playground.integrationtest.components.scenario

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.Tooltip
import com.sdds.compose.uikit.TooltipStyle
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.popoverTrigger

/**
 * Tooltip для сценария
 */
@Composable
internal fun ScenarioTooltip(
    style: TooltipStyle,
    buttonStyle: ButtonStyle,
    isVisible: Boolean,
    text: String,
    onOpenClick: () -> Unit,
    onDismissRequest: () -> Unit,
    openButtonTag: String,
    tooltipTag: String,
    modifier: Modifier = Modifier,
    triggerLabel: String = "Show tooltip",
    popupProperties: PopupProperties,
    inlineCloseButtonStyle: ButtonStyle,
    inlineCloseButtonTag: String? = null,
    onInlineCloseClick: (() -> Unit)? = null,
) {
    val triggerInfo = remember { mutableStateOf(TriggerInfo()) }

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(text = "Tooltip case")

        Box {
            Button(
                style = buttonStyle,
                modifier = Modifier
                    .popoverTrigger(triggerInfo)
                    .testTag(openButtonTag),
                label = triggerLabel,
                onClick = onOpenClick,
            )
            if (
                isVisible && inlineCloseButtonTag != null && onInlineCloseClick != null
            ) {
                IconButton(
                    style = inlineCloseButtonStyle,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .offset(x = 12.dp, y = (-12).dp)
                        .testTag(inlineCloseButtonTag),
                    iconRes = com.sdds.icons.R.drawable.ic_close_16,
                    onClick = onInlineCloseClick,
                )
            }
            Tooltip(
                style = style,
                modifier = Modifier.testTag(tooltipTag),
                show = isVisible,
                triggerInfo = { triggerInfo.value },
                placement = PopoverPlacement.Top,
                placementMode = PopoverPlacementMode.Loose,
                triggerCentered = false,
                alignment = PopoverAlignment.Start,
                onDismissRequest = onDismissRequest,
                popupProperties = popupProperties,
                text = AnnotatedString(text),
            )
        }
    }
}
