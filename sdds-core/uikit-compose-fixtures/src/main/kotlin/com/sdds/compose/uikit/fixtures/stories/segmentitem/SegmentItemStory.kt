package com.sdds.compose.uikit.fixtures.stories.segmentitem

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.SegmentItem
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.SegmentItemUiStatePropertiesProducer
import com.sdds.sandbox.SegmentItemUiStateTransformer
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class SegmentItemUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val label: String = "Label",
    val value: String = "",
    val selected: Boolean = true,
    val startIcon: Boolean = false,
    val endContent: SegmentItemContent = SegmentItemContent.COUNTER,
    val enabled: Boolean = true,
    val count: String = "1",
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

enum class SegmentItemContent {
    NONE,
    ICON,
    COUNTER,
}

@Story
object SegmentItemStory : ComposeBaseStory<SegmentItemUiState, SegmentItemStyle>(
    ComponentKey.SegmentItem,
    SegmentItemUiState(),
    SegmentItemUiStatePropertiesProducer,
    SegmentItemUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: SegmentItemStyle,
        state: SegmentItemUiState,
    ) {
        val interactionSource = remember { MutableInteractionSource() }
        SegmentItem(
            modifier = Modifier.focusable(state.enabled, interactionSource),
            isSelected = state.selected,
            style = style,
            label = state.label,
            value = state.value,
            startIcon = startIcon(state.startIcon),
            endIcon = endIcon(state.endContent),
            counter = counter(state.count, state.endContent),
            enabled = state.enabled,
            interactionSource = interactionSource,
        )
    }

    @Composable
    override fun Preview(
        style: SegmentItemStyle,
        key: ComponentKey,
    ) {
        SegmentItem(
            style = style,
            isSelected = true,
            label = "Label",
            value = "Value",
            enabled = true,
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_plasma_24),
                    contentDescription = "",
                )
            },
            endContent = null,
        )
    }
}

@Composable
private fun startIcon(hasStartIcon: Boolean): Painter? {
    return if (hasStartIcon) {
        painterResource(id = R.drawable.ic_scribble_diagonal_24)
    } else {
        null
    }
}

@Composable
private fun endIcon(contentType: SegmentItemContent): Painter? {
    return if (contentType == SegmentItemContent.ICON) {
        painterResource(id = R.drawable.ic_scribble_diagonal_36)
    } else {
        null
    }
}

@Composable
private fun counter(count: String, contentType: SegmentItemContent): String? {
    return if (contentType == SegmentItemContent.COUNTER) count else null
}
