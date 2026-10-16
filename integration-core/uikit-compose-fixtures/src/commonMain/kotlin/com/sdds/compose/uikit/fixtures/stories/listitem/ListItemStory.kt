package com.sdds.compose.uikit.fixtures.stories.listitem

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.stories.ListItemUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.ListItemUiStateTransformer
import com.sdds.icons.compose.Plasma24
import com.sdds.icons.compose.SddsIcons
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/** Состояние истории [ListItem]. */
@StoryUiState
data class ListItemUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val title: String = "Title",
    val label: String = "",
    val subtitle: String = "",
    val endText: String = "",
    val startIcon: Boolean = false,
    val disclosure: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story(componentId = "ListItem")
object ListItemStory : ComposeBaseStory<ListItemUiState, ListItemStyle>(
    ComponentKey.ListItem,
    ListItemUiState(),
    ListItemUiStatePropertiesProducer,
    ListItemUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: ListItemStyle,
        state: ListItemUiState,
    ) {
        ListItem(
            style = style,
            titleContent = { Text(state.title) },
            disclosureEnabled = state.disclosure,
            labelContent = state.label.takeIf { it.isNotEmpty() }?.let { label -> { Text(label) } },
            subtitleContent = state.subtitle.takeIf { it.isNotEmpty() }?.let { subtitle -> { Text(subtitle) } },
            startContent = if (state.startIcon) {
                { Icon(painter = rememberVectorPainter(SddsIcons.Plasma24), contentDescription = "") }
            } else {
                null
            },
            endContent = state.endText.takeIf { it.isNotEmpty() }?.let { end -> { Text(end) } },
        )
    }

    @Composable
    override fun Preview(
        style: ListItemStyle,
        key: ComponentKey,
    ) {
        ListItem(style = style, titleContent = { Text("Title") })
    }
}
