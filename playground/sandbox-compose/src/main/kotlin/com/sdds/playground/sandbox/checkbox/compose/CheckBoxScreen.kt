package com.sdds.playground.sandbox.checkbox.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.CheckBox
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с [CheckBox]
 */
@Composable
internal fun CheckBoxScreen(componentKey: ComponentKey = ComponentKey.CheckBox) {
    val checkboxViewModel: CheckBoxViewModel = viewModel<CheckBoxViewModel>(
        factory = CheckBoxViewModelFactory(CheckBoxUiState(), componentKey),
        key = componentKey.toString(),
    )

    ComponentScaffold(
        key = componentKey,
        viewModel = checkboxViewModel,
        component = { checkboxState, style ->
            CheckBox(
                style = style,
                state = checkboxState.state,
                label = checkboxState.label,
                description = checkboxState.description,
                enabled = checkboxState.enabled,
                onClick = { checkboxViewModel.updateState(checkboxState.state.toggle()) },
            )
        },
    )
}

@Preview(showBackground = true)
@Composable
private fun ButtonsScreenPreview() {
    SandboxTheme {
        CheckBoxScreen()
    }
}
