package com.sdds.compose.uikit.fixtures.stories.notificationcontent

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.NotificationContent
import com.sdds.compose.uikit.NotificationContentStyle
import com.sdds.compose.uikit.fixtures.stories.NotificationContentUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.NotificationContentUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class NotificationContentUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val title: String = "Title",
    val text: String = "Text",
    val hasActions: Boolean = true,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object NotificationContentStory :
    ComposeBaseStory<NotificationContentUiState, NotificationContentStyle>(
        ComponentKey.NotificationContent,
        NotificationContentUiState(),
        NotificationContentUiStatePropertiesProducer,
        NotificationContentUiStateTransformer,
    ) {
    @Composable
    override fun BoxScope.Content(
        style: NotificationContentStyle,
        state: NotificationContentUiState,
    ) {
        NotificationContent(
            modifier = Modifier.fillMaxWidth(0.7f),
            style = style,
            title = state.title,
            text = state.text,
            buttons = if (state.hasActions) {
                {
                    button { Button("Ok", {}) }
                    button { Button("Cancel", {}) }
                }
            } else {
                null
            },
        )
    }

    @Composable
    override fun Preview(
        style: NotificationContentStyle,
        key: ComponentKey,
    ) {
        NotificationContent(
            modifier = Modifier.fillMaxWidth(0.6f),
            style = style,
            title = "Title",
            text = "Text",
            buttons = {
                button { Button("Ok", {}) }
                button { Button("Cancel", {}) }
            },
        )
    }
}
