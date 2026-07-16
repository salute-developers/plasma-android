package com.sdds.compose.uikit.fixtures.stories.aiusermessage

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.File
import com.sdds.compose.uikit.FileActionPlacement
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.ai.AiUserMessage
import com.sdds.compose.uikit.ai.AiUserMessageStyle
import com.sdds.compose.uikit.fixtures.FixtureR
import com.sdds.compose.uikit.fixtures.painterResource
import com.sdds.compose.uikit.fixtures.resourceImageSource
import com.sdds.compose.uikit.fixtures.stories.AiUserMessageUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.AiUserMessageUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class AiUserMessageUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val hasActions: Boolean = true,
    val hasEditableActions: Boolean = true,
    val hasUploadingContent: Boolean = true,
    val isInEdit: Boolean = false,
    val filesGroup: Boolean = false,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object AiUserMessageStory : ComposeBaseStory<AiUserMessageUiState, AiUserMessageStyle>(
    ComponentKey.AiUserMessage,
    AiUserMessageUiState(),
    AiUserMessageUiStatePropertiesProducer,
    AiUserMessageUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: AiUserMessageStyle,
        state: AiUserMessageUiState,
    ) {
        var editMode by remember(state.isInEdit) { mutableStateOf(state.isInEdit) }
        var message by remember { mutableStateOf("Сообщение пользователя") }
        var draftMessage by remember { mutableStateOf(message) }

        AiUserMessage(
            modifier = Modifier.fillMaxWidth(),
            style = style,
            value = if (editMode) draftMessage else message,
            onValueChange = { draftMessage = it },
            isInEdit = editMode,
            uploadingContent = if (state.hasUploadingContent) {
                {
                    if (state.variant.contains("File", true)) {
                        UploadingFile(state.filesGroup)
                    } else {
                        UploadingImage()
                    }
                }
            } else {
                null
            },
            editableActions = if (state.hasEditableActions) {
                {
                    button {
                        Button(
                            label = "Сохранить",
                            onClick = {
                                message = draftMessage
                                editMode = false
                                updateState(state.copy(isInEdit = false))
                            },
                        )
                    }
                    button {
                        Button(
                            label = "Отменить",
                            onClick = {
                                draftMessage = message
                                editMode = false
                                updateState(state.copy(isInEdit = false))
                            },
                        )
                    }
                }
            } else {
                null
            },
            actions = if (state.hasActions) {
                {
                    button {
                        IconButton(
                            iconSource = resourceImageSource(FixtureR.drawable.ic_backward_outline_24),
                            onClick = {},
                        )
                    }
                    button {
                        IconButton(
                            iconSource = resourceImageSource(FixtureR.drawable.ic_copy_outline_24),
                            onClick = {},
                        )
                    }
                    button {
                        IconButton(
                            iconSource = resourceImageSource(FixtureR.drawable.ic_plasma_24),
                            onClick = {},
                        )
                    }
                    button {
                        IconButton(
                            iconSource = resourceImageSource(FixtureR.drawable.ic_edit_outline_24),
                            onClick = {
                                draftMessage = message
                                editMode = true
                                updateState(state.copy(isInEdit = true))
                            },
                        )
                    }
                }
            } else {
                null
            },
        )
    }

    @Composable
    override fun Preview(
        style: AiUserMessageStyle,
        key: ComponentKey,
    ) {
        AiUserMessage(
            modifier = Modifier.fillMaxWidth(),
            style = style,
            value = "Text",
            onValueChange = {},
            isInEdit = false,
            actions =
            {
                button {
                    IconButton(
                        iconSource = resourceImageSource(FixtureR.drawable.ic_backward_outline_24),
                        onClick = {},
                    )
                }
                button {
                    IconButton(
                        iconSource = resourceImageSource(FixtureR.drawable.ic_copy_outline_24),
                        onClick = {},
                    )
                }
                button { IconButton(iconSource = resourceImageSource(FixtureR.drawable.ic_plasma_24), onClick = {}) }
            },
        )
    }
}

@Composable
private fun UploadingFile(group: Boolean = false) {
    if (group) {
        repeat(5) {
            FileExample(count = it)
        }
    } else {
        FileExample()
    }
}

@Composable
private fun UploadingImage() {
    AsyncImage(
        modifier = Modifier,
        contentScale = ContentScale.Fit,
        model = "https://cdn.costumewall.com/wp-content/uploads/2018/09/michael-scott.jpg",
        contentDescription = "FileImage",
    )
}

@Composable
private fun FileExample(count: Int = 1) {
    File(
        modifier = Modifier.width(200.dp),
        label = "some_file$count.pdf",
        isLoading = false,
        image = {
            Icon(
                painterResource(FixtureR.drawable.ic_file_check_fill_24),
                contentDescription = "",
            )
        },
        action = {
            IconButton(
                iconSource = resourceImageSource(FixtureR.drawable.ic_close_16),
                onClick = {},
            )
        },
        actionPlacement = FileActionPlacement.End,
    )
}
