package com.sdds.compose.uikit.fixtures.stories.counter

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.CounterStyle
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.CounterUiStatePropertiesProducer
import com.sdds.sandbox.CounterUiStateTransformer
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/**
 * Состояние Counter
 * @property count текст
 */
@StoryUiState
data class CounterUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val count: String = "1",
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object CounterStory : ComposeBaseStory<CounterUiState, CounterStyle>(
    ComponentKey.Counter,
    CounterUiState(),
    CounterUiStatePropertiesProducer,
    CounterUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: CounterStyle,
        state: CounterUiState,
    ) {
        Counter(
            style = style,
            count = state.count,
        )
    }
}
