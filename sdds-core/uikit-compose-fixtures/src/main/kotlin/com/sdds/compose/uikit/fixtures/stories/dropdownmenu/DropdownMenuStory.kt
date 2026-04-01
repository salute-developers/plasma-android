package com.sdds.compose.uikit.fixtures.stories.dropdownmenu

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Divider
import com.sdds.compose.uikit.DropdownMenu
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.List
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.fixtures.stories.DropdownMenuUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.DropdownMenuUiStateTransformer
import com.sdds.compose.uikit.fixtures.stories.popover.TriggerPlacement
import com.sdds.compose.uikit.fixtures.stories.popover.toAlignment
import com.sdds.compose.uikit.popoverTrigger
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class DropdownMenuUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val amount: Int = 3,
    val itemTitle: String = "Item Title",
    val hasDisclosure: Boolean = true,
    val itemDividerEnabled: Boolean = false,
    val placementMode: PopoverPlacementMode = PopoverPlacementMode.Loose,
    val placement: PopoverPlacement = PopoverPlacement.Bottom,
    val alignment: PopoverAlignment = PopoverAlignment.Center,
    val triggerPlacement: TriggerPlacement = TriggerPlacement.Center,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object DropdownMenuStory : ComposeBaseStory<DropdownMenuUiState, DropdownMenuStyle>(
    ComponentKey.DropdownMenu,
    DropdownMenuUiState(),
    DropdownMenuUiStatePropertiesProducer,
    DropdownMenuUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: DropdownMenuStyle,
        state: DropdownMenuUiState,
    ) {
        Box(
            Modifier.fillMaxSize(),
            contentAlignment = state.triggerPlacement.toAlignment(),
        ) {
            val showDropdownMenu = remember { mutableStateOf(false) }
            val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
            Button(
                modifier = Modifier.popoverTrigger(triggerInfo),
                label = "show",
                onClick = { showDropdownMenu.value = true },
            )
            DropdownMenu(
                opened = showDropdownMenu.value,
                onDismissRequest = {
                    showDropdownMenu.value = false
                },
                triggerInfo = triggerInfo.value,
                placement = state.placement,
                placementMode = state.placementMode,
                alignment = state.alignment,
                style = style,
                clipHeight = true,
                clipWidth = true,
            ) {
                List(modifier = Modifier.widthIn(0.dp, 200.dp)) {
                    items(state.amount) {
                        val interactionSource = remember { MutableInteractionSource() }
                        ListItem(
                            modifier = Modifier
                                .clickable(
                                    indication = null,
                                    interactionSource = interactionSource,
                                ) {
                                    Log.d(
                                        "DropdownMenu",
                                        "${state.itemTitle} $it pressed",
                                    )
                                }
                                .fillMaxWidth(),
                            title = "${state.itemTitle} $it",
                            disclosureEnabled = state.hasDisclosure,
                            interactionSource = interactionSource,
                        )
                        if (state.itemDividerEnabled && it != state.amount - 1) {
                            Divider()
                        }
                    }
                }
            }
        }
    }

    @Composable
    override fun Preview(
        style: DropdownMenuStyle,
        key: ComponentKey,
    ) {
        val showDropdownMenu = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            modifier = Modifier.popoverTrigger(triggerInfo),
            label = "Show Dropdown",
            onClick = { showDropdownMenu.value = true },
        )
        DropdownMenu(
            opened = showDropdownMenu.value,
            onDismissRequest = {
                showDropdownMenu.value = false
            },
            placement = PopoverPlacement.Bottom,
            placementMode = PopoverPlacementMode.Strict,
            alignment = PopoverAlignment.Center,
            triggerInfo = triggerInfo.value,
            style = style,
        ) {
            List(modifier = Modifier.width(200.dp)) {
                items(3) {
                    ListItem(
                        text = "Item Title $it",
                        disclosureEnabled = true,
                    )
                }
            }
        }
    }
}
