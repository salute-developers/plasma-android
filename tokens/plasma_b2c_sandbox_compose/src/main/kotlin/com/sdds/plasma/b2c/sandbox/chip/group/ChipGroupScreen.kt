package com.sdds.plasma.b2c.sandbox.chip.group

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.Icon
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.chip.Accent
import com.sdds.playground.sandbox.chip.Secondary
import com.sdds.playground.sandbox.chip.chipStyleBuilder
import com.sdds.playground.sandbox.core.ComponentScaffold

/**
 * Экран с [ChipGroup]
 */
@Composable
internal fun ChipGroupScreen() {
    val chipGroupViewModel: ChipGroupParametersViewModel =
        viewModel(ChipGroupParametersViewModel::class.java)
    val chipGroupState by chipGroupViewModel.chipGroupState.collectAsState()

    ComponentScaffold(
        component = {
            ChipGroup(
                style = chipGroupState.chipGroupStyle(),
                overflowMode = if (chipGroupState.shouldWrap) {
                    ChipGroup.OverflowMode.Wrap
                } else {
                    ChipGroup.OverflowMode.Scrollable
                },
            ) {
                chipGroupState.items.forEach {
                    var isSelected by remember { mutableStateOf(false) }
                    Chip(
                        isSelected = isSelected,
                        onSelectedChange = { value -> isSelected = value },
                        label = it,
                        style = chipGroupState.size.chipStyleBuilder()
                            .apply {
                                if (isSelected) {
                                    Accent
                                } else {
                                    Secondary
                                }
                            }
                            .style(),
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
        propertiesOwner = chipGroupViewModel,
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
