package com.sdds.compose.uikit.fixtures.stories.progress

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.ProgressBar
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.compose.uikit.fixtures.stories.ProgressUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.ProgressUiStateTransformer
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
data class ProgressUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val progress: Float = 0.5f,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object ProgressStory : ComposeBaseStory<ProgressUiState, ProgressBarStyle>(
    ComponentKey.ProgressBar,
    ProgressUiState(),
    ProgressUiStatePropertiesProducer,
    ProgressUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: ProgressBarStyle,
        state: ProgressUiState,
    ) {
        ProgressBar(
            progress = state.progress,
            modifier = Modifier.width(240.dp),
            style = style,
        )
    }

    @Composable
    override fun Preview(
        style: ProgressBarStyle,
        key: ComponentKey,
    ) {
        ProgressBar(
            progress = 0.25f,
            modifier = Modifier.width(240.dp),
            style = style,
        )
    }
}
