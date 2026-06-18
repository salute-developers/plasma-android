package com.sdds.compose.uikit.fixtures.stories.splitter

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Splitter
import com.sdds.compose.uikit.SplitterOrientation
import com.sdds.compose.uikit.SplitterStyle
import com.sdds.compose.uikit.fixtures.stories.SplitterUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.SplitterUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/**
 * Состояние компонента Splitter
 * @property variant вариант компонента
 */
@StoryUiState
data class SplitterUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val orientation: SplitterOrientation = SplitterOrientation.Horizontal,
    val hasHandle: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object SplitterStory : ComposeBaseStory<SplitterUiState, SplitterStyle>(
    ComponentKey.Splitter,
    SplitterUiState(),
    SplitterUiStatePropertiesProducer,
    SplitterUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: SplitterStyle,
        state: SplitterUiState,
    ) {
        Splitter(style = style, orientation = state.orientation, hasHandle = state.hasHandle)
    }

    @Composable
    override fun Preview(
        style: SplitterStyle,
        key: ComponentKey,
    ) {
        Splitter(
            style = style,
            orientation = SplitterOrientation.Horizontal,
            hasHandle = true,
        )
    }
}
