package com.sdds.compose.uikit.fixtures.stories.navigationdraweritem

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.NavigationDrawerItem
import com.sdds.compose.uikit.NavigationDrawerItemStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.stories.NavigationDrawerItemUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.NavigationDrawerItemUiStateTransformer
import com.sdds.icons.compose.Plasma24
import com.sdds.icons.compose.SddsIcons
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/** Состояние истории [NavigationDrawerItem]. */
@StoryUiState
data class NavigationDrawerItemUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val title: String = "Title",
    val selected: Boolean = false,
    val enabled: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story(componentId = "NavigationDrawerItem")
object NavigationDrawerItemStory : ComposeBaseStory<NavigationDrawerItemUiState, NavigationDrawerItemStyle>(
    ComponentKey.NavigationDrawerItem,
    NavigationDrawerItemUiState(),
    NavigationDrawerItemUiStatePropertiesProducer,
    NavigationDrawerItemUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: NavigationDrawerItemStyle,
        state: NavigationDrawerItemUiState,
    ) {
        NavigationDrawerItem(
            icon = { Icon(painter = rememberVectorPainter(SddsIcons.Plasma24), contentDescription = "") },
            style = style,
            selected = state.selected,
            enabled = state.enabled,
            onClick = {},
            titleContent = { Text(state.title) },
        )
    }

    @Composable
    override fun Preview(
        style: NavigationDrawerItemStyle,
        key: ComponentKey,
    ) {
        NavigationDrawerItem(
            icon = { Icon(painter = rememberVectorPainter(SddsIcons.Plasma24), contentDescription = "") },
            style = style,
            selected = true,
            titleContent = { Text("Title") },
        )
    }
}
