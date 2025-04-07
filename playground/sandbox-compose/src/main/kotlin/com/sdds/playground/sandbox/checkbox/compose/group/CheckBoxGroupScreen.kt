package com.sdds.playground.sandbox.checkbox.compose.group

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxGroup
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с [CheckBoxGroup]
 */
@Composable
internal fun CheckBoxGroupScreen(componentKey: ComponentKey = ComponentKey.CheckBoxGroup) {
    val checkboxGroupViewModel: CheckBoxGroupViewModel =
        viewModel(
            factory = CheckBoxGroupViewModelFactory(CheckBoxGroupUiState(), componentKey),
            key = componentKey.toString(),
        )

    ComponentScaffold(
        key = componentKey,
        viewModel = checkboxGroupViewModel,
        component = { checkboxGroupState, style ->
            CheckBoxGroup(
                style = style,
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
        },
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
