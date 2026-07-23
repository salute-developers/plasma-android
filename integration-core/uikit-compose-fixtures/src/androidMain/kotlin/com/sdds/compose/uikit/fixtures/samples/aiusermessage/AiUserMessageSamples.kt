package com.sdds.compose.uikit.fixtures.samples.aiusermessage

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.EditableStyle
import com.sdds.compose.uikit.File
import com.sdds.compose.uikit.FileActionPlacement
import com.sdds.compose.uikit.FileStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.ImageStyle
import com.sdds.compose.uikit.ai.AiUserMessage
import com.sdds.compose.uikit.ai.AiUserMessageStyle
import com.sdds.docs.DocSample
import com.sdds.docs.composableCodeSnippet
import com.sdds.icons.R

@Composable
@DocSample(needScreenshot = true)
fun AiUserMessage_Simple() {
    composableCodeSnippet {
        var text by remember { mutableStateOf("text") }
        AiUserMessage(
            modifier = Modifier.fillMaxWidth(),
            value = text,
            onValueChange = { text = it },
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun AiUserMessage_WithActions() {
    composableCodeSnippet {
        var text by remember { mutableStateOf("text") }
        AiUserMessage(
            modifier = Modifier.fillMaxWidth(),
            value = text,
            onValueChange = { text = it },
            actions = {
                button { IconButton(iconRes = R.drawable.ic_backward_outline_24, onClick = {}) }
                button { IconButton(iconRes = R.drawable.ic_copy_outline_24, onClick = {}) }
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun AiUserMessage_WithEditableActions() {
    composableCodeSnippet {
        var text by remember { mutableStateOf("text") }
        AiUserMessage(
            modifier = Modifier.fillMaxWidth(),
            value = text,
            isInEdit = true,
            onValueChange = { text = it },
            editableActions = {
                button {
                    Button(label = "Сохранить", onClick = {})
                }
                button {
                    Button(label = "Отменить", onClick = {})
                }
            },
            actions = {
                button { IconButton(iconRes = R.drawable.ic_backward_outline_24, onClick = {}) }
                button { IconButton(iconRes = R.drawable.ic_copy_outline_24, onClick = {}) }
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun AiUserMessage_FullUsage() {
    composableCodeSnippet {
        var editMode by remember { mutableStateOf(false) }
        var message by remember { mutableStateOf("Text") }
        var draftMessage by remember { mutableStateOf("") }

        AiUserMessage(
            modifier = Modifier.fillMaxWidth(),
            value = if (editMode) draftMessage else message,
            onValueChange = { draftMessage = it },
            isInEdit = editMode,
            uploadingContent =
            {
                repeat(5) {
                    File(
                        modifier = Modifier.width(200.dp),
                        label = "some_file$it.pdf",
                        isLoading = false,
                        image = {
                            Icon(
                                painterResource(R.drawable.ic_file_check_fill_24),
                                contentDescription = "",
                            )
                        },
                        action = {
                            IconButton(
                                iconRes = R.drawable.ic_close_16,
                                onClick = {},
                            )
                        },
                        actionPlacement = FileActionPlacement.End,
                    )
                }
            },
            editableActions =
            {
                button {
                    Button(label = "Сохранить", onClick = {
                        message = draftMessage
                        editMode = false
                    })
                }
                button {
                    Button(label = "Отменить", onClick = {
                        draftMessage = message
                        editMode = false
                    })
                }
            },
            actions =
            {
                button { IconButton(iconRes = R.drawable.ic_backward_outline_24, onClick = {}) }
                button { IconButton(iconRes = R.drawable.ic_copy_outline_24, onClick = {}) }
                button { IconButton(iconRes = R.drawable.ic_plasma_24, onClick = {}) }
                button {
                    IconButton(iconRes = R.drawable.ic_edit_outline_24, onClick = {
                        draftMessage = message
                        editMode = true
                    })
                }
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun AiUserMessage_Style() {
    composableCodeSnippet {
        AiUserMessageStyle.builder()
            .uploadingShape(placeholder(RoundedCornerShape(0.dp), "/** Токен формы (скругления) */"))
            .messageShape(placeholder(RoundedCornerShape(0.dp), "/** Токен формы (скругления) */"))
            .textStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .editableStyle(
                placeholder(
                    EditableStyle.builder().style(),
                    "/** Стиль редактируемого поля */",
                ),
            )
            .actionsButtonGroupStyle(
                placeholder(
                    ButtonGroupStyle.builder().style(),
                    "/** Стиль группы кнопок, расположенных внизу */",
                ),
            )
            .editableActionsButtonGroupStyle(
                placeholder(
                    ButtonGroupStyle.builder().style(),
                    "/** Стиль группы кнопок, отображающихся в режиме редактирования */",
                ),
            )
            .uploadingImageStyle(
                placeholder(
                    ImageStyle.builder().style(),
                    "/** Стиль загружаемых изображений */",
                ),
            )
            .uploadingFileStyle(
                placeholder(
                    FileStyle.builder().style(),
                    "/** Стиль загружаемых файлов */",
                ),
            )
            .colors {
                textColor(placeholder(Color.White, "/** Токен цвета */"))
                uploadingBackground(placeholder(Color.White, "/** Токен цвета */"))
                messageBackground(placeholder(Color.White, "/** Токен цвета */"))
            }
            .dimensions {
                uploadingPaddingStart(0.0.dp)
                uploadingPaddingEnd(0.0.dp)
                uploadingPaddingTop(0.0.dp)
                uploadingPaddingBottom(0.0.dp)
                messagePaddingStart(18.0.dp)
                messagePaddingEnd(18.0.dp)
                messagePaddingTop(21.0.dp)
                messagePaddingBottom(21.0.dp)
                uploadingGroupGap(10.0.dp)
                uploadingFilesGap(0.0.dp)
                actionsGap(12.0.dp)
                editableActionsGap(16.0.dp)
            }
            .style()
    }
}
