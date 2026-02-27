package com.sdds.playground.sandbox.segment.compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.Divider
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.SegmentHorizontal
import com.sdds.compose.uikit.SegmentItem
import com.sdds.compose.uikit.SegmentScope
import com.sdds.compose.uikit.SegmentVertical
import com.sdds.compose.uikit.Text
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

@Preview
@Composable
internal fun SegmentScreenPreview() {
    SandboxTheme {
        SegmentScreen()
    }
}
