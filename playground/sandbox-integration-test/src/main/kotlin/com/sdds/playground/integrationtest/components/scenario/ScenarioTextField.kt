package com.sdds.playground.integrationtest.components.scenario

import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.style.style
import com.sdds.playground.integrationtest.scenarios.focus.FocusSelectorClearButton
import com.sdds.playground.integrationtest.testtags.FocusSelectorTags
import com.sdds.playground.integrationtest.uistate.TextFieldUiState
import com.sdds.serv.styles.textfield.Default
import com.sdds.serv.styles.textfield.InnerLabel
import com.sdds.serv.styles.textfield.L
import com.sdds.serv.styles.textfield.TextField

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

@Composable
internal fun TextFieldFocusCase(
    value: String,
    isFocused: Boolean,
    rootFocusRequester: FocusRequester,
    onValueChange: (String) -> Unit,
    onFocusChanged: (Boolean) -> Unit,
    onClearFocus: () -> Unit,
) {
    Column(
        modifier = Modifier.testTag(FocusSelectorTags.TEXT_FIELD_TAB_CONTENT),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(text = "TextField")
        Box(
            modifier = Modifier
                .size(1.dp)
                .focusRequester(rootFocusRequester)
                .focusable(),
        )
        ScenarioTextField(
            state = TextFieldUiState(
                value = value,
                label = "Фокусируемое текстовое поле",
                placeholder = "Введите текст",
                testTag = FocusSelectorTags.FOCUSABLE_TEXT_FIELD,
            ),
            style = TextField.L.InnerLabel.Default.style(),
            modifier = Modifier.onFocusChanged { onFocusChanged(it.isFocused) },
            onValueChange = onValueChange,
            focusSelectorSettings = LocalFocusSelectorSettings.current,
        )
        Text(
            text = if (isFocused) "Текстовое поле в фокусе" else "Текстовое поле не в фокусе",
            modifier = Modifier.testTag(FocusSelectorTags.TEXT_FIELD_FOCUS_STATE),
        )
        FocusSelectorClearButton(onClick = onClearFocus)
    }
}
