package com.sdds.compose.uikit.fixtures.stories.textfield

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
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
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.TextFieldUiStatePropertiesProducer
import com.sdds.sandbox.TextFieldUiStateTransformer
import com.sdds.sandbox.UiState

@StoryUiState
data class TextFieldUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val labelText: String = "Label",
    val optionalText: String = "Optional",
    val placeholderText: String = "Placeholder",
    val captionText: String = "Caption",
    val counterText: String = "Counter",
    val hasStartIcon: Boolean = true,
    val hasEndIcon: Boolean = true,
    val hasChips: Boolean = false,
    val enabled: Boolean = true,
    val readOnly: Boolean = false,
    val suffix: String = "",
    val prefix: String = "",
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object TextFieldStory : ComposeBaseStory<TextFieldUiState, TextFieldStyle>(
    ComponentKey.TextField,
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
                    label = stringResource(com.sdds.compose.uikit.fixtures.R.string.sandbox_enable_focus_selector),
                    onActiveChanged = { isFocusSelectorOn = it },
                )
                Button(
                    label = stringResource(com.sdds.compose.uikit.fixtures.R.string.sandbox_clear_focus),
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
                    painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
            endContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_shazam_24),
                    contentDescription = "",
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
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_24),
                    contentDescription = "",
                )
            },
        )
    }
}
