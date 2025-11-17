package com.sdds.playground.sandbox.textfield.compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
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
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.FieldFocusSelectorModeSwitch
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.Xs

/**
 * Экран с компонентом [TextField]
 */
@Suppress("LongMethod")
@Composable
internal fun TextFieldScreen(componentKey: ComponentKey = ComponentKey.TextField) {
    val textFieldViewModel: TextFieldViewModel = viewModel(
        factory = TextFieldViewModelFactory(
            defaultState = TextFieldUiState(),
            componentKey = componentKey,
        ),
        key = componentKey.toString(),
    )
    ComponentScaffold(
        key = componentKey,
        viewModel = textFieldViewModel,
        component = { textFieldUiState, style ->
            val focusManager = LocalFocusManager.current
            var isFocusSelectorOn by remember { mutableStateOf(!FieldFocusSelectorModeSwitch) }
            Column {
                TextField(
                    value = textFieldUiState.textFieldValue,
                    onValueChange = {
                        textFieldViewModel.onValueChange(it)
                    },
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .onKeyEvent {
                            if (it.key == Key.Backspace) {
                                textFieldViewModel.onBackspacePressed()
                            }
                            return@onKeyEvent false
                        },
                    style = style,
                    enabled = textFieldUiState.enabled,
                    readOnly = textFieldUiState.readOnly,
                    placeholderText = textFieldUiState.placeholderText,
                    prefix = textFieldUiState.prefix,
                    suffix = textFieldUiState.suffix,
                    labelText = textFieldUiState.labelText,
                    optionalText = textFieldUiState.optionalText,
                    captionText = textFieldUiState.captionText,
                    counterText = textFieldUiState.counterText,
                    startContent = textFieldUiState.hasStartIcon.getTextFieldExampleIcon(TextFieldIcon.Start),
                    endContent = textFieldUiState.hasEndIcon.getTextFieldExampleIcon(TextFieldIcon.End),
                    chipsContent = textFieldUiState.chips.toChipContent(
                        onChipClosePressed = {
                            textFieldViewModel.onChipClosePressed(it)
                        },
                    ),
                    focusSelectorSettings = if (isFocusSelectorOn) {
                        LocalFocusSelectorSettings.current
                    } else {
                        FocusSelectorSettings.None
                    },
                )

                if (FieldFocusSelectorModeSwitch) {
                    Spacer(Modifier.size(64.dp))
                    Switch(
                        active = isFocusSelectorOn,
                        label = stringResource(R.string.sandbox_enable_focus_selector),
                        onActiveChanged = { isFocusSelectorOn = it },
                    )
                    Button(
                        style = BasicButton.Xs.Default.style(),
                        label = stringResource(R.string.sandbox_clear_focus),
                        onClick = { focusManager.clearFocus(true) },
                    )
                }
            }
        },
    )
}

private fun List<String>.toChipContent(
    onChipClosePressed: (String) -> Unit,
): (@Composable () -> Unit)? {
    return if (isEmpty()) {
        null
    } else {
        {
            ChipsContent(
                chips = this,
                onChipClosePressed = onChipClosePressed,
            )
        }
    }
}

@Composable
private fun ChipsContent(
    chips: List<String>?,
    onChipClosePressed: ((String) -> Unit)?,
) {
    chips?.forEach { chip ->
        Chip(
            label = chip,
            endContent = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_24),
                    contentDescription = "",
                    modifier = Modifier.clickable(onClick = { onChipClosePressed?.invoke(chip) }),
                )
            },
        )
    }
}

internal enum class TextFieldIcon(val res: Int) {
    Start(com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
    End(com.sdds.icons.R.drawable.ic_shazam_24),
}

internal fun Boolean.getTextFieldExampleIcon(icon: TextFieldIcon): (@Composable () -> Unit)? {
    return if (this) {
        {
            Icon(
                modifier = Modifier.clickable(
                    role = Role.Button,
                    indication = null,
                    interactionSource = remember { MutableInteractionSource() },
                ) { },
                painter = painterResource(id = icon.res),
                contentDescription = "",
            )
        }
    } else {
        null
    }
}

@Composable
@Preview(showBackground = true)
private fun TextFieldScreenPreview() {
    SandboxTheme {
        TextFieldScreen()
    }
}
