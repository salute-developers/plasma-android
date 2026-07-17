package com.sdds.compose.uikit.fixtures.samples.dropzone

import android.content.ClipData
import androidx.compose.foundation.draganddrop.dragAndDropSource
import androidx.compose.foundation.draganddrop.dragAndDropTarget
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draganddrop.DragAndDropEvent
import androidx.compose.ui.draganddrop.DragAndDropTarget
import androidx.compose.ui.draganddrop.DragAndDropTransferData
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.DropZone
import com.sdds.compose.uikit.DropZoneBorderType
import com.sdds.compose.uikit.DropZoneIconPlacement
import com.sdds.compose.uikit.DropZoneState
import com.sdds.compose.uikit.DropZoneStyle
import com.sdds.compose.uikit.File
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.OverlayStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.motion.components.dropzone.rememberDropZoneMotion
import com.sdds.compose.uikit.resourceImageSource
import com.sdds.docs.DocSample
import com.sdds.docs.composableCodeSnippet
import com.sdds.icons.R

@Composable
@DocSample(needScreenshot = true)
fun DropZone_Simple() {
    composableCodeSnippet {
        DropZone(
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
                    source = resourceImageSource(R.drawable.ic_salute_outline_24),
                    contentDescription = null,
                )
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun DropZone_With_Draggable_Content() {
    composableCodeSnippet {
        var dragOver by remember { mutableStateOf(false) }
        var state by remember { mutableStateOf(DropZoneState.Idle) }
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
                        .focusable(state != DropZoneState.Disabled, motion.context.interactionSource),
                    state = if (dragOver) DropZoneState.DraggingOver else state,
                    motion = motion,
                    iconPlacement = DropZoneIconPlacement.Top,
                    title = {
                        Text(text = "title")
                    },
                    description = {
                        Text(text = "description")
                    },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.ic_salute_outline_24),
                            contentDescription = null,
                        )
                    },
                )
            }

            File(
                modifier = Modifier.dragAndDropSource(transferData = {
                    DragAndDropTransferData(
                        clipData = ClipData.newPlainText("demo", "demo"),
                    )
                }),
                labelContent = {
                    Text(
                        text = "Draggable file",
                    )
                },
                descriptionContent = {},
                image = {
                    Icon(
                        painter = painterResource(R.drawable.ic_file_check_fill_36),
                        contentDescription = null,
                    )
                },
            )
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun DropZone_Style() {
    composableCodeSnippet {
        DropZoneStyle.builder()
            .shape(placeholder(RoundedCornerShape(10.dp), "/** Токен формы (скругления) */"))
            .overlayStyle(placeholder(OverlayStyle.builder().style(), "/** Стиль overlay */"))
            .iconPlacement(DropZoneIconPlacement.Top)
            .borderType(DropZoneBorderType.Dashes)
            .colors {
                background(placeholder(Color.White, "/** Токен цвета */"))
                iconColor(placeholder(Color.DarkGray, "/** Токен цвета */"))
                titleColor(placeholder(Color.Black, "/** Токен цвета */"))
                descriptionColor(placeholder(Color.Black, "/** Токен цвета */"))
                borderColor(placeholder(Color.Green, "/** Токен цвета */"))
            }
            .dimensions {
                paddingStart(24.0.dp)
                paddingEnd(24.0.dp)
                paddingTop(24.0.dp)
                paddingBottom(24.0.dp)
                iconSize(24.0.dp)
                borderThickness(1.0.dp)
                borderDashWidth(6.0.dp)
                borderDashGap(8.0.dp)
                iconPadding(8.0.dp)
                gap(12.0.dp)
            }
            .disableAlpha(0.4f)
            .titleStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .descriptionStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .style()
    }
}
