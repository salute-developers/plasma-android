package com.sdds.playground.sandbox.notificationcontent.compose

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.NotificationContent
import com.sdds.compose.uikit.NotificationContentStyle
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с компонентом [NotificationContent]
 */
@Composable
internal fun NotificationContentScreen(componentKey: ComponentKey = ComponentKey.NotificationContent) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<NotificationContentViewModel>(
            factory = NotificationContentViewModelFactory(
                defaultState = NotificationContentUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { notificationContentUiState, style ->
            NotificationContent(
                modifier = Modifier.fillMaxWidth(0.7f),
                style = style,
                title = notificationContentUiState.title,
                text = notificationContentUiState.text,
                buttons = if (notificationContentUiState.hasActions) {
                    {
                        button { Button("Ok", {}) }
                        button { Button("Cancel", {}) }
                    }
                } else {
                    null
                },
            )
        },
    )
}

@Composable
internal fun NotificationContentPreview(style: NotificationContentStyle) {
    NotificationContent(
        modifier = Modifier.fillMaxWidth(0.6f),
        style = style,
        title = "Title",
        text = "Text",
        buttons = {
            button { Button("Ok", {}) }
            button { Button("Cancel", {}) }
        },
    )
}

@Composable
@Preview(showBackground = true)
private fun NotificationContentScreenPreview() {
    SandboxTheme {
        NotificationContentScreen()
    }
}
