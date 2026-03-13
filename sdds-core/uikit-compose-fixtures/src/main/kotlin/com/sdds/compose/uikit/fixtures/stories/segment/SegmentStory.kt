package com.sdds.compose.uikit.fixtures.stories.segment

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.Divider
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.SegmentHorizontal
import com.sdds.compose.uikit.SegmentItem
import com.sdds.compose.uikit.SegmentScope
import com.sdds.compose.uikit.SegmentStyle
import com.sdds.compose.uikit.SegmentVertical
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.stories.segmentitem.SegmentItemContent
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.SegmentUiStatePropertiesProducer
import com.sdds.sandbox.SegmentUiStateTransformer
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class SegmentUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val enabled: Boolean = true,
    val amount: Int = 2,
    val stretch: Boolean = false,
    val hasBackground: Boolean = true,
    val orientation: SegmentOrientation = SegmentOrientation.Horizontal,
    val label: String = "Label",
    val value: String = "",
    val startIcon: Boolean = false,
    val endContent: SegmentItemContent = SegmentItemContent.COUNTER,
    val count: String = "1",
    val hasDivider: Boolean = false,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

/**
 * Ориентация компонента Segment
 */
enum class SegmentOrientation {
    Horizontal,
    Vertical,
}

@Story
object SegmentStory : ComposeBaseStory<SegmentUiState, SegmentStyle>(
    ComponentKey.Segment,
    SegmentUiState(),
    SegmentUiStatePropertiesProducer,
    SegmentUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: SegmentStyle,
        state: SegmentUiState,
    ) {
        var currentId by remember { mutableIntStateOf(0) }
        when (state.orientation) {
            SegmentOrientation.Horizontal -> SegmentHorizontal(
                stretch = state.stretch,
                hasBackground = state.hasBackground,
                style = style,
            ) {
                SegmentItems(
                    onClick = { currentId = it },
                    isChecked = { currentId == it },
                    uiState = state,
                )
            }

            SegmentOrientation.Vertical -> SegmentVertical(
                hasBackground = state.hasBackground,
                style = style,
            ) {
                SegmentItems(
                    onClick = { currentId = it },
                    isChecked = { currentId == it },
                    uiState = state,
                )
            }
        }
    }
}

@Composable
private fun SegmentScope.SegmentItems(
    onClick: (Int) -> Unit,
    isChecked: (Int) -> Boolean,
    uiState: SegmentUiState,
) {
    repeat(uiState.amount) { id ->
        segmentItem {
            val interactionSource = remember { MutableInteractionSource() }
            SegmentItem(
                labelContent = { Text(uiState.label) },
                modifier = Modifier
                    .clickable(
                        enabled = uiState.enabled,
                        indication = null,
                        interactionSource = interactionSource,
                    ) {
                        onClick(id)
                    },
                isSelected = isChecked(id),
                valueContent = { Text(uiState.value) },
                startContent = startIcon(uiState.startIcon),
                endContent = endContent(uiState),
                enabled = uiState.enabled,
                interactionSource = interactionSource,
            )
        }

        if (uiState.hasDivider && id < uiState.amount - 1) {
            divider { Divider() }
        }
    }
}

@Composable
private fun startIcon(hasStartIcon: Boolean): (@Composable () -> Unit)? {
    return if (hasStartIcon) {
        {
            Icon(painterResource(id = R.drawable.ic_scribble_diagonal_24), "")
        }
    } else {
        null
    }
}

@Composable
private fun endContent(state: SegmentUiState): (@Composable () -> Unit)? {
    return when (state.endContent) {
        SegmentItemContent.NONE -> null
        SegmentItemContent.ICON -> {
            {
                Icon(painterResource(id = R.drawable.ic_scribble_diagonal_36), "")
            }
        }

        SegmentItemContent.COUNTER -> {
            {
                Counter(count = state.count)
            }
        }
    }
}
