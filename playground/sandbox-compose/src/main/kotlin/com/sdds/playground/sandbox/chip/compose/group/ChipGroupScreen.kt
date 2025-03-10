package com.sdds.playground.sandbox.chip.compose.group

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
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.Icon
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

/**
 * Экран с [ChipGroup]
 */
@Composable
internal fun ChipGroupScreen(theme: Theme.ThemeInfoCompose = Theme.composeDefault) {
    val chipGroupViewModel: ChipGroupViewModel =
        viewModel(
            factory = ChipGroupViewModelFactory(ChipGroupUiState(), theme),
            key = theme.toString(),
        )
    val chipGroupState by chipGroupViewModel.uiState.collectAsState()

    ComponentScaffold(
        component = {
            theme.themeWrapper {
                ChipGroup(
                    style = chipGroupViewModel
                        .getStyleProvider()
                        .style(chipGroupState.variant),
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
                            style = getChipStyle(
                                isSelected = isSelected,
                                styleProvider = chipGroupViewModel.getChipStyleProvider(),
                            ),
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
            }
        },
        propertiesOwner = chipGroupViewModel,
    )
}

@Composable
private fun getChipStyle(
    isSelected: Boolean,
    styleProvider: ComposeStyleProvider<String, ChipStyle>,
): ChipStyle {
    return if (isSelected) {
        styleProvider.style(key = "MAccent")
    } else {
        styleProvider.style(key = "MSecondary")
    }
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
