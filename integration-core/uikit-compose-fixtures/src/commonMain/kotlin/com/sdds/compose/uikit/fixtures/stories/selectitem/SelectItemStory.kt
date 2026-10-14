package com.sdds.compose.uikit.fixtures.stories.selectitem

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.SelectItem
import com.sdds.compose.uikit.SelectItemStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.stories.SelectItemUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.SelectItemUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/** Состояние истории [SelectItem]. */
@StoryUiState
data class SelectItemUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val title: String = "Title",
    val label: String = "",
    val subtitle: String = "",
    val checked: Boolean = false,
    val enabled: Boolean = true,
    val disclosure: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story(componentId = "SelectItem")
object SelectItemStory : ComposeBaseStory<SelectItemUiState, SelectItemStyle>(
    ComponentKey.SelectItem,
    SelectItemUiState(),
    SelectItemUiStatePropertiesProducer,
    SelectItemUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: SelectItemStyle,
        state: SelectItemUiState,
    ) {
        SelectItem(
            checked = state.checked,
            onClick = {},
            style = style,
            enabled = state.enabled,
            disclosureEnabled = state.disclosure,
            labelContent = state.label.takeIf { it.isNotEmpty() }?.let { label -> { Text(label) } },
            subtitleContent = state.subtitle.takeIf { it.isNotEmpty() }?.let { subtitle -> { Text(subtitle) } },
            titleContent = { Text(state.title) },
        )
    }

    @Composable
    override fun Preview(
        style: SelectItemStyle,
        key: ComponentKey,
    ) {
        SelectItem(checked = true, onClick = {}, style = style, titleContent = { Text("Title") })
    }
}
