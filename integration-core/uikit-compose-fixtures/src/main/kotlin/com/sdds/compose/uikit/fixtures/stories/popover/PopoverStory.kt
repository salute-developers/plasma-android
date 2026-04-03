package com.sdds.compose.uikit.fixtures.stories.popover

import android.util.Log
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Popover
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.PopoverStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.fixtures.stories.PopoverUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.PopoverUiStateTransformer
import com.sdds.compose.uikit.popoverTrigger
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class PopoverUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val triggerPlacement: TriggerPlacement = TriggerPlacement.Center,
    val alignment: PopoverAlignment = PopoverAlignment.Start,
    val placement: PopoverPlacement = PopoverPlacement.Top,
    val placementMode: PopoverPlacementMode = PopoverPlacementMode.Loose,
    val triggerCentered: Boolean = false,
    val tailEnabled: Boolean = true,
    val autoHide: Boolean = false,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

enum class TriggerPlacement {
    TopStart,
    TopCenter,
    TopEnd,
    CenterStart,
    Center,
    CenterEnd,
    BottomStart,
    BottomCenter,
    BottomEnd,
}

internal fun TriggerPlacement.toAlignment(): Alignment {
    return when (this) {
        TriggerPlacement.TopStart -> Alignment.TopStart
        TriggerPlacement.TopCenter -> Alignment.TopCenter
        TriggerPlacement.TopEnd -> Alignment.TopEnd
        TriggerPlacement.CenterStart -> Alignment.CenterStart
        TriggerPlacement.Center -> Alignment.Center
        TriggerPlacement.CenterEnd -> Alignment.CenterEnd
        TriggerPlacement.BottomStart -> Alignment.BottomStart
        TriggerPlacement.BottomCenter -> Alignment.BottomCenter
        TriggerPlacement.BottomEnd -> Alignment.BottomEnd
    }
}

internal enum class HideMode {
    AutoHide, OnTapOnly
}

internal fun Boolean.autoHideToMs(): Long? = if (this) 3000L else null

@Story
object PopoverStory : ComposeBaseStory<PopoverUiState, PopoverStyle>(
    ComponentKey.Popover,
    PopoverUiState(),
    PopoverUiStatePropertiesProducer,
    PopoverUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: PopoverStyle,
        state: PopoverUiState,
    ) {
        val showPopover = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            modifier = Modifier
                .align(state.triggerPlacement.toAlignment())
                .popoverTrigger(triggerInfo),
            label = "show",
            onClick = { showPopover.value = true },
        )
        Popover(
            show = showPopover.value,
            triggerInfo = triggerInfo.value,
            placement = state.placement,
            placementMode = state.placementMode,
            triggerCentered = state.triggerCentered,
            alignment = state.alignment,
            style = style,
            tailEnabled = state.tailEnabled,
            onDismissRequest = {
                showPopover.value = false
            },
            duration = state.autoHide.autoHideToMs(),
        ) {
            Column(
                modifier = Modifier
                    .padding(top = 12.dp, bottom = 8.dp, start = 8.dp, end = 8.dp),
            ) {
                Text("Title")
                Spacer(Modifier.height(4.dp))
                Text("Text")
                Spacer(Modifier.height(12.dp))
                Button(
                    modifier = Modifier.width(166.dp),
                    label = "Ok",
                    onClick = { Log.d("Popover", "Popover button was pressed") },
                )
            }
        }
    }

    @Composable
    override fun Preview(
        style: PopoverStyle,
        key: ComponentKey,
    ) {
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
                    label = "Ok",
                    onClick = {},
                )
            }
        }
    }
}
