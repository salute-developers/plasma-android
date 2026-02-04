package com.sdds.playground.sandbox.navigationbar.collapsing

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.CollapsingNavigationBar
import com.sdds.compose.uikit.CollapsingNavigationBarDefaults
import com.sdds.compose.uikit.CollapsingNavigationBarStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.rememberCollapsingNavigationBarState
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

@Composable
internal fun CollapsingNavigationBarScreen(componentKey: ComponentKey = ComponentKey.CollapsingNavigationBar) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<CollapsingNavigationBarViewModel>(
            factory = CollapsingNavigationBarViewModelFactory(
                defaultState = CollapsingNavigationBarUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { collapsingNavigationBarUiState, style ->
            val scrollBehavior =
                CollapsingNavigationBarDefaults.exitUntilCollapsedScrollBehavior(rememberCollapsingNavigationBarState())
            Column(
                modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
            ) {
                CollapsingNavigationBar(
                    style = style,
                    scrollBehavior = scrollBehavior,
                    collapsedTextAlign = collapsingNavigationBarUiState.collapsedTextAlign,
                    expandedTextAlign = collapsingNavigationBarUiState.expandedTextAlign,
                    collapsedTitle = textContent(collapsingNavigationBarUiState.collapsedTitle),
                    expandedTitle = textContent(collapsingNavigationBarUiState.expandedTitle),
                    collapsedDescription = textContent(collapsingNavigationBarUiState.collapsedDescription),
                    expandedDescription = textContent(collapsingNavigationBarUiState.expandedDescription),
                    content = content(collapsingNavigationBarUiState.contentText),
                    actionStart = actionStart(collapsingNavigationBarUiState.hasActionStart),
                    actionEnd = actionEnd(collapsingNavigationBarUiState.hasActionEnd),
                    centerAlignmentStrategy = collapsingNavigationBarUiState.centerAlignmentStrategy,
                    onBackPressed = {
                        println("Back button was pressed")
                    },
                )
                LazyColumn {
                    items(100) {
                        Text(modifier = Modifier.padding(32.dp), text = "Label text $it")
                    }
                }
            }
        },
    )
}

@Composable
internal fun CollapsingNavigationBarPreview(style: CollapsingNavigationBarStyle) {
    CollapsingNavigationBar(
        style = style,
        collapsedTitle = textContent("Title"),
        content = content("Content"),
        actionStart = actionStart(true),
        actionEnd = actionEnd(true),
        expandedTitle = textContent("Title"),
        expandedDescription = textContent("Description"),
        collapsedDescription = textContent("Description"),
    )
}

private fun actionStart(hasAction: Boolean): (@Composable RowScope.() -> Unit)? {
    return if (hasAction) {
        @Composable {
            Icon(
                painter = painterResource(R.drawable.ic_search_24),
                contentDescription = "",
            )
            Icon(
                painter = painterResource(R.drawable.ic_plus_24),
                contentDescription = "",
            )
        }
    } else {
        null
    }
}

private fun actionEnd(hasAction: Boolean): (@Composable RowScope.() -> Unit)? {
    return if (hasAction) {
        @Composable {
            Icon(
                painter = painterResource(R.drawable.ic_menu_24),
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
        @Composable {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ) { Text(text) }
        }
    }
}

private fun textContent(text: String): (@Composable () -> Unit)? {
    return if (text.isEmpty()) {
        null
    } else {
        @Composable { Text(text) }
    }
}

@Composable
@Preview(showBackground = true)
private fun CollapsingNavigationBarScreenPreview() {
    SandboxTheme {
        CollapsingNavigationBarScreen()
    }
}
