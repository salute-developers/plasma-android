package com.sdds.compose.uikit.fixtures.stories.note

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.LinkButton
import com.sdds.compose.uikit.Note
import com.sdds.compose.uikit.NoteCompact
import com.sdds.compose.uikit.NoteCompactStyle
import com.sdds.compose.uikit.NoteStyle
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.NoteUiStatePropertiesProducer
import com.sdds.sandbox.NoteUiStateTransformer
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/**
 * Состояние Note и NoteCompact
 * @property title заголовок
 * @property text текст
 * @property hasAction наличие actions
 */
@StoryUiState
data class NoteUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val title: String = "Title",
    val text: String = "Text",
    val hasAction: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object NoteStory : ComposeBaseStory<NoteUiState, NoteStyle>(
    ComponentKey.Note,
    NoteUiState(),
    NoteUiStatePropertiesProducer,
    NoteUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: NoteStyle,
        state: NoteUiState,
    ) {
        Note(
            modifier = Modifier.sizeIn(maxWidth = 300.dp, maxHeight = 200.dp),
            style = style,
            text = state.text,
            title = state.title,
            contentBefore = {
                Icon(
                    painter = painterResource(R.drawable.ic_salute_outline_36),
                    contentDescription = null,
                )
            },
            action = if (state.hasAction) {
                {
                    LinkButton(
                        label = "Label",
                        onClick = {},
                    )
                }
            } else {
                null
            },
        )
    }
}

@Story
object NoteCompactStory : ComposeBaseStory<NoteUiState, NoteCompactStyle>(
    ComponentKey.NoteCompact,
    NoteUiState(),
    NoteUiStatePropertiesProducer,
    NoteUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: NoteCompactStyle,
        state: NoteUiState,
    ) {
        NoteCompact(
            modifier = Modifier.sizeIn(maxWidth = 400.dp, maxHeight = 300.dp),
            style = style,
            text = state.text,
            title = state.title,
            contentBefore = {
                Icon(
                    painter = painterResource(R.drawable.ic_salute_outline_36),
                    contentDescription = null,
                )
            },
            action = if (state.hasAction) {
                {
                    LinkButton(
                        label = "Label",
                        onClick = {},
                    )
                }
            } else {
                null
            },
        )
    }
}
