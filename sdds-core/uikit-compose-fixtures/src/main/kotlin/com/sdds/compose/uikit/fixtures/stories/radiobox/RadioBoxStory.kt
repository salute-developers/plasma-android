package com.sdds.compose.uikit.fixtures.stories.radiobox

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.RadioBoxUiStatePropertiesProducer
import com.sdds.sandbox.RadioBoxUiStateTransformer
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/**
 * Состояние radiobox
 *
 * @property checked состояние radiobox
 * @property label текст лэйбла
 * @property description текст описания
 * @property enabled включен ли radiobox
 */
@StoryUiState
data class RadioBoxUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val checked: Boolean = false,
    val label: String = "Label",
    val description: String = "Description",
    val enabled: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object RadioBoxStory : ComposeBaseStory<RadioBoxUiState, RadioBoxStyle>(
    ComponentKey.RadioBox,
    RadioBoxUiState(),
    RadioBoxUiStatePropertiesProducer,
    RadioBoxUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: RadioBoxStyle,
        state: RadioBoxUiState,
    ) {
        RadioBox(
            style = style,
            checked = state.checked,
            onClick = {},
            label = state.label,
            description = state.description,
            enabled = state.enabled,
        )
    }
}
