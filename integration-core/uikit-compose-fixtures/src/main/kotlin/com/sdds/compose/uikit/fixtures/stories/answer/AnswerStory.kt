package com.sdds.compose.uikit.fixtures.stories.answer

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.ai.Answer
import com.sdds.compose.uikit.ai.AnswerError
import com.sdds.compose.uikit.ai.AnswerLoading
import com.sdds.compose.uikit.ai.AnswerState
import com.sdds.compose.uikit.ai.AnswerStyle
import com.sdds.compose.uikit.fixtures.stories.AnswerUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.AnswerUiStateTransformer
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class AnswerUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val state: AnswerState = AnswerState.Default,
    val title: String = "Заголовок ответа",
    val errorText: String = "Произошла ошибка",
    val errorSubtitle: String = "Не удалось получить ответ. Попробуйте ещё раз.",
    val loadingTitle: String = "Генерирую ответ...",
    val hasActionsStart: Boolean = true,
    val hasActionsEnd: Boolean = true,
    val hasSuggestions: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object AnswerStory : ComposeBaseStory<AnswerUiState, AnswerStyle>(
    ComponentKey.Answer,
    AnswerUiState(),
    AnswerUiStatePropertiesProducer,
    AnswerUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: AnswerStyle,
        state: AnswerUiState,
    ) {
        AnswerStoryContent(style = style, state = state)
    }

    @Composable
    override fun Preview(
        style: AnswerStyle,
        key: ComponentKey,
    ) {
        Box(modifier = Modifier.padding(16.dp)) {
            AnswerStoryContent(style = style, state = defaultState)
        }
    }
}

@Composable
private fun AnswerStoryContent(
    style: AnswerStyle,
    state: AnswerUiState,
) {
    Answer(
        style = style,
        state = state.state,
        title = if (state.title.isNotBlank()) {
            { Text(state.title) }
        } else {
            null
        },
        content = { Text("Это содержимое ответа. Здесь может быть любой composable.") },
        error = {
            AnswerError(
                title = { Text(state.errorText) },
                text = if (state.errorSubtitle.isNotBlank()) {
                    { Text(state.errorSubtitle) }
                } else {
                    null
                },
            )
        },
        loading = {
            AnswerLoading(
                text = { Text(state.loadingTitle) },
            )
        },
        actionsStart = if (state.hasActionsStart) {
            {
                button { AnswerActionIconButton(iconRes = R.drawable.ic_copy_outline_24) }
                button { AnswerActionIconButton(iconRes = R.drawable.ic_like_outline_24) }
                button { AnswerActionIconButton(iconRes = R.drawable.ic_dislike_outline_24) }
                button { AnswerActionIconButton(iconRes = R.drawable.ic_repeat_outline_24) }
            }
        } else {
            null
        },
        actionsEnd = if (state.hasActionsEnd) {
            {
                button { Button(label = "Перейти в источник", onClick = {}) }
            }
        } else {
            null
        },
        suggestions = if (state.hasSuggestions) {
            {
                Chip(label = "Подробнее", onClick = {})
                Chip(label = "Кратко", onClick = {})
                Chip(label = "Другое действие", onClick = {})
            }
        } else {
            null
        },
    )
}

@Composable
private fun AnswerActionIconButton(
    iconRes: Int,
) {
    IconButton(
        iconRes = iconRes,
        onClick = {},
    )
}
