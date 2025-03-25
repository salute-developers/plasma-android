package com.sdds.playground.sandbox.segment.compose

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.SegmentItem
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
                modifier = Modifier.focusable(uiState.enabled, interactionSource),
                isSelected = uiState.selected,
                style = style,
                label = uiState.label,
                value = uiState.value,
                startIcon = startIcon(uiState.startIcon),
                endIcon = endIcon(uiState.endContent),
                counter = counter(uiState.count, uiState.endContent),
                enabled = uiState.enabled,
                interactionSource = interactionSource,
            )
        },
    )
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

@Preview
@Composable
internal fun SegmentItemScreenPreview() {
    SandboxTheme {
        SegmentItemScreen()
    }
}
