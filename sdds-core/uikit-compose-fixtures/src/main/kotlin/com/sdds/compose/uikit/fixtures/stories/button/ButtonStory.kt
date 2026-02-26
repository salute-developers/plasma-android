package com.sdds.compose.uikit.fixtures.stories.button

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonSpacing
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.sandbox.ButtonUiStatePropertiesProducer
import com.sdds.sandbox.ButtonUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class ButtonUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val label: String = "label",
    val value: String = "value",
    val spacing: ButtonSpacing = ButtonSpacing.SpaceBetween,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object BasicButtonStory: ComposeBaseStory<ButtonUiState, ButtonStyle>(
    ComponentKey.BasicButton,
    ButtonUiState(),
    ButtonUiStatePropertiesProducer,
    ButtonUiStateTransformer
) {
    @Composable
    override fun BoxScope.Content(style: ButtonStyle, state: ButtonUiState) {
        Button(
            style = style,
            label = state.label,
            value = state.value,
            onClick = {},
        )
    }

}
