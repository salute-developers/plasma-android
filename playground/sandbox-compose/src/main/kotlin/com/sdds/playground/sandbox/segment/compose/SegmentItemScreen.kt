package com.sdds.playground.sandbox.segment.compose

import android.util.Log
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.SegmentItem
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
    val interactionSource = remember { MutableInteractionSource() }

    ComponentScaffold(
        component = {
            theme.themeWrapper {
                var isSelected by remember { mutableStateOf(false) }
                SegmentItem(
                    isSelected = isSelected,
                    onSelectedChange = {
                        Log.e("testtag", "onSelectedChange: selected=$it ")
                        isSelected = it
                    },
                    style = segmentItemViewModel
                        .getStyleProvider()
                        .style(uiState.variant),
                    label = uiState.label,
                    value = uiState.value,
                    startContent = startContent(uiState.startContent, uiState.count),
                    endContent = endContent(uiState.endContent, uiState.count),
                    enabled = uiState.enabled,
                    interactionSource = interactionSource,
                )
            }
        },
        propertiesOwner = segmentItemViewModel,
    )
}

@Composable
private fun startContent(
    contentType: SegmentItemContent,
    count: String,
): (@Composable () -> Unit)? {
    return if (contentType != SegmentItemContent.NONE) {
        {
            when (contentType) {
                SegmentItemContent.ICON -> Icon(
                    painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )

                SegmentItemContent.COUNTER -> Counter(count = AnnotatedString(count))
                SegmentItemContent.NONE -> {}
            }
        }
    } else {
        null
    }
}

@Composable
private fun endContent(
    contentType: SegmentItemContent,
    count: String,
): (@Composable () -> Unit)? {
    return if (contentType != SegmentItemContent.NONE) {
        {
            when (contentType) {
                SegmentItemContent.ICON -> Icon(
                    painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )

                SegmentItemContent.COUNTER -> Counter(count = AnnotatedString(count))
                SegmentItemContent.NONE -> {}
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
