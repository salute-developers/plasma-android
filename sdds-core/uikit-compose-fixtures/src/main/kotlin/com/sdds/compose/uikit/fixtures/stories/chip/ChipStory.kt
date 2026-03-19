package com.sdds.compose.uikit.fixtures.stories.chip

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.Icon
import com.sdds.icons.R
import com.sdds.sandbox.ChipUiStatePropertiesProducer
import com.sdds.sandbox.ChipUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class ChipUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val isClickable: Boolean = true,
    val label: String = "Label",
    val hasStartIcon: Boolean = true,
    val hasEndIcon: Boolean = true,
    val enabled: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object ChipStory : ComposeBaseStory<ChipUiState, ChipStyle>(
    ComponentKey.Chip,
    ChipUiState(),
    ChipUiStatePropertiesProducer,
    ChipUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: ChipStyle,
        state: ChipUiState,
    ) {
        Chip(
            onClick = getOnClick(state.isClickable),
            style = style,
            label = state.label,
            enabled = state.enabled,
            startContent = startContent(state.hasStartIcon),
            endContent = endContent(state.hasEndIcon),
        )
    }

    @Composable
    override fun Preview(
        style: ChipStyle,
        key: ComponentKey,
    ) {
        Chip(
            style = style,
            label = "Label",
            onClick = {},
            endContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_close_24),
                    contentDescription = null,
                )
            },
            enabled = true,
        )
    }
}

private fun getOnClick(isClickable: Boolean): (() -> Unit)? {
    return if (isClickable) {
        {}
    } else {
        null
    }
}

private fun startContent(hasContent: Boolean): (@Composable () -> Unit)? {
    return if (hasContent) {
        {
            Icon(
                painter = painterResource(id = com.sdds.icons.R.drawable.ic_add_fill_24),
                contentDescription = "",
            )
        }
    } else {
        null
    }
}

private fun endContent(hasContent: Boolean): (@Composable () -> Unit)? {
    return if (hasContent) {
        {
            Icon(
                painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_24),
                contentDescription = "",
            )
        }
    } else {
        null
    }
}
