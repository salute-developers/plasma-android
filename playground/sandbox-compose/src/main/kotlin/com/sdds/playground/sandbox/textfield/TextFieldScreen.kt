package com.sdds.playground.sandbox.textfield

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Image
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.buttons.SandboxBasicButton
import com.sdds.playground.sandbox.buttons.SandboxButton
import com.sdds.playground.sandbox.core.ComponentScaffold
import com.sdds.playground.sandbox.progress.SandboxProgress
import com.sdds.playground.sandbox.tokens.compose.StylesSaluteTheme

/**
 * Экран с компонентом [SandboxProgress]
 */
@Composable
internal fun TextFieldScreen() {
    val textFieldViewModel: TextFieldViewModel = viewModel()
    val textFieldUiState by textFieldViewModel.textFieldUiState.collectAsState()
    ComponentScaffold(
        component = {
            val focusManager = LocalFocusManager.current
            SandboxTextField(
                value = textFieldUiState.textFieldValue,
                onValueChange = {
                    textFieldViewModel.onValueChange(it)
                },
                enabled = textFieldUiState.enabled,
                placeholderText = textFieldUiState.placeholderText,
                labelText = textFieldUiState.labelText,
                captionText = textFieldUiState.captionText,
                labelType = textFieldUiState.labelType,
                fieldType = textFieldUiState.fieldType,
                dotBadgePosition = textFieldUiState.dotBadgePosition,
                size = textFieldUiState.size,
                state = textFieldUiState.state,
                leadingIcon = textFieldUiState.hasStartIcon.getExampleIcon(),
                trailingIcon = textFieldUiState.hasEndIcon.getExampleIcon(),
                readOnly = textFieldUiState.readOnly,
            )

            SandboxBasicButton(
                style = SandboxButton.Style.Default,
                size = SandboxButton.Size.XS,
                label = stringResource(R.string.sandbox_clear_focus),
                modifier = Modifier.align(Alignment.BottomEnd),
                onClick = { focusManager.clearFocus(true) },
            )
        },
        propertiesOwner = textFieldViewModel,
    )
}

private fun Boolean.getExampleIcon(): (@Composable () -> Unit)? {
    return if (this) {
        {
            Image(
                painter = painterResource(id = com.sdds.icons.R.drawable.ic_bulb_diode_fill_24),
                contentDescription = "",
                colorFilter = ColorFilter.tint(color = StylesSaluteTheme.colors.textDefaultSecondary),
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
