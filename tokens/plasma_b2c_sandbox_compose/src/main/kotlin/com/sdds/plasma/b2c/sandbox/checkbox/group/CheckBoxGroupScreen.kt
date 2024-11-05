package com.sdds.plasma.b2c.sandbox.checkbox.group

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.CheckBoxGroup
import com.sdds.plasma.b2c.sandbox.SandboxTheme
import com.sdds.plasma.b2c.sandbox.core.ComponentScaffold

/**
 * Экран с [SandboxCheckBoxGroup]
 */
@Composable
internal fun CheckBoxGroupScreen() {
    val checkboxGroupViewModel: CheckBoxGroupParametersViewModel =
        viewModel(CheckBoxGroupParametersViewModel::class.java)
    val checkboxGroupState by checkboxGroupViewModel.checkboxGroupState.collectAsState()

    ComponentScaffold(
        component = {
            CheckBoxGroup(
                items = checkboxGroupState.items,
                rootItem = checkboxGroupState.rootItem,
                style = checkboxGroupState.checkBoxGroupStyle(),
                enabled = checkboxGroupState.enabled,
            )
        },
        propertiesOwner = checkboxGroupViewModel,
    )
}

/**
 * Превью [CheckBoxGroupScreen]
 */
@Preview(showBackground = true)
@Composable
private fun ButtonsScreenPreview() {
    SandboxTheme {
        CheckBoxGroupScreen()
    }
}
