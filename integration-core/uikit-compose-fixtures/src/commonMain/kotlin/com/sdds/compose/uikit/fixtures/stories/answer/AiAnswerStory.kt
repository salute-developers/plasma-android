package com.sdds.compose.uikit.fixtures.stories.answer

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.ai.AiAnswer
import com.sdds.compose.uikit.ai.AiAnswerError
import com.sdds.compose.uikit.ai.AiAnswerLoading
import com.sdds.compose.uikit.ai.AiAnswerState
import com.sdds.compose.uikit.ai.AiAnswerStyle
import com.sdds.compose.uikit.fixtures.stories.AiAnswerUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.AiAnswerUiStateTransformer
import com.sdds.compose.uikit.imageVectorSource
import com.sdds.icons.compose.CopyOutline24
import com.sdds.icons.compose.DislikeOutline24
import com.sdds.icons.compose.LikeOutline24
import com.sdds.icons.compose.RepeatOutline24
import com.sdds.icons.compose.SddsIcons
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class AiAnswerUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val state: AiAnswerState = AiAnswerState.Default,
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
object AiAnswerStory : ComposeBaseStory<AiAnswerUiState, AiAnswerStyle>(
    ComponentKey.AiAnswer,
    AiAnswerUiState(),
    AiAnswerUiStatePropertiesProducer,
    AiAnswerUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: AiAnswerStyle,
        state: AiAnswerUiState,
    ) {
        AiAnswerStoryContent(style = style, state = state)
    }

    @Composable
    override fun Preview(
        style: AiAnswerStyle,
        key: ComponentKey,
    ) {
        Box(modifier = Modifier.padding(16.dp)) {
            AiAnswerStoryContent(style = style, state = defaultState)
        }
    }
}

@Composable
private fun AiAnswerStoryContent(
    style: AiAnswerStyle,
    state: AiAnswerUiState,
) {
    AiAnswer(
        style = style,
        state = state.state,
        title = if (state.title.isNotBlank()) {
            { Text(state.title) }
        } else {
            null
        },
        content = { Text("Это содержимое ответа. Здесь может быть любой composable.") },
        error = {
            AiAnswerError(
                title = { Text(state.errorText) },
                text = if (state.errorSubtitle.isNotBlank()) {
                    { Text(state.errorSubtitle) }
                } else {
                    null
                },
            )
        },
        loading = {
            AiAnswerLoading(
                text = { Text(state.loadingTitle) },
            )
        },
        actionsStart = if (state.hasActionsStart) {
            {
                button { AiAnswerActionIconButton(iconRes = SddsIcons.CopyOutline24) }
                button { AiAnswerActionIconButton(iconRes = SddsIcons.LikeOutline24) }
                button { AiAnswerActionIconButton(iconRes = SddsIcons.DislikeOutline24) }
                button { AiAnswerActionIconButton(iconRes = SddsIcons.RepeatOutline24) }
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
private fun AiAnswerActionIconButton(
    iconRes: ImageVector,
) {
    IconButton(
        iconSource = imageVectorSource(iconRes),
        onClick = {},
    )
}
