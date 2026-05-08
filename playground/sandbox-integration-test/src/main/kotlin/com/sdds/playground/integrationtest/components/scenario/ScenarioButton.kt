package com.sdds.playground.integrationtest.components.scenario

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonStyle
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
) {
    Button(
        modifier = modifier
            .fillMaxWidth()
            .testTag(state.testTag),
        label = state.label,
        style = style,
        enabled = state.enabled,
        loading = state.loading,
        onClick = onClick,
    )
}
