package com.sdds.playground.sandbox.segment.compose

import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.SegmentHorizontal
import com.sdds.compose.uikit.SegmentItem
import com.sdds.compose.uikit.SegmentScope
import com.sdds.compose.uikit.SegmentVertical
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
                        hasCounter = uiState.hasCounter,
                        hasIcon = uiState.hasIcon,
                    )
                }

                SegmentOrientation.Vertical -> SegmentVertical(
                    hasBackground = uiState.hasBackground,
                    style = style,
                ) {
                    SegmentItems(
                        onClick = vm::updateCurrentItem,
                        isChecked = vm::isSelected,
                        hasCounter = uiState.hasCounter,
                        hasIcon = uiState.hasIcon,
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
    hasCounter: Boolean,
    hasIcon: Boolean,
) {
    repeat(3) { id ->
        segmentItem {
            SegmentItem(
                modifier = Modifier
                    .clickable(
                        indication = null,
                        interactionSource = null,
                    ) {
                        onClick(id)
                    },
                label = "Label",
                isSelected = isChecked(id),
                startIcon = if (hasIcon) painterResource(id = com.sdds.icons.R.drawable.ic_accessibility_36) else null,
                counter = if (hasCounter) "${id + 1}" else null,
            )
        }
    }
}

@Preview
@Composable
internal fun SegmentScreenPreview() {
    SandboxTheme {
        SegmentScreen()
    }
}
