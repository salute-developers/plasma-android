package com.sdds.compose.uikit.fixtures.stories.checkbox

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.state.ToggleableState
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.fixtures.stories.CheckBoxUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.CheckBoxUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/**
 * Состояние checkbox
 *
 * @property state состояние checkbox
 * @property label текст лэйбла
 * @property description текст описания
 * @property enabled включен ли checkbox
 */
@StoryUiState
data class CheckBoxUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val state: ToggleableState = ToggleableState.Indeterminate,
    val label: String = "Label",
    val description: String = "Description",
    val enabled: Boolean = true,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object CheckBoxStory : ComposeBaseStory<CheckBoxUiState, CheckBoxStyle>(
    ComponentKey.CheckBox,
    CheckBoxUiState(),
    CheckBoxUiStatePropertiesProducer,
    CheckBoxUiStateTransformer,
) {

    @Composable
    override fun BoxScope.Content(
        style: CheckBoxStyle,
        state: CheckBoxUiState,
    ) {
        CheckBox(
            style = style,
            state = state.state,
            label = state.label,
            description = state.description,
            enabled = state.enabled,
        )
    }

    @Composable
    override fun Preview(
        style: CheckBoxStyle,
        key: ComponentKey,
    ) {
        CheckBox(
            style = style,
            state = ToggleableState.On,
            enabled = true,
            label = "Label",
            description = "Description",
            onClick = {},
        )
    }
}
