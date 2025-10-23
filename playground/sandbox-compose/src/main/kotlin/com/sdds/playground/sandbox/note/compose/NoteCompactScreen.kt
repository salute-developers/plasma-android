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
import com.sdds.compose.uikit.NoteCompact
import com.sdds.compose.uikit.NoteCompactStyle
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с компонентом [NoteCompact]
 */
@Composable
internal fun NoteCompactScreen(componentKey: ComponentKey = ComponentKey.NoteCompact) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<NoteCompactViewModel>(
            factory = NoteCompactViewModelFactory(
                defaultState = NoteUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { noteUiState, style ->
            NoteCompact(
                modifier = Modifier.sizeIn(maxWidth = 400.dp, maxHeight = 300.dp),
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
private fun NoteCompactScreenPreview() {
    SandboxTheme {
        NoteCompactScreen()
    }
}

@Composable
internal fun NoteCompactPreview(style: NoteCompactStyle) {
    NoteCompact(
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
