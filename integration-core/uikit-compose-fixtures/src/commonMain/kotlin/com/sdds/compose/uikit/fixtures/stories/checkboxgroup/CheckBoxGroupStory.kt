package com.sdds.compose.uikit.fixtures.stories.checkboxgroup

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxGroup
import com.sdds.compose.uikit.CheckBoxGroupStyle
import com.sdds.compose.uikit.CheckBoxValue
import com.sdds.compose.uikit.CheckBoxValue.Error
import com.sdds.compose.uikit.CheckBoxValue.Indeterminate
import com.sdds.compose.uikit.CheckBoxValue.Off
import com.sdds.compose.uikit.CheckBoxValue.On
import com.sdds.compose.uikit.fixtures.stories.CheckBoxGroupUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.CheckBoxGroupUiStateTransformer
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
                        state = Off,
                    ),
                    CheckBoxGroupItem(
                        label = state.label,
                        description = state.description,
                        state = Off,
                    ),
                ),
            )
        }
        var rootCheckBoxState by remember { mutableStateOf(Off) }

        CheckBoxGroup(style = style) {
            if (state.hasRoot) {
                rootCheckbox {
                    CheckBox(
                        value = rootCheckBoxState,
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
                        value = item.state,
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
                    value = On,
                    label = "Label",
                    description = "Description",
                )
            }
            checkbox {
                CheckBox(
                    value = On,
                    label = "Label",
                    description = "Description",
                )
            }
            checkbox {
                CheckBox(
                    value = On,
                    label = "Label",
                    description = "Description",
                )
            }
        }
    }
}

/**
 * Состояние ошибки на любом ребёнке приоритетнее completion-статуса — если хотя бы один
 * child в [Error], root тоже отражает [Error], независимо от состояния остальных.
 */
private fun List<CheckBoxGroupItem>.getParentState(): CheckBoxValue =
    when {
        this.any { it.state == Error } -> Error
        this.all { it.state == On } -> On
        this.all { it.state == Off } -> Off
        else -> Indeterminate
    }

private data class CheckBoxGroupItem(
    val label: String?,
    val description: String?,
    val state: CheckBoxValue = Off,
)

/**
 * Клик "разрешает" состояние в On из любого не-On состояния (включая Error — он задаётся
 * только извне, но клик по уже выставленному Error выводит его в On), иначе снимает в Off.
 */
private fun CheckBoxValue.toggle(): CheckBoxValue {
    return if (this == Off || this == Indeterminate || this == Error) {
        On
    } else {
        Off
    }
}
