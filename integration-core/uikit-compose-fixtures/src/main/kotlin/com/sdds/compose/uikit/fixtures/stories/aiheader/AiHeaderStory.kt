package com.sdds.compose.uikit.fixtures.stories.aiheader

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.ai.AiHeader
import com.sdds.compose.uikit.ai.AiHeaderStyle
import com.sdds.compose.uikit.ai.AiHeaderTitleAlignment
import com.sdds.compose.uikit.fixtures.stories.AiHeaderUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.AiHeaderUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class AiHeaderUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val title: String = "Title",
    val subtitle: String = "Subtitle",
    val hasDivider: Boolean = false,
    val titleAlignment: AiHeaderTitleAlignment = AiHeaderTitleAlignment.Start,
    val hasStartButton: Boolean = true,
    val hasEndButton: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object AiHeaderStory : ComposeBaseStory<AiHeaderUiState, AiHeaderStyle>(
    ComponentKey.AiHeader,
    AiHeaderUiState(),
    AiHeaderUiStatePropertiesProducer,
    AiHeaderUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: AiHeaderStyle,
        state: AiHeaderUiState,
    ) {
        AiHeader(
            modifier = Modifier.fillMaxWidth(),
            style = style,
            hasDivider = state.hasDivider,
            titleAlignment = state.titleAlignment,
            startContent = if (state.hasStartButton) {
                { IconButton(iconRes = com.sdds.icons.R.drawable.ic_panel_sidebar_l_outline_24, onClick = {}) }
            } else {
                null
            },
            endContent = if (state.hasEndButton) {
                { IconButton(iconRes = com.sdds.icons.R.drawable.ic_close_24, onClick = {}) }
            } else {
                null
            },
            titleContent = {
                Text(text = state.title)
            },
            subtitleContent = state.subtitle.takeIf { it.isNotEmpty() }?.let {
                {
                    Text(text = it)
                }
            },
        )
    }

    @Composable
    override fun Preview(style: AiHeaderStyle, key: ComponentKey) {
        AiHeader(
            modifier = Modifier.fillMaxWidth(),
            style = style,
            startContent = {
                IconButton(iconRes = com.sdds.icons.R.drawable.ic_panel_sidebar_l_outline_24, onClick = {})
            },
            endContent = {
                IconButton(iconRes = com.sdds.icons.R.drawable.ic_close_24, onClick = {})
            },
            titleContent = { Text(text = "Title") },
            subtitleContent = { Text(text = "Subtitle") },
        )
    }
}
