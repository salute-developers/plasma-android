package com.sdds.playground.sandbox.textfield.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.mask.DateMask
import com.sdds.compose.uikit.mask.MaskedTextField
import com.sdds.compose.uikit.mask.NumberMask
import com.sdds.compose.uikit.mask.PhoneMask
import com.sdds.compose.uikit.mask.TextFieldMask
import com.sdds.compose.uikit.mask.TimeMask
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

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
                focusSelectorSettings = LocalFocusSelectorSettings.current,
            )
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
