package com.sdds.compose.uikit.fixtures.stories.tabitem

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.TabItem
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.stories.TabItemUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.TabItemUiStateTransformer
import com.sdds.icons.compose.Plasma24
import com.sdds.icons.compose.SddsIcons
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/** Состояние истории [TabItem]. */
@StoryUiState
data class TabItemUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val label: String = "Tab",
    val helper: String = "",
    val selected: Boolean = false,
    val enabled: Boolean = true,
    val startIcon: Boolean = false,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story(componentId = "TabItem")
object TabItemStory : ComposeBaseStory<TabItemUiState, TabItemStyle>(
    ComponentKey.TabItem,
    TabItemUiState(),
    TabItemUiStatePropertiesProducer,
    TabItemUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: TabItemStyle,
        state: TabItemUiState,
    ) {
        TabItem(
            onClick = {},
            style = style,
            isSelected = state.selected,
            enabled = state.enabled,
            helperContent = state.helper.takeIf { it.isNotEmpty() }?.let { helper -> { Text(helper) } },
            startContent = if (state.startIcon) {
                { Icon(painter = rememberVectorPainter(SddsIcons.Plasma24), contentDescription = "") }
            } else {
                null
            },
            content = { Text(state.label) },
        )
    }

    @Composable
    override fun Preview(
        style: TabItemStyle,
        key: ComponentKey,
    ) {
        TabItem(onClick = {}, style = style, isSelected = true, content = { Text("Tab") })
    }
}
