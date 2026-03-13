package com.sdds.compose.uikit.fixtures.stories.checkbox

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.state.ToggleableState
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.sandbox.CheckBoxUiStatePropertiesProducer
import com.sdds.sandbox.CheckBoxUiStateTransformer
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
        var checkedState by remember { mutableStateOf(ToggleableState.Off) }
        CheckBox(
            style = style,
            state = checkedState,
            label = state.label,
            description = state.description,
            enabled = state.enabled,
        )
    }
}
