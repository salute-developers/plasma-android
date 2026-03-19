package com.sdds.compose.uikit.fixtures.stories.collapsingnavigationbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxScope
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
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.CollapsingNavigationBar
import com.sdds.compose.uikit.CollapsingNavigationBarDefaults
import com.sdds.compose.uikit.CollapsingNavigationBarStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.NavBarCenterAlignmentStrategy
import com.sdds.compose.uikit.NavigationBarTextAlign
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.rememberCollapsingNavigationBarState
import com.sdds.icons.R
import com.sdds.sandbox.CollapsingNavigationBarUiStatePropertiesProducer
import com.sdds.sandbox.CollapsingNavigationBarUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class CollapsingNavigationBarUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val collapsedTitle: String = "Title",
    val expandedTitle: String = "Title",
    val collapsedDescription: String = "Description",
    val expandedDescription: String = "Description",
    val contentText: String = "Content",
    val hasActionStart: Boolean = true,
    val hasActionEnd: Boolean = true,
    val collapsedTextAlign: NavigationBarTextAlign = NavigationBarTextAlign.Center,
    val expandedTextAlign: NavigationBarTextAlign = NavigationBarTextAlign.Start,
    val centerAlignmentStrategy: NavBarCenterAlignmentStrategy = NavBarCenterAlignmentStrategy.Absolute,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object CollapsingNavigationBarStory :
    ComposeBaseStory<CollapsingNavigationBarUiState, CollapsingNavigationBarStyle>(
        ComponentKey.CollapsingNavigationBar,
        CollapsingNavigationBarUiState(),
        CollapsingNavigationBarUiStatePropertiesProducer,
        CollapsingNavigationBarUiStateTransformer,
    ) {
    @Composable
    override fun BoxScope.Content(
        style: CollapsingNavigationBarStyle,
        state: CollapsingNavigationBarUiState,
    ) {
        val scrollBehavior =
            CollapsingNavigationBarDefaults.exitUntilCollapsedScrollBehavior(
                rememberCollapsingNavigationBarState(),
            )
        Column(
            modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        ) {
            CollapsingNavigationBar(
                style = style,
                scrollBehavior = scrollBehavior,
                collapsedTextAlign = state.collapsedTextAlign,
                expandedTextAlign = state.expandedTextAlign,
                collapsedTitle = textContent(state.collapsedTitle),
                expandedTitle = textContent(state.expandedTitle),
                collapsedDescription = textContent(state.collapsedDescription),
                expandedDescription = textContent(state.expandedDescription),
                content = content(state.contentText),
                actionStart = actionStart(state.hasActionStart),
                actionEnd = actionEnd(state.hasActionEnd),
                centerAlignmentStrategy = state.centerAlignmentStrategy,
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
    }

    @Composable
    override fun Preview(
        style: CollapsingNavigationBarStyle,
        key: ComponentKey,
    ) {
        CollapsingNavigationBar(
            style = style,
            collapsedTitle = textContent("Title"),
            content = content("Content"),
            actionStart = actionStart(true),
            actionEnd = actionEnd(true),
            expandedTitle = textContent("Title"),
            expandedDescription = textContent("Description"),
            collapsedDescription = textContent(
                "Description",
            ),
        )
    }
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
