package com.sdds.compose.uikit.fixtures.stories.maskedtextfield

import androidx.compose.foundation.layout.BoxScope
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
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.sandbox.internal.FIELD_FOCUS_SELECTOR_MODE_SWITCH
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.fixtures.R
import com.sdds.compose.uikit.fixtures.stories.textfield.TextFieldIcon
import com.sdds.compose.uikit.fixtures.stories.textfield.getTextFieldExampleIcon
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.mask.DateMask
import com.sdds.compose.uikit.mask.MaskedTextField
import com.sdds.compose.uikit.mask.NumberMask
import com.sdds.compose.uikit.mask.PhoneMask
import com.sdds.compose.uikit.mask.TextFieldMask
import com.sdds.compose.uikit.mask.TextFieldMaskMode
import com.sdds.compose.uikit.mask.TimeMask
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.MaskedTextFieldUiStatePropertiesProducer
import com.sdds.sandbox.MaskedTextFieldUiStateTransformer
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class MaskedTextFieldUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val mask: TextMask = TextMask.Phone,
    val maskDisplayMode: MaskDisplayMode = MaskDisplayMode.Always,
    val labelText: String = "Label",
    val placeholderText: String = "",
    val hasStartIcon: Boolean = true,
    val hasEndIcon: Boolean = true,
    val enabled: Boolean = true,
    val readOnly: Boolean = false,
    val suffix: String = "",
    val prefix: String = "",
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

enum class TextMask {
    Phone,
    DateShort,
    DateLong,
    Time,
    Number,
}

enum class MaskDisplayMode(val mode: TextFieldMaskMode) {
    Always(TextFieldMaskMode.Always),
    OnInput(TextFieldMaskMode.OnInput),
}

@Story
object MaskedTextFieldStory : ComposeBaseStory<MaskedTextFieldUiState, TextFieldStyle>(
    ComponentKey.Mask,
    MaskedTextFieldUiState(),
    MaskedTextFieldUiStatePropertiesProducer,
    MaskedTextFieldUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: TextFieldStyle,
        state: MaskedTextFieldUiState,
    ) {
        val focusManager = LocalFocusManager.current
        var isFocusSelectorOn by remember { mutableStateOf(!FIELD_FOCUS_SELECTOR_MODE_SWITCH) }
        var textFieldValue by remember { mutableStateOf("") }
        Column {
            MaskedTextField(
                value = textFieldValue,
                mask = remember(
                    state.mask,
                    state.maskDisplayMode,
                ) {
                    mask(state.mask, state.maskDisplayMode)
                },
                onValueChange = {
                    textFieldValue = it
                },
                style = style,
                enabled = state.enabled,
                readOnly = state.readOnly,
                placeholderText = state.placeholderText.ifEmpty {
                    when (state.mask) {
                        TextMask.Phone -> "+7 (000) 000-00-00"
                        TextMask.DateShort -> "ДД.ММ.ГГ"
                        TextMask.DateLong -> "ДД.ММ.ГГГГ"
                        TextMask.Time -> "ЧЧ:ММ"
                        TextMask.Number -> "0,00"
                    }
                },
                prefix = state.prefix,
                suffix = state.suffix,
                labelText = state.labelText,
                startContent = state.hasStartIcon.getTextFieldExampleIcon(
                    TextFieldIcon.Start,
                ),
                endContent = state.hasEndIcon.getTextFieldExampleIcon(TextFieldIcon.End),
                focusSelectorSettings = FocusSelectorSettings.None,
            )

            if (FIELD_FOCUS_SELECTOR_MODE_SWITCH) {
                Spacer(Modifier.size(64.dp))
                Switch(
                    active = isFocusSelectorOn,
                    label = stringResource(R.string.sandbox_enable_focus_selector),
                    onActiveChanged = { isFocusSelectorOn = it },
                )
                Button(
                    label = stringResource(R.string.sandbox_clear_focus),
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
