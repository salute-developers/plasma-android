package com.sdds.playground.sandbox.segment.compose

import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.SegmentHorizontal
import com.sdds.compose.uikit.SegmentItem
import com.sdds.compose.uikit.SegmentScope
import com.sdds.compose.uikit.SegmentVertical
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

@Composable
internal fun SegmentScreen(componentKey: ComponentKey = ComponentKey.Segment) {
    val vm = viewModel<SegmentViewModel>(
        factory = SegmentViewModelFactory(SegmentUiState(), componentKey),
        key = componentKey.toString(),
    )
    ComponentScaffold(
        key = componentKey,
        viewModel = vm,
        component = { uiState, style ->
            when (uiState.orientation) {
                SegmentOrientation.Horizontal -> SegmentHorizontal(
                    stretch = uiState.stretch,
                    hasBackground = uiState.hasBackground,
                    style = style,
                ) {
                    SegmentItems(
                        onClick = vm::updateCurrentItem,
                        isChecked = vm::isSelected,
                        uiState = uiState,
                    )
                }

                SegmentOrientation.Vertical -> SegmentVertical(
                    hasBackground = uiState.hasBackground,
                    style = style,
                ) {
                    SegmentItems(
                        onClick = vm::updateCurrentItem,
                        isChecked = vm::isSelected,
                        uiState = uiState,
                    )
                }
            }
        },
    )
}

@Composable
private fun SegmentScope.SegmentItems(
    onClick: (Int) -> Unit,
    isChecked: (Int) -> Boolean,
    uiState: SegmentUiState,
) {
    repeat(uiState.amount) { id ->
        segmentItem {
            SegmentItem(
                modifier = Modifier
                    .clickable(
                        enabled = uiState.enabled,
                        indication = null,
                        interactionSource = null,
                    ) {
                        onClick(id)
                    },
                isSelected = isChecked(id),
                label = uiState.label,
                value = uiState.value,
                startIcon = startIcon(uiState.startIcon),
                endIcon = endIcon(uiState.endContent),
                counter = counter(uiState.count, uiState.endContent),
                enabled = uiState.enabled,
            )
        }
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

@Preview
@Composable
internal fun SegmentScreenPreview() {
    SandboxTheme {
        SegmentScreen()
    }
}
