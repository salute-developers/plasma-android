package com.sdds.playground.sandbox.chip.group

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.ComponentScaffold

/**
 * Экран с [SandboxChipGroup]
 */
@Composable
internal fun ChipGroupScreen() {
    val chipGroupViewModel: ChipGroupParametersViewModel =
        viewModel(ChipGroupParametersViewModel::class.java)
    val chipGroupState by chipGroupViewModel.chipGroupState.collectAsState()

    ComponentScaffold(
        component = {
            SandboxChipGroup(
                items = chipGroupState.items,
                size = chipGroupState.size,
                gap = chipGroupState.gap,
                shouldWrap = chipGroupState.shouldWrap,
                enabled = chipGroupState.enabled,
            )
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
