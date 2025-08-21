package com.sdds.playground.sandbox.codeinput.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.CodeInput
import com.sdds.compose.uikit.CodeInputStyle
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с [CodeInput]
 */
@Composable
internal fun CodeInputScreen(componentKey: ComponentKey = ComponentKey.CodeInput) {
    val focusRequester = remember { FocusRequester() }
    LaunchedEffect(Unit) { focusRequester.requestFocus() }
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<CodeInputViewModel>(
            factory = CodeInputViewModelFactory(CodeInputUiState(), componentKey),
            key = componentKey.toString(),
        ),
        component = { codeInputUiState, style ->
            val validCode = buildString { repeat(codeInputUiState.codeLength) { append(it + 1) } }
            CodeInput(
                modifier = Modifier.focusRequester(focusRequester),
                style = style,
                codeLength = codeInputUiState.codeLength,
                hidden = codeInputUiState.hidden,
                onCodeComplete = { it == validCode },
                isItemValid = { it != codeInputUiState.errorItem },
                caption = codeInputUiState.caption,
                captionAlignment = codeInputUiState.captionAlignment,
            )
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
