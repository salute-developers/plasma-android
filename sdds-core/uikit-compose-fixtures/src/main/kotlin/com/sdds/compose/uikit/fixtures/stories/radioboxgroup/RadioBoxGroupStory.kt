package com.sdds.compose.uikit.fixtures.stories.radioboxgroup

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.RadioBoxGroup
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.compose.uikit.isChecked
import com.sdds.compose.uikit.updateSelection
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.RadioBoxGroupUiStatePropertiesProducer
import com.sdds.sandbox.RadioBoxGroupUiStateTransformer
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/**
 * Состояния компонента RadioBoxGroup
 */
@StoryUiState
data class RadioBoxGroupUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val label: String = "Label",
    val description: String = "Description",
    val amount: Int = 2,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object RadioBoxGroupStory : ComposeBaseStory<RadioBoxGroupUiState, RadioBoxGroupStyle>(
    ComponentKey.RadioBoxGroup,
    RadioBoxGroupUiState(),
    RadioBoxGroupUiStatePropertiesProducer,
    RadioBoxGroupUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: RadioBoxGroupStyle,
        state: RadioBoxGroupUiState,
    ) {
        var currentItem by remember { mutableIntStateOf(0) }
        RadioBoxGroup(style = style) {
            repeat(state.amount) {
                RadioBox(
                    checked = it == currentItem,
                    label = state.label,
                    description = state.description,
                    onClick = { currentItem = it },
                )
            }
        }
    }

    @Composable
    override fun Preview(
        style: RadioBoxGroupStyle,
        key: ComponentKey,
    ) {
        RadioBoxGroup(
            style = style,
            default = 1,
        ) { selection ->
            radioBoxItem(key = 1) { key ->
                RadioBox(
                    checked = isChecked(selection, key),
                    label = "Label",
                    description = "Description",
                    onClick = { updateSelection(selection, key) },
                )
            }
            radioBoxItem(key = 2) { key ->
                RadioBox(
                    checked = isChecked(selection, key),
                    label = "Label",
                    description = "Description",
                    onClick = { updateSelection(selection, key) },
                )
            }
            radioBoxItem(key = 3) { key ->
                RadioBox(
                    checked = isChecked(selection, key),
                    label = "Label",
                    description = "Description",
                    onClick = { updateSelection(selection, key) },
                )
            }
        }
    }
}
