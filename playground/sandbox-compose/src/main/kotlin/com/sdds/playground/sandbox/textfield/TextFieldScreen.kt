package com.sdds.playground.sandbox.textfield

import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.Icon
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.buttons.BasicButton
import com.sdds.playground.sandbox.buttons.Default
import com.sdds.playground.sandbox.core.ComponentScaffold

/**
 * Экран с компонентом [SandboxTextField]
 */
@OptIn(ExperimentalComposeUiApi::class)
@Composable
internal fun TextFieldScreen() {
    val textFieldViewModel: TextFieldViewModel = viewModel()
    val textFieldUiState by textFieldViewModel.textFieldUiState.collectAsState()
    ComponentScaffold(
        component = {
            val focusManager = LocalFocusManager.current
            SandboxTextField(
                modifier = Modifier
                    .onKeyEvent {
                        if (it.key == Key.Backspace) {
                            textFieldViewModel.onBackspacePressed()
                            false
                        } else {
                            true
                        }
                    },
                value = textFieldUiState.textFieldValue,
                onValueChange = {
                    textFieldViewModel.onValueChange(it)
                },
                isClear = textFieldUiState.isClear,
                hasDivider = textFieldUiState.hasDivider,
                enabled = textFieldUiState.enabled,
                placeholderText = textFieldUiState.placeholderText,
                labelText = textFieldUiState.labelText,
                optionalText = textFieldUiState.optionalText,
                captionText = textFieldUiState.captionText,
                counterText = textFieldUiState.counterText,
                prefix = textFieldUiState.prefix,
                suffix = textFieldUiState.suffix,
                labelPosition = textFieldUiState.labelPosition,
                fieldType = textFieldUiState.fieldType,
                dotBadgePosition = textFieldUiState.dotBadgePosition,
                size = textFieldUiState.size,
                state = textFieldUiState.state,
                leadingIcon = textFieldUiState.hasStartIcon.getExampleIcon(Icon.Start),
                trailingIcon = textFieldUiState.hasEndIcon.getExampleIcon(Icon.End),
                readOnly = textFieldUiState.readOnly,
                singleLine = textFieldUiState.singleLine,
                chips = textFieldUiState.chips.toChipContent(
                    size = textFieldUiState.size,
                    onChipClosePressed = {
                        textFieldViewModel.onChipClosePressed(it)
                    },
                ),
            )

            Button(
                style = BasicButton.Xs.Default.style(),
                label = stringResource(R.string.sandbox_clear_focus),
                modifier = Modifier.align(Alignment.BottomEnd),
                onClick = { focusManager.clearFocus(true) },
            )
        },
        propertiesOwner = textFieldViewModel,
    )
}

private fun List<String>.toChipContent(
    size: SandboxTextField.Size,
    onChipClosePressed: (String) -> Unit,
): (@Composable () -> Unit)? {
    return if (isEmpty()) {
        null
    } else {
        {
            ChipsContent(
                chips = this,
                size = size,
                onChipClosePressed = onChipClosePressed,
            )
        }
    }
}

@Composable
private fun ChipsContent(
    chips: List<String>?,
    size: SandboxTextField.Size,
    onChipClosePressed: ((String) -> Unit)?,
) {
    chips?.forEach { chip ->
        Chip(
            label = chip,
            style = TextFieldDefaults.chipStyle(size),
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

private enum class Icon(val res: Int) {
    Start(com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
    End(com.sdds.icons.R.drawable.ic_shazam_24),
}

private fun Boolean.getExampleIcon(icon: Icon): (@Composable () -> Unit)? {
    return if (this) {
        {
            Icon(
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
