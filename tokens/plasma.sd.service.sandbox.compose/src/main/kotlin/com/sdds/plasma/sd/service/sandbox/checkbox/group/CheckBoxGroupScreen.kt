package com.sdds.plasma.sd.service.sandbox.checkbox.group

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxGroup
import com.sdds.plasma.sd.service.sandbox.SandboxTheme
import com.sdds.plasma.sd.service.sandbox.core.ComponentScaffold

/**
 * Экран с [CheckBoxGroup]
 */
@Composable
internal fun CheckBoxGroupScreen() {
    val checkboxGroupViewModel: CheckBoxGroupParametersViewModel =
        viewModel(CheckBoxGroupParametersViewModel::class.java)
    val checkboxGroupState by checkboxGroupViewModel.checkboxGroupState.collectAsState()

    ComponentScaffold(
        component = {
            CheckBoxGroup(style = checkboxGroupState.checkBoxGroupStyle()) {
                checkboxGroupState.rootItem?.let {
                    rootCheckbox {
                        CheckBox(
                            state = it.state,
                            enabled = checkboxGroupState.enabled,
                            label = it.label,
                            description = it.description,
                            onClick = {
                                checkboxGroupViewModel.rootCheckBoxClicked()
                            },
                        )
                    }
                }

                checkboxGroupState.items.forEachIndexed { index, item ->
                    checkbox {
                        CheckBox(
                            state = item.state,
                            enabled = checkboxGroupState.enabled,
                            label = item.label,
                            description = item.description,
                            onClick = {
                                checkboxGroupViewModel.checkBoxClicked(index)
                            },
                        )
                    }
                }
            }
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
