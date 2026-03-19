package com.sdds.compose.uikit.fixtures.stories.indicator

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Indicator
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.IndicatorUiStatePropertiesProducer
import com.sdds.sandbox.IndicatorUiStateTransformer
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/**
 * Состояние компонента Indicator
 * @property variant состояние компонента
 */
@StoryUiState
data class IndicatorUiState(
    override val variant: String = "",
    override val appearance: String = "",
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object IndicatorStory : ComposeBaseStory<IndicatorUiState, IndicatorStyle>(
    ComponentKey.Indicator,
    IndicatorUiState(),
    IndicatorUiStatePropertiesProducer,
    IndicatorUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: IndicatorStyle,
        state: IndicatorUiState,
    ) {
        Indicator(style = style)
    }

    @Composable
    override fun Preview(
        style: IndicatorStyle,
        key: ComponentKey,
    ) {
        Indicator(
            style = style,
        )
    }
}
