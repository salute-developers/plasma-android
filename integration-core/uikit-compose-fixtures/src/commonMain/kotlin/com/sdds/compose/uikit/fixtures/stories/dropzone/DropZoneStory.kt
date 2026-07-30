package com.sdds.compose.uikit.fixtures.stories.dropzone

import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.boundsInRoot
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.unit.IntOffset
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
import com.sdds.compose.uikit.fixtures.stories.DropZoneUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.DropZoneUiStateTransformer
import com.sdds.compose.uikit.imageVectorSource
import com.sdds.compose.uikit.motion.components.dropzone.rememberDropZoneMotion
import com.sdds.icons.compose.FileCheckFill36
import com.sdds.icons.compose.SaluteOutline24
import com.sdds.icons.compose.SddsIcons
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState
import kotlin.math.roundToInt

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
        val motion = rememberDropZoneMotion()
        var dropZoneBounds by remember { mutableStateOf<Rect?>(null) }
        var fileBounds by remember { mutableStateOf<Rect?>(null) }

        val dragOver = dropZoneBounds?.overlaps(fileBounds ?: Rect.Zero) ?: false

        Column(
            verticalArrangement = Arrangement.spacedBy(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Box(
                modifier = Modifier.onGloballyPositioned {
                    dropZoneBounds = it.boundsInRoot()
                },
            ) {
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
                            painter = rememberVectorPainter(SddsIcons.SaluteOutline24),
                            contentDescription = null,
                        )
                    },
                )
            }
            DraggableContent(
                onBoundsChanged = { fileBounds = it },
            )

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
                    source = imageVectorSource(SddsIcons.SaluteOutline24),
                    contentDescription = null,
                )
            },
        )
    }
}

@Composable
private fun DraggableContent(
    onBoundsChanged: (Rect) -> Unit,
) {
    val fileStyle = FileStyle.builder()
        .colors {
            labelColor(LocalTextStyle.current.color)
            iconColor(LocalTextStyle.current.color)
        }
        .labelStyle(LocalTextStyle.current)
        .style()
    var offset by remember { mutableStateOf(Offset.Zero) }
    File(
        style = fileStyle,
        modifier = Modifier
            .offset {
                IntOffset(
                    offset.x.roundToInt(),
                    offset.y.roundToInt(),
                )
            }
            .onGloballyPositioned {
                onBoundsChanged(it.boundsInRoot())
            }
            .pointerInput(Unit) {
                detectDragGestures(
                    onDragEnd = { offset = Offset.Zero },
                    onDragCancel = { offset = Offset.Zero },
                ) { change, dragAmount ->
                    change.consume()
                    offset += dragAmount
                }
            },
        labelContent = {
            Text(
                text = "Draggable file",
            )
        },
        descriptionContent = {},
        image = {
            Icon(
                painter = rememberVectorPainter(SddsIcons.FileCheckFill36),
                contentDescription = null,
            )
        },
    )
}
