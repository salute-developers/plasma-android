package com.sdds.compose.uikit.fixtures.stories.accordionitem

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.AccordionItem
import com.sdds.compose.uikit.AccordionItemStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.stories.AccordionItemUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.AccordionItemUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/** Состояние истории [AccordionItem]. */
@StoryUiState
data class AccordionItemUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val title: String = "Title",
    val content: String = "Content",
    val opened: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story(componentId = "AccordionItem")
object AccordionItemStory : ComposeBaseStory<AccordionItemUiState, AccordionItemStyle>(
    ComponentKey.AccordionItem,
    AccordionItemUiState(),
    AccordionItemUiStatePropertiesProducer,
    AccordionItemUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: AccordionItemStyle,
        state: AccordionItemUiState,
    ) {
        AccordionItem(
            style = style,
            opened = state.opened,
            title = state.title,
            onClick = {},
            content = { Text(state.content) },
        )
    }

    @Composable
    override fun Preview(
        style: AccordionItemStyle,
        key: ComponentKey,
    ) {
        AccordionItem(style = style, opened = true, title = "Title", content = { Text("Content") })
    }
}
