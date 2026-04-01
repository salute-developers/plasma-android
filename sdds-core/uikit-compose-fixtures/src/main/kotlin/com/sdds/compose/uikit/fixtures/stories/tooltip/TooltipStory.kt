package com.sdds.compose.uikit.fixtures.stories.tooltip

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.Tooltip
import com.sdds.compose.uikit.TooltipStyle
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.fixtures.stories.TooltipUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.TooltipUiStateTransformer
import com.sdds.compose.uikit.fixtures.stories.popover.TriggerPlacement
import com.sdds.compose.uikit.fixtures.stories.popover.autoHideToMs
import com.sdds.compose.uikit.fixtures.stories.popover.toAlignment
import com.sdds.compose.uikit.popoverTrigger
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class TooltipUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val triggerPlacement: TriggerPlacement = TriggerPlacement.Center,
    val alignment: PopoverAlignment = PopoverAlignment.Start,
    val placement: PopoverPlacement = PopoverPlacement.Top,
    val placementMode: PopoverPlacementMode = PopoverPlacementMode.Loose,
    val triggerCentered: Boolean = false,
    val tailEnabled: Boolean = true,
    val autoHide: Boolean = false,
    val text: String = "Tooltip text you can replace",
    val hasContentStart: Boolean = true,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object TooltipStory : ComposeBaseStory<TooltipUiState, TooltipStyle>(
    ComponentKey.Tooltip,
    TooltipUiState(),
    TooltipUiStatePropertiesProducer,
    TooltipUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: TooltipStyle,
        state: TooltipUiState,
    ) {
        val showTooltip = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            modifier = Modifier
                .align(state.triggerPlacement.toAlignment())
                .popoverTrigger(triggerInfo),
            label = "show",
            onClick = { showTooltip.value = true },
        )
        Tooltip(
            show = showTooltip.value,
            modifier = Modifier.widthIn(0.dp, 160.dp),
            triggerInfo = { triggerInfo.value },
            placement = state.placement,
            placementMode = state.placementMode,
            triggerCentered = state.triggerCentered,
            alignment = state.alignment,
            style = style,
            tailEnabled = state.tailEnabled,
            onDismissRequest = {
                showTooltip.value = false
            },
            duration = state.autoHide.autoHideToMs(),
            contentStart = getContentStart(state.hasContentStart),
            text = AnnotatedString(state.text),
        )
    }

    @Composable
    override fun Preview(
        style: TooltipStyle,
        key: ComponentKey,
    ) {
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
            triggerInfo = { triggerInfo.value },
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
}

private fun getContentStart(hasContentStart: Boolean): @Composable (() -> Unit)? {
    return if (hasContentStart) {
        @Composable { Icon(painter = painterResource(R.drawable.ic_shazam_16), "") }
    } else {
        null
    }
}
