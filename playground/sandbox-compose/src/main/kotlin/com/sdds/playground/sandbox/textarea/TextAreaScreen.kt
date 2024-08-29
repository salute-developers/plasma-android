package com.sdds.playground.sandbox.textarea

import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Icon
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.buttons.SandboxBasicButton
import com.sdds.playground.sandbox.buttons.SandboxButton
import com.sdds.playground.sandbox.chip.SandboxEmbeddedChip
import com.sdds.playground.sandbox.core.ComponentScaffold
import com.sdds.playground.sandbox.tokens.compose.StylesSaluteTheme

/**
 * Экран с компонентом [SandboxTextArea]ø
 */
@OptIn(ExperimentalComposeUiApi::class)
@Composable
internal fun TextAreaScreen() {
    val textAreaViewModel: TextAreaViewModel = viewModel()
    val textAreaUiState by textAreaViewModel.textAreaUiState.collectAsState()
    ComponentScaffold(
        component = {
            val focusManager = LocalFocusManager.current

            SandboxTextArea(
                value = textAreaUiState.value,
                onValueChange = {
                    textAreaViewModel.onValueChange(it)
                },
                enabled = textAreaUiState.enabled,
                readOnly = textAreaUiState.readOnly,
                labelType = textAreaUiState.labelType,
                fieldType = textAreaUiState.fieldType,
                labelText = textAreaUiState.labelText,
                optionalText = textAreaUiState.optionalText,
                placeholderText = textAreaUiState.placeholderText,
                captionText = textAreaUiState.captionText,
                counterText = textAreaUiState.counterText,
                state = textAreaUiState.state,
                size = textAreaUiState.size,
                dotBadgePosition = textAreaUiState.dotBadgePosition,
                icon = textAreaUiState.hasIcon.getExampleIcon(),
                chips = textAreaUiState.chips.toChipContent(
                    size = textAreaUiState.size,
                    onChipClosePressed = {
                        textAreaViewModel.onChipClosePressed(it)
                    },
                ),
            )

            SandboxBasicButton(
                style = SandboxButton.Style.Default,
                size = SandboxButton.Size.XS,
                label = stringResource(R.string.sandbox_clear_focus),
                modifier = Modifier.align(Alignment.BottomEnd),
                onClick = { focusManager.clearFocus(true) },
            )
        },
        propertiesOwner = textAreaViewModel,
    )
}

private fun List<String>.toChipContent(
    size: SandboxTextArea.Size,
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
    size: SandboxTextArea.Size,
    onChipClosePressed: ((String) -> Unit)?,
) {
    chips?.forEach { chip ->
        SandboxEmbeddedChip(
            label = chip,
            size = TextAreaDefaults.chipGroupSize(size),
            state = SandboxEmbeddedChip.State.Secondary,
            endContent = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_24),
                    contentDescription = "",
                    tint = StylesSaluteTheme.colors.textDefaultSecondary,
                    modifier = Modifier.clickable(onClick = { onChipClosePressed?.invoke(chip) }),
                )
            },
        )
    }
}

private fun Boolean.getExampleIcon(): (@Composable () -> Unit)? {
    return if (this) {
        {
            Icon(
                painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_24),
                contentDescription = "",
                tint = StylesSaluteTheme.colors.textDefaultSecondary,
            )
        }
    } else {
        null
    }
}

@Composable
@Preview(showBackground = true)
internal fun TextFieldScreenPreview() {
    StylesSaluteTheme {
        TextAreaScreen()
    }
}
