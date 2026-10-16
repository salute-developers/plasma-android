package com.sdds.compose.uikit.fixtures.stories.icontabitem

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.IconTabItem
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.fixtures.stories.IconTabItemUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.IconTabItemUiStateTransformer
import com.sdds.compose.uikit.imageVectorSource
import com.sdds.icons.compose.Plasma24
import com.sdds.icons.compose.SddsIcons
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/** Состояние истории [IconTabItem]. */
@StoryUiState
data class IconTabItemUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val selected: Boolean = false,
    val action: Boolean = false,
    val count: String = "",
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story(componentId = "IconTabItem")
object IconTabItemStory : ComposeBaseStory<IconTabItemUiState, TabItemStyle>(
    ComponentKey.IconTabItem,
    IconTabItemUiState(),
    IconTabItemUiStatePropertiesProducer,
    IconTabItemUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: TabItemStyle,
        state: IconTabItemUiState,
    ) {
        IconTabItem(
            style = style,
            isSelected = state.selected,
            icon = imageVectorSource(SddsIcons.Plasma24),
            actionIcon = if (state.action) imageVectorSource(SddsIcons.Plasma24) else null,
            count = state.count.takeIf { it.isNotEmpty() },
        )
    }

    @Composable
    override fun Preview(
        style: TabItemStyle,
        key: ComponentKey,
    ) {
        IconTabItem(style = style, isSelected = true, icon = imageVectorSource(SddsIcons.Plasma24))
    }
}
