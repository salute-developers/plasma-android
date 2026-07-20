package com.sdds.compose.uikit.fixtures.stories.navigationdrawer

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarPlaceholder
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.NavigationDrawer
import com.sdds.compose.uikit.NavigationDrawerItem
import com.sdds.compose.uikit.NavigationDrawerStyle
import com.sdds.compose.uikit.NavigationDrawerValue
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.RemoteImage
import com.sdds.compose.uikit.fixtures.stories.NavigationDrawerUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.NavigationDrawerUiStateTransformer
import com.sdds.compose.uikit.fixtures.stories.navigationdrawer.NavigationDrawerStory.updateState
import com.sdds.compose.uikit.imageVectorSource
import com.sdds.compose.uikit.rememberNavigationDrawerState
import com.sdds.icons.compose.MailOutline24
import com.sdds.icons.compose.Menu24
import com.sdds.icons.compose.SddsIcons
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState
import kotlinx.coroutines.launch

@StoryUiState
data class NavigationDrawerUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val itemCount: Int = 3,
    val expanded: Boolean = false,
    val title: String = "Title",
    val counter: String = "",
    val expandOnFocus: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object NavigationDrawerStory : ComposeBaseStory<NavigationDrawerUiState, NavigationDrawerStyle>(
    ComponentKey.NavigationDrawer,
    NavigationDrawerUiState(),
    NavigationDrawerUiStatePropertiesProducer,
    NavigationDrawerUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: NavigationDrawerStyle,
        state: NavigationDrawerUiState,
    ) {
        NavigationDrawerStoryContent(style, state)
    }

    @Composable
    override fun Preview(
        style: NavigationDrawerStyle,
        key: ComponentKey,
    ) {
        Box {
            NavigationDrawerStoryContent(style, defaultState, true)
        }
    }
}

@Composable
private fun NavigationDrawerStoryContent(
    style: NavigationDrawerStyle,
    state: NavigationDrawerUiState,
    preview: Boolean = false,
) {
    val drawerState = rememberNavigationDrawerState(
        if (state.expanded) NavigationDrawerValue.Expanded else NavigationDrawerValue.Collapsed,
    )
    val scope = rememberCoroutineScope()
    LaunchedEffect(state.expanded) {
        drawerState.snapTo(if (state.expanded) NavigationDrawerValue.Expanded else NavigationDrawerValue.Collapsed)
    }
    val selectedIndex = remember { mutableIntStateOf(0) }
    NavigationDrawer(
        style = style,
        state = drawerState,
        expandOnFocus = state.expandOnFocus,
        header = {
            NavigationDrawerHeader(
                onClick = {
                    if (preview) {
                        scope.launch { drawerState.toggle() }
                    } else {
                        updateState(state.copy(expanded = !state.expanded))
                    }
                },
            )
        },
        footer = { NavigationDrawerFooter() },
        lazyContent = {
            items(state.itemCount) {
                val isSelected by remember { derivedStateOf { selectedIndex.intValue == it } }
                DrawerItem(
                    selected = isSelected,
                    onClick = { selectedIndex.intValue = it },
                    iconRes = SddsIcons.MailOutline24,
                    state = state,
                )
            }
        },
    )
}

@Composable
private fun NavigationDrawerHeader(
    onClick: () -> Unit,
) {
    NavigationDrawerItem(
        modifier = Modifier.fillMaxWidth(),
        selected = false,
        onClick = onClick,
        icon = {
            Icon(
                source = imageVectorSource(SddsIcons.Menu24),
                contentDescription = "Menu",
            )
        },
        titleContent = { Text("Menu") },
    )
}

@Composable
private fun NavigationDrawerFooter() {
    NavigationDrawerItem(
        modifier = Modifier.fillMaxWidth(),
        selected = false,
        icon = {
            Avatar(
                placeholder = AvatarPlaceholder.Name("Michael Scot"),
            ) {
                RemoteImage(
                    modifier = Modifier.matchParentSize(),
                    contentScale = ContentScale.Crop,
                    model = "https://cdn.costumewall.com/wp-content/uploads/2018/09/michael-scott.jpg",
                    contentDescription = "AsyncAvatar",
                )
            }
        },
        titleContent = { Text("User") },
    )
}

@Composable
private fun DrawerItem(
    selected: Boolean,
    iconRes: ImageVector,
    onClick: () -> Unit,
    state: NavigationDrawerUiState,
) {
    NavigationDrawerItem(
        modifier = Modifier.fillMaxWidth(),
        selected = selected,
        onClick = onClick,
        icon = {
            Icon(
                source = imageVectorSource(iconRes),
                contentDescription = "",
            )
        },
        titleContent = if (state.title.isNotBlank()) {
            { Text(state.title) }
        } else {
            null
        },
        indicator = if (state.counter.isNotBlank()) {
            { Counter(count = state.counter) }
        } else {
            null
        },
    )
}
