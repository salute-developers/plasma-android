package com.sdds.playground.sandbox.textfield.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.mask.DateMask
import com.sdds.compose.uikit.mask.MaskedTextField
import com.sdds.compose.uikit.mask.NumberMask
import com.sdds.compose.uikit.mask.PhoneMask
import com.sdds.compose.uikit.mask.TextFieldMask
import com.sdds.compose.uikit.mask.TimeMask
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
 * Экран с компонентом [MaskedTextField]
 */
@Suppress("LongMethod")
@Composable
internal fun MaskedTextFieldScreen(componentKey: ComponentKey = ComponentKey.Mask) {
    val textFieldViewModel: MaskedTextFieldViewModel = viewModel(
        factory = MaskedTextFieldViewModelFactory(
            defaultState = MaskedTextFieldUiState(),
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
                MaskedTextField(
                    value = textFieldUiState.textFieldValue,
                    mask = remember(
                        textFieldUiState.mask,
                        textFieldUiState.maskDisplayMode,
                    ) {
                        mask(textFieldUiState.mask, textFieldUiState.maskDisplayMode)
                    },
                    onValueChange = {
                        textFieldViewModel.onValueChange(it)
                    },
                    style = style,
                    enabled = textFieldUiState.enabled,
                    readOnly = textFieldUiState.readOnly,
                    placeholderText = textFieldUiState.placeholderText.ifEmpty {
                        when (textFieldUiState.mask) {
                            TextMask.Phone -> "+7 (000) 000-00-00"
                            TextMask.DateShort -> "ДД.ММ.ГГ"
                            TextMask.DateLong -> "ДД.ММ.ГГГГ"
                            TextMask.Time -> "ЧЧ:ММ"
                            TextMask.Number -> "0,00"
                        }
                    },
                    prefix = textFieldUiState.prefix,
                    suffix = textFieldUiState.suffix,
                    labelText = textFieldUiState.labelText,
                    startContent = textFieldUiState.hasStartIcon.getTextFieldExampleIcon(
                        TextFieldIcon.Start,
                    ),
                    endContent = textFieldUiState.hasEndIcon.getTextFieldExampleIcon(TextFieldIcon.End),
                    focusSelectorSettings = FocusSelectorSettings.None,
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

private fun mask(mask: TextMask, displayMode: MaskDisplayMode): TextFieldMask {
    return when (mask) {
        TextMask.Phone -> PhoneMask(maskMode = displayMode.mode)
        TextMask.DateShort -> DateMask(
            maskMode = displayMode.mode,
            pattern = listOf("ДД", "ММ", "ГГ"),
        )

        TextMask.DateLong -> DateMask(
            maskMode = displayMode.mode,
            pattern = listOf("ДД", "ММ", "ГГГГ"),
        )

        TextMask.Time -> TimeMask(maskMode = displayMode.mode)
        TextMask.Number -> NumberMask()
    }
}

@Composable
internal fun MaskedTextFieldPreview(style: TextFieldStyle) {
    SandboxTheme {
        MaskedTextField(
            value = "0000000000",
            mask = remember { PhoneMask() },
            onValueChange = {},
            style = style,
            placeholderText = "placeholder",
            labelText = "label",
            startContent = true.getTextFieldExampleIcon(TextFieldIcon.Start),
            endContent = true.getTextFieldExampleIcon(TextFieldIcon.End),
            focusSelectorSettings = LocalFocusSelectorSettings.current,
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun MaskedTextFieldScreenPreview() {
    SandboxTheme {
        TextFieldScreen()
    }
}
