package com.sdds.compose.uikit.fixtures.stories.checkbox

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.CheckBoxValue
import com.sdds.compose.uikit.CheckBoxValue.Error
import com.sdds.compose.uikit.CheckBoxValue.Indeterminate
import com.sdds.compose.uikit.CheckBoxValue.Off
import com.sdds.compose.uikit.CheckBoxValue.On
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
    val state: CheckBoxValue = Indeterminate,
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
            value = state.state,
            onClick = {
                updateState(state.copy(state = state.state.toggle()))
            },
            label = state.label.takeIf { it.isNotBlank() },
            description = state.description.takeIf { it.isNotBlank() },
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
            value = On,
            enabled = true,
            label = "Label",
            description = "Description",
            onClick = {},
        )
    }
}

/**
 * Клик по [CheckBox] всегда "разрешает" состояние в On, кроме случая, когда он уже On —
 * тогда снимается в Off. Error, как и Indeterminate, кликом не производится — он задаётся
 * только извне (через пикер в панели свойств сэндбокса), но клик по нему уже выставленным
 * так же ведёт в On.
 */
private fun CheckBoxValue.toggle(): CheckBoxValue =
    if (this == Off || this == Indeterminate || this == Error) On else Off
