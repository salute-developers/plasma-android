package com.sdds.playground.sandbox.counter.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Counter
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с [Counter]
 */
@Composable
internal fun CounterScreen(componentKey: ComponentKey = ComponentKey.Counter) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<CounterParametersViewModel>(
            factory = CounterParametersViewModelFactory(CounterUiState(), componentKey),
            key = componentKey.toString(),
        ),
        component = { counterUiState, style ->
            Counter(
                style = style,
                count = counterUiState.count,
            )
        },
    )
}

@Preview(showBackground = true)
@Composable
private fun CounterScreenPreview() {
    SandboxTheme {
        CounterScreen()
    }
}
