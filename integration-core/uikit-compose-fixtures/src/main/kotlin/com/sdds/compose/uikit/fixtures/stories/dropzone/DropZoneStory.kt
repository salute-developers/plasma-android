package com.sdds.compose.uikit.fixtures.stories.dropzone

import androidx.compose.foundation.draganddrop.dragAndDropTarget
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draganddrop.DragAndDropEvent
import androidx.compose.ui.draganddrop.DragAndDropTarget
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.DropZone
import com.sdds.compose.uikit.DropZoneIconPlacement
import com.sdds.compose.uikit.DropZoneState
import com.sdds.compose.uikit.DropZoneStyle
import com.sdds.compose.uikit.File
import com.sdds.compose.uikit.FileStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.LocalTextStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.FixtureR
import com.sdds.compose.uikit.fixtures.painterResource
import com.sdds.compose.uikit.fixtures.resourceImageSource
import com.sdds.compose.uikit.fixtures.stories.DropZoneUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.DropZoneUiStateTransformer
import com.sdds.compose.uikit.motion.components.dropzone.rememberDropZoneMotion
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class DropZoneUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val enabled: Boolean = true,
    val contentPlacement: DropZoneIconPlacement = DropZoneIconPlacement.Top,
    val title: String = "Title",
    val description: String = "Description",
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object DropZoneStory : ComposeBaseStory<DropZoneUiState, DropZoneStyle>(
    ComponentKey.DropZone,
    DropZoneUiState(),
    DropZoneUiStatePropertiesProducer,
    DropZoneUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: DropZoneStyle,
        state: DropZoneUiState,
    ) {
        var dragOver by remember { mutableStateOf(false) }
        Column(
            verticalArrangement = Arrangement.spacedBy(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Box(
                modifier = Modifier.dragAndDropTarget(
                    shouldStartDragAndDrop = { true },
                    target = remember {
                        object : DragAndDropTarget {
                            override fun onEntered(event: DragAndDropEvent) {
                                dragOver = true
                            }

                            override fun onExited(event: DragAndDropEvent) {
                                dragOver = false
                            }

                            override fun onEnded(event: DragAndDropEvent) {
                                dragOver = false
                            }

                            override fun onDrop(event: DragAndDropEvent): Boolean {
                                dragOver = false
                                return true
                            }
                        }
                    },
                ),
            ) {
                val motion = rememberDropZoneMotion()
                DropZone(
                    modifier = Modifier
                        .focusable(state.enabled, motion.context.interactionSource),
                    style = style,
                    state = if (!state.enabled) {
                        DropZoneState.Disabled
                    } else {
                        if (dragOver) DropZoneState.DraggingOver else DropZoneState.Idle
                    },
                    motion = motion,
                    iconPlacement = state.contentPlacement,
                    title = {
                        Text(text = state.title)
                    },
                    description = {
                        Text(text = state.description)
                    },
                    icon = {
                        Icon(
                            painter = painterResource(FixtureR.drawable.ic_salute_outline_24),
                            contentDescription = null,
                        )
                    },
                )
            }
            DraggableContent()

            Text("Start dragging File to see DropZone behavior")
        }
    }

    @Composable
    override fun Preview(
        style: DropZoneStyle,
        key: ComponentKey,
    ) {
        DropZone(
            style = style,
            state = DropZoneState.Idle,
            iconPlacement = DropZoneIconPlacement.Top,
            title = {
                Text(text = "title")
            },
            description = {
                Text(text = "description")
            },
            icon = {
                Icon(
                    source = resourceImageSource(FixtureR.drawable.ic_salute_outline_24),
                    contentDescription = null,
                )
            },
        )
    }
}

@Composable
private fun DraggableContent() {
    val fileStyle = FileStyle.builder()
        .colors {
            labelColor(LocalTextStyle.current.color)
            iconColor(LocalTextStyle.current.color)
        }
        .labelStyle(LocalTextStyle.current)
        .style()
    File(
        style = fileStyle,
        modifier = Modifier,
        labelContent = {
            Text(
                text = "Draggable file",
            )
        },
        descriptionContent = {},
        image = {
            Icon(
                painter = painterResource(FixtureR.drawable.ic_file_check_fill_36),
                contentDescription = null,
            )
        },
    )
}
