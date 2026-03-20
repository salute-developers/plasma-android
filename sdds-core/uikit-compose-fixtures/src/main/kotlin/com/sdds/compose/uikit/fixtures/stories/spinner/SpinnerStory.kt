package com.sdds.compose.uikit.fixtures.stories.spinner

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Spinner
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.SpinnerUiStatePropertiesProducer
import com.sdds.sandbox.SpinnerUiStateTransformer
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class SpinnerUiState(
    override val variant: String = "",
    override val appearance: String = "",
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object SpinnerStory : ComposeBaseStory<SpinnerUiState, SpinnerStyle>(
    ComponentKey.Spinner,
    SpinnerUiState(),
    SpinnerUiStatePropertiesProducer,
    SpinnerUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: SpinnerStyle,
        state: SpinnerUiState,
    ) {
        Spinner(style = style)
    }

    @Composable
    override fun Preview(
        style: SpinnerStyle,
        key: ComponentKey,
    ) {
        Spinner(
            style = style,
        )
    }
}
