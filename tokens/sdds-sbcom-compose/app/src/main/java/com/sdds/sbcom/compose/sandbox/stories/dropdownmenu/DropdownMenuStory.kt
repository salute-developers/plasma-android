package com.sdds.sbcom.compose.sandbox.stories.dropdownmenu

import android.util.Log
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Divider
import com.sdds.compose.uikit.DropdownMenu
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.List
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.ModalDropdownMenu
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.PopoverPositionStrategy
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.graphics.backgroundColor
import com.sdds.compose.uikit.graphics.maybeShapeable
import com.sdds.compose.uikit.popoverTrigger
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState
import com.sdds.sbcom.compose.sandbox.stories.DropdownMenuUiStatePropertiesProducer
import com.sdds.sbcom.compose.sandbox.stories.DropdownMenuUiStateTransformer

@StoryUiState
data class DropdownMenuUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val amount: Int = 3,
    val itemTitle: String = "Item Title",
    val hasDisclosure: Boolean = true,
    val itemDividerEnabled: Boolean = false,
    val placementMode: PopoverPlacementMode = PopoverPlacementMode.StrictClipped,
    val positionStrategy: PopoverPositionStrategy = PopoverPositionStrategy.Recalculate,
    val placement: PopoverPlacement = PopoverPlacement.Start,
    val alignment: PopoverAlignment = PopoverAlignment.Center,
    val dimBackground: Boolean = true,
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
        val scrollState = rememberLazyListState()
        List(
            state = scrollState,
            verticalArrangement = Arrangement.spacedBy(10.dp),
            contentPadding = PaddingValues(12.dp),
        ) {
            items(bubbles.size) { index ->
                val message = bubbles[index]
                val showDropdownMenu = remember { mutableStateOf(false) }
                val showNestedMenu = remember { mutableStateOf(false) }
                val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
                val itemShape = remember { RoundedCornerShape(16.dp) }
                Box(
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Box(
                        modifier = Modifier
                            .align(if (message.incoming) Alignment.CenterStart else Alignment.CenterEnd)
                            .fillMaxWidth(0.72f)
                            .height(message.height)
                            .backgroundColor(
                                colorProducer = { message.color },
                                shape = itemShape,
                            )
                            .popoverTrigger(triggerInfo, itemShape)
                            .clickable(
                                interactionSource = remember { MutableInteractionSource() },
                                indication = LocalIndication.current.maybeShapeable(itemShape),
                            ) {
                                showNestedMenu.value = false
                                showDropdownMenu.value = true
                            },
                    )
                }

                if (state.dimBackground) {
                    ModalDropdownMenu(
                        opened = showDropdownMenu.value,
                        onDismissRequest = {
                            showNestedMenu.value = false
                            showDropdownMenu.value = false
                        },
                        triggerInfo = triggerInfo.value,
                        placement = state.placement,
                        placementMode = state.placementMode,
                        alignment = state.alignment,
                        style = style,
                        clipHeight = true,
                        clipWidth = true,
                        dimBackground = true,
                        scrollState = scrollState,
                        positionStrategy = state.positionStrategy,
                        safeAreaPadding = PaddingValues(16.dp),
                    ) {
                        DropdownContent(
                            state = state,
                            secondLevel = showNestedMenu.value,
                            onOpenSecondLevel = { showNestedMenu.value = true },
                            onBack = { showNestedMenu.value = false },
                        )
                    }
                } else {
                    DropdownMenu(
                        opened = showDropdownMenu.value,
                        onDismissRequest = {
                            showNestedMenu.value = false
                            showDropdownMenu.value = false
                        },
                        triggerInfo = triggerInfo.value,
                        placement = state.placement,
                        placementMode = state.placementMode,
                        alignment = state.alignment,
                        style = style,
                        clipHeight = true,
                        clipWidth = true,
                        scrollState = scrollState,
                        positionStrategy = state.positionStrategy,
                        safeAreaPadding = PaddingValues(16.dp),
                    ) {
                        DropdownContent(
                            state = state,
                            secondLevel = showNestedMenu.value,
                            onOpenSecondLevel = { showNestedMenu.value = true },
                            onBack = { showNestedMenu.value = false },
                        )
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
        Box {
            Content(style, defaultState)
        }
    }

    @Composable
    private fun DropdownContent(
        state: DropdownMenuUiState,
        secondLevel: Boolean,
        onOpenSecondLevel: () -> Unit,
        onBack: () -> Unit,
    ) {
        List(modifier = Modifier.widthIn(0.dp, 200.dp)) {
            if (secondLevel) {
                item {
                    val interactionSource = remember { MutableInteractionSource() }
                    ListItem(
                        modifier = Modifier
                            .clickable(
                                indication = null,
                                interactionSource = interactionSource,
                            ) {
                                onBack()
                            }
                            .fillMaxWidth(),
                        titleContent = { Text("Back") },
                        disclosureEnabled = false,
                        interactionSource = interactionSource,
                    )
                    if (state.itemDividerEnabled && state.amount > 0) {
                        Divider()
                    }
                }
            }

            val itemsCount = if (secondLevel) state.amount else FIRST_LEVEL_ITEMS_COUNT
            items(itemsCount) {
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
                            if (!secondLevel) {
                                onOpenSecondLevel()
                            }
                        }
                        .fillMaxWidth(),
                    titleContent = { Text("${state.itemTitle} $it") },
                    disclosureEnabled = state.hasDisclosure && !secondLevel,
                    interactionSource = interactionSource,
                )
                if (state.itemDividerEnabled && it != itemsCount - 1) {
                    Divider()
                }
            }
        }
    }
}

private const val FIRST_LEVEL_ITEMS_COUNT = 5

private data class MessageBubbleSpec(
    val incoming: Boolean,
    val height: androidx.compose.ui.unit.Dp,
    val color: Color,
)

private val bubbles = listOf(
    MessageBubbleSpec(incoming = true, height = 40.dp, color = Color(0xFFEAF1FF)),
    MessageBubbleSpec(incoming = false, height = 64.dp, color = Color(0xFFDFF7E8)),
    MessageBubbleSpec(incoming = true, height = 180.dp, color = Color(0xFFFFE8D8)),
    MessageBubbleSpec(incoming = false, height = 48.dp, color = Color(0xFFE8DFFF)),
    MessageBubbleSpec(incoming = true, height = 96.dp, color = Color(0xFFFFF0C7)),
    MessageBubbleSpec(incoming = false, height = 260.dp, color = Color(0xFFDDF8F7)),
    MessageBubbleSpec(incoming = true, height = 56.dp, color = Color(0xFFF4E7EA)),
    MessageBubbleSpec(incoming = false, height = 128.dp, color = Color(0xFFE4F0D8)),
    MessageBubbleSpec(incoming = true, height = 320.dp, color = Color(0xFFE7E9F4)),
    MessageBubbleSpec(incoming = false, height = 72.dp, color = Color(0xFFFFE0E0)),
)
