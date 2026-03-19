package com.sdds.compose.uikit.fixtures.stories.divider

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Divider
import com.sdds.compose.uikit.DividerStyle
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.DividerUiStatePropertiesProducer
import com.sdds.sandbox.DividerUiStateTransformer
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/**
 * Состояние компонента Divider
 * @property variant вариант компонента
 */
@StoryUiState
data class DividerUiState(
    override val variant: String = "",
    override val appearance: String = "",
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object DividerStory : ComposeBaseStory<DividerUiState, DividerStyle>(
    ComponentKey.Divider,
    DividerUiState(),
    DividerUiStatePropertiesProducer,
    DividerUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: DividerStyle,
        state: DividerUiState,
    ) {
        Divider(style = style)
    }

    @Composable
    override fun Preview(
        style: DividerStyle,
        key: ComponentKey,
    ) {
        Divider(style = style)
    }
}
