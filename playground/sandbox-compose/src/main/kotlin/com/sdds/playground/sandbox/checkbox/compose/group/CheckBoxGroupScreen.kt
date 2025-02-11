package com.sdds.playground.sandbox.checkbox.compose.group

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxGroup
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold

/**
 * Экран с [CheckBoxGroup]
 */
@Composable
internal fun CheckBoxGroupScreen(theme: Theme.ThemeInfoCompose = Theme.composeDefault) {
    val checkboxGroupViewModel: CheckBoxGroupViewModel =
        viewModel(
            factory = CheckBoxGroupViewModelFactory(CheckBoxGroupUiState(), theme),
            key = theme.toString(),
        )
    val checkboxGroupState by checkboxGroupViewModel.uiState.collectAsState()

    ComponentScaffold(
        component = {
            theme.themeWrapper {
                CheckBoxGroup(
                    style = checkboxGroupViewModel
                        .getStyleProvider()
                        .style(checkboxGroupState.variant),
                ) {
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
