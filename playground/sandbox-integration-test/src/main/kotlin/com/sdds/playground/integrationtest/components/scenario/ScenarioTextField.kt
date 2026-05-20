package com.sdds.playground.integrationtest.components.scenario

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.input.VisualTransformation
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.playground.integrationtest.uistate.TextFieldUiState

/**
 * TextField для сценария
 */
@Composable
internal fun ScenarioTextField(
    state: TextFieldUiState,
    style: TextFieldStyle,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    focusSelectorSettings: FocusSelectorSettings = FocusSelectorSettings.None,
) {
    TextField(
        value = state.value,
        onValueChange = onValueChange,
        modifier = modifier.testTag(state.testTag),
        style = style,
        placeholderText = state.placeholder,
        labelText = state.label,
        focusSelectorSettings = focusSelectorSettings,
        keyboardOptions = keyboardOptions,
        visualTransformation = visualTransformation,
    )
}
