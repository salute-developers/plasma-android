package com.sdds.plasma.b2c.sandbox.radiobox.group

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.VerticalRadioBoxGroup
import com.sdds.plasma.b2c.sandbox.SandboxTheme
import com.sdds.plasma.b2c.sandbox.core.ComponentScaffold

/**
 * Экран с RadioBoxGroup
 */
@Composable
internal fun RadioBoxGroupScreen() {
    val radioBoxGroupViewModel: RadioBoxGroupParametersViewModel =
        viewModel(RadioBoxGroupParametersViewModel::class.java)
    val radioBoxGroupState by radioBoxGroupViewModel.radioBoxGroupUiState.collectAsState()

    ComponentScaffold(
        component = {
            VerticalRadioBoxGroup(
                style = radioBoxGroupState.radioBoxGroupStyle(),
                items = radioBoxGroupState.items,
                default = radioBoxGroupState.current,
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
