package com.sdds.playground.integrationtest.components.scenario

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonGroup
import com.sdds.compose.uikit.ButtonGroupOrientation
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.style.style
import com.sdds.playground.integrationtest.scenarios.focus.FocusSelectorClearButton
import com.sdds.playground.integrationtest.testtags.FocusSelectorTags
import com.sdds.playground.integrationtest.uistate.ButtonUiState
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.L
import com.sdds.serv.styles.buttongroup.BasicButtonGroup
import com.sdds.serv.styles.buttongroup.NoGap
import com.sdds.serv.styles.buttongroup.Segmented
import com.sdds.serv.styles.buttongroup.Xs

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

@Composable
internal fun ButtonFocusCase(
    isFocused: Boolean,
    interactionSource: MutableInteractionSource,
    onFocusChanged: (Boolean) -> Unit,
    onClearFocus: () -> Unit,
) {
    Column(
        modifier = Modifier.testTag(FocusSelectorTags.BUTTON_TAB_CONTENT),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(text = "Button")
        ScenarioButton(
            state = ButtonUiState(
                label = "Фокусируемая кнопка",
                testTag = FocusSelectorTags.FOCUSABLE_BUTTON,
            ),
            style = BasicButton.L.Default.style(),
            modifier = Modifier.onFocusChanged { onFocusChanged(it.isFocused) },
            interactionSource = interactionSource,
            keyboardFocusable = true,
            onClick = {},
        )
        Text(
            text = if (isFocused) "Кнопка в фокусе" else "Кнопка не в фокусе",
            modifier = Modifier.testTag(FocusSelectorTags.BUTTON_FOCUS_STATE),
        )
        FocusSelectorClearButton(onClick = onClearFocus)
    }
}

@Composable
internal fun ButtonGroupFocusCase(
    isFocused: Boolean,
    onFocusChanged: (Boolean) -> Unit,
    onClearFocus: () -> Unit,
) {
    Column(
        modifier = Modifier.testTag(FocusSelectorTags.BUTTON_GROUP_TAB_CONTENT),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(text = "ButtonGroup")
        ScenarioButtonGroup(
            state = ButtonUiState(
                label = "Buttons",
                testTag = FocusSelectorTags.FOCUSABLE_BUTTON_GROUP,
            ),
            style = BasicButtonGroup.Xs.NoGap.Segmented.style(),
            modifier = Modifier.onFocusChanged { onFocusChanged(it.isFocused) },
            keyboardFocusable = true,
            onClick = {},
        )
        Text(
            text = if (isFocused) "Группа кнопок в фокусе" else "Кнопки не в фокусе",
            modifier = Modifier.testTag(FocusSelectorTags.BUTTON_GROUP_FOCUS_STATE),
        )
        FocusSelectorClearButton(onClick = onClearFocus)
    }
}
