package com.sdds.playground.sandbox.textfield.compose

import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.BasicButton
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.internal.focusselector.FocusSelectorMode
import com.sdds.compose.uikit.internal.focusselector.LocalFocusSelectorMode
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.TextFieldFocusSelectorModeSwitch
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.button.basic.Default
import com.sdds.serv.styles.button.basic.Xs

/**
 * Экран с компонентом [TextField]
 */
@Suppress("LongMethod")
@OptIn(ExperimentalComposeUiApi::class)
@Composable
internal fun TextFieldScreen(
    theme: Theme.ThemeInfoCompose = Theme.composeDefault,
    textFieldType: TextFieldType = TextFieldType.TextField,
) {
    val textFieldViewModel: TextFieldViewModel = viewModel(
        factory = TextFieldViewModelFactory(
            defaultState = TextFieldUiState(),
            theme = theme,
            textFieldType = textFieldType,
        ),
        key = theme.toString() + textFieldType.name,
    )
    val textFieldUiState by textFieldViewModel.uiState.collectAsState()
    ComponentScaffold(
        component = {
            val focusManager = LocalFocusManager.current
            var isFocusSelectorOn by remember { mutableStateOf(!TextFieldFocusSelectorModeSwitch) }
            theme.themeWrapper {
                TextField(
                    value = textFieldUiState.textFieldValue,
                    onValueChange = {
                        textFieldViewModel.onValueChange(it)
                    },
                    modifier = Modifier
                        .onKeyEvent {
                            if (it.key == Key.Backspace) {
                                textFieldViewModel.onBackspacePressed()
                            }
                            return@onKeyEvent false
                        },
                    style = styleProvider(theme, textFieldType)
                        .style(textFieldUiState.variant),
                    enabled = textFieldUiState.enabled,
                    readOnly = textFieldUiState.readOnly,
                    placeholderText = textFieldUiState.placeholderText,
                    prefix = textFieldUiState.prefix,
                    suffix = textFieldUiState.suffix,
                    labelText = textFieldUiState.labelText,
                    optionalText = textFieldUiState.optionalText,
                    captionText = textFieldUiState.captionText,
                    counterText = textFieldUiState.counterText,
                    startContent = textFieldUiState.hasStartIcon.getExampleIcon(Icon.Start),
                    endContent = textFieldUiState.hasEndIcon.getExampleIcon(Icon.End),
                    chipsContent = textFieldUiState.chips.toChipContent(
                        onChipClosePressed = {
                            textFieldViewModel.onChipClosePressed(it)
                        },
                    ),
                    focusSelectorMode = if (isFocusSelectorOn) {
                        LocalFocusSelectorMode.current
                    } else {
                        FocusSelectorMode.None
                    },
                )
            }

            if (TextFieldFocusSelectorModeSwitch) {
                Switch(
                    active = isFocusSelectorOn,
                    label = stringResource(R.string.sandbox_enable_focus_selector),
                    modifier = Modifier.align(Alignment.BottomStart),
                    onActiveChanged = { isFocusSelectorOn = it },
                )
                Button(
                    style = BasicButton.Xs.Default.style(),
                    label = stringResource(R.string.sandbox_clear_focus),
                    modifier = Modifier.align(Alignment.BottomEnd),
                    onClick = { focusManager.clearFocus(true) },
                )
            }
        },
        propertiesOwner = textFieldViewModel,
    )
}

internal enum class TextFieldType {
    TextField,
    TextFieldClear,
    TextArea,
    TextAreaClear,
}

private fun styleProvider(
    theme: Theme.ThemeInfoCompose,
    textFieldType: TextFieldType,
): ComposeStyleProvider<String, TextFieldStyle> =
    when (textFieldType) {
        TextFieldType.TextField -> theme.stylesProvider.textField
        TextFieldType.TextFieldClear -> theme.stylesProvider.textFieldClear
        TextFieldType.TextArea -> theme.stylesProvider.textArea
        TextFieldType.TextAreaClear -> theme.stylesProvider.textAreaClear
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

private enum class Icon(val res: Int) {
    Start(com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
    End(com.sdds.icons.R.drawable.ic_shazam_24),
}

private fun Boolean.getExampleIcon(icon: Icon): (@Composable () -> Unit)? {
    return if (this) {
        {
            Icon(
                modifier = Modifier.clickable(role = Role.Button) { },
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
