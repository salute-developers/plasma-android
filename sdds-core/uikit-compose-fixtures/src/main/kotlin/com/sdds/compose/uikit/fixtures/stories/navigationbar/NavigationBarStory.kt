package com.sdds.compose.uikit.fixtures.stories.navigationbar

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.NavBarCenterAlignmentStrategy
import com.sdds.compose.uikit.NavigationBar
import com.sdds.compose.uikit.NavigationBarContentPlacement
import com.sdds.compose.uikit.NavigationBarStyle
import com.sdds.compose.uikit.NavigationBarTextAlign
import com.sdds.compose.uikit.NavigationBarTextPlacement
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.stories.NavigationBarUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.NavigationBarUiStateTransformer
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class NavigationBarUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val title: String = "Title",
    val description: String = "Description",
    val contentText: String = "Content",
    val hasActionStart: Boolean = true,
    val hasActionEnd: Boolean = true,
    val textPlacement: NavigationBarTextPlacement = NavigationBarTextPlacement.Bottom,
    val contentPlacement: NavigationBarContentPlacement = NavigationBarContentPlacement.Bottom,
    val textAlign: NavigationBarTextAlign = NavigationBarTextAlign.Center,
    val centerAlignmentStrategy: NavBarCenterAlignmentStrategy = NavBarCenterAlignmentStrategy.Absolute,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object NavigationBarStory : ComposeBaseStory<NavigationBarUiState, NavigationBarStyle>(
    ComponentKey.NavigationBar,
    NavigationBarUiState(),
    NavigationBarUiStatePropertiesProducer,
    NavigationBarUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: NavigationBarStyle,
        state: NavigationBarUiState,
    ) {
        NavigationBar(
            style = style,
            textPlacement = state.textPlacement,
            textAlign = state.textAlign,
            contentPlacement = state.contentPlacement,
            centerAlignmentStrategy = state.centerAlignmentStrategy,
            titleContent = textContent(state.title),
            descriptionContent = descriptionContent(state.description),
            content = content(state.contentText),
            actionStart = actionStart(state.hasActionStart),
            actionEnd = actionEnd(state.hasActionEnd),
            onBackPressed = {
                println("Back button was pressed")
            },
        )
    }

    @Composable
    override fun Preview(
        style: NavigationBarStyle,
        key: ComponentKey,
    ) {
        NavigationBar(
            style = style,
            textPlacement = NavigationBarTextPlacement.Inline,
            contentPlacement = NavigationBarContentPlacement.Inline,
            textAlign = NavigationBarTextAlign.Start,
            titleContent = textContent("Text"),
            content = content("Content"),
            actionStart = actionStart(true),
            actionEnd = actionEnd(true),
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
                    painter = painterResource(R.drawable.ic_clip_24),
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
