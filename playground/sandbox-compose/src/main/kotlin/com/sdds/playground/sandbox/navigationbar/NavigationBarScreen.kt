package com.sdds.playground.sandbox.navigationbar

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.NavigationBar
import com.sdds.compose.uikit.NavigationBarContentPlacement
import com.sdds.compose.uikit.NavigationBarStyle
import com.sdds.compose.uikit.NavigationBarTextAlign
import com.sdds.compose.uikit.NavigationBarTextPlacement
import com.sdds.compose.uikit.Text
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

@Composable
internal fun NavigationBarScreen(componentKey: ComponentKey = ComponentKey.NavigationBar) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<NavigationBarViewModel>(
            factory = NavigationBarViewModelFactory(
                defaultState = NavigationBarUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { navigationBarUiState, style ->
            NavigationBar(
                style = style,
                textPlacement = navigationBarUiState.textPlacement,
                textAlign = navigationBarUiState.textAlign,
                contentPlacement = navigationBarUiState.contentPlacement,
                centerAlignmentStrategy = navigationBarUiState.centerAlignmentStrategy,
                titleContent = textContent(navigationBarUiState.title),
                descriptionContent = descriptionContent(navigationBarUiState.description),
                content = content(navigationBarUiState.contentText),
                actionStart = actionStart(navigationBarUiState.hasActionStart),
                actionEnd = actionEnd(navigationBarUiState.hasActionEnd),
            )
        },
    )
}

@Composable
internal fun NavigationBarPreview(style: NavigationBarStyle) {
    NavigationBar(
        style = style,
        textPlacement = NavigationBarTextPlacement.Inline,
        contentPlacement = NavigationBarContentPlacement.Inline,
        textAlign = NavigationBarTextAlign.Start,
        textContent = textContent("Text"),
        content = content("Content"),
        actionStart = actionStart(true),
        actionEnd = actionEnd(true),
    )
}

private fun actionStart(hasAction: Boolean): (@Composable () -> Unit)? {
    return if (hasAction) {
        @Composable {
            Icon(
                painter = painterResource(com.sdds.icons.R.drawable.ic_search_24),
                contentDescription = "",
            )
        }
    } else {
        null
    }
}

private fun actionEnd(hasAction: Boolean): (@Composable () -> Unit)? {
    return if (hasAction) {
        @Composable {
            Icon(
                painter = painterResource(com.sdds.icons.R.drawable.ic_menu_24),
                contentDescription = "",
            )
        }
    } else {
        null
    }
}

private fun content(text: String): (@Composable () -> Unit)? {
    return if (text.isEmpty()) {
        null
    } else {
        @Composable { Text(text) }
    }
}

private fun textContent(text: String): (@Composable () -> Unit)? {
    return if (text.isEmpty()) {
        null
    } else {
        @Composable {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text)
                Spacer(Modifier.width(4.dp))
                Icon(
                    modifier = Modifier,
                    painter = painterResource(com.sdds.icons.R.drawable.ic_clip_24),
                    contentDescription = "",
                )
            }
        }
    }
}

private fun descriptionContent(description: String): (@Composable () -> Unit)? {
    return if (description.isEmpty()) {
        null
    } else {
        @Composable {
            Text(description)
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun NavigationBarScreenPreview() {
    SandboxTheme {
        NavigationBarScreen()
    }
}
