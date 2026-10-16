package com.sdds.compose.uikit.fixtures.stories.tabbaritem

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.TabBarItem
import com.sdds.compose.uikit.TabBarItemStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.stories.TabBarItemUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.TabBarItemUiStateTransformer
import com.sdds.icons.compose.Plasma24
import com.sdds.icons.compose.SddsIcons
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/** Состояние истории [TabBarItem]. */
@StoryUiState
data class TabBarItemUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val label: String = "Label",
    val selected: Boolean = false,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story(componentId = "TabBarItem")
object TabBarItemStory : ComposeBaseStory<TabBarItemUiState, TabBarItemStyle>(
    ComponentKey.TabBarItem,
    TabBarItemUiState(),
    TabBarItemUiStatePropertiesProducer,
    TabBarItemUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: TabBarItemStyle,
        state: TabBarItemUiState,
    ) {
        TabBarItem(
            icon = { Icon(painter = rememberVectorPainter(SddsIcons.Plasma24), contentDescription = "") },
            isSelected = state.selected,
            onClick = {},
            style = style,
            labelContent = { Text(state.label) },
        )
    }

    @Composable
    override fun Preview(
        style: TabBarItemStyle,
        key: ComponentKey,
    ) {
        TabBarItem(
            icon = { Icon(painter = rememberVectorPainter(SddsIcons.Plasma24), contentDescription = "") },
            isSelected = true,
            style = style,
            labelContent = { Text("Label") },
        )
    }
}
