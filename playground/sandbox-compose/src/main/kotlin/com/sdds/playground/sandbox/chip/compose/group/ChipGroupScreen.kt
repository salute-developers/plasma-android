package com.sdds.playground.sandbox.chip.compose.group

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.ChipGroupOverflowMode
import com.sdds.compose.uikit.Icon
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с [ChipGroup]
 */
@Composable
internal fun ChipGroupScreen(componentKey: ComponentKey = ComponentKey.ChipGroup) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<ChipGroupViewModel>(
            factory = ChipGroupViewModelFactory(ChipGroupUiState(), componentKey),
            key = componentKey.toString(),
        ),
        component = { chipGroupState, style ->
            ChipGroup(
                style = style,
                overflowMode = if (chipGroupState.shouldWrap) {
                    ChipGroupOverflowMode.Wrap
                } else {
                    ChipGroupOverflowMode.Scrollable
                },
            ) {
                chipGroupState.items.forEach {
                    var isSelected by remember { mutableStateOf(false) }
                    // TODO: https://github.com/salute-developers/plasma-android/issues/306
                    Chip(
                        isSelected = isSelected,
                        onSelectedChange = { value -> isSelected = value },
                        label = it,
                        endContent = if (isSelected) {
                            {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_close_24),
                                    contentDescription = "",
                                )
                            }
                        } else {
                            null
                        },
                        enabled = chipGroupState.enabled,
                    )
                }
            }
        },
    )
}

/**
 * Превью [ChipGroupScreen]
 */
@Preview(showBackground = true)
@Composable
private fun ButtonsScreenPreview() {
    SandboxTheme {
        ChipGroupScreen()
    }
}
