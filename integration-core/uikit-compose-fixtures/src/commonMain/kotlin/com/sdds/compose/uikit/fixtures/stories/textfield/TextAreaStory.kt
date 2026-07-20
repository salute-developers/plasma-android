package com.sdds.compose.uikit.fixtures.stories.textfield

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.sandbox.internal.FIELD_FOCUS_SELECTOR_MODE_SWITCH
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.fixtures.FixtureR
import com.sdds.compose.uikit.fixtures.painterResource
import com.sdds.compose.uikit.fixtures.stories.TextFieldUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.TextFieldUiStateTransformer
import com.sdds.compose.uikit.fixtures.stringResource
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story

@Story
object TextAreaStory : ComposeBaseStory<TextFieldUiState, TextFieldStyle>(
    ComponentKey.TextArea,
    TextFieldUiState(),
    TextFieldUiStatePropertiesProducer,
    TextFieldUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: TextFieldStyle,
        state: TextFieldUiState,
    ) {
        val focusManager = LocalFocusManager.current
        var isFocusSelectorOn by remember { mutableStateOf(!FIELD_FOCUS_SELECTOR_MODE_SWITCH) }
        Column {
            var text by remember { mutableStateOf("Value") }
            TextField(
                value = text,
                onValueChange = {
                    text = it
                },
                modifier = Modifier.padding(start = 20.dp),
                style = style,
                enabled = state.enabled,
                readOnly = state.readOnly,
                placeholderText = state.placeholderText,
                prefix = state.prefix,
                suffix = state.suffix,
                labelText = state.labelText,
                optionalText = state.optionalText,
                captionText = state.captionText,
                counterText = state.counterText,
                startContent = state.hasStartIcon.getTextFieldExampleIcon(TextFieldIcon.Start),
                endContent = state.hasEndIcon.getTextFieldExampleIcon(TextFieldIcon.End),
                chipsContent = if (state.hasChips) {
                    chips.toChipContent()
                } else {
                    null
                },
                focusSelectorSettings = if (isFocusSelectorOn) {
                    LocalFocusSelectorSettings.current
                } else {
                    FocusSelectorSettings.None
                },
            )

            if (FIELD_FOCUS_SELECTOR_MODE_SWITCH) {
                Spacer(Modifier.size(64.dp))
                Switch(
                    active = isFocusSelectorOn,
                    label = stringResource(
                        com.sdds.compose.uikit.fixtures.FixtureR.string.sandbox_enable_focus_selector,
                    ),
                    onActiveChanged = { isFocusSelectorOn = it },
                )
                Button(
                    label = stringResource(com.sdds.compose.uikit.fixtures.FixtureR.string.sandbox_clear_focus),
                    onClick = { focusManager.clearFocus(true) },
                )
            }
        }
    }

    @Composable
    override fun Preview(
        style: TextFieldStyle,
        key: ComponentKey,
    ) {
        var value by remember { mutableStateOf(TextFieldValue("Value")) }
        TextField(
            value = value,
            style = style,
            labelText = "Label",
            placeholderText = "",
            captionText = "Caption",
            onValueChange = { value = it },
            enabled = true,
            readOnly = false,
            focusSelectorSettings = FocusSelectorSettings.None,
            startContent = {
                Icon(
                    painter = painterResource(id = FixtureR.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
            endContent = {
                Icon(
                    painter = painterResource(id = FixtureR.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
        )
    }
}

private val chips = listOf(
    "Chip 1",
    "Chip 2",
    "Chip 3",
    "Chip 4",
)

private fun List<String>.toChipContent(): (@Composable () -> Unit)? {
    return if (isEmpty()) {
        null
    } else {
        {
            ChipsContent(chips = this)
        }
    }
}

@Composable
private fun ChipsContent(
    chips: List<String>?,
) {
    chips?.forEach { chip ->
        Chip(
            label = chip,
            endContent = {
                Icon(
                    painter = painterResource(id = FixtureR.drawable.ic_close_24),
                    contentDescription = "",
                )
            },
        )
    }
}
