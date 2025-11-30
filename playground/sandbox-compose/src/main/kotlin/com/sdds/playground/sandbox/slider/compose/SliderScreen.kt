package com.sdds.playground.sandbox.slider.compose

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Slider
import com.sdds.compose.uikit.SliderStyle
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с компонентом [Slider]
 */
@Composable
internal fun SliderScreen(componentKey: ComponentKey = ComponentKey.Slider) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<SliderViewModel>(
            factory = SliderViewModelFactory(
                defaultState = SliderUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { sliderUiState, style ->
            Slider(
                modifier = Modifier.fillMaxWidth(0.7f),
                value = 0.7f,
                style = style
            )
        },
    )
}

@Composable
internal fun SliderPreview(style: SliderStyle) {
}


@Composable
@Preview(showBackground = true)
private fun SliderScreenPreview() {
    SandboxTheme {
        SliderScreen()
    }
}