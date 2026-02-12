package com.sdds.playground.sandbox.editable

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Editable
import com.sdds.compose.uikit.EditableStyle
import com.sdds.compose.uikit.Icon
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с компонентом [Editable]
 */
@Composable
internal fun EditableScreen(componentKey: ComponentKey = ComponentKey.Editable) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<EditableViewModel>(
            factory = EditableViewModelFactory(
                defaultState = EditableUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { editableUiState, style ->
            var text by remember { mutableStateOf(TextFieldValue("Value")) }
            val focusRequester = remember { FocusRequester() }
            Editable(
                modifier = Modifier
                    .focusRequester(focusRequester),
                style = style,
                value = text,
                onValueChange = { text = it },
                icon = {
                    Icon(
                        modifier = Modifier
                            .clickable(
                                indication = null,
                                interactionSource = remember { MutableInteractionSource() },
                            ) {
                                focusRequester.requestFocus()
                                text = text.copy(selection = TextRange(text.text.length))
                            },
                        painter = painterResource(R.drawable.ic_edit_fill_36),
                        contentDescription = null,
                    )
                },
                iconPlacement = editableUiState.iconPlacement,
                textAlign = editableUiState.textAlign.align,
                singleLine = editableUiState.singleLine,
                enabled = editableUiState.enabled,
                readOnly = editableUiState.readonly,
            )
        },
    )
}

@Composable
internal fun EditablePreview(style: EditableStyle) {
    Editable(
        style = style,
        value = TextFieldValue("Value"),
        icon = {
            Icon(
                painter = painterResource(R.drawable.ic_edit_fill_36),
                contentDescription = null,
            )
        },
    )
}

@Composable
@Preview(showBackground = true)
private fun EditableScreenPreview() {
    SandboxTheme {
        EditableScreen()
    }
}
