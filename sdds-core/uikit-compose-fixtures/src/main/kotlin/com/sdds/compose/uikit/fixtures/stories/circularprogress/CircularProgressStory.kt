package com.sdds.compose.uikit.fixtures.stories.circularprogress

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.CircularProgressBar
import com.sdds.compose.uikit.CircularProgressBarStyle
import com.sdds.sandbox.CircularProgressUiStatePropertiesProducer
import com.sdds.sandbox.CircularProgressUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/**
 * Состояние компонента Progress
 * @property variant стиль компонента
 * @property progress текущий прогресс
 */
@StoryUiState
data class CircularProgressUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val progress: Float = 0.5f,
    val trackEnabled: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object CircularProgressStory : ComposeBaseStory<CircularProgressUiState, CircularProgressBarStyle>(
    ComponentKey.CircularProgressBar,
    CircularProgressUiState(),
    CircularProgressUiStatePropertiesProducer,
    CircularProgressUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: CircularProgressBarStyle,
        state: CircularProgressUiState,
    ) {
        CircularProgressBar(
            progress = state.progress,
            style = style,
            trackEnabled = state.trackEnabled,
        )
    }
}
