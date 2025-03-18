package com.sdds.playground.sandbox.segment.compose

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.SegmentItem
import com.sdds.compose.uikit.interactions.selection
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

@Composable
internal fun SegmentItemScreen(componentKey: ComponentKey = ComponentKey.SegmentItem) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<SegmentItemViewModel>(
            factory = SegmentItemViewModelFactory(SegmentItemUiState(), componentKey),
            key = componentKey.toString(),
        ),
        component = { uiState, style ->
            val interactionSource = remember { MutableInteractionSource() }
            SegmentItem(
                modifier = Modifier,
                isSelected = uiState.selected,
                style = style,
                label = uiState.label,
                value = uiState.value,
                startContent = content(
                    count = uiState.count,
                    contentType = uiState.startContent,
                    isSelected = uiState.selected,
                    interactionSource = interactionSource,
                ),
                endContent = content(
                    count = uiState.count,
                    contentType = uiState.endContent,
                    isSelected = uiState.selected,
                    interactionSource = interactionSource,
                ),
                enabled = uiState.enabled,
                interactionSource = interactionSource,
            )
        },
    )
}

private fun content(
    count: String,
    contentType: SegmentItemContent,
    isSelected: Boolean,
    interactionSource: MutableInteractionSource,
): (@Composable () -> Unit)? {
    return if (contentType != SegmentItemContent.NONE) {
        @Composable {
            when (contentType) {
                SegmentItemContent.ICON -> Icon(
                    painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )

                SegmentItemContent.COUNTER -> Counter(
                    modifier = Modifier.selection(
                        selected = isSelected,
                        interactionSource = interactionSource,
                    ),
                    count = AnnotatedString(count),
                    interactionSource = interactionSource,
                )

                else -> {}
            }
        }
    } else {
        null
    }
}

@Preview
@Composable
internal fun SegmentItemScreenPreview() {
    SandboxTheme {
        SegmentItemScreen()
    }
}
