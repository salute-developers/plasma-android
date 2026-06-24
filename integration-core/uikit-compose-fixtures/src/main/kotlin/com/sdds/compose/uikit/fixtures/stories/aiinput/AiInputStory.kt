package com.sdds.compose.uikit.fixtures.stories.aiinput

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.ButtonGroup
import com.sdds.compose.uikit.File
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.ai.AiInput
import com.sdds.compose.uikit.ai.AiInputStyle
import com.sdds.compose.uikit.fixtures.stories.AiInputUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.AiInputUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class AiInputUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val placeholder: String = "Введите сообщение",
    val hasContent: Boolean = false,
    val hasActionBefore: Boolean = true,
    val hasActionAfter: Boolean = false,
    val hasMaxHeight: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState =
        copy(appearance = appearance, variant = variant)
}

private val FILE_WIDTH = 160.dp

@Story
object AiInputStory : ComposeBaseStory<AiInputUiState, AiInputStyle>(
    ComponentKey.AiInput,
    AiInputUiState(),
    AiInputUiStatePropertiesProducer,
    AiInputUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: AiInputStyle,
        state: AiInputUiState,
    ) {
        var textValue by remember { mutableStateOf(TextFieldValue("")) }

        AiInput(
            value = textValue,
            onValueChange = { textValue = it },
            modifier = if (state.hasMaxHeight) Modifier.heightIn(max = 300.dp) else Modifier,
            style = style,
            placeholder = if (state.placeholder.isNotEmpty()) {
                {
                    Text(
                        text = state.placeholder,
                        maxLines = 1,
                        softWrap = false,
                        modifier = Modifier.horizontalScroll(rememberScrollState()),
                    )
                }
            } else {
                null
            },
            content = if (state.hasContent) {
                {
                    File(
                        modifier = Modifier.width(FILE_WIDTH),
                        labelContent = { FileLabel("document.pdf") },
                        descriptionContent = { Text(text = "245 KB") },
                        image = { FileImage() },
                        action = { FileCloseAction() },
                    )
                    File(
                        modifier = Modifier.width(FILE_WIDTH),
                        labelContent = { FileLabel("image.png") },
                        descriptionContent = { Text(text = "1.2 MB") },
                        image = { FileImage() },
                        action = { FileCloseAction() },
                    )
                    File(
                        modifier = Modifier.width(FILE_WIDTH),
                        labelContent = { FileLabel("archive.zip") },
                        descriptionContent = { Text(text = "8.5 MB") },
                        image = { FileImage() },
                        action = { FileCloseAction() },
                    )
                    File(
                        modifier = Modifier.width(FILE_WIDTH),
                        labelContent = { FileLabel("very-long-file-name-that-overflows.zip") },
                        descriptionContent = { Text(text = "8.5 MB") },
                        image = { FileImage() },
                        action = { FileCloseAction() },
                    )
                    File(
                        modifier = Modifier.width(FILE_WIDTH),
                        labelContent = { FileLabel("archive.zip") },
                        descriptionContent = { Text(text = "8.5 MB") },
                        image = { FileImage() },
                        action = { FileCloseAction() },
                    )
                }
            } else {
                null
            },
            startControls = if (state.hasActionBefore) {
                {
                    ButtonGroup {
                        button {
                            IconButton(
                                iconRes = com.sdds.icons.R.drawable.ic_clip_24,
                                onClick = {},
                            )
                        }
                        button {
                            IconButton(
                                iconRes = com.sdds.icons.R.drawable.ic_settings_filter_24,
                                onClick = {},
                            )
                        }
                    }
                }
            } else {
                null
            },
            endControls = if (state.hasActionAfter) {
                {
                    ButtonGroup {
                        button {
                            IconButton(
                                iconRes = com.sdds.icons.R.drawable.ic_mic_outline_24,
                                onClick = {},
                            )
                        }
                    }
                }
            } else {
                null
            },
            sendButton = {
                IconButton(
                    iconRes = com.sdds.icons.R.drawable.ic_send_outline_24,
                    onClick = {},
                )
            },
        )
    }

    @Composable
    private fun FileLabel(text: String) {
        Text(
            text = text,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
    }

    @Composable
    private fun FileImage() {
        Icon(
            painter = painterResource(id = com.sdds.icons.R.drawable.ic_file_check_fill_36),
            contentDescription = null,
        )
    }

    @Composable
    private fun FileCloseAction() {
        IconButton(
            iconRes = com.sdds.icons.R.drawable.ic_close_16,
            onClick = {},
        )
    }

    @Composable
    override fun Preview(style: AiInputStyle, key: ComponentKey) {
        var textValue by remember { mutableStateOf(TextFieldValue("")) }
        AiInput(
            value = textValue,
            onValueChange = { textValue = it },
            modifier = Modifier.fillMaxWidth(),
            style = style,
            placeholder = {
                Text(
                    text = "Введите сообщение",
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            },
            startControls = {
                ButtonGroup {
                    button {
                        IconButton(
                            iconRes = com.sdds.icons.R.drawable.ic_clip_24,
                            onClick = {},
                        )
                    }
                    button {
                        IconButton(
                            iconRes = com.sdds.icons.R.drawable.ic_settings_filter_24,
                            onClick = {},
                        )
                    }
                }
            },
            endControls = {
                ButtonGroup {
                    button {
                        IconButton(
                            iconRes = com.sdds.icons.R.drawable.ic_mic_outline_24,
                            onClick = {},
                        )
                    }
                }
            },
            sendButton = {
                IconButton(
                    iconRes = com.sdds.icons.R.drawable.ic_send_outline_24,
                    onClick = {},
                )
            },
        )
    }
}
