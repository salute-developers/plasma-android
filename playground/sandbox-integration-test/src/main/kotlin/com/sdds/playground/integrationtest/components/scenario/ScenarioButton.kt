package com.sdds.playground.integrationtest.components.scenario

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonGroup
import com.sdds.compose.uikit.ButtonGroupOrientation
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.playground.integrationtest.testtags.FocusSelectorTags
import com.sdds.playground.integrationtest.uistate.ButtonUiState

/**
 * BasicButton для сценария
 */
@Composable
internal fun ScenarioButton(
    state: ButtonUiState,
    style: ButtonStyle,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    keyboardFocusable: Boolean = false,
) {
    Button(
        modifier = modifier
            .fillMaxWidth()
            .then(
                if (keyboardFocusable) {
                    Modifier.focusable(
                        enabled = state.enabled,
                        interactionSource = interactionSource,
                    )
                } else {
                    Modifier
                },
            )
            .testTag(state.testTag),
        label = state.label,
        style = style,
        enabled = state.enabled,
        loading = state.loading,
        interactionSource = interactionSource,
        onClick = onClick,
    )
}

@Composable
internal fun ScenarioButtonGroup(
    state: ButtonUiState,
    style: ButtonGroupStyle,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    keyboardFocusable: Boolean = false,
) {
    ButtonGroup(
        modifier = modifier.testTag(FocusSelectorTags.BUTTON_GROUP),
        style = style,
        orientation = ButtonGroupOrientation.Horizontal,
        content = {
            repeat(3) { index ->
                button {
                    val itemInteractionSource = remember { MutableInteractionSource() }
                    Button(
                        modifier = if (keyboardFocusable) {
                            Modifier
                                .focusable(
                                    enabled = state.enabled,
                                    interactionSource = itemInteractionSource,
                                )
                                .testTag(FocusSelectorTags.buttonGroupItem(index))
                        } else {
                            Modifier.testTag(FocusSelectorTags.buttonGroupItem(index))
                        },
                        label = state.label,
                        enabled = state.enabled,
                        loading = state.loading,
                        interactionSource = itemInteractionSource,
                        onClick = onClick,
                    )
                }
            }
        },
    )
}
