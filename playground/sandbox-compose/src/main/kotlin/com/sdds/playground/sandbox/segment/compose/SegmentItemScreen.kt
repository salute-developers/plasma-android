package com.sdds.playground.sandbox.segment.compose

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
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
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold

@Composable
internal fun SegmentItemScreen(theme: Theme.ThemeInfoCompose = Theme.composeDefault) {
    val segmentItemViewModel: SegmentItemViewModel =
        viewModel(
            factory = SegmentItemViewModelFactory(SegmentItemUiState(), theme),
            key = theme.toString(),
        )
    val uiState by segmentItemViewModel.uiState.collectAsState()

    ComponentScaffold(
        component = {
            theme.themeWrapper {
                val interactionSource = remember { MutableInteractionSource() }
                SegmentItem(
                    modifier = Modifier,
                    isSelected = uiState.selected,
                    style = segmentItemViewModel
                        .getStyleProvider()
                        .style(uiState.variant),
                    label = uiState.label,
                    value = uiState.value,
                    startContent = content(
                        enabled = uiState.enabled,
                        count = uiState.count,
                        contentType = uiState.startContent,
                        isSelected = uiState.selected,
                        interactionSource = interactionSource,
                    ),
                    endContent = content(
                        enabled = uiState.enabled,
                        count = uiState.count,
                        contentType = uiState.endContent,
                        isSelected = uiState.selected,
                        interactionSource = interactionSource,
                    ),
                    enabled = uiState.enabled,
                    interactionSource = interactionSource,
                )
            }
        },
        propertiesOwner = segmentItemViewModel,
    )
}

private fun content(
    enabled: Boolean,
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
                        enabled = enabled,
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
