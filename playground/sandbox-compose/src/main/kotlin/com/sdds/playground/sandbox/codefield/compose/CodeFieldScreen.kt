package com.sdds.playground.sandbox.codefield.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.CodeField
import com.sdds.compose.uikit.CodeFieldStyle
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с [CodeField]
 */
@Composable
internal fun CodeFieldScreen(componentKey: ComponentKey = ComponentKey.CodeField) {
    val focusRequester = remember { FocusRequester() }
    LaunchedEffect(Unit) { focusRequester.requestFocus() }
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<CodeFieldViewModel>(
            factory = CodeFieldViewModelFactory(CodeFieldUiState(), componentKey),
            key = componentKey.toString(),
        ),
        component = { codeFieldUiState, style ->
            val validCode = buildString { repeat(codeFieldUiState.codeLength) { append(it + 1) } }
            CodeField(
                modifier = Modifier.focusRequester(focusRequester),
                style = style,
                codeLength = codeFieldUiState.codeLength,
                hidden = codeFieldUiState.hidden,
                onCodeComplete = { it == validCode },
                isItemValid = { it != codeFieldUiState.errorItem },
                caption = codeFieldUiState.caption,
                captionAlignment = codeFieldUiState.captionAlignment,
            )
        },
    )
}

@Composable
internal fun CodeFieldPreview(style: CodeFieldStyle) {
    CodeField(
        style = style,
        codeLength = 6,
        hidden = false,
        caption = "Caption",
    )
}
