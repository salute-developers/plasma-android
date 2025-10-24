package com.sdds.playground.sandbox.note.compose

import androidx.compose.foundation.layout.sizeIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.LinkButton
import com.sdds.compose.uikit.Note
import com.sdds.compose.uikit.NoteStyle
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с компонентом [Note]
 */
@Composable
internal fun NoteScreen(componentKey: ComponentKey = ComponentKey.Note) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<NoteViewModel>(
            factory = NoteViewModelFactory(
                defaultState = NoteUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { noteUiState, style ->
            Note(
                modifier = Modifier.sizeIn(maxWidth = 300.dp, maxHeight = 200.dp),
                style = style,
                text = noteUiState.text,
                title = noteUiState.title,
                contentBefore = {
                    Icon(
                        painter = painterResource(R.drawable.ic_salute_outline_36),
                        contentDescription = null,
                    )
                },
                action = if (noteUiState.hasAction) {
                    {
                        LinkButton(
                            label = "Label",
                            onClick = {},
                        )
                    }
                } else {
                    null
                },
            )
        },
    )
}

@Composable
@Preview(showBackground = true)
private fun NoteScreenPreview() {
    SandboxTheme {
        NoteScreen()
    }
}

@Composable
internal fun NotePreview(style: NoteStyle) {
    Note(
        style = style,
        text = "Text",
        title = "Title",
        contentBefore = {
            Icon(
                painter = painterResource(R.drawable.ic_salute_outline_24),
                contentDescription = null,
            )
        },
        action = {
            LinkButton(
                label = "Label",
                onClick = {},
            )
        },
    )
}
