package com.sdds.playground.sandbox.radiobox.group

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.playground.sandbox.compose.SandboxTheme
import com.sdds.playground.sandbox.core.ComponentScaffold
import com.sdds.playground.sandbox.radiobox.SandboxRadioBox

/**
 * Экран с [SandboxRadioBox]
 */
@Composable
internal fun RadioBoxGroupScreen() {
    val radioBoxGroupViewModel: RadioBoxGroupParametersViewModel =
        viewModel(RadioBoxGroupParametersViewModel::class.java)
    val radioBoxGroupState by radioBoxGroupViewModel.radioBoxGroupUiState.collectAsState()

    ComponentScaffold(
        component = {
            SandboxRadioBoxGroup(
                size = radioBoxGroupState.size,
                items = radioBoxGroupState.items,
                default = radioBoxGroupState.current,
                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
                onSelectionChanged = { radioBoxGroupViewModel.updateCurrentItem(it) },
            )
        },
        propertiesOwner = radioBoxGroupViewModel,
    )
}

@Preview(showBackground = true)
@Composable
private fun ButtonsScreenPreview() {
    SandboxTheme {
        RadioBoxGroupScreen()
    }
}
