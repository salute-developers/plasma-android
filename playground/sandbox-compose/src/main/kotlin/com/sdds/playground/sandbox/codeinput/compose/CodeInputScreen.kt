package com.sdds.playground.sandbox.codeinput.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.focusTarget
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.CodeInput
import com.sdds.compose.uikit.CodeInputStyle
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.isEnabled
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.FieldFocusSelectorModeSwitch
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.Xs

/**
 * Экран с [CodeInput]
 */
@Composable
internal fun CodeInputScreen(componentKey: ComponentKey = ComponentKey.CodeInput) {
    val focusRequester = remember { FocusRequester() }
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<CodeInputViewModel>(
            factory = CodeInputViewModelFactory(CodeInputUiState(), componentKey),
            key = componentKey.toString(),
        ),
        component = { codeInputUiState, style ->
            val focusManager = LocalFocusManager.current
            var isFocusSelectorOn by remember { mutableStateOf(!FieldFocusSelectorModeSwitch) }
            Column {
                val validCode =
                    buildString { repeat(codeInputUiState.codeLength) { append(it + 1) } }
                CodeInput(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .focusRequester(focusRequester)
                        .focusTarget(),
                    style = style,
                    codeLength = codeInputUiState.codeLength,
                    hidden = codeInputUiState.hidden,
                    onCodeComplete = { it == validCode },
                    isItemValid = { it != codeInputUiState.errorItem },
                    caption = codeInputUiState.caption,
                    hasItemFocusSelector = if (isFocusSelectorOn) {
                        LocalFocusSelectorSettings.current.isEnabled()
                    } else {
                        false
                    },
                    captionAlignment = codeInputUiState.captionAlignment,
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
                LaunchedEffect(Unit) {
                    focusRequester.requestFocus()
                }
            }
        },
    )
}

@Composable
internal fun CodeInputPreview(style: CodeInputStyle) {
    CodeInput(
        style = style,
        codeLength = 6,
        hidden = true,
        caption = "Caption",
    )
}
