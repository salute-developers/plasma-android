package com.sdds.compose.uikit.fixtures.stories.checkboxgroup

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.state.ToggleableState
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxGroup
import com.sdds.compose.uikit.CheckBoxGroupStyle
import com.sdds.sandbox.CheckBoxGroupUiStatePropertiesProducer
import com.sdds.sandbox.CheckBoxGroupUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class CheckBoxGroupUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val hasRoot: Boolean = true,
    val enabled: Boolean = true,
    val label: String = "label",
    val description: String = "description",
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object CheckBoxGroupStory : ComposeBaseStory<CheckBoxGroupUiState, CheckBoxGroupStyle>(
    ComponentKey.CheckBoxGroup,
    CheckBoxGroupUiState(),
    CheckBoxGroupUiStatePropertiesProducer,
    CheckBoxGroupUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: CheckBoxGroupStyle,
        state: CheckBoxGroupUiState,
    ) {
        var items by remember {
            mutableStateOf(
                listOf(
                    CheckBoxGroupItem(
                        label = state.label,
                        description = state.description,
                        state = ToggleableState.Off,
                    ),
                    CheckBoxGroupItem(
                        label = state.label,
                        description = state.description,
                        state = ToggleableState.Off,
                    ),
                ),
            )
        }
        var rootCheckBoxState by remember { mutableStateOf(ToggleableState.Off) }

        CheckBoxGroup(style = style) {
            if (state.hasRoot) {
                rootCheckbox {
                    CheckBox(
                        state = rootCheckBoxState,
                        enabled = state.enabled,
                        label = state.label,
                        description = state.description,
                        onClick = {
                            val newState = rootCheckBoxState.toggle()
                            rootCheckBoxState = newState
                            items = items.map {
                                it.copy(state = newState)
                            }
                        },
                    )
                }
            }

            items.forEachIndexed { index, item ->
                checkbox {
                    CheckBox(
                        state = item.state,
                        enabled = state.enabled,
                        label = item.label,
                        description = item.description,
                        onClick = {
                            val newItems = items.mapIndexed { mapIndex, mapItem ->
                                if (mapIndex == index) mapItem.copy(state = mapItem.state.toggle()) else mapItem
                            }
                            items = newItems
                            rootCheckBoxState = newItems.getParentState()
                        },
                    )
                }
            }
        }
    }

    @Composable
    override fun Preview(
        style: CheckBoxGroupStyle,
        key: ComponentKey,
    ) {
        CheckBoxGroup(
            style = style,
        ) {
            rootCheckbox {
                CheckBox(
                    state = ToggleableState.On,
                    label = "Label",
                    description = "Description",
                )
            }
            checkbox {
                CheckBox(
                    state = ToggleableState.On,
                    label = "Label",
                    description = "Description",
                )
            }
            checkbox {
                CheckBox(
                    state = ToggleableState.On,
                    label = "Label",
                    description = "Description",
                )
            }
        }
    }
}

private fun List<CheckBoxGroupItem>.getParentState(): ToggleableState =
    when {
        this.all { it.state == ToggleableState.On } -> ToggleableState.On
        this.all { it.state == ToggleableState.Off } -> ToggleableState.Off
        else -> ToggleableState.Indeterminate
    }

private data class CheckBoxGroupItem(
    val label: String?,
    val description: String?,
    val state: ToggleableState = ToggleableState.Off,
)

private fun ToggleableState.toggle(): ToggleableState {
    return if (this == ToggleableState.Off || this == ToggleableState.Indeterminate) {
        ToggleableState.On
    } else {
        ToggleableState.Off
    }
}
